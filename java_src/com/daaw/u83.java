package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class u83 extends it2 {
    @Override // com.daaw.it2
    public final gl2 a(String str, w07 w07Var, List list) {
        if (str == null || str.isEmpty() || !w07Var.h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        gl2 d = w07Var.d(str);
        if (d instanceof ad2) {
            return ((ad2) d).a(w07Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
