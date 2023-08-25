package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class df5 {
    public Long a;
    public final String b;
    public String c;
    public Integer d;
    public String e;
    public Integer f;

    public /* synthetic */ df5(String str, cf5 cf5Var) {
        this.b = str;
    }

    public static /* bridge */ /* synthetic */ String a(df5 df5Var) {
        String str = (String) zzba.zzc().b(g93.I8);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", df5Var.a);
            jSONObject.put("eventCategory", df5Var.b);
            jSONObject.putOpt("event", df5Var.c);
            jSONObject.putOpt("errorCode", df5Var.d);
            jSONObject.putOpt("rewardType", df5Var.e);
            jSONObject.putOpt("rewardAmount", df5Var.f);
        } catch (JSONException unused) {
            k04.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
