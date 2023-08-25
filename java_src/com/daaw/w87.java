package com.daaw;
/* loaded from: classes.dex */
public final class w87 {
    public final vm7 a;

    public w87(vm7 vm7Var) {
        this.a = vm7Var;
    }

    public static w87 e(String str, byte[] bArr, int i) {
        um7 L = vm7.L();
        L.t(str);
        L.u(yq7.F(bArr));
        int i2 = i - 1;
        L.s(i2 != 0 ? i2 != 1 ? zn7.RAW : zn7.LEGACY : zn7.TINK);
        return new w87((vm7) L.n());
    }

    public final vm7 a() {
        return this.a;
    }

    public final String b() {
        return this.a.Q();
    }

    public final byte[] c() {
        return this.a.P().j();
    }

    public final int d() {
        zn7 O = this.a.O();
        zn7 zn7Var = zn7.UNKNOWN_PREFIX;
        int ordinal = O.ordinal();
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
