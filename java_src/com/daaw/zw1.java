package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class zw1<T1, T2, T3, T4, T5, TResult> {
    public Map<WeakReference<a<T1, T2, T3, T4, T5, TResult>>, Object> a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface a<T1, T2, T3, T4, T5, TResult> {
        TResult a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);
    }

    public TResult a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, TResult tresult) {
        for (WeakReference<a<T1, T2, T3, T4, T5, TResult>> weakReference : this.a.keySet()) {
            a<T1, T2, T3, T4, T5, TResult> aVar = weakReference.get();
            if (aVar != null) {
                tresult = aVar.a(t1, t2, t3, t4, t5);
            } else {
                this.a.remove(weakReference);
            }
        }
        return tresult;
    }

    public void b(a<T1, T2, T3, T4, T5, TResult> aVar, List<Object> list) {
        list.add(aVar);
        this.a.put(new WeakReference<>(aVar), this);
    }
}
