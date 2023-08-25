package com.daaw;
/* loaded from: classes2.dex */
public final class by2 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f5274p;

    /* renamed from: q */
    public final /* synthetic */ long f5275q;

    /* renamed from: r */
    public final /* synthetic */ vk4 f5276r;

    public by2(vk4 vk4Var, String str, long j) {
        this.f5276r = vk4Var;
        this.f5274p = str;
        this.f5275q = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vk4.m7084h(this.f5276r, this.f5274p, this.f5275q);
    }
}
