package com.daaw;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class s97 {

    /* renamed from: a */
    public final ConcurrentMap f26030a;

    /* renamed from: b */
    public final o97 f26031b;

    /* renamed from: c */
    public final Class f26032c;

    /* renamed from: d */
    public final oh7 f26033d;

    public /* synthetic */ s97(ConcurrentMap concurrentMap, o97 o97Var, oh7 oh7Var, Class cls, r97 r97Var) {
        this.f26030a = concurrentMap;
        this.f26031b = o97Var;
        this.f26032c = cls;
        this.f26033d = oh7Var;
    }

    @Nullable
    /* renamed from: a */
    public final o97 m10490a() {
        return this.f26031b;
    }

    /* renamed from: b */
    public final oh7 m10489b() {
        return this.f26033d;
    }

    /* renamed from: c */
    public final Class m10488c() {
        return this.f26032c;
    }

    /* renamed from: d */
    public final Collection m10487d() {
        return this.f26030a.values();
    }

    /* renamed from: e */
    public final List m10486e(byte[] bArr) {
        List list = (List) this.f26030a.get(new q97(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    /* renamed from: f */
    public final boolean m10485f() {
        return !this.f26033d.m14270a().isEmpty();
    }
}
