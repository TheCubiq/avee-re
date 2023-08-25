package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.daaw.vh */
/* loaded from: classes2.dex */
public final class C3330vh<T> {

    /* renamed from: a */
    public final String f30209a;

    /* renamed from: b */
    public final Set<i01<? super T>> f30210b;

    /* renamed from: c */
    public final Set<C3740ys> f30211c;

    /* renamed from: d */
    public final int f30212d;

    /* renamed from: e */
    public final int f30213e;

    /* renamed from: f */
    public final InterfaceC1421gi<T> f30214f;

    /* renamed from: g */
    public final Set<Class<?>> f30215g;

    /* renamed from: com.daaw.vh$b */
    /* loaded from: classes2.dex */
    public static class C3332b<T> {

        /* renamed from: a */
        public String f30216a;

        /* renamed from: b */
        public final Set<i01<? super T>> f30217b;

        /* renamed from: c */
        public final Set<C3740ys> f30218c;

        /* renamed from: d */
        public int f30219d;

        /* renamed from: e */
        public int f30220e;

        /* renamed from: f */
        public InterfaceC1421gi<T> f30221f;

        /* renamed from: g */
        public final Set<Class<?>> f30222g;

        @SafeVarargs
        public C3332b(i01<T> i01Var, i01<? super T>... i01VarArr) {
            this.f30216a = null;
            HashSet hashSet = new HashSet();
            this.f30217b = hashSet;
            this.f30218c = new HashSet();
            this.f30219d = 0;
            this.f30220e = 0;
            this.f30222g = new HashSet();
            sy0.m9733c(i01Var, "Null interface");
            hashSet.add(i01Var);
            for (i01<? super T> i01Var2 : i01VarArr) {
                sy0.m9733c(i01Var2, "Null interface");
            }
            Collections.addAll(this.f30217b, i01VarArr);
        }

        @SafeVarargs
        public C3332b(Class<T> cls, Class<? super T>... clsArr) {
            this.f30216a = null;
            HashSet hashSet = new HashSet();
            this.f30217b = hashSet;
            this.f30218c = new HashSet();
            this.f30219d = 0;
            this.f30220e = 0;
            this.f30222g = new HashSet();
            sy0.m9733c(cls, "Null interface");
            hashSet.add(i01.m20271b(cls));
            for (Class<? super T> cls2 : clsArr) {
                sy0.m9733c(cls2, "Null interface");
                this.f30217b.add(i01.m20271b(cls2));
            }
        }

        /* renamed from: b */
        public C3332b<T> m7156b(C3740ys c3740ys) {
            sy0.m9733c(c3740ys, "Null dependency");
            m7149i(c3740ys.m3356c());
            this.f30218c.add(c3740ys);
            return this;
        }

        /* renamed from: c */
        public C3330vh<T> m7155c() {
            sy0.m9732d(this.f30221f != null, "Missing required property: factory.");
            return new C3330vh<>(this.f30216a, new HashSet(this.f30217b), new HashSet(this.f30218c), this.f30219d, this.f30220e, this.f30221f, this.f30222g);
        }

        /* renamed from: d */
        public C3332b<T> m7154d() {
            return m7150h(2);
        }

        /* renamed from: e */
        public C3332b<T> m7153e(InterfaceC1421gi<T> interfaceC1421gi) {
            this.f30221f = (InterfaceC1421gi) sy0.m9733c(interfaceC1421gi, "Null factory");
            return this;
        }

        /* renamed from: f */
        public final C3332b<T> m7152f() {
            this.f30220e = 1;
            return this;
        }

        /* renamed from: g */
        public C3332b<T> m7151g(String str) {
            this.f30216a = str;
            return this;
        }

        /* renamed from: h */
        public final C3332b<T> m7150h(int i) {
            sy0.m9732d(this.f30219d == 0, "Instantiation type has already been set.");
            this.f30219d = i;
            return this;
        }

        /* renamed from: i */
        public final void m7149i(i01<?> i01Var) {
            sy0.m9735a(!this.f30217b.contains(i01Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public C3330vh(String str, Set<i01<? super T>> set, Set<C3740ys> set2, int i, int i2, InterfaceC1421gi<T> interfaceC1421gi, Set<Class<?>> set3) {
        this.f30209a = str;
        this.f30210b = Collections.unmodifiableSet(set);
        this.f30211c = Collections.unmodifiableSet(set2);
        this.f30212d = i;
        this.f30213e = i2;
        this.f30214f = interfaceC1421gi;
        this.f30215g = Collections.unmodifiableSet(set3);
    }

    /* renamed from: c */
    public static <T> C3332b<T> m7175c(i01<T> i01Var) {
        return new C3332b<>(i01Var, new i01[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> C3332b<T> m7174d(i01<T> i01Var, i01<? super T>... i01VarArr) {
        return new C3332b<>(i01Var, i01VarArr);
    }

    /* renamed from: e */
    public static <T> C3332b<T> m7173e(Class<T> cls) {
        return new C3332b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: f */
    public static <T> C3332b<T> m7172f(Class<T> cls, Class<? super T>... clsArr) {
        return new C3332b<>(cls, clsArr);
    }

    /* renamed from: l */
    public static <T> C3330vh<T> m7166l(final T t, Class<T> cls) {
        return m7165m(cls).m7153e(new InterfaceC1421gi() { // from class: com.daaw.th
            @Override // com.daaw.InterfaceC1421gi
            /* renamed from: a */
            public final Object mo3451a(InterfaceC0842bi interfaceC0842bi) {
                Object m7161q;
                m7161q = C3330vh.m7161q(t, interfaceC0842bi);
                return m7161q;
            }
        }).m7155c();
    }

    /* renamed from: m */
    public static <T> C3332b<T> m7165m(Class<T> cls) {
        return m7173e(cls).m7152f();
    }

    /* renamed from: q */
    public static /* synthetic */ Object m7161q(Object obj, InterfaceC0842bi interfaceC0842bi) {
        return obj;
    }

    /* renamed from: r */
    public static /* synthetic */ Object m7160r(Object obj, InterfaceC0842bi interfaceC0842bi) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: s */
    public static <T> C3330vh<T> m7159s(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return m7172f(cls, clsArr).m7153e(new InterfaceC1421gi() { // from class: com.daaw.uh
            @Override // com.daaw.InterfaceC1421gi
            /* renamed from: a */
            public final Object mo3451a(InterfaceC0842bi interfaceC0842bi) {
                Object m7160r;
                m7160r = C3330vh.m7160r(t, interfaceC0842bi);
                return m7160r;
            }
        }).m7155c();
    }

    /* renamed from: g */
    public Set<C3740ys> m7171g() {
        return this.f30211c;
    }

    /* renamed from: h */
    public InterfaceC1421gi<T> m7170h() {
        return this.f30214f;
    }

    /* renamed from: i */
    public String m7169i() {
        return this.f30209a;
    }

    /* renamed from: j */
    public Set<i01<? super T>> m7168j() {
        return this.f30210b;
    }

    /* renamed from: k */
    public Set<Class<?>> m7167k() {
        return this.f30215g;
    }

    /* renamed from: n */
    public boolean m7164n() {
        return this.f30212d == 1;
    }

    /* renamed from: o */
    public boolean m7163o() {
        return this.f30212d == 2;
    }

    /* renamed from: p */
    public boolean m7162p() {
        return this.f30213e == 0;
    }

    /* renamed from: t */
    public C3330vh<T> m7158t(InterfaceC1421gi<T> interfaceC1421gi) {
        return new C3330vh<>(this.f30209a, this.f30210b, this.f30211c, this.f30212d, this.f30213e, interfaceC1421gi, this.f30215g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f30210b.toArray()) + ">{" + this.f30212d + ", type=" + this.f30213e + ", deps=" + Arrays.toString(this.f30211c.toArray()) + "}";
    }
}
