package com.daaw;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final /* synthetic */ class vj3 {
    public static void a(wj3 wj3Var, String str, Map map) {
        try {
            wj3Var.l(str, zzay.zzb().o(map));
        } catch (JSONException unused) {
            k04.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void b(wj3 wj3Var, String str, JSONObject jSONObject) {
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

    public static void c(wj3 wj3Var, String str, String str2) {
        wj3Var.zza(str + "(" + str2 + ");");
    }

    public static void d(wj3 wj3Var, String str, JSONObject jSONObject) {
        wj3Var.c(str, jSONObject.toString());
    }
}
