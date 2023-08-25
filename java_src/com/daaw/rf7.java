package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class rf7 {

    /* renamed from: a */
    public eg7 f25245a = null;

    /* renamed from: b */
    public eq7 f25246b = null;
    @Nullable

    /* renamed from: c */
    public Integer f25247c = null;

    public /* synthetic */ rf7(qf7 qf7Var) {
    }

    /* renamed from: a */
    public final rf7 m11352a(eq7 eq7Var) {
        this.f25246b = eq7Var;
        return this;
    }

    /* renamed from: b */
    public final rf7 m11351b(@Nullable Integer num) {
        this.f25247c = num;
        return this;
    }

    /* renamed from: c */
    public final rf7 m11350c(eg7 eg7Var) {
        this.f25245a = eg7Var;
        return this;
    }

    /* renamed from: d */
    public final tf7 m11349d() {
        eq7 eq7Var;
        dq7 m24078b;
        eg7 eg7Var = this.f25245a;
        if (eg7Var == null || (eq7Var = this.f25246b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (eg7Var.m23475a() == eq7Var.m23278a()) {
            if (eg7Var.m23472d() && this.f25247c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
            }
            if (this.f25245a.m23472d() || this.f25247c == null) {
                if (this.f25245a.m23473c() == cg7.f5800e) {
                    m24078b = dq7.m24078b(new byte[0]);
                } else if (this.f25245a.m23473c() == cg7.f5799d || this.f25245a.m23473c() == cg7.f5798c) {
                    m24078b = dq7.m24078b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f25247c.intValue()).array());
                } else if (this.f25245a.m23473c() != cg7.f5797b) {
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f25245a.m23473c())));
                } else {
                    m24078b = dq7.m24078b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f25247c.intValue()).array());
                }
                return new tf7(this.f25245a, this.f25246b, m24078b, this.f25247c, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
