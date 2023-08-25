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
    public static final yq7 q = new uq7(vs7.d);
    public static final Comparator r;
    public static final xq7 s;
    public int p = 0;

    static {
        int i = jq7.a;
        s = new xq7(null);
        r = new pq7();
    }

    public static int A(int i, int i2, int i3) {
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

    public static vq7 D() {
        return new vq7(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yq7 E(Iterable iterable) {
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
        return size == 0 ? q : n(iterable.iterator(), size);
    }

    public static yq7 F(byte[] bArr) {
        return G(bArr, 0, bArr.length);
    }

    public static yq7 G(byte[] bArr, int i, int i2) {
        A(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new uq7(bArr2);
    }

    public static yq7 H(String str) {
        return new uq7(str.getBytes(vs7.b));
    }

    public static yq7 I(InputStream inputStream) {
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
            yq7 G = i2 == 0 ? null : G(bArr, 0, i2);
            if (G == null) {
                return E(arrayList);
            }
            arrayList.add(G);
            i = Math.min(i + i, 8192);
        }
    }

    public static yq7 J(byte[] bArr) {
        return new uq7(bArr);
    }

    public static void e(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    public static yq7 n(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (yq7) it.next();
            }
            int i2 = i >>> 1;
            yq7 n = n(it, i2);
            yq7 n2 = n(it, i - i2);
            if (Integer.MAX_VALUE - n.o() >= n2.o()) {
                return bv7.L(n, n2);
            }
            int o = n.o();
            int o2 = n2.o();
            throw new IllegalArgumentException("ByteString would be too long: " + o + "+" + o2);
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    public final int B() {
        return this.p;
    }

    @Override // java.lang.Iterable
    /* renamed from: C */
    public sq7 iterator() {
        return new oq7(this);
    }

    public final String d(Charset charset) {
        return o() == 0 ? "" : w(charset);
    }

    public abstract boolean equals(Object obj);

    @Deprecated
    public final void f(byte[] bArr, int i, int i2, int i3) {
        A(0, i3, o());
        A(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            p(bArr, 0, i2, i3);
        }
    }

    public final boolean h() {
        return o() == 0;
    }

    public final int hashCode() {
        int i = this.p;
        if (i == 0) {
            int o = o();
            i = s(o, 0, o);
            if (i == 0) {
                i = 1;
            }
            this.p = i;
        }
        return i;
    }

    public final byte[] j() {
        int o = o();
        if (o == 0) {
            return vs7.d;
        }
        byte[] bArr = new byte[o];
        p(bArr, 0, 0, o);
        return bArr;
    }

    public abstract byte k(int i);

    public abstract byte m(int i);

    public abstract int o();

    public abstract void p(byte[] bArr, int i, int i2, int i3);

    public abstract int q();

    public abstract boolean r();

    public abstract int s(int i, int i2, int i3);

    public abstract int t(int i, int i2, int i3);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(o());
        objArr[2] = o() <= 50 ? rv7.a(this) : rv7.a(u(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract yq7 u(int i, int i2);

    public abstract jr7 v();

    public abstract String w(Charset charset);

    public abstract ByteBuffer x();

    public abstract void y(nq7 nq7Var);

    public abstract boolean z();
}
