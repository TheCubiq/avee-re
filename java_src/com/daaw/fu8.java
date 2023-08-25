package com.daaw;
/* loaded from: classes.dex */
public final class fu8 {
    public final long a;
    public final long b;

    public fu8(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fu8) {
            fu8 fu8Var = (fu8) obj;
            return this.a == fu8Var.a && this.b == fu8Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
