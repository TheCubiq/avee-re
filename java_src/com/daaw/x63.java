package com.daaw;
/* loaded from: classes.dex */
public enum x63 implements ns7 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    

    /* renamed from: w */
    public static final os7 f32150w = new os7() { // from class: com.daaw.v63
    };

    /* renamed from: p */
    public final int f32152p;

    x63(int i) {
        this.f32152p = i;
    }

    /* renamed from: a */
    public static x63 m5501a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return SUSPENDED;
                        }
                        return DISCONNECTED;
                    }
                    return DISCONNECTING;
                }
                return CONNECTED;
            }
            return CONNECTING;
        }
        return UNSPECIFIED;
    }

    /* renamed from: b */
    public static ps7 m5500b() {
        return w63.f30921a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f32152p);
    }

    public final int zza() {
        return this.f32152p;
    }
}
