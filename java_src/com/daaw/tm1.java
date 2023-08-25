package com.daaw;
/* loaded from: classes.dex */
public final class tm1 {

    /* renamed from: a */
    public final int f27859a;

    /* renamed from: b */
    public final long[] f27860b;

    /* renamed from: c */
    public final int[] f27861c;

    /* renamed from: d */
    public final int f27862d;

    /* renamed from: e */
    public final long[] f27863e;

    /* renamed from: f */
    public final int[] f27864f;

    /* renamed from: g */
    public final long f27865g;

    public tm1(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        C2914s6.m10690a(iArr.length == jArr2.length);
        C2914s6.m10690a(jArr.length == jArr2.length);
        C2914s6.m10690a(iArr2.length == jArr2.length);
        this.f27860b = jArr;
        this.f27861c = iArr;
        this.f27862d = i;
        this.f27863e = jArr2;
        this.f27864f = iArr2;
        this.f27865g = j;
        this.f27859a = jArr.length;
    }

    /* renamed from: a */
    public int m8968a(long j) {
        for (int m10011e = sq1.m10011e(this.f27863e, j, true, false); m10011e >= 0; m10011e--) {
            if ((this.f27864f[m10011e] & 1) != 0) {
                return m10011e;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m8967b(long j) {
        for (int m10014c = sq1.m10014c(this.f27863e, j, true, false); m10014c < this.f27863e.length; m10014c++) {
            if ((this.f27864f[m10014c] & 1) != 0) {
                return m10014c;
            }
        }
        return -1;
    }
}
