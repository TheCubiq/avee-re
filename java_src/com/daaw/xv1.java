package com.daaw;
/* loaded from: classes.dex */
public final class xv1 {

    /* renamed from: a */
    public final byte[] f32980a;

    /* renamed from: b */
    public final int f32981b;

    /* renamed from: c */
    public int f32982c;

    /* renamed from: d */
    public int f32983d;

    public xv1(byte[] bArr) {
        this.f32980a = bArr;
        this.f32981b = bArr.length;
    }

    /* renamed from: a */
    public final void m4490a() {
        int i;
        int i2 = this.f32982c;
        C2914s6.m10685f(i2 >= 0 && (i2 < (i = this.f32981b) || (i2 == i && this.f32983d == 0)));
    }

    /* renamed from: b */
    public int m4489b() {
        return (this.f32982c * 8) + this.f32983d;
    }

    /* renamed from: c */
    public boolean m4488c() {
        boolean z = (((this.f32980a[this.f32982c] & 255) >> this.f32983d) & 1) == 1;
        m4486e(1);
        return z;
    }

    /* renamed from: d */
    public int m4487d(int i) {
        int i2 = this.f32982c;
        int min = Math.min(i, 8 - this.f32983d);
        int i3 = i2 + 1;
        int i4 = ((this.f32980a[i2] & 255) >> this.f32983d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f32980a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m4486e(i);
        return i5;
    }

    /* renamed from: e */
    public void m4486e(int i) {
        int i2 = i / 8;
        int i3 = this.f32982c + i2;
        this.f32982c = i3;
        int i4 = this.f32983d + (i - (i2 * 8));
        this.f32983d = i4;
        if (i4 > 7) {
            this.f32982c = i3 + 1;
            this.f32983d = i4 - 8;
        }
        m4490a();
    }
}
