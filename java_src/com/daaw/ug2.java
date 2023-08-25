package com.daaw;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;
/* loaded from: classes.dex */
public final class ug2 extends FilterInputStream {
    public final HttpURLConnection p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ug2(java.net.HttpURLConnection r2) {
        /*
            r1 = this;
            java.io.InputStream r0 = r2.getInputStream()     // Catch: java.io.IOException -> L5
            goto L9
        L5:
            java.io.InputStream r0 = r2.getErrorStream()
        L9:
            r1.<init>(r0)
            r1.p = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ug2.<init>(java.net.HttpURLConnection):void");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.p.disconnect();
    }
}
