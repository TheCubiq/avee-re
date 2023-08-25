package com.daaw;
/* loaded from: classes.dex */
public final class t14 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f26898p;

    /* renamed from: q */
    public final /* synthetic */ String f26899q;

    /* renamed from: r */
    public final /* synthetic */ c24 f26900r;

    public t14(c24 c24Var, String str, String str2) {
        this.f26900r = c24Var;
        this.f26898p = str;
        this.f26899q = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d24 d24Var;
        d24 d24Var2;
        c24 c24Var = this.f26900r;
        d24Var = c24Var.f5387F;
        if (d24Var != null) {
            d24Var2 = c24Var.f5387F;
            d24Var2.mo16288c(this.f26898p, this.f26899q);
        }
    }
}
