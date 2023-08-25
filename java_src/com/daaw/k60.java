package com.daaw;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class k60 {

    /* renamed from: a */
    public final z41<s60> f15694a;

    /* renamed from: b */
    public final z41<Bitmap> f15695b;

    public k60(z41<Bitmap> z41Var, z41<s60> z41Var2) {
        if (z41Var != null && z41Var2 != null) {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        }
        if (z41Var == null && z41Var2 == null) {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        }
        this.f15695b = z41Var;
        this.f15694a = z41Var2;
    }

    /* renamed from: a */
    public z41<Bitmap> m18035a() {
        return this.f15695b;
    }

    /* renamed from: b */
    public z41<s60> m18034b() {
        return this.f15694a;
    }

    /* renamed from: c */
    public int m18033c() {
        z41<Bitmap> z41Var = this.f15695b;
        return z41Var != null ? z41Var.mo2828a() : this.f15694a.mo2828a();
    }
}
