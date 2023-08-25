package com.daaw;

import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class t13 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;

    public t13(float f, float f2, float f3, float f4, int i) {
        this.a = f;
        this.b = f2;
        this.c = f + f3;
        this.d = f2 + f4;
        this.e = i;
    }

    public final float a() {
        return this.d;
    }

    public final float b() {
        return this.a;
    }

    public final float c() {
        return this.c;
    }

    public final float d() {
        return this.b;
    }

    public final int e() {
        return this.e;
    }
}
