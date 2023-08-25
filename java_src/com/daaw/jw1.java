package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class jw1<T1, T2> {

    /* renamed from: a */
    public WeakReference<InterfaceC1885a<T1, T2>> f15480a = new WeakReference<>(null);

    /* renamed from: com.daaw.jw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1885a<T1, T2> {
        /* renamed from: c */
        void mo13799c(T1 t1, T2 t2);
    }

    /* renamed from: a */
    public void m18205a(T1 t1, T2 t2) {
        InterfaceC1885a<T1, T2> interfaceC1885a = this.f15480a.get();
        if (interfaceC1885a != null) {
            interfaceC1885a.mo13799c(t1, t2);
        }
    }

    /* renamed from: b */
    public jw1<T1, T2> m18204b(InterfaceC1885a<T1, T2> interfaceC1885a, List<Object> list) {
        list.add(interfaceC1885a);
        this.f15480a = new WeakReference<>(interfaceC1885a);
        return this;
    }
}
