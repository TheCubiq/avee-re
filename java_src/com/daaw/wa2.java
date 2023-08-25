package com.daaw;

import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public final class wa2 extends gb2 {
    public w09 n;
    public va2 o;

    public static boolean j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.daaw.gb2
    public final long a(ik5 ik5Var) {
        if (j(ik5Var.h())) {
            int i = (ik5Var.h()[2] & 255) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int a = s09.a(ik5Var, i);
                ik5Var.f(0);
                return a;
            }
            ik5Var.g(4);
            ik5Var.C();
            int a2 = s09.a(ik5Var, i);
            ik5Var.f(0);
            return a2;
        }
        return -1L;
    }

    @Override // com.daaw.gb2
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    @Override // com.daaw.gb2
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(ik5 ik5Var, long j, db2 db2Var) {
        byte[] h = ik5Var.h();
        w09 w09Var = this.n;
        if (w09Var == null) {
            w09 w09Var2 = new w09(h, 17);
            this.n = w09Var2;
            db2Var.a = w09Var2.c(Arrays.copyOfRange(h, 9, ik5Var.l()), null);
            return true;
        } else if ((h[0] & Byte.MAX_VALUE) == 3) {
            v09 b = t09.b(ik5Var);
            w09 f = w09Var.f(b);
            this.n = f;
            this.o = new va2(f, b);
            return true;
        } else if (j(h)) {
            va2 va2Var = this.o;
            if (va2Var != null) {
                va2Var.c(j);
                db2Var.b = this.o;
            }
            Objects.requireNonNull(db2Var.a);
            return false;
        } else {
            return true;
        }
    }
}
