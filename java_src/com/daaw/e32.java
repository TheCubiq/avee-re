package com.daaw;
/* loaded from: classes2.dex */
public final class e32 implements Runnable {
    public final /* synthetic */ String p;
    public final /* synthetic */ long q;
    public final /* synthetic */ vk4 r;

    public e32(vk4 vk4Var, String str, long j) {
        this.r = vk4Var;
        this.p = str;
        this.q = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vk4.g(this.r, this.p, this.q);
    }
}
