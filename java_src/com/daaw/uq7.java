package com.daaw;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public class uq7 extends tq7 {

    /* renamed from: t */
    public final byte[] f29455t;

    public uq7(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f29455t = bArr;
    }

    @Override // com.daaw.tq7
    /* renamed from: K */
    public final boolean mo7800K(yq7 yq7Var, int i, int i2) {
        if (i2 > yq7Var.mo3411o()) {
            int mo3411o = mo3411o();
            throw new IllegalArgumentException("Length too large: " + i2 + mo3411o);
        }
        int i3 = i + i2;
        if (i3 > yq7Var.mo3411o()) {
            int mo3411o2 = yq7Var.mo3411o();
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + mo3411o2);
        } else if (yq7Var instanceof uq7) {
            uq7 uq7Var = (uq7) yq7Var;
            byte[] bArr = this.f29455t;
            byte[] bArr2 = uq7Var.f29455t;
            int mo7799L = mo7799L() + i2;
            int mo7799L2 = mo7799L();
            int mo7799L3 = uq7Var.mo7799L() + i;
            while (mo7799L2 < mo7799L) {
                if (bArr[mo7799L2] != bArr2[mo7799L3]) {
                    return false;
                }
                mo7799L2++;
                mo7799L3++;
            }
            return true;
        } else {
            return yq7Var.mo3405u(i, i3).equals(mo3405u(0, i2));
        }
    }

    /* renamed from: L */
    public int mo7799L() {
        return 0;
    }

    @Override // com.daaw.yq7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof yq7) && mo3411o() == ((yq7) obj).mo3411o()) {
            if (mo3411o() == 0) {
                return true;
            }
            if (obj instanceof uq7) {
                uq7 uq7Var = (uq7) obj;
                int m3428B = m3428B();
                int m3428B2 = uq7Var.m3428B();
                if (m3428B == 0 || m3428B2 == 0 || m3428B == m3428B2) {
                    return mo7800K(uq7Var, 0, mo3411o());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.daaw.yq7
    /* renamed from: k */
    public byte mo3414k(int i) {
        return this.f29455t[i];
    }

    @Override // com.daaw.yq7
    /* renamed from: m */
    public byte mo3413m(int i) {
        return this.f29455t[i];
    }

    @Override // com.daaw.yq7
    /* renamed from: o */
    public int mo3411o() {
        return this.f29455t.length;
    }

    @Override // com.daaw.yq7
    /* renamed from: p */
    public void mo3410p(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f29455t, i, bArr, i2, i3);
    }

    @Override // com.daaw.yq7
    /* renamed from: s */
    public final int mo3407s(int i, int i2, int i3) {
        return vs7.m6817d(i, this.f29455t, mo7799L() + i2, i3);
    }

    @Override // com.daaw.yq7
    /* renamed from: t */
    public final int mo3406t(int i, int i2, int i3) {
        int mo7799L = mo7799L() + i2;
        return lw7.m16415f(i, this.f29455t, mo7799L, i3 + mo7799L);
    }

    @Override // com.daaw.yq7
    /* renamed from: u */
    public final yq7 mo3405u(int i, int i2) {
        int m3429A = yq7.m3429A(i, i2, mo3411o());
        return m3429A == 0 ? yq7.f33966q : new rq7(this.f29455t, mo7799L() + i, m3429A);
    }

    @Override // com.daaw.yq7
    /* renamed from: v */
    public final jr7 mo3404v() {
        return jr7.m18298h(this.f29455t, mo7799L(), mo3411o(), true);
    }

    @Override // com.daaw.yq7
    /* renamed from: w */
    public final String mo3403w(Charset charset) {
        return new String(this.f29455t, mo7799L(), mo3411o(), charset);
    }

    @Override // com.daaw.yq7
    /* renamed from: x */
    public final ByteBuffer mo3402x() {
        return ByteBuffer.wrap(this.f29455t, mo7799L(), mo3411o()).asReadOnlyBuffer();
    }

    @Override // com.daaw.yq7
    /* renamed from: y */
    public final void mo3401y(nq7 nq7Var) {
        nq7Var.mo12261a(this.f29455t, mo7799L(), mo3411o());
    }

    @Override // com.daaw.yq7
    /* renamed from: z */
    public final boolean mo3400z() {
        int mo7799L = mo7799L();
        return lw7.m16411j(this.f29455t, mo7799L, mo3411o() + mo7799L);
    }
}
