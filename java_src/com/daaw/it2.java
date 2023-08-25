package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class it2 {
    public final List a = new ArrayList();

    public abstract gl2 a(String str, w07 w07Var, List list);

    public final gl2 b(String str) {
        if (this.a.contains(ou7.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
