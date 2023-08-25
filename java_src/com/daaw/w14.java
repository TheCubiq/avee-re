package com.daaw;
/* loaded from: classes.dex */
public final class w14 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ c24 f30789p;

    public w14(c24 c24Var) {
        this.f30789p = c24Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d24 d24Var;
        d24 d24Var2;
        d24 d24Var3;
        c24 c24Var = this.f30789p;
        d24Var = c24Var.f5387F;
        if (d24Var != null) {
            d24Var2 = c24Var.f5387F;
            d24Var2.zzd();
            d24Var3 = this.f30789p.f5387F;
            d24Var3.zzi();
        }
    }
}
