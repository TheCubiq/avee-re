package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class ta7 extends de7 {

    /* renamed from: b */
    public final /* synthetic */ ua7 f27167b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta7(ua7 ua7Var, Class cls) {
        super(cls);
        this.f27167b = ua7Var;
    }

    @Override // com.daaw.de7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ xt7 mo2561a(xt7 xt7Var) {
        rj7 m10280M = sj7.m10280M();
        m10280M.m11229s(yq7.m3424F(vp7.m6942a(((vj7) xt7Var).m7113L())));
        m10280M.m11228t(0);
        return (sj7) m10280M.m22315n();
    }

    @Override // com.daaw.de7
    /* renamed from: b */
    public final /* synthetic */ xt7 mo2560b(yq7 yq7Var) {
        return vj7.m7110O(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.de7
    /* renamed from: c */
    public final Map mo6263c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", ua7.m8360l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", ua7.m8360l(16, 3));
        hashMap.put("AES256_GCM_SIV", ua7.m8360l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", ua7.m8360l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    /* renamed from: d */
    public final /* synthetic */ void mo2559d(xt7 xt7Var) {
        xp7.m4826a(((vj7) xt7Var).m7113L());
    }
}
