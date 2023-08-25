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

    /* renamed from: p */
    public final Context f7977p;

    /* renamed from: q */
    public final rd6 f7978q;

    /* renamed from: r */
    public final String f7979r;

    /* renamed from: s */
    public final az5 f7980s;

    /* renamed from: t */
    public zzq f7981t;
    @GuardedBy("this")

    /* renamed from: u */
    public final pi6 f7982u;

    /* renamed from: v */
    public final zzchu f7983v;
    @GuardedBy("this")

    /* renamed from: w */
    public zi4 f7984w;

    public dy5(Context context, zzq zzqVar, String str, rd6 rd6Var, az5 az5Var, zzchu zzchuVar) {
        this.f7977p = context;
        this.f7978q = rd6Var;
        this.f7981t = zzqVar;
        this.f7979r = str;
        this.f7980s = az5Var;
        this.f7982u = rd6Var.m11383h();
        this.f7983v = zzchuVar;
        rd6Var.m11376o(this);
    }

    /* renamed from: i3 */
    public final synchronized void m23810i3(zzq zzqVar) {
        this.f7982u.m13371I(zzqVar);
        this.f7982u.m13366N(this.f7981t.zzn);
    }

    /* renamed from: j3 */
    public final synchronized boolean m23809j3(zzl zzlVar) {
        if (m23808k3()) {
            ry0.m10835e("loadAd must be called on the main UI thread.");
        }
        zzt.zzp();
        if (!zzs.zzD(this.f7977p) || zzlVar.zzs != null) {
            nj6.m15146a(this.f7977p, zzlVar.zzf);
            return this.f7978q.mo4385a(zzlVar, this.f7979r, null, new cy5(this));
        }
        k04.zzg("Failed to load the ad because app ID is missing.");
        az5 az5Var = this.f7980s;
        if (az5Var != null) {
            az5Var.mo2194b(tj6.m9071d(4, null, null));
        }
        return false;
    }

    /* renamed from: k3 */
    public final boolean m23808k3() {
        boolean z;
        if (((Boolean) ya3.f33454f.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                z = true;
                return this.f7983v.f36995r >= ((Integer) zzba.zzc().m23658b(g93.f10785o9)).intValue() || !z;
            }
        }
        z = false;
        if (this.f7983v.f36995r >= ((Integer) zzba.zzc().m23658b(g93.f10785o9)).intValue()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
        ry0.m10835e("recordManualImpression must be called on the main UI thread.");
        zi4 zi4Var = this.f7984w;
        if (zi4Var != null) {
            zi4Var.mo2270m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3.f7983v.f36995r < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10796p9)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzB() {
        if (((Boolean) ya3.f33456h.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10730j9)).booleanValue()) {
            }
        }
        ry0.m10835e("resume must be called on the main UI thread.");
        zi4 zi4Var = this.f7984w;
        if (zi4Var != null) {
            zi4Var.m2129d().m14851E0(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
        if (m23808k3()) {
            ry0.m10835e("setAdListener must be called on the main UI thread.");
        }
        this.f7978q.m11377n(zzbeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        if (m23808k3()) {
            ry0.m10835e("setAdListener must be called on the main UI thread.");
        }
        this.f7980s.m26574s(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        ry0.m10835e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(zzq zzqVar) {
        ry0.m10835e("setAdSize must be called on the main UI thread.");
        this.f7982u.m13371I(zzqVar);
        this.f7981t = zzqVar;
        zi4 zi4Var = this.f7984w;
        if (zi4Var != null) {
            zi4Var.mo2269n(this.f7978q.m11388c(), zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        if (m23808k3()) {
            ry0.m10835e("setAppEventListener must be called on the main UI thread.");
        }
        this.f7980s.m26579W(zzcbVar);
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
        if (m23808k3()) {
            ry0.m10835e("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.f7982u.m13364P(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(fa3 fa3Var) {
        ry0.m10835e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f7978q.m11375p(fa3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
        if (m23808k3()) {
            ry0.m10835e("setPaidEventListener must be called on the main UI thread.");
        }
        this.f7980s.m26580S(zzdgVar);
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
        if (m23808k3()) {
            ry0.m10835e("setVideoOptions must be called on the main UI thread.");
        }
        this.f7982u.m13357f(zzflVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(yd0 yd0Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.f7978q.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.daaw.kt4
    public final synchronized void zza() {
        if (!this.f7978q.m11374q()) {
            this.f7978q.m11378m();
            return;
        }
        zzq m13339x = this.f7982u.m13339x();
        zi4 zi4Var = this.f7984w;
        if (zi4Var != null && zi4Var.mo2271l() != null && this.f7982u.m13348o()) {
            m13339x = vi6.m7131a(this.f7977p, Collections.singletonList(this.f7984w.mo2271l()));
        }
        m23810i3(m13339x);
        try {
            m23809j3(this.f7982u.m13341v());
        } catch (RemoteException unused) {
            k04.zzj("Failed to refresh the banner ad.");
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzaa(zzl zzlVar) {
        m23810i3(this.f7981t);
        return m23809j3(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzab(zzcf zzcfVar) {
        ry0.m10835e("setCorrelationIdProvider must be called on the main UI thread");
        this.f7982u.m13346q(zzcfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        ry0.m10835e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzq zzg() {
        ry0.m10835e("getAdSize must be called on the main UI thread.");
        zi4 zi4Var = this.f7984w;
        if (zi4Var != null) {
            return vi6.m7131a(this.f7977p, Collections.singletonList(zi4Var.mo2272k()));
        }
        return this.f7982u.m13339x();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return this.f7980s.m26576k();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return this.f7980s.m26575l();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdn zzk() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10716i6)).booleanValue()) {
            zi4 zi4Var = this.f7984w;
            if (zi4Var == null) {
                return null;
            }
            return zi4Var.m2130c();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdq zzl() {
        ry0.m10835e("getVideoController must be called from the main thread.");
        zi4 zi4Var = this.f7984w;
        if (zi4Var != null) {
            return zi4Var.mo2273j();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final yd0 zzn() {
        if (m23808k3()) {
            ry0.m10835e("getAdFrame must be called on the main UI thread.");
        }
        return nt0.m14830g3(this.f7978q.m11388c());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.f7979r;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        zi4 zi4Var = this.f7984w;
        if (zi4Var == null || zi4Var.m2130c() == null) {
            return null;
        }
        return zi4Var.m2130c().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        zi4 zi4Var = this.f7984w;
        if (zi4Var == null || zi4Var.m2130c() == null) {
            return null;
        }
        return zi4Var.m2130c().zzg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3.f7983v.f36995r < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10796p9)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzx() {
        if (((Boolean) ya3.f33453e.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10741k9)).booleanValue()) {
            }
        }
        ry0.m10835e("destroy must be called on the main UI thread.");
        zi4 zi4Var = this.f7984w;
        if (zi4Var != null) {
            zi4Var.mo2132a();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, zzbk zzbkVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3.f7983v.f36995r < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10796p9)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzz() {
        if (((Boolean) ya3.f33455g.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10752l9)).booleanValue()) {
            }
        }
        ry0.m10835e("pause must be called on the main UI thread.");
        zi4 zi4Var = this.f7984w;
        if (zi4Var != null) {
            zi4Var.m2129d().m14852D0(null);
        }
    }
}
