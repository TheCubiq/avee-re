package com.daaw;
/* loaded from: classes.dex */
public abstract class rc {
    public int p;

    public final void e(int i) {
        this.p = i | this.p;
    }

    public void f() {
        this.p = 0;
    }

    public final void g(int i) {
        this.p = (i ^ (-1)) & this.p;
    }

    public final boolean h(int i) {
        return (this.p & i) == i;
    }

    public final boolean i() {
        return h(Integer.MIN_VALUE);
    }

    public final boolean j() {
        return h(4);
    }

    public final boolean k() {
        return h(1);
    }

    public final void l(int i) {
        this.p = i;
    }
}
