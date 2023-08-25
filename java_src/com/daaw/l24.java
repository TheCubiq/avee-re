package com.daaw;
/* loaded from: classes.dex */
public final class l24 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ boolean f16977p;

    /* renamed from: q */
    public final /* synthetic */ m24 f16978q;

    public l24(m24 m24Var, boolean z) {
        this.f16978q = m24Var;
        this.f16977p = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16978q.m16278m("windowVisibilityChanged", "isVisible", String.valueOf(this.f16977p));
    }
}
