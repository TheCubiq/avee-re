package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class sr5 implements xq5 {
    public final Context a;
    public final ji4 b;

    public sr5(Context context, ji4 ji4Var) {
        this.a = context;
        this.b = ji4Var;
    }

    @Override // com.daaw.xq5
    public final void a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        try {
            ((dp3) tq5Var.b).N2(th6Var.a0);
            ((dp3) tq5Var.b).Q(th6Var.V, th6Var.w.toString(), fi6Var.a.a.d, nt0.g3(this.a), new rr5(tq5Var, null), (gn3) tq5Var.c);
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new wi6(e);
        }
    }

    @Override // com.daaw.xq5
    public final /* bridge */ /* synthetic */ Object b(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        kt5 kt5Var = new kt5(th6Var, (dp3) tq5Var.b, AdFormat.APP_OPEN_AD);
        gi4 a = this.b.a(new rm4(fi6Var, th6Var, tq5Var.a), new sz4(kt5Var, null), new hi4(th6Var.b0));
        kt5Var.b(a.b());
        ((ys5) tq5Var.c).h3(a.f());
        return a.h();
    }
}
