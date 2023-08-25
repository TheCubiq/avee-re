package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class eq4 extends zzdm {

    /* renamed from: p */
    public final String f8688p;

    /* renamed from: q */
    public final String f8689q;

    /* renamed from: r */
    public final String f8690r;

    /* renamed from: s */
    public final String f8691s;

    /* renamed from: t */
    public final List f8692t;

    /* renamed from: u */
    public final long f8693u;

    /* renamed from: v */
    public final String f8694v;

    /* renamed from: w */
    public final vq5 f8695w;

    /* renamed from: x */
    public final Bundle f8696x;

    public eq4(th6 th6Var, String str, vq5 vq5Var, wh6 wh6Var, String str2) {
        String str3 = null;
        this.f8689q = th6Var == null ? null : th6Var.f27685c0;
        this.f8690r = str2;
        this.f8691s = wh6Var == null ? null : wh6Var.f31252b;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str3 = th6Var.f27718w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f8688p = str3 != null ? str3 : str;
        this.f8692t = vq5Var.m6913c();
        this.f8695w = vq5Var;
        this.f8693u = zzt.zzB().mo15860a() / 1000;
        this.f8696x = (!((Boolean) zzba.zzc().m23658b(g93.f10749l6)).booleanValue() || wh6Var == null) ? new Bundle() : wh6Var.f31260j;
        this.f8694v = (!((Boolean) zzba.zzc().m23658b(g93.f10784o8)).booleanValue() || wh6Var == null || TextUtils.isEmpty(wh6Var.f31258h)) ? "" : wh6Var.f31258h;
    }

    public final long zzc() {
        return this.f8693u;
    }

    public final String zzd() {
        return this.f8694v;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        return this.f8696x;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final zzu zzf() {
        vq5 vq5Var = this.f8695w;
        if (vq5Var != null) {
            return vq5Var.m6915a();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        return this.f8688p;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        return this.f8690r;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        return this.f8689q;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        return this.f8692t;
    }

    public final String zzk() {
        return this.f8691s;
    }
}
