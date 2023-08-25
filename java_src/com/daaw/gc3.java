package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class gc3 {
    public static final gc3 v = new gc3(new x93());
    public static final th8 w = new th8() { // from class: com.daaw.p73
    };
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    @Deprecated
    public final Integer j;
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final CharSequence q;
    public final CharSequence r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;

    public gc3(x93 x93Var) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        byte[] bArr;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        charSequence = x93Var.a;
        this.a = charSequence;
        charSequence2 = x93Var.b;
        this.b = charSequence2;
        charSequence3 = x93Var.c;
        this.c = charSequence3;
        charSequence4 = x93Var.d;
        this.d = charSequence4;
        charSequence5 = x93Var.e;
        this.e = charSequence5;
        bArr = x93Var.f;
        this.f = bArr;
        num = x93Var.g;
        this.g = num;
        num2 = x93Var.h;
        this.h = num2;
        num3 = x93Var.i;
        this.i = num3;
        num4 = x93Var.j;
        this.j = num4;
        num5 = x93Var.j;
        this.k = num5;
        num6 = x93Var.k;
        this.l = num6;
        num7 = x93Var.l;
        this.m = num7;
        num8 = x93Var.m;
        this.n = num8;
        num9 = x93Var.n;
        this.o = num9;
        num10 = x93Var.o;
        this.p = num10;
        charSequence6 = x93Var.p;
        this.q = charSequence6;
        charSequence7 = x93Var.q;
        this.r = charSequence7;
        charSequence8 = x93Var.r;
        this.s = charSequence8;
        charSequence9 = x93Var.s;
        this.t = charSequence9;
        charSequence10 = x93Var.t;
        this.u = charSequence10;
    }

    public final x93 a() {
        return new x93(this, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gc3.class == obj.getClass()) {
            gc3 gc3Var = (gc3) obj;
            if (it5.t(this.a, gc3Var.a) && it5.t(this.b, gc3Var.b) && it5.t(this.c, gc3Var.c) && it5.t(this.d, gc3Var.d) && it5.t(null, null) && it5.t(null, null) && it5.t(this.e, gc3Var.e) && it5.t(null, null) && it5.t(null, null) && Arrays.equals(this.f, gc3Var.f) && it5.t(this.g, gc3Var.g) && it5.t(null, null) && it5.t(this.h, gc3Var.h) && it5.t(this.i, gc3Var.i) && it5.t(null, null) && it5.t(null, null) && it5.t(this.k, gc3Var.k) && it5.t(this.l, gc3Var.l) && it5.t(this.m, gc3Var.m) && it5.t(this.n, gc3Var.n) && it5.t(this.o, gc3Var.o) && it5.t(this.p, gc3Var.p) && it5.t(this.q, gc3Var.q) && it5.t(this.r, gc3Var.r) && it5.t(this.s, gc3Var.s) && it5.t(null, null) && it5.t(null, null) && it5.t(this.t, gc3Var.t) && it5.t(null, null) && it5.t(this.u, gc3Var.u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, null, null, this.e, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, null, null, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, null, null, this.t, null, this.u});
    }
}
