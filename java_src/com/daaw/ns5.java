package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public final class ns5 implements xq5 {
    public final Context a;
    public final zj4 b;
    public View c;
    public mn3 d;

    public ns5(Context context, zj4 zj4Var) {
        this.a = context;
        this.b = zj4Var;
    }

    @Override // com.daaw.xq5
    public final void a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        try {
            ((dp3) tq5Var.b).N2(th6Var.a0);
            if (((Boolean) zzba.zzc().b(g93.Z6)).booleanValue() && th6Var.i0) {
                ((dp3) tq5Var.b).c3(th6Var.V, th6Var.w.toString(), fi6Var.a.a.d, nt0.g3(this.a), new ms5(this, tq5Var, null), (gn3) tq5Var.c, fi6Var.a.a.e);
            } else {
                ((dp3) tq5Var.b).s1(th6Var.V, th6Var.w.toString(), fi6Var.a.a.d, nt0.g3(this.a), new ms5(this, tq5Var, null), (gn3) tq5Var.c, fi6Var.a.a.e);
            }
        } catch (RemoteException e) {
            throw new wi6(e);
        }
    }

    @Override // com.daaw.xq5
    public final /* bridge */ /* synthetic */ Object b(fi6 fi6Var, final th6 th6Var, final tq5 tq5Var) {
        final View view;
        if (((Boolean) zzba.zzc().b(g93.Z6)).booleanValue() && th6Var.i0) {
            try {
                view = (View) nt0.M(this.d.zze());
                boolean zzf = this.d.zzf();
                if (view == null) {
                    throw new wi6(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) s67.n(s67.i(null), new w57() { // from class: com.daaw.js5
                            @Override // com.daaw.w57
                            public final f77 zza(Object obj) {
                                return ns5.this.c(view, th6Var, obj);
                            }
                        }, z04.e).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new wi6(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new wi6(e2);
            }
        } else {
            view = this.c;
        }
        aj4 a = this.b.a(new rm4(fi6Var, th6Var, tq5Var.a), new gj4(view, null, new xl4() { // from class: com.daaw.ks5
            @Override // com.daaw.xl4
            public final zzdq zza() {
                try {
                    return ((dp3) tq5.this.b).zze();
                } catch (RemoteException e3) {
                    throw new wi6(e3);
                }
            }
        }, (uh6) th6Var.v.get(0)));
        a.i().C0(view);
        ((ys5) tq5Var.c).h3(a.f());
        return a.h();
    }

    public final /* synthetic */ f77 c(View view, th6 th6Var, Object obj) {
        return s67.i(qk4.a(this.a, view, th6Var));
    }
}
