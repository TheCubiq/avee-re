package com.daaw;

import java.util.Objects;
/* loaded from: classes2.dex */
public final class n78 extends w78 {

    /* renamed from: d */
    public final byte[] f19570d;

    /* renamed from: e */
    public final int f19571e;

    /* renamed from: f */
    public int f19572f;

    public n78(byte[] bArr, int i, int i2) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.f19570d = bArr;
        this.f19572f = 0;
        this.f19571e = i2;
    }

    /* renamed from: E */
    public final void m15479E(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f19570d, this.f19572f, i2);
            this.f19572f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new q78(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19572f), Integer.valueOf(this.f19571e), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: F */
    public final void m15478F(String str) {
        int i = this.f19572f;
        try {
            int m6384a = w78.m6384a(str.length() * 3);
            int m6384a2 = w78.m6384a(str.length());
            if (m6384a2 != m6384a) {
                mo6364u(ei8.m23449c(str));
                byte[] bArr = this.f19570d;
                int i2 = this.f19572f;
                this.f19572f = ei8.m23450b(str, bArr, i2, this.f19571e - i2);
                return;
            }
            int i3 = i + m6384a2;
            this.f19572f = i3;
            int m23450b = ei8.m23450b(str, this.f19570d, i3, this.f19571e - i3);
            this.f19572f = i;
            mo6364u((m23450b - i) - m6384a2);
            this.f19572f = m23450b;
        } catch (ci8 e) {
            this.f19572f = i;
            m6380e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new q78(e2);
        }
    }

    @Override // com.daaw.w78
    /* renamed from: g */
    public final int mo6378g() {
        return this.f19571e - this.f19572f;
    }

    @Override // com.daaw.w78
    /* renamed from: h */
    public final void mo6377h(byte b) {
        try {
            byte[] bArr = this.f19570d;
            int i = this.f19572f;
            this.f19572f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new q78(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19572f), Integer.valueOf(this.f19571e), 1), e);
        }
    }

    @Override // com.daaw.w78
    /* renamed from: i */
    public final void mo6376i(int i, boolean z) {
        mo6364u(i << 3);
        mo6377h(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.daaw.w78
    /* renamed from: j */
    public final void mo6375j(int i, y68 y68Var) {
        mo6364u((i << 3) | 2);
        mo6364u(y68Var.mo2805f());
        y68Var.mo4067m(this);
    }

    @Override // com.daaw.w78
    /* renamed from: k */
    public final void mo6374k(int i, int i2) {
        mo6364u((i << 3) | 5);
        mo6373l(i2);
    }

    @Override // com.daaw.w78
    /* renamed from: l */
    public final void mo6373l(int i) {
        try {
            byte[] bArr = this.f19570d;
            int i2 = this.f19572f;
            int i3 = i2 + 1;
            this.f19572f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f19572f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f19572f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f19572f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new q78(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19572f), Integer.valueOf(this.f19571e), 1), e);
        }
    }

    @Override // com.daaw.w78
    /* renamed from: m */
    public final void mo6372m(int i, long j) {
        mo6364u((i << 3) | 1);
        mo6371n(j);
    }

    @Override // com.daaw.w78
    /* renamed from: n */
    public final void mo6371n(long j) {
        try {
            byte[] bArr = this.f19570d;
            int i = this.f19572f;
            int i2 = i + 1;
            this.f19572f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f19572f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f19572f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f19572f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f19572f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f19572f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f19572f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f19572f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new q78(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19572f), Integer.valueOf(this.f19571e), 1), e);
        }
    }

    @Override // com.daaw.w78
    /* renamed from: o */
    public final void mo6370o(int i, int i2) {
        mo6364u(i << 3);
        mo6369p(i2);
    }

    @Override // com.daaw.w78
    /* renamed from: p */
    public final void mo6369p(int i) {
        if (i >= 0) {
            mo6364u(i);
        } else {
            mo6362w(i);
        }
    }

    @Override // com.daaw.w78
    /* renamed from: q */
    public final void mo6368q(byte[] bArr, int i, int i2) {
        m15479E(bArr, 0, i2);
    }

    @Override // com.daaw.w78
    /* renamed from: r */
    public final void mo6367r(int i, String str) {
        mo6364u((i << 3) | 2);
        m15478F(str);
    }

    @Override // com.daaw.w78
    /* renamed from: s */
    public final void mo6366s(int i, int i2) {
        mo6364u((i << 3) | i2);
    }

    @Override // com.daaw.w78
    /* renamed from: t */
    public final void mo6365t(int i, int i2) {
        mo6364u(i << 3);
        mo6364u(i2);
    }

    @Override // com.daaw.w78
    /* renamed from: u */
    public final void mo6364u(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f19570d;
                int i2 = this.f19572f;
                this.f19572f = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new q78(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19572f), Integer.valueOf(this.f19571e), 1), e);
            }
        }
        byte[] bArr2 = this.f19570d;
        int i3 = this.f19572f;
        this.f19572f = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.daaw.w78
    /* renamed from: v */
    public final void mo6363v(int i, long j) {
        mo6364u(i << 3);
        mo6362w(j);
    }

    @Override // com.daaw.w78
    /* renamed from: w */
    public final void mo6362w(long j) {
        boolean z;
        z = w78.f31025c;
        if (z && this.f19571e - this.f19572f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f19570d;
                int i = this.f19572f;
                this.f19572f = i + 1;
                ih8.m19794s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f19570d;
            int i2 = this.f19572f;
            this.f19572f = i2 + 1;
            ih8.m19794s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f19570d;
                int i3 = this.f19572f;
                this.f19572f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new q78(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19572f), Integer.valueOf(this.f19571e), 1), e);
            }
        }
        byte[] bArr4 = this.f19570d;
        int i4 = this.f19572f;
        this.f19572f = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
