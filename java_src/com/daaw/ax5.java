package com.daaw;
/* loaded from: classes.dex */
public final class ax5 implements qq5 {

    /* renamed from: a */
    public final fa3 f4089a;

    /* renamed from: b */
    public final g77 f4090b;

    /* renamed from: c */
    public final en6 f4091c;

    /* renamed from: d */
    public final jx5 f4092d;

    public ax5(en6 en6Var, g77 g77Var, fa3 fa3Var, jx5 jx5Var, byte[] bArr) {
        this.f4091c = en6Var;
        this.f4090b = g77Var;
        this.f4089a = fa3Var;
        this.f4092d = jx5Var;
    }

    @Override // com.daaw.qq5
    /* renamed from: a */
    public final boolean mo1905a(fi6 fi6Var, th6 th6Var) {
        yh6 yh6Var;
        return (this.f4089a == null || (yh6Var = th6Var.f27715t) == null || yh6Var.f33681a == null) ? false : true;
    }

    @Override // com.daaw.qq5
    /* renamed from: b */
    public final f77 mo1904b(fi6 fi6Var, th6 th6Var) {
        e14 e14Var = new e14();
        fx5 fx5Var = new fx5();
        fx5Var.m22146a(new zw5(this, e14Var, fi6Var, th6Var, fx5Var));
        yh6 yh6Var = th6Var.f27715t;
        final w93 w93Var = new w93(fx5Var, yh6Var.f33682b, yh6Var.f33681a);
        en6 en6Var = this.f4091c;
        return lm6.m16718d(new fm6() { // from class: com.daaw.yw5
            @Override // com.daaw.fm6
            public final void zza() {
                ax5.this.m26601c(w93Var);
            }
        }, this.f4090b, ym6.CUSTOM_RENDER_SYN, en6Var).m7036b(ym6.CUSTOM_RENDER_ACK).m7034d(e14Var).m7037a();
    }

    /* renamed from: c */
    public final /* synthetic */ void m26601c(w93 w93Var) {
        this.f4089a.mo22818a0(w93Var);
    }
}
