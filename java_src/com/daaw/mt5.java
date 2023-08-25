package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class mt5 implements xq5 {

    /* renamed from: a */
    public final Context f19144a;

    /* renamed from: b */
    public final s05 f19145b;

    /* renamed from: c */
    public final zzchu f19146c;

    /* renamed from: d */
    public final Executor f19147d;

    public mt5(Context context, zzchu zzchuVar, s05 s05Var, Executor executor) {
        this.f19144a = context;
        this.f19146c = zzchuVar;
        this.f19145b = s05Var;
        this.f19147d = executor;
    }

    @Override // com.daaw.xq5
    /* renamed from: a */
    public final void mo4813a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        ((oj6) tq5Var.f27988b).m14226t(this.f19144a, fi6Var.f9623a.f5824a.f25344d, th6Var.f27718w.toString(), zzbu.zzl(th6Var.f27715t), (gn3) tq5Var.f27989c);
    }

    @Override // com.daaw.xq5
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4812b(fi6 fi6Var, th6 th6Var, final tq5 tq5Var) {
        pz4 mo5263c = this.f19145b.mo5263c(new rm4(fi6Var, th6Var, tq5Var.f27987a), new sz4(new c15() { // from class: com.daaw.lt5
            @Override // com.daaw.c15
            /* renamed from: a */
            public final void mo3165a(boolean z, Context context, br4 br4Var) {
                mt5.this.m15774c(tq5Var, z, context, br4Var);
            }
        }, null));
        mo5263c.mo8315c().m17376n0(new eg4((oj6) tq5Var.f27988b), this.f19147d);
        ((ys5) tq5Var.f27989c).m3331h3(mo5263c.mo8313g());
        return mo5263c.mo9315i();
    }

    /* renamed from: c */
    public final /* synthetic */ void m15774c(tq5 tq5Var, boolean z, Context context, br4 br4Var) {
        try {
            ((oj6) tq5Var.f27988b).m14250A(z);
            if (this.f19146c.f36995r < ((Integer) zzba.zzc().m23658b(g93.f10371B0)).intValue()) {
                ((oj6) tq5Var.f27988b).m14248C();
            } else {
                ((oj6) tq5Var.f27988b).m14247D(context);
            }
        } catch (wi6 e) {
            k04.zzi("Cannot show interstitial.");
            throw new b15(e.getCause());
        }
    }
}
