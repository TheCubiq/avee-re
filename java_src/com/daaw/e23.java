package com.daaw;
/* loaded from: classes.dex */
public final class e23 {

    /* renamed from: a */
    public final long f8049a;

    /* renamed from: b */
    public final String f8050b;

    /* renamed from: c */
    public final int f8051c;

    public e23(long j, String str, int i) {
        this.f8049a = j;
        this.f8050b = str;
        this.f8051c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof e23)) {
            e23 e23Var = (e23) obj;
            if (e23Var.f8049a == this.f8049a && e23Var.f8051c == this.f8051c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f8049a;
    }
}
