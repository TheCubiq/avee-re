package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class xw1<T1, T2, TResult> {
    public Map<WeakReference<a<T1, T2, TResult>>, Object> a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface a<T1, T2, TResult> {
        TResult c(T1 t1, T2 t2);
    }

    public TResult a(T1 t1, T2 t2, TResult tresult) {
        for (WeakReference<a<T1, T2, TResult>> weakReference : this.a.keySet()) {
            a<T1, T2, TResult> aVar = weakReference.get();
            if (aVar != null) {
                tresult = aVar.c(t1, t2);
            } else {
                this.a.remove(weakReference);
            }
        }
        return tresult;
    }

    public void b(a<T1, T2, TResult> aVar, List<Object> list) {
        list.add(aVar);
        this.a.put(new WeakReference<>(aVar), this);
    }
}
