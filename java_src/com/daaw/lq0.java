package com.daaw;

import java.util.Queue;
/* loaded from: classes.dex */
public class lq0<A, B> {
    public final vl0<b<A>, B> a;

    /* loaded from: classes.dex */
    public class a extends vl0<b<A>, B> {
        public a(int i) {
            super(i);
        }

        @Override // com.daaw.vl0
        /* renamed from: n */
        public void j(b<A> bVar, B b) {
            bVar.c();
        }
    }

    /* loaded from: classes.dex */
    public static final class b<A> {
        public static final Queue<b<?>> d = tq1.d(0);
        public int a;
        public int b;
        public A c;

        public static <A> b<A> a(A a, int i, int i2) {
            b<A> bVar = (b<A>) d.poll();
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a, i, i2);
            return bVar;
        }

        public final void b(A a, int i, int i2) {
            this.c = a;
            this.b = i;
            this.a = i2;
        }

        public void c() {
            d.offer(this);
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.b == bVar.b && this.a == bVar.a && this.c.equals(bVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public lq0(int i) {
        this.a = new a(i);
    }

    public B a(A a2, int i, int i2) {
        b<A> a3 = b.a(a2, i, i2);
        B g = this.a.g(a3);
        a3.c();
        return g;
    }

    public void b(A a2, int i, int i2, B b2) {
        this.a.k(b.a(a2, i, i2), b2);
    }
}
