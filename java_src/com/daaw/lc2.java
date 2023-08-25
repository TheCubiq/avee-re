package com.daaw;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class lc2 implements ac2 {
    public final id2 a;
    public String b;
    public m42 c;
    public kc2 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final pc2 g = new pc2(32, 128);
    public final pc2 h = new pc2(33, 128);
    public final pc2 i = new pc2(34, 128);
    public final pc2 j = new pc2(39, 128);
    public final pc2 k = new pc2(40, 128);
    public long m = -9223372036854775807L;
    public final ik5 n = new ik5();

    public lc2(id2 id2Var) {
        this.a = id2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b8  */
    @Override // com.daaw.ac2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.daaw.ik5 r38) {
        /*
            Method dump skipped, instructions count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.lc2.a(com.daaw.ik5):void");
    }

    @Override // com.daaw.ac2
    public final void b(m09 m09Var, td2 td2Var) {
        td2Var.c();
        this.b = td2Var.b();
        m42 n = m09Var.n(td2Var.a(), 2);
        this.c = n;
        this.d = new kc2(n);
        this.a.b(m09Var, td2Var);
    }

    @Override // com.daaw.ac2
    public final void c(long j, int i) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    @RequiresNonNull({"sampleReader"})
    public final void d(byte[] bArr, int i, int i2) {
        this.d.b(bArr, i, i2);
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    @Override // com.daaw.ac2
    public final void zzc() {
    }

    @Override // com.daaw.ac2
    public final void zze() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        c42.e(this.f);
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.k.b();
        kc2 kc2Var = this.d;
        if (kc2Var != null) {
            kc2Var.c();
        }
    }
}
