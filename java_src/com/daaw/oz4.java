package com.daaw;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class oz4 extends zl4 {
    public final Context i;
    public final WeakReference j;
    public final by4 k;
    public final c15 l;
    public final wm4 m;
    public final ss6 n;
    public final br4 o;
    public boolean p;

    public oz4(yl4 yl4Var, Context context, @Nullable a74 a74Var, by4 by4Var, c15 c15Var, wm4 wm4Var, ss6 ss6Var, br4 br4Var) {
        super(yl4Var);
        this.p = false;
        this.i = context;
        this.j = new WeakReference(a74Var);
        this.k = by4Var;
        this.l = c15Var;
        this.m = wm4Var;
        this.n = ss6Var;
        this.o = br4Var;
    }

    public final void finalize() {
        try {
            final a74 a74Var = (a74) this.j.get();
            if (((Boolean) zzba.zzc().b(g93.g6)).booleanValue()) {
                if (!this.p && a74Var != null) {
                    z04.e.execute(new Runnable() { // from class: com.daaw.nz4
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

    public final boolean h() {
        return this.m.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean i(boolean z, @Nullable Activity activity) {
        this.k.zzb();
        if (((Boolean) zzba.zzc().b(g93.y0)).booleanValue()) {
            zzt.zzp();
            if (zzs.zzC(this.i)) {
                k04.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.o.zzb();
                if (((Boolean) zzba.zzc().b(g93.z0)).booleanValue()) {
                    this.n.a(this.a.b.b.b);
                }
                return false;
            }
        }
        if (this.p) {
            k04.zzj("The interstitial ad has been showed.");
            this.o.b(tj6.d(10, null, null));
        }
        Activity activity2 = activity;
        if (!this.p) {
            if (activity == null) {
                activity2 = this.i;
            }
            try {
                this.l.a(z, activity2, this.o);
                this.k.zza();
                this.p = true;
                return true;
            } catch (b15 e) {
                this.o.s(e);
            }
        }
        return false;
    }
}
