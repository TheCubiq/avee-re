package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzccy;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class qh6 extends ev3 {
    public final dh6 p;
    public final tg6 q;
    public final gi6 r;
    @GuardedBy("this")
    public j95 s;
    @GuardedBy("this")
    public boolean t = false;

    public qh6(dh6 dh6Var, tg6 tg6Var, gi6 gi6Var) {
        this.p = dh6Var;
        this.q = tg6Var;
        this.r = gi6Var;
    }

    @Override // com.daaw.fv3
    public final void B2(zzby zzbyVar) {
        ry0.e("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.q.l(null);
        } else {
            this.q.l(new ph6(this, zzbyVar));
        }
    }

    @Override // com.daaw.fv3
    public final synchronized void C0(boolean z) {
        ry0.e("setImmersiveMode must be called on the main UI thread.");
        this.t = z;
    }

    @Override // com.daaw.fv3
    public final synchronized void G(yd0 yd0Var) {
        ry0.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.q.l(null);
        if (this.s != null) {
            if (yd0Var != null) {
                context = (Context) nt0.M(yd0Var);
            }
            this.s.d().C0(context);
        }
    }

    @Override // com.daaw.fv3
    public final void H1(dv3 dv3Var) {
        ry0.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.q.W(dv3Var);
    }

    @Override // com.daaw.fv3
    public final synchronized void h1(yd0 yd0Var) {
        ry0.e("resume must be called on the main UI thread.");
        if (this.s != null) {
            this.s.d().E0(yd0Var == null ? null : (Context) nt0.M(yd0Var));
        }
    }

    @Override // com.daaw.fv3
    public final void j2(iv3 iv3Var) {
        ry0.e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.q.S(iv3Var);
    }

    public final synchronized boolean j3() {
        boolean z;
        j95 j95Var = this.s;
        if (j95Var != null) {
            z = j95Var.k() ? false : true;
        }
        return z;
    }

    @Override // com.daaw.fv3
    public final synchronized void o1(String str) {
        ry0.e("#008 Must be called on the main UI thread.: setCustomData");
        this.r.b = str;
    }

    @Override // com.daaw.fv3
    public final synchronized void q(yd0 yd0Var) {
        ry0.e("showAd must be called on the main UI thread.");
        if (this.s != null) {
            Activity activity = null;
            if (yd0Var != null) {
                Object M = nt0.M(yd0Var);
                if (M instanceof Activity) {
                    activity = (Activity) M;
                }
            }
            this.s.n(this.t, activity);
        }
    }

    @Override // com.daaw.fv3
    public final synchronized void r(String str) {
        ry0.e("setUserId must be called on the main UI thread.");
        this.r.a = str;
    }

    @Override // com.daaw.fv3
    public final synchronized void r0(zzccy zzccyVar) {
        ry0.e("loadAd must be called on the main UI thread.");
        String str = zzccyVar.q;
        String str2 = (String) zzba.zzc().b(g93.Q4);
        if (str2 != null && str != null) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e) {
                zzt.zzo().u(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (j3()) {
            if (!((Boolean) zzba.zzc().b(g93.S4)).booleanValue()) {
                return;
            }
        }
        vg6 vg6Var = new vg6(null);
        this.s = null;
        this.p.i(1);
        this.p.a(zzccyVar.p, zzccyVar.q, vg6Var, new oh6(this));
    }

    @Override // com.daaw.fv3
    public final Bundle zzb() {
        ry0.e("getAdMetadata can only be called from the UI thread.");
        j95 j95Var = this.s;
        return j95Var != null ? j95Var.h() : new Bundle();
    }

    @Override // com.daaw.fv3
    public final synchronized zzdn zzc() {
        if (((Boolean) zzba.zzc().b(g93.i6)).booleanValue()) {
            j95 j95Var = this.s;
            if (j95Var != null) {
                return j95Var.c();
            }
            return null;
        }
        return null;
    }

    @Override // com.daaw.fv3
    public final synchronized String zzd() {
        j95 j95Var = this.s;
        if (j95Var == null || j95Var.c() == null) {
            return null;
        }
        return j95Var.c().zzg();
    }

    @Override // com.daaw.fv3
    public final void zze() {
        G(null);
    }

    @Override // com.daaw.fv3
    public final void zzh() {
        zzi(null);
    }

    @Override // com.daaw.fv3
    public final synchronized void zzi(yd0 yd0Var) {
        ry0.e("pause must be called on the main UI thread.");
        if (this.s != null) {
            this.s.d().D0(yd0Var == null ? null : (Context) nt0.M(yd0Var));
        }
    }

    @Override // com.daaw.fv3
    public final void zzj() {
        h1(null);
    }

    @Override // com.daaw.fv3
    public final synchronized void zzq() {
        q(null);
    }

    @Override // com.daaw.fv3
    public final boolean zzs() {
        ry0.e("isLoaded must be called on the main UI thread.");
        return j3();
    }

    @Override // com.daaw.fv3
    public final boolean zzt() {
        j95 j95Var = this.s;
        return j95Var != null && j95Var.m();
    }
}
