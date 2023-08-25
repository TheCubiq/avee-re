package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class bu5 implements xq5 {

    /* renamed from: a */
    public final Context f5185a;

    /* renamed from: b */
    public final q15 f5186b;

    /* renamed from: c */
    public final Executor f5187c;

    public bu5(Context context, q15 q15Var, Executor executor) {
        this.f5185a = context;
        this.f5186b = q15Var;
        this.f5187c = executor;
    }

    /* renamed from: c */
    public static final boolean m25825c(fi6 fi6Var, int i) {
        return fi6Var.f9623a.f5824a.f25347g.contains(Integer.toString(i));
    }

    @Override // com.daaw.xq5
    /* renamed from: a */
    public final void mo4813a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        ri6 ri6Var = fi6Var.f9623a.f5824a;
        ((oj6) tq5Var.f27988b).m14225u(this.f5185a, fi6Var.f9623a.f5824a.f25344d, th6Var.f27718w.toString(), zzbu.zzl(th6Var.f27715t), (gn3) tq5Var.f27989c, ri6Var.f25349i, ri6Var.f25347g);
    }

    @Override // com.daaw.xq5
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4812b(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        j35 m19152D;
        on3 m14242d = ((oj6) tq5Var.f27988b).m14242d();
        pn3 m14241e = ((oj6) tq5Var.f27988b).m14241e();
        sn3 m14237i = ((oj6) tq5Var.f27988b).m14237i();
        if (m14237i != null && m25825c(fi6Var, 6)) {
            m19152D = j35.m19128a0(m14237i);
        } else if (m14242d != null && m25825c(fi6Var, 6)) {
            m19152D = j35.m19151E(m14242d);
        } else if (m14242d != null && m25825c(fi6Var, 2)) {
            m19152D = j35.m19153C(m14242d);
        } else if (m14241e != null && m25825c(fi6Var, 6)) {
            m19152D = j35.m19150F(m14241e);
        } else if (m14241e == null || !m25825c(fi6Var, 1)) {
            throw new yu5(1, "No native ad mappers");
        } else {
            m19152D = j35.m19152D(m14241e);
        }
        if (fi6Var.f9623a.f5824a.f25347g.contains(Integer.toString(m19152D.m19145K()))) {
            l35 mo12806d = this.f5186b.mo12806d(new rm4(fi6Var, th6Var, tq5Var.f27987a), new v35(m19152D), new p55(m14241e, m14242d, m14237i, null));
            ((ys5) tq5Var.f27989c).m3331h3(mo12806d.mo8313g());
            mo12806d.mo8315c().m17376n0(new eg4((oj6) tq5Var.f27988b), this.f5187c);
            return mo12806d.mo8312h();
        }
        throw new yu5(1, "No corresponding native ad listener");
    }
}
