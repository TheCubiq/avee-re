package com.daaw;
/* loaded from: classes2.dex */
public final class x18 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ cd2 f31738p;

    /* renamed from: q */
    public final /* synthetic */ long f31739q;

    /* renamed from: r */
    public final /* synthetic */ int f31740r;

    /* renamed from: s */
    public final /* synthetic */ long f31741s;

    /* renamed from: t */
    public final /* synthetic */ boolean f31742t;

    /* renamed from: u */
    public final /* synthetic */ cd2 f31743u;

    /* renamed from: v */
    public final /* synthetic */ p28 f31744v;

    public x18(p28 p28Var, cd2 cd2Var, long j, int i, long j2, boolean z, cd2 cd2Var2) {
        this.f31744v = p28Var;
        this.f31738p = cd2Var;
        this.f31739q = j;
        this.f31740r = i;
        this.f31741s = j2;
        this.f31742t = z;
        this.f31743u = cd2Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f31744v.m13712J(this.f31738p);
        this.f31744v.m13678z(this.f31739q, false);
        p28.m13693c0(this.f31744v, this.f31738p, this.f31740r, this.f31741s, true, this.f31742t);
        zm8.m2111b();
        if (this.f31744v.f25143a.m24020z().m12677B(null, m75.f18548o0)) {
            p28.m13694b0(this.f31744v, this.f31738p, this.f31743u);
        }
    }
}
