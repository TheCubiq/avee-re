package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class ww1<T1, TResult> {
    public Map<WeakReference<a<T1, TResult>>, Object> a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface a<T1, TResult> {
        TResult b(T1 t1);
    }

    public TResult a(T1 t1, TResult tresult) {
        for (WeakReference<a<T1, TResult>> weakReference : this.a.keySet()) {
            a<T1, TResult> aVar = weakReference.get();
            if (aVar != null) {
                tresult = aVar.b(t1);
            } else {
                this.a.remove(weakReference);
            }
        }
        return tresult;
    }

    public void b(a<T1, TResult> aVar, List<Object> list) {
        list.add(aVar);
        this.a.put(new WeakReference<>(aVar), this);
    }
}
