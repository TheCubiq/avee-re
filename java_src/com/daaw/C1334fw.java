package com.daaw;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.C0250e;
/* renamed from: com.daaw.fw */
/* loaded from: classes.dex */
public class C1334fw {

    /* renamed from: d */
    public static final ThreadLocal<up0> f10014d = new ThreadLocal<>();

    /* renamed from: a */
    public final int f10015a;

    /* renamed from: b */
    public final C0250e f10016b;

    /* renamed from: c */
    public volatile int f10017c = 0;

    public C1334fw(C0250e c0250e, int i) {
        this.f10016b = c0250e;
        this.f10015a = i;
    }

    /* renamed from: a */
    public void m22233a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface m29509g = this.f10016b.m29509g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(m29509g);
        canvas.drawText(this.f10016b.m29513c(), this.f10015a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int m22232b(int i) {
        return m22227g().m7850h(i);
    }

    /* renamed from: c */
    public int m22231c() {
        return m22227g().m7849i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: d */
    public int m22230d() {
        return this.f10017c;
    }

    /* renamed from: e */
    public short m22229e() {
        return m22227g().m7847k();
    }

    /* renamed from: f */
    public int m22228f() {
        return m22227g().m7846l();
    }

    /* renamed from: g */
    public final up0 m22227g() {
        ThreadLocal<up0> threadLocal = f10014d;
        up0 up0Var = threadLocal.get();
        if (up0Var == null) {
            up0Var = new up0();
            threadLocal.set(up0Var);
        }
        this.f10016b.m29512d().m6954j(up0Var, this.f10015a);
        return up0Var;
    }

    /* renamed from: h */
    public short m22226h() {
        return m22227g().m7845m();
    }

    /* renamed from: i */
    public short m22225i() {
        return m22227g().m7844n();
    }

    /* renamed from: j */
    public boolean m22224j() {
        return m22227g().m7848j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: k */
    public void m22223k(boolean z) {
        this.f10017c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m22228f()));
        sb.append(", codepoints:");
        int m22231c = m22231c();
        for (int i = 0; i < m22231c; i++) {
            sb.append(Integer.toHexString(m22232b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
