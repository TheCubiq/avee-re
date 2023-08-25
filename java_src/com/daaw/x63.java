package com.daaw;
/* loaded from: classes.dex */
public enum x63 implements ns7 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    
    public static final os7 w = new os7() { // from class: com.daaw.v63
    };
    public final int p;

    x63(int i) {
        this.p = i;
    }

    public static x63 a(int i) {
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

    public static ps7 b() {
        return w63.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }

    public final int zza() {
        return this.p;
    }
}
