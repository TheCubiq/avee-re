package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class g91 implements g00<f91> {
    public final a01<Context> a;
    public final a01<String> b;
    public final a01<Integer> c;

    public g91(a01<Context> a01Var, a01<String> a01Var2, a01<Integer> a01Var3) {
        this.a = a01Var;
        this.b = a01Var2;
        this.c = a01Var3;
    }

    public static g91 a(a01<Context> a01Var, a01<String> a01Var2, a01<Integer> a01Var3) {
        return new g91(a01Var, a01Var2, a01Var3);
    }

    public static f91 c(Context context, String str, int i) {
        return new f91(context, str, i);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public f91 get() {
        return c(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
