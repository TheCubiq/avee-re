package com.daaw;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ul3 {

    /* renamed from: a */
    public static final Charset f29175a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final rl3 f29176b = new tl3();

    /* renamed from: c */
    public static final pl3 f29177c = new pl3() { // from class: com.daaw.sl3
        @Override // com.daaw.pl3
        /* renamed from: b */
        public final Object mo8081b(JSONObject jSONObject) {
            return ul3.m8035a(jSONObject);
        }
    };

    /* renamed from: a */
    public static /* synthetic */ InputStream m8035a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f29175a));
    }
}
