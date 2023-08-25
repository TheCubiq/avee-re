package com.daaw;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class ac7 extends de7 {

    /* renamed from: b */
    public final /* synthetic */ bc7 f3088b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac7(bc7 bc7Var, Class cls) {
        super(cls);
        this.f3088b = bc7Var;
    }

    @Override // com.daaw.de7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ xt7 mo2561a(xt7 xt7Var) {
        xj7 m3641M = yj7.m3641M();
        m3641M.m5042s(yq7.m3424F(vp7.m6942a(((bk7) xt7Var).m26085L())));
        m3641M.m5041t(0);
        return (yj7) m3641M.m22315n();
    }

    @Override // com.daaw.de7
    /* renamed from: b */
    public final /* synthetic */ xt7 mo2560b(yq7 yq7Var) {
        return bk7.m26082O(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.de7
    /* renamed from: c */
    public final Map mo6263c() {
        HashMap hashMap = new HashMap();
        ak7 m26084M = bk7.m26084M();
        m26084M.m27379s(64);
        hashMap.put("AES256_SIV", new ce7((bk7) m26084M.m22315n(), 1));
        ak7 m26084M2 = bk7.m26084M();
        m26084M2.m27379s(64);
        hashMap.put("AES256_SIV_RAW", new ce7((bk7) m26084M2.m22315n(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo2559d(xt7 xt7Var) {
        bk7 bk7Var = (bk7) xt7Var;
        if (bk7Var.m26085L() == 64) {
            return;
        }
        int m26085L = bk7Var.m26085L();
        throw new InvalidAlgorithmParameterException("invalid key size: " + m26085L + ". Valid keys must have 64 bytes.");
    }
}
