package com.daaw;
/* loaded from: classes.dex */
public final class d92 {

    /* renamed from: a */
    public final int f6638a;

    /* renamed from: b */
    public int f6639b;

    /* renamed from: c */
    public int f6640c;

    /* renamed from: d */
    public long f6641d;

    /* renamed from: e */
    public final boolean f6642e;

    /* renamed from: f */
    public final ik5 f6643f;

    /* renamed from: g */
    public final ik5 f6644g;

    /* renamed from: h */
    public int f6645h;

    /* renamed from: i */
    public int f6646i;

    public d92(ik5 ik5Var, ik5 ik5Var2, boolean z) {
        this.f6644g = ik5Var;
        this.f6643f = ik5Var2;
        this.f6642e = z;
        ik5Var2.m19716f(12);
        this.f6638a = ik5Var2.m19700v();
        ik5Var.m19716f(12);
        this.f6646i = ik5Var.m19700v();
        n09.m15609b(ik5Var.m19709m() == 1, "first_chunk must be 1");
        this.f6639b = -1;
    }

    /* renamed from: a */
    public final boolean m24593a() {
        int i = this.f6639b + 1;
        this.f6639b = i;
        if (i == this.f6638a) {
            return false;
        }
        this.f6641d = this.f6642e ? this.f6643f.m19728B() : this.f6643f.m19729A();
        if (this.f6639b == this.f6645h) {
            this.f6640c = this.f6644g.m19700v();
            this.f6644g.m19715g(4);
            int i2 = this.f6646i - 1;
            this.f6646i = i2;
            this.f6645h = i2 > 0 ? (-1) + this.f6644g.m19700v() : -1;
        }
        return true;
    }
}
