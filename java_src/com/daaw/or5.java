package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class or5 implements xq5 {
    public final Context a;
    public final ji4 b;
    public final Executor c;

    public or5(Context context, ji4 ji4Var, Executor executor) {
        this.a = context;
        this.b = ji4Var;
        this.c = executor;
    }

    @Override // com.daaw.xq5
    public final void a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        ((oj6) tq5Var.b).q(this.a, fi6Var.a.a.d, th6Var.w.toString(), (gn3) tq5Var.c);
    }

    @Override // com.daaw.xq5
    public final /* bridge */ /* synthetic */ Object b(fi6 fi6Var, th6 th6Var, final tq5 tq5Var) {
        gi4 a = this.b.a(new rm4(fi6Var, th6Var, tq5Var.a), new sz4(new c15() { // from class: com.daaw.nr5
            @Override // com.daaw.c15
            public final void a(boolean z, Context context, br4 br4Var) {
                tq5 tq5Var2 = tq5.this;
                try {
                    ((oj6) tq5Var2.b).A(z);
                    ((oj6) tq5Var2.b).B(context);
                } catch (wi6 e) {
                    throw new b15(e.getCause());
                }
            }
        }, null), new hi4(th6Var.b0));
        a.c().n0(new eg4((oj6) tq5Var.b), this.c);
        ((ys5) tq5Var.c).h3(a.g());
        return a.h();
    }
}
