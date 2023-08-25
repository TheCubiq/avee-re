package com.daaw;

import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public final class wa2 extends gb2 {

    /* renamed from: n */
    public w09 f31098n;

    /* renamed from: o */
    public va2 f31099o;

    /* renamed from: j */
    public static boolean m6274j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.daaw.gb2
    /* renamed from: a */
    public final long mo6277a(ik5 ik5Var) {
        if (m6274j(ik5Var.m19714h())) {
            int i = (ik5Var.m19714h()[2] & 255) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int m10799a = s09.m10799a(ik5Var, i);
                ik5Var.m19716f(0);
                return m10799a;
            }
            ik5Var.m19715g(4);
            ik5Var.m19727C();
            int m10799a2 = s09.m10799a(ik5Var, i);
            ik5Var.m19716f(0);
            return m10799a2;
        }
        return -1L;
    }

    @Override // com.daaw.gb2
    /* renamed from: b */
    public final void mo6276b(boolean z) {
        super.mo6276b(z);
        if (z) {
            this.f31098n = null;
            this.f31099o = null;
        }
    }

    @Override // com.daaw.gb2
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public final boolean mo6275c(ik5 ik5Var, long j, db2 db2Var) {
        byte[] m19714h = ik5Var.m19714h();
        w09 w09Var = this.f31098n;
        if (w09Var == null) {
            w09 w09Var2 = new w09(m19714h, 17);
            this.f31098n = w09Var2;
            db2Var.f6733a = w09Var2.m6599c(Arrays.copyOfRange(m19714h, 9, ik5Var.m19710l()), null);
            return true;
        } else if ((m19714h[0] & Byte.MAX_VALUE) == 3) {
            v09 m9665b = t09.m9665b(ik5Var);
            w09 m6596f = w09Var.m6596f(m9665b);
            this.f31098n = m6596f;
            this.f31099o = new va2(m6596f, m9665b);
            return true;
        } else if (m6274j(m19714h)) {
            va2 va2Var = this.f31099o;
            if (va2Var != null) {
                va2Var.m7301c(j);
                db2Var.f6734b = this.f31099o;
            }
            Objects.requireNonNull(db2Var.f6733a);
            return false;
        } else {
            return true;
        }
    }
}
