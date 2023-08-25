package com.daaw;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ul3 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final rl3 b = new tl3();
    public static final pl3 c = new pl3() { // from class: com.daaw.sl3
        @Override // com.daaw.pl3
        public final Object b(JSONObject jSONObject) {
            return ul3.a(jSONObject);
        }
    };

    public static /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(a));
    }
}
