package com.daaw;
/* loaded from: classes.dex */
public final class ir8 extends xq8 {
    public static final Object f = new Object();
    public final Object d;
    public final Object e;

    public ir8(l64 l64Var, Object obj, Object obj2) {
        super(l64Var);
        this.d = obj;
        this.e = obj2;
    }

    public static ir8 q(f53 f53Var) {
        return new ir8(new jr8(f53Var), i54.o, f);
    }

    public static ir8 r(l64 l64Var, Object obj, Object obj2) {
        return new ir8(l64Var, obj, obj2);
    }

    @Override // com.daaw.xq8, com.daaw.l64
    public final int a(Object obj) {
        Object obj2;
        l64 l64Var = this.c;
        if (f.equals(obj) && (obj2 = this.e) != null) {
            obj = obj2;
        }
        return l64Var.a(obj);
    }

    @Override // com.daaw.l64
    public final d34 d(int i, d34 d34Var, boolean z) {
        this.c.d(i, d34Var, z);
        if (it5.t(d34Var.b, this.e) && z) {
            d34Var.b = f;
        }
        return d34Var;
    }

    @Override // com.daaw.l64
    public final i54 e(int i, i54 i54Var, long j) {
        this.c.e(i, i54Var, j);
        if (it5.t(i54Var.a, this.d)) {
            i54Var.a = i54.o;
        }
        return i54Var;
    }

    @Override // com.daaw.xq8, com.daaw.l64
    public final Object f(int i) {
        Object f2 = this.c.f(i);
        return it5.t(f2, this.e) ? f : f2;
    }

    public final ir8 p(l64 l64Var) {
        return new ir8(l64Var, this.d, this.e);
    }
}
