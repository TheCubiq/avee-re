package com.daaw;

import com.daaw.C1897k3;
import com.daaw.C1897k3.InterfaceC1899b;
import com.google.android.gms.common.Feature;
/* loaded from: classes.dex */
public abstract class sj1<A extends C1897k3.InterfaceC1899b, ResultT> {

    /* renamed from: a */
    public final Feature[] f26300a;

    /* renamed from: b */
    public final boolean f26301b;

    /* renamed from: c */
    public final int f26302c;

    /* renamed from: com.daaw.sj1$a */
    /* loaded from: classes.dex */
    public static class C2945a<A extends C1897k3.InterfaceC1899b, ResultT> {

        /* renamed from: a */
        public q31<A, tj1<ResultT>> f26303a;

        /* renamed from: c */
        public Feature[] f26305c;

        /* renamed from: b */
        public boolean f26304b = true;

        /* renamed from: d */
        public int f26306d = 0;

        public /* synthetic */ C2945a(h12 h12Var) {
        }

        /* renamed from: a */
        public sj1<A, ResultT> m10299a() {
            ry0.m10838b(this.f26303a != null, "execute parameter required");
            return new g12(this, this.f26305c, this.f26304b, this.f26306d);
        }

        /* renamed from: b */
        public C2945a<A, ResultT> m10298b(q31<A, tj1<ResultT>> q31Var) {
            this.f26303a = q31Var;
            return this;
        }

        /* renamed from: c */
        public C2945a<A, ResultT> m10297c(boolean z) {
            this.f26304b = z;
            return this;
        }

        /* renamed from: d */
        public C2945a<A, ResultT> m10296d(Feature... featureArr) {
            this.f26305c = featureArr;
            return this;
        }

        /* renamed from: e */
        public C2945a<A, ResultT> m10295e(int i) {
            this.f26306d = i;
            return this;
        }
    }

    public sj1(Feature[] featureArr, boolean z, int i) {
        this.f26300a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f26301b = z2;
        this.f26302c = i;
    }

    /* renamed from: a */
    public static <A extends C1897k3.InterfaceC1899b, ResultT> C2945a<A, ResultT> m10304a() {
        return new C2945a<>(null);
    }

    /* renamed from: b */
    public abstract void mo10303b(A a, tj1<ResultT> tj1Var);

    /* renamed from: c */
    public boolean m10302c() {
        return this.f26301b;
    }

    /* renamed from: d */
    public final int m10301d() {
        return this.f26302c;
    }

    /* renamed from: e */
    public final Feature[] m10300e() {
        return this.f26300a;
    }
}
