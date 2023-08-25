package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class lf7 {
    public final Class a;
    public final Class b;

    public /* synthetic */ lf7(Class cls, Class cls2, kf7 kf7Var) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lf7) {
            lf7 lf7Var = (lf7) obj;
            return lf7Var.a.equals(this.a) && lf7Var.b.equals(this.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String simpleName = this.a.getSimpleName();
        String simpleName2 = this.b.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
