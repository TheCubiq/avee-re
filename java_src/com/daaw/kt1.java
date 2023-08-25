package com.daaw;

import com.daaw.jt1;
/* loaded from: classes.dex */
public final /* synthetic */ class kt1 {
    static {
        jt1.b.a aVar = jt1.b.a;
    }

    public static ht1 a(jt1.b bVar, Class cls) {
        ug0.f(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static ht1 b(jt1.b bVar, Class cls, hn hnVar) {
        ug0.f(cls, "modelClass");
        ug0.f(hnVar, "extras");
        return bVar.a(cls);
    }
}
