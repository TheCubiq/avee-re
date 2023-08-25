package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class rw1<T1, T2> {

    /* renamed from: a */
    public Map<WeakReference<InterfaceC2894a<T1, T2>>, Object> f25664a = new ConcurrentHashMap();

    /* renamed from: com.daaw.rw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2894a<T1, T2> {
        /* renamed from: c */
        void mo2813c(T1 t1, T2 t2);
    }

    /* renamed from: a */
    public void m10862a(T1 t1, T2 t2) {
        for (WeakReference<InterfaceC2894a<T1, T2>> weakReference : this.f25664a.keySet()) {
            InterfaceC2894a<T1, T2> interfaceC2894a = weakReference.get();
            if (interfaceC2894a != null) {
                interfaceC2894a.mo2813c(t1, t2);
            } else {
                this.f25664a.remove(weakReference);
            }
        }
    }

    /* renamed from: b */
    public void m10861b(InterfaceC2894a<T1, T2> interfaceC2894a, List<Object> list) {
        list.add(interfaceC2894a);
        this.f25664a.put(new WeakReference<>(interfaceC2894a), this);
    }

    /* renamed from: c */
    public void m10860c(List<Object> list) {
        for (WeakReference<InterfaceC2894a<T1, T2>> weakReference : this.f25664a.keySet()) {
            InterfaceC2894a<T1, T2> interfaceC2894a = weakReference.get();
            if (interfaceC2894a == null || list.remove(interfaceC2894a)) {
                this.f25664a.remove(weakReference);
            }
        }
    }
}
