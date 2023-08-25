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

    /* renamed from: y */
    public static final Object f13180y = new Object();
    @CheckForNull

    /* renamed from: p */
    public transient Object f13181p;
    @CheckForNull

    /* renamed from: q */
    public transient int[] f13182q;
    @CheckForNull

    /* renamed from: r */
    public transient Object[] f13183r;
    @CheckForNull

    /* renamed from: s */
    public transient Object[] f13184s;

    /* renamed from: t */
    public transient int f13185t;

    /* renamed from: u */
    public transient int f13186u;
    @CheckForNull

    /* renamed from: v */
    public transient Set f13187v;
    @CheckForNull

    /* renamed from: w */
    public transient Set f13188w;
    @CheckForNull

    /* renamed from: x */
    public transient Collection f13189x;

    public i17(int i) {
        m20182q(8);
    }

    /* renamed from: d */
    public static /* synthetic */ int m20195d(i17 i17Var) {
        int i = i17Var.f13186u;
        i17Var.f13186u = i - 1;
        return i;
    }

    /* renamed from: i */
    public static /* synthetic */ Object m20190i(i17 i17Var, int i) {
        return i17Var.m20198a()[i];
    }

    /* renamed from: l */
    public static /* synthetic */ Object m20187l(i17 i17Var, int i) {
        return i17Var.m20197b()[i];
    }

    /* renamed from: m */
    public static /* synthetic */ Object m20186m(i17 i17Var) {
        Object obj = i17Var.f13181p;
        obj.getClass();
        return obj;
    }

    /* renamed from: o */
    public static /* synthetic */ void m20184o(i17 i17Var, int i, Object obj) {
        i17Var.m20197b()[i] = obj;
    }

    /* renamed from: A */
    public final void m20200A(int i) {
        this.f13185t = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f13185t & (-32));
    }

    /* renamed from: B */
    public final int[] m20199B() {
        int[] iArr = this.f13182q;
        iArr.getClass();
        return iArr;
    }

    /* renamed from: a */
    public final Object[] m20198a() {
        Object[] objArr = this.f13183r;
        objArr.getClass();
        return objArr;
    }

    /* renamed from: b */
    public final Object[] m20197b() {
        Object[] objArr = this.f13184s;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m20180s()) {
            return;
        }
        m20183p();
        Map m20185n = m20185n();
        if (m20185n != null) {
            this.f13185t = i47.m20125b(size(), 3, 1073741823);
            m20185n.clear();
            this.f13181p = null;
        } else {
            Arrays.fill(m20198a(), 0, this.f13186u, (Object) null);
            Arrays.fill(m20197b(), 0, this.f13186u, (Object) null);
            Object obj = this.f13181p;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(m20199B(), 0, this.f13186u, 0);
        }
        this.f13186u = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map m20185n = m20185n();
        return m20185n != null ? m20185n.containsKey(obj) : m20175x(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map m20185n = m20185n();
        if (m20185n == null) {
            for (int i = 0; i < this.f13186u; i++) {
                if (ky6.m17316a(obj, m20197b()[i])) {
                    return true;
                }
            }
            return false;
        }
        return m20185n.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f13188w;
        if (set == null) {
            q07 q07Var = new q07(this);
            this.f13188w = q07Var;
            return q07Var;
        }
        return set;
    }

    /* renamed from: g */
    public final int m20192g() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Map m20185n = m20185n();
        if (m20185n != null) {
            return m20185n.get(obj);
        }
        int m20175x = m20175x(obj);
        if (m20175x == -1) {
            return null;
        }
        return m20197b()[m20175x];
    }

    /* renamed from: h */
    public final int m20191h(int i) {
        int i2 = i + 1;
        if (i2 < this.f13186u) {
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
        Set set = this.f13187v;
        if (set == null) {
            f17 f17Var = new f17(this);
            this.f13187v = f17Var;
            return f17Var;
        }
        return set;
    }

    @CheckForNull
    /* renamed from: n */
    public final Map m20185n() {
        Object obj = this.f13181p;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: p */
    public final void m20183p() {
        this.f13185t += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        int length;
        int min;
        if (m20180s()) {
            sy6.m9700i(m20180s(), "Arrays already allocated");
            int i = this.f13185t;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f13181p = j17.m19164d(max2);
            m20200A(max2 - 1);
            this.f13182q = new int[i];
            this.f13183r = new Object[i];
            this.f13184s = new Object[i];
        }
        Map m20185n = m20185n();
        if (m20185n != null) {
            return m20185n.put(obj, obj2);
        }
        int[] m20199B = m20199B();
        Object[] m20198a = m20198a();
        Object[] m20197b = m20197b();
        int i2 = this.f13186u;
        int i3 = i2 + 1;
        int m12803b = q17.m12803b(obj);
        int m20176w = m20176w();
        int i4 = m12803b & m20176w;
        Object obj3 = this.f13181p;
        obj3.getClass();
        int m19165c = j17.m19165c(obj3, i4);
        if (m19165c == 0) {
            if (i3 <= m20176w) {
                Object obj4 = this.f13181p;
                obj4.getClass();
                j17.m19163e(obj4, i4, i3);
                length = m20199B().length;
                if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                    this.f13182q = Arrays.copyOf(m20199B(), min);
                    this.f13183r = Arrays.copyOf(m20198a(), min);
                    this.f13184s = Arrays.copyOf(m20197b(), min);
                }
                m20199B()[i2] = (m20176w ^ (-1)) & m12803b;
                m20198a()[i2] = obj;
                m20197b()[i2] = obj2;
                this.f13186u = i3;
                m20183p();
                return null;
            }
            m20176w = m20174y(m20176w, j17.m19167a(m20176w), m12803b, i2);
            length = m20199B().length;
            if (i3 > length) {
                this.f13182q = Arrays.copyOf(m20199B(), min);
                this.f13183r = Arrays.copyOf(m20198a(), min);
                this.f13184s = Arrays.copyOf(m20197b(), min);
            }
            m20199B()[i2] = (m20176w ^ (-1)) & m12803b;
            m20198a()[i2] = obj;
            m20197b()[i2] = obj2;
            this.f13186u = i3;
            m20183p();
            return null;
        }
        int i5 = m20176w ^ (-1);
        int i6 = m12803b & i5;
        int i7 = 0;
        while (true) {
            int i8 = m19165c - 1;
            int i9 = m20199B[i8];
            int i10 = i9 & i5;
            if (i10 == i6 && ky6.m17316a(obj, m20198a[i8])) {
                Object obj5 = m20197b[i8];
                m20197b[i8] = obj2;
                return obj5;
            }
            int i11 = i9 & m20176w;
            i7++;
            if (i11 != 0) {
                m19165c = i11;
            } else if (i7 >= 9) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(m20176w() + 1, 1.0f);
                int m20192g = m20192g();
                while (m20192g >= 0) {
                    linkedHashMap.put(m20198a()[m20192g], m20197b()[m20192g]);
                    m20192g = m20191h(m20192g);
                }
                this.f13181p = linkedHashMap;
                this.f13182q = null;
                this.f13183r = null;
                this.f13184s = null;
                m20183p();
                return linkedHashMap.put(obj, obj2);
            } else if (i3 <= m20176w) {
                m20199B[i8] = (i3 & m20176w) | i10;
            }
        }
    }

    /* renamed from: q */
    public final void m20182q(int i) {
        this.f13185t = i47.m20125b(8, 1, 1073741823);
    }

    /* renamed from: r */
    public final void m20181r(int i, int i2) {
        Object obj = this.f13181p;
        obj.getClass();
        int[] m20199B = m20199B();
        Object[] m20198a = m20198a();
        Object[] m20197b = m20197b();
        int size = size() - 1;
        if (i >= size) {
            m20198a[i] = null;
            m20197b[i] = null;
            m20199B[i] = 0;
            return;
        }
        Object obj2 = m20198a[size];
        m20198a[i] = obj2;
        m20197b[i] = m20197b[size];
        m20198a[size] = null;
        m20197b[size] = null;
        m20199B[i] = m20199B[size];
        m20199B[size] = 0;
        int m12803b = q17.m12803b(obj2) & i2;
        int m19165c = j17.m19165c(obj, m12803b);
        int i3 = size + 1;
        if (m19165c == i3) {
            j17.m19163e(obj, m12803b, i + 1);
            return;
        }
        while (true) {
            int i4 = m19165c - 1;
            int i5 = m20199B[i4];
            int i6 = i5 & i2;
            if (i6 == i3) {
                m20199B[i4] = ((i + 1) & i2) | (i5 & (i2 ^ (-1)));
                return;
            }
            m19165c = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        Map m20185n = m20185n();
        if (m20185n != null) {
            return m20185n.remove(obj);
        }
        Object m20173z = m20173z(obj);
        if (m20173z == f13180y) {
            return null;
        }
        return m20173z;
    }

    /* renamed from: s */
    public final boolean m20180s() {
        return this.f13181p == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map m20185n = m20185n();
        return m20185n != null ? m20185n.size() : this.f13186u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f13189x;
        if (collection == null) {
            h17 h17Var = new h17(this);
            this.f13189x = h17Var;
            return h17Var;
        }
        return collection;
    }

    /* renamed from: w */
    public final int m20176w() {
        return (1 << (this.f13185t & 31)) - 1;
    }

    /* renamed from: x */
    public final int m20175x(@CheckForNull Object obj) {
        if (m20180s()) {
            return -1;
        }
        int m12803b = q17.m12803b(obj);
        int m20176w = m20176w();
        Object obj2 = this.f13181p;
        obj2.getClass();
        int m19165c = j17.m19165c(obj2, m12803b & m20176w);
        if (m19165c != 0) {
            int i = m20176w ^ (-1);
            int i2 = m12803b & i;
            do {
                int i3 = m19165c - 1;
                int i4 = m20199B()[i3];
                if ((i4 & i) == i2 && ky6.m17316a(obj, m20198a()[i3])) {
                    return i3;
                }
                m19165c = i4 & m20176w;
            } while (m19165c != 0);
            return -1;
        }
        return -1;
    }

    /* renamed from: y */
    public final int m20174y(int i, int i2, int i3, int i4) {
        Object m19164d = j17.m19164d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            j17.m19163e(m19164d, i3 & i5, i4 + 1);
        }
        Object obj = this.f13181p;
        obj.getClass();
        int[] m20199B = m20199B();
        for (int i6 = 0; i6 <= i; i6++) {
            int m19165c = j17.m19165c(obj, i6);
            while (m19165c != 0) {
                int i7 = m19165c - 1;
                int i8 = m20199B[i7];
                int i9 = ((i ^ (-1)) & i8) | i6;
                int i10 = i9 & i5;
                int m19165c2 = j17.m19165c(m19164d, i10);
                j17.m19163e(m19164d, i10, m19165c);
                m20199B[i7] = ((i5 ^ (-1)) & i9) | (m19165c2 & i5);
                m19165c = i8 & i;
            }
        }
        this.f13181p = m19164d;
        m20200A(i5);
        return i5;
    }

    /* renamed from: z */
    public final Object m20173z(@CheckForNull Object obj) {
        if (m20180s()) {
            return f13180y;
        }
        int m20176w = m20176w();
        Object obj2 = this.f13181p;
        obj2.getClass();
        int m19166b = j17.m19166b(obj, null, m20176w, obj2, m20199B(), m20198a(), null);
        if (m19166b == -1) {
            return f13180y;
        }
        Object obj3 = m20197b()[m19166b];
        m20181r(m19166b, m20176w);
        this.f13186u--;
        m20183p();
        return obj3;
    }
}
