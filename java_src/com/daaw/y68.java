package com.daaw;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes2.dex */
public abstract class y68 implements Iterable, Serializable {
    public static final y68 q = new p68(gb8.d);
    public static final Comparator r;
    public static final v68 s;
    public int p = 0;

    static {
        int i = b58.a;
        s = new v68(null);
        r = new t58();
    }

    public static int o(int i, int i2, int i3) {
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

    public static y68 q(byte[] bArr, int i, int i2) {
        o(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new p68(bArr2);
    }

    public static y68 r(String str) {
        return new p68(str.getBytes(gb8.b));
    }

    public abstract byte d(int i);

    public abstract byte e(int i);

    public abstract boolean equals(Object obj);

    public abstract int f();

    public abstract int h(int i, int i2, int i3);

    public final int hashCode() {
        int i = this.p;
        if (i == 0) {
            int f = f();
            i = h(f, 0, f);
            if (i == 0) {
                i = 1;
            }
            this.p = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new q58(this);
    }

    public abstract y68 j(int i, int i2);

    public abstract String k(Charset charset);

    public abstract void m(n58 n58Var);

    public abstract boolean n();

    public final int p() {
        return this.p;
    }

    public final String s(Charset charset) {
        return f() == 0 ? "" : k(charset);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(f());
        objArr[2] = f() <= 50 ? kg8.a(this) : kg8.a(j(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
