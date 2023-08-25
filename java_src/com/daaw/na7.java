package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class na7 extends de7 {
    public final /* synthetic */ oa7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na7(oa7 oa7Var, Class cls) {
        super(cls);
        this.b = oa7Var;
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ xt7 a(xt7 xt7Var) {
        dj7 dj7Var = (dj7) xt7Var;
        zi7 M = aj7.M();
        M.s(yq7.F(vp7.a(dj7Var.L())));
        M.t(dj7Var.P());
        M.u(0);
        return (aj7) M.n();
    }

    @Override // com.daaw.de7
    public final /* synthetic */ xt7 b(yq7 yq7Var) {
        return dj7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.de7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", oa7.k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", oa7.k(16, 16, 3));
        hashMap.put("AES256_EAX", oa7.k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", oa7.k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ void d(xt7 xt7Var) {
        dj7 dj7Var = (dj7) xt7Var;
        xp7.a(dj7Var.L());
        if (dj7Var.P().L() != 12 && dj7Var.P().L() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
