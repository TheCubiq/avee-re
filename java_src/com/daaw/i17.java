package com.daaw;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class i17 extends AbstractMap implements Serializable {
    public static final Object y = new Object();
    @CheckForNull
    public transient Object p;
    @CheckForNull
    public transient int[] q;
    @CheckForNull
    public transient Object[] r;
    @CheckForNull
    public transient Object[] s;
    public transient int t;
    public transient int u;
    @CheckForNull
    public transient Set v;
    @CheckForNull
    public transient Set w;
    @CheckForNull
    public transient Collection x;

    public i17(int i) {
        q(8);
    }

    public static /* synthetic */ int d(i17 i17Var) {
        int i = i17Var.u;
        i17Var.u = i - 1;
        return i;
    }

    public static /* synthetic */ Object i(i17 i17Var, int i) {
        return i17Var.a()[i];
    }

    public static /* synthetic */ Object l(i17 i17Var, int i) {
        return i17Var.b()[i];
    }

    public static /* synthetic */ Object m(i17 i17Var) {
        Object obj = i17Var.p;
        obj.getClass();
        return obj;
    }

    public static /* synthetic */ void o(i17 i17Var, int i, Object obj) {
        i17Var.b()[i] = obj;
    }

    public final void A(int i) {
        this.t = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.t & (-32));
    }

    public final int[] B() {
        int[] iArr = this.q;
        iArr.getClass();
        return iArr;
    }

    public final Object[] a() {
        Object[] objArr = this.r;
        objArr.getClass();
        return objArr;
    }

    public final Object[] b() {
        Object[] objArr = this.s;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (s()) {
            return;
        }
        p();
        Map n = n();
        if (n != null) {
            this.t = i47.b(size(), 3, 1073741823);
            n.clear();
            this.p = null;
        } else {
            Arrays.fill(a(), 0, this.u, (Object) null);
            Arrays.fill(b(), 0, this.u, (Object) null);
            Object obj = this.p;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(B(), 0, this.u, 0);
        }
        this.u = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map n = n();
        return n != null ? n.containsKey(obj) : x(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map n = n();
        if (n == null) {
            for (int i = 0; i < this.u; i++) {
                if (ky6.a(obj, b()[i])) {
                    return true;
                }
            }
            return false;
        }
        return n.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.w;
        if (set == null) {
            q07 q07Var = new q07(this);
            this.w = q07Var;
            return q07Var;
        }
        return set;
    }

    public final int g() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Map n = n();
        if (n != null) {
            return n.get(obj);
        }
        int x = x(obj);
        if (x == -1) {
            return null;
        }
        return b()[x];
    }

    public final int h(int i) {
        int i2 = i + 1;
        if (i2 < this.u) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.v;
        if (set == null) {
            f17 f17Var = new f17(this);
            this.v = f17Var;
            return f17Var;
        }
        return set;
    }

    @CheckForNull
    public final Map n() {
        Object obj = this.p;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void p() {
        this.t += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        int length;
        int min;
        if (s()) {
            sy6.i(s(), "Arrays already allocated");
            int i = this.t;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.p = j17.d(max2);
            A(max2 - 1);
            this.q = new int[i];
            this.r = new Object[i];
            this.s = new Object[i];
        }
        Map n = n();
        if (n != null) {
            return n.put(obj, obj2);
        }
        int[] B = B();
        Object[] a = a();
        Object[] b = b();
        int i2 = this.u;
        int i3 = i2 + 1;
        int b2 = q17.b(obj);
        int w = w();
        int i4 = b2 & w;
        Object obj3 = this.p;
        obj3.getClass();
        int c = j17.c(obj3, i4);
        if (c == 0) {
            if (i3 <= w) {
                Object obj4 = this.p;
                obj4.getClass();
                j17.e(obj4, i4, i3);
                length = B().length;
                if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                    this.q = Arrays.copyOf(B(), min);
                    this.r = Arrays.copyOf(a(), min);
                    this.s = Arrays.copyOf(b(), min);
                }
                B()[i2] = (w ^ (-1)) & b2;
                a()[i2] = obj;
                b()[i2] = obj2;
                this.u = i3;
                p();
                return null;
            }
            w = y(w, j17.a(w), b2, i2);
            length = B().length;
            if (i3 > length) {
                this.q = Arrays.copyOf(B(), min);
                this.r = Arrays.copyOf(a(), min);
                this.s = Arrays.copyOf(b(), min);
            }
            B()[i2] = (w ^ (-1)) & b2;
            a()[i2] = obj;
            b()[i2] = obj2;
            this.u = i3;
            p();
            return null;
        }
        int i5 = w ^ (-1);
        int i6 = b2 & i5;
        int i7 = 0;
        while (true) {
            int i8 = c - 1;
            int i9 = B[i8];
            int i10 = i9 & i5;
            if (i10 == i6 && ky6.a(obj, a[i8])) {
                Object obj5 = b[i8];
                b[i8] = obj2;
                return obj5;
            }
            int i11 = i9 & w;
            i7++;
            if (i11 != 0) {
                c = i11;
            } else if (i7 >= 9) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(w() + 1, 1.0f);
                int g = g();
                while (g >= 0) {
                    linkedHashMap.put(a()[g], b()[g]);
                    g = h(g);
                }
                this.p = linkedHashMap;
                this.q = null;
                this.r = null;
                this.s = null;
                p();
                return linkedHashMap.put(obj, obj2);
            } else if (i3 <= w) {
                B[i8] = (i3 & w) | i10;
            }
        }
    }

    public final void q(int i) {
        this.t = i47.b(8, 1, 1073741823);
    }

    public final void r(int i, int i2) {
        Object obj = this.p;
        obj.getClass();
        int[] B = B();
        Object[] a = a();
        Object[] b = b();
        int size = size() - 1;
        if (i >= size) {
            a[i] = null;
            b[i] = null;
            B[i] = 0;
            return;
        }
        Object obj2 = a[size];
        a[i] = obj2;
        b[i] = b[size];
        a[size] = null;
        b[size] = null;
        B[i] = B[size];
        B[size] = 0;
        int b2 = q17.b(obj2) & i2;
        int c = j17.c(obj, b2);
        int i3 = size + 1;
        if (c == i3) {
            j17.e(obj, b2, i + 1);
            return;
        }
        while (true) {
            int i4 = c - 1;
            int i5 = B[i4];
            int i6 = i5 & i2;
            if (i6 == i3) {
                B[i4] = ((i + 1) & i2) | (i5 & (i2 ^ (-1)));
                return;
            }
            c = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        Map n = n();
        if (n != null) {
            return n.remove(obj);
        }
        Object z = z(obj);
        if (z == y) {
            return null;
        }
        return z;
    }

    public final boolean s() {
        return this.p == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map n = n();
        return n != null ? n.size() : this.u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.x;
        if (collection == null) {
            h17 h17Var = new h17(this);
            this.x = h17Var;
            return h17Var;
        }
        return collection;
    }

    public final int w() {
        return (1 << (this.t & 31)) - 1;
    }

    public final int x(@CheckForNull Object obj) {
        if (s()) {
            return -1;
        }
        int b = q17.b(obj);
        int w = w();
        Object obj2 = this.p;
        obj2.getClass();
        int c = j17.c(obj2, b & w);
        if (c != 0) {
            int i = w ^ (-1);
            int i2 = b & i;
            do {
                int i3 = c - 1;
                int i4 = B()[i3];
                if ((i4 & i) == i2 && ky6.a(obj, a()[i3])) {
                    return i3;
                }
                c = i4 & w;
            } while (c != 0);
            return -1;
        }
        return -1;
    }

    public final int y(int i, int i2, int i3, int i4) {
        Object d = j17.d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            j17.e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.p;
        obj.getClass();
        int[] B = B();
        for (int i6 = 0; i6 <= i; i6++) {
            int c = j17.c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = B[i7];
                int i9 = ((i ^ (-1)) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = j17.c(d, i10);
                j17.e(d, i10, c);
                B[i7] = ((i5 ^ (-1)) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.p = d;
        A(i5);
        return i5;
    }

    public final Object z(@CheckForNull Object obj) {
        if (s()) {
            return y;
        }
        int w = w();
        Object obj2 = this.p;
        obj2.getClass();
        int b = j17.b(obj, null, w, obj2, B(), a(), null);
        if (b == -1) {
            return y;
        }
        Object obj3 = b()[b];
        r(b, w);
        this.u--;
        p();
        return obj3;
    }
}
