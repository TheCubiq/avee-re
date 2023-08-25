package com.daaw;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public class uq7 extends tq7 {
    public final byte[] t;

    public uq7(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.t = bArr;
    }

    @Override // com.daaw.tq7
    public final boolean K(yq7 yq7Var, int i, int i2) {
        if (i2 > yq7Var.o()) {
            int o = o();
            throw new IllegalArgumentException("Length too large: " + i2 + o);
        }
        int i3 = i + i2;
        if (i3 > yq7Var.o()) {
            int o2 = yq7Var.o();
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + o2);
        } else if (yq7Var instanceof uq7) {
            uq7 uq7Var = (uq7) yq7Var;
            byte[] bArr = this.t;
            byte[] bArr2 = uq7Var.t;
            int L = L() + i2;
            int L2 = L();
            int L3 = uq7Var.L() + i;
            while (L2 < L) {
                if (bArr[L2] != bArr2[L3]) {
                    return false;
                }
                L2++;
                L3++;
            }
            return true;
        } else {
            return yq7Var.u(i, i3).equals(u(0, i2));
        }
    }

    public int L() {
        return 0;
    }

    @Override // com.daaw.yq7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof yq7) && o() == ((yq7) obj).o()) {
            if (o() == 0) {
                return true;
            }
            if (obj instanceof uq7) {
                uq7 uq7Var = (uq7) obj;
                int B = B();
                int B2 = uq7Var.B();
                if (B == 0 || B2 == 0 || B == B2) {
                    return K(uq7Var, 0, o());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.daaw.yq7
    public byte k(int i) {
        return this.t[i];
    }

    @Override // com.daaw.yq7
    public byte m(int i) {
        return this.t[i];
    }

    @Override // com.daaw.yq7
    public int o() {
        return this.t.length;
    }

    @Override // com.daaw.yq7
    public void p(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.t, i, bArr, i2, i3);
    }

    @Override // com.daaw.yq7
    public final int s(int i, int i2, int i3) {
        return vs7.d(i, this.t, L() + i2, i3);
    }

    @Override // com.daaw.yq7
    public final int t(int i, int i2, int i3) {
        int L = L() + i2;
        return lw7.f(i, this.t, L, i3 + L);
    }

    @Override // com.daaw.yq7
    public final yq7 u(int i, int i2) {
        int A = yq7.A(i, i2, o());
        return A == 0 ? yq7.q : new rq7(this.t, L() + i, A);
    }

    @Override // com.daaw.yq7
    public final jr7 v() {
        return jr7.h(this.t, L(), o(), true);
    }

    @Override // com.daaw.yq7
    public final String w(Charset charset) {
        return new String(this.t, L(), o(), charset);
    }

    @Override // com.daaw.yq7
    public final ByteBuffer x() {
        return ByteBuffer.wrap(this.t, L(), o()).asReadOnlyBuffer();
    }

    @Override // com.daaw.yq7
    public final void y(nq7 nq7Var) {
        nq7Var.a(this.t, L(), o());
    }

    @Override // com.daaw.yq7
    public final boolean z() {
        int L = L();
        return lw7.j(this.t, L, o() + L);
    }
}
