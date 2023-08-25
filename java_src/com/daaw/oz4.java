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

    /* renamed from: i */
    public final Context f22161i;

    /* renamed from: j */
    public final WeakReference f22162j;

    /* renamed from: k */
    public final by4 f22163k;

    /* renamed from: l */
    public final c15 f22164l;

    /* renamed from: m */
    public final wm4 f22165m;

    /* renamed from: n */
    public final ss6 f22166n;

    /* renamed from: o */
    public final br4 f22167o;

    /* renamed from: p */
    public boolean f22168p;

    public oz4(yl4 yl4Var, Context context, @Nullable a74 a74Var, by4 by4Var, c15 c15Var, wm4 wm4Var, ss6 ss6Var, br4 br4Var) {
        super(yl4Var);
        this.f22168p = false;
        this.f22161i = context;
        this.f22162j = new WeakReference(a74Var);
        this.f22163k = by4Var;
        this.f22164l = c15Var;
        this.f22165m = wm4Var;
        this.f22166n = ss6Var;
        this.f22167o = br4Var;
    }

    public final void finalize() {
        try {
            final a74 a74Var = (a74) this.f22162j.get();
            if (((Boolean) zzba.zzc().m23658b(g93.f10694g6)).booleanValue()) {
                if (!this.f22168p && a74Var != null) {
                    z04.f34309e.execute(new Runnable() { // from class: com.daaw.nz4
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
    public final boolean m13797h() {
        return this.f22165m.m5978a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    /* renamed from: i */
    public final boolean m13796i(boolean z, @Nullable Activity activity) {
        this.f22163k.zzb();
        if (((Boolean) zzba.zzc().m23658b(g93.f10886y0)).booleanValue()) {
            zzt.zzp();
            if (zzs.zzC(this.f22161i)) {
                k04.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f22167o.zzb();
                if (((Boolean) zzba.zzc().m23658b(g93.f10897z0)).booleanValue()) {
                    this.f22166n.m9920a(this.f35204a.f9624b.f8508b.f31252b);
                }
                return false;
            }
        }
        if (this.f22168p) {
            k04.zzj("The interstitial ad has been showed.");
            this.f22167o.mo4815b(tj6.m9071d(10, null, null));
        }
        Activity activity2 = activity;
        if (!this.f22168p) {
            if (activity == null) {
                activity2 = this.f22161i;
            }
            try {
                this.f22164l.mo3165a(z, activity2, this.f22167o);
                this.f22163k.zza();
                this.f22168p = true;
                return true;
            } catch (b15 e) {
                this.f22167o.mo4814s(e);
            }
        }
        return false;
    }
}
