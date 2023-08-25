package com.daaw;
/* loaded from: classes.dex */
public final class v14 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ int f29719p;

    /* renamed from: q */
    public final /* synthetic */ int f29720q;

    /* renamed from: r */
    public final /* synthetic */ c24 f29721r;

    public v14(c24 c24Var, int i, int i2) {
        this.f29721r = c24Var;
        this.f29719p = i;
        this.f29720q = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d24 d24Var;
        d24 d24Var2;
        c24 c24Var = this.f29721r;
        d24Var = c24Var.f5387F;
        if (d24Var != null) {
            d24Var2 = c24Var.f5387F;
            d24Var2.mo16290a(this.f29719p, this.f29720q);
        }
    }
}
