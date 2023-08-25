package com.daaw;
/* loaded from: classes2.dex */
public final class bh0 extends th0 {
    public final z40<Throwable, lp1> t;

    /* JADX WARN: Multi-variable type inference failed */
    public bh0(z40<? super Throwable, lp1> z40Var) {
        this.t = z40Var;
    }

    @Override // com.daaw.z40
    public /* bridge */ /* synthetic */ lp1 b(Throwable th) {
        s(th);
        return lp1.a;
    }

    @Override // com.daaw.ph
    public void s(Throwable th) {
        this.t.b(th);
    }
}
