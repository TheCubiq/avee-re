package com.daaw;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
public final class o51 implements bi {
    public final Set<i01<?>> a;
    public final Set<i01<?>> b;
    public final Set<i01<?>> c;
    public final Set<i01<?>> d;
    public final Set<i01<?>> e;
    public final Set<Class<?>> f;
    public final bi g;

    /* loaded from: classes2.dex */
    public static class a implements e01 {
        public final Set<Class<?>> a;
        public final e01 b;

        public a(Set<Class<?>> set, e01 e01Var) {
            this.a = set;
            this.b = e01Var;
        }
    }

    public o51(vh<?> vhVar, bi biVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (ys ysVar : vhVar.g()) {
            if (ysVar.e()) {
                boolean g = ysVar.g();
                i01<?> c = ysVar.c();
                if (g) {
                    hashSet4.add(c);
                } else {
                    hashSet.add(c);
                }
            } else if (ysVar.d()) {
                hashSet3.add(ysVar.c());
            } else {
                boolean g2 = ysVar.g();
                i01<?> c2 = ysVar.c();
                if (g2) {
                    hashSet5.add(c2);
                } else {
                    hashSet2.add(c2);
                }
            }
        }
        if (!vhVar.k().isEmpty()) {
            hashSet.add(i01.b(e01.class));
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = vhVar.k();
        this.g = biVar;
    }

    @Override // com.daaw.bi
    public <T> T a(Class<T> cls) {
        if (this.a.contains(i01.b(cls))) {
            T t = (T) this.g.a(cls);
            return !cls.equals(e01.class) ? t : (T) new a(this.f, (e01) t);
        }
        throw new dt(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // com.daaw.bi
    public <T> b01<Set<T>> b(i01<T> i01Var) {
        if (this.e.contains(i01Var)) {
            return this.g.b(i01Var);
        }
        throw new dt(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", i01Var));
    }

    @Override // com.daaw.bi
    public <T> T c(i01<T> i01Var) {
        if (this.a.contains(i01Var)) {
            return (T) this.g.c(i01Var);
        }
        throw new dt(String.format("Attempting to request an undeclared dependency %s.", i01Var));
    }

    @Override // com.daaw.bi
    public <T> b01<T> d(Class<T> cls) {
        return g(i01.b(cls));
    }

    @Override // com.daaw.bi
    public <T> Set<T> e(i01<T> i01Var) {
        if (this.d.contains(i01Var)) {
            return this.g.e(i01Var);
        }
        throw new dt(String.format("Attempting to request an undeclared dependency Set<%s>.", i01Var));
    }

    @Override // com.daaw.bi
    public /* synthetic */ Set f(Class cls) {
        return ai.f(this, cls);
    }

    @Override // com.daaw.bi
    public <T> b01<T> g(i01<T> i01Var) {
        if (this.b.contains(i01Var)) {
            return this.g.g(i01Var);
        }
        throw new dt(String.format("Attempting to request an undeclared dependency Provider<%s>.", i01Var));
    }

    @Override // com.daaw.bi
    public <T> es<T> h(i01<T> i01Var) {
        if (this.c.contains(i01Var)) {
            return this.g.h(i01Var);
        }
        throw new dt(String.format("Attempting to request an undeclared dependency Deferred<%s>.", i01Var));
    }

    @Override // com.daaw.bi
    public <T> es<T> i(Class<T> cls) {
        return h(i01.b(cls));
    }
}
