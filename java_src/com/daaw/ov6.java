package com.daaw;
/* loaded from: classes.dex */
public final class ov6 {
    public static f77 a(rj1 rj1Var) {
        final nv6 nv6Var = new nv6(rj1Var);
        rj1Var.c(m77.b(), new cu0() { // from class: com.daaw.mv6
            @Override // com.daaw.cu0
            public final void a(rj1 rj1Var2) {
                nv6 nv6Var2 = nv6.this;
                if (rj1Var2.l()) {
                    nv6Var2.cancel(false);
                } else if (rj1Var2.n()) {
                    nv6Var2.h(rj1Var2.k());
                } else {
                    Exception j = rj1Var2.j();
                    if (j == null) {
                        throw new IllegalStateException();
                    }
                    nv6Var2.i(j);
                }
            }
        });
        return nv6Var;
    }
}
