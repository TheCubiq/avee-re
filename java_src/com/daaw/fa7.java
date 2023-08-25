package com.daaw;
/* loaded from: classes.dex */
public final class fa7 extends ee7 {
    public fa7() {
        super(li7.class, new da7(a87.class));
    }

    public static /* bridge */ /* synthetic */ ce7 k(int i, int i2, int i3, int i4, int i5, int i6) {
        ti7 M = ui7.M();
        wi7 M2 = xi7.M();
        M2.s(16);
        M.t((xi7) M2.n());
        M.s(i);
        nl7 M3 = rl7.M();
        tl7 M4 = ul7.M();
        M4.t(5);
        M4.s(i4);
        M3.t((ul7) M4.n());
        M3.s(32);
        ni7 L = oi7.L();
        L.s((ui7) M.n());
        L.t((rl7) M3.n());
        return new ce7((oi7) L.n(), i6);
    }

    @Override // com.daaw.ee7
    public final de7 a() {
        return new ea7(this, oi7.class);
    }

    @Override // com.daaw.ee7
    public final mm7 b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    public final /* synthetic */ xt7 c(yq7 yq7Var) {
        return li7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.ee7
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.daaw.ee7
    public final /* bridge */ /* synthetic */ void e(xt7 xt7Var) {
        li7 li7Var = (li7) xt7Var;
        xp7.b(li7Var.L(), 0);
        new ia7();
        ia7.l(li7Var.P());
        new qg7();
        qg7.l(li7Var.Q());
    }

    @Override // com.daaw.ee7
    public final int f() {
        return 2;
    }
}
