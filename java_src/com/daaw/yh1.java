package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public abstract class yh1 extends av0 implements th1 {
    public th1 s;
    public long t;

    @Override // com.daaw.th1
    public int a(long j) {
        return this.s.a(j - this.t);
    }

    @Override // com.daaw.th1
    public long b(int i) {
        return this.s.b(i) + this.t;
    }

    @Override // com.daaw.th1
    public List<ln> c(long j) {
        return this.s.c(j - this.t);
    }

    @Override // com.daaw.th1
    public int d() {
        return this.s.d();
    }

    @Override // com.daaw.rc
    public void f() {
        super.f();
        this.s = null;
    }

    public abstract void m();

    public void n(long j, th1 th1Var, long j2) {
        this.q = j;
        this.s = th1Var;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.t = j;
    }
}
