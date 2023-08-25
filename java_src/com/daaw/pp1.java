package com.daaw;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
/* loaded from: classes.dex */
public class pp1 implements Spannable {
    public boolean p = false;
    public Spannable q;

    /* loaded from: classes.dex */
    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof py0;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // com.daaw.pp1.b
        public boolean a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof py0);
        }
    }

    public pp1(Spannable spannable) {
        this.q = spannable;
    }

    public pp1(CharSequence charSequence) {
        this.q = new SpannableString(charSequence);
    }

    public static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    public final void a() {
        Spannable spannable = this.q;
        if (!this.p && c().a(spannable)) {
            this.q = new SpannableString(spannable);
        }
        this.p = true;
    }

    public Spannable b() {
        return this.q;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.q.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.q);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.q);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.q.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.q.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.q.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.q.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.q.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.q.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.q.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.q.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.q.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.q.toString();
    }
}
