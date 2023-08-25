package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class jh0<T> {

    /* renamed from: a */
    public Object f15100a;

    /* renamed from: b */
    public List<T> f15101b = new ArrayList();

    /* renamed from: com.daaw.jh0$a */
    /* loaded from: classes.dex */
    public static class C1829a<T> {

        /* renamed from: a */
        public sd0 f15102a;

        /* renamed from: b */
        public T f15103b;

        public C1829a(sd0 sd0Var, T t) {
            C2691q6.m12752f(sd0Var);
            C2691q6.m12752f(t);
            this.f15102a = sd0Var;
            this.f15103b = t;
        }

        /* renamed from: c */
        public sd0 m18518c() {
            return this.f15102a;
        }

        /* renamed from: d */
        public T m18517d() {
            return this.f15103b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1829a) {
                C1829a c1829a = (C1829a) obj;
                return this.f15102a.equals(c1829a.f15102a) && this.f15103b.equals(c1829a.f15103b);
            }
            return false;
        }

        public int hashCode() {
            return this.f15102a.hashCode() + this.f15103b.hashCode();
        }
    }

    public jh0(Object obj) {
        C2691q6.m12752f(obj);
        this.f15100a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m18523a(C1829a<T> c1829a) {
        if (this.f15100a.equals(c1829a.f15102a) && !this.f15101b.contains(c1829a.f15103b)) {
            this.f15101b.add(c1829a.f15103b);
        }
    }

    /* renamed from: b */
    public boolean m18522b(T t) {
        return this.f15101b.contains(t);
    }

    /* renamed from: c */
    public void m18521c(C1829a<T> c1829a) {
        if (this.f15100a.equals(c1829a.f15102a)) {
            this.f15101b.remove(c1829a.f15103b);
        }
    }
}
