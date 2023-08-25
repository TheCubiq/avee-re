package com.daaw;

import com.daaw.da1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class hf implements da1 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public hf(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    public int a(long j) {
        return sq1.e(this.e, j, true, true);
    }

    @Override // com.daaw.da1
    public boolean e() {
        return true;
    }

    @Override // com.daaw.da1
    public da1.a g(long j) {
        int a = a(j);
        fa1 fa1Var = new fa1(this.e[a], this.c[a]);
        if (fa1Var.a >= j || a == this.a - 1) {
            return new da1.a(fa1Var);
        }
        int i = a + 1;
        return new da1.a(fa1Var, new fa1(this.e[i], this.c[i]));
    }

    @Override // com.daaw.da1
    public long h() {
        return this.f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
