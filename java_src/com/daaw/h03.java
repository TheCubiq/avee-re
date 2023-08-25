package com.daaw;
/* loaded from: classes.dex */
public final class h03 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ int f11921p;

    /* renamed from: q */
    public final /* synthetic */ int f11922q;

    /* renamed from: r */
    public final /* synthetic */ int f11923r;

    /* renamed from: s */
    public final /* synthetic */ float f11924s;

    /* renamed from: t */
    public final /* synthetic */ k03 f11925t;

    public h03(k03 k03Var, int i, int i2, int i3, float f) {
        this.f11925t = k03Var;
        this.f11921p = i;
        this.f11922q = i2;
        this.f11923r = i3;
        this.f11924s = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l03 l03Var;
        l03Var = this.f11925t.f15576b;
        l03Var.mo17152g(this.f11921p, this.f11922q, this.f11923r, this.f11924s);
    }
}
