package com.daaw;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class vf7 extends de7 {
    public vf7(wf7 wf7Var, Class cls) {
        super(cls);
    }

    @Override // com.daaw.de7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ xt7 mo2561a(xt7 xt7Var) {
        ci7 ci7Var = (ci7) xt7Var;
        yh7 m2293M = zh7.m2293M();
        m2293M.m3737u(0);
        m2293M.m3739s(yq7.m3424F(vp7.m6942a(ci7Var.m25372L())));
        m2293M.m3738t(ci7Var.m25368P());
        return (zh7) m2293M.m22315n();
    }

    @Override // com.daaw.de7
    /* renamed from: b */
    public final /* synthetic */ xt7 mo2560b(yq7 yq7Var) {
        return ci7.m25369O(yq7Var, vr7.m6834a());
    }

    @Override // com.daaw.de7
    /* renamed from: c */
    public final Map mo6263c() {
        HashMap hashMap = new HashMap();
        bi7 m25371M = ci7.m25371M();
        m25371M.m26140s(32);
        ei7 m19763M = ii7.m19763M();
        m19763M.m23452s(16);
        m25371M.m26139t((ii7) m19763M.m22315n());
        hashMap.put("AES_CMAC", new ce7((ci7) m25371M.m22315n(), 1));
        bi7 m25371M2 = ci7.m25371M();
        m25371M2.m26140s(32);
        ei7 m19763M2 = ii7.m19763M();
        m19763M2.m23452s(16);
        m25371M2.m26139t((ii7) m19763M2.m22315n());
        hashMap.put("AES256_CMAC", new ce7((ci7) m25371M2.m22315n(), 1));
        bi7 m25371M3 = ci7.m25371M();
        m25371M3.m26140s(32);
        ei7 m19763M3 = ii7.m19763M();
        m19763M3.m23452s(16);
        m25371M3.m26139t((ii7) m19763M3.m22315n());
        hashMap.put("AES256_CMAC_RAW", new ce7((ci7) m25371M3.m22315n(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo2559d(xt7 xt7Var) {
        ci7 ci7Var = (ci7) xt7Var;
        wf7.m6083m(ci7Var.m25368P());
        wf7.m6082n(ci7Var.m25372L());
    }
}
