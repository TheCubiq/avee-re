package com.daaw;
/* loaded from: classes.dex */
public abstract class dx6 implements Runnable {
    public final tj1 p;

    public dx6() {
        this.p = null;
    }

    public dx6(tj1 tj1Var) {
        this.p = tj1Var;
    }

    public abstract void a();

    public final tj1 b() {
        return this.p;
    }

    public final void c(Exception exc) {
        tj1 tj1Var = this.p;
        if (tj1Var != null) {
            tj1Var.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            c(e);
        }
    }
}
