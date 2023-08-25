package com.daaw;
/* loaded from: classes.dex */
public final class jr8 extends l64 {
    public final f53 c;

    public jr8(f53 f53Var) {
        this.c = f53Var;
    }

    @Override // com.daaw.l64
    public final int a(Object obj) {
        return obj == ir8.f ? 0 : -1;
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
    public final d34 d(int i, d34 d34Var, boolean z) {
        d34Var.k(z ? 0 : null, z ? ir8.f : null, 0, -9223372036854775807L, 0L, fl4.d, true);
        return d34Var;
    }

    @Override // com.daaw.l64
    public final i54 e(int i, i54 i54Var, long j) {
        i54Var.a(i54.o, this.c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        i54Var.j = true;
        return i54Var;
    }

    @Override // com.daaw.l64
    public final Object f(int i) {
        return ir8.f;
    }
}
