package com.daaw;

import com.daaw.hn;
/* loaded from: classes.dex */
public final class ir0 extends hn {
    public ir0() {
        this(null, 1, null);
    }

    public ir0(hn hnVar) {
        ug0.f(hnVar, "initialExtras");
        a().putAll(hnVar.a());
    }

    public /* synthetic */ ir0(hn hnVar, int i, pq pqVar) {
        this((i & 1) != 0 ? hn.a.b : hnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void b(hn.b<T> bVar, T t) {
        ug0.f(bVar, "key");
        a().put(bVar, t);
    }
}
