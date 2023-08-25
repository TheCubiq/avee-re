package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class mw1<TResult> {

    /* renamed from: a */
    public WeakReference<InterfaceC2216a<TResult>> f19185a = new WeakReference<>(null);

    /* renamed from: com.daaw.mw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2216a<TResult> {
        /* renamed from: a */
        TResult mo15743a();
    }

    /* renamed from: a */
    public TResult m15745a(TResult tresult) {
        InterfaceC2216a<TResult> interfaceC2216a = this.f19185a.get();
        return interfaceC2216a != null ? interfaceC2216a.mo15743a() : tresult;
    }

    /* renamed from: b */
    public mw1<TResult> m15744b(InterfaceC2216a<TResult> interfaceC2216a, List<Object> list) {
        list.add(interfaceC2216a);
        this.f19185a = new WeakReference<>(interfaceC2216a);
        return this;
    }
}
