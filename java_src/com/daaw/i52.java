package com.daaw;
/* loaded from: classes.dex */
public final class i52 implements v42 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public i52(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }

    public static i52 a(ik5 ik5Var) {
        int o = ik5Var.o();
        ik5Var.g(12);
        int o2 = ik5Var.o();
        int o3 = ik5Var.o();
        int o4 = ik5Var.o();
        ik5Var.g(4);
        int o5 = ik5Var.o();
        int o6 = ik5Var.o();
        ik5Var.g(8);
        return new i52(o, o2, o3, o4, o5, o6);
    }

    @Override // com.daaw.v42
    public final int zza() {
        return 1752331379;
    }
}
