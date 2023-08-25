package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class th7 {
    public final v87 a;
    public final int b;
    public final l97 c;

    public /* synthetic */ th7(v87 v87Var, int i, l97 l97Var, sh7 sh7Var) {
        this.a = v87Var;
        this.b = i;
        this.c = l97Var;
    }

    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof th7) {
            th7 th7Var = (th7) obj;
            return this.a == th7Var.a && this.b == th7Var.b && this.c.equals(th7Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.a, Integer.valueOf(this.b), this.c);
    }
}
