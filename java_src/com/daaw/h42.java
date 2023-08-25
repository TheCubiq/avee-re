package com.daaw;
/* loaded from: classes.dex */
public class h42 implements i42 {
    public final long a;
    public final g42 b;

    public h42(long j, long j2) {
        this.a = j;
        j42 j42Var = j2 == 0 ? j42.c : new j42(0L, j2);
        this.b = new g42(j42Var, j42Var);
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        return this.b;
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.a;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return false;
    }
}
