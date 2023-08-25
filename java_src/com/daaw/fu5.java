package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class fu5 implements xq5 {

    /* renamed from: a */
    public final Context f9977a;

    /* renamed from: b */
    public final q15 f9978b;

    /* renamed from: c */
    public sn3 f9979c;

    /* renamed from: d */
    public final zzchu f9980d;

    public fu5(Context context, q15 q15Var, zzchu zzchuVar) {
        this.f9977a = context;
        this.f9978b = q15Var;
        this.f9980d = zzchuVar;
    }

    @Override // com.daaw.xq5
    /* renamed from: a */
    public final void mo4813a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        try {
            ((dp3) tq5Var.f27988b).mo10086N2(th6Var.f27681a0);
            if (this.f9980d.f36995r < ((Integer) zzba.zzc().m23658b(g93.f10876x1)).intValue()) {
                ((dp3) tq5Var.f27988b).mo10070y2(th6Var.f27675V, th6Var.f27718w.toString(), fi6Var.f9623a.f5824a.f25344d, nt0.m14830g3(this.f9977a), new eu5(this, tq5Var, null), (gn3) tq5Var.f27989c);
            } else {
                ((dp3) tq5Var.f27988b).mo10082b1(th6Var.f27675V, th6Var.f27718w.toString(), fi6Var.f9623a.f5824a.f25344d, nt0.m14830g3(this.f9977a), new eu5(this, tq5Var, null), (gn3) tq5Var.f27989c, fi6Var.f9623a.f5824a.f25349i);
            }
        } catch (RemoteException e) {
            throw new wi6(e);
        }
    }

    @Override // com.daaw.xq5
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4812b(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        if (fi6Var.f9623a.f5824a.f25347g.contains(Integer.toString(6))) {
            j35 m19128a0 = j35.m19128a0(this.f9979c);
            if (fi6Var.f9623a.f5824a.f25347g.contains(Integer.toString(m19128a0.m19145K()))) {
                l35 mo12806d = this.f9978b.mo12806d(new rm4(fi6Var, th6Var, tq5Var.f27987a), new v35(m19128a0), new p55(null, null, this.f9979c, null));
                ((ys5) tq5Var.f27989c).m3331h3(mo12806d.mo8314f());
                return mo12806d.mo8312h();
            }
            throw new yu5(1, "No corresponding native ad listener");
        }
        throw new yu5(2, "Unified must be used for RTB.");
    }
}
