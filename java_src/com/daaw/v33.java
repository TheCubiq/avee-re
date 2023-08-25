package com.daaw;

import java.io.InputStream;
/* loaded from: classes.dex */
public final class v33 {
    public final InputStream a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final boolean e;

    public v33(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.a = inputStream;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = z3;
    }

    public static v33 b(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new v33(inputStream, z, z2, j, z3);
    }

    public final long a() {
        return this.d;
    }

    public final InputStream c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.c;
    }
}
