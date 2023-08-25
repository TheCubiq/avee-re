package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class xy6 extends oy6 {
    public final Object p;

    public xy6(Object obj) {
        this.p = obj;
    }

    @Override // com.daaw.oy6
    public final oy6 a(ey6 ey6Var) {
        Object apply = ey6Var.apply(this.p);
        sy6.c(apply, "the Function passed to Optional.transform() must not return null.");
        return new xy6(apply);
    }

    @Override // com.daaw.oy6
    public final Object b(Object obj) {
        return this.p;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof xy6) {
            return this.p.equals(((xy6) obj).p);
        }
        return false;
    }

    public final int hashCode() {
        return this.p.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.p + ")";
    }
}
