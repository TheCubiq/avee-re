package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class pg7 extends de7 {

    /* renamed from: b */
    public final /* synthetic */ qg7 f22928b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg7(qg7 qg7Var, Class cls) {
        super(cls);
        this.f22928b = qg7Var;
    }

    @Override // com.daaw.de7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ xt7 mo2561a(xt7 xt7Var) {
        rl7 rl7Var = (rl7) xt7Var;
        kl7 m16857M = ll7.m16857M();
        m16857M.m17668u(0);
        m16857M.m17669t(rl7Var.m11187Q());
        m16857M.m17670s(yq7.m3424F(vp7.m6942a(rl7Var.m11192L())));
        return (ll7) m16857M.m22315n();
    }

    @Override // com.daaw.de7
    /* renamed from: b */
    public final /* synthetic */ xt7 mo2560b(yq7 yq7Var) {
        return rl7.m11188P(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.de7
    /* renamed from: c */
    public final Map mo6263c() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", qg7.m12548m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", qg7.m12548m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", qg7.m12548m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", qg7.m12548m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", qg7.m12548m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", qg7.m12548m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", qg7.m12548m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", qg7.m12548m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", qg7.m12548m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", qg7.m12548m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo2559d(xt7 xt7Var) {
        rl7 rl7Var = (rl7) xt7Var;
        if (rl7Var.m11192L() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        qg7.m12547n(rl7Var.m11187Q());
    }
}
