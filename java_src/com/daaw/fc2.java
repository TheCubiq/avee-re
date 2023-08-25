package com.daaw;
/* loaded from: classes.dex */
public final class fc2 implements ac2 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final wd2 a;
    public ec2 f;
    public long g;
    public String h;
    public m42 i;
    public boolean j;
    public final boolean[] c = new boolean[4];
    public final dc2 d = new dc2(128);
    public long k = -9223372036854775807L;
    public final pc2 e = new pc2(178, 128);
    public final ik5 b = new ik5();

    public fc2(wd2 wd2Var) {
        this.a = wd2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cb A[SYNTHETIC] */
    @Override // com.daaw.ac2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.daaw.ik5 r19) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.fc2.a(com.daaw.ik5):void");
    }

    @Override // com.daaw.ac2
    public final void b(m09 m09Var, td2 td2Var) {
        td2Var.c();
        this.h = td2Var.b();
        m42 n = m09Var.n(td2Var.a(), 2);
        this.i = n;
        this.f = new ec2(n);
        this.a.b(m09Var, td2Var);
    }

    @Override // com.daaw.ac2
    public final void c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        c42.e(this.c);
        this.d.b();
        ec2 ec2Var = this.f;
        if (ec2Var != null) {
            ec2Var.d();
        }
        this.e.b();
        this.g = 0L;
        this.k = -9223372036854775807L;
    }
}
