package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class jf7 {
    public final Class a;
    public final dq7 b;

    public /* synthetic */ jf7(Class cls, dq7 dq7Var, if7 if7Var) {
        this.a = cls;
        this.b = dq7Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jf7) {
            jf7 jf7Var = (jf7) obj;
            return jf7Var.a.equals(this.a) && jf7Var.b.equals(this.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String simpleName = this.a.getSimpleName();
        String valueOf = String.valueOf(this.b);
        return simpleName + ", object identifier: " + valueOf;
    }
}
