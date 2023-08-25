package com.daaw;

import com.daaw.da1;
import java.util.Arrays;
/* renamed from: com.daaw.hf */
/* loaded from: classes.dex */
public final class C1533hf implements da1 {

    /* renamed from: a */
    public final int f12486a;

    /* renamed from: b */
    public final int[] f12487b;

    /* renamed from: c */
    public final long[] f12488c;

    /* renamed from: d */
    public final long[] f12489d;

    /* renamed from: e */
    public final long[] f12490e;

    /* renamed from: f */
    public final long f12491f;

    public C1533hf(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f12487b = iArr;
        this.f12488c = jArr;
        this.f12489d = jArr2;
        this.f12490e = jArr3;
        int length = iArr.length;
        this.f12486a = length;
        if (length > 0) {
            this.f12491f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f12491f = 0L;
        }
    }

    /* renamed from: a */
    public int m20831a(long j) {
        return sq1.m10011e(this.f12490e, j, true, true);
    }

    @Override // com.daaw.da1
    /* renamed from: e */
    public boolean mo6932e() {
        return true;
    }

    @Override // com.daaw.da1
    /* renamed from: g */
    public da1.C1068a mo6931g(long j) {
        int m20831a = m20831a(j);
        fa1 fa1Var = new fa1(this.f12490e[m20831a], this.f12488c[m20831a]);
        if (fa1Var.f9302a >= j || m20831a == this.f12486a - 1) {
            return new da1.C1068a(fa1Var);
        }
        int i = m20831a + 1;
        return new da1.C1068a(fa1Var, new fa1(this.f12490e[i], this.f12488c[i]));
    }

    @Override // com.daaw.da1
    /* renamed from: h */
    public long mo6930h() {
        return this.f12491f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f12486a + ", sizes=" + Arrays.toString(this.f12487b) + ", offsets=" + Arrays.toString(this.f12488c) + ", timeUs=" + Arrays.toString(this.f12490e) + ", durationsUs=" + Arrays.toString(this.f12489d) + ")";
    }
}
