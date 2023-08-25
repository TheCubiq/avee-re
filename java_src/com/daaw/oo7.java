package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class oo7 implements a87 {

    /* renamed from: a */
    public final kb7 f21785a;

    public oo7(byte[] bArr) {
        if (!xb7.m5296a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f21785a = new kb7(bArr, true);
    }

    @Override // com.daaw.a87
    /* renamed from: a */
    public final byte[] mo1998a(byte[] bArr, byte[] bArr2) {
        return this.f21785a.m17835a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    @Override // com.daaw.a87
    /* renamed from: b */
    public final byte[] mo1997b(byte[] bArr, byte[] bArr2) {
        return this.f21785a.m17834b(vp7.m6942a(12), bArr, bArr2);
    }
}
