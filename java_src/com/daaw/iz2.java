package com.daaw;
/* loaded from: classes.dex */
public final class iz2 {

    /* renamed from: a */
    public byte[] f14125a;

    /* renamed from: b */
    public int f14126b;

    /* renamed from: c */
    public int f14127c;

    public iz2() {
    }

    public iz2(int i) {
        this.f14125a = new byte[i];
        this.f14127c = i;
    }

    public iz2(byte[] bArr) {
        this.f14125a = bArr;
        this.f14127c = bArr.length;
    }

    /* renamed from: a */
    public final int m19246a() {
        return this.f14127c - this.f14126b;
    }

    /* renamed from: b */
    public final int m19245b() {
        byte[] bArr = this.f14125a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: c */
    public final int m19244c() {
        return this.f14126b;
    }

    /* renamed from: d */
    public final int m19243d() {
        return this.f14127c;
    }

    /* renamed from: e */
    public final int m19242e() {
        byte[] bArr = this.f14125a;
        int i = this.f14126b;
        int i2 = i + 1;
        this.f14126b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f14126b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f14126b = i4;
        byte b3 = bArr[i3];
        this.f14126b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: f */
    public final int m19241f() {
        byte[] bArr = this.f14125a;
        int i = this.f14126b;
        int i2 = i + 1;
        this.f14126b = i2;
        byte b = bArr[i];
        this.f14126b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: g */
    public final int m19240g() {
        byte[] bArr = this.f14125a;
        int i = this.f14126b;
        this.f14126b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: h */
    public final int m19239h() {
        byte[] bArr = this.f14125a;
        int i = this.f14126b;
        int i2 = i + 1;
        this.f14126b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f14126b = i3;
        byte b2 = bArr[i2];
        this.f14126b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    /* renamed from: i */
    public final int m19238i() {
        int m19242e = m19242e();
        if (m19242e >= 0) {
            return m19242e;
        }
        throw new IllegalStateException("Top bit not zero: " + m19242e);
    }

    /* renamed from: j */
    public final int m19237j() {
        byte[] bArr = this.f14125a;
        int i = this.f14126b;
        int i2 = i + 1;
        this.f14126b = i2;
        byte b = bArr[i];
        this.f14126b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: k */
    public final long m19236k() {
        byte[] bArr = this.f14125a;
        int i = this.f14126b;
        int i2 = i + 1;
        this.f14126b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f14126b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f14126b = i4;
        byte b3 = bArr[i3];
        this.f14126b = i4 + 1;
        return ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((bArr[i4] & 255) << 24);
    }

    /* renamed from: l */
    public final long m19235l() {
        byte[] bArr = this.f14125a;
        int i = this.f14126b;
        int i2 = i + 1;
        this.f14126b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f14126b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f14126b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f14126b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f14126b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f14126b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f14126b = i8;
        byte b7 = bArr[i7];
        this.f14126b = i8 + 1;
        return ((b2 & 255) << 48) | ((b & 255) << 56) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b6 & 255) << 16) | ((b7 & 255) << 8) | (bArr[i8] & 255);
    }

    /* renamed from: m */
    public final long m19234m() {
        byte[] bArr = this.f14125a;
        int i = this.f14126b;
        int i2 = i + 1;
        this.f14126b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f14126b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f14126b = i4;
        byte b3 = bArr[i3];
        this.f14126b = i4 + 1;
        return ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8) | (bArr[i4] & 255);
    }

    /* renamed from: n */
    public final long m19233n() {
        long m19235l = m19235l();
        if (m19235l >= 0) {
            return m19235l;
        }
        throw new IllegalStateException("Top bit not zero: " + m19235l);
    }

    /* renamed from: o */
    public final String m19232o(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f14126b;
        int i3 = i2 + i;
        int i4 = i3 - 1;
        if (i4 < this.f14127c && this.f14125a[i4] == 0) {
            i--;
        }
        String str = new String(this.f14125a, i2, i);
        this.f14126b = i3;
        return str;
    }

    /* renamed from: p */
    public final short m19231p() {
        byte[] bArr = this.f14125a;
        int i = this.f14126b;
        int i2 = i + 1;
        this.f14126b = i2;
        byte b = bArr[i];
        this.f14126b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: q */
    public final void m19230q(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f14125a, this.f14126b, bArr, i, i2);
        this.f14126b += i2;
    }

    /* renamed from: r */
    public final void m19229r() {
        this.f14126b = 0;
        this.f14127c = 0;
    }

    /* renamed from: s */
    public final void m19228s(int i) {
        m19227t(m19245b() < i ? new byte[i] : this.f14125a, i);
    }

    /* renamed from: t */
    public final void m19227t(byte[] bArr, int i) {
        this.f14125a = bArr;
        this.f14127c = i;
        this.f14126b = 0;
    }

    /* renamed from: u */
    public final void m19226u(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f14125a.length) {
            z = true;
        }
        az2.m26585c(z);
        this.f14127c = i;
    }

    /* renamed from: v */
    public final void m19225v(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f14127c) {
            z = true;
        }
        az2.m26585c(z);
        this.f14126b = i;
    }

    /* renamed from: w */
    public final void m19224w(int i) {
        m19225v(this.f14126b + i);
    }
}
