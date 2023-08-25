package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class pw1 {
    public Map<WeakReference<a>, Object> a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public void a() {
        for (WeakReference<a> weakReference : this.a.keySet()) {
            a aVar = weakReference.get();
            if (aVar != null) {
                aVar.a();
            } else {
                this.a.remove(weakReference);
            }
        }
    }

    public void b(a aVar, List<Object> list) {
        list.add(aVar);
        this.a.put(new WeakReference<>(aVar), this);
    }
}
