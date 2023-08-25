package com.daaw;
/* renamed from: com.daaw.ju */
/* loaded from: classes.dex */
public final class C1870ju<T> implements a01<T> {

    /* renamed from: c */
    public static final Object f15410c = new Object();

    /* renamed from: a */
    public volatile a01<T> f15411a;

    /* renamed from: b */
    public volatile Object f15412b = f15410c;

    public C1870ju(a01<T> a01Var) {
        this.f15411a = a01Var;
    }

    /* renamed from: a */
    public static <P extends a01<T>, T> a01<T> m18250a(P p) {
        qy0.m11940b(p);
        return p instanceof C1870ju ? p : new C1870ju(p);
    }

    /* renamed from: b */
    public static Object m18249b(Object obj, Object obj2) {
        if (!(obj != f15410c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // com.daaw.a01
    public T get() {
        T t = (T) this.f15412b;
        Object obj = f15410c;
        if (t == obj) {
            synchronized (this) {
                t = this.f15412b;
                if (t == obj) {
                    t = this.f15411a.get();
                    this.f15412b = m18249b(this.f15412b, t);
                    this.f15411a = null;
                }
            }
        }
        return t;
    }
}
