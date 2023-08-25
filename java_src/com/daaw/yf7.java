package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class yf7 {
    @Nullable

    /* renamed from: a */
    public Integer f33632a = null;
    @Nullable

    /* renamed from: b */
    public Integer f33633b = null;

    /* renamed from: c */
    public cg7 f33634c = cg7.f5800e;

    public /* synthetic */ yf7(xf7 xf7Var) {
    }

    /* renamed from: a */
    public final yf7 m3777a(int i) {
        if (i == 16 || i == 32) {
            this.f33632a = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
    }

    /* renamed from: b */
    public final yf7 m3776b(int i) {
        if (i >= 10 && i <= 16) {
            this.f33633b = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }

    /* renamed from: c */
    public final yf7 m3775c(cg7 cg7Var) {
        this.f33634c = cg7Var;
        return this;
    }

    /* renamed from: d */
    public final eg7 m3774d() {
        Integer num = this.f33632a;
        if (num == null || this.f33633b == null) {
            throw new GeneralSecurityException("Key size and/or tag size not set");
        }
        return new eg7(num.intValue(), this.f33633b.intValue(), this.f33634c, null);
    }
}
