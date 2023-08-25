package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ft5 implements qq5 {

    /* renamed from: a */
    public final Context f9943a;

    /* renamed from: b */
    public final ia5 f9944b;

    /* renamed from: c */
    public final s05 f9945c;

    /* renamed from: d */
    public final ri6 f9946d;

    /* renamed from: e */
    public final Executor f9947e;

    /* renamed from: f */
    public final zzchu f9948f;

    /* renamed from: g */
    public final bh3 f9949g;

    /* renamed from: h */
    public final boolean f9950h = ((Boolean) zzba.zzc().m23658b(g93.f10589W7)).booleanValue();

    public ft5(Context context, zzchu zzchuVar, ri6 ri6Var, Executor executor, s05 s05Var, ia5 ia5Var, bh3 bh3Var) {
        this.f9943a = context;
        this.f9946d = ri6Var;
        this.f9945c = s05Var;
        this.f9947e = executor;
        this.f9948f = zzchuVar;
        this.f9944b = ia5Var;
        this.f9949g = bh3Var;
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
        final ma5 ma5Var = new ma5();
        f77 m10629n = s67.m10629n(s67.m10634i(null), new w57() { // from class: com.daaw.at5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return ft5.this.m22285c(th6Var, fi6Var, ma5Var, obj);
            }
        }, this.f9947e);
        m10629n.mo6515f(new Runnable() { // from class: com.daaw.bt5
            @Override // java.lang.Runnable
            public final void run() {
                ma5.this.m16133b();
            }
        }, this.f9947e);
        return m10629n;
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m22285c(final th6 th6Var, fi6 fi6Var, ma5 ma5Var, Object obj) {
        final a74 m20001a = this.f9944b.m20001a(this.f9946d.f25345e, th6Var, fi6Var.f9624b.f8508b);
        m20001a.mo6427X(th6Var.f27677X);
        ma5Var.m16134a(this.f9943a, (View) m20001a);
        e14 e14Var = new e14();
        final pz4 mo5263c = this.f9945c.mo5263c(new rm4(fi6Var, th6Var, null), new sz4(new et5(this.f9943a, this.f9948f, e14Var, th6Var, m20001a, this.f9946d, this.f9950h, this.f9949g), m20001a));
        e14Var.m23797b(mo5263c);
        mo5263c.mo9318b().m17376n0(new ir4() { // from class: com.daaw.ct5
            @Override // com.daaw.ir4
            public final void zzl() {
                a74 a74Var = a74.this;
                if (a74Var.zzP() != null) {
                    a74Var.zzP().zzp();
                }
            }
        }, z04.f34310f);
        mo5263c.mo9313k().m20878i(m20001a, true, this.f9950h ? this.f9949g : null);
        mo5263c.mo9313k();
        yh6 yh6Var = th6Var.f27715t;
        return s67.m10630m(ha5.m20877j(m20001a, yh6Var.f33682b, yh6Var.f33681a), new ey6() { // from class: com.daaw.dt5
            @Override // com.daaw.ey6
            public final Object apply(Object obj2) {
                a74 a74Var = m20001a;
                th6 th6Var2 = th6Var;
                pz4 pz4Var = mo5263c;
                if (th6Var2.f27667N) {
                    a74Var.mo6462C();
                }
                a74Var.mo6397v0();
                a74Var.onPause();
                return pz4Var.mo9315i();
            }
        }, this.f9947e);
    }
}
