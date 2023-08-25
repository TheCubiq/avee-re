package com.daaw;
/* loaded from: classes2.dex */
public final class x18 implements Runnable {
    public final /* synthetic */ cd2 p;
    public final /* synthetic */ long q;
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ cd2 u;
    public final /* synthetic */ p28 v;

    public x18(p28 p28Var, cd2 cd2Var, long j, int i, long j2, boolean z, cd2 cd2Var2) {
        this.v = p28Var;
        this.p = cd2Var;
        this.q = j;
        this.r = i;
        this.s = j2;
        this.t = z;
        this.u = cd2Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.v.J(this.p);
        this.v.z(this.q, false);
        p28.c0(this.v, this.p, this.r, this.s, true, this.t);
        zm8.b();
        if (this.v.a.z().B(null, m75.o0)) {
            p28.b0(this.v, this.p, this.u);
        }
    }
}
