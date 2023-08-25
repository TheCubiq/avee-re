package com.daaw;

import java.util.Queue;
/* loaded from: classes.dex */
public class lq0<A, B> {

    /* renamed from: a */
    public final vl0<C2109b<A>, B> f17625a;

    /* renamed from: com.daaw.lq0$a */
    /* loaded from: classes.dex */
    public class C2108a extends vl0<C2109b<A>, B> {
        public C2108a(int i) {
            super(i);
        }

        @Override // com.daaw.vl0
        /* renamed from: n */
        public void mo3586j(C2109b<A> c2109b, B b) {
            c2109b.m16669c();
        }
    }

    /* renamed from: com.daaw.lq0$b */
    /* loaded from: classes.dex */
    public static final class C2109b<A> {

        /* renamed from: d */
        public static final Queue<C2109b<?>> f17627d = tq1.m8867d(0);

        /* renamed from: a */
        public int f17628a;

        /* renamed from: b */
        public int f17629b;

        /* renamed from: c */
        public A f17630c;

        /* renamed from: a */
        public static <A> C2109b<A> m16671a(A a, int i, int i2) {
            C2109b<A> c2109b = (C2109b<A>) f17627d.poll();
            if (c2109b == null) {
                c2109b = new C2109b<>();
            }
            c2109b.m16670b(a, i, i2);
            return c2109b;
        }

        /* renamed from: b */
        public final void m16670b(A a, int i, int i2) {
            this.f17630c = a;
            this.f17629b = i;
            this.f17628a = i2;
        }

        /* renamed from: c */
        public void m16669c() {
            f17627d.offer(this);
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2109b) {
                C2109b c2109b = (C2109b) obj;
                return this.f17629b == c2109b.f17629b && this.f17628a == c2109b.f17628a && this.f17630c.equals(c2109b.f17630c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f17628a * 31) + this.f17629b) * 31) + this.f17630c.hashCode();
        }
    }

    public lq0(int i) {
        this.f17625a = new C2108a(i);
    }

    /* renamed from: a */
    public B m16674a(A a, int i, int i2) {
        C2109b<A> m16671a = C2109b.m16671a(a, i, i2);
        B m7063g = this.f17625a.m7063g(m16671a);
        m16671a.m16669c();
        return m7063g;
    }

    /* renamed from: b */
    public void m16673b(A a, int i, int i2, B b) {
        this.f17625a.m7061k(C2109b.m16671a(a, i, i2), b);
    }
}
