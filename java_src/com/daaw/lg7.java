package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class lg7 {
    public wg7 a = null;
    public eq7 b = null;
    @Nullable
    public Integer c = null;

    public /* synthetic */ lg7(kg7 kg7Var) {
    }

    public final lg7 a(@Nullable Integer num) {
        this.c = num;
        return this;
    }

    public final lg7 b(eq7 eq7Var) {
        this.b = eq7Var;
        return this;
    }

    public final lg7 c(wg7 wg7Var) {
        this.a = wg7Var;
        return this;
    }

    public final ng7 d() {
        eq7 eq7Var;
        dq7 b;
        wg7 wg7Var = this.a;
        if (wg7Var == null || (eq7Var = this.b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (wg7Var.a() == eq7Var.a()) {
            if (wg7Var.d() && this.c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
            }
            if (this.a.d() || this.c == null) {
                if (this.a.c() == ug7.e) {
                    b = dq7.b(new byte[0]);
                } else if (this.a.c() == ug7.d || this.a.c() == ug7.c) {
                    b = dq7.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
                } else if (this.a.c() != ug7.b) {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.a.c())));
                } else {
                    b = dq7.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
                }
                return new ng7(this.a, this.b, b, this.c, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
