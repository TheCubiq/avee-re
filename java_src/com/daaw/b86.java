package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class b86 {
    public final mu2 a;
    public final w07 b;
    public final w07 c;
    public final h68 d;

    public b86() {
        mu2 mu2Var = new mu2();
        this.a = mu2Var;
        w07 w07Var = new w07(null, mu2Var);
        this.c = w07Var;
        this.b = w07Var.a();
        h68 h68Var = new h68();
        this.d = h68Var;
        w07Var.g("require", new aw8(h68Var));
        h68Var.a("internal.platform", new Callable() { // from class: com.daaw.ne5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new oy8();
            }
        });
        w07Var.g("runtime.counter", new tb2(Double.valueOf(0.0d)));
    }

    public final gl2 a(w07 w07Var, gs7... gs7VarArr) {
        gl2 gl2Var = gl2.g;
        for (gs7 gs7Var : gs7VarArr) {
            gl2Var = b38.a(gs7Var);
            ou7.c(this.c);
            if ((gl2Var instanceof km2) || (gl2Var instanceof ck2)) {
                gl2Var = this.a.a(w07Var, gl2Var);
            }
        }
        return gl2Var;
    }
}
