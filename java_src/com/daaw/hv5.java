package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class hv5 implements xq5 {
    public final Context a;
    public final o95 b;

    public hv5(Context context, o95 o95Var) {
        this.a = context;
        this.b = o95Var;
    }

    @Override // com.daaw.xq5
    public final void a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        try {
            ((dp3) tq5Var.b).N2(th6Var.a0);
            if (fi6Var.a.a.o.a == 3) {
                ((dp3) tq5Var.b).Z1(th6Var.V, th6Var.w.toString(), fi6Var.a.a.d, nt0.g3(this.a), new gv5(this, tq5Var, null), (gn3) tq5Var.c);
            } else {
                ((dp3) tq5Var.b).z1(th6Var.V, th6Var.w.toString(), fi6Var.a.a.d, nt0.g3(this.a), new gv5(this, tq5Var, null), (gn3) tq5Var.c);
            }
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.daaw.xq5
    public final /* bridge */ /* synthetic */ Object b(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        kt5 kt5Var = new kt5(th6Var, (dp3) tq5Var.b, AdFormat.REWARDED);
        k95 b = this.b.b(new rm4(fi6Var, th6Var, tq5Var.a), new l95(kt5Var));
        kt5Var.b(b.b());
        ((ys5) tq5Var.c).h3(b.n());
        return b.k();
    }
}
