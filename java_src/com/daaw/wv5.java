package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class wv5 implements qq5 {

    /* renamed from: a */
    public final Context f31579a;

    /* renamed from: b */
    public final ia5 f31580b;

    /* renamed from: c */
    public final o95 f31581c;

    /* renamed from: d */
    public final ri6 f31582d;

    /* renamed from: e */
    public final Executor f31583e;

    /* renamed from: f */
    public final zzchu f31584f;

    /* renamed from: g */
    public final bh3 f31585g;

    /* renamed from: h */
    public final boolean f31586h = ((Boolean) zzba.zzc().m23658b(g93.f10589W7)).booleanValue();

    public wv5(Context context, zzchu zzchuVar, ri6 ri6Var, Executor executor, o95 o95Var, ia5 ia5Var, bh3 bh3Var) {
        this.f31579a = context;
        this.f31582d = ri6Var;
        this.f31581c = o95Var;
        this.f31583e = executor;
        this.f31584f = zzchuVar;
        this.f31580b = ia5Var;
        this.f31585g = bh3Var;
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
        f77 m10629n = s67.m10629n(s67.m10634i(null), new w57() { // from class: com.daaw.pv5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return wv5.this.m5763c(th6Var, fi6Var, ma5Var, obj);
            }
        }, this.f31583e);
        m10629n.mo6515f(new Runnable() { // from class: com.daaw.qv5
            @Override // java.lang.Runnable
            public final void run() {
                ma5.this.m16133b();
            }
        }, this.f31583e);
        return m10629n;
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m5763c(final th6 th6Var, fi6 fi6Var, ma5 ma5Var, Object obj) {
        final a74 m20001a = this.f31580b.m20001a(this.f31582d.f25345e, th6Var, fi6Var.f9624b.f8508b);
        m20001a.mo6427X(th6Var.f27677X);
        ma5Var.m16134a(this.f31579a, (View) m20001a);
        e14 e14Var = new e14();
        final k95 mo14353b = this.f31581c.mo14353b(new rm4(fi6Var, th6Var, null), new l95(new vv5(this.f31579a, this.f31580b, this.f31582d, this.f31584f, th6Var, e14Var, m20001a, this.f31585g, this.f31586h), m20001a));
        e14Var.m23797b(mo14353b);
        ph3.m13386b(m20001a, mo14353b.mo17782i());
        mo14353b.mo9318b().m17376n0(new ir4() { // from class: com.daaw.rv5
            @Override // com.daaw.ir4
            public final void zzl() {
                a74 a74Var = a74.this;
                if (a74Var.zzP() != null) {
                    a74Var.zzP().zzp();
                }
            }
        }, z04.f34310f);
        mo14353b.mo17779l().m20878i(m20001a, true, this.f31586h ? this.f31585g : null);
        mo14353b.mo17779l();
        yh6 yh6Var = th6Var.f27715t;
        return s67.m10630m(ha5.m20877j(m20001a, yh6Var.f33682b, yh6Var.f33681a), new ey6() { // from class: com.daaw.sv5
            @Override // com.daaw.ey6
            public final Object apply(Object obj2) {
                a74 a74Var = m20001a;
                th6 th6Var2 = th6Var;
                k95 k95Var = mo14353b;
                if (th6Var2.f27667N) {
                    a74Var.mo6462C();
                }
                a74Var.mo6397v0();
                a74Var.onPause();
                return k95Var.mo17780k();
            }
        }, this.f31583e);
    }
}
