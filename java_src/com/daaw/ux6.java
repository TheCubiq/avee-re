package com.daaw;

import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class ux6 extends oy6 {
    public static final ux6 p = new ux6();

    @Override // com.daaw.oy6
    public final oy6 a(ey6 ey6Var) {
        Objects.requireNonNull(ey6Var);
        return p;
    }

    @Override // com.daaw.oy6
    public final Object b(Object obj) {
        return "";
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
