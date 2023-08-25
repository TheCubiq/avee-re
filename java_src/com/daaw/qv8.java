package com.daaw;
/* loaded from: classes.dex */
public final class qv8 extends nv8 {
    public final int A;
    public final boolean B;
    public final int C;
    public final boolean D;
    public final boolean E;
    public final int F;
    public final boolean t;
    public final fv8 u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final int z;

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
        To view partially-correct add '--show-bad-code' argument
    */
    public qv8(int r5, com.daaw.r84 r6, int r7, com.daaw.fv8 r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qv8.<init>(int, com.daaw.r84, int, com.daaw.fv8, int, int, boolean):void");
    }

    public static /* synthetic */ int c(qv8 qv8Var, qv8 qv8Var2) {
        l37 l37Var;
        l37 a;
        l37 l37Var2;
        if (qv8Var.t && qv8Var.w) {
            a = rv8.k;
        } else {
            l37Var = rv8.k;
            a = l37Var.a();
        }
        n17 i = n17.i();
        Integer valueOf = Integer.valueOf(qv8Var.x);
        Integer valueOf2 = Integer.valueOf(qv8Var2.x);
        boolean z = qv8Var.u.w;
        l37Var2 = rv8.l;
        return i.c(valueOf, valueOf2, l37Var2).c(Integer.valueOf(qv8Var.y), Integer.valueOf(qv8Var2.y), a).c(Integer.valueOf(qv8Var.x), Integer.valueOf(qv8Var2.x), a).a();
    }

    public static /* synthetic */ int d(qv8 qv8Var, qv8 qv8Var2) {
        n17 c = n17.i().d(qv8Var.w, qv8Var2.w).b(qv8Var.A, qv8Var2.A).d(true, true).d(qv8Var.t, qv8Var2.t).d(qv8Var.v, qv8Var2.v).c(Integer.valueOf(qv8Var.z), Integer.valueOf(qv8Var2.z), l37.c().a());
        boolean z = qv8Var.D;
        n17 d = c.d(z, qv8Var2.D);
        boolean z2 = qv8Var.E;
        n17 d2 = d.d(z2, qv8Var2.E);
        if (z && z2) {
            d2 = d2.b(qv8Var.F, qv8Var2.F);
        }
        return d2.a();
    }

    @Override // com.daaw.nv8
    public final int a() {
        return this.C;
    }

    @Override // com.daaw.nv8
    public final /* bridge */ /* synthetic */ boolean b(nv8 nv8Var) {
        qv8 qv8Var = (qv8) nv8Var;
        if (it5.t(this.s.l, qv8Var.s.l)) {
            boolean z = this.u.G;
            return this.D == qv8Var.D && this.E == qv8Var.E;
        }
        return false;
    }
}
