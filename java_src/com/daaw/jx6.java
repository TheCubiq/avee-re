package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class jx6 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f15497a;

    /* renamed from: b */
    public final /* synthetic */ String f15498b;

    /* renamed from: c */
    public final /* synthetic */ String f15499c;

    /* renamed from: d */
    public final /* synthetic */ ob7 f15500d;

    public jx6(ob7 ob7Var, String str, String str2, String str3) {
        this.f15500d = ob7Var;
        this.f15497a = str;
        this.f15498b = str2;
        this.f15499c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8Var = this.f15500d.f21251p;
        yb8Var.m3907c();
        yb8Var2 = this.f15500d.f21251p;
        return yb8Var2.m3915W().m8157a0(this.f15497a, this.f15498b, this.f15499c);
    }
}
