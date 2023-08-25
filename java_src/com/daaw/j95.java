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

    /* renamed from: i */
    public final Context f14552i;

    /* renamed from: j */
    public final WeakReference f14553j;

    /* renamed from: k */
    public final c15 f14554k;

    /* renamed from: l */
    public final by4 f14555l;

    /* renamed from: m */
    public final br4 f14556m;

    /* renamed from: n */
    public final ls4 f14557n;

    /* renamed from: o */
    public final wm4 f14558o;

    /* renamed from: p */
    public final tv3 f14559p;

    /* renamed from: q */
    public final ss6 f14560q;

    /* renamed from: r */
    public final hi6 f14561r;

    /* renamed from: s */
    public boolean f14562s;

    public j95(yl4 yl4Var, Context context, a74 a74Var, c15 c15Var, by4 by4Var, br4 br4Var, ls4 ls4Var, wm4 wm4Var, th6 th6Var, ss6 ss6Var, hi6 hi6Var) {
        super(yl4Var);
        this.f14562s = false;
        this.f14552i = context;
        this.f14554k = c15Var;
        this.f14553j = new WeakReference(a74Var);
        this.f14555l = by4Var;
        this.f14556m = br4Var;
        this.f14557n = ls4Var;
        this.f14558o = wm4Var;
        this.f14560q = ss6Var;
        zzcdd zzcddVar = th6Var.f27704m;
        this.f14559p = new pw3(zzcddVar != null ? zzcddVar.f36977p : "", zzcddVar != null ? zzcddVar.f36978q : 1);
        this.f14561r = hi6Var;
    }

    public final void finalize() {
        try {
            final a74 a74Var = (a74) this.f14553j.get();
            if (((Boolean) zzba.zzc().m23658b(g93.f10694g6)).booleanValue()) {
                if (!this.f14562s && a74Var != null) {
                    z04.f34309e.execute(new Runnable() { // from class: com.daaw.i95
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

    /* renamed from: h */
    public final Bundle m18708h() {
        return this.f14557n.m16604C0();
    }

    /* renamed from: i */
    public final tv3 m18707i() {
        return this.f14559p;
    }

    /* renamed from: j */
    public final hi6 m18706j() {
        return this.f14561r;
    }

    /* renamed from: k */
    public final boolean m18705k() {
        return this.f14558o.m5978a();
    }

    /* renamed from: l */
    public final boolean m18704l() {
        return this.f14562s;
    }

    /* renamed from: m */
    public final boolean m18703m() {
        a74 a74Var = (a74) this.f14553j.get();
        return (a74Var == null || a74Var.mo6430V()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    /* renamed from: n */
    public final boolean m18702n(boolean z, Activity activity) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10886y0)).booleanValue()) {
            zzt.zzp();
            if (zzs.zzC(this.f14552i)) {
                k04.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f14556m.zzb();
                if (((Boolean) zzba.zzc().m23658b(g93.f10897z0)).booleanValue()) {
                    this.f14560q.m9920a(this.f35204a.f9624b.f8508b.f31252b);
                }
                return false;
            }
        }
        if (this.f14562s) {
            k04.zzj("The rewarded ad have been showed.");
            this.f14556m.mo4815b(tj6.m9071d(10, null, null));
            return false;
        }
        this.f14562s = true;
        this.f14555l.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f14552i;
        }
        try {
            this.f14554k.mo3165a(z, activity2, this.f14556m);
            this.f14555l.zza();
            return true;
        } catch (b15 e) {
            this.f14556m.mo4814s(e);
            return false;
        }
    }
}
