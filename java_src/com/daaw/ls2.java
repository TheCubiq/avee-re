package com.daaw;
/* loaded from: classes.dex */
public final class ls2 implements us2 {
    public final int[] a;
    public final long[] b;
    public final long[] c;
    public final long[] d;
    public final long e;

    public ls2(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = iArr;
        this.b = jArr;
        this.c = jArr2;
        this.d = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.e = 0L;
            return;
        }
        int i = length - 1;
        this.e = jArr2[i] + jArr3[i];
    }

    @Override // com.daaw.us2
    public final long a(long j) {
        return this.b[pz2.c(this.d, j, true, true)];
    }

    @Override // com.daaw.us2
    public final long zza() {
        return this.e;
    }

    @Override // com.daaw.us2
    public final boolean zzc() {
        return true;
    }
}
