package com.daaw;

import java.io.OutputStream;
/* loaded from: classes.dex */
public final class or7 extends lr7 {
    public final OutputStream h;

    public or7(OutputStream outputStream, int i) {
        super(i);
        this.h = outputStream;
    }

    @Override // com.daaw.qr7
    public final void A(int i, int i2) {
        O(20);
        L(i << 3);
        L(i2);
    }

    @Override // com.daaw.qr7
    public final void B(int i) {
        O(5);
        L(i);
    }

    @Override // com.daaw.qr7
    public final void C(int i, long j) {
        O(20);
        L(i << 3);
        M(j);
    }

    @Override // com.daaw.qr7
    public final void D(long j) {
        O(10);
        M(j);
    }

    public final void N() {
        this.h.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void O(int i) {
        if (this.e - this.f < i) {
            N();
        }
    }

    public final void P(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.d, i4, i2);
            this.f += i2;
        } else {
            System.arraycopy(bArr, i, this.d, i4, i5);
            int i6 = i + i5;
            i2 -= i5;
            this.f = this.e;
            this.g += i5;
            N();
            if (i2 <= this.e) {
                System.arraycopy(bArr, i6, this.d, 0, i2);
                this.f = i2;
            } else {
                this.h.write(bArr, i6, i2);
            }
        }
        this.g += i2;
    }

    public final void Q(String str) {
        int e;
        try {
            int length = str.length() * 3;
            int f = qr7.f(length);
            int i = f + length;
            int i2 = this.e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int d = lw7.d(str, bArr, 0, length);
                B(d);
                P(bArr, 0, d);
                return;
            }
            if (i > i2 - this.f) {
                N();
            }
            int f2 = qr7.f(str.length());
            int i3 = this.f;
            try {
                if (f2 == f) {
                    int i4 = i3 + f2;
                    this.f = i4;
                    int d2 = lw7.d(str, this.d, i4, this.e - i4);
                    this.f = i3;
                    e = (d2 - i3) - f2;
                    L(e);
                    this.f = d2;
                } else {
                    e = lw7.e(str);
                    L(e);
                    this.f = lw7.d(str, this.d, this.f, e);
                }
                this.g += e;
            } catch (kw7 e2) {
                this.g -= this.f - i3;
                this.f = i3;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw new nr7(e3);
            }
        } catch (kw7 e4) {
            k(str, e4);
        }
    }

    @Override // com.daaw.qr7, com.daaw.nq7
    public final void a(byte[] bArr, int i, int i2) {
        P(bArr, i, i2);
    }

    @Override // com.daaw.qr7
    public final void m() {
        if (this.f > 0) {
            N();
        }
    }

    @Override // com.daaw.qr7
    public final void n(byte b) {
        if (this.f == this.e) {
            N();
        }
        I(b);
    }

    @Override // com.daaw.qr7
    public final void o(int i, boolean z) {
        O(11);
        L(i << 3);
        I(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.daaw.qr7
    public final void p(int i, yq7 yq7Var) {
        B((i << 3) | 2);
        B(yq7Var.o());
        yq7Var.y(this);
    }

    @Override // com.daaw.qr7
    public final void r(int i, int i2) {
        O(14);
        L((i << 3) | 5);
        J(i2);
    }

    @Override // com.daaw.qr7
    public final void s(int i) {
        O(4);
        J(i);
    }

    @Override // com.daaw.qr7
    public final void t(int i, long j) {
        O(18);
        L((i << 3) | 1);
        K(j);
    }

    @Override // com.daaw.qr7
    public final void u(long j) {
        O(8);
        K(j);
    }

    @Override // com.daaw.qr7
    public final void v(int i, int i2) {
        O(20);
        L(i << 3);
        if (i2 >= 0) {
            L(i2);
        } else {
            M(i2);
        }
    }

    @Override // com.daaw.qr7
    public final void w(int i) {
        if (i >= 0) {
            B(i);
        } else {
            D(i);
        }
    }

    @Override // com.daaw.qr7
    public final void x(int i, xt7 xt7Var, cv7 cv7Var) {
        B((i << 3) | 2);
        B(((hq7) xt7Var).f(cv7Var));
        cv7Var.f(xt7Var, this.a);
    }

    @Override // com.daaw.qr7
    public final void y(int i, String str) {
        B((i << 3) | 2);
        Q(str);
    }

    @Override // com.daaw.qr7
    public final void z(int i, int i2) {
        B((i << 3) | i2);
    }
}
