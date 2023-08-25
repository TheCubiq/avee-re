package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class b48 extends y38 {

    /* renamed from: p */
    public final Object f4294p;

    public b48(Object obj) {
        this.f4294p = obj;
    }

    @Override // com.daaw.y38
    /* renamed from: a */
    public final Object mo4139a() {
        return this.f4294p;
    }

    @Override // com.daaw.y38
    /* renamed from: b */
    public final boolean mo4138b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof b48) {
            return this.f4294p.equals(((b48) obj).f4294p);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4294p.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f4294p + ")";
    }
}
