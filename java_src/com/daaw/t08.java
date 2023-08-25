package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class t08 implements Runnable {
    public final /* synthetic */ AtomicReference p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ p28 s;

    public t08(p28 p28Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.s = p28Var;
        this.p = atomicReference;
        this.q = str2;
        this.r = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.s.a.L().U(this.p, null, this.q, this.r);
    }
}
