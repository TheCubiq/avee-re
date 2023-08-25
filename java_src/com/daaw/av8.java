package com.daaw;
/* loaded from: classes.dex */
public final class av8 implements Comparable {

    /* renamed from: p */
    public final boolean f3693p;

    /* renamed from: q */
    public final boolean f3694q;

    public av8(f92 f92Var, int i) {
        this.f3693p = 1 == (f92Var.f9267d & 1);
        this.f3694q = rv8.m10866r(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(av8 av8Var) {
        return n17.m15586i().mo15591d(this.f3694q, av8Var.f3694q).mo15591d(this.f3693p, av8Var.f3693p).mo15594a();
    }
}
