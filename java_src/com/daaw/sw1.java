package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class sw1<T1, T2, T3> {

    /* renamed from: a */
    public Map<WeakReference<InterfaceC2987a<T1, T2, T3>>, Object> f26711a = new ConcurrentHashMap();

    /* renamed from: com.daaw.sw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2987a<T1, T2, T3> {
        /* renamed from: a */
        void mo3118a(T1 t1, T2 t2, T3 t3);
    }

    /* renamed from: a */
    public void m9795a(T1 t1, T2 t2, T3 t3) {
        for (WeakReference<InterfaceC2987a<T1, T2, T3>> weakReference : this.f26711a.keySet()) {
            InterfaceC2987a<T1, T2, T3> interfaceC2987a = weakReference.get();
            if (interfaceC2987a != null) {
                interfaceC2987a.mo3118a(t1, t2, t3);
            } else {
                this.f26711a.remove(weakReference);
            }
        }
    }

    /* renamed from: b */
    public void m9794b(InterfaceC2987a<T1, T2, T3> interfaceC2987a, List<Object> list) {
        list.add(interfaceC2987a);
        this.f26711a.put(new WeakReference<>(interfaceC2987a), this);
    }
}
