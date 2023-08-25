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

    /* renamed from: p */
    public final dh5 f21545p;

    /* renamed from: q */
    public final String f21546q;

    /* renamed from: r */
    public final String f21547r;

    /* renamed from: s */
    public int f21548s = 0;

    /* renamed from: t */
    public ng5 f21549t = ng5.AD_REQUESTED;

    /* renamed from: u */
    public eq4 f21550u;

    /* renamed from: v */
    public zze f21551v;

    /* renamed from: w */
    public String f21552w;

    /* renamed from: x */
    public String f21553x;

    /* renamed from: y */
    public boolean f21554y;

    /* renamed from: z */
    public boolean f21555z;

    public og5(dh5 dh5Var, ri6 ri6Var, String str) {
        this.f21545p = dh5Var;
        this.f21547r = str;
        this.f21546q = ri6Var.f25346f;
    }

    /* renamed from: i */
    public static JSONObject m14303i(zze zzeVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : m14303i(zzeVar2));
        return jSONObject;
    }

    @Override // com.daaw.pt4
    /* renamed from: F */
    public final void mo5181F(fi6 fi6Var) {
        if (!fi6Var.f9624b.f8507a.isEmpty()) {
            this.f21548s = ((th6) fi6Var.f9624b.f8507a.get(0)).f27682b;
        }
        if (!TextUtils.isEmpty(fi6Var.f9624b.f8508b.f31261k)) {
            this.f21552w = fi6Var.f9624b.f8508b.f31261k;
        }
        if (TextUtils.isEmpty(fi6Var.f9624b.f8508b.f31262l)) {
            return;
        }
        this.f21553x = fi6Var.f9624b.f8508b.f31262l;
    }

    /* renamed from: a */
    public final String m14309a() {
        return this.f21547r;
    }

    @Override // com.daaw.oq4
    /* renamed from: b */
    public final void mo2194b(zze zzeVar) {
        this.f21549t = ng5.AD_LOAD_FAILED;
        this.f21551v = zzeVar;
        if (((Boolean) zzba.zzc().m23658b(g93.f10839t8)).booleanValue()) {
            this.f21545p.m24405f(this.f21546q, this);
        }
    }

    /* renamed from: c */
    public final JSONObject m14308c() {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f21549t);
        jSONObject.put("format", th6.m9112a(this.f21548s));
        if (((Boolean) zzba.zzc().m23658b(g93.f10839t8)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f21554y);
            if (this.f21554y) {
                jSONObject.put("shown", this.f21555z);
            }
        }
        eq4 eq4Var = this.f21550u;
        JSONObject jSONObject2 = null;
        if (eq4Var != null) {
            jSONObject2 = m14302j(eq4Var);
        } else {
            zze zzeVar = this.f21551v;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                eq4 eq4Var2 = (eq4) iBinder;
                jSONObject2 = m14302j(eq4Var2);
                if (eq4Var2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m14303i(this.f21551v));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    /* renamed from: d */
    public final void m14307d() {
        this.f21554y = true;
    }

    @Override // com.daaw.pt4
    /* renamed from: e */
    public final void mo5174e(zzccb zzccbVar) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10839t8)).booleanValue()) {
            return;
        }
        this.f21545p.m24405f(this.f21546q, this);
    }

    @Override // com.daaw.js4
    /* renamed from: f */
    public final void mo14306f(zl4 zl4Var) {
        this.f21550u = zl4Var.m2130c();
        this.f21549t = ng5.AD_LOADED;
        if (((Boolean) zzba.zzc().m23658b(g93.f10839t8)).booleanValue()) {
            this.f21545p.m24405f(this.f21546q, this);
        }
    }

    /* renamed from: g */
    public final void m14305g() {
        this.f21555z = true;
    }

    /* renamed from: h */
    public final boolean m14304h() {
        return this.f21549t != ng5.AD_REQUESTED;
    }

    /* renamed from: j */
    public final JSONObject m14302j(eq4 eq4Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", eq4Var.zzg());
        jSONObject.put("responseSecsSinceEpoch", eq4Var.zzc());
        jSONObject.put("responseId", eq4Var.zzi());
        if (((Boolean) zzba.zzc().m23658b(g93.f10784o8)).booleanValue()) {
            String zzd = eq4Var.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                k04.zze("Bidding data: ".concat(String.valueOf(zzd)));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        if (!TextUtils.isEmpty(this.f21552w)) {
            jSONObject.put("adRequestUrl", this.f21552w);
        }
        if (!TextUtils.isEmpty(this.f21553x)) {
            jSONObject.put("postBody", this.f21553x);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzu zzuVar : eq4Var.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) zzba.zzc().m23658b(g93.f10795p8)).booleanValue()) {
                jSONObject2.put("credentials", zzay.zzb().m24818n(zzuVar.zzd));
            }
            zze zzeVar = zzuVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : m14303i(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }
}
