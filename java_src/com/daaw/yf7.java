package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class yf7 {
    @Nullable
    public Integer a = null;
    @Nullable
    public Integer b = null;
    public cg7 c = cg7.e;

    public /* synthetic */ yf7(xf7 xf7Var) {
    }

    public final yf7 a(int i) {
        if (i == 16 || i == 32) {
            this.a = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
    }

    public final yf7 b(int i) {
        if (i >= 10 && i <= 16) {
            this.b = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }

    public final yf7 c(cg7 cg7Var) {
        this.c = cg7Var;
        return this;
    }

    public final eg7 d() {
        Integer num = this.a;
        if (num == null || this.b == null) {
            throw new GeneralSecurityException("Key size and/or tag size not set");
        }
        return new eg7(num.intValue(), this.b.intValue(), this.c, null);
    }
}
