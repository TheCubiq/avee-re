package com.daaw;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class yq7 implements Iterable, Serializable {

    /* renamed from: q */
    public static final yq7 f33966q = new uq7(vs7.f30560d);

    /* renamed from: r */
    public static final Comparator f33967r;

    /* renamed from: s */
    public static final xq7 f33968s;

    /* renamed from: p */
    public int f33969p = 0;

    static {
        int i = jq7.f15342a;
        f33968s = new xq7(null);
        f33967r = new pq7();
    }

    /* renamed from: A */
    public static int m3429A(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
            } else if (i2 < i) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
            }
        }
        return i4;
    }

    /* renamed from: D */
    public static vq7 m3426D() {
        return new vq7(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public static yq7 m3425E(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f33966q : m3412n(iterable.iterator(), size);
    }

    /* renamed from: F */
    public static yq7 m3424F(byte[] bArr) {
        return m3423G(bArr, 0, bArr.length);
    }

    /* renamed from: G */
    public static yq7 m3423G(byte[] bArr, int i, int i2) {
        m3429A(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new uq7(bArr2);
    }

    /* renamed from: H */
    public static yq7 m3422H(String str) {
        return new uq7(str.getBytes(vs7.f30558b));
    }

    /* renamed from: I */
    public static yq7 m3421I(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            yq7 m3423G = i2 == 0 ? null : m3423G(bArr, 0, i2);
            if (m3423G == null) {
                return m3425E(arrayList);
            }
            arrayList.add(m3423G);
            i = Math.min(i + i, 8192);
        }
    }

    /* renamed from: J */
    public static yq7 m3420J(byte[] bArr) {
        return new uq7(bArr);
    }

    /* renamed from: e */
    public static void m3418e(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    /* renamed from: n */
    public static yq7 m3412n(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (yq7) it.next();
            }
            int i2 = i >>> 1;
            yq7 m3412n = m3412n(it, i2);
            yq7 m3412n2 = m3412n(it, i - i2);
            if (Integer.MAX_VALUE - m3412n.mo3411o() >= m3412n2.mo3411o()) {
                return bv7.m25804L(m3412n, m3412n2);
            }
            int mo3411o = m3412n.mo3411o();
            int mo3411o2 = m3412n2.mo3411o();
            throw new IllegalArgumentException("ByteString would be too long: " + mo3411o + "+" + mo3411o2);
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    /* renamed from: B */
    public final int m3428B() {
        return this.f33969p;
    }

    @Override // java.lang.Iterable
    /* renamed from: C */
    public sq7 iterator() {
        return new oq7(this);
    }

    /* renamed from: d */
    public final String m3419d(Charset charset) {
        return mo3411o() == 0 ? "" : mo3403w(charset);
    }

    public abstract boolean equals(Object obj);

    @Deprecated
    /* renamed from: f */
    public final void m3417f(byte[] bArr, int i, int i2, int i3) {
        m3429A(0, i3, mo3411o());
        m3429A(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo3410p(bArr, 0, i2, i3);
        }
    }

    /* renamed from: h */
    public final boolean m3416h() {
        return mo3411o() == 0;
    }

    public final int hashCode() {
        int i = this.f33969p;
        if (i == 0) {
            int mo3411o = mo3411o();
            i = mo3407s(mo3411o, 0, mo3411o);
            if (i == 0) {
                i = 1;
            }
            this.f33969p = i;
        }
        return i;
    }

    /* renamed from: j */
    public final byte[] m3415j() {
        int mo3411o = mo3411o();
        if (mo3411o == 0) {
            return vs7.f30560d;
        }
        byte[] bArr = new byte[mo3411o];
        mo3410p(bArr, 0, 0, mo3411o);
        return bArr;
    }

    /* renamed from: k */
    public abstract byte mo3414k(int i);

    /* renamed from: m */
    public abstract byte mo3413m(int i);

    /* renamed from: o */
    public abstract int mo3411o();

    /* renamed from: p */
    public abstract void mo3410p(byte[] bArr, int i, int i2, int i3);

    /* renamed from: q */
    public abstract int mo3409q();

    /* renamed from: r */
    public abstract boolean mo3408r();

    /* renamed from: s */
    public abstract int mo3407s(int i, int i2, int i3);

    /* renamed from: t */
    public abstract int mo3406t(int i, int i2, int i3);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo3411o());
        objArr[2] = mo3411o() <= 50 ? rv7.m10875a(this) : rv7.m10875a(mo3405u(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: u */
    public abstract yq7 mo3405u(int i, int i2);

    /* renamed from: v */
    public abstract jr7 mo3404v();

    /* renamed from: w */
    public abstract String mo3403w(Charset charset);

    /* renamed from: x */
    public abstract ByteBuffer mo3402x();

    /* renamed from: y */
    public abstract void mo3401y(nq7 nq7Var);

    /* renamed from: z */
    public abstract boolean mo3400z();
}
