package com.daaw;

import java.util.List;
/* loaded from: classes2.dex */
public final class u83 extends it2 {
    @Override // com.daaw.it2
    /* renamed from: a */
    public final gl2 mo3983a(String str, w07 w07Var, List list) {
        if (str == null || str.isEmpty() || !w07Var.m6602h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        gl2 m6606d = w07Var.m6606d(str);
        if (m6606d instanceof ad2) {
            return ((ad2) m6606d).mo5780a(w07Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
