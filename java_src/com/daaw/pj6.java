package com.daaw;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class pj6 {
    @GuardedBy("this")

    /* renamed from: a */
    public final Deque f22992a = new LinkedBlockingDeque();

    /* renamed from: b */
    public final Callable f22993b;

    /* renamed from: c */
    public final g77 f22994c;

    public pj6(Callable callable, g77 g77Var) {
        this.f22993b = callable;
        this.f22994c = g77Var;
    }

    /* renamed from: a */
    public final synchronized f77 m13329a() {
        m13327c(1);
        return (f77) this.f22992a.poll();
    }

    /* renamed from: b */
    public final synchronized void m13328b(f77 f77Var) {
        this.f22992a.addFirst(f77Var);
    }

    /* renamed from: c */
    public final synchronized void m13327c(int i) {
        int size = i - this.f22992a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f22992a.add(this.f22994c.mo20112M(this.f22993b));
        }
    }
}
