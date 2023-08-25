package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class nw1<T1, TResult> {

    /* renamed from: a */
    public WeakReference<InterfaceC2373a<T1, TResult>> f20780a = new WeakReference<>(null);

    /* renamed from: com.daaw.nw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2373a<T1, TResult> {
        /* renamed from: b */
        TResult mo8408b(T1 t1);
    }

    /* renamed from: a */
    public TResult m14761a(T1 t1, TResult tresult) {
        InterfaceC2373a<T1, TResult> interfaceC2373a = this.f20780a.get();
        return interfaceC2373a != null ? interfaceC2373a.mo8408b(t1) : tresult;
    }

    /* renamed from: b */
    public nw1<T1, TResult> m14760b(InterfaceC2373a<T1, TResult> interfaceC2373a, List<Object> list) {
        list.add(interfaceC2373a);
        this.f20780a = new WeakReference<>(interfaceC2373a);
        return this;
    }
}
