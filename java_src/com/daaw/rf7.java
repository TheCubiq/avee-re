package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class rf7 {
    public eg7 a = null;
    public eq7 b = null;
    @Nullable
    public Integer c = null;

    public /* synthetic */ rf7(qf7 qf7Var) {
    }

    public final rf7 a(eq7 eq7Var) {
        this.b = eq7Var;
        return this;
    }

    public final rf7 b(@Nullable Integer num) {
        this.c = num;
        return this;
    }

    public final rf7 c(eg7 eg7Var) {
        this.a = eg7Var;
        return this;
    }

    public final tf7 d() {
        eq7 eq7Var;
        dq7 b;
        eg7 eg7Var = this.a;
        if (eg7Var == null || (eq7Var = this.b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (eg7Var.a() == eq7Var.a()) {
            if (eg7Var.d() && this.c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
            }
            if (this.a.d() || this.c == null) {
                if (this.a.c() == cg7.e) {
                    b = dq7.b(new byte[0]);
                } else if (this.a.c() == cg7.d || this.a.c() == cg7.c) {
                    b = dq7.b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.c.intValue()).array());
                } else if (this.a.c() != cg7.b) {
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.a.c())));
                } else {
                    b = dq7.b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.c.intValue()).array());
                }
                return new tf7(this.a, this.b, b, this.c, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
