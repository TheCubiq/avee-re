package com.daaw;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class qr7 extends nq7 {
    public static final Logger b = Logger.getLogger(qr7.class.getName());
    public static final boolean c = gw7.a();
    public rr7 a;

    public qr7() {
    }

    public /* synthetic */ qr7(pr7 pr7Var) {
    }

    public static int E(yq7 yq7Var) {
        int o = yq7Var.o();
        return f(o) + o;
    }

    @Deprecated
    public static int F(int i, xt7 xt7Var, cv7 cv7Var) {
        int f = f(i << 3);
        return f + f + ((hq7) xt7Var).f(cv7Var);
    }

    public static int G(int i) {
        if (i >= 0) {
            return f(i);
        }
        return 10;
    }

    public static int H(at7 at7Var) {
        int a = at7Var.a();
        return f(a) + a;
    }

    public static int b(xt7 xt7Var, cv7 cv7Var) {
        int f = ((hq7) xt7Var).f(cv7Var);
        return f(f) + f;
    }

    public static int c(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int d(String str) {
        int length;
        try {
            length = lw7.e(str);
        } catch (kw7 unused) {
            length = str.getBytes(vs7.b).length;
        }
        return f(length) + length;
    }

    public static int e(int i) {
        return f(i << 3);
    }

    public static int f(int i) {
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

    public static int g(long j) {
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

    public static qr7 h(byte[] bArr) {
        return new mr7(bArr, 0, bArr.length);
    }

    public static qr7 i(OutputStream outputStream, int i) {
        return new or7(outputStream, i);
    }

    public abstract void A(int i, int i2);

    public abstract void B(int i);

    public abstract void C(int i, long j);

    public abstract void D(long j);

    @Override // com.daaw.nq7
    public abstract void a(byte[] bArr, int i, int i2);

    public final void j() {
        if (q() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void k(String str, kw7 kw7Var) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) kw7Var);
        byte[] bytes = str.getBytes(vs7.b);
        try {
            int length = bytes.length;
            B(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new nr7(e);
        }
    }

    public abstract void m();

    public abstract void n(byte b2);

    public abstract void o(int i, boolean z);

    public abstract void p(int i, yq7 yq7Var);

    public abstract int q();

    public abstract void r(int i, int i2);

    public abstract void s(int i);

    public abstract void t(int i, long j);

    public abstract void u(long j);

    public abstract void v(int i, int i2);

    public abstract void w(int i);

    public abstract void x(int i, xt7 xt7Var, cv7 cv7Var);

    public abstract void y(int i, String str);

    public abstract void z(int i, int i2);
}
