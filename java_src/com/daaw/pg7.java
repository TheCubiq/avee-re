package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class pg7 extends de7 {
    public final /* synthetic */ qg7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg7(qg7 qg7Var, Class cls) {
        super(cls);
        this.b = qg7Var;
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ xt7 a(xt7 xt7Var) {
        rl7 rl7Var = (rl7) xt7Var;
        kl7 M = ll7.M();
        M.u(0);
        M.t(rl7Var.Q());
        M.s(yq7.F(vp7.a(rl7Var.L())));
        return (ll7) M.n();
    }

    @Override // com.daaw.de7
    public final /* synthetic */ xt7 b(yq7 yq7Var) {
        return rl7.P(yq7Var, vr7.a());
    }

    @Override // com.daaw.de7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", qg7.m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", qg7.m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", qg7.m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", qg7.m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", qg7.m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", qg7.m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", qg7.m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", qg7.m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", qg7.m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", qg7.m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ void d(xt7 xt7Var) {
        rl7 rl7Var = (rl7) xt7Var;
        if (rl7Var.L() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        qg7.n(rl7Var.Q());
    }
}
