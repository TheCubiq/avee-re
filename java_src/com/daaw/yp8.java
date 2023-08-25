package com.daaw;

import android.content.Context;
/* loaded from: classes2.dex */
public final class yp8 implements l5 {
    public final l5 a;
    public final l5 b;

    public yp8(Context context) {
        this.a = new pm8(context, x70.f());
        this.b = tc8.d(context);
    }

    public static /* synthetic */ rj1 b(yp8 yp8Var, rj1 rj1Var) {
        if (rj1Var.n() || rj1Var.l()) {
            return rj1Var;
        }
        Exception j = rj1Var.j();
        if (j instanceof l3) {
            int b = ((l3) j).b();
            return (b == 43001 || b == 43002 || b == 43003 || b == 17) ? yp8Var.b.a() : b == 43000 ? dk1.d(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : b != 15 ? rj1Var : dk1.d(new Exception("The operation to get app set ID timed out. Please try again later."));
        }
        return rj1Var;
    }

    @Override // com.daaw.l5
    public final rj1<m5> a() {
        return this.a.a().h(new hl() { // from class: com.daaw.no8
            @Override // com.daaw.hl
            public final Object a(rj1 rj1Var) {
                return yp8.b(yp8.this, rj1Var);
            }
        });
    }
}
