package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class tn2 implements Callable {

    /* renamed from: a */
    public final wm2 f27890a;

    /* renamed from: b */
    public final hi2 f27891b;

    public tn2(wm2 wm2Var, hi2 hi2Var) {
        this.f27890a = wm2Var;
        this.f27891b = hi2Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (this.f27890a.m5994l() != null) {
            this.f27890a.m5994l().get();
        }
        fj2 m6003c = this.f27890a.m6003c();
        if (m6003c != null) {
            try {
                synchronized (this.f27891b) {
                    hi2 hi2Var = this.f27891b;
                    byte[] mo4516a = m6003c.mo4516a();
                    hi2Var.m22316m(mo4516a, 0, mo4516a.length, vr7.m6834a());
                }
                return null;
            } catch (xs7 | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
