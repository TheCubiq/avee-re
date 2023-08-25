package com.daaw;

import java.util.Arrays;
import java.util.Random;
/* loaded from: classes.dex */
public final class wt8 {

    /* renamed from: a */
    public final Random f31511a;

    /* renamed from: b */
    public final int[] f31512b;

    /* renamed from: c */
    public final int[] f31513c;

    public wt8(int i) {
        this(0, new Random());
    }

    public wt8(int i, Random random) {
        this(new int[0], random);
    }

    public wt8(int[] iArr, Random random) {
        this.f31512b = iArr;
        this.f31511a = random;
        this.f31513c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f31513c[iArr[i]] = i;
        }
    }

    /* renamed from: a */
    public final int m5802a() {
        int[] iArr = this.f31512b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    /* renamed from: b */
    public final int m5801b() {
        int[] iArr = this.f31512b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int m5800c() {
        return this.f31512b.length;
    }

    /* renamed from: d */
    public final int m5799d(int i) {
        int i2 = this.f31513c[i] + 1;
        int[] iArr = this.f31512b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* renamed from: e */
    public final int m5798e(int i) {
        int i2 = this.f31513c[i] - 1;
        if (i2 >= 0) {
            return this.f31512b[i2];
        }
        return -1;
    }

    /* renamed from: f */
    public final wt8 m5797f() {
        return new wt8(0, new Random(this.f31511a.nextLong()));
    }

    /* renamed from: g */
    public final wt8 m5796g(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            iArr[i4] = this.f31511a.nextInt(this.f31512b.length + 1);
            int i5 = i4 + 1;
            int nextInt = this.f31511a.nextInt(i5);
            iArr2[i4] = iArr2[nextInt];
            iArr2[nextInt] = i4;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.f31512b.length + i2];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr4 = this.f31512b;
            if (i3 >= iArr4.length + i2) {
                return new wt8(iArr3, new Random(this.f31511a.nextLong()));
            }
            if (i6 >= i2 || i7 != iArr[i6]) {
                int i8 = i7 + 1;
                int i9 = iArr4[i7];
                iArr3[i3] = i9;
                if (i9 >= 0) {
                    iArr3[i3] = i9 + i2;
                }
                i7 = i8;
            } else {
                iArr3[i3] = iArr2[i6];
                i6++;
            }
            i3++;
        }
    }

    /* renamed from: h */
    public final wt8 m5795h(int i, int i2) {
        int[] iArr = new int[this.f31512b.length - i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f31512b;
            if (i3 >= iArr2.length) {
                return new wt8(iArr, new Random(this.f31511a.nextLong()));
            }
            int i5 = iArr2[i3];
            if (i5 < 0 || i5 >= i2) {
                int i6 = i3 - i4;
                if (i5 >= 0) {
                    i5 -= i2;
                }
                iArr[i6] = i5;
            } else {
                i4++;
            }
            i3++;
        }
    }
}
