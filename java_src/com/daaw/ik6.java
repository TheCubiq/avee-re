package com.daaw;
/* loaded from: classes.dex */
public final class ik6 {
    public final hk6 a = new hk6();
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final hk6 a() {
        hk6 clone = this.a.clone();
        hk6 hk6Var = this.a;
        hk6Var.p = false;
        hk6Var.q = false;
        return clone;
    }

    public final String b() {
        return "\n\tPool does not exist: " + this.d + "\n\tNew pools created: " + this.b + "\n\tPools removed: " + this.c + "\n\tEntries added: " + this.f + "\n\tNo entries retrieved: " + this.e + "\n";
    }

    public final void c() {
        this.f++;
    }

    public final void d() {
        this.b++;
        this.a.p = true;
    }

    public final void e() {
        this.e++;
    }

    public final void f() {
        this.d++;
    }

    public final void g() {
        this.c++;
        this.a.q = true;
    }
}
