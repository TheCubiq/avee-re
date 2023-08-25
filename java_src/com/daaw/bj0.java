package com.daaw;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class bj0<T> implements b01<Set<T>> {

    /* renamed from: b */
    public volatile Set<T> f4848b = null;

    /* renamed from: a */
    public volatile Set<b01<T>> f4847a = Collections.newSetFromMap(new ConcurrentHashMap());

    public bj0(Collection<b01<T>> collection) {
        this.f4847a.addAll(collection);
    }

    /* renamed from: b */
    public static bj0<?> m26131b(Collection<b01<?>> collection) {
        return new bj0<>((Set) collection);
    }

    /* renamed from: a */
    public synchronized void m26132a(b01<T> b01Var) {
        Set set;
        if (this.f4848b == null) {
            set = this.f4847a;
        } else {
            set = this.f4848b;
            b01Var = (b01<T>) b01Var.get();
        }
        set.add(b01Var);
    }

    @Override // com.daaw.b01
    /* renamed from: c */
    public Set<T> get() {
        if (this.f4848b == null) {
            synchronized (this) {
                if (this.f4848b == null) {
                    this.f4848b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m26129d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f4848b);
    }

    /* renamed from: d */
    public final synchronized void m26129d() {
        for (b01<T> b01Var : this.f4847a) {
            this.f4848b.add(b01Var.get());
        }
        this.f4847a = null;
    }
}
