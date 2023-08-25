package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class ow1<T1, T2, TResult> {

    /* renamed from: a */
    public WeakReference<InterfaceC2485a<T1, T2, TResult>> f22041a = new WeakReference<>(null);

    /* renamed from: com.daaw.ow1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2485a<T1, T2, TResult> {
        /* renamed from: c */
        TResult mo13904c(T1 t1, T2 t2);
    }

    /* renamed from: a */
    public TResult m13906a(T1 t1, T2 t2, TResult tresult) {
        InterfaceC2485a<T1, T2, TResult> interfaceC2485a = this.f22041a.get();
        return interfaceC2485a != null ? interfaceC2485a.mo13904c(t1, t2) : tresult;
    }

    /* renamed from: b */
    public ow1<T1, T2, TResult> m13905b(InterfaceC2485a<T1, T2, TResult> interfaceC2485a, List<Object> list) {
        list.add(interfaceC2485a);
        this.f22041a = new WeakReference<>(interfaceC2485a);
        return this;
    }
}
