package com.daaw;
/* loaded from: classes2.dex */
public final class dk2 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ xe7 f7214p;

    /* renamed from: q */
    public final /* synthetic */ hl2 f7215q;

    public dk2(hl2 hl2Var, xe7 xe7Var) {
        this.f7215q = hl2Var;
        this.f7214p = xe7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7214p.mo3911a();
        if (b52.m26486a()) {
            this.f7214p.mo3882r().m6978z(this);
            return;
        }
        boolean m20636e = this.f7215q.m20636e();
        this.f7215q.f12642c = 0L;
        if (m20636e) {
            this.f7215q.mo8554c();
        }
    }
}
