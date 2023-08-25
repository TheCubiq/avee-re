package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class iw1<T1> {

    /* renamed from: a */
    public WeakReference<InterfaceC1765a<T1>> f14071a = new WeakReference<>(null);

    /* renamed from: com.daaw.iw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1765a<T1> {
        /* renamed from: b */
        void mo19307b(T1 t1);
    }

    /* renamed from: a */
    public void m19309a(T1 t1) {
        InterfaceC1765a<T1> interfaceC1765a = this.f14071a.get();
        if (interfaceC1765a != null) {
            interfaceC1765a.mo19307b(t1);
        }
    }

    /* renamed from: b */
    public iw1<T1> m19308b(InterfaceC1765a<T1> interfaceC1765a, List<Object> list) {
        list.add(interfaceC1765a);
        this.f14071a = new WeakReference<>(interfaceC1765a);
        return this;
    }
}
