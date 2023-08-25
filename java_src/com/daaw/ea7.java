package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class ea7 extends de7 {
    public final /* synthetic */ fa7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea7(fa7 fa7Var, Class cls) {
        super(cls);
        this.b = fa7Var;
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ xt7 a(xt7 xt7Var) {
        oi7 oi7Var = (oi7) xt7Var;
        new ia7();
        ri7 g = ha7.g(oi7Var.O());
        xt7 a = new qg7().a().a(oi7Var.P());
        ki7 M = li7.M();
        M.s(g);
        M.t((ll7) a);
        M.u(0);
        return (li7) M.n();
    }

    @Override // com.daaw.de7
    public final /* synthetic */ xt7 b(yq7 yq7Var) {
        return oi7.N(yq7Var, vr7.a());
    }

    @Override // com.daaw.de7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", fa7.k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", fa7.k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", fa7.k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", fa7.k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ void d(xt7 xt7Var) {
        oi7 oi7Var = (oi7) xt7Var;
        ((ha7) new ia7().a()).d(oi7Var.O());
        new qg7().a().d(oi7Var.P());
        xp7.a(oi7Var.O().L());
    }
}
