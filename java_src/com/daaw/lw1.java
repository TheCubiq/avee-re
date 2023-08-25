package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class lw1<T1, T2, T3, T4> {

    /* renamed from: a */
    public WeakReference<InterfaceC2127a<T1, T2, T3, T4>> f17849a = new WeakReference<>(null);

    /* renamed from: com.daaw.lw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2127a<T1, T2, T3, T4> {
        /* renamed from: a */
        void mo16453a(T1 t1, T2 t2, T3 t3, T4 t4);
    }

    /* renamed from: a */
    public void m16455a(T1 t1, T2 t2, T3 t3, T4 t4) {
        InterfaceC2127a<T1, T2, T3, T4> interfaceC2127a = this.f17849a.get();
        if (interfaceC2127a != null) {
            interfaceC2127a.mo16453a(t1, t2, t3, t4);
        }
    }

    /* renamed from: b */
    public lw1<T1, T2, T3, T4> m16454b(InterfaceC2127a<T1, T2, T3, T4> interfaceC2127a, List<Object> list) {
        list.add(interfaceC2127a);
        this.f17849a = new WeakReference<>(interfaceC2127a);
        return this;
    }
}
