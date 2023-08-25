package com.daaw;
/* loaded from: classes.dex */
public final class x14 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ c24 f31733p;

    public x14(c24 c24Var) {
        this.f31733p = c24Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d24 d24Var;
        boolean z;
        d24 d24Var2;
        d24 d24Var3;
        c24 c24Var = this.f31733p;
        d24Var = c24Var.f5387F;
        if (d24Var != null) {
            z = c24Var.f5388G;
            if (!z) {
                d24Var3 = c24Var.f5387F;
                d24Var3.zzg();
                this.f31733p.f5388G = true;
            }
            d24Var2 = this.f31733p.f5387F;
            d24Var2.zze();
        }
    }
}
