package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class si4 extends zl4 {
    public final a74 i;
    public final int j;
    public final Context k;
    public final wh4 l;
    public final c15 m;
    public final by4 n;
    public final br4 o;
    public final boolean p;
    public boolean q;

    public si4(yl4 yl4Var, Context context, a74 a74Var, int i, wh4 wh4Var, c15 c15Var, by4 by4Var, br4 br4Var) {
        super(yl4Var);
        this.q = false;
        this.i = a74Var;
        this.k = context;
        this.j = i;
        this.l = wh4Var;
        this.m = c15Var;
        this.n = by4Var;
        this.o = br4Var;
        this.p = ((Boolean) zzba.zzc().b(g93.L4)).booleanValue();
    }

    @Override // com.daaw.zl4
    public final void a() {
        super.a();
        a74 a74Var = this.i;
        if (a74Var != null) {
            a74Var.destroy();
        }
    }

    public final int h() {
        return this.j;
    }

    public final void i(j23 j23Var) {
        a74 a74Var = this.i;
        if (a74Var != null) {
            a74Var.u0(j23Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.app.Activity r3, com.daaw.w23 r4, boolean r5) {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            android.content.Context r3 = r2.k
        L4:
            boolean r4 = r2.p
            if (r4 == 0) goto Ld
            com.daaw.by4 r4 = r2.n
            r4.zzb()
        Ld:
            com.daaw.y83 r4 = com.daaw.g93.y0
            com.daaw.e93 r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r0.b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L61
            com.google.android.gms.ads.internal.zzt.zzp()
            boolean r4 = com.google.android.gms.ads.internal.util.zzs.zzC(r3)
            if (r4 == 0) goto L61
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.daaw.k04.zzj(r4)
            com.daaw.br4 r4 = r2.o
            r4.zzb()
            com.daaw.y83 r4 = com.daaw.g93.z0
            com.daaw.e93 r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L94
            com.daaw.ss6 r4 = new com.daaw.ss6
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbv r5 = com.google.android.gms.ads.internal.zzt.zzt()
            android.os.Looper r5 = r5.zzb()
            r4.<init>(r3, r5)
            com.daaw.fi6 r3 = r2.a
            com.daaw.ei6 r3 = r3.b
            com.daaw.wh6 r3 = r3.b
            java.lang.String r3 = r3.b
            r4.a(r3)
            return
        L61:
            boolean r4 = r2.q
            if (r4 == 0) goto L76
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.daaw.k04.zzj(r4)
            com.daaw.br4 r4 = r2.o
            r0 = 10
            r1 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.daaw.tj6.d(r0, r1, r1)
            r4.b(r0)
        L76:
            boolean r4 = r2.q
            if (r4 != 0) goto L94
            com.daaw.c15 r4 = r2.m     // Catch: com.daaw.b15 -> L8e
            com.daaw.br4 r0 = r2.o     // Catch: com.daaw.b15 -> L8e
            r4.a(r5, r3, r0)     // Catch: com.daaw.b15 -> L8e
            boolean r3 = r2.p     // Catch: com.daaw.b15 -> L8e
            if (r3 == 0) goto L8a
            com.daaw.by4 r3 = r2.n     // Catch: com.daaw.b15 -> L8e
            r3.zza()     // Catch: com.daaw.b15 -> L8e
        L8a:
            r3 = 1
            r2.q = r3
            return
        L8e:
            r3 = move-exception
            com.daaw.br4 r4 = r2.o
            r4.s(r3)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.si4.j(android.app.Activity, com.daaw.w23, boolean):void");
    }

    public final void k(long j, int i) {
        this.l.a(j, i);
    }
}
