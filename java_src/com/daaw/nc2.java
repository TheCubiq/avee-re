package com.daaw;

import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class nc2 implements ac2 {
    public final String a;
    public final ik5 b;
    public final cj5 c;
    public m42 d;
    public String e;
    public f92 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public nc2(String str) {
        this.a = str;
        ik5 ik5Var = new ik5((int) NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
        this.b = ik5Var;
        byte[] h = ik5Var.h();
        this.c = new cj5(h, h.length);
        this.k = -9223372036854775807L;
    }

    public static long e(cj5 cj5Var) {
        return cj5Var.c((cj5Var.c(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
        if (r14.l == false) goto L26;
     */
    @Override // com.daaw.ac2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.daaw.ik5 r15) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.nc2.a(com.daaw.ik5):void");
    }

    @Override // com.daaw.ac2
    public final void b(m09 m09Var, td2 td2Var) {
        td2Var.c();
        this.d = m09Var.n(td2Var.a(), 1);
        this.e = td2Var.b();
    }

    @Override // com.daaw.ac2
    public final void c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    public final int d(cj5 cj5Var) {
        int a = cj5Var.a();
        yy8 b = zy8.b(cj5Var, true);
        this.u = b.c;
        this.r = b.a;
        this.t = b.b;
        return a - cj5Var.a();
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }
}
