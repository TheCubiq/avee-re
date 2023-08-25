package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class py implements g00<String> {
    public final a01<Context> a;

    public py(a01<Context> a01Var) {
        this.a = a01Var;
    }

    public static py a(a01<Context> a01Var) {
        return new py(a01Var);
    }

    public static String c(Context context) {
        return (String) qy0.c(ny.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public String get() {
        return c(this.a.get());
    }
}
