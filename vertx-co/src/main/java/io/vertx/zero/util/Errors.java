package io.vertx.zero.util;

import com.vie.hoc.HBool;
import com.vie.hoc.HFail;
import com.vie.hors.ke.ErrorMissingException;
import com.vie.util.Instance;
import io.vertx.core.json.JsonObject;
import io.vertx.zero.cv.Tpl;
import io.vertx.zero.ke.ZeroNode;
import io.vertx.zero.ke.config.ZeroError;

import java.text.MessageFormat;

/**
 *
 */
public final class Errors {

    private static final JsonObject MAP;

    static {
        final ZeroNode<JsonObject> NODE
                = Instance.singleton(ZeroError.class);
        MAP = NODE.read();
    }

    public static String normalize(final Class<?> clazz,
                                   final int code,
                                   final Object... args) {
        return HFail.exec(() -> {
            final String key = ("E" + Math.abs(code)).intern();
            return HBool.exec(MAP.containsKey(key),
                    () -> {
                        // 1. Read pattern
                        final String pattern = MAP.getString(key);
                        // 2. Build message
                        final String error = MessageFormat.format(pattern, args);
                        // 3. Format
                        return MessageFormat.format(
                                Tpl.ZERO_ERROR, String.valueOf(code),
                                clazz.getSimpleName(),
                                error
                        );
                    },
                    new ErrorMissingException(code, clazz.getName()));
        }, clazz);

    }
}