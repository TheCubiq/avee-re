package com.daaw;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
/* loaded from: classes2.dex */
public final class nf1 {
    public static boolean k;
    public static Constructor<StaticLayout> l;
    public static Object m;
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int e;
    public boolean i;
    public int d = 0;
    public Layout.Alignment f = Layout.Alignment.ALIGN_NORMAL;
    public int g = Integer.MAX_VALUE;
    public boolean h = true;
    public TextUtils.TruncateAt j = null;

    /* loaded from: classes2.dex */
    public static class a extends Exception {
        public a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    public nf1(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.e = charSequence.length();
    }

    public static nf1 c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new nf1(charSequence, textPaint, i);
    }

    public StaticLayout a() {
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        if (this.g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.b, max, this.j);
        }
        int min = Math.min(charSequence.length(), this.e);
        this.e = min;
        if (Build.VERSION.SDK_INT < 23) {
            b();
            try {
                return (StaticLayout) ((Constructor) ty0.f(l)).newInstance(charSequence, Integer.valueOf(this.d), Integer.valueOf(this.e), this.b, Integer.valueOf(max), this.f, ty0.f(m), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.h), null, Integer.valueOf(max), Integer.valueOf(this.g));
            } catch (Exception e) {
                throw new a(e);
            }
        }
        if (this.i) {
            this.f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.d, min, this.b, max);
        obtain.setAlignment(this.f);
        obtain.setIncludePad(this.h);
        obtain.setTextDirection(this.i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.j;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.g);
        return obtain.build();
    }

    public final void b() {
        if (k) {
            return;
        }
        try {
            m = this.i && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            l = declaredConstructor;
            declaredConstructor.setAccessible(true);
            k = true;
        } catch (Exception e) {
            throw new a(e);
        }
    }

    public nf1 d(Layout.Alignment alignment) {
        this.f = alignment;
        return this;
    }

    public nf1 e(TextUtils.TruncateAt truncateAt) {
        this.j = truncateAt;
        return this;
    }

    public nf1 f(boolean z) {
        this.h = z;
        return this;
    }

    public nf1 g(boolean z) {
        this.i = z;
        return this;
    }

    public nf1 h(int i) {
        this.g = i;
        return this;
    }
}
