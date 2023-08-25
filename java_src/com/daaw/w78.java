package com.daaw;

import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public abstract class w78 extends n58 {
    public static final Logger b = Logger.getLogger(w78.class.getName());
    public static final boolean c = ih8.C();
    public z78 a;

    public w78() {
    }

    public /* synthetic */ w78(t78 t78Var) {
    }

    public static int A(ub8 ub8Var) {
        int a = ub8Var.a();
        return a(a) + a;
    }

    public static int B(zd8 zd8Var, ve8 ve8Var) {
        int e = ((w48) zd8Var).e(ve8Var);
        return a(e) + e;
    }

    public static int C(String str) {
        int length;
        try {
            length = ei8.c(str);
        } catch (ci8 unused) {
            length = str.getBytes(gb8.b).length;
        }
        return a(length) + length;
    }

    public static int D(int i) {
        return a(i << 3);
    }

    public static int a(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int b(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static w78 c(byte[] bArr) {
        return new n78(bArr, 0, bArr.length);
    }

    public static int x(y68 y68Var) {
        int f = y68Var.f();
        return a(f) + f;
    }

    @Deprecated
    public static int y(int i, zd8 zd8Var, ve8 ve8Var) {
        int a = a(i << 3);
        return a + a + ((w48) zd8Var).e(ve8Var);
    }

    public static int z(int i) {
        if (i >= 0) {
            return a(i);
        }
        return 10;
    }

    public final void d() {
        if (g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void e(String str, ci8 ci8Var) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ci8Var);
        byte[] bytes = str.getBytes(gb8.b);
        try {
            int length = bytes.length;
            u(length);
            q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new q78(e);
        }
    }

    public abstract int g();

    public abstract void h(byte b2);

    public abstract void i(int i, boolean z);

    public abstract void j(int i, y68 y68Var);

    public abstract void k(int i, int i2);

    public abstract void l(int i);

    public abstract void m(int i, long j);

    public abstract void n(long j);

    public abstract void o(int i, int i2);

    public abstract void p(int i);

    public abstract void q(byte[] bArr, int i, int i2);

    public abstract void r(int i, String str);

    public abstract void s(int i, int i2);

    public abstract void t(int i, int i2);

    public abstract void u(int i);

    public abstract void v(int i, long j);

    public abstract void w(long j);
}
