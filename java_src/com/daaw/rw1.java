package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class rw1<T1, T2> {
    public Map<WeakReference<a<T1, T2>>, Object> a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface a<T1, T2> {
        void c(T1 t1, T2 t2);
    }

    public void a(T1 t1, T2 t2) {
        for (WeakReference<a<T1, T2>> weakReference : this.a.keySet()) {
            a<T1, T2> aVar = weakReference.get();
            if (aVar != null) {
                aVar.c(t1, t2);
            } else {
                this.a.remove(weakReference);
            }
        }
    }

    public void b(a<T1, T2> aVar, List<Object> list) {
        list.add(aVar);
        this.a.put(new WeakReference<>(aVar), this);
    }

    public void c(List<Object> list) {
        for (WeakReference<a<T1, T2>> weakReference : this.a.keySet()) {
            a<T1, T2> aVar = weakReference.get();
            if (aVar == null || list.remove(aVar)) {
                this.a.remove(weakReference);
            }
        }
    }
}
