package com.daaw;

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
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class ld6 extends zzbt implements zzo, j23 {

    /* renamed from: p */
    public final b94 f17282p;

    /* renamed from: q */
    public final Context f17283q;

    /* renamed from: s */
    public final String f17285s;

    /* renamed from: t */
    public final fd6 f17286t;

    /* renamed from: u */
    public final dd6 f17287u;

    /* renamed from: v */
    public final zzchu f17288v;
    @GuardedBy("this")

    /* renamed from: x */
    public ph4 f17290x;
    @GuardedBy("this")

    /* renamed from: y */
    public si4 f17291y;

    /* renamed from: r */
    public AtomicBoolean f17284r = new AtomicBoolean();
    @GuardedBy("this")

    /* renamed from: w */
    public long f17289w = -1;

    public ld6(b94 b94Var, Context context, String str, fd6 fd6Var, dd6 dd6Var, zzchu zzchuVar) {
        this.f17282p = b94Var;
        this.f17283q = context;
        this.f17285s = str;
        this.f17286t = fd6Var;
        this.f17287u = dd6Var;
        this.f17288v = zzchuVar;
        dd6Var.m24518m(this);
    }

    /* renamed from: h3 */
    public final synchronized void m17040h3(int i) {
        if (this.f17284r.compareAndSet(false, true)) {
            this.f17287u.zzj();
            ph4 ph4Var = this.f17290x;
            if (ph4Var != null) {
                zzt.zzb().m15596e(ph4Var);
            }
            if (this.f17291y != null) {
                long j = -1;
                if (this.f17289w != -1) {
                    j = zzt.zzB().mo15859b() - this.f17289w;
                }
                this.f17291y.m10328k(j, i);
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
    public final synchronized void zzF(zzq zzqVar) {
        ry0.m10835e("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(s23 s23Var) {
        this.f17287u.m24524F(s23Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
        this.f17286t.m17795k(zzwVar);
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
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.f17286t.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.daaw.j23
    public final void zza() {
        m17040h3(3);
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
                if (this.f17288v.f36995r >= ((Integer) zzba.zzc().m23658b(g93.f10785o9)).intValue() || !z) {
                    ry0.m10835e("loadAd must be called on the main UI thread.");
                }
                zzt.zzp();
                if (zzs.zzD(this.f17283q) && zzlVar.zzs == null) {
                    k04.zzg("Failed to load the ad because app ID is missing.");
                    this.f17287u.mo2194b(tj6.m9071d(4, null, null));
                    return false;
                }
                if (zzY()) {
                    this.f17284r = new AtomicBoolean();
                    return this.f17286t.mo4385a(zzlVar, this.f17285s, new jd6(this), new kd6(this));
                }
                return false;
            }
        }
        z = false;
        if (this.f17288v.f36995r >= ((Integer) zzba.zzc().m23658b(g93.f10785o9)).intValue()) {
        }
        ry0.m10835e("loadAd must be called on the main UI thread.");
        zzt.zzp();
        if (zzs.zzD(this.f17283q)) {
            k04.zzg("Failed to load the ad because app ID is missing.");
            this.f17287u.mo2194b(tj6.m9071d(4, null, null));
            return false;
        }
        if (zzY()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzab(zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        if (this.f17291y == null) {
            return;
        }
        this.f17289w = zzt.zzB().mo15859b();
        int m10331h = this.f17291y.m10331h();
        if (m10331h <= 0) {
            return;
        }
        ph4 ph4Var = new ph4(this.f17282p.mo26275d(), zzt.zzB());
        this.f17290x = ph4Var;
        ph4Var.m13383c(m10331h, new Runnable() { // from class: com.daaw.id6
            @Override // java.lang.Runnable
            public final void run() {
                ld6.this.zzo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbM() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        si4 si4Var = this.f17291y;
        if (si4Var != null) {
            si4Var.m10328k(zzt.zzB().mo15859b() - this.f17289w, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        int i2;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i3 == 0) {
            m17040h3(2);
            return;
        }
        if (i3 == 1) {
            i2 = 4;
        } else if (i3 == 2) {
            m17040h3(3);
            return;
        } else if (i3 != 3) {
            return;
        } else {
            i2 = 6;
        }
        m17040h3(i2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized zzq zzg() {
        return null;
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

    public final /* synthetic */ void zzm() {
        m17040h3(5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final yd0 zzn() {
        return null;
    }

    public final void zzo() {
        this.f17282p.mo26277c().execute(new Runnable() { // from class: com.daaw.hd6
            @Override // java.lang.Runnable
            public final void run() {
                ld6.this.zzm();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.f17285s;
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
        si4 si4Var = this.f17291y;
        if (si4Var != null) {
            si4Var.mo2132a();
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
