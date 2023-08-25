package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public final class ns5 implements xq5 {

    /* renamed from: a */
    public final Context f20616a;

    /* renamed from: b */
    public final zj4 f20617b;

    /* renamed from: c */
    public View f20618c;

    /* renamed from: d */
    public mn3 f20619d;

    public ns5(Context context, zj4 zj4Var) {
        this.f20616a = context;
        this.f20617b = zj4Var;
    }

    @Override // com.daaw.xq5
    /* renamed from: a */
    public final void mo4813a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        try {
            ((dp3) tq5Var.f27988b).mo10086N2(th6Var.f27681a0);
            if (((Boolean) zzba.zzc().m23658b(g93.f10618Z6)).booleanValue() && th6Var.f27697i0) {
                ((dp3) tq5Var.f27988b).mo10081c3(th6Var.f27675V, th6Var.f27718w.toString(), fi6Var.f9623a.f5824a.f25344d, nt0.m14830g3(this.f20616a), new ms5(this, tq5Var, null), (gn3) tq5Var.f27989c, fi6Var.f9623a.f5824a.f25345e);
            } else {
                ((dp3) tq5Var.f27988b).mo10071s1(th6Var.f27675V, th6Var.f27718w.toString(), fi6Var.f9623a.f5824a.f25344d, nt0.m14830g3(this.f20616a), new ms5(this, tq5Var, null), (gn3) tq5Var.f27989c, fi6Var.f9623a.f5824a.f25345e);
            }
        } catch (RemoteException e) {
            throw new wi6(e);
        }
    }

    @Override // com.daaw.xq5
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4812b(fi6 fi6Var, final th6 th6Var, final tq5 tq5Var) {
        final View view;
        if (((Boolean) zzba.zzc().m23658b(g93.f10618Z6)).booleanValue() && th6Var.f27697i0) {
            try {
                view = (View) nt0.m14831M(this.f20619d.zze());
                boolean zzf = this.f20619d.zzf();
                if (view == null) {
                    throw new wi6(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) s67.m10629n(s67.m10634i(null), new w57() { // from class: com.daaw.js5
                            @Override // com.daaw.w57
                            public final f77 zza(Object obj) {
                                return ns5.this.m14846c(view, th6Var, obj);
                            }
                        }, z04.f34309e).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new wi6(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new wi6(e2);
            }
        } else {
            view = this.f20618c;
        }
        aj4 mo2202a = this.f20617b.mo2202a(new rm4(fi6Var, th6Var, tq5Var.f27987a), new gj4(view, null, new xl4() { // from class: com.daaw.ks5
            @Override // com.daaw.xl4
            public final zzdq zza() {
                try {
                    return ((dp3) tq5.this.f27988b).zze();
                } catch (RemoteException e3) {
                    throw new wi6(e3);
                }
            }
        }, (uh6) th6Var.f27717v.get(0)));
        mo2202a.mo9370i().m14720C0(view);
        ((ys5) tq5Var.f27989c).m3331h3(mo2202a.mo8314f());
        return mo2202a.mo9371h();
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m14846c(View view, th6 th6Var, Object obj) {
        return s67.m10634i(qk4.m12363a(this.f20616a, view, th6Var));
    }
}
