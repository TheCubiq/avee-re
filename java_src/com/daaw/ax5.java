package com.daaw;
/* loaded from: classes.dex */
public final class ax5 implements qq5 {
    public final fa3 a;
    public final g77 b;
    public final en6 c;
    public final jx5 d;

    public ax5(en6 en6Var, g77 g77Var, fa3 fa3Var, jx5 jx5Var, byte[] bArr) {
        this.c = en6Var;
        this.b = g77Var;
        this.a = fa3Var;
        this.d = jx5Var;
    }

    @Override // com.daaw.qq5
    public final boolean a(fi6 fi6Var, th6 th6Var) {
        yh6 yh6Var;
        return (this.a == null || (yh6Var = th6Var.t) == null || yh6Var.a == null) ? false : true;
    }

    @Override // com.daaw.qq5
    public final f77 b(fi6 fi6Var, th6 th6Var) {
        e14 e14Var = new e14();
        fx5 fx5Var = new fx5();
        fx5Var.a(new zw5(this, e14Var, fi6Var, th6Var, fx5Var));
        yh6 yh6Var = th6Var.t;
        final w93 w93Var = new w93(fx5Var, yh6Var.b, yh6Var.a);
        en6 en6Var = this.c;
        return lm6.d(new fm6() { // from class: com.daaw.yw5
            @Override // com.daaw.fm6
            public final void zza() {
                ax5.this.c(w93Var);
            }
        }, this.b, ym6.CUSTOM_RENDER_SYN, en6Var).b(ym6.CUSTOM_RENDER_ACK).d(e14Var).a();
    }

    public final /* synthetic */ void c(w93 w93Var) {
        this.a.a0(w93Var);
    }
}
