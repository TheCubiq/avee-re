package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class vw1<TResult> {

    /* renamed from: a */
    public Map<WeakReference<InterfaceC3381a<TResult>>, Object> f30671a = new ConcurrentHashMap();

    /* renamed from: com.daaw.vw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3381a<TResult> {
        /* renamed from: a */
        TResult mo3126a();
    }

    /* renamed from: a */
    public TResult m6692a(TResult tresult) {
        for (WeakReference<InterfaceC3381a<TResult>> weakReference : this.f30671a.keySet()) {
            InterfaceC3381a<TResult> interfaceC3381a = weakReference.get();
            if (interfaceC3381a != null) {
                tresult = interfaceC3381a.mo3126a();
            } else {
                this.f30671a.remove(weakReference);
            }
        }
        return tresult;
    }

    /* renamed from: b */
    public void m6691b(InterfaceC3381a<TResult> interfaceC3381a, List<Object> list) {
        list.add(interfaceC3381a);
        this.f30671a.put(new WeakReference<>(interfaceC3381a), this);
    }
}
