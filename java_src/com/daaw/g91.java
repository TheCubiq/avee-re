package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class g91 implements g00<f91> {

    /* renamed from: a */
    public final a01<Context> f10355a;

    /* renamed from: b */
    public final a01<String> f10356b;

    /* renamed from: c */
    public final a01<Integer> f10357c;

    public g91(a01<Context> a01Var, a01<String> a01Var2, a01<Integer> a01Var3) {
        this.f10355a = a01Var;
        this.f10356b = a01Var2;
        this.f10357c = a01Var3;
    }

    /* renamed from: a */
    public static g91 m21884a(a01<Context> a01Var, a01<String> a01Var2, a01<Integer> a01Var3) {
        return new g91(a01Var, a01Var2, a01Var3);
    }

    /* renamed from: c */
    public static f91 m21882c(Context context, String str, int i) {
        return new f91(context, str, i);
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public f91 get() {
        return m21882c(this.f10355a.get(), this.f10356b.get(), this.f10357c.get().intValue());
    }
}
