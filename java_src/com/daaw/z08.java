package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class z08 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ AtomicReference f34315p;

    /* renamed from: q */
    public final /* synthetic */ String f34316q;

    /* renamed from: r */
    public final /* synthetic */ String f34317r;

    /* renamed from: s */
    public final /* synthetic */ boolean f34318s;

    /* renamed from: t */
    public final /* synthetic */ p28 f34319t;

    public z08(p28 p28Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f34319t = p28Var;
        this.f34315p = atomicReference;
        this.f34316q = str2;
        this.f34317r = str3;
        this.f34318s = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34319t.f25143a.m24047L().m5461W(this.f34315p, null, this.f34316q, this.f34317r, this.f34318s);
    }
}
