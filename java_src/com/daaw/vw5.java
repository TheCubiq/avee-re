package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzdq;
/* loaded from: classes.dex */
public final class vw5 implements qq5 {

    /* renamed from: a */
    public final Context f30678a;

    /* renamed from: b */
    public final zj4 f30679b;

    /* renamed from: c */
    public final fa3 f30680c;

    /* renamed from: d */
    public final g77 f30681d;

    /* renamed from: e */
    public final en6 f30682e;

    public vw5(Context context, zj4 zj4Var, en6 en6Var, g77 g77Var, fa3 fa3Var) {
        this.f30678a = context;
        this.f30679b = zj4Var;
        this.f30682e = en6Var;
        this.f30681d = g77Var;
        this.f30680c = fa3Var;
    }

    @Override // com.daaw.qq5
    /* renamed from: a */
    public final boolean mo1905a(fi6 fi6Var, th6 th6Var) {
        yh6 yh6Var;
        return (this.f30680c == null || (yh6Var = th6Var.f27715t) == null || yh6Var.f33681a == null) ? false : true;
    }

    @Override // com.daaw.qq5
    /* renamed from: b */
    public final f77 mo1904b(fi6 fi6Var, th6 th6Var) {
        aj4 mo2202a = this.f30679b.mo2202a(new rm4(fi6Var, th6Var, null), new tw5(this, new View(this.f30678a), null, new xl4() { // from class: com.daaw.ow5
            @Override // com.daaw.xl4
            public final zzdq zza() {
                return null;
            }
        }, (uh6) th6Var.f27717v.get(0)));
        uw5 mo9368k = mo2202a.mo9368k();
        yh6 yh6Var = th6Var.f27715t;
        final w93 w93Var = new w93(mo9368k, yh6Var.f33682b, yh6Var.f33681a);
        en6 en6Var = this.f30682e;
        return lm6.m16718d(new fm6() { // from class: com.daaw.sw5
            @Override // com.daaw.fm6
            public final void zza() {
                vw5.this.m6686c(w93Var);
            }
        }, this.f30681d, ym6.CUSTOM_RENDER_SYN, en6Var).m7036b(ym6.CUSTOM_RENDER_ACK).m7034d(s67.m10634i(mo2202a.mo9371h())).m7037a();
    }

    /* renamed from: c */
    public final /* synthetic */ void m6686c(w93 w93Var) {
        this.f30680c.mo22818a0(w93Var);
    }
}
