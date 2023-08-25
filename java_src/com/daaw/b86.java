package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class b86 {

    /* renamed from: a */
    public final mu2 f4544a;

    /* renamed from: b */
    public final w07 f4545b;

    /* renamed from: c */
    public final w07 f4546c;

    /* renamed from: d */
    public final h68 f4547d;

    public b86() {
        mu2 mu2Var = new mu2();
        this.f4544a = mu2Var;
        w07 w07Var = new w07(null, mu2Var);
        this.f4546c = w07Var;
        this.f4545b = w07Var.m6609a();
        h68 h68Var = new h68();
        this.f4547d = h68Var;
        w07Var.m6603g("require", new aw8(h68Var));
        h68Var.m20985a("internal.platform", new Callable() { // from class: com.daaw.ne5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new oy8();
            }
        });
        w07Var.m6603g("runtime.counter", new tb2(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final gl2 m26328a(w07 w07Var, gs7... gs7VarArr) {
        gl2 gl2Var = gl2.f11420g;
        for (gs7 gs7Var : gs7VarArr) {
            gl2Var = b38.m26496a(gs7Var);
            ou7.m13921c(this.f4546c);
            if ((gl2Var instanceof km2) || (gl2Var instanceof ck2)) {
                gl2Var = this.f4544a.m15761a(w07Var, gl2Var);
            }
        }
        return gl2Var;
    }
}
