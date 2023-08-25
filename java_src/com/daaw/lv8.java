package com.daaw;
/* loaded from: classes.dex */
public final class lv8 extends nv8 implements Comparable {

    /* renamed from: A */
    public final int f17828A;

    /* renamed from: B */
    public final boolean f17829B;

    /* renamed from: t */
    public final int f17830t;

    /* renamed from: u */
    public final boolean f17831u;

    /* renamed from: v */
    public final boolean f17832v;

    /* renamed from: w */
    public final boolean f17833w;

    /* renamed from: x */
    public final int f17834x;

    /* renamed from: y */
    public final int f17835y;

    /* renamed from: z */
    public final int f17836z;

    public lv8(int i, r84 r84Var, int i2, fv8 fv8Var, int i3, String str) {
        super(i, r84Var, i2);
        int i4;
        int i5 = 0;
        this.f17831u = rv8.m10866r(i3, false);
        int i6 = this.f20764s.f9267d;
        int i7 = fv8Var.f7016u;
        this.f17832v = 1 == (i6 & 1);
        this.f17833w = (i6 & 2) != 0;
        y17 m4259v = fv8Var.f7014s.isEmpty() ? y17.m4259v("") : fv8Var.f7014s;
        int i8 = 0;
        while (true) {
            if (i8 >= m4259v.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = rv8.m10874j(this.f20764s, (String) m4259v.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.f17834x = i8;
        this.f17835y = i4;
        int i9 = this.f20764s.f9268e;
        int bitCount = Integer.bitCount(0);
        this.f17836z = bitCount;
        int i10 = this.f20764s.f9268e;
        this.f17829B = false;
        int m10874j = rv8.m10874j(this.f20764s, str, rv8.m10870n(str) == null);
        this.f17828A = m10874j;
        boolean z = i4 > 0 || (fv8Var.f7014s.isEmpty() && bitCount > 0) || this.f17832v || (this.f17833w && m10874j > 0);
        if (rv8.m10866r(i3, fv8Var.f10009N) && z) {
            i5 = 1;
        }
        this.f17830t = i5;
    }

    @Override // com.daaw.nv8
    /* renamed from: a */
    public final int mo8816a() {
        return this.f17830t;
    }

    @Override // com.daaw.nv8
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo8815b(nv8 nv8Var) {
        lv8 lv8Var = (lv8) nv8Var;
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(lv8 lv8Var) {
        n17 mo15593b = n17.m15586i().mo15591d(this.f17831u, lv8Var.f17831u).mo15592c(Integer.valueOf(this.f17834x), Integer.valueOf(lv8Var.f17834x), l37.m17166c().mo8593a()).mo15593b(this.f17835y, lv8Var.f17835y).mo15593b(this.f17836z, lv8Var.f17836z).mo15591d(this.f17832v, lv8Var.f17832v).mo15592c(Boolean.valueOf(this.f17833w), Boolean.valueOf(lv8Var.f17833w), this.f17835y == 0 ? l37.m17166c() : l37.m17166c().mo8593a()).mo15593b(this.f17828A, lv8Var.f17828A);
        if (this.f17836z == 0) {
            mo15593b = mo15593b.mo15590e(false, false);
        }
        return mo15593b.mo15594a();
    }
}
