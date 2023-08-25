package com.daaw;
/* loaded from: classes.dex */
public final class g52 implements j09 {
    public int c;
    public h52 e;
    public long h;
    public j52 i;
    public int m;
    public boolean n;
    public final ik5 a = new ik5(12);
    public final f52 b = new f52(null);
    public m09 d = new h09();
    public j52[] g = new j52[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = -9223372036854775807L;

    @Override // com.daaw.j09
    public final boolean a(k09 k09Var) {
        ((rz8) k09Var).h(this.a.h(), 0, 12, false);
        this.a.f(0);
        if (this.a.o() != 1179011410) {
            return false;
        }
        this.a.g(4);
        return this.a.o() == 541677121;
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.c = 0;
        this.d = m09Var;
        this.h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // com.daaw.j09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.daaw.k09 r23, com.daaw.f42 r24) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.g52.d(com.daaw.k09, com.daaw.f42):int");
    }

    public final j52 e(int i) {
        j52[] j52VarArr;
        for (j52 j52Var : this.g) {
            if (j52Var.g(i)) {
                return j52Var;
            }
        }
        return null;
    }

    @Override // com.daaw.j09
    public final void f(long j, long j2) {
        int i;
        this.h = -1L;
        this.i = null;
        for (j52 j52Var : this.g) {
            j52Var.f(j);
        }
        if (j != 0) {
            i = 6;
        } else if (this.g.length == 0) {
            this.c = 0;
            return;
        } else {
            i = 3;
        }
        this.c = i;
    }
}
