package com.daaw;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class le1 extends SpannableStringBuilder {

    /* renamed from: p */
    public final Class<?> f17353p;

    /* renamed from: q */
    public final List<C2033a> f17354q;

    /* renamed from: com.daaw.le1$a */
    /* loaded from: classes.dex */
    public static class C2033a implements TextWatcher, SpanWatcher {

        /* renamed from: p */
        public final Object f17355p;

        /* renamed from: q */
        public final AtomicInteger f17356q = new AtomicInteger(0);

        public C2033a(Object obj) {
            this.f17355p = obj;
        }

        /* renamed from: a */
        public final void m16989a() {
            this.f17356q.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f17355p).afterTextChanged(editable);
        }

        /* renamed from: b */
        public final boolean m16988b(Object obj) {
            return obj instanceof AbstractC1477gw;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f17355p).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* renamed from: c */
        public final void m16987c() {
            this.f17356q.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f17356q.get() <= 0 || !m16988b(obj)) {
                ((SpanWatcher) this.f17355p).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f17356q.get() <= 0 || !m16988b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i7 = i > i2 ? 0 : i;
                    if (i3 > i4) {
                        i5 = i7;
                        i6 = 0;
                    } else {
                        i6 = i3;
                        i5 = i7;
                    }
                } else {
                    i5 = i;
                    i6 = i3;
                }
                ((SpanWatcher) this.f17355p).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f17356q.get() <= 0 || !m16988b(obj)) {
                ((SpanWatcher) this.f17355p).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f17355p).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public le1(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f17354q = new ArrayList();
        ty0.m8698g(cls, "watcherClass cannot be null");
        this.f17353p = cls;
    }

    public le1(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f17354q = new ArrayList();
        ty0.m8698g(cls, "watcherClass cannot be null");
        this.f17353p = cls;
    }

    /* renamed from: c */
    public static le1 m16996c(Class<?> cls, CharSequence charSequence) {
        return new le1(cls, charSequence);
    }

    /* renamed from: a */
    public void m16998a() {
        m16997b();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    /* renamed from: b */
    public final void m16997b() {
        for (int i = 0; i < this.f17354q.size(); i++) {
            this.f17354q.get(i).m16989a();
        }
    }

    /* renamed from: d */
    public void m16995d() {
        m16990i();
        m16994e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* renamed from: e */
    public final void m16994e() {
        for (int i = 0; i < this.f17354q.size(); i++) {
            this.f17354q.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    public final C2033a m16993f(Object obj) {
        for (int i = 0; i < this.f17354q.size(); i++) {
            C2033a c2033a = this.f17354q.get(i);
            if (c2033a.f17355p == obj) {
                return c2033a;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean m16992g(Class<?> cls) {
        return this.f17353p == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        C2033a m16993f;
        if (m16991h(obj) && (m16993f = m16993f(obj)) != null) {
            obj = m16993f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        C2033a m16993f;
        if (m16991h(obj) && (m16993f = m16993f(obj)) != null) {
            obj = m16993f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        C2033a m16993f;
        if (m16991h(obj) && (m16993f = m16993f(obj)) != null) {
            obj = m16993f;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (m16992g(cls)) {
            C2033a[] c2033aArr = (C2033a[]) super.getSpans(i, i2, C2033a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, c2033aArr.length));
            for (int i3 = 0; i3 < c2033aArr.length; i3++) {
                tArr[i3] = c2033aArr[i3].f17355p;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    /* renamed from: h */
    public final boolean m16991h(Object obj) {
        return obj != null && m16992g(obj.getClass());
    }

    /* renamed from: i */
    public final void m16990i() {
        for (int i = 0; i < this.f17354q.size(); i++) {
            this.f17354q.get(i).m16987c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return super.nextSpanTransition(i, i2, (cls == null || m16992g(cls)) ? C2033a.class : C2033a.class);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        C2033a c2033a;
        if (m16991h(obj)) {
            c2033a = m16993f(obj);
            if (c2033a != null) {
                obj = c2033a;
            }
        } else {
            c2033a = null;
        }
        super.removeSpan(obj);
        if (c2033a != null) {
            this.f17354q.remove(c2033a);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m16997b();
        super.replace(i, i2, charSequence);
        m16990i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m16997b();
        super.replace(i, i2, charSequence, i3, i4);
        m16990i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (m16991h(obj)) {
            C2033a c2033a = new C2033a(obj);
            this.f17354q.add(c2033a);
            obj = c2033a;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new le1(this.f17353p, this, i, i2);
    }
}
