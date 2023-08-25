package com.daaw;
/* loaded from: classes.dex */
public class me1<E> implements Cloneable {

    /* renamed from: t */
    public static final Object f18836t = new Object();

    /* renamed from: p */
    public boolean f18837p;

    /* renamed from: q */
    public int[] f18838q;

    /* renamed from: r */
    public Object[] f18839r;

    /* renamed from: s */
    public int f18840s;

    public me1() {
        this(10);
    }

    public me1(int i) {
        this.f18837p = false;
        if (i == 0) {
            this.f18838q = C0957ck.f5884a;
            this.f18839r = C0957ck.f5886c;
            return;
        }
        int m25296e = C0957ck.m25296e(i);
        this.f18838q = new int[m25296e];
        this.f18839r = new Object[m25296e];
    }

    /* renamed from: a */
    public void m16060a(int i, E e) {
        int i2 = this.f18840s;
        if (i2 != 0 && i <= this.f18838q[i2 - 1]) {
            m16052k(i, e);
            return;
        }
        if (this.f18837p && i2 >= this.f18838q.length) {
            m16057d();
        }
        int i3 = this.f18840s;
        if (i3 >= this.f18838q.length) {
            int m25296e = C0957ck.m25296e(i3 + 1);
            int[] iArr = new int[m25296e];
            Object[] objArr = new Object[m25296e];
            int[] iArr2 = this.f18838q;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f18839r;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f18838q = iArr;
            this.f18839r = objArr;
        }
        this.f18838q[i3] = i;
        this.f18839r[i3] = e;
        this.f18840s = i3 + 1;
    }

    /* renamed from: b */
    public void m16059b() {
        int i = this.f18840s;
        Object[] objArr = this.f18839r;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f18840s = 0;
        this.f18837p = false;
    }

    /* renamed from: c */
    public me1<E> clone() {
        try {
            me1<E> me1Var = (me1) super.clone();
            me1Var.f18838q = (int[]) this.f18838q.clone();
            me1Var.f18839r = (Object[]) this.f18839r.clone();
            return me1Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public final void m16057d() {
        int i = this.f18840s;
        int[] iArr = this.f18838q;
        Object[] objArr = this.f18839r;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f18836t) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f18837p = false;
        this.f18840s = i2;
    }

    /* renamed from: e */
    public E m16056e(int i) {
        return m16055f(i, null);
    }

    /* renamed from: f */
    public E m16055f(int i, E e) {
        int m25300a = C0957ck.m25300a(this.f18838q, this.f18840s, i);
        if (m25300a >= 0) {
            Object[] objArr = this.f18839r;
            if (objArr[m25300a] != f18836t) {
                return (E) objArr[m25300a];
            }
        }
        return e;
    }

    /* renamed from: i */
    public int m16054i(E e) {
        if (this.f18837p) {
            m16057d();
        }
        for (int i = 0; i < this.f18840s; i++) {
            if (this.f18839r[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public int m16053j(int i) {
        if (this.f18837p) {
            m16057d();
        }
        return this.f18838q[i];
    }

    /* renamed from: k */
    public void m16052k(int i, E e) {
        int m25300a = C0957ck.m25300a(this.f18838q, this.f18840s, i);
        if (m25300a >= 0) {
            this.f18839r[m25300a] = e;
            return;
        }
        int i2 = m25300a ^ (-1);
        int i3 = this.f18840s;
        if (i2 < i3) {
            Object[] objArr = this.f18839r;
            if (objArr[i2] == f18836t) {
                this.f18838q[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f18837p && i3 >= this.f18838q.length) {
            m16057d();
            i2 = C0957ck.m25300a(this.f18838q, this.f18840s, i) ^ (-1);
        }
        int i4 = this.f18840s;
        if (i4 >= this.f18838q.length) {
            int m25296e = C0957ck.m25296e(i4 + 1);
            int[] iArr = new int[m25296e];
            Object[] objArr2 = new Object[m25296e];
            int[] iArr2 = this.f18838q;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f18839r;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f18838q = iArr;
            this.f18839r = objArr2;
        }
        int i5 = this.f18840s;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f18838q;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f18839r;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f18840s - i2);
        }
        this.f18838q[i2] = i;
        this.f18839r[i2] = e;
        this.f18840s++;
    }

    /* renamed from: m */
    public int m16051m() {
        if (this.f18837p) {
            m16057d();
        }
        return this.f18840s;
    }

    /* renamed from: n */
    public E m16050n(int i) {
        if (this.f18837p) {
            m16057d();
        }
        return (E) this.f18839r[i];
    }

    public String toString() {
        if (m16051m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f18840s * 28);
        sb.append('{');
        for (int i = 0; i < this.f18840s; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m16053j(i));
            sb.append('=');
            E m16050n = m16050n(i);
            if (m16050n != this) {
                sb.append(m16050n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
