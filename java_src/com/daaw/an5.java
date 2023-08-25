package com.daaw;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class an5 implements ql3 {
    @Override // com.daaw.ql3
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ JSONObject mo6074a(Object obj) {
        bn5 bn5Var = (bn5) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzba.zzc().m23658b(g93.f10806q8)).booleanValue()) {
            jSONObject2.put("ad_request_url", bn5Var.f4984c.m13126e());
            jSONObject2.put("ad_request_post_body", bn5Var.f4984c.m13127d());
        }
        jSONObject2.put("base_url", bn5Var.f4984c.m13129b());
        jSONObject2.put("signals", bn5Var.f4983b);
        jSONObject3.put("body", bn5Var.f4982a.f23081c);
        jSONObject3.put("headers", zzay.zzb().m24817o(bn5Var.f4982a.f23080b));
        jSONObject3.put("response_code", bn5Var.f4982a.f23079a);
        jSONObject3.put("latency", bn5Var.f4982a.f23082d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", bn5Var.f4984c.m13124g());
        return jSONObject;
    }
}
