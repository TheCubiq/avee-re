package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class na7 extends de7 {

    /* renamed from: b */
    public final /* synthetic */ oa7 f19770b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na7(oa7 oa7Var, Class cls) {
        super(cls);
        this.f19770b = oa7Var;
    }

    @Override // com.daaw.de7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ xt7 mo2561a(xt7 xt7Var) {
        dj7 dj7Var = (dj7) xt7Var;
        zi7 m27437M = aj7.m27437M();
        m27437M.m2267s(yq7.m3424F(vp7.m6942a(dj7Var.m24339L())));
        m27437M.m2266t(dj7Var.m24335P());
        m27437M.m2265u(0);
        return (aj7) m27437M.m22315n();
    }

    @Override // com.daaw.de7
    /* renamed from: b */
    public final /* synthetic */ xt7 mo2560b(yq7 yq7Var) {
        return dj7.m24336O(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.de7
    /* renamed from: c */
    public final Map mo6263c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", oa7.m14429k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", oa7.m14429k(16, 16, 3));
        hashMap.put("AES256_EAX", oa7.m14429k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", oa7.m14429k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo2559d(xt7 xt7Var) {
        dj7 dj7Var = (dj7) xt7Var;
        xp7.m4826a(dj7Var.m24339L());
        if (dj7Var.m24335P().m21557L() != 12 && dj7Var.m24335P().m21557L() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
