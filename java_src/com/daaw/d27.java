package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class d27 extends t17 implements Set {
    @CheckForNull
    public transient y17 q;

    public static int n(int i) {
        double d;
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            sy6.f(max < 1073741824, "collection too large");
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

    public static c27 p(int i) {
        return new c27(i);
    }

    public static d27 r(Collection collection) {
        Object[] array = collection.toArray();
        return x(array.length, array);
    }

    public static d27 s() {
        return s37.x;
    }

    public static d27 t(Object obj) {
        return new z37(obj);
    }

    @SafeVarargs
    public static d27 u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return x(12, objArr2);
    }

    public static d27 x(int i, Object... objArr) {
        if (i != 0) {
            if (i == 1) {
                Object obj = objArr[0];
                obj.getClass();
                return new z37(obj);
            }
            int n = n(i);
            Object[] objArr2 = new Object[n];
            int i2 = n - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj2 = objArr[i5];
                k37.a(obj2, i5);
                int hashCode = obj2.hashCode();
                int a = q17.a(hashCode);
                while (true) {
                    int i6 = a & i2;
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
                        a++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                return new z37(obj4);
            } else if (n(i4) < n / 2) {
                return x(i4, objArr);
            } else {
                if (y(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new s37(objArr, i3, objArr2, i2, i4);
            }
        }
        return s37.x;
    }

    public static boolean y(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof d27) && w() && ((d27) obj).w() && hashCode() != obj.hashCode()) {
            return false;
        }
        return y37.c(this, obj);
    }

    @Override // com.daaw.t17
    public y17 h() {
        y17 y17Var = this.q;
        if (y17Var == null) {
            y17 o = o();
            this.q = o;
            return o;
        }
        return y17Var;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return y37.a(this);
    }

    @Override // com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: j */
    public abstract c47 iterator();

    public y17 o() {
        return y17.p(toArray());
    }

    public boolean w() {
        return false;
    }
}
