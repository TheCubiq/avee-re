package com.daaw;
/* loaded from: classes.dex */
public final class ls2 implements us2 {

    /* renamed from: a */
    public final int[] f17728a;

    /* renamed from: b */
    public final long[] f17729b;

    /* renamed from: c */
    public final long[] f17730c;

    /* renamed from: d */
    public final long[] f17731d;

    /* renamed from: e */
    public final long f17732e;

    public ls2(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f17728a = iArr;
        this.f17729b = jArr;
        this.f17730c = jArr2;
        this.f17731d = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.f17732e = 0L;
            return;
        }
        int i = length - 1;
        this.f17732e = jArr2[i] + jArr3[i];
    }

    @Override // com.daaw.us2
    /* renamed from: a */
    public final long mo7742a(long j) {
        return this.f17729b[pz2.m12847c(this.f17731d, j, true, true)];
    }

    @Override // com.daaw.us2
    public final long zza() {
        return this.f17732e;
    }

    @Override // com.daaw.us2
    public final boolean zzc() {
        return true;
    }
}
