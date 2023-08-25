package com.daaw;

import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ik5 {

    /* renamed from: a */
    public byte[] f13718a;

    /* renamed from: b */
    public int f13719b;

    /* renamed from: c */
    public int f13720c;

    public ik5() {
        this.f13718a = it5.f13996f;
    }

    public ik5(int i) {
        this.f13718a = new byte[i];
        this.f13720c = i;
    }

    public ik5(byte[] bArr) {
        this.f13718a = bArr;
        this.f13720c = bArr.length;
    }

    public ik5(byte[] bArr, int i) {
        this.f13718a = bArr;
        this.f13720c = i;
    }

    /* renamed from: A */
    public final long m19729A() {
        byte[] bArr = this.f13718a;
        int i = this.f13719b;
        int i2 = i + 1;
        this.f13719b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13719b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13719b = i4;
        byte b3 = bArr[i3];
        this.f13719b = i4 + 1;
        return ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8) | (bArr[i4] & 255);
    }

    /* renamed from: B */
    public final long m19728B() {
        long m19696z = m19696z();
        if (m19696z >= 0) {
            return m19696z;
        }
        throw new IllegalStateException("Top bit not zero: " + m19696z);
    }

    /* renamed from: C */
    public final long m19727C() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.f13718a[this.f13719b];
        int i4 = 7;
        while (true) {
            i = 0;
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i = 7 - i4;
            } else if (i4 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i2 = 1; i2 < i; i2++) {
            if ((this.f13718a[this.f13719b + i2] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (b & 63);
        }
        this.f13719b += i;
        return j;
    }

    /* renamed from: D */
    public final String m19726D(char c) {
        int i = this.f13720c;
        int i2 = this.f13719b;
        if (i - i2 != 0) {
            while (i2 < this.f13720c && this.f13718a[i2] != 0) {
                i2++;
            }
            byte[] bArr = this.f13718a;
            int i3 = this.f13719b;
            String m19387j = it5.m19387j(bArr, i3, i2 - i3);
            this.f13719b = i2;
            if (i2 < this.f13720c) {
                this.f13719b = i2 + 1;
            }
            return m19387j;
        }
        return null;
    }

    /* renamed from: E */
    public final String m19725E(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f13719b;
        int i3 = (i2 + i) - 1;
        String m19387j = it5.m19387j(this.f13718a, i2, (i3 >= this.f13720c || this.f13718a[i3] != 0) ? i : i - 1);
        this.f13719b += i;
        return m19387j;
    }

    /* renamed from: F */
    public final String m19724F(int i, Charset charset) {
        byte[] bArr = this.f13718a;
        int i2 = this.f13719b;
        String str = new String(bArr, i2, i, charset);
        this.f13719b = i2 + i;
        return str;
    }

    /* renamed from: G */
    public final short m19723G() {
        byte[] bArr = this.f13718a;
        int i = this.f13719b;
        int i2 = i + 1;
        this.f13719b = i2;
        byte b = bArr[i];
        this.f13719b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: H */
    public final void m19722H(int i) {
        byte[] bArr = this.f13718a;
        if (i > bArr.length) {
            this.f13718a = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: a */
    public final void m19721a(cj5 cj5Var, int i) {
        m19720b(cj5Var.f5841a, 0, i);
        cj5Var.m25324h(0);
    }

    /* renamed from: b */
    public final void m19720b(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f13718a, this.f13719b, bArr, i, i2);
        this.f13719b += i2;
    }

    /* renamed from: c */
    public final void m19719c(int i) {
        byte[] bArr = this.f13718a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m19718d(bArr, i);
    }

    /* renamed from: d */
    public final void m19718d(byte[] bArr, int i) {
        this.f13718a = bArr;
        this.f13720c = i;
        this.f13719b = 0;
    }

    /* renamed from: e */
    public final void m19717e(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f13718a.length) {
            z = true;
        }
        uo4.m7874d(z);
        this.f13720c = i;
    }

    /* renamed from: f */
    public final void m19716f(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f13720c) {
            z = true;
        }
        uo4.m7874d(z);
        this.f13719b = i;
    }

    /* renamed from: g */
    public final void m19715g(int i) {
        m19716f(this.f13719b + i);
    }

    /* renamed from: h */
    public final byte[] m19714h() {
        return this.f13718a;
    }

    /* renamed from: i */
    public final int m19713i() {
        return this.f13720c - this.f13719b;
    }

    /* renamed from: j */
    public final int m19712j() {
        return this.f13718a.length;
    }

    /* renamed from: k */
    public final int m19711k() {
        return this.f13719b;
    }

    /* renamed from: l */
    public final int m19710l() {
        return this.f13720c;
    }

    /* renamed from: m */
    public final int m19709m() {
        byte[] bArr = this.f13718a;
        int i = this.f13719b;
        int i2 = i + 1;
        this.f13719b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13719b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13719b = i4;
        byte b3 = bArr[i3];
        this.f13719b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: n */
    public final int m19708n() {
        byte[] bArr = this.f13718a;
        int i = this.f13719b;
        int i2 = i + 1;
        this.f13719b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13719b = i3;
        byte b2 = bArr[i2];
        this.f13719b = i3 + 1;
        return (bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8);
    }

    /* renamed from: o */
    public final int m19707o() {
        byte[] bArr = this.f13718a;
        int i = this.f13719b;
        int i2 = i + 1;
        this.f13719b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13719b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13719b = i4;
        byte b3 = bArr[i3];
        this.f13719b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    /* renamed from: p */
    public final int m19706p() {
        int m19707o = m19707o();
        if (m19707o >= 0) {
            return m19707o;
        }
        throw new IllegalStateException("Top bit not zero: " + m19707o);
    }

    /* renamed from: q */
    public final int m19705q() {
        byte[] bArr = this.f13718a;
        int i = this.f13719b;
        int i2 = i + 1;
        this.f13719b = i2;
        byte b = bArr[i];
        this.f13719b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: r */
    public final int m19704r() {
        return (m19703s() << 21) | (m19703s() << 14) | (m19703s() << 7) | m19703s();
    }

    /* renamed from: s */
    public final int m19703s() {
        byte[] bArr = this.f13718a;
        int i = this.f13719b;
        this.f13719b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: t */
    public final int m19702t() {
        byte[] bArr = this.f13718a;
        int i = this.f13719b;
        int i2 = i + 1;
        this.f13719b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13719b = i3;
        byte b2 = bArr[i2];
        this.f13719b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    /* renamed from: u */
    public final int m19701u() {
        byte[] bArr = this.f13718a;
        int i = this.f13719b;
        int i2 = i + 1;
        this.f13719b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13719b = i3;
        byte b2 = bArr[i2];
        this.f13719b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    /* renamed from: v */
    public final int m19700v() {
        int m19709m = m19709m();
        if (m19709m >= 0) {
            return m19709m;
        }
        throw new IllegalStateException("Top bit not zero: " + m19709m);
    }

    /* renamed from: w */
    public final int m19699w() {
        byte[] bArr = this.f13718a;
        int i = this.f13719b;
        int i2 = i + 1;
        this.f13719b = i2;
        byte b = bArr[i];
        this.f13719b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: x */
    public final long m19698x() {
        byte[] bArr = this.f13718a;
        int i = this.f13719b;
        int i2 = i + 1;
        this.f13719b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13719b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13719b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f13719b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f13719b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f13719b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f13719b = i8;
        byte b7 = bArr[i7];
        this.f13719b = i8 + 1;
        return ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((b4 & 255) << 24) | ((b5 & 255) << 32) | ((b6 & 255) << 40) | ((b7 & 255) << 48) | ((bArr[i8] & 255) << 56);
    }

    /* renamed from: y */
    public final long m19697y() {
        byte[] bArr = this.f13718a;
        int i = this.f13719b;
        int i2 = i + 1;
        this.f13719b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13719b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13719b = i4;
        byte b3 = bArr[i3];
        this.f13719b = i4 + 1;
        return ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((bArr[i4] & 255) << 24);
    }

    /* renamed from: z */
    public final long m19696z() {
        byte[] bArr = this.f13718a;
        int i = this.f13719b;
        int i2 = i + 1;
        this.f13719b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13719b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13719b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f13719b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f13719b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f13719b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f13719b = i8;
        byte b7 = bArr[i7];
        this.f13719b = i8 + 1;
        return ((b2 & 255) << 48) | ((b & 255) << 56) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b6 & 255) << 16) | ((b7 & 255) << 8) | (bArr[i8] & 255);
    }
}
