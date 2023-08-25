package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class qa7 extends de7 {
    public final /* synthetic */ ra7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa7(ra7 ra7Var, Class cls) {
        super(cls);
        this.b = ra7Var;
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ xt7 a(xt7 xt7Var) {
        lj7 M = mj7.M();
        M.s(yq7.F(vp7.a(((pj7) xt7Var).L())));
        M.t(0);
        return (mj7) M.n();
    }

    @Override // com.daaw.de7
    public final /* synthetic */ xt7 b(yq7 yq7Var) {
        return pj7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.de7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", ra7.k(16, 1));
        hashMap.put("AES128_GCM_RAW", ra7.k(16, 3));
        hashMap.put("AES256_GCM", ra7.k(32, 1));
        hashMap.put("AES256_GCM_RAW", ra7.k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    public final /* synthetic */ void d(xt7 xt7Var) {
        xp7.a(((pj7) xt7Var).L());
    }
}
