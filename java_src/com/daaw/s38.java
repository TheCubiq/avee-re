package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class s38 extends y38 {

    /* renamed from: p */
    public static final s38 f25848p = new s38();

    @Override // com.daaw.y38
    /* renamed from: a */
    public final Object mo4139a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.daaw.y38
    /* renamed from: b */
    public final boolean mo4138b() {
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
