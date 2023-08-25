package com.daaw;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class dd6 implements oq4, qs4, we6, zzo, ct4, er4, vy4 {
    public final bk6 p;
    public final AtomicReference q = new AtomicReference();
    public final AtomicReference r = new AtomicReference();
    public final AtomicReference s = new AtomicReference();
    public final AtomicReference t = new AtomicReference();
    public final AtomicReference u = new AtomicReference();
    public final AtomicReference v = new AtomicReference();
    public dd6 w = null;

    public dd6(bk6 bk6Var) {
        this.p = bk6Var;
    }

    public static dd6 c(dd6 dd6Var) {
        dd6 dd6Var2 = new dd6(dd6Var.p);
        dd6Var2.w = dd6Var;
        return dd6Var2;
    }

    @Override // com.daaw.er4
    public final void A(final zze zzeVar) {
        dd6 dd6Var = this.w;
        if (dd6Var != null) {
            dd6Var.A(zzeVar);
        } else {
            ne6.a(this.s, new me6() { // from class: com.daaw.zc6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((w23) obj).zzd(zze.this);
                }
            });
        }
    }

    public final void F(s23 s23Var) {
        this.q.set(s23Var);
    }

    public final void H(w23 w23Var) {
        this.s.set(w23Var);
    }

    public final void M(t23 t23Var) {
        this.r.set(t23Var);
    }

    @Override // com.daaw.oq4
    public final void b(final zze zzeVar) {
        dd6 dd6Var = this.w;
        if (dd6Var != null) {
            dd6Var.b(zzeVar);
            return;
        }
        ne6.a(this.q, new me6() { // from class: com.daaw.lc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((s23) obj).i2(zze.this);
            }
        });
        ne6.a(this.q, new me6() { // from class: com.daaw.rc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((s23) obj).zzb(zze.this.zza);
            }
        });
    }

    @Override // com.daaw.we6
    public final void e(we6 we6Var) {
        this.w = (dd6) we6Var;
    }

    @Override // com.daaw.ct4
    public final void f(final zzs zzsVar) {
        dd6 dd6Var = this.w;
        if (dd6Var != null) {
            dd6Var.f(zzsVar);
        } else {
            ne6.a(this.v, new me6() { // from class: com.daaw.oc6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((zzdg) obj).zze(zzs.this);
                }
            });
        }
    }

    public final void k(final p23 p23Var) {
        dd6 dd6Var = this.w;
        if (dd6Var != null) {
            dd6Var.k(p23Var);
        } else {
            ne6.a(this.q, new me6() { // from class: com.daaw.sc6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((s23) obj).r2(p23.this);
                }
            });
        }
    }

    public final void l(qs4 qs4Var) {
        this.t.set(qs4Var);
    }

    public final void m(zzo zzoVar) {
        this.u.set(zzoVar);
    }

    public final void s(zzdg zzdgVar) {
        this.v.set(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        dd6 dd6Var = this.w;
        if (dd6Var != null) {
            dd6Var.zzb();
            return;
        }
        ne6.a(this.u, new me6() { // from class: com.daaw.wc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzo) obj).zzb();
            }
        });
        ne6.a(this.s, new me6() { // from class: com.daaw.xc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((w23) obj).zzf();
            }
        });
        ne6.a(this.s, new me6() { // from class: com.daaw.yc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((w23) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbE() {
        dd6 dd6Var = this.w;
        if (dd6Var != null) {
            dd6Var.zzbE();
        } else {
            ne6.a(this.u, new me6() { // from class: com.daaw.qc6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((zzo) obj).zzbE();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbM() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        dd6 dd6Var = this.w;
        if (dd6Var != null) {
            dd6Var.zze();
        } else {
            ne6.a(this.u, new me6() { // from class: com.daaw.ad6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((zzo) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i) {
        dd6 dd6Var = this.w;
        if (dd6Var != null) {
            dd6Var.zzf(i);
        } else {
            ne6.a(this.u, new me6() { // from class: com.daaw.pc6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((zzo) obj).zzf(i);
                }
            });
        }
    }

    @Override // com.daaw.qs4
    public final void zzh() {
        dd6 dd6Var = this.w;
        if (dd6Var != null) {
            dd6Var.zzh();
        } else {
            ne6.a(this.t, new me6() { // from class: com.daaw.cd6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((qs4) obj).zzh();
                }
            });
        }
    }

    public final void zzj() {
        dd6 dd6Var = this.w;
        if (dd6Var != null) {
            dd6Var.zzj();
            return;
        }
        this.p.a();
        ne6.a(this.r, new me6() { // from class: com.daaw.mc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((t23) obj).zze();
            }
        });
        ne6.a(this.s, new me6() { // from class: com.daaw.nc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((w23) obj).zzc();
            }
        });
    }

    @Override // com.daaw.vy4
    public final void zzq() {
        dd6 dd6Var = this.w;
        if (dd6Var != null) {
            dd6Var.zzq();
        } else {
            ne6.a(this.s, new me6() { // from class: com.daaw.bd6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((w23) obj).zzb();
                }
            });
        }
    }

    @Override // com.daaw.vy4
    public final void zzr() {
    }
}
