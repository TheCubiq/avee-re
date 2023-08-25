package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.zzb;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class hs5 implements xq5 {

    /* renamed from: a */
    public final Context f12904a;

    /* renamed from: b */
    public final zj4 f12905b;

    /* renamed from: c */
    public final Executor f12906c;

    public hs5(Context context, zj4 zj4Var, Executor executor) {
        this.f12904a = context;
        this.f12905b = zj4Var;
        this.f12906c = executor;
    }

    @Override // com.daaw.xq5
    /* renamed from: a */
    public final void mo4813a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        zzq zzqVar;
        zzq zzqVar2 = fi6Var.f9623a.f5824a.f25345e;
        if (zzqVar2.zzn) {
            zzqVar = new zzq(this.f12904a, zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) zzba.zzc().m23658b(g93.f10618Z6)).booleanValue() && th6Var.f27697i0) ? new zzq(this.f12904a, zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : vi6.m7131a(this.f12904a, th6Var.f27717v);
        }
        zzq zzqVar3 = zzqVar;
        if (((Boolean) zzba.zzc().m23658b(g93.f10618Z6)).booleanValue() && th6Var.f27697i0) {
            ((oj6) tq5Var.f27988b).m14227s(this.f12904a, zzqVar3, fi6Var.f9623a.f5824a.f25344d, th6Var.f27718w.toString(), zzbu.zzl(th6Var.f27715t), (gn3) tq5Var.f27989c);
        } else {
            ((oj6) tq5Var.f27988b).m14228r(this.f12904a, zzqVar3, fi6Var.f9623a.f5824a.f25344d, th6Var.f27718w.toString(), zzbu.zzl(th6Var.f27715t), (gn3) tq5Var.f27989c);
        }
    }

    @Override // com.daaw.xq5
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo4812b(fi6 fi6Var, final th6 th6Var, tq5 tq5Var) {
        final View m14240f;
        if (((Boolean) zzba.zzc().m23658b(g93.f10618Z6)).booleanValue() && th6Var.f27697i0) {
            mn3 m14238h = ((oj6) tq5Var.f27988b).m14238h();
            if (m14238h == null) {
                k04.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new wi6(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                m14240f = (View) nt0.m14831M(m14238h.zze());
                boolean zzf = m14238h.zzf();
                if (m14240f == null) {
                    throw new wi6(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        m14240f = (View) s67.m10629n(s67.m10634i(null), new w57() { // from class: com.daaw.gs5
                            @Override // com.daaw.w57
                            public final f77 zza(Object obj) {
                                return hs5.this.m20437c(m14240f, th6Var, obj);
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
            m14240f = ((oj6) tq5Var.f27988b).m14240f();
        }
        zj4 zj4Var = this.f12905b;
        rm4 rm4Var = new rm4(fi6Var, th6Var, tq5Var.f27987a);
        final oj6 oj6Var = (oj6) tq5Var.f27988b;
        aj4 mo2202a = zj4Var.mo2202a(rm4Var, new gj4(m14240f, null, new xl4() { // from class: com.daaw.cs5
            @Override // com.daaw.xl4
            public final zzdq zza() {
                return oj6.this.m14239g();
            }
        }, (uh6) th6Var.f27717v.get(0)));
        mo2202a.mo9370i().m14720C0(m14240f);
        mo2202a.mo8315c().m17376n0(new eg4((oj6) tq5Var.f27988b), this.f12906c);
        ((ys5) tq5Var.f27989c).m3331h3(mo2202a.mo8313g());
        return mo2202a.mo9371h();
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m20437c(View view, th6 th6Var, Object obj) {
        return s67.m10634i(qk4.m12363a(this.f12904a, view, th6Var));
    }
}
