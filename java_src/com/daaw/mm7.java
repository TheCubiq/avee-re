package com.daaw;
/* loaded from: classes.dex */
public enum mm7 implements ns7 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: w */
    public static final os7 f18993w = new os7() { // from class: com.daaw.lm7
    };

    /* renamed from: p */
    public final int f18995p;

    mm7(int i) {
        this.f18995p = i;
    }

    /* renamed from: a */
    public static mm7 m15931a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return REMOTE;
                    }
                    return ASYMMETRIC_PUBLIC;
                }
                return ASYMMETRIC_PRIVATE;
            }
            return SYMMETRIC;
        }
        return UNKNOWN_KEYMATERIAL;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f18995p;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
