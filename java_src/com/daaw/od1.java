package com.daaw;

import com.daaw.nl1;
/* loaded from: classes.dex */
public final class od1 extends nl1 {
    public static final Object k = new Object();
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final Object j;

    public od1(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, Object obj) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = z;
        this.i = z2;
        this.j = obj;
    }

    public od1(long j, long j2, long j3, long j4, boolean z, boolean z2, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    public od1(long j, boolean z, boolean z2, Object obj) {
        this(j, j, 0L, 0L, z, z2, obj);
    }

    @Override // com.daaw.nl1
    public int b(Object obj) {
        return k.equals(obj) ? 0 : -1;
    }

    @Override // com.daaw.nl1
    public nl1.b g(int i, nl1.b bVar, boolean z) {
        s6.c(i, 0, 1);
        return bVar.o(null, z ? k : null, 0, this.d, -this.f);
    }

    @Override // com.daaw.nl1
    public int h() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r1 > r6) goto L10;
     */
    @Override // com.daaw.nl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.daaw.nl1.c m(int r19, com.daaw.nl1.c r20, boolean r21, long r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = 1
            r3 = r19
            com.daaw.s6.c(r3, r1, r2)
            if (r21 == 0) goto Le
            java.lang.Object r1 = r0.j
            goto Lf
        Le:
            r1 = 0
        Lf:
            r3 = r1
            long r1 = r0.g
            boolean r9 = r0.i
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 == 0) goto L30
            r6 = 0
            int r8 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r8 == 0) goto L30
            long r6 = r0.e
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L29
        L27:
            r10 = r4
            goto L31
        L29:
            long r1 = r1 + r22
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 <= 0) goto L30
            goto L27
        L30:
            r10 = r1
        L31:
            long r4 = r0.b
            long r6 = r0.c
            boolean r8 = r0.h
            long r12 = r0.e
            r14 = 0
            r15 = 0
            long r1 = r0.f
            r16 = r1
            r2 = r20
            com.daaw.nl1$c r1 = r2.e(r3, r4, r6, r8, r9, r10, r12, r14, r15, r16)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.od1.m(int, com.daaw.nl1$c, boolean, long):com.daaw.nl1$c");
    }

    @Override // com.daaw.nl1
    public int n() {
        return 1;
    }
}
