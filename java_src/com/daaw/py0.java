package com.daaw;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes.dex */
public class py0 implements Spannable {

    /* renamed from: s */
    public static final Object f23518s = new Object();

    /* renamed from: p */
    public final Spannable f23519p;

    /* renamed from: q */
    public final C2666a f23520q;

    /* renamed from: r */
    public final PrecomputedText f23521r;

    /* renamed from: com.daaw.py0$a */
    /* loaded from: classes.dex */
    public static final class C2666a {

        /* renamed from: a */
        public final TextPaint f23522a;

        /* renamed from: b */
        public final TextDirectionHeuristic f23523b;

        /* renamed from: c */
        public final int f23524c;

        /* renamed from: d */
        public final int f23525d;

        /* renamed from: e */
        public final PrecomputedText.Params f23526e;

        /* renamed from: com.daaw.py0$a$a */
        /* loaded from: classes.dex */
        public static class C2667a {

            /* renamed from: a */
            public final TextPaint f23527a;

            /* renamed from: b */
            public TextDirectionHeuristic f23528b;

            /* renamed from: c */
            public int f23529c;

            /* renamed from: d */
            public int f23530d;

            public C2667a(TextPaint textPaint) {
                this.f23527a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f23529c = 1;
                    this.f23530d = 1;
                } else {
                    this.f23530d = 0;
                    this.f23529c = 0;
                }
                this.f23528b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            /* renamed from: a */
            public C2666a m12874a() {
                return new C2666a(this.f23527a, this.f23528b, this.f23529c, this.f23530d);
            }

            /* renamed from: b */
            public C2667a m12873b(int i) {
                this.f23529c = i;
                return this;
            }

            /* renamed from: c */
            public C2667a m12872c(int i) {
                this.f23530d = i;
                return this;
            }

            /* renamed from: d */
            public C2667a m12871d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f23528b = textDirectionHeuristic;
                return this;
            }
        }

        public C2666a(PrecomputedText.Params params) {
            this.f23522a = params.getTextPaint();
            this.f23523b = params.getTextDirection();
            this.f23524c = params.getBreakStrategy();
            this.f23525d = params.getHyphenationFrequency();
            this.f23526e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public C2666a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f23526e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f23522a = textPaint;
            this.f23523b = textDirectionHeuristic;
            this.f23524c = i;
            this.f23525d = i2;
        }

        /* renamed from: a */
        public boolean m12879a(C2666a c2666a) {
            int i = Build.VERSION.SDK_INT;
            if ((i < 23 || (this.f23524c == c2666a.m12878b() && this.f23525d == c2666a.m12877c())) && this.f23522a.getTextSize() == c2666a.m12875e().getTextSize() && this.f23522a.getTextScaleX() == c2666a.m12875e().getTextScaleX() && this.f23522a.getTextSkewX() == c2666a.m12875e().getTextSkewX()) {
                if ((i < 21 || (this.f23522a.getLetterSpacing() == c2666a.m12875e().getLetterSpacing() && TextUtils.equals(this.f23522a.getFontFeatureSettings(), c2666a.m12875e().getFontFeatureSettings()))) && this.f23522a.getFlags() == c2666a.m12875e().getFlags()) {
                    if (i >= 24) {
                        if (!this.f23522a.getTextLocales().equals(c2666a.m12875e().getTextLocales())) {
                            return false;
                        }
                    } else if (!this.f23522a.getTextLocale().equals(c2666a.m12875e().getTextLocale())) {
                        return false;
                    }
                    return this.f23522a.getTypeface() == null ? c2666a.m12875e().getTypeface() == null : this.f23522a.getTypeface().equals(c2666a.m12875e().getTypeface());
                }
                return false;
            }
            return false;
        }

        /* renamed from: b */
        public int m12878b() {
            return this.f23524c;
        }

        /* renamed from: c */
        public int m12877c() {
            return this.f23525d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m12876d() {
            return this.f23523b;
        }

        /* renamed from: e */
        public TextPaint m12875e() {
            return this.f23522a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C2666a) {
                C2666a c2666a = (C2666a) obj;
                return m12879a(c2666a) && this.f23523b == c2666a.m12876d();
            }
            return false;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            return i >= 24 ? pt0.m13159b(Float.valueOf(this.f23522a.getTextSize()), Float.valueOf(this.f23522a.getTextScaleX()), Float.valueOf(this.f23522a.getTextSkewX()), Float.valueOf(this.f23522a.getLetterSpacing()), Integer.valueOf(this.f23522a.getFlags()), this.f23522a.getTextLocales(), this.f23522a.getTypeface(), Boolean.valueOf(this.f23522a.isElegantTextHeight()), this.f23523b, Integer.valueOf(this.f23524c), Integer.valueOf(this.f23525d)) : i >= 21 ? pt0.m13159b(Float.valueOf(this.f23522a.getTextSize()), Float.valueOf(this.f23522a.getTextScaleX()), Float.valueOf(this.f23522a.getTextSkewX()), Float.valueOf(this.f23522a.getLetterSpacing()), Integer.valueOf(this.f23522a.getFlags()), this.f23522a.getTextLocale(), this.f23522a.getTypeface(), Boolean.valueOf(this.f23522a.isElegantTextHeight()), this.f23523b, Integer.valueOf(this.f23524c), Integer.valueOf(this.f23525d)) : pt0.m13159b(Float.valueOf(this.f23522a.getTextSize()), Float.valueOf(this.f23522a.getTextScaleX()), Float.valueOf(this.f23522a.getTextSkewX()), Integer.valueOf(this.f23522a.getFlags()), this.f23522a.getTextLocale(), this.f23522a.getTypeface(), this.f23523b, Integer.valueOf(this.f23524c), Integer.valueOf(this.f23525d));
        }

        public String toString() {
            StringBuilder sb;
            Object textLocale;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f23522a.getTextSize());
            sb2.append(", textScaleX=" + this.f23522a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f23522a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                sb2.append(", letterSpacing=" + this.f23522a.getLetterSpacing());
                sb2.append(", elegantTextHeight=" + this.f23522a.isElegantTextHeight());
            }
            if (i >= 24) {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f23522a.getTextLocales();
            } else {
                sb = new StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f23522a.getTextLocale();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.f23522a.getTypeface());
            if (i >= 26) {
                sb2.append(", variationSettings=" + this.f23522a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f23523b);
            sb2.append(", breakStrategy=" + this.f23524c);
            sb2.append(", hyphenationFrequency=" + this.f23525d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public C2666a m12881a() {
        return this.f23520q;
    }

    /* renamed from: b */
    public PrecomputedText m12880b() {
        Spannable spannable = this.f23519p;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f23519p.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f23519p.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f23519p.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f23519p.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f23521r.getSpans(i, i2, cls) : (T[]) this.f23519p.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f23519p.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f23519p.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f23521r.removeSpan(obj);
        } else {
            this.f23519p.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f23521r.setSpan(obj, i, i2, i3);
        } else {
            this.f23519p.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f23519p.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f23519p.toString();
    }
}
