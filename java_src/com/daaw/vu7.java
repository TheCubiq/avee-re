package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public final class vu7 extends jn3 {
    public static final th8 z = new th8() { // from class: com.daaw.jt7
    };
    public final int s;
    public final String t;
    public final int u;
    public final f92 v;
    public final int w;
    public final md3 x;
    public final boolean y;

    public vu7(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vu7(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.daaw.f92 r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L3e
            r0 = 1
            if (r4 == r0) goto Ld
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L44
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            java.lang.String r1 = com.daaw.it5.m(r21)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", format_supported="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            goto L44
        L3e:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L44:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L51
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L51:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.vu7.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.daaw.f92, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vu7(java.lang.String r9, java.lang.Throwable r10, int r11, int r12, java.lang.String r13, int r14, com.daaw.f92 r15, int r16, com.daaw.md3 r17, long r18, boolean r20) {
        /*
            r8 = this;
            r6 = r8
            r7 = r20
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r18
            r0.<init>(r1, r2, r3, r4)
            r0 = 0
            r1 = 1
            r2 = r12
            if (r7 == 0) goto L17
            if (r2 != r1) goto L15
            r2 = 1
            goto L17
        L15:
            r3 = 0
            goto L18
        L17:
            r3 = 1
        L18:
            com.daaw.uo4.d(r3)
            if (r10 != 0) goto L1e
            goto L1f
        L1e:
            r0 = 1
        L1f:
            com.daaw.uo4.d(r0)
            r6.s = r2
            r0 = r13
            r6.t = r0
            r0 = r14
            r6.u = r0
            r0 = r15
            r6.v = r0
            r0 = r16
            r6.w = r0
            r0 = r17
            r6.x = r0
            r6.y = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.vu7.<init>(java.lang.String, java.lang.Throwable, int, int, java.lang.String, int, com.daaw.f92, int, com.daaw.md3, long, boolean):void");
    }

    public static vu7 b(Throwable th, String str, int i, f92 f92Var, int i2, boolean z2, int i3) {
        return new vu7(1, th, null, i3, str, i, f92Var, f92Var == null ? 4 : i2, z2);
    }

    public static vu7 c(IOException iOException, int i) {
        return new vu7(0, iOException, i);
    }

    public static vu7 d(RuntimeException runtimeException, int i) {
        return new vu7(2, runtimeException, i);
    }

    public final vu7 a(md3 md3Var) {
        String message = getMessage();
        int i = it5.a;
        return new vu7(message, getCause(), this.p, this.s, this.t, this.u, this.v, this.w, md3Var, this.q, this.y);
    }
}
