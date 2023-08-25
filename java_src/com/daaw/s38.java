package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class s38 extends y38 {
    public static final s38 p = new s38();

    @Override // com.daaw.y38
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.daaw.y38
    public final boolean b() {
        return false;
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
