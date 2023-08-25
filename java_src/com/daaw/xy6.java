package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class xy6 extends oy6 {

    /* renamed from: p */
    public final Object f33122p;

    public xy6(Object obj) {
        this.f33122p = obj;
    }

    @Override // com.daaw.oy6
    /* renamed from: a */
    public final oy6 mo4398a(ey6 ey6Var) {
        Object apply = ey6Var.apply(this.f33122p);
        sy6.m9706c(apply, "the Function passed to Optional.transform() must not return null.");
        return new xy6(apply);
    }

    @Override // com.daaw.oy6
    /* renamed from: b */
    public final Object mo4397b(Object obj) {
        return this.f33122p;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof xy6) {
            return this.f33122p.equals(((xy6) obj).f33122p);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33122p.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f33122p + ")";
    }
}
