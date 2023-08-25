package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class cw5 implements xq5 {
    public final Context a;
    public final Executor b;
    public final o95 c;

    public cw5(Context context, Executor executor, o95 o95Var) {
        this.a = context;
        this.b = executor;
        this.c = o95Var;
    }

    public static /* bridge */ /* synthetic */ Executor c(cw5 cw5Var) {
        return cw5Var.b;
    }

    public static final void e(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        try {
            ((oj6) tq5Var.b).p(fi6Var.a.a.d, th6Var.w.toString());
        } catch (Exception e) {
            k04.zzk("Fail to load ad from adapter ".concat(String.valueOf(tq5Var.a)), e);
        }
    }

    @Override // com.daaw.xq5
    public final void a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        if (((oj6) tq5Var.b).c()) {
            e(fi6Var, th6Var, tq5Var);
            return;
        }
        ((zs5) tq5Var.c).i3(new aw5(this, fi6Var, th6Var, tq5Var));
        ((oj6) tq5Var.b).m(this.a, fi6Var.a.a.d, null, (pv3) tq5Var.c, th6Var.w.toString());
    }

    @Override // com.daaw.xq5
    public final /* bridge */ /* synthetic */ Object b(fi6 fi6Var, th6 th6Var, final tq5 tq5Var) {
        k95 b = this.c.b(new rm4(fi6Var, th6Var, tq5Var.a), new l95(new c15() { // from class: com.daaw.yv5
            @Override // com.daaw.c15
            public final void a(boolean z, Context context, br4 br4Var) {
                tq5 tq5Var2 = tq5.this;
                try {
                    ((oj6) tq5Var2.b).A(z);
                    ((oj6) tq5Var2.b).a();
                } catch (wi6 e) {
                    k04.zzk("Cannot show rewarded video.", e);
                    throw new b15(e.getCause());
                }
            }
        }));
        b.c().n0(new eg4((oj6) tq5Var.b), this.b);
        vr4 d = b.d();
        jq4 a = b.a();
        ((zs5) tq5Var.c).h3(new bw5(this, b.h(), a, d, b.i()));
        return b.k();
    }
}
