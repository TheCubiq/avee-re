package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2.dex */
public abstract class e7<T> extends pu0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(e7.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = d7.a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.pu0
    public e7<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.pu0
    public final Object c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == d7.a) {
            obj2 = e(g(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t, Object obj);

    public final Object e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = d7.a;
        return obj2 != obj3 ? obj2 : j.a(a, this, obj3, obj) ? obj : this._consensus;
    }

    public long f() {
        return 0L;
    }

    public abstract Object g(T t);
}
