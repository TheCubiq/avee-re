package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class dv5 implements xq5 {
    public final Context a;
    public final Executor b;
    public final o95 c;

    public dv5(Context context, Executor executor, o95 o95Var) {
        this.a = context;
        this.b = executor;
        this.c = o95Var;
    }

    @Override // com.daaw.xq5
    public final void a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        try {
            ri6 ri6Var = fi6Var.a.a;
            if (ri6Var.o.a == 3) {
                ((oj6) tq5Var.b).w(this.a, ri6Var.d, th6Var.w.toString(), (gn3) tq5Var.c);
            } else {
                ((oj6) tq5Var.b).v(this.a, ri6Var.d, th6Var.w.toString(), (gn3) tq5Var.c);
            }
        } catch (Exception e) {
            k04.zzk("Fail to load ad from adapter ".concat(String.valueOf(tq5Var.a)), e);
        }
    }

    @Override // com.daaw.xq5
    public final /* bridge */ /* synthetic */ Object b(fi6 fi6Var, th6 th6Var, final tq5 tq5Var) {
        k95 b = this.c.b(new rm4(fi6Var, th6Var, tq5Var.a), new l95(new c15() { // from class: com.daaw.cv5
            @Override // com.daaw.c15
            public final void a(boolean z, Context context, br4 br4Var) {
                tq5 tq5Var2 = tq5.this;
                try {
                    ((oj6) tq5Var2.b).A(z);
                    ((oj6) tq5Var2.b).E(context);
                } catch (wi6 e) {
                    throw new b15(e.getCause());
                }
            }
        }));
        b.c().n0(new eg4((oj6) tq5Var.b), this.b);
        ((ys5) tq5Var.c).h3(b.m());
        return b.k();
    }
}
