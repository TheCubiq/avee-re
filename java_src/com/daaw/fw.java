package com.daaw;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
/* loaded from: classes.dex */
public class fw {
    public static final ThreadLocal<up0> d = new ThreadLocal<>();
    public final int a;
    public final androidx.emoji2.text.e b;
    public volatile int c = 0;

    public fw(androidx.emoji2.text.e eVar, int i) {
        this.b = eVar;
        this.a = i;
    }

    public void a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface g = this.b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g);
        canvas.drawText(this.b.c(), this.a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i) {
        return g().h(i);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public final up0 g() {
        ThreadLocal<up0> threadLocal = d;
        up0 up0Var = threadLocal.get();
        if (up0Var == null) {
            up0Var = new up0();
            threadLocal.set(up0Var);
        }
        this.b.d().j(up0Var, this.a);
        return up0Var;
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void k(boolean z) {
        this.c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int c = c();
        for (int i = 0; i < c; i++) {
            sb.append(Integer.toHexString(b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
