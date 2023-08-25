package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzdq;
/* loaded from: classes.dex */
public final class vw5 implements qq5 {
    public final Context a;
    public final zj4 b;
    public final fa3 c;
    public final g77 d;
    public final en6 e;

    public vw5(Context context, zj4 zj4Var, en6 en6Var, g77 g77Var, fa3 fa3Var) {
        this.a = context;
        this.b = zj4Var;
        this.e = en6Var;
        this.d = g77Var;
        this.c = fa3Var;
    }

    @Override // com.daaw.qq5
    public final boolean a(fi6 fi6Var, th6 th6Var) {
        yh6 yh6Var;
        return (this.c == null || (yh6Var = th6Var.t) == null || yh6Var.a == null) ? false : true;
    }

    @Override // com.daaw.qq5
    public final f77 b(fi6 fi6Var, th6 th6Var) {
        aj4 a = this.b.a(new rm4(fi6Var, th6Var, null), new tw5(this, new View(this.a), null, new xl4() { // from class: com.daaw.ow5
            @Override // com.daaw.xl4
            public final zzdq zza() {
                return null;
            }
        }, (uh6) th6Var.v.get(0)));
        uw5 k = a.k();
        yh6 yh6Var = th6Var.t;
        final w93 w93Var = new w93(k, yh6Var.b, yh6Var.a);
        en6 en6Var = this.e;
        return lm6.d(new fm6() { // from class: com.daaw.sw5
            @Override // com.daaw.fm6
            public final void zza() {
                vw5.this.c(w93Var);
            }
        }, this.d, ym6.CUSTOM_RENDER_SYN, en6Var).b(ym6.CUSTOM_RENDER_ACK).d(s67.i(a.h())).a();
    }

    public final /* synthetic */ void c(w93 w93Var) {
        this.c.a0(w93Var);
    }
}
