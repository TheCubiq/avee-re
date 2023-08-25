package com.daaw;
/* loaded from: classes.dex */
public class me1<E> implements Cloneable {
    public static final Object t = new Object();
    public boolean p;
    public int[] q;
    public Object[] r;
    public int s;

    public me1() {
        this(10);
    }

    public me1(int i) {
        this.p = false;
        if (i == 0) {
            this.q = ck.a;
            this.r = ck.c;
            return;
        }
        int e = ck.e(i);
        this.q = new int[e];
        this.r = new Object[e];
    }

    public void a(int i, E e) {
        int i2 = this.s;
        if (i2 != 0 && i <= this.q[i2 - 1]) {
            k(i, e);
            return;
        }
        if (this.p && i2 >= this.q.length) {
            d();
        }
        int i3 = this.s;
        if (i3 >= this.q.length) {
            int e2 = ck.e(i3 + 1);
            int[] iArr = new int[e2];
            Object[] objArr = new Object[e2];
            int[] iArr2 = this.q;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.r;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.q = iArr;
            this.r = objArr;
        }
        this.q[i3] = i;
        this.r[i3] = e;
        this.s = i3 + 1;
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
    public me1<E> clone() {
        try {
            me1<E> me1Var = (me1) super.clone();
            me1Var.q = (int[]) this.q.clone();
            me1Var.r = (Object[]) this.r.clone();
            return me1Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void d() {
        int i = this.s;
        int[] iArr = this.q;
        Object[] objArr = this.r;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != t) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.p = false;
        this.s = i2;
    }

    public E e(int i) {
        return f(i, null);
    }

    public E f(int i, E e) {
        int a = ck.a(this.q, this.s, i);
        if (a >= 0) {
            Object[] objArr = this.r;
            if (objArr[a] != t) {
                return (E) objArr[a];
            }
        }
        return e;
    }

    public int i(E e) {
        if (this.p) {
            d();
        }
        for (int i = 0; i < this.s; i++) {
            if (this.r[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int j(int i) {
        if (this.p) {
            d();
        }
        return this.q[i];
    }

    public void k(int i, E e) {
        int a = ck.a(this.q, this.s, i);
        if (a >= 0) {
            this.r[a] = e;
            return;
        }
        int i2 = a ^ (-1);
        int i3 = this.s;
        if (i2 < i3) {
            Object[] objArr = this.r;
            if (objArr[i2] == t) {
                this.q[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.p && i3 >= this.q.length) {
            d();
            i2 = ck.a(this.q, this.s, i) ^ (-1);
        }
        int i4 = this.s;
        if (i4 >= this.q.length) {
            int e2 = ck.e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.q;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.r;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.q = iArr;
            this.r = objArr2;
        }
        int i5 = this.s;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.q;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.r;
            System.arraycopy(objArr4, i2, objArr4, i6, this.s - i2);
        }
        this.q[i2] = i;
        this.r[i2] = e;
        this.s++;
    }

    public int m() {
        if (this.p) {
            d();
        }
        return this.s;
    }

    public E n(int i) {
        if (this.p) {
            d();
        }
        return (E) this.r[i];
    }

    public String toString() {
        if (m() <= 0) {
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
            E n = n(i);
            if (n != this) {
                sb.append(n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
