package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class wa7 extends de7 {
    public final /* synthetic */ xa7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa7(xa7 xa7Var, Class cls) {
        super(cls);
        this.b = xa7Var;
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ xt7 a(xt7 xt7Var) {
        hk7 hk7Var = (hk7) xt7Var;
        dk7 M = ek7.M();
        M.t(0);
        M.s(yq7.F(vp7.a(32)));
        return (ek7) M.n();
    }

    @Override // com.daaw.de7
    public final /* synthetic */ xt7 b(yq7 yq7Var) {
        return hk7.N(yq7Var, vr7.a());
    }

    @Override // com.daaw.de7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new ce7(hk7.M(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new ce7(hk7.M(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ void d(xt7 xt7Var) {
        hk7 hk7Var = (hk7) xt7Var;
    }
}
