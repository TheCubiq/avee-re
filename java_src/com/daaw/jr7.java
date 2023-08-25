package com.daaw;

import java.io.InputStream;
/* loaded from: classes.dex */
public abstract class jr7 {

    /* renamed from: d */
    public static volatile int f15354d = 100;

    /* renamed from: e */
    public static final /* synthetic */ int f15355e = 0;

    /* renamed from: a */
    public int f15356a;

    /* renamed from: b */
    public final int f15357b = f15354d;

    /* renamed from: c */
    public kr7 f15358c;

    public /* synthetic */ jr7(ir7 ir7Var) {
    }

    /* renamed from: e */
    public static int m18301e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: f */
    public static long m18300f(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: g */
    public static jr7 m18299g(InputStream inputStream, int i) {
        return new hr7(inputStream, 4096, null);
    }

    /* renamed from: h */
    public static jr7 m18298h(byte[] bArr, int i, int i2, boolean z) {
        ar7 ar7Var = new ar7(bArr, i, i2, z, null);
        try {
            ar7Var.mo18294l(i2);
            return ar7Var;
        } catch (xs7 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract String mo18307A();

    /* renamed from: B */
    public abstract void mo18306B(int i);

    /* renamed from: a */
    public abstract void mo18305a(int i);

    /* renamed from: b */
    public abstract boolean mo18304b();

    /* renamed from: c */
    public abstract boolean mo18303c();

    /* renamed from: d */
    public abstract boolean mo18302d(int i);

    /* renamed from: i */
    public abstract double mo18297i();

    /* renamed from: j */
    public abstract float mo18296j();

    /* renamed from: k */
    public abstract int mo18295k();

    /* renamed from: l */
    public abstract int mo18294l(int i);

    /* renamed from: m */
    public abstract int mo18293m();

    /* renamed from: n */
    public abstract int mo18292n();

    /* renamed from: o */
    public abstract int mo18291o();

    /* renamed from: p */
    public abstract int mo18290p();

    /* renamed from: q */
    public abstract int mo18289q();

    /* renamed from: r */
    public abstract int mo18288r();

    /* renamed from: s */
    public abstract int mo18287s();

    /* renamed from: t */
    public abstract long mo18286t();

    /* renamed from: u */
    public abstract long mo18285u();

    /* renamed from: v */
    public abstract long mo18284v();

    /* renamed from: w */
    public abstract long mo18283w();

    /* renamed from: x */
    public abstract long mo18282x();

    /* renamed from: y */
    public abstract yq7 mo18281y();

    /* renamed from: z */
    public abstract String mo18280z();
}
