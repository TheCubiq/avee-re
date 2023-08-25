package com.daaw;
/* loaded from: classes.dex */
public final class ht2 {
    public static final ht2 f = new ht2(new ar2());
    public static final th8 g = new th8() { // from class: com.daaw.vp2
    };
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    public ht2(ar2 ar2Var) {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
        this.d = -3.4028235E38f;
        this.e = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ht2) {
            long j = ((ht2) obj).a;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = (int) (-9223372034707292159L);
        return (((((((i * 31) + i) * 31) + i) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
