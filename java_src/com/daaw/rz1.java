package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class rz1 implements cu0 {
    public final /* synthetic */ tj1 a;
    public final /* synthetic */ tz1 b;

    public rz1(tz1 tz1Var, tj1 tj1Var) {
        this.b = tz1Var;
        this.a = tj1Var;
    }

    @Override // com.daaw.cu0
    public final void a(rj1 rj1Var) {
        Map map;
        map = this.b.b;
        map.remove(this.a);
    }
}
