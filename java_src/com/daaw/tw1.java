package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class tw1<T1, T2, T3, T4> {

    /* renamed from: a */
    public Map<WeakReference<InterfaceC3140a<T1, T2, T3, T4>>, Object> f28179a = new ConcurrentHashMap();

    /* renamed from: com.daaw.tw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3140a<T1, T2, T3, T4> {
        /* renamed from: a */
        void mo3114a(T1 t1, T2 t2, T3 t3, T4 t4);
    }

    /* renamed from: a */
    public void m8756a(T1 t1, T2 t2, T3 t3, T4 t4) {
        for (WeakReference<InterfaceC3140a<T1, T2, T3, T4>> weakReference : this.f28179a.keySet()) {
            InterfaceC3140a<T1, T2, T3, T4> interfaceC3140a = weakReference.get();
            if (interfaceC3140a != null) {
                interfaceC3140a.mo3114a(t1, t2, t3, t4);
            } else {
                this.f28179a.remove(weakReference);
            }
        }
    }

    /* renamed from: b */
    public void m8755b(InterfaceC3140a<T1, T2, T3, T4> interfaceC3140a, List<Object> list) {
        list.add(interfaceC3140a);
        this.f28179a.put(new WeakReference<>(interfaceC3140a), this);
    }
}
