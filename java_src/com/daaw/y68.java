package com.daaw;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes2.dex */
public abstract class y68 implements Iterable, Serializable {

    /* renamed from: q */
    public static final y68 f33399q = new p68(gb8.f11019d);

    /* renamed from: r */
    public static final Comparator f33400r;

    /* renamed from: s */
    public static final v68 f33401s;

    /* renamed from: p */
    public int f33402p = 0;

    static {
        int i = b58.f4320a;
        f33401s = new v68(null);
        f33400r = new t58();
    }

    /* renamed from: o */
    public static int m4065o(int i, int i2, int i3) {
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

    /* renamed from: q */
    public static y68 m4063q(byte[] bArr, int i, int i2) {
        m4065o(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new p68(bArr2);
    }

    /* renamed from: r */
    public static y68 m4062r(String str) {
        return new p68(str.getBytes(gb8.f11017b));
    }

    /* renamed from: d */
    public abstract byte mo2807d(int i);

    /* renamed from: e */
    public abstract byte mo2806e(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo2805f();

    /* renamed from: h */
    public abstract int mo4070h(int i, int i2, int i3);

    public final int hashCode() {
        int i = this.f33402p;
        if (i == 0) {
            int mo2805f = mo2805f();
            i = mo4070h(mo2805f, 0, mo2805f);
            if (i == 0) {
                i = 1;
            }
            this.f33402p = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new q58(this);
    }

    /* renamed from: j */
    public abstract y68 mo4069j(int i, int i2);

    /* renamed from: k */
    public abstract String mo4068k(Charset charset);

    /* renamed from: m */
    public abstract void mo4067m(n58 n58Var);

    /* renamed from: n */
    public abstract boolean mo4066n();

    /* renamed from: p */
    public final int m4064p() {
        return this.f33402p;
    }

    /* renamed from: s */
    public final String m4061s(Charset charset) {
        return mo2805f() == 0 ? "" : mo4068k(charset);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo2805f());
        objArr[2] = mo2805f() <= 50 ? kg8.m17753a(this) : kg8.m17753a(mo4069j(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
