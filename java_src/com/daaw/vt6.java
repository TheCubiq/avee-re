package com.daaw;

import java.io.File;
/* loaded from: classes.dex */
public final class vt6 {
    public final ap2 a;
    public final File b;
    public final File c;
    public final File d;
    public byte[] e;

    public vt6(ap2 ap2Var, File file, File file2, File file3) {
        this.a = ap2Var;
        this.b = file;
        this.c = file3;
        this.d = file2;
    }

    public final ap2 a() {
        return this.a;
    }

    public final File b() {
        return this.c;
    }

    public final File c() {
        return this.b;
    }

    public final boolean d(long j) {
        return this.a.M() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] e() {
        /*
            r3 = this;
            byte[] r0 = r3.e
            r1 = 0
            if (r0 != 0) goto L27
            java.io.File r0 = r3.d
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L20
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L20
            com.daaw.yq7 r0 = com.daaw.yq7.I(r2)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L21
            byte[] r0 = r0.j()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L21
            com.daaw.xd0.a(r2)
            goto L25
        L18:
            r0 = move-exception
            r1 = r2
            goto L1c
        L1b:
            r0 = move-exception
        L1c:
            com.daaw.xd0.a(r1)
            throw r0
        L20:
            r2 = r1
        L21:
            com.daaw.xd0.a(r2)
            r0 = r1
        L25:
            r3.e = r0
        L27:
            byte[] r0 = r3.e
            if (r0 != 0) goto L2c
            return r1
        L2c:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.vt6.e():byte[]");
    }
}
