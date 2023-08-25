package com.daaw;
/* loaded from: classes.dex */
public final class lv8 extends nv8 implements Comparable {
    public final int A;
    public final boolean B;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final int z;

    public lv8(int i, r84 r84Var, int i2, fv8 fv8Var, int i3, String str) {
        super(i, r84Var, i2);
        int i4;
        int i5 = 0;
        this.u = rv8.r(i3, false);
        int i6 = this.s.d;
        int i7 = fv8Var.u;
        this.v = 1 == (i6 & 1);
        this.w = (i6 & 2) != 0;
        y17 v = fv8Var.s.isEmpty() ? y17.v("") : fv8Var.s;
        int i8 = 0;
        while (true) {
            if (i8 >= v.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = rv8.j(this.s, (String) v.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.x = i8;
        this.y = i4;
        int i9 = this.s.e;
        int bitCount = Integer.bitCount(0);
        this.z = bitCount;
        int i10 = this.s.e;
        this.B = false;
        int j = rv8.j(this.s, str, rv8.n(str) == null);
        this.A = j;
        boolean z = i4 > 0 || (fv8Var.s.isEmpty() && bitCount > 0) || this.v || (this.w && j > 0);
        if (rv8.r(i3, fv8Var.N) && z) {
            i5 = 1;
        }
        this.t = i5;
    }

    @Override // com.daaw.nv8
    public final int a() {
        return this.t;
    }

    @Override // com.daaw.nv8
    public final /* bridge */ /* synthetic */ boolean b(nv8 nv8Var) {
        lv8 lv8Var = (lv8) nv8Var;
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(lv8 lv8Var) {
        n17 b = n17.i().d(this.u, lv8Var.u).c(Integer.valueOf(this.x), Integer.valueOf(lv8Var.x), l37.c().a()).b(this.y, lv8Var.y).b(this.z, lv8Var.z).d(this.v, lv8Var.v).c(Boolean.valueOf(this.w), Boolean.valueOf(lv8Var.w), this.y == 0 ? l37.c() : l37.c().a()).b(this.A, lv8Var.A);
        if (this.z == 0) {
            b = b.e(false, false);
        }
        return b.a();
    }
}
