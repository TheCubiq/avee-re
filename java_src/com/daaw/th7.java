package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class th7 {

    /* renamed from: a */
    public final v87 f27722a;

    /* renamed from: b */
    public final int f27723b;

    /* renamed from: c */
    public final l97 f27724c;

    public /* synthetic */ th7(v87 v87Var, int i, l97 l97Var, sh7 sh7Var) {
        this.f27722a = v87Var;
        this.f27723b = i;
        this.f27724c = l97Var;
    }

    /* renamed from: a */
    public final int m9108a() {
        return this.f27723b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof th7) {
            th7 th7Var = (th7) obj;
            return this.f27722a == th7Var.f27722a && this.f27723b == th7Var.f27723b && this.f27724c.equals(th7Var.f27724c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27722a, Integer.valueOf(this.f27723b), Integer.valueOf(this.f27724c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.f27722a, Integer.valueOf(this.f27723b), this.f27724c);
    }
}
