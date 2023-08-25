package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class eg7 extends hh7 {

    /* renamed from: a */
    public final int f8468a;

    /* renamed from: b */
    public final int f8469b;

    /* renamed from: c */
    public final cg7 f8470c;

    public /* synthetic */ eg7(int i, int i2, cg7 cg7Var, dg7 dg7Var) {
        this.f8468a = i;
        this.f8469b = i2;
        this.f8470c = cg7Var;
    }

    /* renamed from: a */
    public final int m23475a() {
        return this.f8468a;
    }

    /* renamed from: b */
    public final int m23474b() {
        cg7 cg7Var = this.f8470c;
        if (cg7Var == cg7.f5800e) {
            return this.f8469b;
        }
        if (cg7Var == cg7.f5797b || cg7Var == cg7.f5798c || cg7Var == cg7.f5799d) {
            return this.f8469b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    /* renamed from: c */
    public final cg7 m23473c() {
        return this.f8470c;
    }

    /* renamed from: d */
    public final boolean m23472d() {
        return this.f8470c != cg7.f5800e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eg7) {
            eg7 eg7Var = (eg7) obj;
            return eg7Var.f8468a == this.f8468a && eg7Var.m23474b() == m23474b() && eg7Var.f8470c == this.f8470c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8469b), this.f8470c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8470c);
        int i = this.f8469b;
        int i2 = this.f8468a;
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }
}
