package com.daaw;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
/* loaded from: classes.dex */
public final class lp implements mp {
    public pp a;
    public int b;
    public byte[] c;

    @Override // com.daaw.mp
    public int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.c.length - this.b;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i2, length);
        System.arraycopy(this.c, this.b, bArr, i, min);
        this.b += min;
        return min;
    }

    @Override // com.daaw.mp
    public long c(pp ppVar) {
        this.a = ppVar;
        Uri uri = ppVar.a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new tv0("Unsupported scheme: " + scheme);
        }
        String[] W = sq1.W(uri.getSchemeSpecificPart(), ",");
        if (W.length != 2) {
            throw new tv0("Unexpected URI format: " + uri);
        }
        String str = W[1];
        if (W[0].contains(";base64")) {
            try {
                this.c = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new tv0("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.c = URLDecoder.decode(str, "US-ASCII").getBytes();
        }
        return this.c.length;
    }

    @Override // com.daaw.mp
    public void close() {
        this.a = null;
        this.c = null;
    }

    @Override // com.daaw.mp
    public Uri d() {
        pp ppVar = this.a;
        if (ppVar != null) {
            return ppVar.a;
        }
        return null;
    }
}
