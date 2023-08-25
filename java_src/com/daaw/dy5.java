package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.Collections;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class dy5 extends zzbt implements kt4 {
    public final Context p;
    public final rd6 q;
    public final String r;
    public final az5 s;
    public zzq t;
    @GuardedBy("this")
    public final pi6 u;
    public final zzchu v;
    @GuardedBy("this")
    public zi4 w;

    public dy5(Context context, zzq zzqVar, String str, rd6 rd6Var, az5 az5Var, zzchu zzchuVar) {
        this.p = context;
        this.q = rd6Var;
        this.t = zzqVar;
        this.r = str;
        this.s = az5Var;
        this.u = rd6Var.h();
        this.v = zzchuVar;
        rd6Var.o(this);
    }

    public final synchronized void i3(zzq zzqVar) {
        this.u.I(zzqVar);
        this.u.N(this.t.zzn);
    }

    public final synchronized boolean j3(zzl zzlVar) {
        if (k3()) {
            ry0.e("loadAd must be called on the main UI thread.");
        }
        zzt.zzp();
        if (!zzs.zzD(this.p) || zzlVar.zzs != null) {
            nj6.a(this.p, zzlVar.zzf);
            return this.q.a(zzlVar, this.r, null, new cy5(this));
        }
        k04.zzg("Failed to load the ad because app ID is missing.");
        az5 az5Var = this.s;
        if (az5Var != null) {
            az5Var.b(tj6.d(4, null, null));
        }
        return false;
    }

    public final boolean k3() {
        boolean z;
        if (((Boolean) ya3.f.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.n9)).booleanValue()) {
                z = true;
                return this.v.r >= ((Integer) zzba.zzc().b(g93.o9)).intValue() || !z;
            }
        }
        z = false;
        if (this.v.r >= ((Integer) zzba.zzc().b(g93.o9)).intValue()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
        ry0.e("recordManualImpression must be called on the main UI thread.");
        zi4 zi4Var = this.w;
        if (zi4Var != null) {
            zi4Var.m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3.v.r < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.p9)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.daaw.ma3 r0 = com.daaw.ya3.h     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.daaw.y83 r0 = com.daaw.g93.j9     // Catch: java.lang.Throwable -> L4c
            com.daaw.e93 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzchu r0 = r3.v     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.r     // Catch: java.lang.Throwable -> L4c
            com.daaw.y83 r1 = com.daaw.g93.p9     // Catch: java.lang.Throwable -> L4c
            com.daaw.e93 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.daaw.ry0.e(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.daaw.zi4 r0 = r3.w     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.daaw.nr4 r0 = r0.d()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.E0(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.dy5.zzB():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
        if (k3()) {
            ry0.e("setAdListener must be called on the main UI thread.");
        }
        this.q.n(zzbeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        if (k3()) {
            ry0.e("setAdListener must be called on the main UI thread.");
        }
        this.s.s(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        ry0.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(zzq zzqVar) {
        ry0.e("setAdSize must be called on the main UI thread.");
        this.u.I(zzqVar);
        this.t = zzqVar;
        zi4 zi4Var = this.w;
        if (zi4Var != null) {
            zi4Var.n(this.q.c(), zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        if (k3()) {
            ry0.e("setAppEventListener must be called on the main UI thread.");
        }
        this.s.W(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(s23 s23Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
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
        if (k3()) {
            ry0.e("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.u.P(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(fa3 fa3Var) {
        ry0.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.q.p(fa3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
        if (k3()) {
            ry0.e("setPaidEventListener must be called on the main UI thread.");
        }
        this.s.S(zzdgVar);
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
        if (k3()) {
            ry0.e("setVideoOptions must be called on the main UI thread.");
        }
        this.u.f(zzflVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(yd0 yd0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.q.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.daaw.kt4
    public final synchronized void zza() {
        if (!this.q.q()) {
            this.q.m();
            return;
        }
        zzq x = this.u.x();
        zi4 zi4Var = this.w;
        if (zi4Var != null && zi4Var.l() != null && this.u.o()) {
            x = vi6.a(this.p, Collections.singletonList(this.w.l()));
        }
        i3(x);
        try {
            j3(this.u.v());
        } catch (RemoteException unused) {
            k04.zzj("Failed to refresh the banner ad.");
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzaa(zzl zzlVar) {
        i3(this.t);
        return j3(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzab(zzcf zzcfVar) {
        ry0.e("setCorrelationIdProvider must be called on the main UI thread");
        this.u.q(zzcfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        ry0.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzq zzg() {
        ry0.e("getAdSize must be called on the main UI thread.");
        zi4 zi4Var = this.w;
        if (zi4Var != null) {
            return vi6.a(this.p, Collections.singletonList(zi4Var.k()));
        }
        return this.u.x();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return this.s.k();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return this.s.l();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdn zzk() {
        if (((Boolean) zzba.zzc().b(g93.i6)).booleanValue()) {
            zi4 zi4Var = this.w;
            if (zi4Var == null) {
                return null;
            }
            return zi4Var.c();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdq zzl() {
        ry0.e("getVideoController must be called from the main thread.");
        zi4 zi4Var = this.w;
        if (zi4Var != null) {
            return zi4Var.j();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final yd0 zzn() {
        if (k3()) {
            ry0.e("getAdFrame must be called on the main UI thread.");
        }
        return nt0.g3(this.q.c());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.r;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        zi4 zi4Var = this.w;
        if (zi4Var == null || zi4Var.c() == null) {
            return null;
        }
        return zi4Var.c().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        zi4 zi4Var = this.w;
        if (zi4Var == null || zi4Var.c() == null) {
            return null;
        }
        return zi4Var.c().zzg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3.v.r < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.p9)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.daaw.ma3 r0 = com.daaw.ya3.e     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.daaw.y83 r0 = com.daaw.g93.k9     // Catch: java.lang.Throwable -> L47
            com.daaw.e93 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzchu r0 = r3.v     // Catch: java.lang.Throwable -> L47
            int r0 = r0.r     // Catch: java.lang.Throwable -> L47
            com.daaw.y83 r1 = com.daaw.g93.p9     // Catch: java.lang.Throwable -> L47
            com.daaw.e93 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L47
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L47
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.daaw.ry0.e(r0)     // Catch: java.lang.Throwable -> L47
        L3c:
            com.daaw.zi4 r0 = r3.w     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L45
            r0.a()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)
            return
        L45:
            monitor-exit(r3)
            return
        L47:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.dy5.zzx():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, zzbk zzbkVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3.v.r < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(com.daaw.g93.p9)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.daaw.ma3 r0 = com.daaw.ya3.g     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.daaw.y83 r0 = com.daaw.g93.l9     // Catch: java.lang.Throwable -> L4c
            com.daaw.e93 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.b(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzchu r0 = r3.v     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.r     // Catch: java.lang.Throwable -> L4c
            com.daaw.y83 r1 = com.daaw.g93.p9     // Catch: java.lang.Throwable -> L4c
            com.daaw.e93 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.daaw.ry0.e(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.daaw.zi4 r0 = r3.w     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.daaw.nr4 r0 = r0.d()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.D0(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.dy5.zzz():void");
    }
}
