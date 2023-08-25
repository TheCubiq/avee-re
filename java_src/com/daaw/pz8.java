package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class pz8 implements i42 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public pz8(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
            return;
        }
        int i = length - 1;
        this.f = jArr2[i] + jArr3[i];
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        int N = it5.N(this.e, j, true, true);
        j42 j42Var = new j42(this.e[N], this.c[N]);
        if (j42Var.a >= j || N == this.a - 1) {
            return new g42(j42Var, j42Var);
        }
        int i = N + 1;
        return new g42(j42Var, new j42(this.e[i], this.c[i]));
    }

    public final String toString() {
        int i = this.a;
        String arrays = Arrays.toString(this.b);
        String arrays2 = Arrays.toString(this.c);
        String arrays3 = Arrays.toString(this.e);
        String arrays4 = Arrays.toString(this.d);
        return "ChunkIndex(length=" + i + ", sizes=" + arrays + ", offsets=" + arrays2 + ", timeUs=" + arrays3 + ", durationsUs=" + arrays4 + ")";
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
