package com.daaw;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;
/* loaded from: classes.dex */
public final class u42 implements j09 {
    public static final int[] p;
    public static final int s;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public boolean f;
    public int h;
    public long i;
    public m09 j;
    public m42 k;
    public i42 l;
    public boolean m;
    public static final q09 n = new q09() { // from class: com.daaw.t42
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = u42.n;
            return new j09[]{new u42(0)};
        }
    };
    public static final int[] o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final byte[] q = it5.B("#!AMR\n");
    public static final byte[] r = it5.B("#!AMR-WB\n");
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        p = iArr;
        s = iArr[8];
    }

    public u42(int i) {
    }

    public static boolean e(k09 k09Var, byte[] bArr) {
        k09Var.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((rz8) k09Var).h(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.daaw.j09
    public final boolean a(k09 k09Var) {
        return g(k09Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[Catch: EOFException -> 0x0090, TryCatch #0 {EOFException -> 0x0090, blocks: (B:4:0x0007, B:6:0x001b, B:20:0x0039, B:22:0x0042, B:21:0x003e, B:31:0x005c, B:32:0x0079, B:33:0x007a, B:34:0x008f), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[Catch: EOFException -> 0x0090, TryCatch #0 {EOFException -> 0x0090, blocks: (B:4:0x0007, B:6:0x001b, B:20:0x0039, B:22:0x0042, B:21:0x003e, B:31:0x005c, B:32:0x0079, B:33:0x007a, B:34:0x008f), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.daaw.k09 r12) {
        /*
            r11 = this;
            int r0 = r11.e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L91
            r12.zzj()     // Catch: java.io.EOFException -> L90
            byte[] r0 = r11.a     // Catch: java.io.EOFException -> L90
            r4 = r12
            com.daaw.rz8 r4 = (com.daaw.rz8) r4     // Catch: java.io.EOFException -> L90
            r4.h(r0, r3, r2, r3)     // Catch: java.io.EOFException -> L90
            byte[] r0 = r11.a     // Catch: java.io.EOFException -> L90
            r0 = r0[r3]     // Catch: java.io.EOFException -> L90
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L7a
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r11.b     // Catch: java.io.EOFException -> L90
            if (r4 == 0) goto L2c
            r6 = 10
            if (r0 < r6) goto L37
            r6 = 13
            if (r0 <= r6) goto L2c
            goto L37
        L2c:
            if (r4 != 0) goto L55
            r6 = 12
            if (r0 < r6) goto L37
            r6 = 14
            if (r0 > r6) goto L37
            goto L55
        L37:
            if (r4 == 0) goto L3e
            int[] r4 = com.daaw.u42.p     // Catch: java.io.EOFException -> L90
            r0 = r4[r0]     // Catch: java.io.EOFException -> L90
            goto L42
        L3e:
            int[] r4 = com.daaw.u42.o     // Catch: java.io.EOFException -> L90
            r0 = r4[r0]     // Catch: java.io.EOFException -> L90
        L42:
            r11.d = r0     // Catch: java.io.EOFException -> L90
            r11.e = r0
            int r4 = r11.g
            if (r4 != r1) goto L4d
            r11.g = r0
            r4 = r0
        L4d:
            if (r4 != r0) goto L91
            int r4 = r11.h
            int r4 = r4 + r2
            r11.h = r4
            goto L91
        L55:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L5c
            r12 = r3
        L5c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L90
            r2.<init>()     // Catch: java.io.EOFException -> L90
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch: java.io.EOFException -> L90
            r2.append(r12)     // Catch: java.io.EOFException -> L90
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch: java.io.EOFException -> L90
            r2.append(r0)     // Catch: java.io.EOFException -> L90
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> L90
            com.daaw.dl3 r12 = com.daaw.dl3.a(r12, r5)     // Catch: java.io.EOFException -> L90
            throw r12     // Catch: java.io.EOFException -> L90
        L7a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L90
            r12.<init>()     // Catch: java.io.EOFException -> L90
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch: java.io.EOFException -> L90
            r12.append(r0)     // Catch: java.io.EOFException -> L90
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> L90
            com.daaw.dl3 r12 = com.daaw.dl3.a(r12, r5)     // Catch: java.io.EOFException -> L90
            throw r12     // Catch: java.io.EOFException -> L90
        L90:
            return r1
        L91:
            com.daaw.m42 r4 = r11.k
            int r12 = com.daaw.k42.a(r4, r12, r0, r2)
            if (r12 != r1) goto L9a
            return r1
        L9a:
            int r0 = r11.e
            int r0 = r0 - r12
            r11.e = r0
            if (r0 <= 0) goto La2
            return r3
        La2:
            com.daaw.m42 r4 = r11.k
            long r5 = r11.c
            r7 = 1
            int r8 = r11.d
            r9 = 0
            r10 = 0
            r4.b(r5, r7, r8, r9, r10)
            long r0 = r11.c
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.c = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.u42.b(com.daaw.k09):int");
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.j = m09Var;
        this.k = m09Var.n(0, 1);
        m09Var.zzC();
    }

    @Override // com.daaw.j09
    public final int d(k09 k09Var, f42 f42Var) {
        uo4.b(this.k);
        int i = it5.a;
        if (k09Var.zzf() != 0 || g(k09Var)) {
            if (!this.m) {
                this.m = true;
                boolean z = this.b;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? 8000 : 16000;
                m42 m42Var = this.k;
                b72 b72Var = new b72();
                b72Var.s(str);
                b72Var.l(s);
                b72Var.e0(1);
                b72Var.t(i2);
                m42Var.f(b72Var.y());
            }
            int b = b(k09Var);
            if (this.f) {
                return b;
            }
            h42 h42Var = new h42(-9223372036854775807L, 0L);
            this.l = h42Var;
            this.j.i(h42Var);
            this.f = true;
            return b;
        }
        throw dl3.a("Could not find AMR header.", null);
    }

    @Override // com.daaw.j09
    public final void f(long j, long j2) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
        this.i = 0L;
    }

    public final boolean g(k09 k09Var) {
        int length;
        byte[] bArr = q;
        if (e(k09Var, bArr)) {
            this.b = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = r;
            if (!e(k09Var, bArr2)) {
                return false;
            }
            this.b = true;
            length = bArr2.length;
        }
        ((rz8) k09Var).l(length, false);
        return true;
    }
}
