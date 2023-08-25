package com.daaw;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
/* renamed from: com.daaw.me */
/* loaded from: classes.dex */
public abstract class AbstractC2168me implements uh1 {

    /* renamed from: a */
    public final ArrayDeque<C2170b> f18828a = new ArrayDeque<>();

    /* renamed from: b */
    public final ArrayDeque<yh1> f18829b;

    /* renamed from: c */
    public final PriorityQueue<C2170b> f18830c;

    /* renamed from: d */
    public C2170b f18831d;

    /* renamed from: e */
    public long f18832e;

    /* renamed from: f */
    public long f18833f;

    /* renamed from: com.daaw.me$b */
    /* loaded from: classes.dex */
    public static final class C2170b extends xh1 implements Comparable<C2170b> {

        /* renamed from: v */
        public long f18834v;

        public C2170b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: t */
        public int compareTo(C2170b c2170b) {
            if (m11437j() != c2170b.m11437j()) {
                return m11437j() ? 1 : -1;
            }
            long j = this.f11566s - c2170b.f11566s;
            if (j == 0) {
                j = this.f18834v - c2170b.f18834v;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* renamed from: com.daaw.me$c */
    /* loaded from: classes.dex */
    public final class C2171c extends yh1 {
        public C2171c() {
        }

        @Override // com.daaw.yh1
        /* renamed from: m */
        public final void mo3748m() {
            AbstractC2168me.this.m16063m(this);
        }
    }

    public AbstractC2168me() {
        for (int i = 0; i < 10; i++) {
            this.f18828a.add(new C2170b());
        }
        this.f18829b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f18829b.add(new C2171c());
        }
        this.f18830c = new PriorityQueue<>();
    }

    @Override // com.daaw.InterfaceC1211eq
    /* renamed from: a */
    public void mo16074a() {
    }

    @Override // com.daaw.uh1
    /* renamed from: b */
    public void mo8184b(long j) {
        this.f18832e = j;
    }

    /* renamed from: f */
    public abstract th1 mo16070f();

    @Override // com.daaw.InterfaceC1211eq
    public void flush() {
        this.f18833f = 0L;
        this.f18832e = 0L;
        while (!this.f18830c.isEmpty()) {
            m16064l(this.f18830c.poll());
        }
        C2170b c2170b = this.f18831d;
        if (c2170b != null) {
            m16064l(c2170b);
            this.f18831d = null;
        }
    }

    /* renamed from: g */
    public abstract void mo16069g(xh1 xh1Var);

    @Override // com.daaw.InterfaceC1211eq
    /* renamed from: h */
    public xh1 mo16072d() {
        C2914s6.m10685f(this.f18831d == null);
        if (this.f18828a.isEmpty()) {
            return null;
        }
        C2170b pollFirst = this.f18828a.pollFirst();
        this.f18831d = pollFirst;
        return pollFirst;
    }

    @Override // com.daaw.InterfaceC1211eq
    /* renamed from: i */
    public yh1 mo16073c() {
        yh1 pollFirst;
        if (this.f18829b.isEmpty()) {
            return null;
        }
        while (!this.f18830c.isEmpty() && this.f18830c.peek().f11566s <= this.f18832e) {
            C2170b poll = this.f18830c.poll();
            if (poll.m11437j()) {
                pollFirst = this.f18829b.pollFirst();
                pollFirst.m11441e(4);
            } else {
                mo16069g(poll);
                if (mo16066j()) {
                    th1 mo16070f = mo16070f();
                    if (!poll.m11438i()) {
                        pollFirst = this.f18829b.pollFirst();
                        pollFirst.m3747n(poll.f11566s, mo16070f, Long.MAX_VALUE);
                    }
                }
                m16064l(poll);
            }
            m16064l(poll);
            return pollFirst;
        }
        return null;
    }

    /* renamed from: j */
    public abstract boolean mo16066j();

    @Override // com.daaw.InterfaceC1211eq
    /* renamed from: k */
    public void mo16071e(xh1 xh1Var) {
        C2914s6.m10690a(xh1Var == this.f18831d);
        if (xh1Var.m11438i()) {
            m16064l(this.f18831d);
        } else {
            C2170b c2170b = this.f18831d;
            long j = this.f18833f;
            this.f18833f = 1 + j;
            c2170b.f18834v = j;
            this.f18830c.add(this.f18831d);
        }
        this.f18831d = null;
    }

    /* renamed from: l */
    public final void m16064l(C2170b c2170b) {
        c2170b.mo3749f();
        this.f18828a.add(c2170b);
    }

    /* renamed from: m */
    public void m16063m(yh1 yh1Var) {
        yh1Var.mo3749f();
        this.f18829b.add(yh1Var);
    }
}
