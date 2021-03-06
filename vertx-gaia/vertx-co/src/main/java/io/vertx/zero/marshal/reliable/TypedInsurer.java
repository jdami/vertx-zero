package io.vertx.zero.marshal.reliable;

import io.vertx.core.json.JsonObject;
import io.vertx.up.func.Fn;
import io.vertx.up.tool.mirror.Types;
import io.vertx.zero.eon.em.DataType;
import io.vertx.zero.exception.ZeroException;
import io.vertx.zero.exception.demon.DataTypeWrongException;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/**
 * Type Validation
 */
public class TypedInsurer extends AbstractInsurer {

    private static final ConcurrentMap<DataType, Function<Object, Boolean>>
            FUNS = new ConcurrentHashMap<DataType, Function<Object, Boolean>>() {
        {
            put(DataType.BOOLEAN, Types::isBoolean);
            put(DataType.STRING, (input) -> Boolean.TRUE);
            put(DataType.INTEGER, Types::isInteger);
            put(DataType.DECIMAL, Types::isDecimal);
            put(DataType.DATE, Types::isDate);
            put(DataType.JOBJECT, Types::isJObject);
            put(DataType.JARRAY, Types::isJArray);
            put(DataType.CLASS, Types::isClass);
        }
    };

    /**
     * @param data
     * @param rule
     * @throws ZeroException
     * @descrption {
     * "typed":{
     * "field1":"STRING | INTEGER | DECIMAL | BOOLEAN | JOBJECT | JARRAY | DATE"
     * }
     * }
     */
    @Override
    public void flumen(final JsonObject data, final JsonObject rule)
            throws ZeroException {
        // 1. If rule is null, skip
        Fn.shuntZero(() -> {
            // 2. extract rule from rule, only required accept
            if (rule.containsKey(Rules.TYPED)) {
                final JsonObject fields = rule.getJsonObject(Rules.TYPED);
                Fn.etJObject(fields, (item, name) -> {
                    // 3. extract key for field definition
                    final DataType key = Types.fromStr(DataType.class,
                            item.toString());
                    final Function<Object, Boolean> fnTest
                            = FUNS.getOrDefault(key, (input) -> Boolean.TRUE);
                    // 4. checking failure, the pre-condition is that data contains checked key.
                    if (data.containsKey(name)) {
                        final Object value = data.getValue(name);

                        Fn.flingZero(!fnTest.apply(data.getValue(name)), getLogger(),
                                DataTypeWrongException.class,
                                getClass(), name, value, key);
                    }
                });
            }
        }, rule, data);
    }
}
