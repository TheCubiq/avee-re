package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class mq8 implements os8 {
    public final q09 a;
    public j09 b;
    public k09 c;

    public mq8(q09 q09Var) {
        this.a = q09Var;
    }

    @Override // com.daaw.os8
    public final int a(f42 f42Var) {
        j09 j09Var = this.b;
        Objects.requireNonNull(j09Var);
        k09 k09Var = this.c;
        Objects.requireNonNull(k09Var);
        return j09Var.d(k09Var, f42Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r6.zzf() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r6.zzf() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        r1 = false;
     */
    @Override // com.daaw.os8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.daaw.xp8 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.daaw.m09 r15) {
        /*
            r7 = this;
            com.daaw.rz8 r6 = new com.daaw.rz8
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.c = r6
            com.daaw.j09 r8 = r7.b
            if (r8 == 0) goto L10
            return
        L10:
            com.daaw.q09 r8 = r7.a
            com.daaw.j09[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.b = r8
            goto L74
        L20:
            r0 = 0
        L21:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.a(r6)     // Catch: java.lang.Throwable -> L41 java.io.EOFException -> L56
            if (r2 == 0) goto L34
            r7.b = r1     // Catch: java.lang.Throwable -> L41 java.io.EOFException -> L56
            com.daaw.uo4.f(r14)
            r6.zzj()
            goto L70
        L34:
            com.daaw.j09 r1 = r7.b
            if (r1 != 0) goto L66
            long r1 = r6.zzf()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L64
            goto L66
        L41:
            r8 = move-exception
            com.daaw.j09 r9 = r7.b
            if (r9 != 0) goto L4e
            long r9 = r6.zzf()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L4f
        L4e:
            r13 = 1
        L4f:
            com.daaw.uo4.f(r13)
            r6.zzj()
            throw r8
        L56:
            com.daaw.j09 r1 = r7.b
            if (r1 != 0) goto L66
            long r1 = r6.zzf()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L64
            goto L66
        L64:
            r1 = 0
            goto L67
        L66:
            r1 = 1
        L67:
            com.daaw.uo4.f(r1)
            r6.zzj()
            int r0 = r0 + 1
            goto L21
        L70:
            com.daaw.j09 r10 = r7.b
            if (r10 == 0) goto L7a
        L74:
            com.daaw.j09 r8 = r7.b
            r8.c(r15)
            return
        L7a:
            com.daaw.bu8 r10 = new com.daaw.bu8
            java.lang.String r8 = com.daaw.it5.k(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            goto L9b
        L9a:
            throw r10
        L9b:
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.mq8.b(com.daaw.xp8, android.net.Uri, java.util.Map, long, long, com.daaw.m09):void");
    }

    @Override // com.daaw.os8
    public final void c(long j, long j2) {
        j09 j09Var = this.b;
        Objects.requireNonNull(j09Var);
        j09Var.f(j, j2);
    }

    @Override // com.daaw.os8
    public final long zzb() {
        k09 k09Var = this.c;
        if (k09Var != null) {
            return k09Var.zzf();
        }
        return -1L;
    }

    @Override // com.daaw.os8
    public final void zzc() {
        j09 j09Var = this.b;
        if (j09Var instanceof v82) {
            ((v82) j09Var).b();
        }
    }

    @Override // com.daaw.os8
    public final void zze() {
        if (this.b != null) {
            this.b = null;
        }
        this.c = null;
    }
}
