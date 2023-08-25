package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class mr7 extends qr7 {
    public final byte[] d;
    public final int e;
    public int f;

    public mr7(byte[] bArr, int i, int i2) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.d = bArr;
        this.f = 0;
        this.e = i2;
    }

    @Override // com.daaw.qr7
    public final void A(int i, int i2) {
        B(i << 3);
        B(i2);
    }

    @Override // com.daaw.qr7
    public final void B(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new nr7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
        byte[] bArr2 = this.d;
        int i3 = this.f;
        this.f = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.daaw.qr7
    public final void C(int i, long j) {
        B(i << 3);
        D(j);
    }

    @Override // com.daaw.qr7
    public final void D(long j) {
        boolean z;
        z = qr7.c;
        if (z && this.e - this.f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                gw7.y(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.d;
            int i2 = this.f;
            this.f = i2 + 1;
            gw7.y(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.d;
                int i3 = this.f;
                this.f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new nr7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
        byte[] bArr4 = this.d;
        int i4 = this.f;
        this.f = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    public final void I(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new nr7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
        }
    }

    public final void J(String str) {
        int i = this.f;
        try {
            int f = qr7.f(str.length() * 3);
            int f2 = qr7.f(str.length());
            if (f2 != f) {
                B(lw7.e(str));
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = lw7.d(str, bArr, i2, this.e - i2);
                return;
            }
            int i3 = i + f2;
            this.f = i3;
            int d = lw7.d(str, this.d, i3, this.e - i3);
            this.f = i;
            B((d - i) - f2);
            this.f = d;
        } catch (kw7 e) {
            this.f = i;
            k(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new nr7(e2);
        }
    }

    @Override // com.daaw.qr7, com.daaw.nq7
    public final void a(byte[] bArr, int i, int i2) {
        I(bArr, i, i2);
    }

    @Override // com.daaw.qr7
    public final void m() {
    }

    @Override // com.daaw.qr7
    public final void n(byte b) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            this.f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new nr7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.daaw.qr7
    public final void o(int i, boolean z) {
        B(i << 3);
        n(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.daaw.qr7
    public final void p(int i, yq7 yq7Var) {
        B((i << 3) | 2);
        B(yq7Var.o());
        yq7Var.y(this);
    }

    @Override // com.daaw.qr7
    public final int q() {
        return this.e - this.f;
    }

    @Override // com.daaw.qr7
    public final void r(int i, int i2) {
        B((i << 3) | 5);
        s(i2);
    }

    @Override // com.daaw.qr7
    public final void s(int i) {
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new nr7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.daaw.qr7
    public final void t(int i, long j) {
        B((i << 3) | 1);
        u(j);
    }

    @Override // com.daaw.qr7
    public final void u(long j) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            int i2 = i + 1;
            this.f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new nr7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.daaw.qr7
    public final void v(int i, int i2) {
        B(i << 3);
        w(i2);
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
        J(str);
    }

    @Override // com.daaw.qr7
    public final void z(int i, int i2) {
        B((i << 3) | i2);
    }
}
