package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class cj4 extends zi4 {

    /* renamed from: i */
    public final Context f5831i;

    /* renamed from: j */
    public final View f5832j;

    /* renamed from: k */
    public final a74 f5833k;

    /* renamed from: l */
    public final uh6 f5834l;

    /* renamed from: m */
    public final xl4 f5835m;

    /* renamed from: n */
    public final u35 f5836n;

    /* renamed from: o */
    public final xy4 f5837o;

    /* renamed from: p */
    public final qz7 f5838p;

    /* renamed from: q */
    public final Executor f5839q;

    /* renamed from: r */
    public zzq f5840r;

    public cj4(yl4 yl4Var, Context context, uh6 uh6Var, View view, a74 a74Var, xl4 xl4Var, u35 u35Var, xy4 xy4Var, qz7 qz7Var, Executor executor) {
        super(yl4Var);
        this.f5831i = context;
        this.f5832j = view;
        this.f5833k = a74Var;
        this.f5834l = uh6Var;
        this.f5835m = xl4Var;
        this.f5836n = u35Var;
        this.f5837o = xy4Var;
        this.f5838p = qz7Var;
        this.f5839q = executor;
    }

    /* renamed from: o */
    public static /* synthetic */ void m25332o(cj4 cj4Var) {
        u35 u35Var = cj4Var.f5836n;
        if (u35Var.m8598e() == null) {
            return;
        }
        try {
            u35Var.m8598e().mo18543U0((zzbu) cj4Var.f5838p.zzb(), nt0.m14830g3(cj4Var.f5831i));
        } catch (RemoteException e) {
            k04.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // com.daaw.zl4
    /* renamed from: b */
    public final void mo2131b() {
        this.f5839q.execute(new Runnable() { // from class: com.daaw.bj4
            @Override // java.lang.Runnable
            public final void run() {
                cj4.m25332o(cj4.this);
            }
        });
        super.mo2131b();
    }

    @Override // com.daaw.zi4
    /* renamed from: h */
    public final int mo2275h() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10618Z6)).booleanValue() && this.f35205b.f27697i0) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10629a7)).booleanValue()) {
                return 0;
            }
        }
        return this.f35204a.f9624b.f8508b.f31253c;
    }

    @Override // com.daaw.zi4
    /* renamed from: i */
    public final View mo2274i() {
        return this.f5832j;
    }

    @Override // com.daaw.zi4
    /* renamed from: j */
    public final zzdq mo2273j() {
        try {
            return this.f5835m.zza();
        } catch (wi6 unused) {
            return null;
        }
    }

    @Override // com.daaw.zi4
    /* renamed from: k */
    public final uh6 mo2272k() {
        zzq zzqVar = this.f5840r;
        if (zzqVar != null) {
            return vi6.m7129c(zzqVar);
        }
        th6 th6Var = this.f35205b;
        if (th6Var.f27687d0) {
            for (String str : th6Var.f27680a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new uh6(this.f5832j.getWidth(), this.f5832j.getHeight(), false);
        }
        return vi6.m7130b(this.f35205b.f27714s, this.f5834l);
    }

    @Override // com.daaw.zi4
    /* renamed from: l */
    public final uh6 mo2271l() {
        return this.f5834l;
    }

    @Override // com.daaw.zi4
    /* renamed from: m */
    public final void mo2270m() {
        this.f5837o.zza();
    }

    @Override // com.daaw.zi4
    /* renamed from: n */
    public final void mo2269n(ViewGroup viewGroup, zzq zzqVar) {
        a74 a74Var;
        if (viewGroup == null || (a74Var = this.f5833k) == null) {
            return;
        }
        a74Var.mo6440Q(v84.m7335c(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.f5840r = zzqVar;
    }
}
