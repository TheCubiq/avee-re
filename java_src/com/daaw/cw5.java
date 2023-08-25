package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class cw5 implements xq5 {

    /* renamed from: a */
    public final Context f6228a;

    /* renamed from: b */
    public final Executor f6229b;

    /* renamed from: c */
    public final o95 f6230c;

    public cw5(Context context, Executor executor, o95 o95Var) {
        this.f6228a = context;
        this.f6229b = executor;
        this.f6230c = o95Var;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ Executor m24945c(cw5 cw5Var) {
        return cw5Var.f6229b;
    }

    /* renamed from: e */
    public static final void m24943e(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        try {
            ((oj6) tq5Var.f27988b).m14230p(fi6Var.f9623a.f5824a.f25344d, th6Var.f27718w.toString());
        } catch (Exception e) {
            k04.zzk("Fail to load ad from adapter ".concat(String.valueOf(tq5Var.f27987a)), e);
        }
    }

    @Override // com.daaw.xq5
    /* renamed from: a */
    public final void mo4813a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        if (((oj6) tq5Var.f27988b).m14243c()) {
            m24943e(fi6Var, th6Var, tq5Var);
            return;
        }
        ((zs5) tq5Var.f27989c).m1926i3(new aw5(this, fi6Var, th6Var, tq5Var));
        ((oj6) tq5Var.f27988b).m14233m(this.f6228a, fi6Var.f9623a.f5824a.f25344d, null, (pv3) tq5Var.f27989c, th6Var.f27718w.toString());
    }

    @Override // com.daaw.xq5
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4812b(fi6 fi6Var, th6 th6Var, final tq5 tq5Var) {
        k95 mo14353b = this.f6230c.mo14353b(new rm4(fi6Var, th6Var, tq5Var.f27987a), new l95(new c15() { // from class: com.daaw.yv5
            @Override // com.daaw.c15
            /* renamed from: a */
            public final void mo3165a(boolean z, Context context, br4 br4Var) {
                tq5 tq5Var2 = tq5.this;
                try {
                    ((oj6) tq5Var2.f27988b).m14250A(z);
                    ((oj6) tq5Var2.f27988b).m14245a();
                } catch (wi6 e) {
                    k04.zzk("Cannot show rewarded video.", e);
                    throw new b15(e.getCause());
                }
            }
        }));
        mo14353b.mo8315c().m17376n0(new eg4((oj6) tq5Var.f27988b), this.f6229b);
        vr4 mo17784d = mo14353b.mo17784d();
        jq4 mo9319a = mo14353b.mo9319a();
        ((zs5) tq5Var.f27989c).m1927h3(new bw5(this, mo14353b.mo17783h(), mo9319a, mo17784d, mo14353b.mo17782i()));
        return mo14353b.mo17780k();
    }
}
