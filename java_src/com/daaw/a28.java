package com.daaw;
/* loaded from: classes2.dex */
public final class a28 implements Runnable {
    public final /* synthetic */ cd2 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ long r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ cd2 t;
    public final /* synthetic */ p28 u;

    public a28(p28 p28Var, cd2 cd2Var, int i, long j, boolean z, cd2 cd2Var2) {
        this.u = p28Var;
        this.p = cd2Var;
        this.q = i;
        this.r = j;
        this.s = z;
        this.t = cd2Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.u.J(this.p);
        p28.c0(this.u, this.p, this.q, this.r, false, this.s);
        zm8.b();
        if (this.u.a.z().B(null, m75.o0)) {
            p28.b0(this.u, this.p, this.t);
        }
    }
}
