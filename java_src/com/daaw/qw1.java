package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class qw1<T1> {

    /* renamed from: a */
    public Map<WeakReference<InterfaceC2788a<T1>>, Object> f24538a = new ConcurrentHashMap();

    /* renamed from: com.daaw.qw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2788a<T1> {
        /* renamed from: b */
        void mo3122b(T1 t1);
    }

    /* renamed from: a */
    public void m12018a(T1 t1) {
        for (WeakReference<InterfaceC2788a<T1>> weakReference : this.f24538a.keySet()) {
            InterfaceC2788a<T1> interfaceC2788a = weakReference.get();
            if (interfaceC2788a != null) {
                interfaceC2788a.mo3122b(t1);
            } else {
                this.f24538a.remove(weakReference);
            }
        }
    }

    /* renamed from: b */
    public void m12017b(InterfaceC2788a<T1> interfaceC2788a, List<Object> list) {
        list.add(interfaceC2788a);
        this.f24538a.put(new WeakReference<>(interfaceC2788a), this);
    }

    /* renamed from: c */
    public void m12016c(List<Object> list) {
        for (WeakReference<InterfaceC2788a<T1>> weakReference : this.f24538a.keySet()) {
            InterfaceC2788a<T1> interfaceC2788a = weakReference.get();
            if (interfaceC2788a == null || list.remove(interfaceC2788a)) {
                this.f24538a.remove(weakReference);
            }
        }
    }
}
