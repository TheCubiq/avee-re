package com.daaw;
/* loaded from: classes.dex */
public abstract class dx6 implements Runnable {

    /* renamed from: p */
    public final tj1 f7967p;

    public dx6() {
        this.f7967p = null;
    }

    public dx6(tj1 tj1Var) {
        this.f7967p = tj1Var;
    }

    /* renamed from: a */
    public abstract void mo14744a();

    /* renamed from: b */
    public final tj1 m23826b() {
        return this.f7967p;
    }

    /* renamed from: c */
    public final void m23825c(Exception exc) {
        tj1 tj1Var = this.f7967p;
        if (tj1Var != null) {
            tj1Var.m9079d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo14744a();
        } catch (Exception e) {
            m23825c(e);
        }
    }
}
