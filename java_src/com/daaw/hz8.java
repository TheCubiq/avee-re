package com.daaw;
/* loaded from: classes.dex */
public final class hz8 implements i42 {
    public final kz8 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public hz8(kz8 kz8Var, long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = kz8Var;
        this.b = j;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        j42 j42Var = new j42(j, jz8.f(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
        return new g42(j42Var, j42Var);
    }

    public final long g(long j) {
        return this.a.a(j);
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.b;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
