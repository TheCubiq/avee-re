package com.daaw;

import android.annotation.TargetApi;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.internal.ads.zzccb;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class az5 implements pt4, fs4, oq4, ir4, zza, lq4, ct4, hp2, er4, vy4 {

    /* renamed from: x */
    public final on6 f4124x;

    /* renamed from: p */
    public final AtomicReference f4116p = new AtomicReference();

    /* renamed from: q */
    public final AtomicReference f4117q = new AtomicReference();

    /* renamed from: r */
    public final AtomicReference f4118r = new AtomicReference();

    /* renamed from: s */
    public final AtomicReference f4119s = new AtomicReference();

    /* renamed from: t */
    public final AtomicReference f4120t = new AtomicReference();

    /* renamed from: u */
    public final AtomicBoolean f4121u = new AtomicBoolean(true);

    /* renamed from: v */
    public final AtomicBoolean f4122v = new AtomicBoolean(false);

    /* renamed from: w */
    public final AtomicBoolean f4123w = new AtomicBoolean(false);

    /* renamed from: y */
    public final BlockingQueue f4125y = new ArrayBlockingQueue(((Integer) zzba.zzc().m23658b(g93.f10569U7)).intValue());

    public az5(on6 on6Var) {
        this.f4124x = on6Var;
    }

    @Override // com.daaw.er4
    /* renamed from: A */
    public final void mo9178A(final zze zzeVar) {
        ne6.m15202a(this.f4120t, new me6() { // from class: com.daaw.ly5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzci) obj).zzd(zze.this);
            }
        });
    }

    @Override // com.daaw.pt4
    /* renamed from: F */
    public final void mo5181F(fi6 fi6Var) {
        this.f4121u.set(true);
        this.f4123w.set(false);
    }

    @Override // com.daaw.hp2
    @TargetApi(5)
    /* renamed from: H */
    public final synchronized void mo5180H(final String str, final String str2) {
        if (!this.f4121u.get()) {
            ne6.m15202a(this.f4117q, new me6() { // from class: com.daaw.ky5
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((zzcb) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.f4125y.offer(new Pair(str, str2))) {
            k04.zze("The queue for app events is full, dropping the new event.");
            on6 on6Var = this.f4124x;
            if (on6Var != null) {
                nn6 m14953b = nn6.m14953b("dae_action");
                m14953b.m14954a("dae_name", str);
                m14953b.m14954a("dae_data", str2);
                on6Var.mo7889a(m14953b);
            }
        }
    }

    /* renamed from: M */
    public final void m26581M(zzbk zzbkVar) {
        this.f4119s.set(zzbkVar);
    }

    /* renamed from: S */
    public final void m26580S(zzdg zzdgVar) {
        this.f4118r.set(zzdgVar);
    }

    @Override // com.daaw.lq4
    /* renamed from: T */
    public final void mo5177T() {
    }

    /* renamed from: W */
    public final void m26579W(zzcb zzcbVar) {
        this.f4117q.set(zzcbVar);
        this.f4122v.set(true);
        m26577e0();
    }

    @Override // com.daaw.oq4
    /* renamed from: b */
    public final void mo2194b(final zze zzeVar) {
        ne6.m15202a(this.f4116p, new me6() { // from class: com.daaw.ry5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzf(zze.this);
            }
        });
        ne6.m15202a(this.f4116p, new me6() { // from class: com.daaw.sy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zze(zze.this.zza);
            }
        });
        ne6.m15202a(this.f4119s, new me6() { // from class: com.daaw.ty5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbk) obj).zzb(zze.this);
            }
        });
        this.f4121u.set(false);
        this.f4125y.clear();
    }

    @Override // com.daaw.lq4
    /* renamed from: c */
    public final void mo5175c() {
    }

    /* renamed from: d0 */
    public final void m26578d0(zzci zzciVar) {
        this.f4120t.set(zzciVar);
    }

    @Override // com.daaw.pt4
    /* renamed from: e */
    public final void mo5174e(zzccb zzccbVar) {
    }

    @TargetApi(5)
    /* renamed from: e0 */
    public final void m26577e0() {
        if (this.f4122v.get() && this.f4123w.get()) {
            for (final Pair pair : this.f4125y) {
                ne6.m15202a(this.f4117q, new me6() { // from class: com.daaw.oy5
                    @Override // com.daaw.me6
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((zzcb) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.f4125y.clear();
            this.f4121u.set(false);
        }
    }

    @Override // com.daaw.ct4
    /* renamed from: f */
    public final void mo9172f(final zzs zzsVar) {
        ne6.m15202a(this.f4118r, new me6() { // from class: com.daaw.my5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzdg) obj).zze(zzs.this);
            }
        });
    }

    /* renamed from: k */
    public final synchronized zzbh m26576k() {
        return (zzbh) this.f4116p.get();
    }

    /* renamed from: l */
    public final synchronized zzcb m26575l() {
        return (zzcb) this.f4117q.get();
    }

    @Override // com.daaw.lq4
    /* renamed from: m */
    public final void mo5170m(cv3 cv3Var, String str, String str2) {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10590W8)).booleanValue()) {
            return;
        }
        ne6.m15202a(this.f4116p, py5.f23537a);
    }

    /* renamed from: s */
    public final void m26574s(zzbh zzbhVar) {
        this.f4116p.set(zzbhVar);
    }

    @Override // com.daaw.lq4
    public final void zzj() {
        ne6.m15202a(this.f4116p, new me6() { // from class: com.daaw.zy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzd();
            }
        });
        ne6.m15202a(this.f4120t, new me6() { // from class: com.daaw.fy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzci) obj).zzc();
            }
        });
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        ne6.m15202a(this.f4116p, new me6() { // from class: com.daaw.ey5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzg();
            }
        });
    }

    @Override // com.daaw.lq4
    public final void zzm() {
        ne6.m15202a(this.f4116p, new me6() { // from class: com.daaw.ny5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzh();
            }
        });
    }

    @Override // com.daaw.fs4
    public final synchronized void zzn() {
        ne6.m15202a(this.f4116p, new me6() { // from class: com.daaw.uy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzi();
            }
        });
        ne6.m15202a(this.f4119s, new me6() { // from class: com.daaw.vy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbk) obj).zzc();
            }
        });
        this.f4123w.set(true);
        m26577e0();
    }

    @Override // com.daaw.lq4
    public final void zzo() {
        ne6.m15202a(this.f4116p, new me6() { // from class: com.daaw.hy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzj();
            }
        });
        ne6.m15202a(this.f4120t, new me6() { // from class: com.daaw.iy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzci) obj).zzf();
            }
        });
        ne6.m15202a(this.f4120t, new me6() { // from class: com.daaw.jy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzci) obj).zze();
            }
        });
    }

    @Override // com.daaw.vy4
    public final void zzq() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10590W8)).booleanValue()) {
            ne6.m15202a(this.f4116p, py5.f23537a);
        }
        ne6.m15202a(this.f4120t, new me6() { // from class: com.daaw.qy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzci) obj).zzb();
            }
        });
    }

    @Override // com.daaw.vy4
    public final void zzr() {
        ne6.m15202a(this.f4116p, new me6() { // from class: com.daaw.gy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzk();
            }
        });
    }
}
