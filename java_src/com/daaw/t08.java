package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class t08 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ AtomicReference f26868p;

    /* renamed from: q */
    public final /* synthetic */ String f26869q;

    /* renamed from: r */
    public final /* synthetic */ String f26870r;

    /* renamed from: s */
    public final /* synthetic */ p28 f26871s;

    public t08(p28 p28Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f26871s = p28Var;
        this.f26868p = atomicReference;
        this.f26869q = str2;
        this.f26870r = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26871s.f25143a.m24047L().m5463U(this.f26868p, null, this.f26869q, this.f26870r);
    }
}
