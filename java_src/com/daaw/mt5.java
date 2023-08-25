package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class mt5 implements xq5 {
    public final Context a;
    public final s05 b;
    public final zzchu c;
    public final Executor d;

    public mt5(Context context, zzchu zzchuVar, s05 s05Var, Executor executor) {
        this.a = context;
        this.c = zzchuVar;
        this.b = s05Var;
        this.d = executor;
    }

    @Override // com.daaw.xq5
    public final void a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        ((oj6) tq5Var.b).t(this.a, fi6Var.a.a.d, th6Var.w.toString(), zzbu.zzl(th6Var.t), (gn3) tq5Var.c);
    }

    @Override // com.daaw.xq5
    public final /* bridge */ /* synthetic */ Object b(fi6 fi6Var, th6 th6Var, final tq5 tq5Var) {
        pz4 c = this.b.c(new rm4(fi6Var, th6Var, tq5Var.a), new sz4(new c15() { // from class: com.daaw.lt5
            @Override // com.daaw.c15
            public final void a(boolean z, Context context, br4 br4Var) {
                mt5.this.c(tq5Var, z, context, br4Var);
            }
        }, null));
        c.c().n0(new eg4((oj6) tq5Var.b), this.d);
        ((ys5) tq5Var.c).h3(c.g());
        return c.i();
    }

    public final /* synthetic */ void c(tq5 tq5Var, boolean z, Context context, br4 br4Var) {
        try {
            ((oj6) tq5Var.b).A(z);
            if (this.c.r < ((Integer) zzba.zzc().b(g93.B0)).intValue()) {
                ((oj6) tq5Var.b).C();
            } else {
                ((oj6) tq5Var.b).D(context);
            }
        } catch (wi6 e) {
            k04.zzi("Cannot show interstitial.");
            throw new b15(e.getCause());
        }
    }
}
