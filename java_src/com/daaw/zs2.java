package com.daaw;

import java.util.Stack;
/* loaded from: classes.dex */
public final class zs2 {

    /* renamed from: a */
    public final byte[] f35449a = new byte[8];

    /* renamed from: b */
    public final Stack f35450b = new Stack();

    /* renamed from: c */
    public final kt2 f35451c = new kt2();

    /* renamed from: d */
    public int f35452d;

    /* renamed from: e */
    public int f35453e;

    /* renamed from: f */
    public long f35454f;

    /* renamed from: g */
    public ct2 f35455g;

    /* renamed from: a */
    public final void m1944a() {
        this.f35452d = 0;
        this.f35450b.clear();
        this.f35451c.m17437d();
    }

    /* renamed from: b */
    public final void m1943b(ct2 ct2Var) {
        this.f35455g = ct2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r0 == 1) goto L32;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1942c(ms2 ms2Var) {
        String str;
        long m1941d;
        int m17439b;
        int m17438c;
        long j;
        int i;
        az2.m26583e(this.f35455g != null);
        while (true) {
            if (!this.f35450b.isEmpty()) {
                long m15801d = ms2Var.m15801d();
                j = ((ys2) this.f35450b.peek()).f33999b;
                if (m15801d >= j) {
                    ct2 ct2Var = this.f35455g;
                    i = ((ys2) this.f35450b.pop()).f33998a;
                    ct2Var.f6176a.m22300f(i);
                    return true;
                }
            }
            int i2 = this.f35452d;
            if (i2 == 0) {
                long m17436e = this.f35451c.m17436e(ms2Var, true, false, 4);
                if (m17436e == -2) {
                    ms2Var.m15800e();
                    while (true) {
                        ms2Var.m15798g(this.f35449a, 0, 4, false);
                        m17439b = kt2.m17439b(this.f35449a[0]);
                        if (m17439b != -1 && m17439b <= 4) {
                            m17438c = (int) kt2.m17438c(this.f35449a, m17439b, false);
                            ft2 ft2Var = this.f35455g.f6176a;
                            if (ft2.m22293m(m17438c)) {
                                break;
                            }
                        }
                        ms2Var.m15796i(1, false);
                    }
                    ms2Var.m15796i(m17439b, false);
                    m17436e = m17438c;
                }
                if (m17436e == -1) {
                    return false;
                }
                this.f35453e = (int) m17436e;
                this.f35452d = 1;
            }
            this.f35454f = this.f35451c.m17436e(ms2Var, false, true, 8);
            this.f35452d = 2;
            ct2 ct2Var2 = this.f35455g;
            int i3 = this.f35453e;
            ft2 ft2Var2 = ct2Var2.f6176a;
            int m22294l = ft2.m22294l(i3);
            if (m22294l != 0) {
                if (m22294l == 1) {
                    long m15801d2 = ms2Var.m15801d();
                    this.f35450b.add(new ys2(i3, this.f35454f + m15801d2, null));
                    this.f35455g.f6176a.m22297i(this.f35453e, m15801d2, this.f35454f);
                    this.f35452d = 0;
                    return true;
                } else if (m22294l == 2) {
                    long j2 = this.f35454f;
                    if (j2 <= 8) {
                        ct2Var2.f6176a.m22298h(i3, m1941d(ms2Var, (int) j2));
                        this.f35452d = 0;
                        return true;
                    }
                    throw new eq2("Invalid integer size: " + j2);
                } else if (m22294l == 3) {
                    long j3 = this.f35454f;
                    if (j3 > 2147483647L) {
                        throw new eq2("String element size: " + j3);
                    }
                    int i4 = (int) j3;
                    if (i4 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i4];
                        ms2Var.m15797h(bArr, 0, i4, false);
                        str = new String(bArr);
                    }
                    ct2Var2.f6176a.m22296j(i3, str);
                    this.f35452d = 0;
                    return true;
                } else if (m22294l == 4) {
                    ft2Var2.m22295k(i3, (int) this.f35454f, ms2Var);
                    this.f35452d = 0;
                    return true;
                } else {
                    long j4 = this.f35454f;
                    if (j4 != 4 && j4 != 8) {
                        throw new eq2("Invalid float size: " + j4);
                    }
                    int i5 = (int) j4;
                    ct2Var2.f6176a.m22299g(i3, i5 == 4 ? Float.intBitsToFloat((int) m1941d) : Double.longBitsToDouble(m1941d(ms2Var, i5)));
                    this.f35452d = 0;
                    return true;
                }
            }
            ms2Var.m15796i((int) this.f35454f, false);
            this.f35452d = 0;
        }
    }

    /* renamed from: d */
    public final long m1941d(ms2 ms2Var, int i) {
        ms2Var.m15797h(this.f35449a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.f35449a[i2] & 255);
        }
        return j;
    }
}
