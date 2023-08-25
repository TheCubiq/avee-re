package com.daaw;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class k60 {
    public final z41<s60> a;
    public final z41<Bitmap> b;

    public k60(z41<Bitmap> z41Var, z41<s60> z41Var2) {
        if (z41Var != null && z41Var2 != null) {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        }
        if (z41Var == null && z41Var2 == null) {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        }
        this.b = z41Var;
        this.a = z41Var2;
    }

    public z41<Bitmap> a() {
        return this.b;
    }

    public z41<s60> b() {
        return this.a;
    }

    public int c() {
        z41<Bitmap> z41Var = this.b;
        return z41Var != null ? z41Var.a() : this.a.a();
    }
}
