package com.daaw;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final /* synthetic */ class vj3 {
    /* renamed from: a */
    public static void m7117a(wj3 wj3Var, String str, Map map) {
        try {
            wj3Var.mo6048l(str, zzay.zzb().m24817o(map));
        } catch (JSONException unused) {
            k04.zzj("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: b */
    public static void m7116b(wj3 wj3Var, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        k04.zze("Dispatching AFMA event: ".concat(sb.toString()));
        wj3Var.zza(sb.toString());
    }

    /* renamed from: c */
    public static void m7115c(wj3 wj3Var, String str, String str2) {
        wj3Var.zza(str + "(" + str2 + ");");
    }

    /* renamed from: d */
    public static void m7114d(wj3 wj3Var, String str, JSONObject jSONObject) {
        wj3Var.mo6049c(str, jSONObject.toString());
    }
}
