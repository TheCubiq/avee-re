package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class b48 extends y38 {
    public final Object p;

    public b48(Object obj) {
        this.p = obj;
    }

    @Override // com.daaw.y38
    public final Object a() {
        return this.p;
    }

    @Override // com.daaw.y38
    public final boolean b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof b48) {
            return this.p.equals(((b48) obj).p);
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
