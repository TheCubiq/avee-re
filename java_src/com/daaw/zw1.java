package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class zw1<T1, T2, T3, T4, T5, TResult> {

    /* renamed from: a */
    public Map<WeakReference<InterfaceC3912a<T1, T2, T3, T4, T5, TResult>>, Object> f35609a = new ConcurrentHashMap();

    /* renamed from: com.daaw.zw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3912a<T1, T2, T3, T4, T5, TResult> {
        /* renamed from: a */
        TResult mo1823a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);
    }

    /* renamed from: a */
    public TResult m1825a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, TResult tresult) {
        for (WeakReference<InterfaceC3912a<T1, T2, T3, T4, T5, TResult>> weakReference : this.f35609a.keySet()) {
            InterfaceC3912a<T1, T2, T3, T4, T5, TResult> interfaceC3912a = weakReference.get();
            if (interfaceC3912a != null) {
                tresult = interfaceC3912a.mo1823a(t1, t2, t3, t4, t5);
            } else {
                this.f35609a.remove(weakReference);
            }
        }
        return tresult;
    }

    /* renamed from: b */
    public void m1824b(InterfaceC3912a<T1, T2, T3, T4, T5, TResult> interfaceC3912a, List<Object> list) {
        list.add(interfaceC3912a);
        this.f35609a.put(new WeakReference<>(interfaceC3912a), this);
    }
}
