package com.daaw;
/* loaded from: classes.dex */
public final class sc8 {
    public final int a = 0;
    public final float b = 0.0f;

    public sc8(int i, float f) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sc8.class == obj.getClass()) {
            sc8 sc8Var = (sc8) obj;
            if (Float.compare(0.0f, 0.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
