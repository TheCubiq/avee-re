package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class hw1 {

    /* renamed from: a */
    public WeakReference<InterfaceC1626a> f13028a = new WeakReference<>(null);

    /* renamed from: com.daaw.hw1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1626a {
        /* renamed from: a */
        void mo20361a();
    }

    /* renamed from: a */
    public void m20363a() {
        InterfaceC1626a interfaceC1626a = this.f13028a.get();
        if (interfaceC1626a != null) {
            interfaceC1626a.mo20361a();
        }
    }

    /* renamed from: b */
    public hw1 m20362b(InterfaceC1626a interfaceC1626a, List<Object> list) {
        list.add(interfaceC1626a);
        this.f13028a = new WeakReference<>(interfaceC1626a);
        return this;
    }
}
