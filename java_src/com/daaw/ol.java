package com.daaw;
/* loaded from: classes2.dex */
public final class ol {
    public static final String a(nl nlVar) {
        return null;
    }

    public static final ip1<?> b(vl vlVar) {
        while (!(vlVar instanceof du) && (vlVar = vlVar.a()) != null) {
            if (vlVar instanceof ip1) {
                return (ip1) vlVar;
            }
        }
        return null;
    }

    public static final ip1<?> c(gl<?> glVar, nl nlVar, Object obj) {
        if (glVar instanceof vl) {
            if (nlVar.get(jp1.p) != null) {
                ip1<?> b = b((vl) glVar);
                if (b != null) {
                    b.m0(nlVar, obj);
                }
                return b;
            }
            return null;
        }
        return null;
    }
}
