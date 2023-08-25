package com.daaw;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class si4 extends zl4 {

    /* renamed from: i */
    public final a74 f26270i;

    /* renamed from: j */
    public final int f26271j;

    /* renamed from: k */
    public final Context f26272k;

    /* renamed from: l */
    public final wh4 f26273l;

    /* renamed from: m */
    public final c15 f26274m;

    /* renamed from: n */
    public final by4 f26275n;

    /* renamed from: o */
    public final br4 f26276o;

    /* renamed from: p */
    public final boolean f26277p;

    /* renamed from: q */
    public boolean f26278q;

    public si4(yl4 yl4Var, Context context, a74 a74Var, int i, wh4 wh4Var, c15 c15Var, by4 by4Var, br4 br4Var) {
        super(yl4Var);
        this.f26278q = false;
        this.f26270i = a74Var;
        this.f26272k = context;
        this.f26271j = i;
        this.f26273l = wh4Var;
        this.f26274m = c15Var;
        this.f26275n = by4Var;
        this.f26276o = br4Var;
        this.f26277p = ((Boolean) zzba.zzc().m23658b(g93.f10476L4)).booleanValue();
    }

    @Override // com.daaw.zl4
    /* renamed from: a */
    public final void mo2132a() {
        super.mo2132a();
        a74 a74Var = this.f26270i;
        if (a74Var != null) {
            a74Var.destroy();
        }
    }

    /* renamed from: h */
    public final int m10331h() {
        return this.f26271j;
    }

    /* renamed from: i */
    public final void m10330i(j23 j23Var) {
        a74 a74Var = this.f26270i;
        if (a74Var != null) {
            a74Var.mo6399u0(j23Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.content.Context] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10329j(Activity activity, w23 w23Var, boolean z) {
        Activity activity2;
        if (activity == null) {
            activity2 = this.f26272k;
        }
        if (this.f26277p) {
            this.f26275n.zzb();
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10886y0)).booleanValue()) {
            zzt.zzp();
            if (zzs.zzC(activity2)) {
                k04.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f26276o.zzb();
                if (((Boolean) zzba.zzc().m23658b(g93.f10897z0)).booleanValue()) {
                    new ss6(activity2.getApplicationContext(), zzt.zzt().zzb()).m9920a(this.f35204a.f9624b.f8508b.f31252b);
                    return;
                }
                return;
            }
        }
        if (this.f26278q) {
            k04.zzj("App open interstitial ad is already visible.");
            this.f26276o.mo4815b(tj6.m9071d(10, null, null));
        }
        if (this.f26278q) {
            return;
        }
        try {
            this.f26274m.mo3165a(z, activity2, this.f26276o);
            if (this.f26277p) {
                this.f26275n.zza();
            }
            this.f26278q = true;
        } catch (b15 e) {
            this.f26276o.mo4814s(e);
        }
    }

    /* renamed from: k */
    public final void m10328k(long j, int i) {
        this.f26273l.m6064a(j, i);
    }
}
