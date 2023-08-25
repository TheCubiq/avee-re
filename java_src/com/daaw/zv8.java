package com.daaw;
/* loaded from: classes.dex */
public abstract class zv8 {
    public yv8 a;
    public mw8 b;

    public void a() {
        this.a = null;
        this.b = null;
    }

    public void b(o98 o98Var) {
        throw null;
    }

    public boolean c() {
        throw null;
    }

    public abstract fw8 d(l98[] l98VarArr, au8 au8Var, pr8 pr8Var, l64 l64Var);

    public abstract void e(Object obj);

    public final mw8 f() {
        mw8 mw8Var = this.b;
        uo4.b(mw8Var);
        return mw8Var;
    }

    public final void g(yv8 yv8Var, mw8 mw8Var) {
        this.a = yv8Var;
        this.b = mw8Var;
    }

    public final void h() {
        yv8 yv8Var = this.a;
        if (yv8Var != null) {
            yv8Var.zzj();
        }
    }
}
