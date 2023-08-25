package com.daaw;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class tu8 extends nv8 implements Comparable {

    /* renamed from: A */
    public final int f28092A;

    /* renamed from: B */
    public final boolean f28093B;

    /* renamed from: C */
    public final int f28094C;

    /* renamed from: D */
    public final int f28095D;

    /* renamed from: E */
    public final boolean f28096E;

    /* renamed from: F */
    public final int f28097F;

    /* renamed from: G */
    public final int f28098G;

    /* renamed from: H */
    public final int f28099H;

    /* renamed from: I */
    public final int f28100I;

    /* renamed from: J */
    public final boolean f28101J;

    /* renamed from: K */
    public final boolean f28102K;

    /* renamed from: t */
    public final int f28103t;

    /* renamed from: u */
    public final boolean f28104u;

    /* renamed from: v */
    public final String f28105v;

    /* renamed from: w */
    public final fv8 f28106w;

    /* renamed from: x */
    public final boolean f28107x;

    /* renamed from: y */
    public final int f28108y;

    /* renamed from: z */
    public final int f28109z;

    public tu8(int i, r84 r84Var, int i2, fv8 fv8Var, int i3, boolean z, ty6 ty6Var) {
        super(i, r84Var, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.f28106w = fv8Var;
        this.f28105v = rv8.m10870n(this.f20764s.f9266c);
        int i7 = 0;
        this.f28107x = rv8.m10866r(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= fv8Var.f7009n.size()) {
                i8 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
            i5 = rv8.m10874j(this.f20764s, (String) fv8Var.f7009n.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.f28109z = i8;
        this.f28108y = i5;
        int i9 = this.f20764s.f9268e;
        this.f28092A = Integer.bitCount(0);
        f92 f92Var = this.f20764s;
        int i10 = f92Var.f9268e;
        this.f28093B = true;
        this.f28096E = 1 == (f92Var.f9267d & 1);
        this.f28097F = f92Var.f9288y;
        this.f28098G = f92Var.f9289z;
        this.f28099H = f92Var.f9271h;
        this.f28104u = ty6Var.zza(f92Var);
        String[] m19425G = it5.m19425G();
        int i11 = 0;
        while (true) {
            if (i11 >= m19425G.length) {
                i11 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            }
            i6 = rv8.m10874j(this.f20764s, m19425G[i11], false);
            if (i6 > 0) {
                break;
            }
            i11++;
        }
        this.f28094C = i11;
        this.f28095D = i6;
        int i12 = 0;
        while (true) {
            if (i12 < fv8Var.f7013r.size()) {
                String str = this.f20764s.f9275l;
                if (str != null && str.equals(fv8Var.f7013r.get(i12))) {
                    i4 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        this.f28100I = i4;
        this.f28101J = (i3 & 384) == 128;
        this.f28102K = (i3 & 64) == 64;
        fv8 fv8Var2 = this.f28106w;
        if (rv8.m10866r(i3, fv8Var2.f10009N) && ((z2 = this.f28104u) || fv8Var2.f10003H)) {
            i7 = (!rv8.m10866r(i3, false) || !z2 || this.f20764s.f9271h == -1 || (!fv8Var2.f10011P && z)) ? 1 : 2;
        }
        this.f28103t = i7;
    }

    @Override // com.daaw.nv8
    /* renamed from: a */
    public final int mo8816a() {
        return this.f28103t;
    }

    @Override // com.daaw.nv8
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo8815b(nv8 nv8Var) {
        String str;
        tu8 tu8Var = (tu8) nv8Var;
        boolean z = this.f28106w.f10006K;
        f92 f92Var = this.f20764s;
        int i = f92Var.f9288y;
        if (i != -1) {
            f92 f92Var2 = tu8Var.f20764s;
            if (i == f92Var2.f9288y && (str = f92Var.f9275l) != null && TextUtils.equals(str, f92Var2.f9275l)) {
                boolean z2 = this.f28106w.f10005J;
                int i2 = this.f20764s.f9289z;
                return i2 != -1 && i2 == tu8Var.f20764s.f9289z && this.f28101J == tu8Var.f28101J && this.f28102K == tu8Var.f28102K;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(tu8 tu8Var) {
        l37 l37Var;
        l37 mo8593a;
        l37 l37Var2;
        if (this.f28104u && this.f28107x) {
            mo8593a = rv8.f25652k;
        } else {
            l37Var = rv8.f25652k;
            mo8593a = l37Var.mo8593a();
        }
        n17 mo15592c = n17.m15586i().mo15591d(this.f28107x, tu8Var.f28107x).mo15592c(Integer.valueOf(this.f28109z), Integer.valueOf(tu8Var.f28109z), l37.m17166c().mo8593a()).mo15593b(this.f28108y, tu8Var.f28108y).mo15593b(this.f28092A, tu8Var.f28092A).mo15591d(this.f28096E, tu8Var.f28096E).mo15591d(true, true).mo15592c(Integer.valueOf(this.f28094C), Integer.valueOf(tu8Var.f28094C), l37.m17166c().mo8593a()).mo15593b(this.f28095D, tu8Var.f28095D).mo15591d(this.f28104u, tu8Var.f28104u).mo15592c(Integer.valueOf(this.f28100I), Integer.valueOf(tu8Var.f28100I), l37.m17166c().mo8593a());
        Integer valueOf = Integer.valueOf(this.f28099H);
        Integer valueOf2 = Integer.valueOf(tu8Var.f28099H);
        boolean z = this.f28106w.f7018w;
        l37Var2 = rv8.f25653l;
        n17 mo15592c2 = mo15592c.mo15592c(valueOf, valueOf2, l37Var2).mo15591d(this.f28101J, tu8Var.f28101J).mo15591d(this.f28102K, tu8Var.f28102K).mo15592c(Integer.valueOf(this.f28097F), Integer.valueOf(tu8Var.f28097F), mo8593a).mo15592c(Integer.valueOf(this.f28098G), Integer.valueOf(tu8Var.f28098G), mo8593a);
        Integer valueOf3 = Integer.valueOf(this.f28099H);
        Integer valueOf4 = Integer.valueOf(tu8Var.f28099H);
        if (!it5.m19376t(this.f28105v, tu8Var.f28105v)) {
            mo8593a = rv8.f25653l;
        }
        return mo15592c2.mo15592c(valueOf3, valueOf4, mo8593a).mo15594a();
    }
}
