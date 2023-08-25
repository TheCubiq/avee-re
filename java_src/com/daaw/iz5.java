package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
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
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzchu;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class iz5 extends zzbt {
    public final zzq p;
    public final Context q;
    public final qf6 r;
    public final String s;
    public final zzchu t;
    public final az5 u;
    public final tg6 v;
    @GuardedBy("this")
    public oz4 w;
    @GuardedBy("this")
    public boolean x = ((Boolean) zzba.zzc().b(g93.A0)).booleanValue();

    public iz5(Context context, zzq zzqVar, String str, qf6 qf6Var, az5 az5Var, tg6 tg6Var, zzchu zzchuVar) {
        this.p = zzqVar;
        this.s = str;
        this.q = context;
        this.r = qf6Var;
        this.u = az5Var;
        this.v = tg6Var;
        this.t = zzchuVar;
    }

    public final synchronized boolean i3() {
        boolean z;
        oz4 oz4Var = this.w;
        if (oz4Var != null) {
            z = oz4Var.h() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        ry0.e("resume must be called on the main UI thread.");
        oz4 oz4Var = this.w;
        if (oz4Var != null) {
            oz4Var.d().E0(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        ry0.e("setAdListener must be called on the main UI thread.");
        this.u.s(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        ry0.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        ry0.e("setAppEventListener must be called on the main UI thread.");
        this.u.W(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(s23 s23Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
        this.u.d0(zzciVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzL(boolean z) {
        ry0.e("setImmersiveMode must be called on the main UI thread.");
        this.x = z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(qr3 qr3Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(fa3 fa3Var) {
        ry0.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.r.h(fa3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
        ry0.e("setPaidEventListener must be called on the main UI thread.");
        this.u.S(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(os3 os3Var, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(iv3 iv3Var) {
        this.v.S(iv3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzflVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzW(yd0 yd0Var) {
        if (this.w == null) {
            k04.zzj("Interstitial can not be shown before loaded.");
            this.u.A(tj6.d(9, null, null));
            return;
        }
        this.w.i(this.x, (Activity) nt0.M(yd0Var));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
        ry0.e("showInterstitial must be called on the main UI thread.");
        oz4 oz4Var = this.w;
        if (oz4Var != null) {
            oz4Var.i(this.x, null);
            return;
        }
        k04.zzj("Interstitial can not be shown before loaded.");
        this.u.A(tj6.d(9, null, null));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.r.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        ry0.e("isLoaded must be called on the main UI thread.");
        return i3();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[Catch: all -> 0x008c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:9:0x0025, B:13:0x0042, B:15:0x004e, B:17:0x0052, B:19:0x005b, B:22:0x0065, B:26:0x006d, B:12:0x003d), top: B:32:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.daaw.ma3 r0 = com.daaw.ya3.i     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            r1 = 0
            if (r0 == 0) goto L24
            com.daaw.y83 r0 = com.daaw.g93.n9     // Catch: java.lang.Throwable -> L8c
            com.daaw.e93 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r2.b(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.google.android.gms.internal.ads.zzchu r2 = r5.t     // Catch: java.lang.Throwable -> L8c
            int r2 = r2.r     // Catch: java.lang.Throwable -> L8c
            com.daaw.y83 r3 = com.daaw.g93.o9     // Catch: java.lang.Throwable -> L8c
            com.daaw.e93 r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r3 = r4.b(r3)     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L8c
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L8c
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.daaw.ry0.e(r0)     // Catch: java.lang.Throwable -> L8c
        L42:
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Throwable -> L8c
            android.content.Context r0 = r5.q     // Catch: java.lang.Throwable -> L8c
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzD(r0)     // Catch: java.lang.Throwable -> L8c
            r2 = 0
            if (r0 == 0) goto L65
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L65
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.daaw.k04.zzg(r6)     // Catch: java.lang.Throwable -> L8c
            com.daaw.az5 r6 = r5.u     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L63
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.daaw.tj6.d(r0, r2, r2)     // Catch: java.lang.Throwable -> L8c
            r6.b(r0)     // Catch: java.lang.Throwable -> L8c
        L63:
            monitor-exit(r5)
            return r1
        L65:
            boolean r0 = r5.i3()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L6d
            monitor-exit(r5)
            return r1
        L6d:
            android.content.Context r0 = r5.q     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r6.zzf     // Catch: java.lang.Throwable -> L8c
            com.daaw.nj6.a(r0, r1)     // Catch: java.lang.Throwable -> L8c
            r5.w = r2     // Catch: java.lang.Throwable -> L8c
            com.daaw.qf6 r0 = r5.r     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = r5.s     // Catch: java.lang.Throwable -> L8c
            com.daaw.jf6 r2 = new com.daaw.jf6     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.internal.client.zzq r3 = r5.p     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8c
            com.daaw.hz5 r3 = new com.daaw.hz5     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L8c
            boolean r6 = r0.a(r6, r1, r2, r3)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r5)
            return r6
        L8c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.iz5.zzaa(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        ry0.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return this.u.k();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return this.u.l();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdn zzk() {
        if (((Boolean) zzba.zzc().b(g93.i6)).booleanValue()) {
            oz4 oz4Var = this.w;
            if (oz4Var == null) {
                return null;
            }
            return oz4Var.c();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final yd0 zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        oz4 oz4Var = this.w;
        if (oz4Var == null || oz4Var.c() == null) {
            return null;
        }
        return oz4Var.c().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        oz4 oz4Var = this.w;
        if (oz4Var == null || oz4Var.c() == null) {
            return null;
        }
        return oz4Var.c().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        ry0.e("destroy must be called on the main UI thread.");
        oz4 oz4Var = this.w;
        if (oz4Var != null) {
            oz4Var.d().C0(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, zzbk zzbkVar) {
        this.u.M(zzbkVar);
        zzaa(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        ry0.e("pause must be called on the main UI thread.");
        oz4 oz4Var = this.w;
        if (oz4Var != null) {
            oz4Var.d().D0(null);
        }
    }
}
