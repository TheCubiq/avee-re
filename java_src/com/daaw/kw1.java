package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class kw1<T1, T2, T3> {

    /* renamed from: a */
    public WeakReference<InterfaceC1991a<T1, T2, T3>> f16786a = new WeakReference<>(null);

    /* renamed from: com.daaw.kw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1991a<T1, T2, T3> {
        /* renamed from: a */
        void mo17380a(T1 t1, T2 t2, T3 t3);
    }

    /* renamed from: a */
    public void m17382a(T1 t1, T2 t2, T3 t3) {
        InterfaceC1991a<T1, T2, T3> interfaceC1991a = this.f16786a.get();
        if (interfaceC1991a != null) {
            interfaceC1991a.mo17380a(t1, t2, t3);
        }
    }

    /* renamed from: b */
    public kw1<T1, T2, T3> m17381b(InterfaceC1991a<T1, T2, T3> interfaceC1991a, List<Object> list) {
        list.add(interfaceC1991a);
        this.f16786a = new WeakReference<>(interfaceC1991a);
        return this;
    }
}
