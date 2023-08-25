package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class mr7 extends qr7 {

    /* renamed from: d */
    public final byte[] f19111d;

    /* renamed from: e */
    public final int f19112e;

    /* renamed from: f */
    public int f19113f;

    public mr7(byte[] bArr, int i, int i2) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.f19111d = bArr;
        this.f19113f = 0;
        this.f19112e = i2;
    }

    @Override // com.daaw.qr7
    /* renamed from: A */
    public final void mo12269A(int i, int i2) {
        mo12268B(i << 3);
        mo12268B(i2);
    }

    @Override // com.daaw.qr7
    /* renamed from: B */
    public final void mo12268B(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f19111d;
                int i2 = this.f19113f;
                this.f19113f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new nr7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19113f), Integer.valueOf(this.f19112e), 1), e);
            }
        }
        byte[] bArr2 = this.f19111d;
        int i3 = this.f19113f;
        this.f19113f = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.daaw.qr7
    /* renamed from: C */
    public final void mo12267C(int i, long j) {
        mo12268B(i << 3);
        mo12266D(j);
    }

    @Override // com.daaw.qr7
    /* renamed from: D */
    public final void mo12266D(long j) {
        boolean z;
        z = qr7.f24291c;
        if (z && this.f19112e - this.f19113f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f19111d;
                int i = this.f19113f;
                this.f19113f = i + 1;
                gw7.m21161y(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f19111d;
            int i2 = this.f19113f;
            this.f19113f = i2 + 1;
            gw7.m21161y(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f19111d;
                int i3 = this.f19113f;
                this.f19113f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new nr7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19113f), Integer.valueOf(this.f19112e), 1), e);
            }
        }
        byte[] bArr4 = this.f19111d;
        int i4 = this.f19113f;
        this.f19113f = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    /* renamed from: I */
    public final void m15808I(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f19111d, this.f19113f, i2);
            this.f19113f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new nr7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19113f), Integer.valueOf(this.f19112e), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: J */
    public final void m15807J(String str) {
        int i = this.f19113f;
        try {
            int m12256f = qr7.m12256f(str.length() * 3);
            int m12256f2 = qr7.m12256f(str.length());
            if (m12256f2 != m12256f) {
                mo12268B(lw7.m16416e(str));
                byte[] bArr = this.f19111d;
                int i2 = this.f19113f;
                this.f19113f = lw7.m16417d(str, bArr, i2, this.f19112e - i2);
                return;
            }
            int i3 = i + m12256f2;
            this.f19113f = i3;
            int m16417d = lw7.m16417d(str, this.f19111d, i3, this.f19112e - i3);
            this.f19113f = i;
            mo12268B((m16417d - i) - m12256f2);
            this.f19113f = m16417d;
        } catch (kw7 e) {
            this.f19113f = i;
            m12251k(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new nr7(e2);
        }
    }

    @Override // com.daaw.qr7, com.daaw.nq7
    /* renamed from: a */
    public final void mo12261a(byte[] bArr, int i, int i2) {
        m15808I(bArr, i, i2);
    }

    @Override // com.daaw.qr7
    /* renamed from: m */
    public final void mo12249m() {
    }

    @Override // com.daaw.qr7
    /* renamed from: n */
    public final void mo12248n(byte b) {
        try {
            byte[] bArr = this.f19111d;
            int i = this.f19113f;
            this.f19113f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new nr7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19113f), Integer.valueOf(this.f19112e), 1), e);
        }
    }

    @Override // com.daaw.qr7
    /* renamed from: o */
    public final void mo12247o(int i, boolean z) {
        mo12268B(i << 3);
        mo12248n(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.daaw.qr7
    /* renamed from: p */
    public final void mo12246p(int i, yq7 yq7Var) {
        mo12268B((i << 3) | 2);
        mo12268B(yq7Var.mo3411o());
        yq7Var.mo3401y(this);
    }

    @Override // com.daaw.qr7
    /* renamed from: q */
    public final int mo12245q() {
        return this.f19112e - this.f19113f;
    }

    @Override // com.daaw.qr7
    /* renamed from: r */
    public final void mo12244r(int i, int i2) {
        mo12268B((i << 3) | 5);
        mo12243s(i2);
    }

    @Override // com.daaw.qr7
    /* renamed from: s */
    public final void mo12243s(int i) {
        try {
            byte[] bArr = this.f19111d;
            int i2 = this.f19113f;
            int i3 = i2 + 1;
            this.f19113f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f19113f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f19113f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f19113f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new nr7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19113f), Integer.valueOf(this.f19112e), 1), e);
        }
    }

    @Override // com.daaw.qr7
    /* renamed from: t */
    public final void mo12242t(int i, long j) {
        mo12268B((i << 3) | 1);
        mo12241u(j);
    }

    @Override // com.daaw.qr7
    /* renamed from: u */
    public final void mo12241u(long j) {
        try {
            byte[] bArr = this.f19111d;
            int i = this.f19113f;
            int i2 = i + 1;
            this.f19113f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f19113f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f19113f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f19113f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f19113f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f19113f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f19113f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f19113f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new nr7(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19113f), Integer.valueOf(this.f19112e), 1), e);
        }
    }

    @Override // com.daaw.qr7
    /* renamed from: v */
    public final void mo12240v(int i, int i2) {
        mo12268B(i << 3);
        mo12239w(i2);
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
        m15807J(str);
    }

    @Override // com.daaw.qr7
    /* renamed from: z */
    public final void mo12236z(int i, int i2) {
        mo12268B((i << 3) | i2);
    }
}
