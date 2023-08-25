package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class fr5 implements qq5 {

    /* renamed from: a */
    public final ji4 f9832a;

    /* renamed from: b */
    public final Context f9833b;

    /* renamed from: c */
    public final ia5 f9834c;

    /* renamed from: d */
    public final ri6 f9835d;

    /* renamed from: e */
    public final Executor f9836e;

    /* renamed from: f */
    public final zzchu f9837f;

    /* renamed from: g */
    public final bh3 f9838g;

    /* renamed from: h */
    public final boolean f9839h = ((Boolean) zzba.zzc().m23658b(g93.f10589W7)).booleanValue();

    public fr5(ji4 ji4Var, Context context, Executor executor, ia5 ia5Var, ri6 ri6Var, zzchu zzchuVar, bh3 bh3Var) {
        this.f9833b = context;
        this.f9832a = ji4Var;
        this.f9836e = executor;
        this.f9834c = ia5Var;
        this.f9835d = ri6Var;
        this.f9837f = zzchuVar;
        this.f9838g = bh3Var;
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
        f77 m10629n = s67.m10629n(s67.m10634i(null), new w57() { // from class: com.daaw.dr5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return fr5.this.m22360c(th6Var, fi6Var, ma5Var, obj);
            }
        }, this.f9836e);
        m10629n.mo6515f(new Runnable() { // from class: com.daaw.er5
            @Override // java.lang.Runnable
            public final void run() {
                ma5.this.m16133b();
            }
        }, this.f9836e);
        return m10629n;
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m22360c(final th6 th6Var, fi6 fi6Var, ma5 ma5Var, Object obj) {
        final a74 m20001a = this.f9834c.m20001a(this.f9835d.f25345e, th6Var, fi6Var.f9624b.f8508b);
        m20001a.mo6427X(th6Var.f27677X);
        ma5Var.m16134a(this.f9833b, (View) m20001a);
        e14 e14Var = new e14();
        final gi4 mo18490a = this.f9832a.mo18490a(new rm4(fi6Var, th6Var, null), new sz4(new hr5(this.f9837f, e14Var, th6Var, m20001a, this.f9835d, this.f9839h, this.f9838g), m20001a), new hi4(th6Var.f27683b0));
        mo18490a.mo21571j().m20878i(m20001a, false, this.f9839h ? this.f9838g : null);
        e14Var.m23797b(mo18490a);
        mo18490a.mo9318b().m17376n0(new ir4() { // from class: com.daaw.yq5
            @Override // com.daaw.ir4
            public final void zzl() {
                a74 a74Var = a74.this;
                if (a74Var.zzP() != null) {
                    a74Var.zzP().zzp();
                }
            }
        }, z04.f34310f);
        mo18490a.mo21571j();
        yh6 yh6Var = th6Var.f27715t;
        return s67.m10630m(ha5.m20877j(m20001a, yh6Var.f33682b, yh6Var.f33681a), new ey6() { // from class: com.daaw.zq5
            @Override // com.daaw.ey6
            public final Object apply(Object obj2) {
                a74 a74Var = m20001a;
                th6 th6Var2 = th6Var;
                gi4 gi4Var = mo18490a;
                if (th6Var2.f27667N) {
                    a74Var.mo6462C();
                }
                a74Var.mo6397v0();
                a74Var.onPause();
                return gi4Var.mo21573h();
            }
        }, this.f9836e);
    }
}
