package com.daaw;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class bj0<T> implements b01<Set<T>> {
    public volatile Set<T> b = null;
    public volatile Set<b01<T>> a = Collections.newSetFromMap(new ConcurrentHashMap());

    public bj0(Collection<b01<T>> collection) {
        this.a.addAll(collection);
    }

    public static bj0<?> b(Collection<b01<?>> collection) {
        return new bj0<>((Set) collection);
    }

    public synchronized void a(b01<T> b01Var) {
        Set set;
        if (this.b == null) {
            set = this.a;
        } else {
            set = this.b;
            b01Var = (b01<T>) b01Var.get();
        }
        set.add(b01Var);
    }

    @Override // com.daaw.b01
    /* renamed from: c */
    public Set<T> get() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }

    public final synchronized void d() {
        for (b01<T> b01Var : this.a) {
            this.b.add(b01Var.get());
        }
        this.a = null;
    }
}
