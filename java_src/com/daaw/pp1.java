package com.daaw;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
/* loaded from: classes.dex */
public class pp1 implements Spannable {

    /* renamed from: p */
    public boolean f23127p = false;

    /* renamed from: q */
    public Spannable f23128q;

    /* renamed from: com.daaw.pp1$a */
    /* loaded from: classes.dex */
    public static class C2572a {
        /* renamed from: a */
        public static IntStream m13238a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* renamed from: b */
        public static IntStream m13237b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* renamed from: com.daaw.pp1$b */
    /* loaded from: classes.dex */
    public static class C2573b {
        /* renamed from: a */
        public boolean mo13236a(CharSequence charSequence) {
            return charSequence instanceof py0;
        }
    }

    /* renamed from: com.daaw.pp1$c */
    /* loaded from: classes.dex */
    public static class C2574c extends C2573b {
        @Override // com.daaw.pp1.C2573b
        /* renamed from: a */
        public boolean mo13236a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof py0);
        }
    }

    public pp1(Spannable spannable) {
        this.f23128q = spannable;
    }

    public pp1(CharSequence charSequence) {
        this.f23128q = new SpannableString(charSequence);
    }

    /* renamed from: c */
    public static C2573b m13239c() {
        return Build.VERSION.SDK_INT < 28 ? new C2573b() : new C2574c();
    }

    /* renamed from: a */
    public final void m13241a() {
        Spannable spannable = this.f23128q;
        if (!this.f23127p && m13239c().mo13236a(spannable)) {
            this.f23128q = new SpannableString(spannable);
        }
        this.f23127p = true;
    }

    /* renamed from: b */
    public Spannable m13240b() {
        return this.f23128q;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f23128q.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return C2572a.m13238a(this.f23128q);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return C2572a.m13237b(this.f23128q);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f23128q.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f23128q.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f23128q.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f23128q.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f23128q.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f23128q.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m13241a();
        this.f23128q.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        m13241a();
        this.f23128q.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f23128q.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f23128q.toString();
    }
}
