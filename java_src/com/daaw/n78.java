package com.daaw;

import java.util.Objects;
/* loaded from: classes2.dex */
public final class n78 extends w78 {
    public final byte[] d;
    public final int e;
    public int f;

    public n78(byte[] bArr, int i, int i2) {
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

    public final void E(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new q78(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
        }
    }

    public final void F(String str) {
        int i = this.f;
        try {
            int a = w78.a(str.length() * 3);
            int a2 = w78.a(str.length());
            if (a2 != a) {
                u(ei8.c(str));
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = ei8.b(str, bArr, i2, this.e - i2);
                return;
            }
            int i3 = i + a2;
            this.f = i3;
            int b = ei8.b(str, this.d, i3, this.e - i3);
            this.f = i;
            u((b - i) - a2);
            this.f = b;
        } catch (ci8 e) {
            this.f = i;
            e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new q78(e2);
        }
    }

    @Override // com.daaw.w78
    public final int g() {
        return this.e - this.f;
    }

    @Override // com.daaw.w78
    public final void h(byte b) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            this.f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new q78(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.daaw.w78
    public final void i(int i, boolean z) {
        u(i << 3);
        h(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.daaw.w78
    public final void j(int i, y68 y68Var) {
        u((i << 3) | 2);
        u(y68Var.f());
        y68Var.m(this);
    }

    @Override // com.daaw.w78
    public final void k(int i, int i2) {
        u((i << 3) | 5);
        l(i2);
    }

    @Override // com.daaw.w78
    public final void l(int i) {
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
            throw new q78(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.daaw.w78
    public final void m(int i, long j) {
        u((i << 3) | 1);
        n(j);
    }

    @Override // com.daaw.w78
    public final void n(long j) {
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
            throw new q78(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.daaw.w78
    public final void o(int i, int i2) {
        u(i << 3);
        p(i2);
    }

    @Override // com.daaw.w78
    public final void p(int i) {
        if (i >= 0) {
            u(i);
        } else {
            w(i);
        }
    }

    @Override // com.daaw.w78
    public final void q(byte[] bArr, int i, int i2) {
        E(bArr, 0, i2);
    }

    @Override // com.daaw.w78
    public final void r(int i, String str) {
        u((i << 3) | 2);
        F(str);
    }

    @Override // com.daaw.w78
    public final void s(int i, int i2) {
        u((i << 3) | i2);
    }

    @Override // com.daaw.w78
    public final void t(int i, int i2) {
        u(i << 3);
        u(i2);
    }

    @Override // com.daaw.w78
    public final void u(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new q78(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
        byte[] bArr2 = this.d;
        int i3 = this.f;
        this.f = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.daaw.w78
    public final void v(int i, long j) {
        u(i << 3);
        w(j);
    }

    @Override // com.daaw.w78
    public final void w(long j) {
        boolean z;
        z = w78.c;
        if (z && this.e - this.f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                ih8.s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.d;
            int i2 = this.f;
            this.f = i2 + 1;
            ih8.s(bArr2, i2, (byte) j);
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
                throw new q78(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
        byte[] bArr4 = this.d;
        int i4 = this.f;
        this.f = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
