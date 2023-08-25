package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class qa7 extends de7 {

    /* renamed from: b */
    public final /* synthetic */ ra7 f23827b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa7(ra7 ra7Var, Class cls) {
        super(cls);
        this.f23827b = ra7Var;
    }

    @Override // com.daaw.de7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ xt7 mo2561a(xt7 xt7Var) {
        lj7 m16010M = mj7.m16010M();
        m16010M.m16900s(yq7.m3424F(vp7.m6942a(((pj7) xt7Var).m13326L())));
        m16010M.m16899t(0);
        return (mj7) m16010M.m22315n();
    }

    @Override // com.daaw.de7
    /* renamed from: b */
    public final /* synthetic */ xt7 mo2560b(yq7 yq7Var) {
        return pj7.m13323O(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.de7
    /* renamed from: c */
    public final Map mo6263c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", ra7.m11545k(16, 1));
        hashMap.put("AES128_GCM_RAW", ra7.m11545k(16, 3));
        hashMap.put("AES256_GCM", ra7.m11545k(32, 1));
        hashMap.put("AES256_GCM_RAW", ra7.m11545k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    /* renamed from: d */
    public final /* synthetic */ void mo2559d(xt7 xt7Var) {
        xp7.m4826a(((pj7) xt7Var).m13326L());
    }
}
