package com.daaw;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class my6 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ String f19298a;

    /* renamed from: b */
    public final /* synthetic */ String f19299b;

    /* renamed from: c */
    public final /* synthetic */ String f19300c;

    /* renamed from: d */
    public final /* synthetic */ ob7 f19301d;

    public my6(ob7 ob7Var, String str, String str2, String str3) {
        this.f19301d = ob7Var;
        this.f19298a = str;
        this.f19299b = str2;
        this.f19300c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        yb8 yb8Var;
        yb8 yb8Var2;
        yb8Var = this.f19301d.f21251p;
        yb8Var.m3907c();
        yb8Var2 = this.f19301d.f21251p;
        return yb8Var2.m3915W().m8157a0(this.f19298a, this.f19299b, this.f19300c);
    }
}
