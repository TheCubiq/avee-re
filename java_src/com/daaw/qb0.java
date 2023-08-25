package com.daaw;
/* loaded from: classes.dex */
public final class qb0 implements d81 {

    /* renamed from: p */
    public final int f23831p;

    /* renamed from: q */
    public final rb0 f23832q;

    /* renamed from: r */
    public int f23833r = -1;

    public qb0(rb0 rb0Var, int i) {
        this.f23832q = rb0Var;
        this.f23831p = i;
    }

    @Override // com.daaw.d81
    /* renamed from: a */
    public void mo3789a() {
        if (this.f23833r == -2) {
            throw new c81(this.f23832q.m11467s().m1594a(this.f23831p).m1598a(0).f35721u);
        }
        this.f23832q.m11494K();
    }

    /* renamed from: b */
    public void m12644b() {
        C2914s6.m10690a(this.f23833r == -1);
        this.f23833r = this.f23832q.m11463w(this.f23831p);
    }

    /* renamed from: c */
    public final boolean m12643c() {
        int i = this.f23833r;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // com.daaw.d81
    /* renamed from: d */
    public boolean mo3787d() {
        return this.f23833r == -3 || (m12643c() && this.f23832q.m11497H(this.f23833r));
    }

    /* renamed from: e */
    public void m12642e() {
        if (this.f23833r != -1) {
            this.f23832q.m11477a0(this.f23831p);
            this.f23833r = -1;
        }
    }

    @Override // com.daaw.d81
    /* renamed from: j */
    public int mo3786j(k30 k30Var, C1454gq c1454gq, boolean z) {
        if (m12643c()) {
            return this.f23832q.m11487R(this.f23833r, k30Var, c1454gq, z);
        }
        return -3;
    }

    @Override // com.daaw.d81
    /* renamed from: n */
    public int mo3785n(long j) {
        if (m12643c()) {
            return this.f23832q.m11479Z(this.f23833r, j);
        }
        return 0;
    }
}
