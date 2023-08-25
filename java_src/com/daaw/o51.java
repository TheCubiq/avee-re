package com.daaw;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
public final class o51 implements InterfaceC0842bi {

    /* renamed from: a */
    public final Set<i01<?>> f21046a;

    /* renamed from: b */
    public final Set<i01<?>> f21047b;

    /* renamed from: c */
    public final Set<i01<?>> f21048c;

    /* renamed from: d */
    public final Set<i01<?>> f21049d;

    /* renamed from: e */
    public final Set<i01<?>> f21050e;

    /* renamed from: f */
    public final Set<Class<?>> f21051f;

    /* renamed from: g */
    public final InterfaceC0842bi f21052g;

    /* renamed from: com.daaw.o51$a */
    /* loaded from: classes2.dex */
    public static class C2409a implements e01 {

        /* renamed from: a */
        public final Set<Class<?>> f21053a;

        /* renamed from: b */
        public final e01 f21054b;

        public C2409a(Set<Class<?>> set, e01 e01Var) {
            this.f21053a = set;
            this.f21054b = e01Var;
        }
    }

    public o51(C3330vh<?> c3330vh, InterfaceC0842bi interfaceC0842bi) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C3740ys c3740ys : c3330vh.m7171g()) {
            if (c3740ys.m3354e()) {
                boolean m3352g = c3740ys.m3352g();
                i01<?> m3356c = c3740ys.m3356c();
                if (m3352g) {
                    hashSet4.add(m3356c);
                } else {
                    hashSet.add(m3356c);
                }
            } else if (c3740ys.m3355d()) {
                hashSet3.add(c3740ys.m3356c());
            } else {
                boolean m3352g2 = c3740ys.m3352g();
                i01<?> m3356c2 = c3740ys.m3356c();
                if (m3352g2) {
                    hashSet5.add(m3356c2);
                } else {
                    hashSet2.add(m3356c2);
                }
            }
        }
        if (!c3330vh.m7167k().isEmpty()) {
            hashSet.add(i01.m20271b(e01.class));
        }
        this.f21046a = Collections.unmodifiableSet(hashSet);
        this.f21047b = Collections.unmodifiableSet(hashSet2);
        this.f21048c = Collections.unmodifiableSet(hashSet3);
        this.f21049d = Collections.unmodifiableSet(hashSet4);
        this.f21050e = Collections.unmodifiableSet(hashSet5);
        this.f21051f = c3330vh.m7167k();
        this.f21052g = interfaceC0842bi;
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: a */
    public <T> T mo12506a(Class<T> cls) {
        if (this.f21046a.contains(i01.m20271b(cls))) {
            T t = (T) this.f21052g.mo12506a(cls);
            return !cls.equals(e01.class) ? t : (T) new C2409a(this.f21051f, (e01) t);
        }
        throw new C1132dt(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: b */
    public <T> b01<Set<T>> mo12505b(i01<T> i01Var) {
        if (this.f21050e.contains(i01Var)) {
            return this.f21052g.mo12505b(i01Var);
        }
        throw new C1132dt(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", i01Var));
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: c */
    public <T> T mo12504c(i01<T> i01Var) {
        if (this.f21046a.contains(i01Var)) {
            return (T) this.f21052g.mo12504c(i01Var);
        }
        throw new C1132dt(String.format("Attempting to request an undeclared dependency %s.", i01Var));
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: d */
    public <T> b01<T> mo12503d(Class<T> cls) {
        return mo12500g(i01.m20271b(cls));
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: e */
    public <T> Set<T> mo12502e(i01<T> i01Var) {
        if (this.f21049d.contains(i01Var)) {
            return this.f21052g.mo12502e(i01Var);
        }
        throw new C1132dt(String.format("Attempting to request an undeclared dependency Set<%s>.", i01Var));
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: f */
    public /* synthetic */ Set mo12501f(Class cls) {
        return C0628ai.m27469f(this, cls);
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: g */
    public <T> b01<T> mo12500g(i01<T> i01Var) {
        if (this.f21047b.contains(i01Var)) {
            return this.f21052g.mo12500g(i01Var);
        }
        throw new C1132dt(String.format("Attempting to request an undeclared dependency Provider<%s>.", i01Var));
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: h */
    public <T> InterfaceC1216es<T> mo12499h(i01<T> i01Var) {
        if (this.f21048c.contains(i01Var)) {
            return this.f21052g.mo12499h(i01Var);
        }
        throw new C1132dt(String.format("Attempting to request an undeclared dependency Deferred<%s>.", i01Var));
    }

    @Override // com.daaw.InterfaceC0842bi
    /* renamed from: i */
    public <T> InterfaceC1216es<T> mo12498i(Class<T> cls) {
        return mo12499h(i01.m20271b(cls));
    }
}
