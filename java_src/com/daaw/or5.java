package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class or5 implements xq5 {

    /* renamed from: a */
    public final Context f21905a;

    /* renamed from: b */
    public final ji4 f21906b;

    /* renamed from: c */
    public final Executor f21907c;

    public or5(Context context, ji4 ji4Var, Executor executor) {
        this.f21905a = context;
        this.f21906b = ji4Var;
        this.f21907c = executor;
    }

    @Override // com.daaw.xq5
    /* renamed from: a */
    public final void mo4813a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        ((oj6) tq5Var.f27988b).m14229q(this.f21905a, fi6Var.f9623a.f5824a.f25344d, th6Var.f27718w.toString(), (gn3) tq5Var.f27989c);
    }

    @Override // com.daaw.xq5
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4812b(fi6 fi6Var, th6 th6Var, final tq5 tq5Var) {
        gi4 mo18490a = this.f21906b.mo18490a(new rm4(fi6Var, th6Var, tq5Var.f27987a), new sz4(new c15() { // from class: com.daaw.nr5
            @Override // com.daaw.c15
            /* renamed from: a */
            public final void mo3165a(boolean z, Context context, br4 br4Var) {
                tq5 tq5Var2 = tq5.this;
                try {
                    ((oj6) tq5Var2.f27988b).m14250A(z);
                    ((oj6) tq5Var2.f27988b).m14249B(context);
                } catch (wi6 e) {
                    throw new b15(e.getCause());
                }
            }
        }, null), new hi4(th6Var.f27683b0));
        mo18490a.mo8315c().m17376n0(new eg4((oj6) tq5Var.f27988b), this.f21907c);
        ((ys5) tq5Var.f27989c).m3331h3(mo18490a.mo8313g());
        return mo18490a.mo21573h();
    }
}
