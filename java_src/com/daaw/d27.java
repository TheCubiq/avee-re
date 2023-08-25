package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class d27 extends t17 implements Set {
    @CheckForNull

    /* renamed from: q */
    public transient y17 f6419q;

    /* renamed from: n */
    public static int m24765n(int i) {
        double d;
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            sy6.m9703f(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
            d = highestOneBit;
            Double.isNaN(d);
        } while (d * 0.7d < max);
        return highestOneBit;
    }

    /* renamed from: p */
    public static c27 m24764p(int i) {
        return new c27(i);
    }

    /* renamed from: r */
    public static d27 m24762r(Collection collection) {
        Object[] array = collection.toArray();
        return m24757x(array.length, array);
    }

    /* renamed from: s */
    public static d27 m24761s() {
        return s37.f25842x;
    }

    /* renamed from: t */
    public static d27 m24760t(Object obj) {
        return new z37(obj);
    }

    @SafeVarargs
    /* renamed from: u */
    public static d27 m24759u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return m24757x(12, objArr2);
    }

    /* renamed from: x */
    public static d27 m24757x(int i, Object... objArr) {
        if (i != 0) {
            if (i == 1) {
                Object obj = objArr[0];
                obj.getClass();
                return new z37(obj);
            }
            int m24765n = m24765n(i);
            Object[] objArr2 = new Object[m24765n];
            int i2 = m24765n - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj2 = objArr[i5];
                k37.m18059a(obj2, i5);
                int hashCode = obj2.hashCode();
                int m12804a = q17.m12804a(hashCode);
                while (true) {
                    int i6 = m12804a & i2;
                    Object obj3 = objArr2[i6];
                    if (obj3 == null) {
                        objArr[i4] = obj2;
                        objArr2[i6] = obj2;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj3.equals(obj2)) {
                        break;
                    } else {
                        m12804a++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                return new z37(obj4);
            } else if (m24765n(i4) < m24765n / 2) {
                return m24757x(i4, objArr);
            } else {
                if (m24756y(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new s37(objArr, i3, objArr2, i2, i4);
            }
        }
        return s37.f25842x;
    }

    /* renamed from: y */
    public static boolean m24756y(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof d27) && mo10726w() && ((d27) obj).mo10726w() && hashCode() != obj.hashCode()) {
            return false;
        }
        return y37.m4142c(this, obj);
    }

    @Override // com.daaw.t17
    /* renamed from: h */
    public y17 mo2849h() {
        y17 y17Var = this.f6419q;
        if (y17Var == null) {
            y17 mo10727o = mo10727o();
            this.f6419q = mo10727o;
            return mo10727o;
        }
        return y17Var;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return y37.m4144a(this);
    }

    @Override // com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: j */
    public abstract c47 iterator();

    /* renamed from: o */
    public y17 mo10727o() {
        return y17.m4265p(toArray());
    }

    /* renamed from: w */
    public boolean mo10726w() {
        return false;
    }
}
