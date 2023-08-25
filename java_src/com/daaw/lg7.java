package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class lg7 {

    /* renamed from: a */
    public wg7 f17382a = null;

    /* renamed from: b */
    public eq7 f17383b = null;
    @Nullable

    /* renamed from: c */
    public Integer f17384c = null;

    public /* synthetic */ lg7(kg7 kg7Var) {
    }

    /* renamed from: a */
    public final lg7 m16963a(@Nullable Integer num) {
        this.f17384c = num;
        return this;
    }

    /* renamed from: b */
    public final lg7 m16962b(eq7 eq7Var) {
        this.f17383b = eq7Var;
        return this;
    }

    /* renamed from: c */
    public final lg7 m16961c(wg7 wg7Var) {
        this.f17382a = wg7Var;
        return this;
    }

    /* renamed from: d */
    public final ng7 m16960d() {
        eq7 eq7Var;
        dq7 m24078b;
        wg7 wg7Var = this.f17382a;
        if (wg7Var == null || (eq7Var = this.f17383b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (wg7Var.m6072a() == eq7Var.m23278a()) {
            if (wg7Var.m6069d() && this.f17384c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
            }
            if (this.f17382a.m6069d() || this.f17384c == null) {
                if (this.f17382a.m6070c() == ug7.f29054e) {
                    m24078b = dq7.m24078b(new byte[0]);
                } else if (this.f17382a.m6070c() == ug7.f29053d || this.f17382a.m6070c() == ug7.f29052c) {
                    m24078b = dq7.m24078b(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f17384c.intValue()).array());
                } else if (this.f17382a.m6070c() != ug7.f29051b) {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f17382a.m6070c())));
                } else {
                    m24078b = dq7.m24078b(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f17384c.intValue()).array());
                }
                return new ng7(this.f17382a, this.f17383b, m24078b, this.f17384c, null);
            }
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
