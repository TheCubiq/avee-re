package com.daaw;

import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes2.dex */
public class p68 extends m68 {
    public final byte[] t;

    public p68(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.t = bArr;
    }

    @Override // com.daaw.y68
    public byte d(int i) {
        return this.t[i];
    }

    @Override // com.daaw.y68
    public byte e(int i) {
        return this.t[i];
    }

    @Override // com.daaw.y68
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof y68) && f() == ((y68) obj).f()) {
            if (f() == 0) {
                return true;
            }
            if (obj instanceof p68) {
                p68 p68Var = (p68) obj;
                int p = p();
                int p2 = p68Var.p();
                if (p == 0 || p2 == 0 || p == p2) {
                    int f = f();
                    if (f > p68Var.f()) {
                        int f2 = f();
                        throw new IllegalArgumentException("Length too large: " + f + f2);
                    } else if (f > p68Var.f()) {
                        int f3 = p68Var.f();
                        throw new IllegalArgumentException("Ran off end of other: 0, " + f + ", " + f3);
                    } else {
                        byte[] bArr = this.t;
                        byte[] bArr2 = p68Var.t;
                        p68Var.t();
                        int i = 0;
                        int i2 = 0;
                        while (i < f) {
                            if (bArr[i] != bArr2[i2]) {
                                return false;
                            }
                            i++;
                            i2++;
                        }
                        return true;
                    }
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.daaw.y68
    public int f() {
        return this.t.length;
    }

    @Override // com.daaw.y68
    public final int h(int i, int i2, int i3) {
        return gb8.d(i, this.t, 0, i3);
    }

    @Override // com.daaw.y68
    public final y68 j(int i, int i2) {
        int o = y68.o(0, i2, f());
        return o == 0 ? y68.q : new z58(this.t, 0, o);
    }

    @Override // com.daaw.y68
    public final String k(Charset charset) {
        return new String(this.t, 0, f(), charset);
    }

    @Override // com.daaw.y68
    public final void m(n58 n58Var) {
        ((n78) n58Var).E(this.t, 0, f());
    }

    @Override // com.daaw.y68
    public final boolean n() {
        return ei8.f(this.t, 0, f());
    }

    public int t() {
        return 0;
    }
}
