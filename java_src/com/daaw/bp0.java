package com.daaw;

import android.os.Handler;
/* loaded from: classes.dex */
public interface bp0 {

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final long d;

        public a(int i) {
            this(i, -1L);
        }

        public a(int i, int i2, int i3, long j) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = j;
        }

        public a(int i, long j) {
            this(i, -1, -1, j);
        }

        public a a(int i) {
            return this.a == i ? this : new a(i, this.b, this.c, this.d);
        }

        public boolean b() {
            return this.b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public int hashCode() {
            return ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void d(bp0 bp0Var, nl1 nl1Var, Object obj);
    }

    void a(qo0 qo0Var);

    void c(Handler handler, cp0 cp0Var);

    void e();

    void f(rz rzVar, boolean z, b bVar);

    qo0 g(a aVar, l2 l2Var);

    void h(b bVar);

    void i(cp0 cp0Var);
}
