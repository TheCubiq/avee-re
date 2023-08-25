package com.daaw;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.daaw.nc */
/* loaded from: classes2.dex */
public class C2273nc implements InterfaceC3394w2, InterfaceC2540pc {

    /* renamed from: a */
    public InterfaceC2430oc f19988a;

    /* renamed from: b */
    public static String m15302b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.daaw.InterfaceC3394w2
    /* renamed from: L */
    public void mo6589L(String str, Bundle bundle) {
        InterfaceC2430oc interfaceC2430oc = this.f19988a;
        if (interfaceC2430oc != null) {
            try {
                interfaceC2430oc.mo14390a("$A$:" + m15302b(str, bundle));
            } catch (JSONException unused) {
                ml0.m15976f().m15971k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // com.daaw.InterfaceC2540pc
    /* renamed from: a */
    public void mo8831a(InterfaceC2430oc interfaceC2430oc) {
        this.f19988a = interfaceC2430oc;
        ml0.m15976f().m15980b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
