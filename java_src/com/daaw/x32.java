package com.daaw;
/* loaded from: classes.dex */
public final class x32 implements i42 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public x32(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        uo4.d(length == length2);
        boolean z = length2 > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.c = j;
    }

    @Override // com.daaw.i42
    public final g42 b(long j) {
        if (!this.d) {
            j42 j42Var = j42.c;
            return new g42(j42Var, j42Var);
        }
        int N = it5.N(this.b, j, true, true);
        j42 j42Var2 = new j42(this.b[N], this.a[N]);
        if (j42Var2.a != j) {
            long[] jArr = this.b;
            if (N != jArr.length - 1) {
                int i = N + 1;
                return new g42(j42Var2, new j42(jArr[i], this.a[i]));
            }
        }
        return new g42(j42Var2, j42Var2);
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.c;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return this.d;
    }
}
