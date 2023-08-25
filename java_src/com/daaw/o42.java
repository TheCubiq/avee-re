package com.daaw;
/* loaded from: classes.dex */
public final class o42 {

    /* renamed from: a */
    public final byte[] f21034a;

    /* renamed from: b */
    public final int f21035b;

    /* renamed from: c */
    public int f21036c;

    /* renamed from: d */
    public int f21037d;

    public o42(byte[] bArr) {
        this.f21034a = bArr;
        this.f21035b = bArr.length;
    }

    /* renamed from: a */
    public final int m14563a() {
        return (this.f21036c * 8) + this.f21037d;
    }

    /* renamed from: b */
    public final int m14562b(int i) {
        int i2 = this.f21036c;
        int min = Math.min(i, 8 - this.f21037d);
        int i3 = i2 + 1;
        int i4 = ((this.f21034a[i2] & 255) >> this.f21037d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f21034a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        m14561c(i);
        return ((-1) >>> (32 - i)) & i4;
    }

    /* renamed from: c */
    public final void m14561c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f21036c + i3;
        this.f21036c = i4;
        int i5 = this.f21037d + (i - (i3 * 8));
        this.f21037d = i5;
        if (i5 > 7) {
            i4++;
            this.f21036c = i4;
            i5 -= 8;
            this.f21037d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.f21035b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        uo4.m7872f(z);
    }

    /* renamed from: d */
    public final boolean m14560d() {
        byte b = this.f21034a[this.f21036c];
        int i = this.f21037d;
        m14561c(1);
        return 1 == (((b & 255) >> i) & 1);
    }
}
