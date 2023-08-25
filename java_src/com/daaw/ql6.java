package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2.dex */
public final class ql6 extends FutureTask implements Comparable {
    public final long p;
    public final boolean q;
    public final String r;
    public final /* synthetic */ vn6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql6(vn6 vn6Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.s = vn6Var;
        ry0.j(str);
        atomicLong = vn6.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.p = andIncrement;
        this.r = str;
        this.q = z;
        if (andIncrement == Long.MAX_VALUE) {
            vn6Var.a.i().q().a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql6(vn6 vn6Var, Callable callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.s = vn6Var;
        ry0.j("Task exception on worker thread");
        atomicLong = vn6.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.p = andIncrement;
        this.r = "Task exception on worker thread";
        this.q = z;
        if (andIncrement == Long.MAX_VALUE) {
            vn6Var.a.i().q().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ql6 ql6Var = (ql6) obj;
        boolean z = this.q;
        if (z != ql6Var.q) {
            return !z ? 1 : -1;
        }
        long j = this.p;
        long j2 = ql6Var.p;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.s.a.i().t().b("Two tasks share the same index. index", Long.valueOf(this.p));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.s.a.i().q().b(this.r, th);
        super.setException(th);
    }
}
