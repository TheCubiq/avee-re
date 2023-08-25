package com.daaw;
/* loaded from: classes.dex */
public final class e23 {
    public final long a;
    public final String b;
    public final int c;

    public e23(long j, String str, int i) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof e23)) {
            e23 e23Var = (e23) obj;
            if (e23Var.a == this.a && e23Var.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
