package com.daaw;

import android.content.Context;
/* renamed from: com.daaw.py */
/* loaded from: classes.dex */
public final class C2665py implements g00<String> {

    /* renamed from: a */
    public final a01<Context> f23517a;

    public C2665py(a01<Context> a01Var) {
        this.f23517a = a01Var;
    }

    /* renamed from: a */
    public static C2665py m12884a(a01<Context> a01Var) {
        return new C2665py(a01Var);
    }

    /* renamed from: c */
    public static String m12882c(Context context) {
        return (String) qy0.m11939c(AbstractC2375ny.m14736b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public String get() {
        return m12882c(this.f23517a.get());
    }
}
