package com.daaw;

import org.json.JSONObject;
/* loaded from: classes.dex */
public final class st5 implements sq5 {
    public final ya5 a;

    public st5(ya5 ya5Var) {
        this.a = ya5Var;
    }

    @Override // com.daaw.sq5
    public final tq5 a(String str, JSONObject jSONObject) {
        return new tq5(this.a.c(str, jSONObject), new ys5(), str);
    }
}
