package com.daaw;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class nc implements w2, pc {
    public oc a;

    public static String b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.daaw.w2
    public void L(String str, Bundle bundle) {
        oc ocVar = this.a;
        if (ocVar != null) {
            try {
                ocVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                ml0.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // com.daaw.pc
    public void a(oc ocVar) {
        this.a = ocVar;
        ml0.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
