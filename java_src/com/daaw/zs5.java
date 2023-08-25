package com.daaw;

import com.google.android.gms.internal.ads.zzcdd;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zs5 extends ov3 implements yr4 {
    @GuardedBy("this")

    /* renamed from: p */
    public pv3 f35460p;
    @GuardedBy("this")

    /* renamed from: q */
    public xr4 f35461q;
    @GuardedBy("this")

    /* renamed from: r */
    public gz4 f35462r;

    @Override // com.daaw.pv3
    /* renamed from: B1 */
    public final synchronized void mo1935B1(yd0 yd0Var) {
        gz4 gz4Var = this.f35462r;
        if (gz4Var != null) {
            Executor m24945c = cw5.m24945c(((aw5) gz4Var).f4067d);
            final fi6 fi6Var = ((aw5) gz4Var).f4064a;
            final th6 th6Var = ((aw5) gz4Var).f4065b;
            final tq5 tq5Var = ((aw5) gz4Var).f4066c;
            final aw5 aw5Var = (aw5) gz4Var;
            m24945c.execute(new Runnable() { // from class: com.daaw.zv5
                @Override // java.lang.Runnable
                public final void run() {
                    aw5 aw5Var2 = aw5.this;
                    fi6 fi6Var2 = fi6Var;
                    th6 th6Var2 = th6Var;
                    tq5 tq5Var2 = tq5Var;
                    cw5 cw5Var = aw5Var2.f4067d;
                    cw5.m24943e(fi6Var2, th6Var2, tq5Var2);
                }
            });
        }
    }

    @Override // com.daaw.pv3
    /* renamed from: D2 */
    public final synchronized void mo1934D2(yd0 yd0Var) {
        pv3 pv3Var = this.f35460p;
        if (pv3Var != null) {
            ((bw5) pv3Var).f5232r.zze();
        }
    }

    @Override // com.daaw.pv3
    /* renamed from: F1 */
    public final synchronized void mo1933F1(yd0 yd0Var, zzcdd zzcddVar) {
        pv3 pv3Var = this.f35460p;
        if (pv3Var != null) {
            ((bw5) pv3Var).f5233s.mo14271h0(zzcddVar);
        }
    }

    @Override // com.daaw.pv3
    /* renamed from: G */
    public final synchronized void mo1932G(yd0 yd0Var) {
        pv3 pv3Var = this.f35460p;
        if (pv3Var != null) {
            pv3Var.mo1932G(yd0Var);
        }
    }

    @Override // com.daaw.yr4
    /* renamed from: I */
    public final synchronized void mo1931I(xr4 xr4Var) {
        this.f35461q = xr4Var;
    }

    @Override // com.daaw.pv3
    /* renamed from: P */
    public final synchronized void mo1930P(yd0 yd0Var) {
        pv3 pv3Var = this.f35460p;
        if (pv3Var != null) {
            ((bw5) pv3Var).f5232r.zzb();
        }
    }

    @Override // com.daaw.pv3
    /* renamed from: a3 */
    public final synchronized void mo1929a3(yd0 yd0Var) {
        pv3 pv3Var = this.f35460p;
        if (pv3Var != null) {
            ((bw5) pv3Var).f5233s.zzc();
        }
    }

    @Override // com.daaw.pv3
    /* renamed from: c1 */
    public final synchronized void mo1928c1(yd0 yd0Var, int i) {
        gz4 gz4Var = this.f35462r;
        if (gz4Var != null) {
            k04.zzj("Fail to initialize adapter ".concat(String.valueOf(((aw5) gz4Var).f4066c.f27987a)));
        }
    }

    /* renamed from: h3 */
    public final synchronized void m1927h3(pv3 pv3Var) {
        this.f35460p = pv3Var;
    }

    /* renamed from: i3 */
    public final synchronized void m1926i3(gz4 gz4Var) {
        this.f35462r = gz4Var;
    }

    @Override // com.daaw.pv3
    public final synchronized void zze(yd0 yd0Var) {
        pv3 pv3Var = this.f35460p;
        if (pv3Var != null) {
            ((bw5) pv3Var).f5231q.onAdClicked();
        }
    }

    @Override // com.daaw.pv3
    public final synchronized void zzg(yd0 yd0Var, int i) {
        xr4 xr4Var = this.f35461q;
        if (xr4Var != null) {
            xr4Var.mo4786a(i);
        }
    }

    @Override // com.daaw.pv3
    public final synchronized void zzi(yd0 yd0Var) {
        xr4 xr4Var = this.f35461q;
        if (xr4Var != null) {
            xr4Var.zzd();
        }
    }

    @Override // com.daaw.pv3
    public final synchronized void zzj(yd0 yd0Var) {
        pv3 pv3Var = this.f35460p;
        if (pv3Var != null) {
            ((bw5) pv3Var).f5230p.zzb();
        }
    }
}
