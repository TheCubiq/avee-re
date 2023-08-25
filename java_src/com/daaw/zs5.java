package com.daaw;

import com.google.android.gms.internal.ads.zzcdd;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zs5 extends ov3 implements yr4 {
    @GuardedBy("this")
    public pv3 p;
    @GuardedBy("this")
    public xr4 q;
    @GuardedBy("this")
    public gz4 r;

    @Override // com.daaw.pv3
    public final synchronized void B1(yd0 yd0Var) {
        gz4 gz4Var = this.r;
        if (gz4Var != null) {
            Executor c = cw5.c(((aw5) gz4Var).d);
            final fi6 fi6Var = ((aw5) gz4Var).a;
            final th6 th6Var = ((aw5) gz4Var).b;
            final tq5 tq5Var = ((aw5) gz4Var).c;
            final aw5 aw5Var = (aw5) gz4Var;
            c.execute(new Runnable() { // from class: com.daaw.zv5
                @Override // java.lang.Runnable
                public final void run() {
                    aw5 aw5Var2 = aw5.this;
                    fi6 fi6Var2 = fi6Var;
                    th6 th6Var2 = th6Var;
                    tq5 tq5Var2 = tq5Var;
                    cw5 cw5Var = aw5Var2.d;
                    cw5.e(fi6Var2, th6Var2, tq5Var2);
                }
            });
        }
    }

    @Override // com.daaw.pv3
    public final synchronized void D2(yd0 yd0Var) {
        pv3 pv3Var = this.p;
        if (pv3Var != null) {
            ((bw5) pv3Var).r.zze();
        }
    }

    @Override // com.daaw.pv3
    public final synchronized void F1(yd0 yd0Var, zzcdd zzcddVar) {
        pv3 pv3Var = this.p;
        if (pv3Var != null) {
            ((bw5) pv3Var).s.h0(zzcddVar);
        }
    }

    @Override // com.daaw.pv3
    public final synchronized void G(yd0 yd0Var) {
        pv3 pv3Var = this.p;
        if (pv3Var != null) {
            pv3Var.G(yd0Var);
        }
    }

    @Override // com.daaw.yr4
    public final synchronized void I(xr4 xr4Var) {
        this.q = xr4Var;
    }

    @Override // com.daaw.pv3
    public final synchronized void P(yd0 yd0Var) {
        pv3 pv3Var = this.p;
        if (pv3Var != null) {
            ((bw5) pv3Var).r.zzb();
        }
    }

    @Override // com.daaw.pv3
    public final synchronized void a3(yd0 yd0Var) {
        pv3 pv3Var = this.p;
        if (pv3Var != null) {
            ((bw5) pv3Var).s.zzc();
        }
    }

    @Override // com.daaw.pv3
    public final synchronized void c1(yd0 yd0Var, int i) {
        gz4 gz4Var = this.r;
        if (gz4Var != null) {
            k04.zzj("Fail to initialize adapter ".concat(String.valueOf(((aw5) gz4Var).c.a)));
        }
    }

    public final synchronized void h3(pv3 pv3Var) {
        this.p = pv3Var;
    }

    public final synchronized void i3(gz4 gz4Var) {
        this.r = gz4Var;
    }

    @Override // com.daaw.pv3
    public final synchronized void zze(yd0 yd0Var) {
        pv3 pv3Var = this.p;
        if (pv3Var != null) {
            ((bw5) pv3Var).q.onAdClicked();
        }
    }

    @Override // com.daaw.pv3
    public final synchronized void zzg(yd0 yd0Var, int i) {
        xr4 xr4Var = this.q;
        if (xr4Var != null) {
            xr4Var.a(i);
        }
    }

    @Override // com.daaw.pv3
    public final synchronized void zzi(yd0 yd0Var) {
        xr4 xr4Var = this.q;
        if (xr4Var != null) {
            xr4Var.zzd();
        }
    }

    @Override // com.daaw.pv3
    public final synchronized void zzj(yd0 yd0Var) {
        pv3 pv3Var = this.p;
        if (pv3Var != null) {
            ((bw5) pv3Var).p.zzb();
        }
    }
}
