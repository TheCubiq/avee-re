package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class sw1<T1, T2, T3> {
    public Map<WeakReference<a<T1, T2, T3>>, Object> a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface a<T1, T2, T3> {
        void a(T1 t1, T2 t2, T3 t3);
    }

    public void a(T1 t1, T2 t2, T3 t3) {
        for (WeakReference<a<T1, T2, T3>> weakReference : this.a.keySet()) {
            a<T1, T2, T3> aVar = weakReference.get();
            if (aVar != null) {
                aVar.a(t1, t2, t3);
            } else {
                this.a.remove(weakReference);
            }
        }
    }

    public void b(a<T1, T2, T3> aVar, List<Object> list) {
        list.add(aVar);
        this.a.put(new WeakReference<>(aVar), this);
    }
}
