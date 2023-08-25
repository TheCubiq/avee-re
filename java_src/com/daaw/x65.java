package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class x65 {
    public final Executor a;
    public final s65 b;

    public x65(Executor executor, s65 s65Var) {
        this.a = executor;
        this.b = s65Var;
    }

    public final f77 a(JSONObject jSONObject, String str) {
        final String optString;
        f77 m;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return s67.i(Collections.emptyList());
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
                    m = s67.m(this.b.e(optJSONObject, "image_value"), new ey6() { // from class: com.daaw.u65
                        @Override // com.daaw.ey6
                        public final Object apply(Object obj) {
                            return new w65(optString, (dc3) obj);
                        }
                    }, this.a);
                    arrayList.add(m);
                }
            }
            m = s67.i(w65Var);
            arrayList.add(m);
        }
        return s67.m(s67.e(arrayList), new ey6() { // from class: com.daaw.v65
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
        }, this.a);
    }
}
