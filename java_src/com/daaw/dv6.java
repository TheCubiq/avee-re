package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class dv6 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f7903a;

    /* renamed from: b */
    public final /* synthetic */ String f7904b;

    /* renamed from: c */
    public final /* synthetic */ String f7905c;

    /* renamed from: d */
    public final /* synthetic */ ob7 f7906d;

    public dv6(ob7 ob7Var, String str, String str2, String str3) {
        this.f7906d = ob7Var;
        this.f7903a = str;
        this.f7904b = str2;
        this.f7905c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8Var = this.f7906d.f21251p;
        yb8Var.m3907c();
        yb8Var2 = this.f7906d.f21251p;
        return yb8Var2.m3915W().m8154d0(this.f7903a, this.f7904b, this.f7905c);
    }
}
