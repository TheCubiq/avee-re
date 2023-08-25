package com.daaw;
/* loaded from: classes2.dex */
public abstract class ud7 extends rc7 {
    public boolean b;

    public ud7(dr6 dr6Var) {
        super(dr6Var);
        this.a.g();
    }

    public void g() {
    }

    public abstract boolean h();

    public final void j() {
        if (!m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (h()) {
            return;
        }
        this.a.e();
        this.b = true;
    }

    public final void l() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        g();
        this.a.e();
        this.b = true;
    }

    public final boolean m() {
        return this.b;
    }
}
