package com.daaw;
/* loaded from: classes2.dex */
public final class uu7 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ long f29552p;

    /* renamed from: q */
    public final /* synthetic */ p28 f29553q;

    public uu7(p28 p28Var, long j) {
        this.f29553q = p28Var;
        this.f29552p = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29553q.f25143a.m24053F().f17009k.m4399b(this.f29552p);
        this.f29553q.f25143a.mo3895i().m14161p().m20652b("Session timeout duration set", Long.valueOf(this.f29552p));
    }
}
