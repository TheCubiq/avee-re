package com.daaw;
/* loaded from: classes.dex */
public final class ra7 extends ee7 {
    public ra7() {
        super(mj7.class, new pa7(a87.class));
    }

    public static /* bridge */ /* synthetic */ ce7 k(int i, int i2) {
        oj7 M = pj7.M();
        M.s(i);
        return new ce7((pj7) M.n(), i2);
    }

    @Override // com.daaw.ee7
    public final de7 a() {
        return new qa7(this, pj7.class);
    }

    @Override // com.daaw.ee7
    public final mm7 b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    public final /* synthetic */ xt7 c(yq7 yq7Var) {
        return mj7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.ee7
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.daaw.ee7
    public final /* bridge */ /* synthetic */ void e(xt7 xt7Var) {
        mj7 mj7Var = (mj7) xt7Var;
        xp7.b(mj7Var.L(), 0);
        xp7.a(mj7Var.P().o());
    }

    @Override // com.daaw.ee7
    public final int f() {
        return 2;
    }
}
