package com.daaw;
/* loaded from: classes.dex */
public final class o98 {
    public static final o98 c = new o98(0, 0, 1, 1, 0, null);
    public static final th8 d = new th8() { // from class: com.daaw.ke5
    };
    public final int a = 1;
    public x28 b;

    public /* synthetic */ o98(int i, int i2, int i3, int i4, int i5, f68 f68Var) {
    }

    public final x28 a() {
        if (this.b == null) {
            this.b = new x28(this, null);
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o98.class != obj.getClass()) {
            return false;
        }
        o98 o98Var = (o98) obj;
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }
}
