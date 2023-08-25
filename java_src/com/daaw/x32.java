package com.daaw;
/* loaded from: classes.dex */
public final class x32 implements i42 {

    /* renamed from: a */
    public final long[] f32049a;

    /* renamed from: b */
    public final long[] f32050b;

    /* renamed from: c */
    public final long f32051c;

    /* renamed from: d */
    public final boolean f32052d;

    public x32(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        uo4.m7874d(length == length2);
        boolean z = length2 > 0;
        this.f32052d = z;
        if (!z || jArr2[0] <= 0) {
            this.f32049a = jArr;
            this.f32050b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.f32049a = jArr3;
            long[] jArr4 = new long[i];
            this.f32050b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f32051c = j;
    }

    @Override // com.daaw.i42
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        if (!this.f32052d) {
            j42 j42Var = j42.f14255c;
            return new g42(j42Var, j42Var);
        }
        int m19418N = it5.m19418N(this.f32050b, j, true, true);
        j42 j42Var2 = new j42(this.f32050b[m19418N], this.f32049a[m19418N]);
        if (j42Var2.f14256a != j) {
            long[] jArr = this.f32050b;
            if (m19418N != jArr.length - 1) {
                int i = m19418N + 1;
                return new g42(j42Var2, new j42(jArr[i], this.f32049a[i]));
            }
        }
        return new g42(j42Var2, j42Var2);
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f32051c;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return this.f32052d;
    }
}
