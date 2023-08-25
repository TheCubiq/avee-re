package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class wg7 extends hh7 {
    public final int a;
    public final int b;
    public final ug7 c;
    public final tg7 d;

    public /* synthetic */ wg7(int i, int i2, ug7 ug7Var, tg7 tg7Var, vg7 vg7Var) {
        this.a = i;
        this.b = i2;
        this.c = ug7Var;
        this.d = tg7Var;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        ug7 ug7Var = this.c;
        if (ug7Var == ug7.e) {
            return this.b;
        }
        if (ug7Var == ug7.b || ug7Var == ug7.c || ug7Var == ug7.d) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final ug7 c() {
        return this.c;
    }

    public final boolean d() {
        return this.c != ug7.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wg7) {
            wg7 wg7Var = (wg7) obj;
            return wg7Var.a == this.a && wg7Var.b() == b() && wg7Var.c == this.c && wg7Var.d == this.d;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        int i = this.b;
        int i2 = this.a;
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }
}
