package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: com.daaw.e7 */
/* loaded from: classes2.dex */
public abstract class AbstractC1164e7<T> extends pu0 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8204a = AtomicReferenceFieldUpdater.newUpdater(AbstractC1164e7.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C1057d7.f6567a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.pu0
    /* renamed from: a */
    public AbstractC1164e7<?> mo13144a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.pu0
    /* renamed from: c */
    public final Object mo13142c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C1057d7.f6567a) {
            obj2 = m23696e(mo8186g(obj));
        }
        mo3619d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo3619d(T t, Object obj);

    /* renamed from: e */
    public final Object m23696e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C1057d7.f6567a;
        return obj2 != obj3 ? obj2 : C1773j.m19216a(f8204a, this, obj3, obj) ? obj : this._consensus;
    }

    /* renamed from: f */
    public long m23695f() {
        return 0L;
    }

    /* renamed from: g */
    public abstract Object mo8186g(T t);
}
