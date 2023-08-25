package com.daaw;
/* loaded from: classes.dex */
public final class ws8 {
    public final int a;
    public final boolean b;

    public ws8(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ws8.class == obj.getClass()) {
            ws8 ws8Var = (ws8) obj;
            if (this.a == ws8Var.a && this.b == ws8Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
