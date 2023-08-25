package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class df5 {

    /* renamed from: a */
    public Long f7032a;

    /* renamed from: b */
    public final String f7033b;

    /* renamed from: c */
    public String f7034c;

    /* renamed from: d */
    public Integer f7035d;

    /* renamed from: e */
    public String f7036e;

    /* renamed from: f */
    public Integer f7037f;

    public /* synthetic */ df5(String str, cf5 cf5Var) {
        this.f7033b = str;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ String m24428a(df5 df5Var) {
        String str = (String) zzba.zzc().m23658b(g93.f10450I8);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", df5Var.f7032a);
            jSONObject.put("eventCategory", df5Var.f7033b);
            jSONObject.putOpt("event", df5Var.f7034c);
            jSONObject.putOpt("errorCode", df5Var.f7035d);
            jSONObject.putOpt("rewardType", df5Var.f7036e);
            jSONObject.putOpt("rewardAmount", df5Var.f7037f);
        } catch (JSONException unused) {
            k04.zzj("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
