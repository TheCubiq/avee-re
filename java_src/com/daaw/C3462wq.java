package com.daaw;

import java.io.EOFException;
import java.util.Arrays;
/* renamed from: com.daaw.wq */
/* loaded from: classes.dex */
public final class C3462wq implements a00 {

    /* renamed from: b */
    public final InterfaceC2200mp f31447b;

    /* renamed from: c */
    public final long f31448c;

    /* renamed from: d */
    public long f31449d;

    /* renamed from: f */
    public int f31451f;

    /* renamed from: g */
    public int f31452g;

    /* renamed from: e */
    public byte[] f31450e = new byte[65536];

    /* renamed from: a */
    public final byte[] f31446a = new byte[4096];

    public C3462wq(InterfaceC2200mp interfaceC2200mp, long j, long j2) {
        this.f31447b = interfaceC2200mp;
        this.f31449d = j;
        this.f31448c = j2;
    }

    @Override // com.daaw.a00
    /* renamed from: a */
    public int mo5866a(int i) {
        int m5850q = m5850q(i);
        if (m5850q == 0) {
            byte[] bArr = this.f31446a;
            m5850q = m5852o(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m5854m(m5850q);
        return m5850q;
    }

    @Override // com.daaw.a00
    /* renamed from: b */
    public int mo5865b(byte[] bArr, int i, int i2) {
        int m5851p = m5851p(bArr, i, i2);
        if (m5851p == 0) {
            m5851p = m5852o(bArr, i, i2, 0, true);
        }
        m5854m(m5851p);
        return m5851p;
    }

    @Override // com.daaw.a00
    /* renamed from: c */
    public boolean mo5864c(byte[] bArr, int i, int i2, boolean z) {
        int m5851p = m5851p(bArr, i, i2);
        while (m5851p < i2 && m5851p != -1) {
            m5851p = m5852o(bArr, i, i2, m5851p, z);
        }
        m5854m(m5851p);
        return m5851p != -1;
    }

    @Override // com.daaw.a00
    /* renamed from: d */
    public boolean mo5863d(byte[] bArr, int i, int i2, boolean z) {
        if (m5855l(i2, z)) {
            System.arraycopy(this.f31450e, this.f31451f - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    @Override // com.daaw.a00
    /* renamed from: e */
    public long mo5862e() {
        return this.f31449d + this.f31451f;
    }

    @Override // com.daaw.a00
    /* renamed from: f */
    public void mo5861f(byte[] bArr, int i, int i2) {
        mo5864c(bArr, i, i2, false);
    }

    @Override // com.daaw.a00
    /* renamed from: g */
    public void mo5860g(int i) {
        m5855l(i, false);
    }

    @Override // com.daaw.a00
    public long getPosition() {
        return this.f31449d;
    }

    @Override // com.daaw.a00
    /* renamed from: h */
    public long mo5859h() {
        return this.f31448c;
    }

    @Override // com.daaw.a00
    /* renamed from: i */
    public void mo5858i() {
        this.f31451f = 0;
    }

    @Override // com.daaw.a00
    /* renamed from: j */
    public void mo5857j(int i) {
        m5849r(i, false);
    }

    @Override // com.daaw.a00
    /* renamed from: k */
    public void mo5856k(byte[] bArr, int i, int i2) {
        mo5863d(bArr, i, i2, false);
    }

    /* renamed from: l */
    public boolean m5855l(int i, boolean z) {
        m5853n(i);
        int min = Math.min(this.f31452g - this.f31451f, i);
        while (min < i) {
            min = m5852o(this.f31450e, this.f31451f, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i2 = this.f31451f + i;
        this.f31451f = i2;
        this.f31452g = Math.max(this.f31452g, i2);
        return true;
    }

    /* renamed from: m */
    public final void m5854m(int i) {
        if (i != -1) {
            this.f31449d += i;
        }
    }

    /* renamed from: n */
    public final void m5853n(int i) {
        int i2 = this.f31451f + i;
        byte[] bArr = this.f31450e;
        if (i2 > bArr.length) {
            this.f31450e = Arrays.copyOf(this.f31450e, sq1.m10004l(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: o */
    public final int m5852o(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int mo8642b = this.f31447b.mo8642b(bArr, i + i3, i2 - i3);
        if (mo8642b == -1) {
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        return i3 + mo8642b;
    }

    /* renamed from: p */
    public final int m5851p(byte[] bArr, int i, int i2) {
        int i3 = this.f31452g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f31450e, 0, bArr, i, min);
        m5848s(min);
        return min;
    }

    /* renamed from: q */
    public final int m5850q(int i) {
        int min = Math.min(this.f31452g, i);
        m5848s(min);
        return min;
    }

    /* renamed from: r */
    public boolean m5849r(int i, boolean z) {
        int m5850q = m5850q(i);
        while (m5850q < i && m5850q != -1) {
            m5850q = m5852o(this.f31446a, -m5850q, Math.min(i, this.f31446a.length + m5850q), m5850q, z);
        }
        m5854m(m5850q);
        return m5850q != -1;
    }

    /* renamed from: s */
    public final void m5848s(int i) {
        int i2 = this.f31452g - i;
        this.f31452g = i2;
        this.f31451f = 0;
        byte[] bArr = this.f31450e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f31450e = bArr2;
    }
}
