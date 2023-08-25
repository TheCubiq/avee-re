package com.daaw;

import android.net.Uri;
/* loaded from: classes.dex */
public final class xt8 extends l64 {
    public static final Object h = new Object();
    public static final f53 i;
    public final long c;
    public final long d;
    public final boolean e;
    public final f53 f;
    public final ht2 g;

    static {
        ee2 ee2Var = new ee2();
        ee2Var.a("SinglePeriodTimeline");
        ee2Var.b(Uri.EMPTY);
        i = ee2Var.c();
    }

    public xt8(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, f53 f53Var, ht2 ht2Var) {
        this.c = j4;
        this.d = j5;
        this.e = z;
        this.f = f53Var;
        this.g = ht2Var;
    }

    @Override // com.daaw.l64
    public final int a(Object obj) {
        return h.equals(obj) ? 0 : -1;
    }

    @Override // com.daaw.l64
    public final int b() {
        return 1;
    }

    @Override // com.daaw.l64
    public final int c() {
        return 1;
    }

    @Override // com.daaw.l64
    public final d34 d(int i2, d34 d34Var, boolean z) {
        uo4.a(i2, 0, 1);
        d34Var.k(null, z ? h : null, 0, this.c, 0L, fl4.d, false);
        return d34Var;
    }

    @Override // com.daaw.l64
    public final i54 e(int i2, i54 i54Var, long j) {
        uo4.a(i2, 0, 1);
        i54Var.a(i54.o, this.f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.e, false, this.g, 0L, this.d, 0, 0, 0L);
        return i54Var;
    }

    @Override // com.daaw.l64
    public final Object f(int i2) {
        uo4.a(i2, 0, 1);
        return h;
    }
}
