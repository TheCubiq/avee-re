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
    public final /* bridge */ /* synthetic */ xt7 a(xt7 xt7Var) {
        ci7 ci7Var = (ci7) xt7Var;
        yh7 M = zh7.M();
        M.u(0);
        M.s(yq7.F(vp7.a(ci7Var.L())));
        M.t(ci7Var.P());
        return (zh7) M.n();
    }

    @Override // com.daaw.de7
    public final /* synthetic */ xt7 b(yq7 yq7Var) {
        return ci7.O(yq7Var, vr7.a());
    }

    @Override // com.daaw.de7
    public final Map c() {
        HashMap hashMap = new HashMap();
        bi7 M = ci7.M();
        M.s(32);
        ei7 M2 = ii7.M();
        M2.s(16);
        M.t((ii7) M2.n());
        hashMap.put("AES_CMAC", new ce7((ci7) M.n(), 1));
        bi7 M3 = ci7.M();
        M3.s(32);
        ei7 M4 = ii7.M();
        M4.s(16);
        M3.t((ii7) M4.n());
        hashMap.put("AES256_CMAC", new ce7((ci7) M3.n(), 1));
        bi7 M5 = ci7.M();
        M5.s(32);
        ei7 M6 = ii7.M();
        M6.s(16);
        M5.t((ii7) M6.n());
        hashMap.put("AES256_CMAC_RAW", new ce7((ci7) M5.n(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.daaw.de7
    public final /* bridge */ /* synthetic */ void d(xt7 xt7Var) {
        ci7 ci7Var = (ci7) xt7Var;
        wf7.m(ci7Var.P());
        wf7.n(ci7Var.L());
    }
}
