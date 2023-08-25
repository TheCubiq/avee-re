package com.daaw;
/* loaded from: classes.dex */
public final class g03 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ int f10120p;

    /* renamed from: q */
    public final /* synthetic */ long f10121q;

    /* renamed from: r */
    public final /* synthetic */ k03 f10122r;

    public g03(k03 k03Var, int i, long j) {
        this.f10122r = k03Var;
        this.f10120p = i;
        this.f10121q = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l03 l03Var;
        l03Var = this.f10122r.f15576b;
        l03Var.mo17156A(this.f10120p, this.f10121q);
    }
}
