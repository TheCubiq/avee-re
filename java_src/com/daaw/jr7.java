package com.daaw;

import java.io.InputStream;
/* loaded from: classes.dex */
public abstract class jr7 {
    public static volatile int d = 100;
    public static final /* synthetic */ int e = 0;
    public int a;
    public final int b = d;
    public kr7 c;

    public /* synthetic */ jr7(ir7 ir7Var) {
    }

    public static int e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long f(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static jr7 g(InputStream inputStream, int i) {
        return new hr7(inputStream, 4096, null);
    }

    public static jr7 h(byte[] bArr, int i, int i2, boolean z) {
        ar7 ar7Var = new ar7(bArr, i, i2, z, null);
        try {
            ar7Var.l(i2);
            return ar7Var;
        } catch (xs7 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract String A();

    public abstract void B(int i);

    public abstract void a(int i);

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d(int i);

    public abstract double i();

    public abstract float j();

    public abstract int k();

    public abstract int l(int i);

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract long x();

    public abstract yq7 y();

    public abstract String z();
}
