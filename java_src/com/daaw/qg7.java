package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class qg7 extends ee7 {
    public qg7() {
        super(ll7.class, new og7(g97.class));
    }

    /* renamed from: l */
    public static final void m12549l(ll7 ll7Var) {
        xp7.m4825b(ll7Var.m16858L(), 0);
        if (ll7Var.m16852R().mo3411o() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m12547n(ll7Var.m16853Q());
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ ce7 m12548m(int i, int i2, int i3, int i4) {
        nl7 m11191M = rl7.m11191M();
        tl7 m8030M = ul7.m8030M();
        m8030M.m9002t(i3);
        m8030M.m9003s(i2);
        m11191M.m15042t((ul7) m8030M.m22315n());
        m11191M.m15043s(i);
        return new ce7((rl7) m11191M.m22315n(), i4);
    }

    /* renamed from: n */
    public static void m12547n(ul7 ul7Var) {
        if (ul7Var.m8031L() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int m8026Q = ul7Var.m8026Q() - 2;
        if (m8026Q == 1) {
            if (ul7Var.m8031L() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (m8026Q == 2) {
            if (ul7Var.m8031L() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (m8026Q == 3) {
            if (ul7Var.m8031L() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (m8026Q == 4) {
            if (ul7Var.m8031L() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (m8026Q != 5) {
            throw new GeneralSecurityException("unknown hash type");
        } else {
            if (ul7Var.m8031L() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.daaw.ee7
    /* renamed from: a */
    public final de7 mo5331a() {
        return new pg7(this, rl7.class);
    }

    @Override // com.daaw.ee7
    /* renamed from: b */
    public final mm7 mo5330b() {
        return mm7.SYMMETRIC;
    }

    @Override // com.daaw.ee7
    /* renamed from: c */
    public final /* synthetic */ xt7 mo5329c(yq7 yq7Var) {
        return ll7.m16854P(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.ee7
    /* renamed from: d */
    public final String mo5328d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.daaw.ee7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5327e(xt7 xt7Var) {
        m12549l((ll7) xt7Var);
    }

    @Override // com.daaw.ee7
    /* renamed from: f */
    public final int mo11546f() {
        return 2;
    }
}
