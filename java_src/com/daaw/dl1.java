package com.daaw;

import com.daaw.el1;
import java.lang.Comparable;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class dl1<T extends el1 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    public T[] f7236a;

    /* renamed from: a */
    public final void m24280a(T t) {
        t.mo23019f(this);
        T[] m24275f = m24275f();
        int m24278c = m24278c();
        m24271j(m24278c + 1);
        m24275f[m24278c] = t;
        t.mo23020e(m24278c);
        m24269l(m24278c);
    }

    /* renamed from: b */
    public final T m24279b() {
        T[] tArr = this.f7236a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: c */
    public final int m24278c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean m24277d() {
        return m24278c() == 0;
    }

    /* renamed from: e */
    public final T m24276e() {
        T m24279b;
        synchronized (this) {
            m24279b = m24279b();
        }
        return m24279b;
    }

    /* renamed from: f */
    public final T[] m24275f() {
        T[] tArr = this.f7236a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new el1[4];
            this.f7236a = tArr2;
            return tArr2;
        } else if (m24278c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, m24278c() * 2);
            ug0.m8269e(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((el1[]) copyOf);
            this.f7236a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    /* renamed from: g */
    public final boolean m24274g(T t) {
        boolean z;
        synchronized (this) {
            if (t.mo23021d() == null) {
                z = false;
            } else {
                m24273h(t.mo23022b());
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T m24273h(int i) {
        T[] tArr = this.f7236a;
        ug0.m8271c(tArr);
        m24271j(m24278c() - 1);
        if (i < m24278c()) {
            m24268m(i, m24278c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                ug0.m8271c(t);
                T t2 = tArr[i2];
                ug0.m8271c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m24268m(i, i2);
                    m24269l(i2);
                }
            }
            m24270k(i);
        }
        T t3 = tArr[m24278c()];
        ug0.m8271c(t3);
        t3.mo23019f(null);
        t3.mo23020e(-1);
        tArr[m24278c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T m24272i() {
        T m24273h;
        synchronized (this) {
            m24273h = m24278c() > 0 ? m24273h(0) : null;
        }
        return m24273h;
    }

    /* renamed from: j */
    public final void m24271j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    public final void m24270k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 >= m24278c()) {
                return;
            }
            T[] tArr = this.f7236a;
            ug0.m8271c(tArr);
            int i3 = i2 + 1;
            if (i3 < m24278c()) {
                T t = tArr[i3];
                ug0.m8271c(t);
                T t2 = tArr[i2];
                ug0.m8271c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    i2 = i3;
                }
            }
            T t3 = tArr[i];
            ug0.m8271c(t3);
            T t4 = tArr[i2];
            ug0.m8271c(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            m24268m(i, i2);
            i = i2;
        }
    }

    /* renamed from: l */
    public final void m24269l(int i) {
        while (i > 0) {
            T[] tArr = this.f7236a;
            ug0.m8271c(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            ug0.m8271c(t);
            T t2 = tArr[i];
            ug0.m8271c(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m24268m(i, i2);
            i = i2;
        }
    }

    /* renamed from: m */
    public final void m24268m(int i, int i2) {
        T[] tArr = this.f7236a;
        ug0.m8271c(tArr);
        T t = tArr[i2];
        ug0.m8271c(t);
        T t2 = tArr[i];
        ug0.m8271c(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo23020e(i);
        t2.mo23020e(i2);
    }
}
