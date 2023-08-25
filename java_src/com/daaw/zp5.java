package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zp5 {

    /* renamed from: a */
    public long[] f35380a = new long[10];

    /* renamed from: b */
    public Object[] f35381b = new Object[10];

    /* renamed from: c */
    public int f35382c;

    /* renamed from: d */
    public int f35383d;

    public zp5(int i) {
    }

    /* renamed from: a */
    public final synchronized int m2004a() {
        return this.f35383d;
    }

    /* renamed from: b */
    public final synchronized Object m2003b() {
        if (this.f35383d == 0) {
            return null;
        }
        return m1999f();
    }

    /* renamed from: c */
    public final synchronized Object m2002c(long j) {
        Object obj;
        obj = null;
        while (this.f35383d > 0 && j - this.f35380a[this.f35382c] >= 0) {
            obj = m1999f();
        }
        return obj;
    }

    /* renamed from: d */
    public final synchronized void m2001d(long j, Object obj) {
        int i = this.f35383d;
        if (i > 0) {
            if (j <= this.f35380a[((this.f35382c + i) - 1) % this.f35381b.length]) {
                m2000e();
            }
        }
        int length = this.f35381b.length;
        if (this.f35383d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            Object[] objArr = new Object[i2];
            int i3 = this.f35382c;
            int i4 = length - i3;
            System.arraycopy(this.f35380a, i3, jArr, 0, i4);
            System.arraycopy(this.f35381b, this.f35382c, objArr, 0, i4);
            int i5 = this.f35382c;
            if (i5 > 0) {
                System.arraycopy(this.f35380a, 0, jArr, i4, i5);
                System.arraycopy(this.f35381b, 0, objArr, i4, this.f35382c);
            }
            this.f35380a = jArr;
            this.f35381b = objArr;
            this.f35382c = 0;
        }
        int i6 = this.f35382c;
        int i7 = this.f35383d;
        Object[] objArr2 = this.f35381b;
        int length2 = (i6 + i7) % objArr2.length;
        this.f35380a[length2] = j;
        objArr2[length2] = obj;
        this.f35383d = i7 + 1;
    }

    /* renamed from: e */
    public final synchronized void m2000e() {
        this.f35382c = 0;
        this.f35383d = 0;
        Arrays.fill(this.f35381b, (Object) null);
    }

    /* renamed from: f */
    public final Object m1999f() {
        uo4.m7872f(this.f35383d > 0);
        Object[] objArr = this.f35381b;
        int i = this.f35382c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f35382c = (i + 1) % objArr.length;
        this.f35383d--;
        return obj;
    }
}
