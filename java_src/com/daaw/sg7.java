package com.daaw;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class sg7 {
    @Nullable
    public Integer a = null;
    @Nullable
    public Integer b = null;
    public tg7 c = null;
    public ug7 d = ug7.e;

    public /* synthetic */ sg7(rg7 rg7Var) {
    }

    public final sg7 a(tg7 tg7Var) {
        this.c = tg7Var;
        return this;
    }

    public final sg7 b(int i) {
        this.a = Integer.valueOf(i);
        return this;
    }

    public final sg7 c(int i) {
        this.b = Integer.valueOf(i);
        return this;
    }

    public final sg7 d(ug7 ug7Var) {
        this.d = ug7Var;
        return this;
    }

    public final wg7 e() {
        Integer num = this.a;
        if (num != null) {
            if (this.b != null) {
                if (this.c != null) {
                    if (num.intValue() >= 16) {
                        int intValue = this.b.intValue();
                        tg7 tg7Var = this.c;
                        if (intValue >= 10) {
                            if (tg7Var == tg7.b) {
                                if (intValue > 20) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                                }
                            } else if (tg7Var == tg7.c) {
                                if (intValue > 28) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                                }
                            } else if (tg7Var == tg7.d) {
                                if (intValue > 32) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                                }
                            } else if (tg7Var == tg7.e) {
                                if (intValue > 48) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                                }
                            } else if (tg7Var != tg7.f) {
                                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                            } else {
                                if (intValue > 64) {
                                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                                }
                            }
                            return new wg7(this.a.intValue(), this.b.intValue(), this.d, this.c, null);
                        }
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.a));
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }
}
