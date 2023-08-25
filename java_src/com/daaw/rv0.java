package com.daaw;

import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class rv0 {

    /* renamed from: a */
    public byte[] f25637a;

    /* renamed from: b */
    public int f25638b;

    /* renamed from: c */
    public int f25639c;

    public rv0() {
    }

    public rv0(int i) {
        this.f25637a = new byte[i];
        this.f25639c = i;
    }

    public rv0(byte[] bArr) {
        this.f25637a = bArr;
        this.f25639c = bArr.length;
    }

    public rv0(byte[] bArr, int i) {
        this.f25637a = bArr;
        this.f25639c = i;
    }

    /* renamed from: A */
    public int m10930A() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        int i2 = i + 1;
        this.f25638b = i2;
        int i3 = i2 + 1;
        this.f25638b = i3;
        int i4 = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f25638b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    /* renamed from: B */
    public int m10929B() {
        int m10911i = m10911i();
        if (m10911i >= 0) {
            return m10911i;
        }
        throw new IllegalStateException("Top bit not zero: " + m10911i);
    }

    /* renamed from: C */
    public long m10928C() {
        long m10903q = m10903q();
        if (m10903q >= 0) {
            return m10903q;
        }
        throw new IllegalStateException("Top bit not zero: " + m10903q);
    }

    /* renamed from: D */
    public int m10927D() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        int i2 = i + 1;
        this.f25638b = i2;
        this.f25638b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: E */
    public long m10926E() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.f25637a[this.f25638b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            if ((this.f25637a[this.f25638b + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (b & 63);
        }
        this.f25638b += i2;
        return j;
    }

    /* renamed from: F */
    public void m10925F() {
        this.f25638b = 0;
        this.f25639c = 0;
    }

    /* renamed from: G */
    public void m10924G(int i) {
        m10923H(m10918b() < i ? new byte[i] : this.f25637a, i);
    }

    /* renamed from: H */
    public void m10923H(byte[] bArr, int i) {
        this.f25637a = bArr;
        this.f25639c = i;
        this.f25638b = 0;
    }

    /* renamed from: I */
    public void m10922I(int i) {
        C2914s6.m10690a(i >= 0 && i <= this.f25637a.length);
        this.f25639c = i;
    }

    /* renamed from: J */
    public void m10921J(int i) {
        C2914s6.m10690a(i >= 0 && i <= this.f25639c);
        this.f25638b = i;
    }

    /* renamed from: K */
    public void m10920K(int i) {
        m10921J(this.f25638b + i);
    }

    /* renamed from: a */
    public int m10919a() {
        return this.f25639c - this.f25638b;
    }

    /* renamed from: b */
    public int m10918b() {
        byte[] bArr = this.f25637a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: c */
    public int m10917c() {
        return this.f25638b;
    }

    /* renamed from: d */
    public int m10916d() {
        return this.f25639c;
    }

    /* renamed from: e */
    public char m10915e() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: f */
    public void m10914f(qv0 qv0Var, int i) {
        m10913g(qv0Var.f24432a, 0, i);
        qv0Var.m12120m(0);
    }

    /* renamed from: g */
    public void m10913g(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f25637a, this.f25638b, bArr, i, i2);
        this.f25638b += i2;
    }

    /* renamed from: h */
    public double m10912h() {
        return Double.longBitsToDouble(m10903q());
    }

    /* renamed from: i */
    public int m10911i() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        int i2 = i + 1;
        this.f25638b = i2;
        int i3 = i2 + 1;
        this.f25638b = i3;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i5 = i3 + 1;
        this.f25638b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.f25638b = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    /* renamed from: j */
    public int m10910j() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        int i2 = i + 1;
        this.f25638b = i2;
        int i3 = i2 + 1;
        this.f25638b = i3;
        int i4 = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        this.f25638b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    /* renamed from: k */
    public String m10909k() {
        if (m10919a() == 0) {
            return null;
        }
        int i = this.f25638b;
        while (i < this.f25639c && !sq1.m10035J(this.f25637a[i])) {
            i++;
        }
        int i2 = this.f25638b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f25637a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f25638b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f25637a;
        int i3 = this.f25638b;
        String m9999q = sq1.m9999q(bArr2, i3, i - i3);
        this.f25638b = i;
        int i4 = this.f25639c;
        if (i == i4) {
            return m9999q;
        }
        byte[] bArr3 = this.f25637a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f25638b = i5;
            if (i5 == i4) {
                return m9999q;
            }
        }
        int i6 = this.f25638b;
        if (bArr3[i6] == 10) {
            this.f25638b = i6 + 1;
        }
        return m9999q;
    }

    /* renamed from: l */
    public int m10908l() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        int i2 = i + 1;
        this.f25638b = i2;
        int i3 = i2 + 1;
        this.f25638b = i3;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i5 = i3 + 1;
        this.f25638b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        this.f25638b = i5 + 1;
        return ((bArr[i5] & 255) << 24) | i6;
    }

    /* renamed from: m */
    public long m10907m() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        int i2 = i + 1;
        this.f25638b = i2;
        int i3 = i2 + 1;
        this.f25638b = i3;
        int i4 = i3 + 1;
        this.f25638b = i4;
        int i5 = i4 + 1;
        this.f25638b = i5;
        int i6 = i5 + 1;
        this.f25638b = i6;
        int i7 = i6 + 1;
        this.f25638b = i7;
        int i8 = i7 + 1;
        this.f25638b = i8;
        this.f25638b = i8 + 1;
        return ((bArr[i8] & 255) << 56) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((bArr[i7] & 255) << 48);
    }

    /* renamed from: n */
    public long m10906n() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        int i2 = i + 1;
        this.f25638b = i2;
        int i3 = i2 + 1;
        this.f25638b = i3;
        int i4 = i3 + 1;
        this.f25638b = i4;
        this.f25638b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    /* renamed from: o */
    public int m10905o() {
        int m10908l = m10908l();
        if (m10908l >= 0) {
            return m10908l;
        }
        throw new IllegalStateException("Top bit not zero: " + m10908l);
    }

    /* renamed from: p */
    public int m10904p() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        int i2 = i + 1;
        this.f25638b = i2;
        this.f25638b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: q */
    public long m10903q() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        int i2 = i + 1;
        this.f25638b = i2;
        int i3 = i2 + 1;
        this.f25638b = i3;
        int i4 = i3 + 1;
        this.f25638b = i4;
        int i5 = i4 + 1;
        this.f25638b = i5;
        int i6 = i5 + 1;
        this.f25638b = i6;
        int i7 = i6 + 1;
        this.f25638b = i7;
        int i8 = i7 + 1;
        this.f25638b = i8;
        this.f25638b = i8 + 1;
        return (bArr[i8] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40) | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8);
    }

    /* renamed from: r */
    public String m10902r() {
        if (m10919a() == 0) {
            return null;
        }
        int i = this.f25638b;
        while (i < this.f25639c && this.f25637a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f25637a;
        int i2 = this.f25638b;
        String m9999q = sq1.m9999q(bArr, i2, i - i2);
        this.f25638b = i;
        if (i < this.f25639c) {
            this.f25638b = i + 1;
        }
        return m9999q;
    }

    /* renamed from: s */
    public String m10901s(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f25638b;
        int i3 = (i2 + i) - 1;
        String m9999q = sq1.m9999q(this.f25637a, i2, (i3 >= this.f25639c || this.f25637a[i3] != 0) ? i : i - 1);
        this.f25638b += i;
        return m9999q;
    }

    /* renamed from: t */
    public short m10900t() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        int i2 = i + 1;
        this.f25638b = i2;
        this.f25638b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: u */
    public String m10899u(int i) {
        return m10898v(i, Charset.forName("UTF-8"));
    }

    /* renamed from: v */
    public String m10898v(int i, Charset charset) {
        String str = new String(this.f25637a, this.f25638b, i, charset);
        this.f25638b += i;
        return str;
    }

    /* renamed from: w */
    public int m10897w() {
        return (m10896x() << 21) | (m10896x() << 14) | (m10896x() << 7) | m10896x();
    }

    /* renamed from: x */
    public int m10896x() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        this.f25638b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: y */
    public int m10895y() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        int i2 = i + 1;
        this.f25638b = i2;
        int i3 = i2 + 1;
        this.f25638b = i3;
        int i4 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f25638b = i3 + 2;
        return i4;
    }

    /* renamed from: z */
    public long m10894z() {
        byte[] bArr = this.f25637a;
        int i = this.f25638b;
        int i2 = i + 1;
        this.f25638b = i2;
        int i3 = i2 + 1;
        this.f25638b = i3;
        int i4 = i3 + 1;
        this.f25638b = i4;
        this.f25638b = i4 + 1;
        return (bArr[i4] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }
}
