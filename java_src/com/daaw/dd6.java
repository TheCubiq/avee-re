package com.daaw;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class dd6 implements oq4, qs4, we6, zzo, ct4, er4, vy4 {

    /* renamed from: p */
    public final bk6 f6953p;

    /* renamed from: q */
    public final AtomicReference f6954q = new AtomicReference();

    /* renamed from: r */
    public final AtomicReference f6955r = new AtomicReference();

    /* renamed from: s */
    public final AtomicReference f6956s = new AtomicReference();

    /* renamed from: t */
    public final AtomicReference f6957t = new AtomicReference();

    /* renamed from: u */
    public final AtomicReference f6958u = new AtomicReference();

    /* renamed from: v */
    public final AtomicReference f6959v = new AtomicReference();

    /* renamed from: w */
    public dd6 f6960w = null;

    public dd6(bk6 bk6Var) {
        this.f6953p = bk6Var;
    }

    /* renamed from: c */
    public static dd6 m24521c(dd6 dd6Var) {
        dd6 dd6Var2 = new dd6(dd6Var.f6953p);
        dd6Var2.f6960w = dd6Var;
        return dd6Var2;
    }

    @Override // com.daaw.er4
    /* renamed from: A */
    public final void mo9178A(final zze zzeVar) {
        dd6 dd6Var = this.f6960w;
        if (dd6Var != null) {
            dd6Var.mo9178A(zzeVar);
        } else {
            ne6.m15202a(this.f6956s, new me6() { // from class: com.daaw.zc6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((w23) obj).zzd(zze.this);
                }
            });
        }
    }

    /* renamed from: F */
    public final void m24524F(s23 s23Var) {
        this.f6954q.set(s23Var);
    }

    /* renamed from: H */
    public final void m24523H(w23 w23Var) {
        this.f6956s.set(w23Var);
    }

    /* renamed from: M */
    public final void m24522M(t23 t23Var) {
        this.f6955r.set(t23Var);
    }

    @Override // com.daaw.oq4
    /* renamed from: b */
    public final void mo2194b(final zze zzeVar) {
        dd6 dd6Var = this.f6960w;
        if (dd6Var != null) {
            dd6Var.mo2194b(zzeVar);
            return;
        }
        ne6.m15202a(this.f6954q, new me6() { // from class: com.daaw.lc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((s23) obj).mo10752i2(zze.this);
            }
        });
        ne6.m15202a(this.f6954q, new me6() { // from class: com.daaw.rc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((s23) obj).zzb(zze.this.zza);
            }
        });
    }

    @Override // com.daaw.we6
    /* renamed from: e */
    public final void mo6129e(we6 we6Var) {
        this.f6960w = (dd6) we6Var;
    }

    @Override // com.daaw.ct4
    /* renamed from: f */
    public final void mo9172f(final zzs zzsVar) {
        dd6 dd6Var = this.f6960w;
        if (dd6Var != null) {
            dd6Var.mo9172f(zzsVar);
        } else {
            ne6.m15202a(this.f6959v, new me6() { // from class: com.daaw.oc6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((zzdg) obj).zze(zzs.this);
                }
            });
        }
    }

    /* renamed from: k */
    public final void m24520k(final p23 p23Var) {
        dd6 dd6Var = this.f6960w;
        if (dd6Var != null) {
            dd6Var.m24520k(p23Var);
        } else {
            ne6.m15202a(this.f6954q, new me6() { // from class: com.daaw.sc6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((s23) obj).mo10751r2(p23.this);
                }
            });
        }
    }

    /* renamed from: l */
    public final void m24519l(qs4 qs4Var) {
        this.f6957t.set(qs4Var);
    }

    /* renamed from: m */
    public final void m24518m(zzo zzoVar) {
        this.f6958u.set(zzoVar);
    }

    /* renamed from: s */
    public final void m24517s(zzdg zzdgVar) {
        this.f6959v.set(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        dd6 dd6Var = this.f6960w;
        if (dd6Var != null) {
            dd6Var.zzb();
            return;
        }
        ne6.m15202a(this.f6958u, new me6() { // from class: com.daaw.wc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((zzo) obj).zzb();
            }
        });
        ne6.m15202a(this.f6956s, new me6() { // from class: com.daaw.xc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((w23) obj).zzf();
            }
        });
        ne6.m15202a(this.f6956s, new me6() { // from class: com.daaw.yc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((w23) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbE() {
        dd6 dd6Var = this.f6960w;
        if (dd6Var != null) {
            dd6Var.zzbE();
        } else {
            ne6.m15202a(this.f6958u, new me6() { // from class: com.daaw.qc6
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
        dd6 dd6Var = this.f6960w;
        if (dd6Var != null) {
            dd6Var.zze();
        } else {
            ne6.m15202a(this.f6958u, new me6() { // from class: com.daaw.ad6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((zzo) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i) {
        dd6 dd6Var = this.f6960w;
        if (dd6Var != null) {
            dd6Var.zzf(i);
        } else {
            ne6.m15202a(this.f6958u, new me6() { // from class: com.daaw.pc6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((zzo) obj).zzf(i);
                }
            });
        }
    }

    @Override // com.daaw.qs4
    public final void zzh() {
        dd6 dd6Var = this.f6960w;
        if (dd6Var != null) {
            dd6Var.zzh();
        } else {
            ne6.m15202a(this.f6957t, new me6() { // from class: com.daaw.cd6
                @Override // com.daaw.me6
                public final void zza(Object obj) {
                    ((qs4) obj).zzh();
                }
            });
        }
    }

    public final void zzj() {
        dd6 dd6Var = this.f6960w;
        if (dd6Var != null) {
            dd6Var.zzj();
            return;
        }
        this.f6953p.m26087a();
        ne6.m15202a(this.f6955r, new me6() { // from class: com.daaw.mc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((t23) obj).zze();
            }
        });
        ne6.m15202a(this.f6956s, new me6() { // from class: com.daaw.nc6
            @Override // com.daaw.me6
            public final void zza(Object obj) {
                ((w23) obj).zzc();
            }
        });
    }

    @Override // com.daaw.vy4
    public final void zzq() {
        dd6 dd6Var = this.f6960w;
        if (dd6Var != null) {
            dd6Var.zzq();
        } else {
            ne6.m15202a(this.f6956s, new me6() { // from class: com.daaw.bd6
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
