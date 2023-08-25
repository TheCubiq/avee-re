package com.daaw;

import java.util.Iterator;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ae6 implements cf6 {
    public rp4 a;
    public final Executor b = m77.b();

    @Override // com.daaw.cf6
    public final /* bridge */ /* synthetic */ f77 a(df6 df6Var, ye6 ye6Var, Object obj) {
        return c(df6Var, ye6Var, null);
    }

    public final rp4 b() {
        return this.a;
    }

    public final f77 c(df6 df6Var, ye6 ye6Var, rp4 rp4Var) {
        qp4 a = ye6Var.a(df6Var.b);
        a.j(new if6(true));
        rp4 rp4Var2 = (rp4) a.zzh();
        this.a = rp4Var2;
        final jn4 zzb = rp4Var2.zzb();
        final qk6 qk6Var = new qk6();
        return s67.m(s67.n(j67.D(zzb.j()), new w57() { // from class: com.daaw.vd6
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                qk6 qk6Var2 = qk6Var;
                jn4 jn4Var = zzb;
                fi6 fi6Var = (fi6) obj;
                qk6Var2.b = fi6Var;
                Iterator it = fi6Var.b.a.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : ((th6) it.next()).a) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return jn4Var.i(s67.i(fi6Var));
                    }
                }
                return s67.i(null);
            }
        }, this.b), new ey6() { // from class: com.daaw.zd6
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                qk6 qk6Var2 = qk6.this;
                qk6Var2.c = (zl4) obj;
                return qk6Var2;
            }
        }, this.b);
    }

    @Override // com.daaw.cf6
    public final /* synthetic */ Object zzd() {
        return this.a;
    }
}
