package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class hv5 implements xq5 {

    /* renamed from: a */
    public final Context f13018a;

    /* renamed from: b */
    public final o95 f13019b;

    public hv5(Context context, o95 o95Var) {
        this.f13018a = context;
        this.f13019b = o95Var;
    }

    @Override // com.daaw.xq5
    /* renamed from: a */
    public final void mo4813a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        try {
            ((dp3) tq5Var.f27988b).mo10086N2(th6Var.f27681a0);
            if (fi6Var.f9623a.f5824a.f25355o.f4840a == 3) {
                ((dp3) tq5Var.f27988b).mo10083Z1(th6Var.f27675V, th6Var.f27718w.toString(), fi6Var.f9623a.f5824a.f25344d, nt0.m14830g3(this.f13018a), new gv5(this, tq5Var, null), (gn3) tq5Var.f27989c);
            } else {
                ((dp3) tq5Var.f27988b).mo10069z1(th6Var.f27675V, th6Var.f27718w.toString(), fi6Var.f9623a.f5824a.f25344d, nt0.m14830g3(this.f13018a), new gv5(this, tq5Var, null), (gn3) tq5Var.f27989c);
            }
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.daaw.xq5
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4812b(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        kt5 kt5Var = new kt5(th6Var, (dp3) tq5Var.f27988b, AdFormat.REWARDED);
        k95 mo14353b = this.f13019b.mo14353b(new rm4(fi6Var, th6Var, tq5Var.f27987a), new l95(kt5Var));
        kt5Var.m17435b(mo14353b.mo9318b());
        ((ys5) tq5Var.f27989c).m3331h3(mo14353b.mo17777n());
        return mo14353b.mo17780k();
    }
}
