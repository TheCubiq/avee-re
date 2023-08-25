package com.daaw;

import java.io.OutputStream;
/* loaded from: classes.dex */
public final class or7 extends lr7 {

    /* renamed from: h */
    public final OutputStream f21908h;

    public or7(OutputStream outputStream, int i) {
        super(i);
        this.f21908h = outputStream;
    }

    @Override // com.daaw.qr7
    /* renamed from: A */
    public final void mo12269A(int i, int i2) {
        m14024O(20);
        m16621L(i << 3);
        m16621L(i2);
    }

    @Override // com.daaw.qr7
    /* renamed from: B */
    public final void mo12268B(int i) {
        m14024O(5);
        m16621L(i);
    }

    @Override // com.daaw.qr7
    /* renamed from: C */
    public final void mo12267C(int i, long j) {
        m14024O(20);
        m16621L(i << 3);
        m16620M(j);
    }

    @Override // com.daaw.qr7
    /* renamed from: D */
    public final void mo12266D(long j) {
        m14024O(10);
        m16620M(j);
    }

    /* renamed from: N */
    public final void m14025N() {
        this.f21908h.write(this.f17666d, 0, this.f17668f);
        this.f17668f = 0;
    }

    /* renamed from: O */
    public final void m14024O(int i) {
        if (this.f17667e - this.f17668f < i) {
            m14025N();
        }
    }

    /* renamed from: P */
    public final void m14023P(byte[] bArr, int i, int i2) {
        int i3 = this.f17667e;
        int i4 = this.f17668f;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.f17666d, i4, i2);
            this.f17668f += i2;
        } else {
            System.arraycopy(bArr, i, this.f17666d, i4, i5);
            int i6 = i + i5;
            i2 -= i5;
            this.f17668f = this.f17667e;
            this.f17669g += i5;
            m14025N();
            if (i2 <= this.f17667e) {
                System.arraycopy(bArr, i6, this.f17666d, 0, i2);
                this.f17668f = i2;
            } else {
                this.f21908h.write(bArr, i6, i2);
            }
        }
        this.f17669g += i2;
    }

    /* renamed from: Q */
    public final void m14022Q(String str) {
        int m16416e;
        try {
            int length = str.length() * 3;
            int m12256f = qr7.m12256f(length);
            int i = m12256f + length;
            int i2 = this.f17667e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int m16417d = lw7.m16417d(str, bArr, 0, length);
                mo12268B(m16417d);
                m14023P(bArr, 0, m16417d);
                return;
            }
            if (i > i2 - this.f17668f) {
                m14025N();
            }
            int m12256f2 = qr7.m12256f(str.length());
            int i3 = this.f17668f;
            try {
                if (m12256f2 == m12256f) {
                    int i4 = i3 + m12256f2;
                    this.f17668f = i4;
                    int m16417d2 = lw7.m16417d(str, this.f17666d, i4, this.f17667e - i4);
                    this.f17668f = i3;
                    m16416e = (m16417d2 - i3) - m12256f2;
                    m16621L(m16416e);
                    this.f17668f = m16417d2;
                } else {
                    m16416e = lw7.m16416e(str);
                    m16621L(m16416e);
                    this.f17668f = lw7.m16417d(str, this.f17666d, this.f17668f, m16416e);
                }
                this.f17669g += m16416e;
            } catch (kw7 e) {
                this.f17669g -= this.f17668f - i3;
                this.f17668f = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new nr7(e2);
            }
        } catch (kw7 e3) {
            m12251k(str, e3);
        }
    }

    @Override // com.daaw.qr7, com.daaw.nq7
    /* renamed from: a */
    public final void mo12261a(byte[] bArr, int i, int i2) {
        m14023P(bArr, i, i2);
    }

    @Override // com.daaw.qr7
    /* renamed from: m */
    public final void mo12249m() {
        if (this.f17668f > 0) {
            m14025N();
        }
    }

    @Override // com.daaw.qr7
    /* renamed from: n */
    public final void mo12248n(byte b) {
        if (this.f17668f == this.f17667e) {
            m14025N();
        }
        m16624I(b);
    }

    @Override // com.daaw.qr7
    /* renamed from: o */
    public final void mo12247o(int i, boolean z) {
        m14024O(11);
        m16621L(i << 3);
        m16624I(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.daaw.qr7
    /* renamed from: p */
    public final void mo12246p(int i, yq7 yq7Var) {
        mo12268B((i << 3) | 2);
        mo12268B(yq7Var.mo3411o());
        yq7Var.mo3401y(this);
    }

    @Override // com.daaw.qr7
    /* renamed from: r */
    public final void mo12244r(int i, int i2) {
        m14024O(14);
        m16621L((i << 3) | 5);
        m16623J(i2);
    }

    @Override // com.daaw.qr7
    /* renamed from: s */
    public final void mo12243s(int i) {
        m14024O(4);
        m16623J(i);
    }

    @Override // com.daaw.qr7
    /* renamed from: t */
    public final void mo12242t(int i, long j) {
        m14024O(18);
        m16621L((i << 3) | 1);
        m16622K(j);
    }

    @Override // com.daaw.qr7
    /* renamed from: u */
    public final void mo12241u(long j) {
        m14024O(8);
        m16622K(j);
    }

    @Override // com.daaw.qr7
    /* renamed from: v */
    public final void mo12240v(int i, int i2) {
        m14024O(20);
        m16621L(i << 3);
        if (i2 >= 0) {
            m16621L(i2);
        } else {
            m16620M(i2);
        }
    }

    @Override // com.daaw.qr7
    /* renamed from: w */
    public final void mo12239w(int i) {
        if (i >= 0) {
            mo12268B(i);
        } else {
            mo12266D(i);
        }
    }

    @Override // com.daaw.qr7
    /* renamed from: x */
    public final void mo12238x(int i, xt7 xt7Var, cv7 cv7Var) {
        mo12268B((i << 3) | 2);
        mo12268B(((hq7) xt7Var).mo16589f(cv7Var));
        cv7Var.mo24956f(xt7Var, this.f24292a);
    }

    @Override // com.daaw.qr7
    /* renamed from: y */
    public final void mo12237y(int i, String str) {
        mo12268B((i << 3) | 2);
        m14022Q(str);
    }

    @Override // com.daaw.qr7
    /* renamed from: z */
    public final void mo12236z(int i, int i2) {
        mo12268B((i << 3) | i2);
    }
}
