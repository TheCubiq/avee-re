package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class yo8 {

    /* renamed from: a */
    public int f33905a = 0;

    /* renamed from: b */
    public int f33906b = -1;

    /* renamed from: c */
    public int f33907c = 0;

    /* renamed from: d */
    public int[] f33908d;

    /* renamed from: e */
    public int f33909e;

    public yo8() {
        int[] iArr = new int[16];
        this.f33908d = iArr;
        this.f33909e = iArr.length - 1;
    }

    /* renamed from: a */
    public final int m3474a() {
        int i = this.f33907c;
        if (i != 0) {
            int[] iArr = this.f33908d;
            int i2 = this.f33905a;
            int i3 = iArr[i2];
            this.f33905a = (i2 + 1) & this.f33909e;
            this.f33907c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final void m3473b(int i) {
        int i2 = this.f33907c;
        int[] iArr = this.f33908d;
        int length = iArr.length;
        if (i2 == length) {
            int i3 = length + length;
            if (i3 < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[i3];
            int i4 = this.f33905a;
            int i5 = length - i4;
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.f33908d, 0, iArr2, i5, i4);
            this.f33905a = 0;
            this.f33906b = this.f33907c - 1;
            this.f33908d = iArr2;
            this.f33909e = iArr2.length - 1;
            iArr = iArr2;
        }
        int i6 = (this.f33906b + 1) & this.f33909e;
        this.f33906b = i6;
        iArr[i6] = i;
        this.f33907c++;
    }

    /* renamed from: c */
    public final void m3472c() {
        this.f33905a = 0;
        this.f33906b = -1;
        this.f33907c = 0;
    }

    /* renamed from: d */
    public final boolean m3471d() {
        return this.f33907c == 0;
    }
}
