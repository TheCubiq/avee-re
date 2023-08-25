package com.daaw;
/* loaded from: classes.dex */
public final class hv6 {
    public final String a;
    public final long b;

    public hv6() {
        this.a = null;
        this.b = -1L;
    }

    public hv6(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.a != null && this.b >= 0;
    }
}
