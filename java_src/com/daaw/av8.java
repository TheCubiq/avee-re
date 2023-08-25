package com.daaw;
/* loaded from: classes.dex */
public final class av8 implements Comparable {
    public final boolean p;
    public final boolean q;

    public av8(f92 f92Var, int i) {
        this.p = 1 == (f92Var.d & 1);
        this.q = rv8.r(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(av8 av8Var) {
        return n17.i().d(this.q, av8Var.q).d(this.p, av8Var.p).a();
    }
}
