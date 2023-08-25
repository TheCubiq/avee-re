package com.daaw;

import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public abstract class w78 extends n58 {

    /* renamed from: b */
    public static final Logger f31024b = Logger.getLogger(w78.class.getName());

    /* renamed from: c */
    public static final boolean f31025c = ih8.m19815C();

    /* renamed from: a */
    public z78 f31026a;

    public w78() {
    }

    public /* synthetic */ w78(t78 t78Var) {
    }

    /* renamed from: A */
    public static int m6388A(ub8 ub8Var) {
        int m8343a = ub8Var.m8343a();
        return m6384a(m8343a) + m8343a;
    }

    /* renamed from: B */
    public static int m6387B(zd8 zd8Var, ve8 ve8Var) {
        int mo6533e = ((w48) zd8Var).mo6533e(ve8Var);
        return m6384a(mo6533e) + mo6533e;
    }

    /* renamed from: C */
    public static int m6386C(String str) {
        int length;
        try {
            length = ei8.m23449c(str);
        } catch (ci8 unused) {
            length = str.getBytes(gb8.f11017b).length;
        }
        return m6384a(length) + length;
    }

    /* renamed from: D */
    public static int m6385D(int i) {
        return m6384a(i << 3);
    }

    /* renamed from: a */
    public static int m6384a(int i) {
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

    /* renamed from: b */
    public static int m6383b(long j) {
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

    /* renamed from: c */
    public static w78 m6382c(byte[] bArr) {
        return new n78(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m6361x(y68 y68Var) {
        int mo2805f = y68Var.mo2805f();
        return m6384a(mo2805f) + mo2805f;
    }

    @Deprecated
    /* renamed from: y */
    public static int m6360y(int i, zd8 zd8Var, ve8 ve8Var) {
        int m6384a = m6384a(i << 3);
        return m6384a + m6384a + ((w48) zd8Var).mo6533e(ve8Var);
    }

    /* renamed from: z */
    public static int m6359z(int i) {
        if (i >= 0) {
            return m6384a(i);
        }
        return 10;
    }

    /* renamed from: d */
    public final void m6381d() {
        if (mo6378g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: e */
    public final void m6380e(String str, ci8 ci8Var) {
        f31024b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ci8Var);
        byte[] bytes = str.getBytes(gb8.f11017b);
        try {
            int length = bytes.length;
            mo6364u(length);
            mo6368q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new q78(e);
        }
    }

    /* renamed from: g */
    public abstract int mo6378g();

    /* renamed from: h */
    public abstract void mo6377h(byte b);

    /* renamed from: i */
    public abstract void mo6376i(int i, boolean z);

    /* renamed from: j */
    public abstract void mo6375j(int i, y68 y68Var);

    /* renamed from: k */
    public abstract void mo6374k(int i, int i2);

    /* renamed from: l */
    public abstract void mo6373l(int i);

    /* renamed from: m */
    public abstract void mo6372m(int i, long j);

    /* renamed from: n */
    public abstract void mo6371n(long j);

    /* renamed from: o */
    public abstract void mo6370o(int i, int i2);

    /* renamed from: p */
    public abstract void mo6369p(int i);

    /* renamed from: q */
    public abstract void mo6368q(byte[] bArr, int i, int i2);

    /* renamed from: r */
    public abstract void mo6367r(int i, String str);

    /* renamed from: s */
    public abstract void mo6366s(int i, int i2);

    /* renamed from: t */
    public abstract void mo6365t(int i, int i2);

    /* renamed from: u */
    public abstract void mo6364u(int i);

    /* renamed from: v */
    public abstract void mo6363v(int i, long j);

    /* renamed from: w */
    public abstract void mo6362w(long j);
}
