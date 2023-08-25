package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class pz8 implements i42 {

    /* renamed from: a */
    public final int f23573a;

    /* renamed from: b */
    public final int[] f23574b;

    /* renamed from: c */
    public final long[] f23575c;

    /* renamed from: d */
    public final long[] f23576d;

    /* renamed from: e */
    public final long[] f23577e;

    /* renamed from: f */
    public final long f23578f;

    public pz8(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f23574b = iArr;
        this.f23575c = jArr;
        this.f23576d = jArr2;
        this.f23577e = jArr3;
        int length = iArr.length;
        this.f23573a = length;
        if (length <= 0) {
            this.f23578f = 0L;
            return;
        }
        int i = length - 1;
        this.f23578f = jArr2[i] + jArr3[i];
    }

    @Override // com.daaw.i42
    /* renamed from: b */
    public final g42 mo2631b(long j) {
        int m19418N = it5.m19418N(this.f23577e, j, true, true);
        j42 j42Var = new j42(this.f23577e[m19418N], this.f23575c[m19418N]);
        if (j42Var.f14256a >= j || m19418N == this.f23573a - 1) {
            return new g42(j42Var, j42Var);
        }
        int i = m19418N + 1;
        return new g42(j42Var, new j42(this.f23577e[i], this.f23575c[i]));
    }

    public final String toString() {
        int i = this.f23573a;
        String arrays = Arrays.toString(this.f23574b);
        String arrays2 = Arrays.toString(this.f23575c);
        String arrays3 = Arrays.toString(this.f23577e);
        String arrays4 = Arrays.toString(this.f23576d);
        return "ChunkIndex(length=" + i + ", sizes=" + arrays + ", offsets=" + arrays2 + ", timeUs=" + arrays3 + ", durationsUs=" + arrays4 + ")";
    }

    @Override // com.daaw.i42
    public final long zze() {
        return this.f23578f;
    }

    @Override // com.daaw.i42
    public final boolean zzh() {
        return true;
    }
}
