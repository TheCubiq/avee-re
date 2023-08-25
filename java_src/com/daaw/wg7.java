package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class wg7 extends hh7 {

    /* renamed from: a */
    public final int f31236a;

    /* renamed from: b */
    public final int f31237b;

    /* renamed from: c */
    public final ug7 f31238c;

    /* renamed from: d */
    public final tg7 f31239d;

    public /* synthetic */ wg7(int i, int i2, ug7 ug7Var, tg7 tg7Var, vg7 vg7Var) {
        this.f31236a = i;
        this.f31237b = i2;
        this.f31238c = ug7Var;
        this.f31239d = tg7Var;
    }

    /* renamed from: a */
    public final int m6072a() {
        return this.f31236a;
    }

    /* renamed from: b */
    public final int m6071b() {
        ug7 ug7Var = this.f31238c;
        if (ug7Var == ug7.f29054e) {
            return this.f31237b;
        }
        if (ug7Var == ug7.f29051b || ug7Var == ug7.f29052c || ug7Var == ug7.f29053d) {
            return this.f31237b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    /* renamed from: c */
    public final ug7 m6070c() {
        return this.f31238c;
    }

    /* renamed from: d */
    public final boolean m6069d() {
        return this.f31238c != ug7.f29054e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wg7) {
            wg7 wg7Var = (wg7) obj;
            return wg7Var.f31236a == this.f31236a && wg7Var.m6071b() == m6071b() && wg7Var.f31238c == this.f31238c && wg7Var.f31239d == this.f31239d;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31237b), this.f31238c, this.f31239d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31238c);
        String valueOf2 = String.valueOf(this.f31239d);
        int i = this.f31237b;
        int i2 = this.f31236a;
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }
}
