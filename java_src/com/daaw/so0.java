package com.daaw;

import com.daaw.bp0;
/* loaded from: classes.dex */
public final class so0 {
    public final bp0.a a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;

    public so0(bp0.a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.a = aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
    }

    public so0 a(int i) {
        return new so0(this.a.a(i), this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public so0 b(long j) {
        return new so0(this.a, j, this.c, this.d, this.e, this.f, this.g);
    }
}
