package com.daaw;
/* loaded from: classes.dex */
public final class o68 {
    public boolean a;
    public q88 b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;

    public o68(q88 q88Var) {
        this.b = q88Var;
    }

    public final void a(int i) {
        this.a = 1 == ((this.a ? 1 : 0) | i);
        this.c += i;
    }

    public final void b(int i) {
        this.a = true;
        this.f = true;
        this.g = i;
    }

    public final void c(q88 q88Var) {
        this.a |= this.b != q88Var;
        this.b = q88Var;
    }

    public final void d(int i) {
        if (this.d && this.e != 5) {
            uo4.d(i == 5);
            return;
        }
        this.a = true;
        this.d = true;
        this.e = i;
    }
}
