package com.daaw;

import com.daaw.C1454gq;
import com.daaw.av0;
import java.lang.Exception;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public abstract class ed1<I extends C1454gq, O extends av0, E extends Exception> implements InterfaceC1211eq<I, O, E> {

    /* renamed from: a */
    public final Thread f8358a;

    /* renamed from: b */
    public final Object f8359b = new Object();

    /* renamed from: c */
    public final ArrayDeque<I> f8360c = new ArrayDeque<>();

    /* renamed from: d */
    public final ArrayDeque<O> f8361d = new ArrayDeque<>();

    /* renamed from: e */
    public final I[] f8362e;

    /* renamed from: f */
    public final O[] f8363f;

    /* renamed from: g */
    public int f8364g;

    /* renamed from: h */
    public int f8365h;

    /* renamed from: i */
    public I f8366i;

    /* renamed from: j */
    public E f8367j;

    /* renamed from: k */
    public boolean f8368k;

    /* renamed from: l */
    public boolean f8369l;

    /* renamed from: m */
    public int f8370m;

    /* renamed from: com.daaw.ed1$a */
    /* loaded from: classes.dex */
    public class C1178a extends Thread {
        public C1178a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ed1.this.m23558u();
        }
    }

    public ed1(I[] iArr, O[] oArr) {
        this.f8362e = iArr;
        this.f8364g = iArr.length;
        for (int i = 0; i < this.f8364g; i++) {
            this.f8362e[i] = mo18598h();
        }
        this.f8363f = oArr;
        this.f8365h = oArr.length;
        for (int i2 = 0; i2 < this.f8365h; i2++) {
            this.f8363f[i2] = mo18597i();
        }
        C1178a c1178a = new C1178a();
        this.f8358a = c1178a;
        c1178a.start();
    }

    @Override // com.daaw.InterfaceC1211eq
    /* renamed from: a */
    public void mo16074a() {
        synchronized (this.f8359b) {
            this.f8369l = true;
            this.f8359b.notify();
        }
        try {
            this.f8358a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.daaw.InterfaceC1211eq
    public final void flush() {
        synchronized (this.f8359b) {
            this.f8368k = true;
            this.f8370m = 0;
            I i = this.f8366i;
            if (i != null) {
                m23561r(i);
                this.f8366i = null;
            }
            while (!this.f8360c.isEmpty()) {
                m23561r(this.f8360c.removeFirst());
            }
            while (!this.f8361d.isEmpty()) {
                m23559t(this.f8361d.removeFirst());
            }
        }
    }

    /* renamed from: g */
    public final boolean m23568g() {
        return !this.f8360c.isEmpty() && this.f8365h > 0;
    }

    /* renamed from: h */
    public abstract I mo18598h();

    /* renamed from: i */
    public abstract O mo18597i();

    /* renamed from: j */
    public abstract E mo18596j(Throwable th);

    /* renamed from: k */
    public abstract E mo18595k(I i, O o, boolean z);

    /* renamed from: l */
    public final boolean m23567l() {
        synchronized (this.f8359b) {
            while (!this.f8369l && !m23568g()) {
                this.f8359b.wait();
            }
            if (this.f8369l) {
                return false;
            }
            I removeFirst = this.f8360c.removeFirst();
            O[] oArr = this.f8363f;
            int i = this.f8365h - 1;
            this.f8365h = i;
            O o = oArr[i];
            boolean z = this.f8368k;
            this.f8368k = false;
            if (removeFirst.m11437j()) {
                o.m11441e(4);
            } else {
                if (removeFirst.m11438i()) {
                    o.m11441e(Integer.MIN_VALUE);
                }
                try {
                    this.f8367j = mo18595k(removeFirst, o, z);
                } catch (OutOfMemoryError | RuntimeException e) {
                    this.f8367j = mo18596j(e);
                }
                if (this.f8367j != null) {
                    synchronized (this.f8359b) {
                    }
                    return false;
                }
            }
            synchronized (this.f8359b) {
                if (!this.f8368k) {
                    if (o.m11438i()) {
                        this.f8370m++;
                    } else {
                        o.f3672r = this.f8370m;
                        this.f8370m = 0;
                        this.f8361d.addLast(o);
                        m23561r(removeFirst);
                    }
                }
                m23559t(o);
                m23561r(removeFirst);
            }
            return true;
        }
    }

    @Override // com.daaw.InterfaceC1211eq
    /* renamed from: m */
    public final I mo16072d() {
        I i;
        synchronized (this.f8359b) {
            m23563p();
            C2914s6.m10685f(this.f8366i == null);
            int i2 = this.f8364g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f8362e;
                int i3 = i2 - 1;
                this.f8364g = i3;
                i = iArr[i3];
            }
            this.f8366i = i;
        }
        return i;
    }

    @Override // com.daaw.InterfaceC1211eq
    /* renamed from: n */
    public final O mo16073c() {
        synchronized (this.f8359b) {
            m23563p();
            if (this.f8361d.isEmpty()) {
                return null;
            }
            return this.f8361d.removeFirst();
        }
    }

    /* renamed from: o */
    public final void m23564o() {
        if (m23568g()) {
            this.f8359b.notify();
        }
    }

    /* renamed from: p */
    public final void m23563p() {
        E e = this.f8367j;
        if (e != null) {
            throw e;
        }
    }

    @Override // com.daaw.InterfaceC1211eq
    /* renamed from: q */
    public final void mo16071e(I i) {
        synchronized (this.f8359b) {
            m23563p();
            C2914s6.m10690a(i == this.f8366i);
            this.f8360c.addLast(i);
            m23564o();
            this.f8366i = null;
        }
    }

    /* renamed from: r */
    public final void m23561r(I i) {
        i.mo3749f();
        I[] iArr = this.f8362e;
        int i2 = this.f8364g;
        this.f8364g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: s */
    public void m23560s(O o) {
        synchronized (this.f8359b) {
            m23559t(o);
            m23564o();
        }
    }

    /* renamed from: t */
    public final void m23559t(O o) {
        o.mo3749f();
        O[] oArr = this.f8363f;
        int i = this.f8365h;
        this.f8365h = i + 1;
        oArr[i] = o;
    }

    /* renamed from: u */
    public final void m23558u() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m23567l());
    }

    /* renamed from: v */
    public final void m23557v(int i) {
        C2914s6.m10685f(this.f8364g == this.f8362e.length);
        for (I i2 : this.f8362e) {
            i2.m21351n(i);
        }
    }
}
