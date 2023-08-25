package com.daaw;
/* loaded from: classes.dex */
public final class ot2 {

    /* renamed from: a */
    public final int f21955a;

    /* renamed from: b */
    public int f21956b;

    /* renamed from: c */
    public int f21957c;

    /* renamed from: d */
    public long f21958d;

    /* renamed from: e */
    public final boolean f21959e;

    /* renamed from: f */
    public final iz2 f21960f;

    /* renamed from: g */
    public final iz2 f21961g;

    /* renamed from: h */
    public int f21962h;

    /* renamed from: i */
    public int f21963i;

    public ot2(iz2 iz2Var, iz2 iz2Var2, boolean z) {
        this.f21961g = iz2Var;
        this.f21960f = iz2Var2;
        this.f21959e = z;
        iz2Var2.m19225v(12);
        this.f21955a = iz2Var2.m19238i();
        iz2Var.m19225v(12);
        this.f21963i = iz2Var.m19238i();
        az2.m26582f(iz2Var.m19242e() == 1, "first_chunk must be 1");
        this.f21956b = -1;
    }

    /* renamed from: a */
    public final boolean m13977a() {
        int i = this.f21956b + 1;
        this.f21956b = i;
        if (i == this.f21955a) {
            return false;
        }
        this.f21958d = this.f21959e ? this.f21960f.m19233n() : this.f21960f.m19234m();
        if (this.f21956b == this.f21962h) {
            this.f21957c = this.f21961g.m19238i();
            this.f21961g.m19224w(4);
            int i2 = this.f21963i - 1;
            this.f21963i = i2;
            this.f21962h = i2 > 0 ? (-1) + this.f21961g.m19238i() : -1;
        }
        return true;
    }
}
