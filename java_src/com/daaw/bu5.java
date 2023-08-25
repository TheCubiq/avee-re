package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class bu5 implements xq5 {
    public final Context a;
    public final q15 b;
    public final Executor c;

    public bu5(Context context, q15 q15Var, Executor executor) {
        this.a = context;
        this.b = q15Var;
        this.c = executor;
    }

    public static final boolean c(fi6 fi6Var, int i) {
        return fi6Var.a.a.g.contains(Integer.toString(i));
    }

    @Override // com.daaw.xq5
    public final void a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        ri6 ri6Var = fi6Var.a.a;
        ((oj6) tq5Var.b).u(this.a, fi6Var.a.a.d, th6Var.w.toString(), zzbu.zzl(th6Var.t), (gn3) tq5Var.c, ri6Var.i, ri6Var.g);
    }

    @Override // com.daaw.xq5
    public final /* bridge */ /* synthetic */ Object b(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        j35 D;
        on3 d = ((oj6) tq5Var.b).d();
        pn3 e = ((oj6) tq5Var.b).e();
        sn3 i = ((oj6) tq5Var.b).i();
        if (i != null && c(fi6Var, 6)) {
            D = j35.a0(i);
        } else if (d != null && c(fi6Var, 6)) {
            D = j35.E(d);
        } else if (d != null && c(fi6Var, 2)) {
            D = j35.C(d);
        } else if (e != null && c(fi6Var, 6)) {
            D = j35.F(e);
        } else if (e == null || !c(fi6Var, 1)) {
            throw new yu5(1, "No native ad mappers");
        } else {
            D = j35.D(e);
        }
        if (fi6Var.a.a.g.contains(Integer.toString(D.K()))) {
            l35 d2 = this.b.d(new rm4(fi6Var, th6Var, tq5Var.a), new v35(D), new p55(e, d, i, null));
            ((ys5) tq5Var.c).h3(d2.g());
            d2.c().n0(new eg4((oj6) tq5Var.b), this.c);
            return d2.h();
        }
        throw new yu5(1, "No corresponding native ad listener");
    }
}
