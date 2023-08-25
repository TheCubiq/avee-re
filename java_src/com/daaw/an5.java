package com.daaw;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class an5 implements ql3 {
    @Override // com.daaw.ql3
    public final /* bridge */ /* synthetic */ JSONObject a(Object obj) {
        bn5 bn5Var = (bn5) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzba.zzc().b(g93.q8)).booleanValue()) {
            jSONObject2.put("ad_request_url", bn5Var.c.e());
            jSONObject2.put("ad_request_post_body", bn5Var.c.d());
        }
        jSONObject2.put("base_url", bn5Var.c.b());
        jSONObject2.put("signals", bn5Var.b);
        jSONObject3.put("body", bn5Var.a.c);
        jSONObject3.put("headers", zzay.zzb().o(bn5Var.a.b));
        jSONObject3.put("response_code", bn5Var.a.a);
        jSONObject3.put("latency", bn5Var.a.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", bn5Var.c.g());
        return jSONObject;
    }
}
