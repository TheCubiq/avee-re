package com.daaw;

import android.text.Layout;
/* loaded from: classes.dex */
public final class jo1 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public float k;
    public String l;
    public jo1 m;
    public Layout.Alignment n;

    public jo1 a(jo1 jo1Var) {
        return l(jo1Var, true);
    }

    public int b() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.c) {
            return this.b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.a;
    }

    public float e() {
        return this.k;
    }

    public int f() {
        return this.j;
    }

    public String g() {
        return this.l;
    }

    public int h() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }

    public Layout.Alignment i() {
        return this.n;
    }

    public boolean j() {
        return this.e;
    }

    public boolean k() {
        return this.c;
    }

    public final jo1 l(jo1 jo1Var, boolean z) {
        if (jo1Var != null) {
            if (!this.c && jo1Var.c) {
                q(jo1Var.b);
            }
            if (this.h == -1) {
                this.h = jo1Var.h;
            }
            if (this.i == -1) {
                this.i = jo1Var.i;
            }
            if (this.a == null) {
                this.a = jo1Var.a;
            }
            if (this.f == -1) {
                this.f = jo1Var.f;
            }
            if (this.g == -1) {
                this.g = jo1Var.g;
            }
            if (this.n == null) {
                this.n = jo1Var.n;
            }
            if (this.j == -1) {
                this.j = jo1Var.j;
                this.k = jo1Var.k;
            }
            if (z && !this.e && jo1Var.e) {
                o(jo1Var.d);
            }
        }
        return this;
    }

    public boolean m() {
        return this.f == 1;
    }

    public boolean n() {
        return this.g == 1;
    }

    public jo1 o(int i) {
        this.d = i;
        this.e = true;
        return this;
    }

    public jo1 p(boolean z) {
        s6.f(this.m == null);
        this.h = z ? 1 : 0;
        return this;
    }

    public jo1 q(int i) {
        s6.f(this.m == null);
        this.b = i;
        this.c = true;
        return this;
    }

    public jo1 r(String str) {
        s6.f(this.m == null);
        this.a = str;
        return this;
    }

    public jo1 s(float f) {
        this.k = f;
        return this;
    }

    public jo1 t(int i) {
        this.j = i;
        return this;
    }

    public jo1 u(String str) {
        this.l = str;
        return this;
    }

    public jo1 v(boolean z) {
        s6.f(this.m == null);
        this.i = z ? 1 : 0;
        return this;
    }

    public jo1 w(boolean z) {
        s6.f(this.m == null);
        this.f = z ? 1 : 0;
        return this;
    }

    public jo1 x(Layout.Alignment alignment) {
        this.n = alignment;
        return this;
    }

    public jo1 y(boolean z) {
        s6.f(this.m == null);
        this.g = z ? 1 : 0;
        return this;
    }
}
