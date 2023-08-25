package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcdd;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class j95 extends zl4 {
    public final Context i;
    public final WeakReference j;
    public final c15 k;
    public final by4 l;
    public final br4 m;
    public final ls4 n;
    public final wm4 o;
    public final tv3 p;
    public final ss6 q;
    public final hi6 r;
    public boolean s;

    public j95(yl4 yl4Var, Context context, a74 a74Var, c15 c15Var, by4 by4Var, br4 br4Var, ls4 ls4Var, wm4 wm4Var, th6 th6Var, ss6 ss6Var, hi6 hi6Var) {
        super(yl4Var);
        this.s = false;
        this.i = context;
        this.k = c15Var;
        this.j = new WeakReference(a74Var);
        this.l = by4Var;
        this.m = br4Var;
        this.n = ls4Var;
        this.o = wm4Var;
        this.q = ss6Var;
        zzcdd zzcddVar = th6Var.m;
        this.p = new pw3(zzcddVar != null ? zzcddVar.p : "", zzcddVar != null ? zzcddVar.q : 1);
        this.r = hi6Var;
    }

    public final void finalize() {
        try {
            final a74 a74Var = (a74) this.j.get();
            if (((Boolean) zzba.zzc().b(g93.g6)).booleanValue()) {
                if (!this.s && a74Var != null) {
                    z04.e.execute(new Runnable() { // from class: com.daaw.i95
                        @Override // java.lang.Runnable
                        public final void run() {
                            a74.this.destroy();
                        }
                    });
                }
            } else if (a74Var != null) {
                a74Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle h() {
        return this.n.C0();
    }

    public final tv3 i() {
        return this.p;
    }

    public final hi6 j() {
        return this.r;
    }

    public final boolean k() {
        return this.o.a();
    }

    public final boolean l() {
        return this.s;
    }

    public final boolean m() {
        a74 a74Var = (a74) this.j.get();
        return (a74Var == null || a74Var.V()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean n(boolean z, Activity activity) {
        if (((Boolean) zzba.zzc().b(g93.y0)).booleanValue()) {
            zzt.zzp();
            if (zzs.zzC(this.i)) {
                k04.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.m.zzb();
                if (((Boolean) zzba.zzc().b(g93.z0)).booleanValue()) {
                    this.q.a(this.a.b.b.b);
                }
                return false;
            }
        }
        if (this.s) {
            k04.zzj("The rewarded ad have been showed.");
            this.m.b(tj6.d(10, null, null));
            return false;
        }
        this.s = true;
        this.l.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.i;
        }
        try {
            this.k.a(z, activity2, this.m);
            this.l.zza();
            return true;
        } catch (b15 e) {
            this.m.s(e);
            return false;
        }
    }
}
