package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class eg7 extends hh7 {
    public final int a;
    public final int b;
    public final cg7 c;

    public /* synthetic */ eg7(int i, int i2, cg7 cg7Var, dg7 dg7Var) {
        this.a = i;
        this.b = i2;
        this.c = cg7Var;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        cg7 cg7Var = this.c;
        if (cg7Var == cg7.e) {
            return this.b;
        }
        if (cg7Var == cg7.b || cg7Var == cg7.c || cg7Var == cg7.d) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final cg7 c() {
        return this.c;
    }

    public final boolean d() {
        return this.c != cg7.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eg7) {
            eg7 eg7Var = (eg7) obj;
            return eg7Var.a == this.a && eg7Var.b() == b() && eg7Var.c == this.c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        int i = this.b;
        int i2 = this.a;
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }
}
