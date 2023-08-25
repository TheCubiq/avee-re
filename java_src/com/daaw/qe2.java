package com.daaw;

import java.security.cert.X509Certificate;
/* loaded from: classes.dex */
public final class qe2 extends re2 {
    public final byte[] q;

    public qe2(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.q = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.q;
    }
}
