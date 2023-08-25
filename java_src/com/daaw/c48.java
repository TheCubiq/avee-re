package com.daaw;
/* loaded from: classes2.dex */
public final class c48 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ t38 f5475p;

    /* renamed from: q */
    public final /* synthetic */ t38 f5476q;

    /* renamed from: r */
    public final /* synthetic */ long f5477r;

    /* renamed from: s */
    public final /* synthetic */ boolean f5478s;

    /* renamed from: t */
    public final /* synthetic */ r48 f5479t;

    public c48(r48 r48Var, t38 t38Var, t38 t38Var2, long j, boolean z) {
        this.f5479t = r48Var;
        this.f5475p = t38Var;
        this.f5476q = t38Var2;
        this.f5477r = j;
        this.f5478s = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5479t.m11746n(this.f5475p, this.f5476q, this.f5477r, this.f5478s, null);
    }
}
