package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class fu5 implements xq5 {
    public final Context a;
    public final q15 b;
    public sn3 c;
    public final zzchu d;

    public fu5(Context context, q15 q15Var, zzchu zzchuVar) {
        this.a = context;
        this.b = q15Var;
        this.d = zzchuVar;
    }

    @Override // com.daaw.xq5
    public final void a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        try {
            ((dp3) tq5Var.b).N2(th6Var.a0);
            if (this.d.r < ((Integer) zzba.zzc().b(g93.x1)).intValue()) {
                ((dp3) tq5Var.b).y2(th6Var.V, th6Var.w.toString(), fi6Var.a.a.d, nt0.g3(this.a), new eu5(this, tq5Var, null), (gn3) tq5Var.c);
            } else {
                ((dp3) tq5Var.b).b1(th6Var.V, th6Var.w.toString(), fi6Var.a.a.d, nt0.g3(this.a), new eu5(this, tq5Var, null), (gn3) tq5Var.c, fi6Var.a.a.i);
            }
        } catch (RemoteException e) {
            throw new wi6(e);
        }
    }

    @Override // com.daaw.xq5
    public final /* bridge */ /* synthetic */ Object b(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        if (fi6Var.a.a.g.contains(Integer.toString(6))) {
            j35 a0 = j35.a0(this.c);
            if (fi6Var.a.a.g.contains(Integer.toString(a0.K()))) {
                l35 d = this.b.d(new rm4(fi6Var, th6Var, tq5Var.a), new v35(a0), new p55(null, null, this.c, null));
                ((ys5) tq5Var.c).h3(d.f());
                return d.h();
            }
            throw new yu5(1, "No corresponding native ad listener");
        }
        throw new yu5(2, "Unified must be used for RTB.");
    }
}
