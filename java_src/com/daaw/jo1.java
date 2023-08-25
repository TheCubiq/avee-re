package com.daaw;

import android.text.Layout;
/* loaded from: classes.dex */
public final class jo1 {

    /* renamed from: a */
    public String f15263a;

    /* renamed from: b */
    public int f15264b;

    /* renamed from: c */
    public boolean f15265c;

    /* renamed from: d */
    public int f15266d;

    /* renamed from: e */
    public boolean f15267e;

    /* renamed from: f */
    public int f15268f = -1;

    /* renamed from: g */
    public int f15269g = -1;

    /* renamed from: h */
    public int f15270h = -1;

    /* renamed from: i */
    public int f15271i = -1;

    /* renamed from: j */
    public int f15272j = -1;

    /* renamed from: k */
    public float f15273k;

    /* renamed from: l */
    public String f15274l;

    /* renamed from: m */
    public jo1 f15275m;

    /* renamed from: n */
    public Layout.Alignment f15276n;

    /* renamed from: a */
    public jo1 m18376a(jo1 jo1Var) {
        return m18365l(jo1Var, true);
    }

    /* renamed from: b */
    public int m18375b() {
        if (this.f15267e) {
            return this.f15266d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public int m18374c() {
        if (this.f15265c) {
            return this.f15264b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: d */
    public String m18373d() {
        return this.f15263a;
    }

    /* renamed from: e */
    public float m18372e() {
        return this.f15273k;
    }

    /* renamed from: f */
    public int m18371f() {
        return this.f15272j;
    }

    /* renamed from: g */
    public String m18370g() {
        return this.f15274l;
    }

    /* renamed from: h */
    public int m18369h() {
        int i = this.f15270h;
        if (i == -1 && this.f15271i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f15271i == 1 ? 2 : 0);
    }

    /* renamed from: i */
    public Layout.Alignment m18368i() {
        return this.f15276n;
    }

    /* renamed from: j */
    public boolean m18367j() {
        return this.f15267e;
    }

    /* renamed from: k */
    public boolean m18366k() {
        return this.f15265c;
    }

    /* renamed from: l */
    public final jo1 m18365l(jo1 jo1Var, boolean z) {
        if (jo1Var != null) {
            if (!this.f15265c && jo1Var.f15265c) {
                m18360q(jo1Var.f15264b);
            }
            if (this.f15270h == -1) {
                this.f15270h = jo1Var.f15270h;
            }
            if (this.f15271i == -1) {
                this.f15271i = jo1Var.f15271i;
            }
            if (this.f15263a == null) {
                this.f15263a = jo1Var.f15263a;
            }
            if (this.f15268f == -1) {
                this.f15268f = jo1Var.f15268f;
            }
            if (this.f15269g == -1) {
                this.f15269g = jo1Var.f15269g;
            }
            if (this.f15276n == null) {
                this.f15276n = jo1Var.f15276n;
            }
            if (this.f15272j == -1) {
                this.f15272j = jo1Var.f15272j;
                this.f15273k = jo1Var.f15273k;
            }
            if (z && !this.f15267e && jo1Var.f15267e) {
                m18362o(jo1Var.f15266d);
            }
        }
        return this;
    }

    /* renamed from: m */
    public boolean m18364m() {
        return this.f15268f == 1;
    }

    /* renamed from: n */
    public boolean m18363n() {
        return this.f15269g == 1;
    }

    /* renamed from: o */
    public jo1 m18362o(int i) {
        this.f15266d = i;
        this.f15267e = true;
        return this;
    }

    /* renamed from: p */
    public jo1 m18361p(boolean z) {
        C2914s6.m10685f(this.f15275m == null);
        this.f15270h = z ? 1 : 0;
        return this;
    }

    /* renamed from: q */
    public jo1 m18360q(int i) {
        C2914s6.m10685f(this.f15275m == null);
        this.f15264b = i;
        this.f15265c = true;
        return this;
    }

    /* renamed from: r */
    public jo1 m18359r(String str) {
        C2914s6.m10685f(this.f15275m == null);
        this.f15263a = str;
        return this;
    }

    /* renamed from: s */
    public jo1 m18358s(float f) {
        this.f15273k = f;
        return this;
    }

    /* renamed from: t */
    public jo1 m18357t(int i) {
        this.f15272j = i;
        return this;
    }

    /* renamed from: u */
    public jo1 m18356u(String str) {
        this.f15274l = str;
        return this;
    }

    /* renamed from: v */
    public jo1 m18355v(boolean z) {
        C2914s6.m10685f(this.f15275m == null);
        this.f15271i = z ? 1 : 0;
        return this;
    }

    /* renamed from: w */
    public jo1 m18354w(boolean z) {
        C2914s6.m10685f(this.f15275m == null);
        this.f15268f = z ? 1 : 0;
        return this;
    }

    /* renamed from: x */
    public jo1 m18353x(Layout.Alignment alignment) {
        this.f15276n = alignment;
        return this;
    }

    /* renamed from: y */
    public jo1 m18352y(boolean z) {
        C2914s6.m10685f(this.f15275m == null);
        this.f15269g = z ? 1 : 0;
        return this;
    }
}
