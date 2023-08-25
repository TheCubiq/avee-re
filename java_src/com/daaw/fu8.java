package com.daaw;
/* loaded from: classes.dex */
public final class fu8 {

    /* renamed from: a */
    public final long f9984a;

    /* renamed from: b */
    public final long f9985b;

    public fu8(long j, long j2) {
        this.f9984a = j;
        this.f9985b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fu8) {
            fu8 fu8Var = (fu8) obj;
            return this.f9984a == fu8Var.f9984a && this.f9985b == fu8Var.f9985b;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f9984a) * 31) + ((int) this.f9985b);
    }
}
