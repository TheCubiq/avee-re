package com.daaw;
/* loaded from: classes.dex */
public final class lb2 implements ac2 {
    public final cj5 a;
    public final ik5 b;
    public final String c;
    public String d;
    public m42 e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public f92 j;
    public int k;
    public long l;

    public lb2(String str) {
        cj5 cj5Var = new cj5(new byte[128], 128);
        this.a = cj5Var;
        this.b = new ik5(cj5Var.a);
        this.f = 0;
        this.l = -9223372036854775807L;
        this.c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ee, code lost:
        if (r12.s() == 11) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f2, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0114, code lost:
        if (r0 == 11) goto L13;
     */
    @Override // com.daaw.ac2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.daaw.ik5 r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.lb2.a(com.daaw.ik5):void");
    }

    @Override // com.daaw.ac2
    public final void b(m09 m09Var, td2 td2Var) {
        td2Var.c();
        this.d = td2Var.b();
        this.e = m09Var.n(td2Var.a(), 1);
    }

    @Override // com.daaw.ac2
    public final void c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
    }
}
