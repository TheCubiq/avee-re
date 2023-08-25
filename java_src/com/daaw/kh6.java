package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcdy;
import com.google.android.gms.internal.ads.zzchu;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class kh6 extends vv3 {
    public final dh6 p;
    public final tg6 q;
    public final String r;
    public final gi6 s;
    public final Context t;
    public final zzchu u;
    @GuardedBy("this")
    public j95 v;
    @GuardedBy("this")
    public boolean w = ((Boolean) zzba.zzc().b(g93.A0)).booleanValue();

    public kh6(String str, dh6 dh6Var, Context context, tg6 tg6Var, gi6 gi6Var, zzchu zzchuVar) {
        this.r = str;
        this.p = dh6Var;
        this.q = tg6Var;
        this.s = gi6Var;
        this.t = context;
        this.u = zzchuVar;
    }

    public final synchronized void j3(zzl zzlVar, dw3 dw3Var, int i) {
        boolean z = false;
        if (((Boolean) ya3.l.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.n9)).booleanValue()) {
                z = true;
            }
        }
        if (this.u.r < ((Integer) zzba.zzc().b(g93.o9)).intValue() || !z) {
            ry0.e("#008 Must be called on the main UI thread.");
        }
        this.q.M(dw3Var);
        zzt.zzp();
        if (zzs.zzD(this.t) && zzlVar.zzs == null) {
            k04.zzg("Failed to load the ad because app ID is missing.");
            this.q.b(tj6.d(4, null, null));
            return;
        }
        if (this.v != null) {
            return;
        }
        vg6 vg6Var = new vg6(null);
        this.p.i(i);
        this.p.a(zzlVar, this.r, vg6Var, new jh6(this));
    }

    @Override // com.daaw.wv3
    public final Bundle zzb() {
        ry0.e("#008 Must be called on the main UI thread.");
        j95 j95Var = this.v;
        return j95Var != null ? j95Var.h() : new Bundle();
    }

    @Override // com.daaw.wv3
    public final zzdn zzc() {
        j95 j95Var;
        if (((Boolean) zzba.zzc().b(g93.i6)).booleanValue() && (j95Var = this.v) != null) {
            return j95Var.c();
        }
        return null;
    }

    @Override // com.daaw.wv3
    public final tv3 zzd() {
        ry0.e("#008 Must be called on the main UI thread.");
        j95 j95Var = this.v;
        if (j95Var != null) {
            return j95Var.i();
        }
        return null;
    }

    @Override // com.daaw.wv3
    public final synchronized String zze() {
        j95 j95Var = this.v;
        if (j95Var == null || j95Var.c() == null) {
            return null;
        }
        return j95Var.c().zzg();
    }

    @Override // com.daaw.wv3
    public final synchronized void zzf(zzl zzlVar, dw3 dw3Var) {
        j3(zzlVar, dw3Var, 2);
    }

    @Override // com.daaw.wv3
    public final synchronized void zzg(zzl zzlVar, dw3 dw3Var) {
        j3(zzlVar, dw3Var, 3);
    }

    @Override // com.daaw.wv3
    public final synchronized void zzh(boolean z) {
        ry0.e("setImmersiveMode must be called on the main UI thread.");
        this.w = z;
    }

    @Override // com.daaw.wv3
    public final void zzi(zzdd zzddVar) {
        if (zzddVar == null) {
            this.q.l(null);
        } else {
            this.q.l(new ih6(this, zzddVar));
        }
    }

    @Override // com.daaw.wv3
    public final void zzj(zzdg zzdgVar) {
        ry0.e("setOnPaidEventListener must be called on the main UI thread.");
        this.q.s(zzdgVar);
    }

    @Override // com.daaw.wv3
    public final void zzk(zv3 zv3Var) {
        ry0.e("#008 Must be called on the main UI thread.");
        this.q.F(zv3Var);
    }

    @Override // com.daaw.wv3
    public final synchronized void zzl(zzcdy zzcdyVar) {
        ry0.e("#008 Must be called on the main UI thread.");
        gi6 gi6Var = this.s;
        gi6Var.a = zzcdyVar.p;
        gi6Var.b = zzcdyVar.q;
    }

    @Override // com.daaw.wv3
    public final synchronized void zzm(yd0 yd0Var) {
        zzn(yd0Var, this.w);
    }

    @Override // com.daaw.wv3
    public final synchronized void zzn(yd0 yd0Var, boolean z) {
        ry0.e("#008 Must be called on the main UI thread.");
        if (this.v == null) {
            k04.zzj("Rewarded can not be shown before loaded");
            this.q.A(tj6.d(9, null, null));
            return;
        }
        this.v.n(z, (Activity) nt0.M(yd0Var));
    }

    @Override // com.daaw.wv3
    public final boolean zzo() {
        ry0.e("#008 Must be called on the main UI thread.");
        j95 j95Var = this.v;
        return (j95Var == null || j95Var.l()) ? false : true;
    }

    @Override // com.daaw.wv3
    public final void zzp(ew3 ew3Var) {
        ry0.e("#008 Must be called on the main UI thread.");
        this.q.d0(ew3Var);
    }
}
