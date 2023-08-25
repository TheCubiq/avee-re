package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class x65 {

    /* renamed from: a */
    public final Executor f32155a;

    /* renamed from: b */
    public final s65 f32156b;

    public x65(Executor executor, s65 s65Var) {
        this.f32155a = executor;
        this.f32156b = s65Var;
    }

    /* renamed from: a */
    public final f77 m5499a(JSONObject jSONObject, String str) {
        final String optString;
        f77 m10630m;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return s67.m10634i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            w65 w65Var = null;
            if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                String optString2 = optJSONObject.optString("type");
                if ("string".equals(optString2)) {
                    w65Var = new w65(optString, optJSONObject.optString("string_value"));
                } else if ("image".equals(optString2)) {
                    m10630m = s67.m10630m(this.f32156b.m10656e(optJSONObject, "image_value"), new ey6() { // from class: com.daaw.u65
                        @Override // com.daaw.ey6
                        public final Object apply(Object obj) {
                            return new w65(optString, (dc3) obj);
                        }
                    }, this.f32155a);
                    arrayList.add(m10630m);
                }
            }
            m10630m = s67.m10634i(w65Var);
            arrayList.add(m10630m);
        }
        return s67.m10630m(s67.m10638e(arrayList), new ey6() { // from class: com.daaw.v65
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (w65 w65Var2 : (List) obj) {
                    if (w65Var2 != null) {
                        arrayList2.add(w65Var2);
                    }
                }
                return arrayList2;
            }
        }, this.f32155a);
    }
}
