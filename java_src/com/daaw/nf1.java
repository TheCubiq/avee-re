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

    /* renamed from: k */
    public static boolean f20074k;

    /* renamed from: l */
    public static Constructor<StaticLayout> f20075l;

    /* renamed from: m */
    public static Object f20076m;

    /* renamed from: a */
    public CharSequence f20077a;

    /* renamed from: b */
    public final TextPaint f20078b;

    /* renamed from: c */
    public final int f20079c;

    /* renamed from: e */
    public int f20081e;

    /* renamed from: i */
    public boolean f20085i;

    /* renamed from: d */
    public int f20080d = 0;

    /* renamed from: f */
    public Layout.Alignment f20082f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    public int f20083g = Integer.MAX_VALUE;

    /* renamed from: h */
    public boolean f20084h = true;

    /* renamed from: j */
    public TextUtils.TruncateAt f20086j = null;

    /* renamed from: com.daaw.nf1$a */
    /* loaded from: classes2.dex */
    public static class C2287a extends Exception {
        public C2287a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    public nf1(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f20077a = charSequence;
        this.f20078b = textPaint;
        this.f20079c = i;
        this.f20081e = charSequence.length();
    }

    /* renamed from: c */
    public static nf1 m15198c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new nf1(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout m15200a() {
        if (this.f20077a == null) {
            this.f20077a = "";
        }
        int max = Math.max(0, this.f20079c);
        CharSequence charSequence = this.f20077a;
        if (this.f20083g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f20078b, max, this.f20086j);
        }
        int min = Math.min(charSequence.length(), this.f20081e);
        this.f20081e = min;
        if (Build.VERSION.SDK_INT < 23) {
            m15199b();
            try {
                return (StaticLayout) ((Constructor) ty0.m8699f(f20075l)).newInstance(charSequence, Integer.valueOf(this.f20080d), Integer.valueOf(this.f20081e), this.f20078b, Integer.valueOf(max), this.f20082f, ty0.m8699f(f20076m), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f20084h), null, Integer.valueOf(max), Integer.valueOf(this.f20083g));
            } catch (Exception e) {
                throw new C2287a(e);
            }
        }
        if (this.f20085i) {
            this.f20082f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f20080d, min, this.f20078b, max);
        obtain.setAlignment(this.f20082f);
        obtain.setIncludePad(this.f20084h);
        obtain.setTextDirection(this.f20085i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f20086j;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f20083g);
        return obtain.build();
    }

    /* renamed from: b */
    public final void m15199b() {
        if (f20074k) {
            return;
        }
        try {
            f20076m = this.f20085i && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f20075l = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f20074k = true;
        } catch (Exception e) {
            throw new C2287a(e);
        }
    }

    /* renamed from: d */
    public nf1 m15197d(Layout.Alignment alignment) {
        this.f20082f = alignment;
        return this;
    }

    /* renamed from: e */
    public nf1 m15196e(TextUtils.TruncateAt truncateAt) {
        this.f20086j = truncateAt;
        return this;
    }

    /* renamed from: f */
    public nf1 m15195f(boolean z) {
        this.f20084h = z;
        return this;
    }

    /* renamed from: g */
    public nf1 m15194g(boolean z) {
        this.f20085i = z;
        return this;
    }

    /* renamed from: h */
    public nf1 m15193h(int i) {
        this.f20083g = i;
        return this;
    }
}
