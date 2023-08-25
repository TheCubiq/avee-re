package com.daaw;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ew5 implements sq5 {

    /* renamed from: a */
    public final lx5 f8887a;

    public ew5(lx5 lx5Var) {
        this.f8887a = lx5Var;
    }

    @Override // com.daaw.sq5
    /* renamed from: a */
    public final tq5 mo9886a(String str, JSONObject jSONObject) {
        dp3 m16380a = this.f8887a.m16380a(str);
        if (m16380a == null) {
            return null;
        }
        return new tq5(m16380a, new ys5(), str);
    }
}
