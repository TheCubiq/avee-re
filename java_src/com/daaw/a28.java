package com.daaw;
/* loaded from: classes2.dex */
public final class a28 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ cd2 f2718p;

    /* renamed from: q */
    public final /* synthetic */ int f2719q;

    /* renamed from: r */
    public final /* synthetic */ long f2720r;

    /* renamed from: s */
    public final /* synthetic */ boolean f2721s;

    /* renamed from: t */
    public final /* synthetic */ cd2 f2722t;

    /* renamed from: u */
    public final /* synthetic */ p28 f2723u;

    public a28(p28 p28Var, cd2 cd2Var, int i, long j, boolean z, cd2 cd2Var2) {
        this.f2723u = p28Var;
        this.f2718p = cd2Var;
        this.f2719q = i;
        this.f2720r = j;
        this.f2721s = z;
        this.f2722t = cd2Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2723u.m13712J(this.f2718p);
        p28.m13693c0(this.f2723u, this.f2718p, this.f2719q, this.f2720r, false, this.f2721s);
        zm8.m2111b();
        if (this.f2723u.f25143a.m24020z().m12677B(null, m75.f18548o0)) {
            p28.m13694b0(this.f2723u, this.f2718p, this.f2722t);
        }
    }
}
