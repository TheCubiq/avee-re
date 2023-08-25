package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class qg7 extends ee7 {
    public qg7() {
        super(ll7.class, new og7(g97.class));
    }

    public static final void l(ll7 ll7Var) {
        xp7.b(ll7Var.L(), 0);
        if (ll7Var.R().o() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        n(ll7Var.Q());
    }

    public static /* bridge */ /* synthetic */ ce7 m(int i, int i2, int i3, int i4) {
        nl7 M = rl7.M();
        tl7 M2 = ul7.M();
        M2.t(i3);
        M2.s(i2);
        M.t((ul7) M2.n());
        M.s(i);
        return new ce7((rl7) M.n(), i4);
    }

    public static void n(ul7 ul7Var) {
        if (ul7Var.L() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int Q = ul7Var.Q() - 2;
        if (Q == 1) {
            if (ul7Var.L() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (Q == 2) {
            if (ul7Var.L() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (Q == 3) {
            if (ul7Var.L() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (Q == 4) {
            if (ul7Var.L() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (Q != 5) {
            throw new GeneralSecurityException("unknown hash type");
        } else {
            if (ul7Var.L() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.daaw.ee7
    public final de7 a() {
        return new pg7(this, rl7.class);
    }

    @Override // com.daaw.ee7
    public final mm7 b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    public final /* synthetic */ xt7 c(yq7 yq7Var) {
        return ll7.P(yq7Var, vr7.a());
    }

    @Override // com.daaw.ee7
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.daaw.ee7
    public final /* bridge */ /* synthetic */ void e(xt7 xt7Var) {
        l((ll7) xt7Var);
    }

    @Override // com.daaw.ee7
    public final int f() {
        return 2;
    }
}
