package com.daaw;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class s97 {
    public final ConcurrentMap a;
    public final o97 b;
    public final Class c;
    public final oh7 d;

    public /* synthetic */ s97(ConcurrentMap concurrentMap, o97 o97Var, oh7 oh7Var, Class cls, r97 r97Var) {
        this.a = concurrentMap;
        this.b = o97Var;
        this.c = cls;
        this.d = oh7Var;
    }

    @Nullable
    public final o97 a() {
        return this.b;
    }

    public final oh7 b() {
        return this.d;
    }

    public final Class c() {
        return this.c;
    }

    public final Collection d() {
        return this.a.values();
    }

    public final List e(byte[] bArr) {
        List list = (List) this.a.get(new q97(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean f() {
        return !this.d.a().isEmpty();
    }
}
