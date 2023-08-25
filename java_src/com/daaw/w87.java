package com.daaw;
/* loaded from: classes.dex */
public final class w87 {

    /* renamed from: a */
    public final vm7 f31049a;

    public w87(vm7 vm7Var) {
        this.f31049a = vm7Var;
    }

    /* renamed from: e */
    public static w87 m6338e(String str, byte[] bArr, int i) {
        um7 m7028L = vm7.m7028L();
        m7028L.m8015t(str);
        m7028L.m8014u(yq7.m3424F(bArr));
        int i2 = i - 1;
        m7028L.m8016s(i2 != 0 ? i2 != 1 ? zn7.RAW : zn7.LEGACY : zn7.TINK);
        return new w87((vm7) m7028L.m22315n());
    }

    /* renamed from: a */
    public final vm7 m6342a() {
        return this.f31049a;
    }

    /* renamed from: b */
    public final String m6341b() {
        return this.f31049a.m7023Q();
    }

    /* renamed from: c */
    public final byte[] m6340c() {
        return this.f31049a.m7024P().m3415j();
    }

    /* renamed from: d */
    public final int m6339d() {
        zn7 m7025O = this.f31049a.m7025O();
        zn7 zn7Var = zn7.UNKNOWN_PREFIX;
        int ordinal = m7025O.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
