package com.daaw;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ew5 implements sq5 {
    public final lx5 a;

    public ew5(lx5 lx5Var) {
        this.a = lx5Var;
    }

    @Override // com.daaw.sq5
    public final tq5 a(String str, JSONObject jSONObject) {
        dp3 a = this.a.a(str);
        if (a == null) {
            return null;
        }
        return new tq5(a, new ys5(), str);
    }
}
