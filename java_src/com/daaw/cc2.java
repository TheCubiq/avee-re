package com.daaw;
/* loaded from: classes.dex */
public final class cc2 implements ac2 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public m42 b;
    public final wd2 c;
    public final ik5 d;
    public final pc2 e;
    public final boolean[] f = new boolean[4];
    public final bc2 g = new bc2(128);
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public cc2(wd2 wd2Var) {
        ik5 ik5Var;
        this.c = wd2Var;
        if (wd2Var != null) {
            this.e = new pc2(178, 128);
            ik5Var = new ik5();
        } else {
            ik5Var = null;
            this.e = null;
        }
        this.d = ik5Var;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e7  */
    @Override // com.daaw.ac2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.daaw.ik5 r20) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.cc2.a(com.daaw.ik5):void");
    }

    @Override // com.daaw.ac2
    public final void b(m09 m09Var, td2 td2Var) {
        td2Var.c();
        this.a = td2Var.b();
        this.b = m09Var.n(td2Var.a(), 2);
        wd2 wd2Var = this.c;
        if (wd2Var != null) {
            wd2Var.b(m09Var, td2Var);
        }
    }

    @Override // com.daaw.ac2
    public final void c(long j, int i) {
        this.l = j;
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        c42.e(this.f);
        this.g.b();
        pc2 pc2Var = this.e;
        if (pc2Var != null) {
            pc2Var.b();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
}
