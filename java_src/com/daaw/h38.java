package com.daaw;

import java.net.URL;
import java.util.Map;
/* loaded from: classes2.dex */
public final class h38 implements Runnable {
    public final URL p;
    public final String q;
    public final /* synthetic */ k38 r;
    public final yo6 s;

    public h38(k38 k38Var, String str, URL url, byte[] bArr, Map map, yo6 yo6Var, byte[] bArr2) {
        this.r = k38Var;
        ry0.f(str);
        ry0.j(url);
        ry0.j(yo6Var);
        this.p = url;
        this.s = yo6Var;
        this.q = str;
    }

    public final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        yo6 yo6Var = this.s;
        yo6Var.a.f(this.q, i, exc, bArr, map);
    }

    public final void b(final int i, final Exception exc, final byte[] bArr, final Map map) {
        this.r.a.r().z(new Runnable() { // from class: com.daaw.v28
            @Override // java.lang.Runnable
            public final void run() {
                h38.this.a(i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.daaw.h38] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            com.daaw.k38 r0 = r9.r
            r0.e()
            r0 = 0
            r1 = 0
            com.daaw.k38 r2 = r9.r     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            java.net.URL r3 = r9.p     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            if (r4 == 0) goto L7c
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r3.setDefaultUseCaches(r0)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            com.daaw.dr6 r4 = r2.a     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r4.z()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            com.daaw.dr6 r2 = r2.a     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r2.z()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            r2 = 1
            r3.setDoInput(r2)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L73
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L64
            r5.<init>()     // Catch: java.lang.Throwable -> L64
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L64
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L62
        L4a:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L62
            if (r8 <= 0) goto L54
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L62
            goto L4a
        L54:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L62
            r6.close()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r3.disconnect()
            r9.b(r2, r1, r0, r4)
            return
        L62:
            r0 = move-exception
            goto L66
        L64:
            r0 = move-exception
            r6 = r1
        L66:
            if (r6 == 0) goto L6b
            r6.close()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
        L6b:
            throw r0     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
        L6c:
            r0 = move-exception
            goto L89
        L6e:
            r0 = move-exception
            goto L97
        L70:
            r0 = move-exception
            r4 = r1
            goto L89
        L73:
            r0 = move-exception
            r4 = r1
            goto L97
        L76:
            r2 = move-exception
            r4 = r1
            goto L87
        L79:
            r2 = move-exception
            r4 = r1
            goto L95
        L7c:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
            throw r2     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L92
        L84:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L87:
            r0 = r2
            r2 = 0
        L89:
            if (r3 == 0) goto L8e
            r3.disconnect()
        L8e:
            r9.b(r2, r1, r1, r4)
            throw r0
        L92:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L95:
            r0 = r2
            r2 = 0
        L97:
            if (r3 == 0) goto L9c
            r3.disconnect()
        L9c:
            r9.b(r2, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.h38.run():void");
    }
}
