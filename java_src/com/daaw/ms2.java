package com.daaw;

import java.io.EOFException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ms2 {

    /* renamed from: g */
    public static final byte[] f19122g = new byte[4096];

    /* renamed from: a */
    public final kx2 f19123a;

    /* renamed from: b */
    public final long f19124b;

    /* renamed from: c */
    public long f19125c;

    /* renamed from: d */
    public byte[] f19126d = new byte[65536];

    /* renamed from: e */
    public int f19127e;

    /* renamed from: f */
    public int f19128f;

    public ms2(kx2 kx2Var, long j, long j2) {
        this.f19123a = kx2Var;
        this.f19125c = j;
        this.f19124b = j2;
    }

    /* renamed from: a */
    public final int m15804a(byte[] bArr, int i, int i2) {
        int m15794k = m15794k(bArr, i, i2);
        if (m15794k == 0) {
            m15794k = m15795j(bArr, i, i2, 0, true);
        }
        m15792m(m15794k);
        return m15794k;
    }

    /* renamed from: b */
    public final int m15803b(int i) {
        int m15793l = m15793l(i);
        if (m15793l == 0) {
            m15793l = m15795j(f19122g, 0, Math.min(i, 4096), 0, true);
        }
        m15792m(m15793l);
        return m15793l;
    }

    /* renamed from: c */
    public final long m15802c() {
        return this.f19124b;
    }

    /* renamed from: d */
    public final long m15801d() {
        return this.f19125c;
    }

    /* renamed from: e */
    public final void m15800e() {
        this.f19127e = 0;
    }

    /* renamed from: f */
    public final boolean m15799f(int i, boolean z) {
        int i2 = this.f19127e + i;
        int length = this.f19126d.length;
        if (i2 > length) {
            this.f19126d = Arrays.copyOf(this.f19126d, pz2.m12845e(length + length, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f19128f - this.f19127e, i);
        while (min < i) {
            min = m15795j(this.f19126d, this.f19127e, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.f19127e + i;
        this.f19127e = i3;
        this.f19128f = Math.max(this.f19128f, i3);
        return true;
    }

    /* renamed from: g */
    public final boolean m15798g(byte[] bArr, int i, int i2, boolean z) {
        if (m15799f(i2, false)) {
            System.arraycopy(this.f19126d, this.f19127e - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m15797h(byte[] bArr, int i, int i2, boolean z) {
        int m15794k = m15794k(bArr, i, i2);
        while (m15794k < i2 && m15794k != -1) {
            m15794k = m15795j(bArr, i, i2, m15794k, z);
        }
        m15792m(m15794k);
        return m15794k != -1;
    }

    /* renamed from: i */
    public final boolean m15796i(int i, boolean z) {
        int m15793l = m15793l(i);
        while (m15793l < i && m15793l != -1) {
            m15793l = m15795j(f19122g, -m15793l, Math.min(i, m15793l + 4096), m15793l, false);
        }
        m15792m(m15793l);
        return m15793l != -1;
    }

    /* renamed from: j */
    public final int m15795j(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int mo5585a = this.f19123a.mo5585a(bArr, i + i3, i2 - i3);
        if (mo5585a == -1) {
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        return i3 + mo5585a;
    }

    /* renamed from: k */
    public final int m15794k(byte[] bArr, int i, int i2) {
        int i3 = this.f19128f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f19126d, 0, bArr, i, min);
        m15791n(min);
        return min;
    }

    /* renamed from: l */
    public final int m15793l(int i) {
        int min = Math.min(this.f19128f, i);
        m15791n(min);
        return min;
    }

    /* renamed from: m */
    public final void m15792m(int i) {
        if (i != -1) {
            this.f19125c += i;
        }
    }

    /* renamed from: n */
    public final void m15791n(int i) {
        int i2 = this.f19128f - i;
        this.f19128f = i2;
        this.f19127e = 0;
        byte[] bArr = this.f19126d;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f19126d = bArr2;
    }
}
