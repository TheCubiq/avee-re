package com.daaw;
/* loaded from: classes.dex */
public final class ua2 implements bb2 {
    public final ab2 a;
    public final long b;
    public final long c;
    public final gb2 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public ua2(gb2 gb2Var, long j, long j2, long j3, long j4, boolean z) {
        uo4.d(j >= 0 && j2 > j);
        this.d = gb2Var;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new ab2();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    @Override // com.daaw.bb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.daaw.k09 r25) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ua2.a(com.daaw.k09):long");
    }

    @Override // com.daaw.bb2
    public final void b(long j) {
        this.h = it5.b0(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    @Override // com.daaw.bb2
    public final /* bridge */ /* synthetic */ i42 zze() {
        if (this.f != 0) {
            return new ta2(this, null);
        }
        return null;
    }
}
