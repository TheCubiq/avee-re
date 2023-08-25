package com.daaw;
/* loaded from: classes.dex */
public final class of2 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f21532p;

    /* renamed from: q */
    public final /* synthetic */ long f21533q;

    /* renamed from: r */
    public final /* synthetic */ qf2 f21534r;

    public of2(qf2 qf2Var, String str, long j) {
        this.f21534r = qf2Var;
        this.f21532p = str;
        this.f21533q = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg2 bg2Var;
        bg2 bg2Var2;
        bg2Var = this.f21534r.f23902p;
        bg2Var.m26174a(this.f21532p, this.f21533q);
        qf2 qf2Var = this.f21534r;
        bg2Var2 = qf2Var.f23902p;
        bg2Var2.m26173b(qf2Var.toString());
    }
}
