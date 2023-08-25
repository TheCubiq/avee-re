package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class dv5 implements xq5 {

    /* renamed from: a */
    public final Context f7900a;

    /* renamed from: b */
    public final Executor f7901b;

    /* renamed from: c */
    public final o95 f7902c;

    public dv5(Context context, Executor executor, o95 o95Var) {
        this.f7900a = context;
        this.f7901b = executor;
        this.f7902c = o95Var;
    }

    @Override // com.daaw.xq5
    /* renamed from: a */
    public final void mo4813a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        try {
            ri6 ri6Var = fi6Var.f9623a.f5824a;
            if (ri6Var.f25355o.f4840a == 3) {
                ((oj6) tq5Var.f27988b).m14223w(this.f7900a, ri6Var.f25344d, th6Var.f27718w.toString(), (gn3) tq5Var.f27989c);
            } else {
                ((oj6) tq5Var.f27988b).m14224v(this.f7900a, ri6Var.f25344d, th6Var.f27718w.toString(), (gn3) tq5Var.f27989c);
            }
        } catch (Exception e) {
            k04.zzk("Fail to load ad from adapter ".concat(String.valueOf(tq5Var.f27987a)), e);
        }
    }

    @Override // com.daaw.xq5
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4812b(fi6 fi6Var, th6 th6Var, final tq5 tq5Var) {
        k95 mo14353b = this.f7902c.mo14353b(new rm4(fi6Var, th6Var, tq5Var.f27987a), new l95(new c15() { // from class: com.daaw.cv5
            @Override // com.daaw.c15
            /* renamed from: a */
            public final void mo3165a(boolean z, Context context, br4 br4Var) {
                tq5 tq5Var2 = tq5.this;
                try {
                    ((oj6) tq5Var2.f27988b).m14250A(z);
                    ((oj6) tq5Var2.f27988b).m14246E(context);
                } catch (wi6 e) {
                    throw new b15(e.getCause());
                }
            }
        }));
        mo14353b.mo8315c().m17376n0(new eg4((oj6) tq5Var.f27988b), this.f7901b);
        ((ys5) tq5Var.f27989c).m3331h3(mo14353b.mo17778m());
        return mo14353b.mo17780k();
    }
}
