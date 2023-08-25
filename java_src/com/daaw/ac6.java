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
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ac6 extends zzbt implements zzad, j23, qs4 {

    /* renamed from: p */
    public final b94 f3077p;

    /* renamed from: q */
    public final Context f3078q;

    /* renamed from: r */
    public final ViewGroup f3079r;

    /* renamed from: t */
    public final String f3081t;

    /* renamed from: u */
    public final ub6 f3082u;

    /* renamed from: v */
    public final dd6 f3083v;

    /* renamed from: w */
    public final zzchu f3084w;

    /* renamed from: y */
    public ph4 f3086y;
    @GuardedBy("this")

    /* renamed from: z */
    public ei4 f3087z;

    /* renamed from: s */
    public AtomicBoolean f3080s = new AtomicBoolean();

    /* renamed from: x */
    public long f3085x = -1;

    public ac6(b94 b94Var, Context context, String str, ub6 ub6Var, dd6 dd6Var, zzchu zzchuVar) {
        this.f3079r = new FrameLayout(context);
        this.f3077p = b94Var;
        this.f3078q = context;
        this.f3081t = str;
        this.f3082u = ub6Var;
        this.f3083v = dd6Var;
        dd6Var.m24519l(this);
        this.f3084w = zzchuVar;
    }

    /* renamed from: i3 */
    public static /* bridge */ /* synthetic */ zzr m27531i3(ac6 ac6Var, ei4 ei4Var) {
        boolean m23457o = ei4Var.m23457o();
        int intValue = ((Integer) zzba.zzc().m23658b(g93.f10813r4)).intValue();
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != m23457o ? 0 : intValue;
        zzqVar.zzb = true != m23457o ? intValue : 0;
        zzqVar.zzc = intValue;
        return new zzr(ac6Var.f3078q, zzqVar, ac6Var);
    }

    /* renamed from: l3 */
    public final synchronized void m27528l3(int i) {
        if (this.f3080s.compareAndSet(false, true)) {
            ei4 ei4Var = this.f3087z;
            if (ei4Var != null && ei4Var.m23455q() != null) {
                this.f3083v.m24522M(ei4Var.m23455q());
            }
            this.f3083v.zzj();
            this.f3079r.removeAllViews();
            ph4 ph4Var = this.f3086y;
            if (ph4Var != null) {
                zzt.zzb().m15596e(ph4Var);
            }
            if (this.f3087z != null) {
                long j = -1;
                if (this.f3085x != -1) {
                    j = zzt.zzB().mo15859b() - this.f3085x;
                }
                this.f3087z.m23456p(j, i);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        ry0.m10835e("resume must be called on the main UI thread.");
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
        ry0.m10835e("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(s23 s23Var) {
        this.f3083v.m24524F(s23Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
        this.f3082u.m17795k(zzwVar);
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
        return this.f3082u.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.daaw.j23
    public final void zza() {
        m27528l3(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:9:0x0025, B:13:0x0042, B:15:0x004d, B:18:0x0052, B:21:0x0064, B:25:0x006c, B:12:0x003d), top: B:31:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzaa(zzl zzlVar) {
        boolean z;
        if (((Boolean) ya3.f33452d.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                z = true;
                if (this.f3084w.f36995r >= ((Integer) zzba.zzc().m23658b(g93.f10785o9)).intValue() || !z) {
                    ry0.m10835e("loadAd must be called on the main UI thread.");
                }
                zzt.zzp();
                if (zzs.zzD(this.f3078q) && zzlVar.zzs == null) {
                    k04.zzg("Failed to load the ad because app ID is missing.");
                    this.f3083v.mo2194b(tj6.m9071d(4, null, null));
                    return false;
                }
                if (zzY()) {
                    this.f3080s = new AtomicBoolean();
                    return this.f3082u.mo4385a(zzlVar, this.f3081t, new yb6(this), new zb6(this));
                }
                return false;
            }
        }
        z = false;
        if (this.f3084w.f36995r >= ((Integer) zzba.zzc().m23658b(g93.f10785o9)).intValue()) {
        }
        ry0.m10835e("loadAd must be called on the main UI thread.");
        zzt.zzp();
        if (zzs.zzD(this.f3078q)) {
            k04.zzg("Failed to load the ad because app ID is missing.");
            this.f3083v.mo2194b(tj6.m9071d(4, null, null));
            return false;
        }
        if (zzY()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzab(zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzbL() {
        m27528l3(4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        ry0.m10835e("getAdSize must be called on the main UI thread.");
        ei4 ei4Var = this.f3087z;
        if (ei4Var != null) {
            return vi6.m7131a(this.f3078q, Collections.singletonList(ei4Var.m23462j()));
        }
        return null;
    }

    @Override // com.daaw.qs4
    public final void zzh() {
        if (this.f3087z == null) {
            return;
        }
        this.f3085x = zzt.zzB().mo15859b();
        int m23464h = this.f3087z.m23464h();
        if (m23464h <= 0) {
            return;
        }
        ph4 ph4Var = new ph4(this.f3077p.mo26275d(), zzt.zzB());
        this.f3086y = ph4Var;
        ph4Var.m13383c(m23464h, new Runnable() { // from class: com.daaw.xb6
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
        ry0.m10835e("getAdFrame must be called on the main UI thread.");
        return nt0.m14830g3(this.f3079r);
    }

    public final /* synthetic */ void zzo() {
        m27528l3(5);
    }

    public final void zzp() {
        zzay.zzb();
        if (d04.m24836A()) {
            m27528l3(5);
        } else {
            this.f3077p.mo26277c().execute(new Runnable() { // from class: com.daaw.wb6
                @Override // java.lang.Runnable
                public final void run() {
                    ac6.this.zzo();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.f3081t;
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
        ry0.m10835e("destroy must be called on the main UI thread.");
        ei4 ei4Var = this.f3087z;
        if (ei4Var != null) {
            ei4Var.mo2132a();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzlVar, zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        ry0.m10835e("pause must be called on the main UI thread.");
    }
}
