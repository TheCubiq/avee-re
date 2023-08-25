package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class sr5 implements xq5 {

    /* renamed from: a */
    public final Context f26572a;

    /* renamed from: b */
    public final ji4 f26573b;

    public sr5(Context context, ji4 ji4Var) {
        this.f26572a = context;
        this.f26573b = ji4Var;
    }

    @Override // com.daaw.xq5
    /* renamed from: a */
    public final void mo4813a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        try {
            ((dp3) tq5Var.f27988b).mo10086N2(th6Var.f27681a0);
            ((dp3) tq5Var.f27988b).mo10085Q(th6Var.f27675V, th6Var.f27718w.toString(), fi6Var.f9623a.f5824a.f25344d, nt0.m14830g3(this.f26572a), new rr5(tq5Var, null), (gn3) tq5Var.f27989c);
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new wi6(e);
        }
    }

    @Override // com.daaw.xq5
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4812b(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        kt5 kt5Var = new kt5(th6Var, (dp3) tq5Var.f27988b, AdFormat.APP_OPEN_AD);
        gi4 mo18490a = this.f26573b.mo18490a(new rm4(fi6Var, th6Var, tq5Var.f27987a), new sz4(kt5Var, null), new hi4(th6Var.f27683b0));
        kt5Var.m17435b(mo18490a.mo9318b());
        ((ys5) tq5Var.f27989c).m3331h3(mo18490a.mo8314f());
        return mo18490a.mo21573h();
    }
}
