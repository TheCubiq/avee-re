package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class ea7 extends de7 {

    /* renamed from: b */
    public final /* synthetic */ fa7 f8293b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea7(fa7 fa7Var, Class cls) {
        super(cls);
        this.f8293b = fa7Var;
    }

    @Override // com.daaw.de7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ xt7 mo2561a(xt7 xt7Var) {
        oi7 oi7Var = (oi7) xt7Var;
        new ia7();
        ri7 m20875g = ha7.m20875g(oi7Var.m14262O());
        xt7 mo2561a = new qg7().mo5331a().mo2561a(oi7Var.m14261P());
        ki7 m16939M = li7.m16939M();
        m16939M.m17712s(m20875g);
        m16939M.m17711t((ll7) mo2561a);
        m16939M.m17710u(0);
        return (li7) m16939M.m22315n();
    }

    @Override // com.daaw.de7
    /* renamed from: b */
    public final /* synthetic */ xt7 mo2560b(yq7 yq7Var) {
        return oi7.m14263N(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.de7
    /* renamed from: c */
    public final Map mo6263c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", fa7.m22817k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", fa7.m22817k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", fa7.m22817k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", fa7.m22817k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo2559d(xt7 xt7Var) {
        oi7 oi7Var = (oi7) xt7Var;
        ((ha7) new ia7().mo5331a()).mo2559d(oi7Var.m14262O());
        new qg7().mo5331a().mo2559d(oi7Var.m14261P());
        xp7.m4826a(oi7Var.m14262O().m8110L());
    }
}
