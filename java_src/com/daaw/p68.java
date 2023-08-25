package com.daaw;

import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes2.dex */
public class p68 extends m68 {

    /* renamed from: t */
    public final byte[] f22647t;

    public p68(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f22647t = bArr;
    }

    @Override // com.daaw.y68
    /* renamed from: d */
    public byte mo2807d(int i) {
        return this.f22647t[i];
    }

    @Override // com.daaw.y68
    /* renamed from: e */
    public byte mo2806e(int i) {
        return this.f22647t[i];
    }

    @Override // com.daaw.y68
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof y68) && mo2805f() == ((y68) obj).mo2805f()) {
            if (mo2805f() == 0) {
                return true;
            }
            if (obj instanceof p68) {
                p68 p68Var = (p68) obj;
                int m4064p = m4064p();
                int m4064p2 = p68Var.m4064p();
                if (m4064p == 0 || m4064p2 == 0 || m4064p == m4064p2) {
                    int mo2805f = mo2805f();
                    if (mo2805f > p68Var.mo2805f()) {
                        int mo2805f2 = mo2805f();
                        throw new IllegalArgumentException("Length too large: " + mo2805f + mo2805f2);
                    } else if (mo2805f > p68Var.mo2805f()) {
                        int mo2805f3 = p68Var.mo2805f();
                        throw new IllegalArgumentException("Ran off end of other: 0, " + mo2805f + ", " + mo2805f3);
                    } else {
                        byte[] bArr = this.f22647t;
                        byte[] bArr2 = p68Var.f22647t;
                        p68Var.mo2804t();
                        int i = 0;
                        int i2 = 0;
                        while (i < mo2805f) {
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
    /* renamed from: f */
    public int mo2805f() {
        return this.f22647t.length;
    }

    @Override // com.daaw.y68
    /* renamed from: h */
    public final int mo4070h(int i, int i2, int i3) {
        return gb8.m21817d(i, this.f22647t, 0, i3);
    }

    @Override // com.daaw.y68
    /* renamed from: j */
    public final y68 mo4069j(int i, int i2) {
        int m4065o = y68.m4065o(0, i2, mo2805f());
        return m4065o == 0 ? y68.f33399q : new z58(this.f22647t, 0, m4065o);
    }

    @Override // com.daaw.y68
    /* renamed from: k */
    public final String mo4068k(Charset charset) {
        return new String(this.f22647t, 0, mo2805f(), charset);
    }

    @Override // com.daaw.y68
    /* renamed from: m */
    public final void mo4067m(n58 n58Var) {
        ((n78) n58Var).m15479E(this.f22647t, 0, mo2805f());
    }

    @Override // com.daaw.y68
    /* renamed from: n */
    public final boolean mo4066n() {
        return ei8.m23446f(this.f22647t, 0, mo2805f());
    }

    /* renamed from: t */
    public int mo2804t() {
        return 0;
    }
}
