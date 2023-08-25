package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2.dex */
public final class ql6 extends FutureTask implements Comparable {

    /* renamed from: p */
    public final long f24146p;

    /* renamed from: q */
    public final boolean f24147q;

    /* renamed from: r */
    public final String f24148r;

    /* renamed from: s */
    public final /* synthetic */ vn6 f24149s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql6(vn6 vn6Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f24149s = vn6Var;
        ry0.m10830j(str);
        atomicLong = vn6.f30360l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f24146p = andIncrement;
        this.f24148r = str;
        this.f24147q = z;
        if (andIncrement == Long.MAX_VALUE) {
            vn6Var.f25143a.mo3895i().m14160q().m20653a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql6(vn6 vn6Var, Callable callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f24149s = vn6Var;
        ry0.m10830j("Task exception on worker thread");
        atomicLong = vn6.f30360l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f24146p = andIncrement;
        this.f24148r = "Task exception on worker thread";
        this.f24147q = z;
        if (andIncrement == Long.MAX_VALUE) {
            vn6Var.f25143a.mo3895i().m14160q().m20653a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ql6 ql6Var = (ql6) obj;
        boolean z = this.f24147q;
        if (z != ql6Var.f24147q) {
            return !z ? 1 : -1;
        }
        long j = this.f24146p;
        long j2 = ql6Var.f24146p;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f24149s.f25143a.mo3895i().m14158t().m20652b("Two tasks share the same index. index", Long.valueOf(this.f24146p));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f24149s.f25143a.mo3895i().m14160q().m20652b(this.f24148r, th);
        super.setException(th);
    }
}
