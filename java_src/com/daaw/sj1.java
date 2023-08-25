package com.daaw;

import com.daaw.k3;
import com.daaw.k3.b;
import com.google.android.gms.common.Feature;
/* loaded from: classes.dex */
public abstract class sj1<A extends k3.b, ResultT> {
    public final Feature[] a;
    public final boolean b;
    public final int c;

    /* loaded from: classes.dex */
    public static class a<A extends k3.b, ResultT> {
        public q31<A, tj1<ResultT>> a;
        public Feature[] c;
        public boolean b = true;
        public int d = 0;

        public /* synthetic */ a(h12 h12Var) {
        }

        public sj1<A, ResultT> a() {
            ry0.b(this.a != null, "execute parameter required");
            return new g12(this, this.c, this.b, this.d);
        }

        public a<A, ResultT> b(q31<A, tj1<ResultT>> q31Var) {
            this.a = q31Var;
            return this;
        }

        public a<A, ResultT> c(boolean z) {
            this.b = z;
            return this;
        }

        public a<A, ResultT> d(Feature... featureArr) {
            this.c = featureArr;
            return this;
        }

        public a<A, ResultT> e(int i) {
            this.d = i;
            return this;
        }
    }

    public sj1(Feature[] featureArr, boolean z, int i) {
        this.a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static <A extends k3.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    public abstract void b(A a2, tj1<ResultT> tj1Var);

    public boolean c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final Feature[] e() {
        return this.a;
    }
}
