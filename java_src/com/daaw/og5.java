package com.daaw;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.zzccb;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class og5 implements oq4, pt4, js4 {
    public final dh5 p;
    public final String q;
    public final String r;
    public int s = 0;
    public ng5 t = ng5.AD_REQUESTED;
    public eq4 u;
    public zze v;
    public String w;
    public String x;
    public boolean y;
    public boolean z;

    public og5(dh5 dh5Var, ri6 ri6Var, String str) {
        this.p = dh5Var;
        this.r = str;
        this.q = ri6Var.f;
    }

    public static JSONObject i(zze zzeVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : i(zzeVar2));
        return jSONObject;
    }

    @Override // com.daaw.pt4
    public final void F(fi6 fi6Var) {
        if (!fi6Var.b.a.isEmpty()) {
            this.s = ((th6) fi6Var.b.a.get(0)).b;
        }
        if (!TextUtils.isEmpty(fi6Var.b.b.k)) {
            this.w = fi6Var.b.b.k;
        }
        if (TextUtils.isEmpty(fi6Var.b.b.l)) {
            return;
        }
        this.x = fi6Var.b.b.l;
    }

    public final String a() {
        return this.r;
    }

    @Override // com.daaw.oq4
    public final void b(zze zzeVar) {
        this.t = ng5.AD_LOAD_FAILED;
        this.v = zzeVar;
        if (((Boolean) zzba.zzc().b(g93.t8)).booleanValue()) {
            this.p.f(this.q, this);
        }
    }

    public final JSONObject c() {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.t);
        jSONObject.put("format", th6.a(this.s));
        if (((Boolean) zzba.zzc().b(g93.t8)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.y);
            if (this.y) {
                jSONObject.put("shown", this.z);
            }
        }
        eq4 eq4Var = this.u;
        JSONObject jSONObject2 = null;
        if (eq4Var != null) {
            jSONObject2 = j(eq4Var);
        } else {
            zze zzeVar = this.v;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                eq4 eq4Var2 = (eq4) iBinder;
                jSONObject2 = j(eq4Var2);
                if (eq4Var2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(i(this.v));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    public final void d() {
        this.y = true;
    }

    @Override // com.daaw.pt4
    public final void e(zzccb zzccbVar) {
        if (((Boolean) zzba.zzc().b(g93.t8)).booleanValue()) {
            return;
        }
        this.p.f(this.q, this);
    }

    @Override // com.daaw.js4
    public final void f(zl4 zl4Var) {
        this.u = zl4Var.c();
        this.t = ng5.AD_LOADED;
        if (((Boolean) zzba.zzc().b(g93.t8)).booleanValue()) {
            this.p.f(this.q, this);
        }
    }

    public final void g() {
        this.z = true;
    }

    public final boolean h() {
        return this.t != ng5.AD_REQUESTED;
    }

    public final JSONObject j(eq4 eq4Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", eq4Var.zzg());
        jSONObject.put("responseSecsSinceEpoch", eq4Var.zzc());
        jSONObject.put("responseId", eq4Var.zzi());
        if (((Boolean) zzba.zzc().b(g93.o8)).booleanValue()) {
            String zzd = eq4Var.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                k04.zze("Bidding data: ".concat(String.valueOf(zzd)));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        if (!TextUtils.isEmpty(this.w)) {
            jSONObject.put("adRequestUrl", this.w);
        }
        if (!TextUtils.isEmpty(this.x)) {
            jSONObject.put("postBody", this.x);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzu zzuVar : eq4Var.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) zzba.zzc().b(g93.p8)).booleanValue()) {
                jSONObject2.put("credentials", zzay.zzb().n(zzuVar.zzd));
            }
            zze zzeVar = zzuVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : i(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }
}
