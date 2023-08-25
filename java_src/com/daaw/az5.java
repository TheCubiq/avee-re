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
    public final on6 x;
    public final AtomicReference p = new AtomicReference();
    public final AtomicReference q = new AtomicReference();
    public final AtomicReference r = new AtomicReference();
    public final AtomicReference s = new AtomicReference();
    public final AtomicReference t = new AtomicReference();
    public final AtomicBoolean u = new AtomicBoolean(true);
    public final AtomicBoolean v = new AtomicBoolean(false);
    public final AtomicBoolean w = new AtomicBoolean(false);
    public final BlockingQueue y = new ArrayBlockingQueue(((Integer) zzba.zzc().b(g93.U7)).intValue());

    public az5(on6 on6Var) {
        this.x = on6Var;
    }

    @Override // com.daaw.er4
    public final void A(final zze zzeVar) {
        ne6.a(this.t, new me6() { // from class: com.daaw.ly5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzci) obj).zzd(zze.this);
            }
        });
    }

    @Override // com.daaw.pt4
    public final void F(fi6 fi6Var) {
        this.u.set(true);
        this.w.set(false);
    }

    @Override // com.daaw.hp2
    @TargetApi(5)
    public final synchronized void H(final String str, final String str2) {
        if (!this.u.get()) {
            ne6.a(this.q, new me6() { // from class: com.daaw.ky5
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((zzcb) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.y.offer(new Pair(str, str2))) {
            k04.zze("The queue for app events is full, dropping the new event.");
            on6 on6Var = this.x;
            if (on6Var != null) {
                nn6 b = nn6.b("dae_action");
                b.a("dae_name", str);
                b.a("dae_data", str2);
                on6Var.a(b);
            }
        }
    }

    public final void M(zzbk zzbkVar) {
        this.s.set(zzbkVar);
    }

    public final void S(zzdg zzdgVar) {
        this.r.set(zzdgVar);
    }

    @Override // com.daaw.lq4
    public final void T() {
    }

    public final void W(zzcb zzcbVar) {
        this.q.set(zzcbVar);
        this.v.set(true);
        e0();
    }

    @Override // com.daaw.oq4
    public final void b(final zze zzeVar) {
        ne6.a(this.p, new me6() { // from class: com.daaw.ry5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzf(zze.this);
            }
        });
        ne6.a(this.p, new me6() { // from class: com.daaw.sy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zze(zze.this.zza);
            }
        });
        ne6.a(this.s, new me6() { // from class: com.daaw.ty5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbk) obj).zzb(zze.this);
            }
        });
        this.u.set(false);
        this.y.clear();
    }

    @Override // com.daaw.lq4
    public final void c() {
    }

    public final void d0(zzci zzciVar) {
        this.t.set(zzciVar);
    }

    @Override // com.daaw.pt4
    public final void e(zzccb zzccbVar) {
    }

    @TargetApi(5)
    public final void e0() {
        if (this.v.get() && this.w.get()) {
            for (final Pair pair : this.y) {
                ne6.a(this.q, new me6() { // from class: com.daaw.oy5
                    @Override // com.daaw.me6
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((zzcb) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.y.clear();
            this.u.set(false);
        }
    }

    @Override // com.daaw.ct4
    public final void f(final zzs zzsVar) {
        ne6.a(this.r, new me6() { // from class: com.daaw.my5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzdg) obj).zze(zzs.this);
            }
        });
    }

    public final synchronized zzbh k() {
        return (zzbh) this.p.get();
    }

    public final synchronized zzcb l() {
        return (zzcb) this.q.get();
    }

    @Override // com.daaw.lq4
    public final void m(cv3 cv3Var, String str, String str2) {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) zzba.zzc().b(g93.W8)).booleanValue()) {
            return;
        }
        ne6.a(this.p, py5.a);
    }

    public final void s(zzbh zzbhVar) {
        this.p.set(zzbhVar);
    }

    @Override // com.daaw.lq4
    public final void zzj() {
        ne6.a(this.p, new me6() { // from class: com.daaw.zy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzd();
            }
        });
        ne6.a(this.t, new me6() { // from class: com.daaw.fy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzci) obj).zzc();
            }
        });
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        ne6.a(this.p, new me6() { // from class: com.daaw.ey5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzg();
            }
        });
    }

    @Override // com.daaw.lq4
    public final void zzm() {
        ne6.a(this.p, new me6() { // from class: com.daaw.ny5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzh();
            }
        });
    }

    @Override // com.daaw.fs4
    public final synchronized void zzn() {
        ne6.a(this.p, new me6() { // from class: com.daaw.uy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzi();
            }
        });
        ne6.a(this.s, new me6() { // from class: com.daaw.vy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbk) obj).zzc();
            }
        });
        this.w.set(true);
        e0();
    }

    @Override // com.daaw.lq4
    public final void zzo() {
        ne6.a(this.p, new me6() { // from class: com.daaw.hy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzj();
            }
        });
        ne6.a(this.t, new me6() { // from class: com.daaw.iy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzci) obj).zzf();
            }
        });
        ne6.a(this.t, new me6() { // from class: com.daaw.jy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzci) obj).zze();
            }
        });
    }

    @Override // com.daaw.vy4
    public final void zzq() {
        if (((Boolean) zzba.zzc().b(g93.W8)).booleanValue()) {
            ne6.a(this.p, py5.a);
        }
        ne6.a(this.t, new me6() { // from class: com.daaw.qy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzci) obj).zzb();
            }
        });
    }

    @Override // com.daaw.vy4
    public final void zzr() {
        ne6.a(this.p, new me6() { // from class: com.daaw.gy5
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzbh) obj).zzk();
            }
        });
    }
}
