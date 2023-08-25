package com.daaw;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class tu8 extends nv8 implements Comparable {
    public final int A;
    public final boolean B;
    public final int C;
    public final int D;
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final int t;
    public final boolean u;
    public final String v;
    public final fv8 w;
    public final boolean x;
    public final int y;
    public final int z;

    public tu8(int i, r84 r84Var, int i2, fv8 fv8Var, int i3, boolean z, ty6 ty6Var) {
        super(i, r84Var, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.w = fv8Var;
        this.v = rv8.n(this.s.c);
        int i7 = 0;
        this.x = rv8.r(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= fv8Var.n.size()) {
                i8 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
            i5 = rv8.j(this.s, (String) fv8Var.n.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.z = i8;
        this.y = i5;
        int i9 = this.s.e;
        this.A = Integer.bitCount(0);
        f92 f92Var = this.s;
        int i10 = f92Var.e;
        this.B = true;
        this.E = 1 == (f92Var.d & 1);
        this.F = f92Var.y;
        this.G = f92Var.z;
        this.H = f92Var.h;
        this.u = ty6Var.zza(f92Var);
        String[] G = it5.G();
        int i11 = 0;
        while (true) {
            if (i11 >= G.length) {
                i11 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            }
            i6 = rv8.j(this.s, G[i11], false);
            if (i6 > 0) {
                break;
            }
            i11++;
        }
        this.C = i11;
        this.D = i6;
        int i12 = 0;
        while (true) {
            if (i12 < fv8Var.r.size()) {
                String str = this.s.l;
                if (str != null && str.equals(fv8Var.r.get(i12))) {
                    i4 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        this.I = i4;
        this.J = (i3 & 384) == 128;
        this.K = (i3 & 64) == 64;
        fv8 fv8Var2 = this.w;
        if (rv8.r(i3, fv8Var2.N) && ((z2 = this.u) || fv8Var2.H)) {
            i7 = (!rv8.r(i3, false) || !z2 || this.s.h == -1 || (!fv8Var2.P && z)) ? 1 : 2;
        }
        this.t = i7;
    }

    @Override // com.daaw.nv8
    public final int a() {
        return this.t;
    }

    @Override // com.daaw.nv8
    public final /* bridge */ /* synthetic */ boolean b(nv8 nv8Var) {
        String str;
        tu8 tu8Var = (tu8) nv8Var;
        boolean z = this.w.K;
        f92 f92Var = this.s;
        int i = f92Var.y;
        if (i != -1) {
            f92 f92Var2 = tu8Var.s;
            if (i == f92Var2.y && (str = f92Var.l) != null && TextUtils.equals(str, f92Var2.l)) {
                boolean z2 = this.w.J;
                int i2 = this.s.z;
                return i2 != -1 && i2 == tu8Var.s.z && this.J == tu8Var.J && this.K == tu8Var.K;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(tu8 tu8Var) {
        l37 l37Var;
        l37 a;
        l37 l37Var2;
        if (this.u && this.x) {
            a = rv8.k;
        } else {
            l37Var = rv8.k;
            a = l37Var.a();
        }
        n17 c = n17.i().d(this.x, tu8Var.x).c(Integer.valueOf(this.z), Integer.valueOf(tu8Var.z), l37.c().a()).b(this.y, tu8Var.y).b(this.A, tu8Var.A).d(this.E, tu8Var.E).d(true, true).c(Integer.valueOf(this.C), Integer.valueOf(tu8Var.C), l37.c().a()).b(this.D, tu8Var.D).d(this.u, tu8Var.u).c(Integer.valueOf(this.I), Integer.valueOf(tu8Var.I), l37.c().a());
        Integer valueOf = Integer.valueOf(this.H);
        Integer valueOf2 = Integer.valueOf(tu8Var.H);
        boolean z = this.w.w;
        l37Var2 = rv8.l;
        n17 c2 = c.c(valueOf, valueOf2, l37Var2).d(this.J, tu8Var.J).d(this.K, tu8Var.K).c(Integer.valueOf(this.F), Integer.valueOf(tu8Var.F), a).c(Integer.valueOf(this.G), Integer.valueOf(tu8Var.G), a);
        Integer valueOf3 = Integer.valueOf(this.H);
        Integer valueOf4 = Integer.valueOf(tu8Var.H);
        if (!it5.t(this.v, tu8Var.v)) {
            a = rv8.l;
        }
        return c2.c(valueOf3, valueOf4, a).a();
    }
}
