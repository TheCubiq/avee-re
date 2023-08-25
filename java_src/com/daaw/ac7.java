package com.daaw;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class ac7 extends de7 {
    public final /* synthetic */ bc7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac7(bc7 bc7Var, Class cls) {
        super(cls);
        this.b = bc7Var;
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ xt7 a(xt7 xt7Var) {
        xj7 M = yj7.M();
        M.s(yq7.F(vp7.a(((bk7) xt7Var).L())));
        M.t(0);
        return (yj7) M.n();
    }

    @Override // com.daaw.de7
    public final /* synthetic */ xt7 b(yq7 yq7Var) {
        return bk7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.de7
    public final Map c() {
        HashMap hashMap = new HashMap();
        ak7 M = bk7.M();
        M.s(64);
        hashMap.put("AES256_SIV", new ce7((bk7) M.n(), 1));
        ak7 M2 = bk7.M();
        M2.s(64);
        hashMap.put("AES256_SIV_RAW", new ce7((bk7) M2.n(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ void d(xt7 xt7Var) {
        bk7 bk7Var = (bk7) xt7Var;
        if (bk7Var.L() == 64) {
            return;
        }
        int L = bk7Var.L();
        throw new InvalidAlgorithmParameterException("invalid key size: " + L + ". Valid keys must have 64 bytes.");
    }
}
