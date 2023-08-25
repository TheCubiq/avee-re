package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class uw1<T1, T2, T3, T4, T5> {

    /* renamed from: a */
    public Map<WeakReference<InterfaceC3263a<T1, T2, T3, T4, T5>>, Object> f29581a = new ConcurrentHashMap();

    /* renamed from: com.daaw.uw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3263a<T1, T2, T3, T4, T5> {
        /* renamed from: a */
        void mo3116a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);
    }

    /* renamed from: a */
    public void m7667a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        for (WeakReference<InterfaceC3263a<T1, T2, T3, T4, T5>> weakReference : this.f29581a.keySet()) {
            InterfaceC3263a<T1, T2, T3, T4, T5> interfaceC3263a = weakReference.get();
            if (interfaceC3263a != null) {
                interfaceC3263a.mo3116a(t1, t2, t3, t4, t5);
            } else {
                this.f29581a.remove(weakReference);
            }
        }
    }

    /* renamed from: b */
    public void m7666b(InterfaceC3263a<T1, T2, T3, T4, T5> interfaceC3263a, List<Object> list) {
        list.add(interfaceC3263a);
        this.f29581a.put(new WeakReference<>(interfaceC3263a), this);
    }
}
