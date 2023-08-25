package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class tw1<T1, T2, T3, T4> {
    public Map<WeakReference<a<T1, T2, T3, T4>>, Object> a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface a<T1, T2, T3, T4> {
        void a(T1 t1, T2 t2, T3 t3, T4 t4);
    }

    public void a(T1 t1, T2 t2, T3 t3, T4 t4) {
        for (WeakReference<a<T1, T2, T3, T4>> weakReference : this.a.keySet()) {
            a<T1, T2, T3, T4> aVar = weakReference.get();
            if (aVar != null) {
                aVar.a(t1, t2, t3, t4);
            } else {
                this.a.remove(weakReference);
            }
        }
    }

    public void b(a<T1, T2, T3, T4> aVar, List<Object> list) {
        list.add(aVar);
        this.a.put(new WeakReference<>(aVar), this);
    }
}
