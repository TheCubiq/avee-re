package com.daaw;

import com.daaw.av0;
import com.daaw.gq;
import java.lang.Exception;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public abstract class ed1<I extends gq, O extends av0, E extends Exception> implements eq<I, O, E> {
    public final Thread a;
    public final Object b = new Object();
    public final ArrayDeque<I> c = new ArrayDeque<>();
    public final ArrayDeque<O> d = new ArrayDeque<>();
    public final I[] e;
    public final O[] f;
    public int g;
    public int h;
    public I i;
    public E j;
    public boolean k;
    public boolean l;
    public int m;

    /* loaded from: classes.dex */
    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ed1.this.u();
        }
    }

    public ed1(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = h();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = i();
        }
        a aVar = new a();
        this.a = aVar;
        aVar.start();
    }

    @Override // com.daaw.eq
    public void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.daaw.eq
    public final void flush() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            I i = this.i;
            if (i != null) {
                r(i);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                r(this.c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                t(this.d.removeFirst());
            }
        }
    }

    public final boolean g() {
        return !this.c.isEmpty() && this.h > 0;
    }

    public abstract I h();

    public abstract O i();

    public abstract E j(Throwable th);

    public abstract E k(I i, O o, boolean z);

    public final boolean l() {
        synchronized (this.b) {
            while (!this.l && !g()) {
                this.b.wait();
            }
            if (this.l) {
                return false;
            }
            I removeFirst = this.c.removeFirst();
            O[] oArr = this.f;
            int i = this.h - 1;
            this.h = i;
            O o = oArr[i];
            boolean z = this.k;
            this.k = false;
            if (removeFirst.j()) {
                o.e(4);
            } else {
                if (removeFirst.i()) {
                    o.e(Integer.MIN_VALUE);
                }
                try {
                    this.j = k(removeFirst, o, z);
                } catch (OutOfMemoryError | RuntimeException e) {
                    this.j = j(e);
                }
                if (this.j != null) {
                    synchronized (this.b) {
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                if (!this.k) {
                    if (o.i()) {
                        this.m++;
                    } else {
                        o.r = this.m;
                        this.m = 0;
                        this.d.addLast(o);
                        r(removeFirst);
                    }
                }
                t(o);
                r(removeFirst);
            }
            return true;
        }
    }

    @Override // com.daaw.eq
    /* renamed from: m */
    public final I d() {
        I i;
        synchronized (this.b) {
            p();
            s6.f(this.i == null);
            int i2 = this.g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.e;
                int i3 = i2 - 1;
                this.g = i3;
                i = iArr[i3];
            }
            this.i = i;
        }
        return i;
    }

    @Override // com.daaw.eq
    /* renamed from: n */
    public final O c() {
        synchronized (this.b) {
            p();
            if (this.d.isEmpty()) {
                return null;
            }
            return this.d.removeFirst();
        }
    }

    public final void o() {
        if (g()) {
            this.b.notify();
        }
    }

    public final void p() {
        E e = this.j;
        if (e != null) {
            throw e;
        }
    }

    @Override // com.daaw.eq
    /* renamed from: q */
    public final void e(I i) {
        synchronized (this.b) {
            p();
            s6.a(i == this.i);
            this.c.addLast(i);
            o();
            this.i = null;
        }
    }

    public final void r(I i) {
        i.f();
        I[] iArr = this.e;
        int i2 = this.g;
        this.g = i2 + 1;
        iArr[i2] = i;
    }

    public void s(O o) {
        synchronized (this.b) {
            t(o);
            o();
        }
    }

    public final void t(O o) {
        o.f();
        O[] oArr = this.f;
        int i = this.h;
        this.h = i + 1;
        oArr[i] = o;
    }

    public final void u() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (l());
    }

    public final void v(int i) {
        s6.f(this.g == this.e.length);
        for (I i2 : this.e) {
            i2.n(i);
        }
    }
}
