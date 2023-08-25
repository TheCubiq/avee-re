package com.daaw;
/* loaded from: classes.dex */
public final class l20 {

    /* renamed from: com.daaw.l20$b */
    /* loaded from: classes.dex */
    public static final class C2008b {

        /* renamed from: a */
        public final long[] f16964a;

        /* renamed from: b */
        public final int[] f16965b;

        /* renamed from: c */
        public final int f16966c;

        /* renamed from: d */
        public final long[] f16967d;

        /* renamed from: e */
        public final int[] f16968e;

        /* renamed from: f */
        public final long f16969f;

        public C2008b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f16964a = jArr;
            this.f16965b = iArr;
            this.f16966c = i;
            this.f16967d = jArr2;
            this.f16968e = iArr2;
            this.f16969f = j;
        }
    }

    /* renamed from: a */
    public static C2008b m17196a(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += sq1.m10010f(i4, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr2 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr3 = new int[i3];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            long j2 = jArr[i8];
            while (i9 > 0) {
                int min = Math.min(i2, i9);
                jArr2[i6] = j2;
                iArr2[i6] = i * min;
                i7 = Math.max(i7, iArr2[i6]);
                jArr3[i6] = i5 * j;
                iArr3[i6] = 1;
                j2 += iArr2[i6];
                i5 += min;
                i9 -= min;
                i6++;
            }
        }
        return new C2008b(jArr2, iArr2, i7, jArr3, iArr3, j * i5);
    }
}
