package com.daaw;
/* loaded from: classes.dex */
public enum zn7 implements ns7 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: w */
    public static final os7 f35269w = new os7() { // from class: com.daaw.yn7
    };

    /* renamed from: p */
    public final int f35271p;

    zn7(int i) {
        this.f35271p = i;
    }

    /* renamed from: a */
    public static zn7 m2096a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f35271p;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
