package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class qt5 implements xq5 {

    /* renamed from: a */
    public final Context f24321a;

    /* renamed from: b */
    public final s05 f24322b;

    public qt5(Context context, s05 s05Var) {
        this.f24321a = context;
        this.f24322b = s05Var;
    }

    @Override // com.daaw.xq5
    /* renamed from: a */
    public final void mo4813a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        try {
            ((dp3) tq5Var.f27988b).mo10086N2(th6Var.f27681a0);
            ((dp3) tq5Var.f27988b).mo10088E2(th6Var.f27675V, th6Var.f27718w.toString(), fi6Var.f9623a.f5824a.f25344d, nt0.m14830g3(this.f24321a), new pt5(this, tq5Var, null), (gn3) tq5Var.f27989c);
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new wi6(e);
        }
    }

    @Override // com.daaw.xq5
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4812b(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        kt5 kt5Var = new kt5(th6Var, (dp3) tq5Var.f27988b, AdFormat.INTERSTITIAL);
        pz4 mo5263c = this.f24322b.mo5263c(new rm4(fi6Var, th6Var, tq5Var.f27987a), new sz4(kt5Var, null));
        kt5Var.m17435b(mo5263c.mo9318b());
        ((ys5) tq5Var.f27989c).m3331h3(mo5263c.mo8314f());
        return mo5263c.mo9315i();
    }
}
