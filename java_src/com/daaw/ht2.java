package com.daaw;
/* loaded from: classes.dex */
public final class ht2 {

    /* renamed from: f */
    public static final ht2 f12917f = new ht2(new ar2());

    /* renamed from: g */
    public static final th8 f12918g = new th8() { // from class: com.daaw.vp2
    };

    /* renamed from: a */
    public final long f12919a;

    /* renamed from: b */
    public final long f12920b;

    /* renamed from: c */
    public final long f12921c;

    /* renamed from: d */
    public final float f12922d;

    /* renamed from: e */
    public final float f12923e;

    public ht2(ar2 ar2Var) {
        this.f12919a = -9223372036854775807L;
        this.f12920b = -9223372036854775807L;
        this.f12921c = -9223372036854775807L;
        this.f12922d = -3.4028235E38f;
        this.f12923e = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ht2) {
            long j = ((ht2) obj).f12919a;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = (int) (-9223372034707292159L);
        return (((((((i * 31) + i) * 31) + i) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
