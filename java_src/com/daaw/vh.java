package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
public final class vh<T> {
    public final String a;
    public final Set<i01<? super T>> b;
    public final Set<ys> c;
    public final int d;
    public final int e;
    public final gi<T> f;
    public final Set<Class<?>> g;

    /* loaded from: classes2.dex */
    public static class b<T> {
        public String a;
        public final Set<i01<? super T>> b;
        public final Set<ys> c;
        public int d;
        public int e;
        public gi<T> f;
        public final Set<Class<?>> g;

        @SafeVarargs
        public b(i01<T> i01Var, i01<? super T>... i01VarArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            sy0.c(i01Var, "Null interface");
            hashSet.add(i01Var);
            for (i01<? super T> i01Var2 : i01VarArr) {
                sy0.c(i01Var2, "Null interface");
            }
            Collections.addAll(this.b, i01VarArr);
        }

        @SafeVarargs
        public b(Class<T> cls, Class<? super T>... clsArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            sy0.c(cls, "Null interface");
            hashSet.add(i01.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                sy0.c(cls2, "Null interface");
                this.b.add(i01.b(cls2));
            }
        }

        public b<T> b(ys ysVar) {
            sy0.c(ysVar, "Null dependency");
            i(ysVar.c());
            this.c.add(ysVar);
            return this;
        }

        public vh<T> c() {
            sy0.d(this.f != null, "Missing required property: factory.");
            return new vh<>(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }

        public b<T> d() {
            return h(2);
        }

        public b<T> e(gi<T> giVar) {
            this.f = (gi) sy0.c(giVar, "Null factory");
            return this;
        }

        public final b<T> f() {
            this.e = 1;
            return this;
        }

        public b<T> g(String str) {
            this.a = str;
            return this;
        }

        public final b<T> h(int i) {
            sy0.d(this.d == 0, "Instantiation type has already been set.");
            this.d = i;
            return this;
        }

        public final void i(i01<?> i01Var) {
            sy0.a(!this.b.contains(i01Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public vh(String str, Set<i01<? super T>> set, Set<ys> set2, int i, int i2, gi<T> giVar, Set<Class<?>> set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = giVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> c(i01<T> i01Var) {
        return new b<>(i01Var, new i01[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(i01<T> i01Var, i01<? super T>... i01VarArr) {
        return new b<>(i01Var, i01VarArr);
    }

    public static <T> b<T> e(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> vh<T> l(final T t, Class<T> cls) {
        return m(cls).e(new gi() { // from class: com.daaw.th
            @Override // com.daaw.gi
            public final Object a(bi biVar) {
                Object q;
                q = vh.q(t, biVar);
                return q;
            }
        }).c();
    }

    public static <T> b<T> m(Class<T> cls) {
        return e(cls).f();
    }

    public static /* synthetic */ Object q(Object obj, bi biVar) {
        return obj;
    }

    public static /* synthetic */ Object r(Object obj, bi biVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> vh<T> s(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return f(cls, clsArr).e(new gi() { // from class: com.daaw.uh
            @Override // com.daaw.gi
            public final Object a(bi biVar) {
                Object r;
                r = vh.r(t, biVar);
                return r;
            }
        }).c();
    }

    public Set<ys> g() {
        return this.c;
    }

    public gi<T> h() {
        return this.f;
    }

    public String i() {
        return this.a;
    }

    public Set<i01<? super T>> j() {
        return this.b;
    }

    public Set<Class<?>> k() {
        return this.g;
    }

    public boolean n() {
        return this.d == 1;
    }

    public boolean o() {
        return this.d == 2;
    }

    public boolean p() {
        return this.e == 0;
    }

    public vh<T> t(gi<T> giVar) {
        return new vh<>(this.a, this.b, this.c, this.d, this.e, giVar, this.g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
