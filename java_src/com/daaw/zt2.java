package com.daaw;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
/* loaded from: classes.dex */
public final class zt2 implements ns2 {
    public static final ps2 w = new wt2();
    public static final int x = pz2.g("seig");
    public static final byte[] y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public int j;
    public int k;
    public long l;
    public int m;
    public iz2 n;
    public long o;
    public yt2 q;
    public int r;
    public int s;
    public int t;
    public os2 u;
    public boolean v;
    public final iz2 f = new iz2(16);
    public final iz2 b = new iz2(gz2.a);
    public final iz2 c = new iz2(5);
    public final iz2 d = new iz2();
    public final iz2 e = new iz2(1);
    public final byte[] g = new byte[16];
    public final Stack h = new Stack();
    public final LinkedList i = new LinkedList();
    public final SparseArray a = new SparseArray();
    public long p = -9223372036854775807L;

    public zt2(int i, mz2 mz2Var, fu2 fu2Var) {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzavc a(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto La5
            java.lang.Object r5 = r14.get(r3)
            com.daaw.mt2 r5 = (com.daaw.mt2) r5
            int r6 = r5.a
            int r7 = com.daaw.nt2.V
            if (r6 != r7) goto La1
            if (r4 != 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1d:
            com.daaw.iz2 r5 = r5.P0
            byte[] r5 = r5.a
            com.daaw.iz2 r6 = new com.daaw.iz2
            r6.<init>(r5)
            int r8 = r6.d()
            r9 = 32
            if (r8 >= r9) goto L30
        L2e:
            r6 = r2
            goto L8c
        L30:
            r6.v(r1)
            int r8 = r6.e()
            int r9 = r6.a()
            int r9 = r9 + 4
            if (r8 == r9) goto L40
            goto L2e
        L40:
            int r8 = r6.e()
            if (r8 == r7) goto L47
            goto L2e
        L47:
            int r7 = r6.e()
            int r7 = com.daaw.nt2.b(r7)
            r8 = 1
            if (r7 <= r8) goto L60
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            goto L2e
        L60:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.l()
            long r12 = r6.l()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L78
            int r7 = r6.i()
            int r7 = r7 * 16
            r6.w(r7)
        L78:
            int r7 = r6.i()
            int r8 = r6.a()
            if (r7 == r8) goto L83
            goto L2e
        L83:
            byte[] r8 = new byte[r7]
            r6.q(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L8c:
            if (r6 != 0) goto L90
            r6 = r2
            goto L94
        L90:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L94:
            if (r6 != 0) goto L97
            goto La1
        L97:
            com.google.android.gms.internal.ads.zzavb r7 = new com.google.android.gms.internal.ads.zzavb
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        La1:
            int r3 = r3 + 1
            goto L8
        La5:
            if (r4 != 0) goto La8
            return r2
        La8:
            com.google.android.gms.internal.ads.zzavc r14 = new com.google.android.gms.internal.ads.zzavc
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.zt2.a(java.util.List):com.google.android.gms.internal.ads.zzavc");
    }

    public static void g(iz2 iz2Var, int i, hu2 hu2Var) {
        iz2Var.v(i + 8);
        int a = nt2.a(iz2Var.e());
        if ((a & 1) != 0) {
            throw new eq2("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (a & 2) != 0;
        int i2 = iz2Var.i();
        int i3 = hu2Var.e;
        if (i2 == i3) {
            Arrays.fill(hu2Var.m, 0, i2, z);
            hu2Var.a(iz2Var.a());
            iz2Var.q(hu2Var.p.a, 0, hu2Var.o);
            hu2Var.p.v(0);
            hu2Var.q = false;
            return;
        }
        throw new eq2("Length mismatch: " + i2 + ", " + i3);
    }

    @Override // com.daaw.ns2
    public final boolean b(ms2 ms2Var) {
        return eu2.a(ms2Var);
    }

    @Override // com.daaw.ns2
    public final void c(os2 os2Var) {
        this.u = os2Var;
    }

    @Override // com.daaw.ns2
    public final void d(long j, long j2) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((yt2) this.a.valueAt(i)).b();
        }
        this.i.clear();
        this.h.clear();
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        r2 = r24.q;
        r3 = r2.a;
        r5 = r3.h;
        r9 = r2.e;
        r5 = r5[r9];
        r24.r = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r3.l == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        r5 = r3.p;
        r10 = r3.a.a;
        r11 = r3.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
        if (r11 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
        r11 = r2.c.h[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        r10 = r11.a;
        r3 = r3.m[r9];
        r9 = r24.e;
        r11 = r9.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
        if (true == r3) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
        r11[0] = (byte) (r12 | r10);
        r9.v(0);
        r2 = r2.b;
        r2.c(r24.e, 1);
        r2.c(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
        if (r3 != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00be, code lost:
        r3 = r5.j();
        r5.w(-2);
        r3 = (r3 * 6) + 2;
        r2.c(r5, r3);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
        r24.s = r10;
        r5 = r24.r + r10;
        r24.r = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d7, code lost:
        r24.s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00df, code lost:
        if (r24.q.c.g != 1) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e1, code lost:
        r24.r = r5 - 8;
        r1.i(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e8, code lost:
        r24.j = 4;
        r24.t = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
        r2 = r24.q;
        r3 = r2.a;
        r5 = r2.c;
        r9 = r2.b;
        r2 = r2.e;
        r6 = r5.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f9, code lost:
        if (r6 != 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
        r4 = r24.s;
        r6 = r24.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ff, code lost:
        if (r4 >= r6) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
        r24.s += r9.b(r1, r6 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
        r10 = r24.c.a;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r4 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011f, code lost:
        if (r24.s >= r24.r) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0121, code lost:
        r11 = r24.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0123, code lost:
        if (r11 != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
        r1.h(r10, r6, r4, false);
        r24.c.v(0);
        r24.t = r24.c.i() - 1;
        r24.b.v(0);
        r9.c(r24.b, 4);
        r9.c(r24.c, 1);
        r24.s += 5;
        r24.r += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0153, code lost:
        r11 = r9.b(r1, r11, false);
        r24.s += r11;
        r24.t -= r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0162, code lost:
        r10 = (r3.j[r2] + r3.i[r2]) * 1000;
        r1 = r3.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
        if (true == r1) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0174, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0176, code lost:
        r4 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0178, code lost:
        r12 = r4 | (r3.k[r2] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017e, code lost:
        if (r1 == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0180, code lost:
        r1 = r3.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0182, code lost:
        if (r1 != null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0184, code lost:
        r1 = r5.h[r3.a.a];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018c, code lost:
        r2 = r24.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0190, code lost:
        if (r1 == r2.i) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0192, code lost:
        r2 = new com.daaw.vs2(1, r1.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019a, code lost:
        r2 = r2.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019e, code lost:
        r1 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a0, code lost:
        r2 = r24.q;
        r2.h = r15;
        r2.i = r1;
        r9.d(r10, r12, r24.r, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b2, code lost:
        if (r24.i.isEmpty() == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b4, code lost:
        r1 = r24.q;
        r1.e++;
        r2 = r1.f + 1;
        r1.f = r2;
        r3 = r3.g;
        r4 = r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c6, code lost:
        if (r2 != r3[r4]) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c8, code lost:
        r1.g = r4 + 1;
        r1.f = 0;
        r24.q = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d0, code lost:
        r24.j = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d3, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d4, code lost:
        r2 = ((com.daaw.xt2) r24.i.removeFirst()).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01df, code lost:
        throw null;
     */
    @Override // com.daaw.ns2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(com.daaw.ms2 r25, com.daaw.ss2 r26) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.zt2.e(com.daaw.ms2, com.daaw.ss2):int");
    }

    public final void f() {
        this.j = 0;
        this.m = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:246:0x062a, code lost:
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x062e, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0592  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r50) {
        /*
            Method dump skipped, instructions count: 1583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.zt2.h(long):void");
    }
}
