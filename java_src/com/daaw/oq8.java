package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class oq8 implements nr8, mr8 {
    public final nr8 p;
    public mr8 q;
    public nq8[] r = new nq8[0];
    public long s = 0;
    public long t;

    public oq8(nr8 nr8Var, boolean z, long j, long j2) {
        this.p = nr8Var;
        this.t = j2;
    }

    @Override // com.daaw.nt8
    public final /* bridge */ /* synthetic */ void a(vt8 vt8Var) {
        nr8 nr8Var = (nr8) vt8Var;
        mr8 mr8Var = this.q;
        Objects.requireNonNull(mr8Var);
        mr8Var.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r0 > r8) goto L18;
     */
    @Override // com.daaw.nr8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.s = r0
            com.daaw.nq8[] r0 = r7.r
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.c()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.daaw.nr8 r0 = r7.p
            long r0 = r0.b(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L35
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L36
            long r8 = r7.t
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L36
        L35:
            r2 = 1
        L36:
            com.daaw.uo4.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.oq8.b(long):long");
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean c(long j) {
        return this.p.c(j);
    }

    @Override // com.daaw.mr8
    public final void d(nr8 nr8Var) {
        mr8 mr8Var = this.q;
        Objects.requireNonNull(mr8Var);
        mr8Var.d(this);
    }

    @Override // com.daaw.nr8
    public final void e(long j, boolean z) {
        this.p.e(j, false);
    }

    public final void f(long j, long j2) {
        this.t = j2;
    }

    @Override // com.daaw.nr8
    public final void g(mr8 mr8Var, long j) {
        this.q = mr8Var;
        this.p.g(this, j);
    }

    @Override // com.daaw.nr8
    public final long h(long j, aa8 aa8Var) {
        if (j != 0) {
            long b0 = it5.b0(aa8Var.a, 0L, j);
            long j2 = aa8Var.b;
            long j3 = this.t;
            long b02 = it5.b0(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
            if (b0 != aa8Var.a || b02 != aa8Var.b) {
                aa8Var = new aa8(b0, b02);
            }
            return this.p.h(j, aa8Var);
        }
        return 0L;
    }

    public final boolean i() {
        return this.s != -9223372036854775807L;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final void j(long j) {
        this.p.j(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r4 > r7) goto L24;
     */
    @Override // com.daaw.nr8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(com.daaw.tv8[] r15, boolean[] r16, com.daaw.mt8[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.daaw.nq8[] r3 = new com.daaw.nq8[r2]
            r0.r = r3
            com.daaw.mt8[] r2 = new com.daaw.mt8[r2]
            r3 = 0
            r4 = 0
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.daaw.nq8[] r5 = r0.r
            r6 = r1[r4]
            com.daaw.nq8 r6 = (com.daaw.nq8) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.daaw.mt8 r11 = r6.a
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.daaw.nr8 r4 = r0.p
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.k(r5, r6, r7, r8, r9)
            boolean r6 = r14.i()
            r7 = 0
            if (r6 == 0) goto L3d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r9 = r7
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.s = r12
            r6 = 1
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L5c
            long r7 = r0.t
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L5c
            goto L5d
        L5c:
            r6 = 0
        L5d:
            com.daaw.uo4.f(r6)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            com.daaw.nq8[] r6 = r0.r
            r6[r3] = r11
            goto L7d
        L6c:
            com.daaw.nq8[] r7 = r0.r
            r8 = r7[r3]
            if (r8 == 0) goto L76
            com.daaw.mt8 r8 = r8.a
            if (r8 == r6) goto L7d
        L76:
            com.daaw.nq8 r8 = new com.daaw.nq8
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            com.daaw.nq8[] r6 = r0.r
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.oq8.k(com.daaw.tv8[], boolean[], com.daaw.mt8[], boolean[], long):long");
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzb() {
        long zzb = this.p.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j = this.t;
            if (j == Long.MIN_VALUE || zzb < j) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final long zzc() {
        long zzc = this.p.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j = this.t;
            if (j == Long.MIN_VALUE || zzc < j) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.daaw.nr8
    public final long zzd() {
        if (i()) {
            long j = this.s;
            this.s = -9223372036854775807L;
            long zzd = zzd();
            return zzd != -9223372036854775807L ? zzd : j;
        }
        long zzd2 = this.p.zzd();
        if (zzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        uo4.f(zzd2 >= 0);
        long j2 = this.t;
        uo4.f((j2 == Long.MIN_VALUE || zzd2 <= j2) ? true : true);
        return zzd2;
    }

    @Override // com.daaw.nr8
    public final au8 zzh() {
        return this.p.zzh();
    }

    @Override // com.daaw.nr8
    public final void zzk() {
        this.p.zzk();
    }

    @Override // com.daaw.nr8, com.daaw.vt8
    public final boolean zzp() {
        return this.p.zzp();
    }
}
