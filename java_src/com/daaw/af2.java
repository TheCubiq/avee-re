package com.daaw;
/* loaded from: classes.dex */
public final class af2 {
    public int a = 2500;
    public int b;

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final void c(zf2 zf2Var) {
        int i = this.b + 1;
        this.b = i;
        int i2 = this.a;
        this.a = i2 + i2;
        if (i > 1) {
            throw zf2Var;
        }
    }
}
