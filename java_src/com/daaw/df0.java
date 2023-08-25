package com.daaw;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class df0 {
    public Bitmap a;
    public h0 b;

    public df0(Bitmap bitmap) {
        this.a = bitmap;
        this.b = null;
    }

    public df0(Bitmap bitmap, h0 h0Var) {
        this.a = bitmap;
        this.b = h0Var;
    }

    public static void c(df0 df0Var) {
        if (df0Var != null) {
            df0Var.b();
        }
    }

    public static Bitmap g(df0 df0Var) {
        if (df0Var != null) {
            return df0Var.f();
        }
        return null;
    }

    public void a() {
    }

    public void b() {
        h0 h0Var = this.b;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    public int d() {
        return 1;
    }

    public jr1<Bitmap> e() {
        return null;
    }

    public final Bitmap f() {
        return this.a;
    }

    public void h() {
    }
}
