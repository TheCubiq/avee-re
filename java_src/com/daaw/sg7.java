package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class sg7 {
    @Nullable

    /* renamed from: a */
    public Integer f26241a = null;
    @Nullable

    /* renamed from: b */
    public Integer f26242b = null;

    /* renamed from: c */
    public tg7 f26243c = null;

    /* renamed from: d */
    public ug7 f26244d = ug7.f29054e;

    public /* synthetic */ sg7(rg7 rg7Var) {
    }

    /* renamed from: a */
    public final sg7 m10369a(tg7 tg7Var) {
        this.f26243c = tg7Var;
        return this;
    }

    /* renamed from: b */
    public final sg7 m10368b(int i) {
        this.f26241a = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final sg7 m10367c(int i) {
        this.f26242b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    public final sg7 m10366d(ug7 ug7Var) {
        this.f26244d = ug7Var;
        return this;
    }

    /* renamed from: e */
    public final wg7 m10365e() {
        Integer num = this.f26241a;
        if (num != null) {
            if (this.f26242b != null) {
                if (this.f26243c != null) {
                    if (num.intValue() >= 16) {
                        int intValue = this.f26242b.intValue();
                        tg7 tg7Var = this.f26243c;
                        if (intValue >= 10) {
                            if (tg7Var == tg7.f27630b) {
                                if (intValue > 20) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                                }
                            } else if (tg7Var == tg7.f27631c) {
                                if (intValue > 28) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                                }
                            } else if (tg7Var == tg7.f27632d) {
                                if (intValue > 32) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                                }
                            } else if (tg7Var == tg7.f27633e) {
                                if (intValue > 48) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                                }
                            } else if (tg7Var != tg7.f27634f) {
                                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                            } else {
                                if (intValue > 64) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                                }
                            }
                            return new wg7(this.f26241a.intValue(), this.f26242b.intValue(), this.f26244d, this.f26243c, null);
                        }
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f26241a));
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }
}
