package io.vertx.up.aiki;

import io.vertx.core.json.JsonObject;
import io.vertx.up.func.Fn;
import io.vertx.up.tool.Jackson;
import io.vertx.up.tool.StringUtil;
import io.vertx.zero.atom.Mirror;

class From {

    static <T> T fromJson(final JsonObject data, final Class<T> clazz, final String pojo) {
        return Fn.get(null, () -> Fn.getSemi(StringUtil.isNil(pojo), null,
                () -> Jackson.deserialize(data, clazz),
                () -> Mirror.create(From.class)
                        .mount(pojo)
                        .connect(data)
                        .from()
                        .get()), pojo);
    }
}

