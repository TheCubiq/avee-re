package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class pw1 {

    /* renamed from: a */
    public Map<WeakReference<InterfaceC2649a>, Object> f23442a = new ConcurrentHashMap();

    /* renamed from: com.daaw.pw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2649a {
        /* renamed from: a */
        void mo3124a();
    }

    /* renamed from: a */
    public void m12990a() {
        for (WeakReference<InterfaceC2649a> weakReference : this.f23442a.keySet()) {
            InterfaceC2649a interfaceC2649a = weakReference.get();
            if (interfaceC2649a != null) {
                interfaceC2649a.mo3124a();
            } else {
                this.f23442a.remove(weakReference);
            }
        }
    }

    /* renamed from: b */
    public void m12989b(InterfaceC2649a interfaceC2649a, List<Object> list) {
        list.add(interfaceC2649a);
        this.f23442a.put(new WeakReference<>(interfaceC2649a), this);
    }
}
