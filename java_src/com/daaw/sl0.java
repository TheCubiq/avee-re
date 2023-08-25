package com.daaw;
/* loaded from: classes.dex */
public class sl0<E> implements Cloneable {
    public static final Object t = new Object();
    public boolean p;
    public long[] q;
    public Object[] r;
    public int s;

    public sl0() {
        this(10);
    }

    public sl0(int i) {
        this.p = false;
        if (i == 0) {
            this.q = ck.b;
            this.r = ck.c;
            return;
        }
        int f = ck.f(i);
        this.q = new long[f];
        this.r = new Object[f];
    }

    public void a(long j, E e) {
        int i = this.s;
        if (i != 0 && j <= this.q[i - 1]) {
            k(j, e);
            return;
        }
        if (this.p && i >= this.q.length) {
            d();
        }
        int i2 = this.s;
        if (i2 >= this.q.length) {
            int f = ck.f(i2 + 1);
            long[] jArr = new long[f];
            Object[] objArr = new Object[f];
            long[] jArr2 = this.q;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.r;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.q = jArr;
            this.r = objArr;
        }
        this.q[i2] = j;
        this.r[i2] = e;
        this.s = i2 + 1;
    }

    public void b() {
        int i = this.s;
        Object[] objArr = this.r;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.s = 0;
        this.p = false;
    }

    /* renamed from: c */
    public sl0<E> clone() {
        try {
            sl0<E> sl0Var = (sl0) super.clone();
            sl0Var.q = (long[]) this.q.clone();
            sl0Var.r = (Object[]) this.r.clone();
            return sl0Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void d() {
        int i = this.s;
        long[] jArr = this.q;
        Object[] objArr = this.r;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != t) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.p = false;
        this.s = i2;
    }

    public E e(long j) {
        return f(j, null);
    }

    public E f(long j, E e) {
        int b = ck.b(this.q, this.s, j);
        if (b >= 0) {
            Object[] objArr = this.r;
            if (objArr[b] != t) {
                return (E) objArr[b];
            }
        }
        return e;
    }

    public int i(long j) {
        if (this.p) {
            d();
        }
        return ck.b(this.q, this.s, j);
    }

    public long j(int i) {
        if (this.p) {
            d();
        }
        return this.q[i];
    }

    public void k(long j, E e) {
        int b = ck.b(this.q, this.s, j);
        if (b >= 0) {
            this.r[b] = e;
            return;
        }
        int i = b ^ (-1);
        int i2 = this.s;
        if (i < i2) {
            Object[] objArr = this.r;
            if (objArr[i] == t) {
                this.q[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.p && i2 >= this.q.length) {
            d();
            i = ck.b(this.q, this.s, j) ^ (-1);
        }
        int i3 = this.s;
        if (i3 >= this.q.length) {
            int f = ck.f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.q;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.r;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.q = jArr;
            this.r = objArr2;
        }
        int i4 = this.s;
        if (i4 - i != 0) {
            long[] jArr3 = this.q;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.r;
            System.arraycopy(objArr4, i, objArr4, i5, this.s - i);
        }
        this.q[i] = j;
        this.r[i] = e;
        this.s++;
    }

    public void m(long j) {
        int b = ck.b(this.q, this.s, j);
        if (b >= 0) {
            Object[] objArr = this.r;
            Object obj = objArr[b];
            Object obj2 = t;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.p = true;
            }
        }
    }

    public void n(int i) {
        Object[] objArr = this.r;
        Object obj = objArr[i];
        Object obj2 = t;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.p = true;
        }
    }

    public int o() {
        if (this.p) {
            d();
        }
        return this.s;
    }

    public E p(int i) {
        if (this.p) {
            d();
        }
        return (E) this.r[i];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.s * 28);
        sb.append('{');
        for (int i = 0; i < this.s; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(j(i));
            sb.append('=');
            E p = p(i);
            if (p != this) {
                sb.append(p);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
