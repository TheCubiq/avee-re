package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class yw1<T1, T2, T3, TResult> {
    public Map<WeakReference<a<T1, T2, T3, TResult>>, Object> a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface a<T1, T2, T3, TResult> {
        TResult a(T1 t1, T2 t2, T3 t3);
    }

    public TResult a(T1 t1, T2 t2, T3 t3, TResult tresult) {
        for (WeakReference<a<T1, T2, T3, TResult>> weakReference : this.a.keySet()) {
            a<T1, T2, T3, TResult> aVar = weakReference.get();
            if (aVar != null) {
                tresult = aVar.a(t1, t2, t3);
            } else {
                this.a.remove(weakReference);
            }
        }
        return tresult;
    }

    public void b(a<T1, T2, T3, TResult> aVar, List<Object> list) {
        list.add(aVar);
        this.a.put(new WeakReference<>(aVar), this);
    }
}
