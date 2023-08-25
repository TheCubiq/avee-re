package com.daaw;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class pj6 {
    @GuardedBy("this")
    public final Deque a = new LinkedBlockingDeque();
    public final Callable b;
    public final g77 c;

    public pj6(Callable callable, g77 g77Var) {
        this.b = callable;
        this.c = g77Var;
    }

    public final synchronized f77 a() {
        c(1);
        return (f77) this.a.poll();
    }

    public final synchronized void b(f77 f77Var) {
        this.a.addFirst(f77Var);
    }

    public final synchronized void c(int i) {
        int size = i - this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.a.add(this.c.M(this.b));
        }
    }
}
