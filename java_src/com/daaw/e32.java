package com.daaw;
/* loaded from: classes2.dex */
public final class e32 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f8074p;

    /* renamed from: q */
    public final /* synthetic */ long f8075q;

    /* renamed from: r */
    public final /* synthetic */ vk4 f8076r;

    public e32(vk4 vk4Var, String str, long j) {
        this.f8076r = vk4Var;
        this.f8074p = str;
        this.f8075q = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vk4.m7085g(this.f8076r, this.f8074p, this.f8075q);
    }
}
