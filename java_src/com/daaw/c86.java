package com.daaw;
/* loaded from: classes2.dex */
public abstract class c86 extends de5 {
    public boolean b;

    public c86(dr6 dr6Var) {
        super(dr6Var);
        this.a.g();
    }

    public final void g() {
        if (!l()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void h() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (m()) {
            return;
        }
        this.a.e();
        this.b = true;
    }

    public final void j() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        k();
        this.a.e();
        this.b = true;
    }

    public void k() {
    }

    public final boolean l() {
        return this.b;
    }

    public abstract boolean m();
}
