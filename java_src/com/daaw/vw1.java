package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class vw1<TResult> {
    public Map<WeakReference<a<TResult>>, Object> a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface a<TResult> {
        TResult a();
    }

    public TResult a(TResult tresult) {
        for (WeakReference<a<TResult>> weakReference : this.a.keySet()) {
            a<TResult> aVar = weakReference.get();
            if (aVar != null) {
                tresult = aVar.a();
            } else {
                this.a.remove(weakReference);
            }
        }
        return tresult;
    }

    public void b(a<TResult> aVar, List<Object> list) {
        list.add(aVar);
        this.a.put(new WeakReference<>(aVar), this);
    }
}
