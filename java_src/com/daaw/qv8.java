package com.daaw;
/* loaded from: classes.dex */
public final class qv8 extends nv8 {

    /* renamed from: A */
    public final int f24523A;

    /* renamed from: B */
    public final boolean f24524B;

    /* renamed from: C */
    public final int f24525C;

    /* renamed from: D */
    public final boolean f24526D;

    /* renamed from: E */
    public final boolean f24527E;

    /* renamed from: F */
    public final int f24528F;

    /* renamed from: t */
    public final boolean f24529t;

    /* renamed from: u */
    public final fv8 f24530u;

    /* renamed from: v */
    public final boolean f24531v;

    /* renamed from: w */
    public final boolean f24532w;

    /* renamed from: x */
    public final int f24533x;

    /* renamed from: y */
    public final int f24534y;

    /* renamed from: z */
    public final int f24535z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:139:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qv8(int i, r84 r84Var, int i2, fv8 fv8Var, int i3, int i4, boolean z) {
        super(i, r84Var, i2);
        boolean z2;
        boolean z3;
        int i5;
        String str;
        char c;
        fv8 fv8Var2;
        boolean z4;
        f92 f92Var;
        int i6;
        int i7;
        float f;
        int i8;
        this.f24530u = fv8Var;
        int i9 = 1;
        int i10 = true != fv8Var.f10001F ? 16 : 24;
        if (z) {
            f92 f92Var2 = this.f20764s;
            int i11 = f92Var2.f9280q;
            float f2 = f92Var2.f9282s;
            if (f2 == -1.0f || f2 <= 2.14748365E9f) {
                z2 = true;
                this.f24529t = z2;
                if (z && (((i6 = (f92Var = this.f20764s).f9280q) == -1 || i6 >= 0) && ((i7 = f92Var.f9281r) == -1 || i7 >= 0))) {
                    f = f92Var.f9282s;
                    if ((f != -1.0f || f >= 0.0f) && ((i8 = f92Var.f9271h) == -1 || i8 >= 0)) {
                        z3 = true;
                        this.f24531v = z3;
                        this.f24532w = rv8.m10866r(i3, false);
                        f92 f92Var3 = this.f20764s;
                        this.f24533x = f92Var3.f9271h;
                        this.f24534y = f92Var3.m22831a();
                        int i12 = this.f20764s.f9268e;
                        this.f24523A = Integer.bitCount(0);
                        int i13 = this.f20764s.f9268e;
                        this.f24524B = true;
                        i5 = 0;
                        while (true) {
                            if (i5 < fv8Var.f7007l.size()) {
                                i5 = Integer.MAX_VALUE;
                                break;
                            }
                            String str2 = this.f20764s.f9275l;
                            if (str2 != null && str2.equals(fv8Var.f7007l.get(i5))) {
                                break;
                            }
                            i5++;
                        }
                        this.f24535z = i5;
                        this.f24526D = (i3 & 384) != 128;
                        this.f24527E = (i3 & 64) != 64;
                        f92 f92Var4 = this.f20764s;
                        str = f92Var4.f9275l;
                        int i14 = 4;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -1851077871:
                                    if (str.equals("video/dolby-vision")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1662735862:
                                    if (str.equals("video/av01")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1662541442:
                                    if (str.equals("video/hevc")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1331836730:
                                    if (str.equals("video/avc")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1599127257:
                                    if (str.equals("video/x-vnd.on2.vp9")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                i14 = 5;
                            } else if (c != 1) {
                                if (c == 2) {
                                    i14 = 3;
                                } else if (c == 3) {
                                    i14 = 2;
                                } else if (c == 4) {
                                    i14 = 1;
                                }
                            }
                            this.f24528F = i14;
                            fv8Var2 = this.f24530u;
                            if (!rv8.m10866r(i3, fv8Var2.f10009N) || (!(z4 = this.f24529t) && !fv8Var2.f9999D)) {
                                i9 = 0;
                            } else if (rv8.m10866r(i3, false) && this.f24531v && z4 && f92Var4.f9271h != -1 && (i10 & i3) != 0) {
                                i9 = 2;
                            }
                            this.f24525C = i9;
                        }
                        i14 = 0;
                        this.f24528F = i14;
                        fv8Var2 = this.f24530u;
                        if (!rv8.m10866r(i3, fv8Var2.f10009N)) {
                            if (rv8.m10866r(i3, false)) {
                                i9 = 2;
                            }
                            this.f24525C = i9;
                        }
                        i9 = 0;
                        this.f24525C = i9;
                    }
                }
                z3 = false;
                this.f24531v = z3;
                this.f24532w = rv8.m10866r(i3, false);
                f92 f92Var32 = this.f20764s;
                this.f24533x = f92Var32.f9271h;
                this.f24534y = f92Var32.m22831a();
                int i122 = this.f20764s.f9268e;
                this.f24523A = Integer.bitCount(0);
                int i132 = this.f20764s.f9268e;
                this.f24524B = true;
                i5 = 0;
                while (true) {
                    if (i5 < fv8Var.f7007l.size()) {
                    }
                    i5++;
                }
                this.f24535z = i5;
                this.f24526D = (i3 & 384) != 128;
                this.f24527E = (i3 & 64) != 64;
                f92 f92Var42 = this.f20764s;
                str = f92Var42.f9275l;
                int i142 = 4;
                if (str != null) {
                }
                i142 = 0;
                this.f24528F = i142;
                fv8Var2 = this.f24530u;
                if (!rv8.m10866r(i3, fv8Var2.f10009N)) {
                }
                i9 = 0;
                this.f24525C = i9;
            }
        }
        z2 = false;
        this.f24529t = z2;
        if (z) {
            f = f92Var.f9282s;
            if (f != -1.0f) {
            }
            z3 = true;
            this.f24531v = z3;
            this.f24532w = rv8.m10866r(i3, false);
            f92 f92Var322 = this.f20764s;
            this.f24533x = f92Var322.f9271h;
            this.f24534y = f92Var322.m22831a();
            int i1222 = this.f20764s.f9268e;
            this.f24523A = Integer.bitCount(0);
            int i1322 = this.f20764s.f9268e;
            this.f24524B = true;
            i5 = 0;
            while (true) {
                if (i5 < fv8Var.f7007l.size()) {
                }
                i5++;
            }
            this.f24535z = i5;
            this.f24526D = (i3 & 384) != 128;
            this.f24527E = (i3 & 64) != 64;
            f92 f92Var422 = this.f20764s;
            str = f92Var422.f9275l;
            int i1422 = 4;
            if (str != null) {
            }
            i1422 = 0;
            this.f24528F = i1422;
            fv8Var2 = this.f24530u;
            if (!rv8.m10866r(i3, fv8Var2.f10009N)) {
            }
            i9 = 0;
            this.f24525C = i9;
        }
        z3 = false;
        this.f24531v = z3;
        this.f24532w = rv8.m10866r(i3, false);
        f92 f92Var3222 = this.f20764s;
        this.f24533x = f92Var3222.f9271h;
        this.f24534y = f92Var3222.m22831a();
        int i12222 = this.f20764s.f9268e;
        this.f24523A = Integer.bitCount(0);
        int i13222 = this.f20764s.f9268e;
        this.f24524B = true;
        i5 = 0;
        while (true) {
            if (i5 < fv8Var.f7007l.size()) {
            }
            i5++;
        }
        this.f24535z = i5;
        this.f24526D = (i3 & 384) != 128;
        this.f24527E = (i3 & 64) != 64;
        f92 f92Var4222 = this.f20764s;
        str = f92Var4222.f9275l;
        int i14222 = 4;
        if (str != null) {
        }
        i14222 = 0;
        this.f24528F = i14222;
        fv8Var2 = this.f24530u;
        if (!rv8.m10866r(i3, fv8Var2.f10009N)) {
        }
        i9 = 0;
        this.f24525C = i9;
    }

    /* renamed from: c */
    public static /* synthetic */ int m12028c(qv8 qv8Var, qv8 qv8Var2) {
        l37 l37Var;
        l37 mo8593a;
        l37 l37Var2;
        if (qv8Var.f24529t && qv8Var.f24532w) {
            mo8593a = rv8.f25652k;
        } else {
            l37Var = rv8.f25652k;
            mo8593a = l37Var.mo8593a();
        }
        n17 m15586i = n17.m15586i();
        Integer valueOf = Integer.valueOf(qv8Var.f24533x);
        Integer valueOf2 = Integer.valueOf(qv8Var2.f24533x);
        boolean z = qv8Var.f24530u.f7018w;
        l37Var2 = rv8.f25653l;
        return m15586i.mo15592c(valueOf, valueOf2, l37Var2).mo15592c(Integer.valueOf(qv8Var.f24534y), Integer.valueOf(qv8Var2.f24534y), mo8593a).mo15592c(Integer.valueOf(qv8Var.f24533x), Integer.valueOf(qv8Var2.f24533x), mo8593a).mo15594a();
    }

    /* renamed from: d */
    public static /* synthetic */ int m12027d(qv8 qv8Var, qv8 qv8Var2) {
        n17 mo15592c = n17.m15586i().mo15591d(qv8Var.f24532w, qv8Var2.f24532w).mo15593b(qv8Var.f24523A, qv8Var2.f24523A).mo15591d(true, true).mo15591d(qv8Var.f24529t, qv8Var2.f24529t).mo15591d(qv8Var.f24531v, qv8Var2.f24531v).mo15592c(Integer.valueOf(qv8Var.f24535z), Integer.valueOf(qv8Var2.f24535z), l37.m17166c().mo8593a());
        boolean z = qv8Var.f24526D;
        n17 mo15591d = mo15592c.mo15591d(z, qv8Var2.f24526D);
        boolean z2 = qv8Var.f24527E;
        n17 mo15591d2 = mo15591d.mo15591d(z2, qv8Var2.f24527E);
        if (z && z2) {
            mo15591d2 = mo15591d2.mo15593b(qv8Var.f24528F, qv8Var2.f24528F);
        }
        return mo15591d2.mo15594a();
    }

    @Override // com.daaw.nv8
    /* renamed from: a */
    public final int mo8816a() {
        return this.f24525C;
    }

    @Override // com.daaw.nv8
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo8815b(nv8 nv8Var) {
        qv8 qv8Var = (qv8) nv8Var;
        if (it5.m19376t(this.f20764s.f9275l, qv8Var.f20764s.f9275l)) {
            boolean z = this.f24530u.f10002G;
            return this.f24526D == qv8Var.f24526D && this.f24527E == qv8Var.f24527E;
        }
        return false;
    }
}
