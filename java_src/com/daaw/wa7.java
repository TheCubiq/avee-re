package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class wa7 extends de7 {

    /* renamed from: b */
    public final /* synthetic */ xa7 f31106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa7(xa7 xa7Var, Class cls) {
        super(cls);
        this.f31106b = xa7Var;
    }

    @Override // com.daaw.de7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ xt7 mo2561a(xt7 xt7Var) {
        hk7 hk7Var = (hk7) xt7Var;
        dk7 m23418M = ek7.m23418M();
        m23418M.m24294t(0);
        m23418M.m24295s(yq7.m3424F(vp7.m6942a(32)));
        return (ek7) m23418M.m22315n();
    }

    @Override // com.daaw.de7
    /* renamed from: b */
    public final /* synthetic */ xt7 mo2560b(yq7 yq7Var) {
        return hk7.m20646N(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.de7
    /* renamed from: c */
    public final Map mo6263c() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new ce7(hk7.m20647M(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new ce7(hk7.m20647M(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo2559d(xt7 xt7Var) {
        hk7 hk7Var = (hk7) xt7Var;
    }
}
