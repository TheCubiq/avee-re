package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class zy4 {
    public final List a;
    public final op6 b;
    public boolean c;

    public zy4(th6 th6Var, op6 op6Var) {
        this.a = th6Var.q;
        this.b = op6Var;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.b.d(this.a);
        this.c = true;
    }
}
