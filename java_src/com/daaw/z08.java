package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class z08 implements Runnable {
    public final /* synthetic */ AtomicReference p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ p28 t;

    public z08(p28 p28Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.t = p28Var;
        this.p = atomicReference;
        this.q = str2;
        this.r = str3;
        this.s = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.a.L().W(this.p, null, this.q, this.r, this.s);
    }
}
