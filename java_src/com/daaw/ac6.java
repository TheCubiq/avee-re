package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ac6 extends zzbt implements zzad, j23, qs4 {
    public final b94 p;
    public final Context q;
    public final ViewGroup r;
    public final String t;
    public final ub6 u;
    public final dd6 v;
    public final zzchu w;
    public ph4 y;
    @GuardedBy("this")
    public ei4 z;
    public AtomicBoolean s = new AtomicBoolean();
    public long x = -1;

    public ac6(b94 b94Var, Context context, String str, ub6 ub6Var, dd6 dd6Var, zzchu zzchuVar) {
        this.r = new FrameLayout(context);
        this.p = b94Var;
        this.q = context;
        this.t = str;
        this.u = ub6Var;
        this.v = dd6Var;
        dd6Var.l(this);
        this.w = zzchuVar;
    }

    public static /* bridge */ /* synthetic */ zzr i3(ac6 ac6Var, ei4 ei4Var) {
        boolean o = ei4Var.o();
        int intValue = ((Integer) zzba.zzc().b(g93.r4)).intValue();
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != o ? 0 : intValue;
        zzqVar.zzb = true != o ? intValue : 0;
        zzqVar.zzc = intValue;
        return new zzr(ac6Var.q, zzqVar, ac6Var);
    }

    public final synchronized void l3(int i) {
        if (this.s.compareAndSet(false, true)) {
            ei4 ei4Var = this.z;
            if (ei4Var != null && ei4Var.q() != null) {
                this.v.M(ei4Var.q());
            }
            this.v.zzj();
            this.r.removeAllViews();
            ph4 ph4Var = this.y;
            if (ph4Var != null) {
                zzt.zzb().e(ph4Var);
            }
            if (this.z != null) {
                long j = -1;
                if (this.x != -1) {
                    j = zzt.zzB().b() - this.x;
                }
                this.z.p(j, i);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        ry0.e("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        ry0.e("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(s23 s23Var) {
        this.v.F(s23Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
        this.u.k(zzwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(qr3 qr3Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(fa3 fa3Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(os3 os3Var, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(iv3 iv3Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzU(zzfl zzflVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(yd0 yd0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.u.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.daaw.j23
    public final void zza() {
        l3(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:9:0x0025, B:13:0x0042, B:15:0x004d, B:18:0x0052, B:21:0x0064, B:25:0x006c, B:12:0x003d), top: B:31:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.daaw.ma3 r0 = com.daaw.ya3.d     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L87
            r1 = 0
            if (r0 == 0) goto L24
            com.daaw.y83 r0 = com.daaw.g93.n9     // Catch: java.lang.Throwable -> L87
            com.daaw.e93 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.google.android.gms.internal.ads.zzchu r2 = r5.w     // Catch: java.lang.Throwable -> L87
            int r2 = r2.r     // Catch: java.lang.Throwable -> L87
            com.daaw.y83 r3 = com.daaw.g93.o9     // Catch: java.lang.Throwable -> L87
            com.daaw.e93 r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r3 = r4.b(r3)     // Catch: java.lang.Throwable -> L87
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L87
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L87
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.daaw.ry0.e(r0)     // Catch: java.lang.Throwable -> L87
        L42:
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Throwable -> L87
            android.content.Context r0 = r5.q     // Catch: java.lang.Throwable -> L87
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzD(r0)     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L64
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L52
            goto L64
        L52:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.daaw.k04.zzg(r6)     // Catch: java.lang.Throwable -> L87
            com.daaw.dd6 r6 = r5.v     // Catch: java.lang.Throwable -> L87
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.daaw.tj6.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L87
            r6.b(r0)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            return r1
        L64:
            boolean r0 = r5.zzY()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L6c
            monitor-exit(r5)
            return r1
        L6c:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L87
            r0.<init>()     // Catch: java.lang.Throwable -> L87
            r5.s = r0     // Catch: java.lang.Throwable -> L87
            com.daaw.yb6 r0 = new com.daaw.yb6     // Catch: java.lang.Throwable -> L87
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L87
            com.daaw.ub6 r1 = r5.u     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = r5.t     // Catch: java.lang.Throwable -> L87
            com.daaw.zb6 r3 = new com.daaw.zb6     // Catch: java.lang.Throwable -> L87
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L87
            boolean r6 = r1.a(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            return r6
        L87:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ac6.zzaa(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzab(zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzbL() {
        l3(4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        ry0.e("getAdSize must be called on the main UI thread.");
        ei4 ei4Var = this.z;
        if (ei4Var != null) {
            return vi6.a(this.q, Collections.singletonList(ei4Var.j()));
        }
        return null;
    }

    @Override // com.daaw.qs4
    public final void zzh() {
        if (this.z == null) {
            return;
        }
        this.x = zzt.zzB().b();
        int h = this.z.h();
        if (h <= 0) {
            return;
        }
        ph4 ph4Var = new ph4(this.p.d(), zzt.zzB());
        this.y = ph4Var;
        ph4Var.c(h, new Runnable() { // from class: com.daaw.xb6
            @Override // java.lang.Runnable
            public final void run() {
                ac6.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdn zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final yd0 zzn() {
        ry0.e("getAdFrame must be called on the main UI thread.");
        return nt0.g3(this.r);
    }

    public final /* synthetic */ void zzo() {
        l3(5);
    }

    public final void zzp() {
        zzay.zzb();
        if (d04.A()) {
            l3(5);
        } else {
            this.p.c().execute(new Runnable() { // from class: com.daaw.wb6
                @Override // java.lang.Runnable
                public final void run() {
                    ac6.this.zzo();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.t;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        ry0.e("destroy must be called on the main UI thread.");
        ei4 ei4Var = this.z;
        if (ei4Var != null) {
            ei4Var.a();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        ry0.e("pause must be called on the main UI thread.");
    }
}
