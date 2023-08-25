package com.daaw;
/* loaded from: classes.dex */
public class hl1 implements m41, l41 {
    public l41 a;
    public l41 b;
    public m41 c;

    public hl1(m41 m41Var) {
        this.c = m41Var;
    }

    @Override // com.daaw.m41
    public boolean a() {
        return l() || e();
    }

    @Override // com.daaw.l41
    public void b() {
        this.a.b();
        this.b.b();
    }

    @Override // com.daaw.l41
    public void c() {
        this.a.c();
        this.b.c();
    }

    @Override // com.daaw.l41
    public void clear() {
        this.b.clear();
        this.a.clear();
    }

    @Override // com.daaw.m41
    public boolean d(l41 l41Var) {
        return j() && l41Var.equals(this.a) && !a();
    }

    @Override // com.daaw.l41
    public boolean e() {
        return this.a.e() || this.b.e();
    }

    @Override // com.daaw.m41
    public void f(l41 l41Var) {
        if (l41Var.equals(this.b)) {
            return;
        }
        m41 m41Var = this.c;
        if (m41Var != null) {
            m41Var.f(this);
        }
        if (this.b.i()) {
            return;
        }
        this.b.clear();
    }

    @Override // com.daaw.l41
    public void g() {
        if (!this.b.isRunning()) {
            this.b.g();
        }
        if (this.a.isRunning()) {
            return;
        }
        this.a.g();
    }

    @Override // com.daaw.m41
    public boolean h(l41 l41Var) {
        return k() && (l41Var.equals(this.a) || !this.a.e());
    }

    @Override // com.daaw.l41
    public boolean i() {
        return this.a.i() || this.b.i();
    }

    @Override // com.daaw.l41
    public boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // com.daaw.l41
    public boolean isRunning() {
        return this.a.isRunning();
    }

    public final boolean j() {
        m41 m41Var = this.c;
        return m41Var == null || m41Var.d(this);
    }

    public final boolean k() {
        m41 m41Var = this.c;
        return m41Var == null || m41Var.h(this);
    }

    public final boolean l() {
        m41 m41Var = this.c;
        return m41Var != null && m41Var.a();
    }

    public void m(l41 l41Var, l41 l41Var2) {
        this.a = l41Var;
        this.b = l41Var2;
    }
}
