package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class xw1<T1, T2, TResult> {

    /* renamed from: a */
    public Map<WeakReference<InterfaceC3648a<T1, T2, TResult>>, Object> f33085a = new ConcurrentHashMap();

    /* renamed from: com.daaw.xw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3648a<T1, T2, TResult> {
        /* renamed from: c */
        TResult mo4423c(T1 t1, T2 t2);
    }

    /* renamed from: a */
    public TResult m4425a(T1 t1, T2 t2, TResult tresult) {
        for (WeakReference<InterfaceC3648a<T1, T2, TResult>> weakReference : this.f33085a.keySet()) {
            InterfaceC3648a<T1, T2, TResult> interfaceC3648a = weakReference.get();
            if (interfaceC3648a != null) {
                tresult = interfaceC3648a.mo4423c(t1, t2);
            } else {
                this.f33085a.remove(weakReference);
            }
        }
        return tresult;
    }

    /* renamed from: b */
    public void m4424b(InterfaceC3648a<T1, T2, TResult> interfaceC3648a, List<Object> list) {
        list.add(interfaceC3648a);
        this.f33085a.put(new WeakReference<>(interfaceC3648a), this);
    }
}
