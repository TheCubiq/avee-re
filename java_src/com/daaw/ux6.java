package com.daaw;

import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class ux6 extends oy6 {

    /* renamed from: p */
    public static final ux6 f29608p = new ux6();

    @Override // com.daaw.oy6
    /* renamed from: a */
    public final oy6 mo4398a(ey6 ey6Var) {
        Objects.requireNonNull(ey6Var);
        return f29608p;
    }

    @Override // com.daaw.oy6
    /* renamed from: b */
    public final Object mo4397b(Object obj) {
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
