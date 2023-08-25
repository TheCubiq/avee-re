package com.daaw;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class b87 {
    public final InputStream a;

    public b87(InputStream inputStream) {
        this.a = inputStream;
    }

    public static b87 b(byte[] bArr) {
        return new b87(new ByteArrayInputStream(bArr));
    }

    public final dn7 a() {
        try {
            return dn7.P(this.a, vr7.a());
        } finally {
            this.a.close();
        }
    }
}
