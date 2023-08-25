package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class ta7 extends de7 {
    public final /* synthetic */ ua7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta7(ua7 ua7Var, Class cls) {
        super(cls);
        this.b = ua7Var;
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ xt7 a(xt7 xt7Var) {
        rj7 M = sj7.M();
        M.s(yq7.F(vp7.a(((vj7) xt7Var).L())));
        M.t(0);
        return (sj7) M.n();
    }

    @Override // com.daaw.de7
    public final /* synthetic */ xt7 b(yq7 yq7Var) {
        return vj7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.de7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", ua7.l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", ua7.l(16, 3));
        hashMap.put("AES256_GCM_SIV", ua7.l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", ua7.l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    public final /* synthetic */ void d(xt7 xt7Var) {
        xp7.a(((vj7) xt7Var).L());
    }
}
