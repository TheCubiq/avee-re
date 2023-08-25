package com.daaw;
/* loaded from: classes.dex */
public final class ov6 {
    /* renamed from: a */
    public static f77 m13909a(rj1 rj1Var) {
        final nv6 nv6Var = new nv6(rj1Var);
        rj1Var.mo11247c(m77.m16187b(), new cu0() { // from class: com.daaw.mv6
            @Override // com.daaw.cu0
            /* renamed from: a */
            public final void mo6614a(rj1 rj1Var2) {
                nv6 nv6Var2 = nv6.this;
                if (rj1Var2.mo11238l()) {
                    nv6Var2.cancel(false);
                } else if (rj1Var2.mo11236n()) {
                    nv6Var2.mo14486h(rj1Var2.mo11239k());
                } else {
                    Exception mo11240j = rj1Var2.mo11240j();
                    if (mo11240j == null) {
                        throw new IllegalStateException();
                    }
                    nv6Var2.mo14485i(mo11240j);
                }
            }
        });
        return nv6Var;
    }
}
