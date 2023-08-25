package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class lr5 implements qq5 {

    /* renamed from: a */
    public final yh4 f17662a;

    /* renamed from: b */
    public final Context f17663b;

    /* renamed from: c */
    public final ia5 f17664c;

    /* renamed from: d */
    public final Executor f17665d;

    public lr5(yh4 yh4Var, Context context, Executor executor, ia5 ia5Var) {
        this.f17663b = context;
        this.f17662a = yh4Var;
        this.f17665d = executor;
        this.f17664c = ia5Var;
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
        return s67.m10629n(s67.m10634i(null), new w57() { // from class: com.daaw.ir5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return lr5.this.m16625c(fi6Var, th6Var, obj);
            }
        }, this.f17665d);
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m16625c(fi6 fi6Var, th6 th6Var, Object obj) {
        zzq m7131a = vi6.m7131a(this.f17663b, th6Var.f27717v);
        final a74 m20001a = this.f17664c.m20001a(m7131a, th6Var, fi6Var.f9624b.f8508b);
        final qh4 mo3746a = this.f17662a.mo3746a(new rm4(fi6Var, th6Var, null), new rh4((View) m20001a, m20001a, vi6.m7129c(m7131a), th6Var.f27683b0, th6Var.f27691f0, th6Var.f27669P));
        mo3746a.mo12530i().m20878i(m20001a, false, null);
        gr4 mo9318b = mo3746a.mo9318b();
        ir4 ir4Var = new ir4() { // from class: com.daaw.jr5
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
        mo3746a.mo12530i();
        yh6 yh6Var = th6Var.f27715t;
        return s67.m10630m(ha5.m20877j(m20001a, yh6Var.f33682b, yh6Var.f33681a), new ey6() { // from class: com.daaw.kr5
            @Override // com.daaw.ey6
            public final Object apply(Object obj2) {
                return qh4.this.mo12531h();
            }
        }, g77Var);
    }
}
