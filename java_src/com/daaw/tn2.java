package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class tn2 implements Callable {
    public final wm2 a;
    public final hi2 b;

    public tn2(wm2 wm2Var, hi2 hi2Var) {
        this.a = wm2Var;
        this.b = hi2Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (this.a.l() != null) {
            this.a.l().get();
        }
        fj2 c = this.a.c();
        if (c != null) {
            try {
                synchronized (this.b) {
                    hi2 hi2Var = this.b;
                    byte[] a = c.a();
                    hi2Var.m(a, 0, a.length, vr7.a());
                }
                return null;
            } catch (xs7 | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
