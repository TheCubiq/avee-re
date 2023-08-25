package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class ww1<T1, TResult> {

    /* renamed from: a */
    public Map<WeakReference<InterfaceC3477a<T1, TResult>>, Object> f31601a = new ConcurrentHashMap();

    /* renamed from: com.daaw.ww1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3477a<T1, TResult> {
        /* renamed from: b */
        TResult mo5751b(T1 t1);
    }

    /* renamed from: a */
    public TResult m5753a(T1 t1, TResult tresult) {
        for (WeakReference<InterfaceC3477a<T1, TResult>> weakReference : this.f31601a.keySet()) {
            InterfaceC3477a<T1, TResult> interfaceC3477a = weakReference.get();
            if (interfaceC3477a != null) {
                tresult = interfaceC3477a.mo5751b(t1);
            } else {
                this.f31601a.remove(weakReference);
            }
        }
        return tresult;
    }

    /* renamed from: b */
    public void m5752b(InterfaceC3477a<T1, TResult> interfaceC3477a, List<Object> list) {
        list.add(interfaceC3477a);
        this.f31601a.put(new WeakReference<>(interfaceC3477a), this);
    }
}
