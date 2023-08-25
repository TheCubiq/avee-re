package com.daaw;

import com.daaw.AbstractC1589hn;
/* loaded from: classes.dex */
public final class ir0 extends AbstractC1589hn {
    public ir0() {
        this(null, 1, null);
    }

    public ir0(AbstractC1589hn abstractC1589hn) {
        ug0.m8268f(abstractC1589hn, "initialExtras");
        m20619a().putAll(abstractC1589hn.m20619a());
    }

    public /* synthetic */ ir0(AbstractC1589hn abstractC1589hn, int i, C2575pq c2575pq) {
        this((i & 1) != 0 ? AbstractC1589hn.C1590a.f12681b : abstractC1589hn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T> void m19488b(AbstractC1589hn.InterfaceC1591b<T> interfaceC1591b, T t) {
        ug0.m8268f(interfaceC1591b, "key");
        m20619a().put(interfaceC1591b, t);
    }
}
