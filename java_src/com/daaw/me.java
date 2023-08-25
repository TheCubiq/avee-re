package com.daaw;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public abstract class me implements uh1 {
    public final ArrayDeque<b> a = new ArrayDeque<>();
    public final ArrayDeque<yh1> b;
    public final PriorityQueue<b> c;
    public b d;
    public long e;
    public long f;

    /* loaded from: classes.dex */
    public static final class b extends xh1 implements Comparable<b> {
        public long v;

        public b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: t */
        public int compareTo(b bVar) {
            if (j() != bVar.j()) {
                return j() ? 1 : -1;
            }
            long j = this.s - bVar.s;
            if (j == 0) {
                j = this.v - bVar.v;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* loaded from: classes.dex */
    public final class c extends yh1 {
        public c() {
        }

        @Override // com.daaw.yh1
        public final void m() {
            me.this.m(this);
        }
    }

    public me() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new b());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new c());
        }
        this.c = new PriorityQueue<>();
    }

    @Override // com.daaw.eq
    public void a() {
    }

    @Override // com.daaw.uh1
    public void b(long j) {
        this.e = j;
    }

    public abstract th1 f();

    @Override // com.daaw.eq
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            l(this.c.poll());
        }
        b bVar = this.d;
        if (bVar != null) {
            l(bVar);
            this.d = null;
        }
    }

    public abstract void g(xh1 xh1Var);

    @Override // com.daaw.eq
    /* renamed from: h */
    public xh1 d() {
        s6.f(this.d == null);
        if (this.a.isEmpty()) {
            return null;
        }
        b pollFirst = this.a.pollFirst();
        this.d = pollFirst;
        return pollFirst;
    }

    @Override // com.daaw.eq
    /* renamed from: i */
    public yh1 c() {
        yh1 pollFirst;
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && this.c.peek().s <= this.e) {
            b poll = this.c.poll();
            if (poll.j()) {
                pollFirst = this.b.pollFirst();
                pollFirst.e(4);
            } else {
                g(poll);
                if (j()) {
                    th1 f = f();
                    if (!poll.i()) {
                        pollFirst = this.b.pollFirst();
                        pollFirst.n(poll.s, f, Long.MAX_VALUE);
                    }
                }
                l(poll);
            }
            l(poll);
            return pollFirst;
        }
        return null;
    }

    public abstract boolean j();

    @Override // com.daaw.eq
    /* renamed from: k */
    public void e(xh1 xh1Var) {
        s6.a(xh1Var == this.d);
        if (xh1Var.i()) {
            l(this.d);
        } else {
            b bVar = this.d;
            long j = this.f;
            this.f = 1 + j;
            bVar.v = j;
            this.c.add(this.d);
        }
        this.d = null;
    }

    public final void l(b bVar) {
        bVar.f();
        this.a.add(bVar);
    }

    public void m(yh1 yh1Var) {
        yh1Var.f();
        this.b.add(yh1Var);
    }
}
