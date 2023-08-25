package com.daaw;
/* loaded from: classes.dex */
public final class kl2 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ ll2 f16448p;

    public kl2(ll2 ll2Var) {
        this.f16448p = ll2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        es6 es6Var;
        Object obj2;
        obj = this.f16448p.f17503B;
        synchronized (obj) {
            z = this.f16448p.f17504C;
            if (z) {
                return;
            }
            this.f16448p.f17504C = true;
            try {
                ll2.m16869f(this.f16448p);
            } catch (Exception e) {
                es6Var = this.f16448p.f17512u;
                es6Var.m23229c(2023, -1L, e);
            }
            obj2 = this.f16448p.f17503B;
            synchronized (obj2) {
                this.f16448p.f17504C = false;
            }
        }
    }
}
