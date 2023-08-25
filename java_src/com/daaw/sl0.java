package com.daaw;
/* loaded from: classes.dex */
public class sl0<E> implements Cloneable {

    /* renamed from: t */
    public static final Object f26344t = new Object();

    /* renamed from: p */
    public boolean f26345p;

    /* renamed from: q */
    public long[] f26346q;

    /* renamed from: r */
    public Object[] f26347r;

    /* renamed from: s */
    public int f26348s;

    public sl0() {
        this(10);
    }

    public sl0(int i) {
        this.f26345p = false;
        if (i == 0) {
            this.f26346q = C0957ck.f5885b;
            this.f26347r = C0957ck.f5886c;
            return;
        }
        int m25295f = C0957ck.m25295f(i);
        this.f26346q = new long[m25295f];
        this.f26347r = new Object[m25295f];
    }

    /* renamed from: a */
    public void m10218a(long j, E e) {
        int i = this.f26348s;
        if (i != 0 && j <= this.f26346q[i - 1]) {
            m10210k(j, e);
            return;
        }
        if (this.f26345p && i >= this.f26346q.length) {
            m10215d();
        }
        int i2 = this.f26348s;
        if (i2 >= this.f26346q.length) {
            int m25295f = C0957ck.m25295f(i2 + 1);
            long[] jArr = new long[m25295f];
            Object[] objArr = new Object[m25295f];
            long[] jArr2 = this.f26346q;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f26347r;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f26346q = jArr;
            this.f26347r = objArr;
        }
        this.f26346q[i2] = j;
        this.f26347r[i2] = e;
        this.f26348s = i2 + 1;
    }

    /* renamed from: b */
    public void m10217b() {
        int i = this.f26348s;
        Object[] objArr = this.f26347r;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f26348s = 0;
        this.f26345p = false;
    }

    /* renamed from: c */
    public sl0<E> clone() {
        try {
            sl0<E> sl0Var = (sl0) super.clone();
            sl0Var.f26346q = (long[]) this.f26346q.clone();
            sl0Var.f26347r = (Object[]) this.f26347r.clone();
            return sl0Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public final void m10215d() {
        int i = this.f26348s;
        long[] jArr = this.f26346q;
        Object[] objArr = this.f26347r;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f26344t) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f26345p = false;
        this.f26348s = i2;
    }

    /* renamed from: e */
    public E m10214e(long j) {
        return m10213f(j, null);
    }

    /* renamed from: f */
    public E m10213f(long j, E e) {
        int m25299b = C0957ck.m25299b(this.f26346q, this.f26348s, j);
        if (m25299b >= 0) {
            Object[] objArr = this.f26347r;
            if (objArr[m25299b] != f26344t) {
                return (E) objArr[m25299b];
            }
        }
        return e;
    }

    /* renamed from: i */
    public int m10212i(long j) {
        if (this.f26345p) {
            m10215d();
        }
        return C0957ck.m25299b(this.f26346q, this.f26348s, j);
    }

    /* renamed from: j */
    public long m10211j(int i) {
        if (this.f26345p) {
            m10215d();
        }
        return this.f26346q[i];
    }

    /* renamed from: k */
    public void m10210k(long j, E e) {
        int m25299b = C0957ck.m25299b(this.f26346q, this.f26348s, j);
        if (m25299b >= 0) {
            this.f26347r[m25299b] = e;
            return;
        }
        int i = m25299b ^ (-1);
        int i2 = this.f26348s;
        if (i < i2) {
            Object[] objArr = this.f26347r;
            if (objArr[i] == f26344t) {
                this.f26346q[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f26345p && i2 >= this.f26346q.length) {
            m10215d();
            i = C0957ck.m25299b(this.f26346q, this.f26348s, j) ^ (-1);
        }
        int i3 = this.f26348s;
        if (i3 >= this.f26346q.length) {
            int m25295f = C0957ck.m25295f(i3 + 1);
            long[] jArr = new long[m25295f];
            Object[] objArr2 = new Object[m25295f];
            long[] jArr2 = this.f26346q;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f26347r;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f26346q = jArr;
            this.f26347r = objArr2;
        }
        int i4 = this.f26348s;
        if (i4 - i != 0) {
            long[] jArr3 = this.f26346q;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f26347r;
            System.arraycopy(objArr4, i, objArr4, i5, this.f26348s - i);
        }
        this.f26346q[i] = j;
        this.f26347r[i] = e;
        this.f26348s++;
    }

    /* renamed from: m */
    public void m10209m(long j) {
        int m25299b = C0957ck.m25299b(this.f26346q, this.f26348s, j);
        if (m25299b >= 0) {
            Object[] objArr = this.f26347r;
            Object obj = objArr[m25299b];
            Object obj2 = f26344t;
            if (obj != obj2) {
                objArr[m25299b] = obj2;
                this.f26345p = true;
            }
        }
    }

    /* renamed from: n */
    public void m10208n(int i) {
        Object[] objArr = this.f26347r;
        Object obj = objArr[i];
        Object obj2 = f26344t;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f26345p = true;
        }
    }

    /* renamed from: o */
    public int m10207o() {
        if (this.f26345p) {
            m10215d();
        }
        return this.f26348s;
    }

    /* renamed from: p */
    public E m10206p(int i) {
        if (this.f26345p) {
            m10215d();
        }
        return (E) this.f26347r[i];
    }

    public String toString() {
        if (m10207o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f26348s * 28);
        sb.append('{');
        for (int i = 0; i < this.f26348s; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m10211j(i));
            sb.append('=');
            E m10206p = m10206p(i);
            if (m10206p != this) {
                sb.append(m10206p);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
