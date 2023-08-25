package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzas;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class as5 implements qq5 {
    public final zj4 a;
    public final Context b;
    public final ia5 c;
    public final ri6 d;
    public final Executor e;
    public final ey6 f;

    public as5(zj4 zj4Var, Context context, Executor executor, ia5 ia5Var, ri6 ri6Var, ey6 ey6Var) {
        this.b = context;
        this.a = zj4Var;
        this.e = executor;
        this.c = ia5Var;
        this.d = ri6Var;
        this.f = ey6Var;
    }

    @Override // com.daaw.qq5
    public final boolean a(fi6 fi6Var, th6 th6Var) {
        yh6 yh6Var = th6Var.t;
        return (yh6Var == null || yh6Var.a == null) ? false : true;
    }

    @Override // com.daaw.qq5
    public final f77 b(final fi6 fi6Var, final th6 th6Var) {
        return s67.n(s67.i(null), new w57() { // from class: com.daaw.ur5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return as5.this.c(fi6Var, th6Var, obj);
            }
        }, this.e);
    }

    public final /* synthetic */ f77 c(fi6 fi6Var, th6 th6Var, Object obj) {
        View la5Var;
        zzq a = vi6.a(this.b, th6Var.v);
        final a74 a2 = this.c.a(a, th6Var, fi6Var.b.b);
        a2.X(th6Var.X);
        if (((Boolean) zzba.zzc().b(g93.Z6)).booleanValue() && th6Var.i0) {
            la5Var = qk4.a(this.b, (View) a2, th6Var);
        } else {
            la5Var = new la5(this.b, (View) a2, (zzas) this.f.apply(th6Var));
        }
        final aj4 a3 = this.a.a(new rm4(fi6Var, th6Var, null), new gj4(la5Var, a2, new xl4() { // from class: com.daaw.vr5
            @Override // com.daaw.xl4
            public final zzdq zza() {
                return a74.this.zzs();
            }
        }, vi6.c(a)));
        a3.j().i(a2, false, null);
        gr4 b = a3.b();
        ir4 ir4Var = new ir4() { // from class: com.daaw.wr5
            @Override // com.daaw.ir4
            public final void zzl() {
                a74 a74Var = a74.this;
                if (a74Var.zzP() != null) {
                    a74Var.zzP().zzp();
                }
            }
        };
        g77 g77Var = z04.f;
        b.n0(ir4Var, g77Var);
        a3.j();
        yh6 yh6Var = th6Var.t;
        f77 j = ha5.j(a2, yh6Var.b, yh6Var.a);
        if (th6Var.N) {
            j.f(new Runnable() { // from class: com.daaw.xr5
                @Override // java.lang.Runnable
                public final void run() {
                    a74.this.C();
                }
            }, this.e);
        }
        j.f(new Runnable() { // from class: com.daaw.yr5
            @Override // java.lang.Runnable
            public final void run() {
                as5.this.d(a2);
            }
        }, this.e);
        return s67.m(j, new ey6() { // from class: com.daaw.zr5
            @Override // com.daaw.ey6
            public final Object apply(Object obj2) {
                return aj4.this.h();
            }
        }, g77Var);
    }

    public final /* synthetic */ void d(a74 a74Var) {
        a74Var.v0();
        z74 zzs = a74Var.zzs();
        zzfl zzflVar = this.d.a;
        if (zzflVar == null || zzs == null) {
            return;
        }
        zzs.j3(zzflVar);
    }
}
