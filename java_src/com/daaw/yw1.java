package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class yw1<T1, T2, T3, TResult> {

    /* renamed from: a */
    public Map<WeakReference<InterfaceC3757a<T1, T2, T3, TResult>>, Object> f34190a = new ConcurrentHashMap();

    /* renamed from: com.daaw.yw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3757a<T1, T2, T3, TResult> {
        /* renamed from: a */
        TResult mo3153a(T1 t1, T2 t2, T3 t3);
    }

    /* renamed from: a */
    public TResult m3155a(T1 t1, T2 t2, T3 t3, TResult tresult) {
        for (WeakReference<InterfaceC3757a<T1, T2, T3, TResult>> weakReference : this.f34190a.keySet()) {
            InterfaceC3757a<T1, T2, T3, TResult> interfaceC3757a = weakReference.get();
            if (interfaceC3757a != null) {
                tresult = interfaceC3757a.mo3153a(t1, t2, t3);
            } else {
                this.f34190a.remove(weakReference);
            }
        }
        return tresult;
    }

    /* renamed from: b */
    public void m3154b(InterfaceC3757a<T1, T2, T3, TResult> interfaceC3757a, List<Object> list) {
        list.add(interfaceC3757a);
        this.f34190a.put(new WeakReference<>(interfaceC3757a), this);
    }
}
