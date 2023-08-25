package com.daaw;
/* loaded from: classes.dex */
public final class ju<T> implements a01<T> {
    public static final Object c = new Object();
    public volatile a01<T> a;
    public volatile Object b = c;

    public ju(a01<T> a01Var) {
        this.a = a01Var;
    }

    public static <P extends a01<T>, T> a01<T> a(P p) {
        qy0.b(p);
        return p instanceof ju ? p : new ju(p);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // com.daaw.a01
    public T get() {
        T t = (T) this.b;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = this.b;
                if (t == obj) {
                    t = this.a.get();
                    this.b = b(this.b, t);
                    this.a = null;
                }
            }
        }
        return t;
    }
}
