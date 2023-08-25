package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class gw6 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f11781a;

    /* renamed from: b */
    public final /* synthetic */ String f11782b;

    /* renamed from: c */
    public final /* synthetic */ String f11783c;

    /* renamed from: d */
    public final /* synthetic */ ob7 f11784d;

    public gw6(ob7 ob7Var, String str, String str2, String str3) {
        this.f11784d = ob7Var;
        this.f11781a = str;
        this.f11782b = str2;
        this.f11783c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8Var = this.f11784d.f21251p;
        yb8Var.m3907c();
        yb8Var2 = this.f11784d.f21251p;
        return yb8Var2.m3915W().m8154d0(this.f11781a, this.f11782b, this.f11783c);
    }
}
