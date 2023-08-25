package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class kw1<T1, T2, T3> {
    public WeakReference<a<T1, T2, T3>> a = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface a<T1, T2, T3> {
        void a(T1 t1, T2 t2, T3 t3);
    }

    public void a(T1 t1, T2 t2, T3 t3) {
        a<T1, T2, T3> aVar = this.a.get();
        if (aVar != null) {
            aVar.a(t1, t2, t3);
        }
    }

    public kw1<T1, T2, T3> b(a<T1, T2, T3> aVar, List<Object> list) {
        list.add(aVar);
        this.a = new WeakReference<>(aVar);
        return this;
    }
}
