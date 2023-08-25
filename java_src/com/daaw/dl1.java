package com.daaw;

import com.daaw.el1;
import java.lang.Comparable;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class dl1<T extends el1 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;
    public T[] a;

    public final void a(T t) {
        t.f(this);
        T[] f = f();
        int c = c();
        j(c + 1);
        f[c] = t;
        t.e(c);
        l(c);
    }

    public final T b() {
        T[] tArr = this.a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b;
        synchronized (this) {
            b = b();
        }
        return b;
    }

    public final T[] f() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new el1[4];
            this.a = tArr2;
            return tArr2;
        } else if (c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
            ug0.e(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((el1[]) copyOf);
            this.a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    public final boolean g(T t) {
        boolean z;
        synchronized (this) {
            if (t.d() == null) {
                z = false;
            } else {
                h(t.b());
                z = true;
            }
        }
        return z;
    }

    public final T h(int i) {
        T[] tArr = this.a;
        ug0.c(tArr);
        j(c() - 1);
        if (i < c()) {
            m(i, c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                ug0.c(t);
                T t2 = tArr[i2];
                ug0.c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m(i, i2);
                    l(i2);
                }
            }
            k(i);
        }
        T t3 = tArr[c()];
        ug0.c(t3);
        t3.f(null);
        t3.e(-1);
        tArr[c()] = null;
        return t3;
    }

    public final T i() {
        T h;
        synchronized (this) {
            h = c() > 0 ? h(0) : null;
        }
        return h;
    }

    public final void j(int i) {
        this._size = i;
    }

    public final void k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 >= c()) {
                return;
            }
            T[] tArr = this.a;
            ug0.c(tArr);
            int i3 = i2 + 1;
            if (i3 < c()) {
                T t = tArr[i3];
                ug0.c(t);
                T t2 = tArr[i2];
                ug0.c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    i2 = i3;
                }
            }
            T t3 = tArr[i];
            ug0.c(t3);
            T t4 = tArr[i2];
            ug0.c(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            m(i, i2);
            i = i2;
        }
    }

    public final void l(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            ug0.c(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            ug0.c(t);
            T t2 = tArr[i];
            ug0.c(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m(i, i2);
            i = i2;
        }
    }

    public final void m(int i, int i2) {
        T[] tArr = this.a;
        ug0.c(tArr);
        T t = tArr[i2];
        ug0.c(t);
        T t2 = tArr[i];
        ug0.c(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.e(i);
        t2.e(i2);
    }
}
