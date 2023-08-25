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
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class iz5 extends zzbt {

    /* renamed from: p */
    public final zzq f14132p;

    /* renamed from: q */
    public final Context f14133q;

    /* renamed from: r */
    public final qf6 f14134r;

    /* renamed from: s */
    public final String f14135s;

    /* renamed from: t */
    public final zzchu f14136t;

    /* renamed from: u */
    public final az5 f14137u;

    /* renamed from: v */
    public final tg6 f14138v;
    @GuardedBy("this")

    /* renamed from: w */
    public oz4 f14139w;
    @GuardedBy("this")

    /* renamed from: x */
    public boolean f14140x = ((Boolean) zzba.zzc().m23658b(g93.f10360A0)).booleanValue();

    public iz5(Context context, zzq zzqVar, String str, qf6 qf6Var, az5 az5Var, tg6 tg6Var, zzchu zzchuVar) {
        this.f14132p = zzqVar;
        this.f14135s = str;
        this.f14133q = context;
        this.f14134r = qf6Var;
        this.f14137u = az5Var;
        this.f14138v = tg6Var;
        this.f14136t = zzchuVar;
    }

    /* renamed from: i3 */
    public final synchronized boolean m19217i3() {
        boolean z;
        oz4 oz4Var = this.f14139w;
        if (oz4Var != null) {
            z = oz4Var.m13797h() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        ry0.m10835e("resume must be called on the main UI thread.");
        oz4 oz4Var = this.f14139w;
        if (oz4Var != null) {
            oz4Var.m2129d().m14851E0(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        ry0.m10835e("setAdListener must be called on the main UI thread.");
        this.f14137u.m26574s(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        ry0.m10835e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        ry0.m10835e("setAppEventListener must be called on the main UI thread.");
        this.f14137u.m26579W(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(s23 s23Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
        this.f14137u.m26578d0(zzciVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzL(boolean z) {
        ry0.m10835e("setImmersiveMode must be called on the main UI thread.");
        this.f14140x = z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(qr3 qr3Var) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(fa3 fa3Var) {
        ry0.m10835e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f14134r.m12556h(fa3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
        ry0.m10835e("setPaidEventListener must be called on the main UI thread.");
        this.f14137u.m26580S(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(os3 os3Var, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(iv3 iv3Var) {
        this.f14138v.m9175S(iv3Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzflVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzW(yd0 yd0Var) {
        if (this.f14139w == null) {
            k04.zzj("Interstitial can not be shown before loaded.");
            this.f14137u.mo9178A(tj6.m9071d(9, null, null));
            return;
        }
        this.f14139w.m13796i(this.f14140x, (Activity) nt0.m14831M(yd0Var));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
        ry0.m10835e("showInterstitial must be called on the main UI thread.");
        oz4 oz4Var = this.f14139w;
        if (oz4Var != null) {
            oz4Var.m13796i(this.f14140x, null);
            return;
        }
        k04.zzj("Interstitial can not be shown before loaded.");
        this.f14137u.mo9178A(tj6.m9071d(9, null, null));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.f14134r.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        ry0.m10835e("isLoaded must be called on the main UI thread.");
        return m19217i3();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[Catch: all -> 0x008c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:9:0x0025, B:13:0x0042, B:15:0x004e, B:17:0x0052, B:19:0x005b, B:22:0x0065, B:26:0x006d, B:12:0x003d), top: B:32:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzaa(zzl zzlVar) {
        boolean z;
        if (((Boolean) ya3.f33457i.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                z = true;
                if (this.f14136t.f36995r >= ((Integer) zzba.zzc().m23658b(g93.f10785o9)).intValue() || !z) {
                    ry0.m10835e("loadAd must be called on the main UI thread.");
                }
                zzt.zzp();
                if (!zzs.zzD(this.f14133q) && zzlVar.zzs == null) {
                    k04.zzg("Failed to load the ad because app ID is missing.");
                    az5 az5Var = this.f14137u;
                    if (az5Var != null) {
                        az5Var.mo2194b(tj6.m9071d(4, null, null));
                    }
                    return false;
                } else if (m19217i3()) {
                    nj6.m15146a(this.f14133q, zzlVar.zzf);
                    this.f14139w = null;
                    return this.f14134r.mo4385a(zzlVar, this.f14135s, new jf6(this.f14132p), new hz5(this));
                } else {
                    return false;
                }
            }
        }
        z = false;
        if (this.f14136t.f36995r >= ((Integer) zzba.zzc().m23658b(g93.f10785o9)).intValue()) {
        }
        ry0.m10835e("loadAd must be called on the main UI thread.");
        zzt.zzp();
        if (!zzs.zzD(this.f14133q)) {
        }
        if (m19217i3()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        ry0.m10835e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return this.f14137u.m26576k();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return this.f14137u.m26575l();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzdn zzk() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10716i6)).booleanValue()) {
            oz4 oz4Var = this.f14139w;
            if (oz4Var == null) {
                return null;
            }
            return oz4Var.m2130c();
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
        return this.f14135s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        oz4 oz4Var = this.f14139w;
        if (oz4Var == null || oz4Var.m2130c() == null) {
            return null;
        }
        return oz4Var.m2130c().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        oz4 oz4Var = this.f14139w;
        if (oz4Var == null || oz4Var.m2130c() == null) {
            return null;
        }
        return oz4Var.m2130c().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        ry0.m10835e("destroy must be called on the main UI thread.");
        oz4 oz4Var = this.f14139w;
        if (oz4Var != null) {
            oz4Var.m2129d().m14853C0(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, zzbk zzbkVar) {
        this.f14137u.m26581M(zzbkVar);
        zzaa(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        ry0.m10835e("pause must be called on the main UI thread.");
        oz4 oz4Var = this.f14139w;
        if (oz4Var != null) {
            oz4Var.m2129d().m14852D0(null);
        }
    }
}
