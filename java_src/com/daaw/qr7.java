package com.daaw;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class qr7 extends nq7 {

    /* renamed from: b */
    public static final Logger f24290b = Logger.getLogger(qr7.class.getName());

    /* renamed from: c */
    public static final boolean f24291c = gw7.m21185a();

    /* renamed from: a */
    public rr7 f24292a;

    public qr7() {
    }

    public /* synthetic */ qr7(pr7 pr7Var) {
    }

    /* renamed from: E */
    public static int m12265E(yq7 yq7Var) {
        int mo3411o = yq7Var.mo3411o();
        return m12256f(mo3411o) + mo3411o;
    }

    @Deprecated
    /* renamed from: F */
    public static int m12264F(int i, xt7 xt7Var, cv7 cv7Var) {
        int m12256f = m12256f(i << 3);
        return m12256f + m12256f + ((hq7) xt7Var).mo16589f(cv7Var);
    }

    /* renamed from: G */
    public static int m12263G(int i) {
        if (i >= 0) {
            return m12256f(i);
        }
        return 10;
    }

    /* renamed from: H */
    public static int m12262H(at7 at7Var) {
        int m27033a = at7Var.m27033a();
        return m12256f(m27033a) + m27033a;
    }

    /* renamed from: b */
    public static int m12260b(xt7 xt7Var, cv7 cv7Var) {
        int mo16589f = ((hq7) xt7Var).mo16589f(cv7Var);
        return m12256f(mo16589f) + mo16589f;
    }

    /* renamed from: c */
    public static int m12259c(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: d */
    public static int m12258d(String str) {
        int length;
        try {
            length = lw7.m16416e(str);
        } catch (kw7 unused) {
            length = str.getBytes(vs7.f30558b).length;
        }
        return m12256f(length) + length;
    }

    /* renamed from: e */
    public static int m12257e(int i) {
        return m12256f(i << 3);
    }

    /* renamed from: f */
    public static int m12256f(int i) {
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

    /* renamed from: g */
    public static int m12255g(long j) {
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

    /* renamed from: h */
    public static qr7 m12254h(byte[] bArr) {
        return new mr7(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static qr7 m12253i(OutputStream outputStream, int i) {
        return new or7(outputStream, i);
    }

    /* renamed from: A */
    public abstract void mo12269A(int i, int i2);

    /* renamed from: B */
    public abstract void mo12268B(int i);

    /* renamed from: C */
    public abstract void mo12267C(int i, long j);

    /* renamed from: D */
    public abstract void mo12266D(long j);

    @Override // com.daaw.nq7
    /* renamed from: a */
    public abstract void mo12261a(byte[] bArr, int i, int i2);

    /* renamed from: j */
    public final void m12252j() {
        if (mo12245q() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: k */
    public final void m12251k(String str, kw7 kw7Var) {
        f24290b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) kw7Var);
        byte[] bytes = str.getBytes(vs7.f30558b);
        try {
            int length = bytes.length;
            mo12268B(length);
            mo12261a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new nr7(e);
        }
    }

    /* renamed from: m */
    public abstract void mo12249m();

    /* renamed from: n */
    public abstract void mo12248n(byte b);

    /* renamed from: o */
    public abstract void mo12247o(int i, boolean z);

    /* renamed from: p */
    public abstract void mo12246p(int i, yq7 yq7Var);

    /* renamed from: q */
    public abstract int mo12245q();

    /* renamed from: r */
    public abstract void mo12244r(int i, int i2);

    /* renamed from: s */
    public abstract void mo12243s(int i);

    /* renamed from: t */
    public abstract void mo12242t(int i, long j);

    /* renamed from: u */
    public abstract void mo12241u(long j);

    /* renamed from: v */
    public abstract void mo12240v(int i, int i2);

    /* renamed from: w */
    public abstract void mo12239w(int i);

    /* renamed from: x */
    public abstract void mo12238x(int i, xt7 xt7Var, cv7 cv7Var);

    /* renamed from: y */
    public abstract void mo12237y(int i, String str);

    /* renamed from: z */
    public abstract void mo12236z(int i, int i2);
}
