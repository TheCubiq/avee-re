package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class ib8 {
    public final long a;
    public final l64 b;
    public final int c;
    public final pr8 d;
    public final long e;
    public final l64 f;
    public final int g;
    public final pr8 h;
    public final long i;
    public final long j;

    public ib8(long j, l64 l64Var, int i, pr8 pr8Var, long j2, l64 l64Var2, int i2, pr8 pr8Var2, long j3, long j4) {
        this.a = j;
        this.b = l64Var;
        this.c = i;
        this.d = pr8Var;
        this.e = j2;
        this.f = l64Var2;
        this.g = i2;
        this.h = pr8Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ib8.class == obj.getClass()) {
            ib8 ib8Var = (ib8) obj;
            if (this.a == ib8Var.a && this.c == ib8Var.c && this.e == ib8Var.e && this.g == ib8Var.g && this.i == ib8Var.i && this.j == ib8Var.j && ky6.a(this.b, ib8Var.b) && ky6.a(this.d, ib8Var.d) && ky6.a(this.f, ib8Var.f) && ky6.a(this.h, ib8Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
