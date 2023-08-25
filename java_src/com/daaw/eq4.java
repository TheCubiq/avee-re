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
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final List t;
    public final long u;
    public final String v;
    public final vq5 w;
    public final Bundle x;

    public eq4(th6 th6Var, String str, vq5 vq5Var, wh6 wh6Var, String str2) {
        String str3 = null;
        this.q = th6Var == null ? null : th6Var.c0;
        this.r = str2;
        this.s = wh6Var == null ? null : wh6Var.b;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str3 = th6Var.w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.p = str3 != null ? str3 : str;
        this.t = vq5Var.c();
        this.w = vq5Var;
        this.u = zzt.zzB().a() / 1000;
        this.x = (!((Boolean) zzba.zzc().b(g93.l6)).booleanValue() || wh6Var == null) ? new Bundle() : wh6Var.j;
        this.v = (!((Boolean) zzba.zzc().b(g93.o8)).booleanValue() || wh6Var == null || TextUtils.isEmpty(wh6Var.h)) ? "" : wh6Var.h;
    }

    public final long zzc() {
        return this.u;
    }

    public final String zzd() {
        return this.v;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        return this.x;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final zzu zzf() {
        vq5 vq5Var = this.w;
        if (vq5Var != null) {
            return vq5Var.a();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        return this.p;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        return this.r;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        return this.q;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        return this.t;
    }

    public final String zzk() {
        return this.s;
    }
}
