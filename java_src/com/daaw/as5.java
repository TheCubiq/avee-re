package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzas;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class as5 implements qq5 {

    /* renamed from: a */
    public final zj4 f3526a;

    /* renamed from: b */
    public final Context f3527b;

    /* renamed from: c */
    public final ia5 f3528c;

    /* renamed from: d */
    public final ri6 f3529d;

    /* renamed from: e */
    public final Executor f3530e;

    /* renamed from: f */
    public final ey6 f3531f;

    public as5(zj4 zj4Var, Context context, Executor executor, ia5 ia5Var, ri6 ri6Var, ey6 ey6Var) {
        this.f3527b = context;
        this.f3526a = zj4Var;
        this.f3530e = executor;
        this.f3528c = ia5Var;
        this.f3529d = ri6Var;
        this.f3531f = ey6Var;
    }

    @Override // com.daaw.qq5
    /* renamed from: a */
    public final boolean mo1905a(fi6 fi6Var, th6 th6Var) {
        yh6 yh6Var = th6Var.f27715t;
        return (yh6Var == null || yh6Var.f33681a == null) ? false : true;
    }

    @Override // com.daaw.qq5
    /* renamed from: b */
    public final f77 mo1904b(final fi6 fi6Var, final th6 th6Var) {
        return s67.m10629n(s67.m10634i(null), new w57() { // from class: com.daaw.ur5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return as5.this.m27099c(fi6Var, th6Var, obj);
            }
        }, this.f3530e);
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m27099c(fi6 fi6Var, th6 th6Var, Object obj) {
        View la5Var;
        zzq m7131a = vi6.m7131a(this.f3527b, th6Var.f27717v);
        final a74 m20001a = this.f3528c.m20001a(m7131a, th6Var, fi6Var.f9624b.f8508b);
        m20001a.mo6427X(th6Var.f27677X);
        if (((Boolean) zzba.zzc().m23658b(g93.f10618Z6)).booleanValue() && th6Var.f27697i0) {
            la5Var = qk4.m12363a(this.f3527b, (View) m20001a, th6Var);
        } else {
            la5Var = new la5(this.f3527b, (View) m20001a, (zzas) this.f3531f.apply(th6Var));
        }
        final aj4 mo2202a = this.f3526a.mo2202a(new rm4(fi6Var, th6Var, null), new gj4(la5Var, m20001a, new xl4() { // from class: com.daaw.vr5
            @Override // com.daaw.xl4
            public final zzdq zza() {
                return a74.this.zzs();
            }
        }, vi6.m7129c(m7131a)));
        mo2202a.mo9369j().m20878i(m20001a, false, null);
        gr4 mo9318b = mo2202a.mo9318b();
        ir4 ir4Var = new ir4() { // from class: com.daaw.wr5
            @Override // com.daaw.ir4
            public final void zzl() {
                a74 a74Var = a74.this;
                if (a74Var.zzP() != null) {
                    a74Var.zzP().zzp();
                }
            }
        };
        g77 g77Var = z04.f34310f;
        mo9318b.m17376n0(ir4Var, g77Var);
        mo2202a.mo9369j();
        yh6 yh6Var = th6Var.f27715t;
        f77 m20877j = ha5.m20877j(m20001a, yh6Var.f33682b, yh6Var.f33681a);
        if (th6Var.f27667N) {
            m20877j.mo6515f(new Runnable() { // from class: com.daaw.xr5
                @Override // java.lang.Runnable
                public final void run() {
                    a74.this.mo6462C();
                }
            }, this.f3530e);
        }
        m20877j.mo6515f(new Runnable() { // from class: com.daaw.yr5
            @Override // java.lang.Runnable
            public final void run() {
                as5.this.m27098d(m20001a);
            }
        }, this.f3530e);
        return s67.m10630m(m20877j, new ey6() { // from class: com.daaw.zr5
            @Override // com.daaw.ey6
            public final Object apply(Object obj2) {
                return aj4.this.mo9371h();
            }
        }, g77Var);
    }

    /* renamed from: d */
    public final /* synthetic */ void m27098d(a74 a74Var) {
        a74Var.mo6397v0();
        z74 zzs = a74Var.zzs();
        zzfl zzflVar = this.f3529d.f25341a;
        if (zzflVar == null || zzs == null) {
            return;
        }
        zzs.m2690j3(zzflVar);
    }
}
