package com.daaw;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class au7<T> implements cv7<T> {
    public static final int[] q = new int[0];
    public static final Unsafe r = gw7.q();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final xt7 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final lt7 l;
    public final tv7 m;
    public final wr7 n;
    public final cu7 o;
    public final st7 p;

    public au7(int[] iArr, Object[] objArr, int i, int i2, xt7 xt7Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, cu7 cu7Var, lt7 lt7Var, tv7 tv7Var, wr7 wr7Var, st7 st7Var, byte[] bArr) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = xt7Var instanceof ls7;
        this.h = z;
        boolean z3 = false;
        if (wr7Var != null && wr7Var.h(xt7Var)) {
            z3 = true;
        }
        this.f = z3;
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.o = cu7Var;
        this.l = lt7Var;
        this.m = tv7Var;
        this.n = wr7Var;
        this.e = xt7Var;
        this.p = st7Var;
    }

    public static boolean C(int i) {
        return (i & 536870912) != 0;
    }

    public static boolean F(Object obj, int i, cv7 cv7Var) {
        return cv7Var.c(gw7.p(obj, i & 1048575));
    }

    public static boolean G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ls7) {
            return ((ls7) obj).F();
        }
        return true;
    }

    public static boolean I(Object obj, long j) {
        return ((Boolean) gw7.p(obj, j)).booleanValue();
    }

    public static final void L(int i, Object obj, rr7 rr7Var) {
        if (obj instanceof String) {
            rr7Var.f(i, (String) obj);
        } else {
            rr7Var.o(i, (yq7) obj);
        }
    }

    public static uv7 N(Object obj) {
        ls7 ls7Var = (ls7) obj;
        uv7 uv7Var = ls7Var.zzc;
        if (uv7Var == uv7.c()) {
            uv7 f = uv7.f();
            ls7Var.zzc = f;
            return f;
        }
        return uv7Var;
    }

    public static au7 O(Class cls, ut7 ut7Var, cu7 cu7Var, lt7 lt7Var, tv7 tv7Var, wr7 wr7Var, st7 st7Var) {
        if (ut7Var instanceof hu7) {
            return P((hu7) ut7Var, cu7Var, lt7Var, tv7Var, wr7Var, st7Var);
        }
        qv7 qv7Var = (qv7) ut7Var;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.daaw.au7 P(com.daaw.hu7 r34, com.daaw.cu7 r35, com.daaw.lt7 r36, com.daaw.tv7 r37, com.daaw.wr7 r38, com.daaw.st7 r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.au7.P(com.daaw.hu7, com.daaw.cu7, com.daaw.lt7, com.daaw.tv7, com.daaw.wr7, com.daaw.st7):com.daaw.au7");
    }

    public static double Q(Object obj, long j) {
        return ((Double) gw7.p(obj, j)).doubleValue();
    }

    public static float R(Object obj, long j) {
        return ((Float) gw7.p(obj, j)).floatValue();
    }

    public static int U(Object obj, long j) {
        return ((Integer) gw7.p(obj, j)).intValue();
    }

    public static int j(int i) {
        return (i >>> 20) & 255;
    }

    public static long l(Object obj, long j) {
        return ((Long) gw7.p(obj, j)).longValue();
    }

    public static Field s(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static void t(Object obj) {
        if (!G(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public final void A(Object obj, int i, int i2, Object obj2) {
        r.putObject(obj, k(i2) & 1048575, obj2);
        y(obj, i, i2);
    }

    public final boolean B(Object obj, Object obj2, int i) {
        return D(obj, i) == D(obj2, i);
    }

    public final boolean D(Object obj, int i) {
        int b0 = b0(i);
        long j = b0 & 1048575;
        if (j != 1048575) {
            return (gw7.l(obj, j) & (1 << (b0 >>> 20))) != 0;
        }
        int k = k(i);
        long j2 = k & 1048575;
        switch (j(k)) {
            case 0:
                return Double.doubleToRawLongBits(gw7.j(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(gw7.k(obj, j2)) != 0;
            case 2:
                return gw7.n(obj, j2) != 0;
            case 3:
                return gw7.n(obj, j2) != 0;
            case 4:
                return gw7.l(obj, j2) != 0;
            case 5:
                return gw7.n(obj, j2) != 0;
            case 6:
                return gw7.l(obj, j2) != 0;
            case 7:
                return gw7.H(obj, j2);
            case 8:
                Object p = gw7.p(obj, j2);
                if (p instanceof String) {
                    return !((String) p).isEmpty();
                } else if (p instanceof yq7) {
                    return !yq7.q.equals(p);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return gw7.p(obj, j2) != null;
            case 10:
                return !yq7.q.equals(gw7.p(obj, j2));
            case 11:
                return gw7.l(obj, j2) != 0;
            case 12:
                return gw7.l(obj, j2) != 0;
            case 13:
                return gw7.l(obj, j2) != 0;
            case 14:
                return gw7.n(obj, j2) != 0;
            case 15:
                return gw7.l(obj, j2) != 0;
            case 16:
                return gw7.n(obj, j2) != 0;
            case 17:
                return gw7.p(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean E(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? D(obj, i) : (i3 & i4) != 0;
    }

    public final boolean H(Object obj, int i, int i2) {
        return gw7.l(obj, (long) (b0(i2) & 1048575)) == i;
    }

    public final void J(Object obj, rr7 rr7Var) {
        int i;
        if (this.f) {
            this.n.a(obj);
            throw null;
        }
        int length = this.a.length;
        Unsafe unsafe = r;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < length) {
            int k = k(i3);
            int[] iArr = this.a;
            int i6 = iArr[i3];
            int j = j(k);
            if (j <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i5) {
                    i4 = unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j2 = k & i2;
            switch (j) {
                case 0:
                    if ((i4 & i) != 0) {
                        rr7Var.q(i6, gw7.j(obj, j2));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 1:
                    if ((i4 & i) != 0) {
                        rr7Var.z(i6, gw7.k(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 2:
                    if ((i4 & i) != 0) {
                        rr7Var.E(i6, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 3:
                    if ((i4 & i) != 0) {
                        rr7Var.j(i6, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 4:
                    if ((i4 & i) != 0) {
                        rr7Var.C(i6, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 5:
                    if ((i4 & i) != 0) {
                        rr7Var.x(i6, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 6:
                    if ((i4 & i) != 0) {
                        rr7Var.v(i6, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 7:
                    if ((i4 & i) != 0) {
                        rr7Var.m(i6, gw7.H(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 8:
                    if ((i4 & i) != 0) {
                        L(i6, unsafe.getObject(obj, j2), rr7Var);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 9:
                    if ((i4 & i) != 0) {
                        rr7Var.G(i6, unsafe.getObject(obj, j2), n(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 10:
                    if ((i4 & i) != 0) {
                        rr7Var.o(i6, (yq7) unsafe.getObject(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 11:
                    if ((i4 & i) != 0) {
                        rr7Var.h(i6, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 12:
                    if ((i4 & i) != 0) {
                        rr7Var.t(i6, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 13:
                    if ((i4 & i) != 0) {
                        rr7Var.H(i6, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 14:
                    if ((i4 & i) != 0) {
                        rr7Var.J(i6, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 15:
                    if ((i4 & i) != 0) {
                        rr7Var.a(i6, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 16:
                    if ((i4 & i) != 0) {
                        rr7Var.c(i6, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 17:
                    if ((i4 & i) != 0) {
                        rr7Var.B(i6, unsafe.getObject(obj, j2), n(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 18:
                    ev7.l(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 19:
                    ev7.p(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 20:
                    ev7.s(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 21:
                    ev7.B(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 22:
                    ev7.r(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 23:
                    ev7.o(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 24:
                    ev7.n(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 25:
                    ev7.j(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 26:
                    ev7.y(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var);
                    break;
                case 27:
                    ev7.t(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, n(i3));
                    break;
                case 28:
                    ev7.k(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var);
                    break;
                case 29:
                    ev7.z(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    break;
                case 30:
                    ev7.m(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    break;
                case 31:
                    ev7.u(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    break;
                case 32:
                    ev7.v(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    break;
                case 33:
                    ev7.w(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    break;
                case 34:
                    ev7.x(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, false);
                    break;
                case 35:
                    ev7.l(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 36:
                    ev7.p(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 37:
                    ev7.s(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 38:
                    ev7.B(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 39:
                    ev7.r(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 40:
                    ev7.o(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 41:
                    ev7.n(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 42:
                    ev7.j(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 43:
                    ev7.z(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 44:
                    ev7.m(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 45:
                    ev7.u(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 46:
                    ev7.v(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 47:
                    ev7.w(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 48:
                    ev7.x(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, true);
                    break;
                case 49:
                    ev7.q(this.a[i3], (List) unsafe.getObject(obj, j2), rr7Var, n(i3));
                    break;
                case 50:
                    K(rr7Var, i6, unsafe.getObject(obj, j2), i3);
                    break;
                case 51:
                    if (H(obj, i6, i3)) {
                        rr7Var.q(i6, Q(obj, j2));
                        break;
                    }
                    break;
                case 52:
                    if (H(obj, i6, i3)) {
                        rr7Var.z(i6, R(obj, j2));
                        break;
                    }
                    break;
                case 53:
                    if (H(obj, i6, i3)) {
                        rr7Var.E(i6, l(obj, j2));
                        break;
                    }
                    break;
                case 54:
                    if (H(obj, i6, i3)) {
                        rr7Var.j(i6, l(obj, j2));
                        break;
                    }
                    break;
                case 55:
                    if (H(obj, i6, i3)) {
                        rr7Var.C(i6, U(obj, j2));
                        break;
                    }
                    break;
                case 56:
                    if (H(obj, i6, i3)) {
                        rr7Var.x(i6, l(obj, j2));
                        break;
                    }
                    break;
                case 57:
                    if (H(obj, i6, i3)) {
                        rr7Var.v(i6, U(obj, j2));
                        break;
                    }
                    break;
                case 58:
                    if (H(obj, i6, i3)) {
                        rr7Var.m(i6, I(obj, j2));
                        break;
                    }
                    break;
                case 59:
                    if (H(obj, i6, i3)) {
                        L(i6, unsafe.getObject(obj, j2), rr7Var);
                        break;
                    }
                    break;
                case 60:
                    if (H(obj, i6, i3)) {
                        rr7Var.G(i6, unsafe.getObject(obj, j2), n(i3));
                        break;
                    }
                    break;
                case 61:
                    if (H(obj, i6, i3)) {
                        rr7Var.o(i6, (yq7) unsafe.getObject(obj, j2));
                        break;
                    }
                    break;
                case 62:
                    if (H(obj, i6, i3)) {
                        rr7Var.h(i6, U(obj, j2));
                        break;
                    }
                    break;
                case 63:
                    if (H(obj, i6, i3)) {
                        rr7Var.t(i6, U(obj, j2));
                        break;
                    }
                    break;
                case 64:
                    if (H(obj, i6, i3)) {
                        rr7Var.H(i6, U(obj, j2));
                        break;
                    }
                    break;
                case 65:
                    if (H(obj, i6, i3)) {
                        rr7Var.J(i6, l(obj, j2));
                        break;
                    }
                    break;
                case 66:
                    if (H(obj, i6, i3)) {
                        rr7Var.a(i6, U(obj, j2));
                        break;
                    }
                    break;
                case 67:
                    if (H(obj, i6, i3)) {
                        rr7Var.c(i6, l(obj, j2));
                        break;
                    }
                    break;
                case 68:
                    if (H(obj, i6, i3)) {
                        rr7Var.B(i6, unsafe.getObject(obj, j2), n(i3));
                        break;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        tv7 tv7Var = this.m;
        tv7Var.r(tv7Var.d(obj), rr7Var);
    }

    public final void K(rr7 rr7Var, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        qt7 qt7Var = (qt7) p(i2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x041f, code lost:
        if (r0 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0421, code lost:
        r27.putInt(r12, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0427, code lost:
        r10 = r9.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x042c, code lost:
        if (r10 >= r9.k) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x042e, code lost:
        o(r29, r9.i[r10], null, r9.m, r29);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0443, code lost:
        if (r7 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0445, code lost:
        if (r6 != r32) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x044c, code lost:
        throw com.daaw.xs7.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x044d, code lost:
        if (r6 > r32) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x044f, code lost:
        if (r8 != r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0451, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0457, code lost:
        throw com.daaw.xs7.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int M(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.daaw.kq7 r34) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.au7.M(java.lang.Object, byte[], int, int, int, com.daaw.kq7):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x020e, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x021b, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0228, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0235, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0242, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x024f, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0251, code lost:
        r4 = com.daaw.qr7.e(r11) + com.daaw.qr7.f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (H(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (H(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
        if (H(r17, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
        if (H(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
        if (H(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
        if (H(r17, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012a, code lost:
        r3 = U(r17, r3);
        r4 = com.daaw.qr7.f(r11 << 3);
        r3 = com.daaw.qr7.G(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013e, code lost:
        if (H(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
        if (H(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
        r6 = r6 + (com.daaw.qr7.f(r11 << 3) + com.daaw.qr7.g(l(r17, r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015d, code lost:
        if (H(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
        r3 = com.daaw.qr7.f(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016d, code lost:
        if (H(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016f, code lost:
        r3 = com.daaw.qr7.f(r11 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a0, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ae, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bc, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ca, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d8, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e6, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f4, code lost:
        if (r3 > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0201, code lost:
        if (r3 > 0) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int S(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.au7.S(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x030e, code lost:
        if ((r4 instanceof com.daaw.yq7) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0311, code lost:
        r5 = com.daaw.qr7.f(r6 << 3);
        r4 = com.daaw.qr7.d((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
        if ((r4 instanceof com.daaw.yq7) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int T(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.au7.T(java.lang.Object):int");
    }

    public final int V(Object obj, byte[] bArr, int i, int i2, int i3, long j, kq7 kq7Var) {
        Unsafe unsafe = r;
        Object p = p(i3);
        Object object = unsafe.getObject(obj, j);
        if (st7.b(object)) {
            rt7 b = rt7.a().b();
            st7.c(b, object);
            unsafe.putObject(obj, j, b);
        }
        qt7 qt7Var = (qt7) p;
        throw null;
    }

    public final int W(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, kq7 kq7Var) {
        Unsafe unsafe = r;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(lq7.p(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(lq7.b(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m = lq7.m(bArr, i, kq7Var);
                    unsafe.putObject(obj, j, Long.valueOf(kq7Var.b));
                    unsafe.putInt(obj, j2, i4);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int j3 = lq7.j(bArr, i, kq7Var);
                    unsafe.putObject(obj, j, Integer.valueOf(kq7Var.a));
                    unsafe.putInt(obj, j2, i4);
                    return j3;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(lq7.p(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(lq7.b(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m2 = lq7.m(bArr, i, kq7Var);
                    unsafe.putObject(obj, j, Boolean.valueOf(kq7Var.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int j4 = lq7.j(bArr, i, kq7Var);
                    int i9 = kq7Var.a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !lw7.j(bArr, j4, j4 + i9)) {
                        throw xs7.d();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, j4, i9, vs7.b));
                        j4 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return j4;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object r2 = r(obj, i4, i8);
                    int o = lq7.o(r2, n(i8), bArr, i, i2, kq7Var);
                    A(obj, i4, i8, r2);
                    return o;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int a = lq7.a(bArr, i, kq7Var);
                    unsafe.putObject(obj, j, kq7Var.c);
                    unsafe.putInt(obj, j2, i4);
                    return a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int j5 = lq7.j(bArr, i, kq7Var);
                    int i10 = kq7Var.a;
                    ps7 m3 = m(i8);
                    if (m3 == null || m3.a(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        N(obj).j(i3, Long.valueOf(i10));
                    }
                    return j5;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int j6 = lq7.j(bArr, i, kq7Var);
                    unsafe.putObject(obj, j, Integer.valueOf(jr7.e(kq7Var.a)));
                    unsafe.putInt(obj, j2, i4);
                    return j6;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m4 = lq7.m(bArr, i, kq7Var);
                    unsafe.putObject(obj, j, Long.valueOf(jr7.f(kq7Var.b)));
                    unsafe.putInt(obj, j2, i4);
                    return m4;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object r3 = r(obj, i4, i8);
                    int n = lq7.n(r3, n(i8), bArr, i, i2, (i3 & (-8)) | 4, kq7Var);
                    A(obj, i4, i8, r3);
                    return n;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e5, code lost:
        if (r0 != r24) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e7, code lost:
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02f8, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0324, code lost:
        if (r0 != r14) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0345, code lost:
        if (r0 != r14) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int X(java.lang.Object r31, byte[] r32, int r33, int r34, com.daaw.kq7 r35) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.au7.X(java.lang.Object, byte[], int, int, com.daaw.kq7):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x024c, code lost:
        if (r29.b != 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x024e, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0250, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0251, code lost:
        r12.e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0254, code lost:
        if (r4 >= r19) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0256, code lost:
        r6 = com.daaw.lq7.j(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x025c, code lost:
        if (r20 == r29.a) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x025f, code lost:
        r4 = com.daaw.lq7.m(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0267, code lost:
        if (r29.b == 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x026a, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (r4 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
        r12.add(com.daaw.yq7.q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        r12.add(com.daaw.yq7.G(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        if (r1 >= r19) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r4 = com.daaw.lq7.j(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
        if (r20 == r29.a) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
        r1 = com.daaw.lq7.j(r17, r4, r29);
        r4 = r29.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
        if (r4 < 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
        if (r4 > (r17.length - r1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
        if (r4 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0149, code lost:
        throw com.daaw.xs7.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        throw com.daaw.xs7.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014f, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x01db -> B:111:0x01df). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x01f1 -> B:106:0x01c8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x0250 -> B:147:0x0251). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x0267 -> B:145:0x024e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0123 -> B:59:0x012b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0142 -> B:57:0x011d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0197 -> B:91:0x019b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01ad -> B:88:0x018c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Y(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.daaw.kq7 r29) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.au7.Y(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.daaw.kq7):int");
    }

    public final int Z(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return i(i, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c8, code lost:
        if (r3 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00da, code lost:
        if (r3 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // com.daaw.cv7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.au7.a(java.lang.Object):int");
    }

    public final int a0(int i, int i2) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return i(i, i2);
    }

    @Override // com.daaw.cv7
    public final void b(Object obj) {
        if (G(obj)) {
            if (obj instanceof ls7) {
                ls7 ls7Var = (ls7) obj;
                ls7Var.D(Integer.MAX_VALUE);
                ls7Var.zza = 0;
                ls7Var.B();
            }
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int k = k(i);
                long j = 1048575 & k;
                int j2 = j(k);
                if (j2 != 9) {
                    switch (j2) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.l.b(obj, j);
                            continue;
                        case 50:
                            Unsafe unsafe = r;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((rt7) object).c();
                                unsafe.putObject(obj, j, object);
                            } else {
                                continue;
                            }
                        default:
                    }
                }
                if (D(obj, i)) {
                    n(i).b(r.getObject(obj, j));
                }
            }
            this.m.m(obj);
            if (this.f) {
                this.n.e(obj);
            }
        }
    }

    public final int b0(int i) {
        return this.a[i + 2];
    }

    @Override // com.daaw.cv7
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.j) {
            int i6 = this.i[i5];
            int i7 = this.a[i6];
            int k = k(i6);
            int i8 = this.a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = r.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & k) != 0 && !E(obj, i6, i, i2, i10)) {
                return false;
            }
            int j = j(k);
            if (j != 9 && j != 17) {
                if (j != 27) {
                    if (j == 60 || j == 68) {
                        if (H(obj, i7, i6) && !F(obj, k, n(i6))) {
                            return false;
                        }
                    } else if (j != 49) {
                        if (j == 50 && !((rt7) gw7.p(obj, k & 1048575)).isEmpty()) {
                            qt7 qt7Var = (qt7) p(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) gw7.p(obj, k & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    cv7 n = n(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!n.c(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (E(obj, i6, i, i2, i10) && !F(obj, k, n(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f) {
            this.n.a(obj);
            throw null;
        }
        return true;
    }

    @Override // com.daaw.cv7
    public final void d(Object obj, Object obj2) {
        t(obj);
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.a.length; i += 3) {
            int k = k(i);
            long j = 1048575 & k;
            int i2 = this.a[i];
            switch (j(k)) {
                case 0:
                    if (D(obj2, i)) {
                        gw7.z(obj, j, gw7.j(obj2, j));
                        x(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (D(obj2, i)) {
                        gw7.A(obj, j, gw7.k(obj2, j));
                        x(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!D(obj2, i)) {
                        break;
                    }
                    gw7.C(obj, j, gw7.n(obj2, j));
                    x(obj, i);
                    break;
                case 3:
                    if (!D(obj2, i)) {
                        break;
                    }
                    gw7.C(obj, j, gw7.n(obj2, j));
                    x(obj, i);
                    break;
                case 4:
                    if (!D(obj2, i)) {
                        break;
                    }
                    gw7.B(obj, j, gw7.l(obj2, j));
                    x(obj, i);
                    break;
                case 5:
                    if (!D(obj2, i)) {
                        break;
                    }
                    gw7.C(obj, j, gw7.n(obj2, j));
                    x(obj, i);
                    break;
                case 6:
                    if (!D(obj2, i)) {
                        break;
                    }
                    gw7.B(obj, j, gw7.l(obj2, j));
                    x(obj, i);
                    break;
                case 7:
                    if (D(obj2, i)) {
                        gw7.x(obj, j, gw7.H(obj2, j));
                        x(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!D(obj2, i)) {
                        break;
                    }
                    gw7.D(obj, j, gw7.p(obj2, j));
                    x(obj, i);
                    break;
                case 9:
                case 17:
                    u(obj, obj2, i);
                    break;
                case 10:
                    if (!D(obj2, i)) {
                        break;
                    }
                    gw7.D(obj, j, gw7.p(obj2, j));
                    x(obj, i);
                    break;
                case 11:
                    if (!D(obj2, i)) {
                        break;
                    }
                    gw7.B(obj, j, gw7.l(obj2, j));
                    x(obj, i);
                    break;
                case 12:
                    if (!D(obj2, i)) {
                        break;
                    }
                    gw7.B(obj, j, gw7.l(obj2, j));
                    x(obj, i);
                    break;
                case 13:
                    if (!D(obj2, i)) {
                        break;
                    }
                    gw7.B(obj, j, gw7.l(obj2, j));
                    x(obj, i);
                    break;
                case 14:
                    if (!D(obj2, i)) {
                        break;
                    }
                    gw7.C(obj, j, gw7.n(obj2, j));
                    x(obj, i);
                    break;
                case 15:
                    if (!D(obj2, i)) {
                        break;
                    }
                    gw7.B(obj, j, gw7.l(obj2, j));
                    x(obj, i);
                    break;
                case 16:
                    if (!D(obj2, i)) {
                        break;
                    }
                    gw7.C(obj, j, gw7.n(obj2, j));
                    x(obj, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.l.c(obj, obj2, j);
                    break;
                case 50:
                    ev7.i(this.p, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!H(obj2, i2, i)) {
                        break;
                    }
                    gw7.D(obj, j, gw7.p(obj2, j));
                    y(obj, i2, i);
                    break;
                case 60:
                case 68:
                    v(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!H(obj2, i2, i)) {
                        break;
                    }
                    gw7.D(obj, j, gw7.p(obj2, j));
                    y(obj, i2, i);
                    break;
            }
        }
        ev7.f(this.m, obj, obj2);
        if (this.f) {
            ev7.e(this.n, obj, obj2);
        }
    }

    @Override // com.daaw.cv7
    public final boolean e(Object obj, Object obj2) {
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int k = k(i);
            long j = k & 1048575;
            switch (j(k)) {
                case 0:
                    if (B(obj, obj2, i) && Double.doubleToLongBits(gw7.j(obj, j)) == Double.doubleToLongBits(gw7.j(obj2, j))) {
                        break;
                    }
                    return false;
                case 1:
                    if (B(obj, obj2, i) && Float.floatToIntBits(gw7.k(obj, j)) == Float.floatToIntBits(gw7.k(obj2, j))) {
                        break;
                    }
                    return false;
                case 2:
                    if (B(obj, obj2, i) && gw7.n(obj, j) == gw7.n(obj2, j)) {
                        break;
                    }
                    return false;
                case 3:
                    if (B(obj, obj2, i) && gw7.n(obj, j) == gw7.n(obj2, j)) {
                        break;
                    }
                    return false;
                case 4:
                    if (B(obj, obj2, i) && gw7.l(obj, j) == gw7.l(obj2, j)) {
                        break;
                    }
                    return false;
                case 5:
                    if (B(obj, obj2, i) && gw7.n(obj, j) == gw7.n(obj2, j)) {
                        break;
                    }
                    return false;
                case 6:
                    if (B(obj, obj2, i) && gw7.l(obj, j) == gw7.l(obj2, j)) {
                        break;
                    }
                    return false;
                case 7:
                    if (B(obj, obj2, i) && gw7.H(obj, j) == gw7.H(obj2, j)) {
                        break;
                    }
                    return false;
                case 8:
                    if (B(obj, obj2, i) && ev7.h(gw7.p(obj, j), gw7.p(obj2, j))) {
                        break;
                    }
                    return false;
                case 9:
                    if (B(obj, obj2, i) && ev7.h(gw7.p(obj, j), gw7.p(obj2, j))) {
                        break;
                    }
                    return false;
                case 10:
                    if (B(obj, obj2, i) && ev7.h(gw7.p(obj, j), gw7.p(obj2, j))) {
                        break;
                    }
                    return false;
                case 11:
                    if (B(obj, obj2, i) && gw7.l(obj, j) == gw7.l(obj2, j)) {
                        break;
                    }
                    return false;
                case 12:
                    if (B(obj, obj2, i) && gw7.l(obj, j) == gw7.l(obj2, j)) {
                        break;
                    }
                    return false;
                case 13:
                    if (B(obj, obj2, i) && gw7.l(obj, j) == gw7.l(obj2, j)) {
                        break;
                    }
                    return false;
                case 14:
                    if (B(obj, obj2, i) && gw7.n(obj, j) == gw7.n(obj2, j)) {
                        break;
                    }
                    return false;
                case 15:
                    if (B(obj, obj2, i) && gw7.l(obj, j) == gw7.l(obj2, j)) {
                        break;
                    }
                    return false;
                case 16:
                    if (B(obj, obj2, i) && gw7.n(obj, j) == gw7.n(obj2, j)) {
                        break;
                    }
                    return false;
                case 17:
                    if (B(obj, obj2, i) && ev7.h(gw7.p(obj, j), gw7.p(obj2, j))) {
                        break;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (ev7.h(gw7.p(obj, j), gw7.p(obj2, j))) {
                        break;
                    } else {
                        return false;
                    }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long b0 = b0(i) & 1048575;
                    if (gw7.l(obj, b0) == gw7.l(obj2, b0) && ev7.h(gw7.p(obj, j), gw7.p(obj2, j))) {
                        break;
                    }
                    return false;
            }
        }
        if (this.m.d(obj).equals(this.m.d(obj2))) {
            if (this.f) {
                this.n.a(obj);
                this.n.a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.cv7
    public final void f(Object obj, rr7 rr7Var) {
        double j;
        float k;
        long n;
        long n2;
        int l;
        long n3;
        int l2;
        boolean H;
        int l3;
        int l4;
        int l5;
        long n4;
        int l6;
        long n5;
        if (!this.h) {
            J(obj, rr7Var);
        } else if (this.f) {
            this.n.a(obj);
            throw null;
        } else {
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int k2 = k(i);
                int i2 = this.a[i];
                switch (j(k2)) {
                    case 0:
                        if (D(obj, i)) {
                            j = gw7.j(obj, k2 & 1048575);
                            rr7Var.q(i2, j);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (D(obj, i)) {
                            k = gw7.k(obj, k2 & 1048575);
                            rr7Var.z(i2, k);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (D(obj, i)) {
                            n = gw7.n(obj, k2 & 1048575);
                            rr7Var.E(i2, n);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (D(obj, i)) {
                            n2 = gw7.n(obj, k2 & 1048575);
                            rr7Var.j(i2, n2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (D(obj, i)) {
                            l = gw7.l(obj, k2 & 1048575);
                            rr7Var.C(i2, l);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (D(obj, i)) {
                            n3 = gw7.n(obj, k2 & 1048575);
                            rr7Var.x(i2, n3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (D(obj, i)) {
                            l2 = gw7.l(obj, k2 & 1048575);
                            rr7Var.v(i2, l2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (D(obj, i)) {
                            H = gw7.H(obj, k2 & 1048575);
                            rr7Var.m(i2, H);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!D(obj, i)) {
                            break;
                        }
                        L(i2, gw7.p(obj, k2 & 1048575), rr7Var);
                        break;
                    case 9:
                        if (!D(obj, i)) {
                            break;
                        }
                        rr7Var.G(i2, gw7.p(obj, k2 & 1048575), n(i));
                        break;
                    case 10:
                        if (!D(obj, i)) {
                            break;
                        }
                        rr7Var.o(i2, (yq7) gw7.p(obj, k2 & 1048575));
                        break;
                    case 11:
                        if (D(obj, i)) {
                            l3 = gw7.l(obj, k2 & 1048575);
                            rr7Var.h(i2, l3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (D(obj, i)) {
                            l4 = gw7.l(obj, k2 & 1048575);
                            rr7Var.t(i2, l4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (D(obj, i)) {
                            l5 = gw7.l(obj, k2 & 1048575);
                            rr7Var.H(i2, l5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (D(obj, i)) {
                            n4 = gw7.n(obj, k2 & 1048575);
                            rr7Var.J(i2, n4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (D(obj, i)) {
                            l6 = gw7.l(obj, k2 & 1048575);
                            rr7Var.a(i2, l6);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (D(obj, i)) {
                            n5 = gw7.n(obj, k2 & 1048575);
                            rr7Var.c(i2, n5);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!D(obj, i)) {
                            break;
                        }
                        rr7Var.B(i2, gw7.p(obj, k2 & 1048575), n(i));
                        break;
                    case 18:
                        ev7.l(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 19:
                        ev7.p(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 20:
                        ev7.s(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 21:
                        ev7.B(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 22:
                        ev7.r(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 23:
                        ev7.o(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 24:
                        ev7.n(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 25:
                        ev7.j(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 26:
                        ev7.y(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var);
                        break;
                    case 27:
                        ev7.t(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, n(i));
                        break;
                    case 28:
                        ev7.k(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var);
                        break;
                    case 29:
                        ev7.z(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 30:
                        ev7.m(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 31:
                        ev7.u(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 32:
                        ev7.v(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 33:
                        ev7.w(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 34:
                        ev7.x(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, false);
                        break;
                    case 35:
                        ev7.l(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 36:
                        ev7.p(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 37:
                        ev7.s(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 38:
                        ev7.B(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 39:
                        ev7.r(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 40:
                        ev7.o(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 41:
                        ev7.n(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 42:
                        ev7.j(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 43:
                        ev7.z(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 44:
                        ev7.m(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 45:
                        ev7.u(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 46:
                        ev7.v(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 47:
                        ev7.w(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 48:
                        ev7.x(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, true);
                        break;
                    case 49:
                        ev7.q(i2, (List) gw7.p(obj, k2 & 1048575), rr7Var, n(i));
                        break;
                    case 50:
                        K(rr7Var, i2, gw7.p(obj, k2 & 1048575), i);
                        break;
                    case 51:
                        if (H(obj, i2, i)) {
                            j = Q(obj, k2 & 1048575);
                            rr7Var.q(i2, j);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (H(obj, i2, i)) {
                            k = R(obj, k2 & 1048575);
                            rr7Var.z(i2, k);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (H(obj, i2, i)) {
                            n = l(obj, k2 & 1048575);
                            rr7Var.E(i2, n);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (H(obj, i2, i)) {
                            n2 = l(obj, k2 & 1048575);
                            rr7Var.j(i2, n2);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (H(obj, i2, i)) {
                            l = U(obj, k2 & 1048575);
                            rr7Var.C(i2, l);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (H(obj, i2, i)) {
                            n3 = l(obj, k2 & 1048575);
                            rr7Var.x(i2, n3);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (H(obj, i2, i)) {
                            l2 = U(obj, k2 & 1048575);
                            rr7Var.v(i2, l2);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (H(obj, i2, i)) {
                            H = I(obj, k2 & 1048575);
                            rr7Var.m(i2, H);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!H(obj, i2, i)) {
                            break;
                        }
                        L(i2, gw7.p(obj, k2 & 1048575), rr7Var);
                        break;
                    case 60:
                        if (!H(obj, i2, i)) {
                            break;
                        }
                        rr7Var.G(i2, gw7.p(obj, k2 & 1048575), n(i));
                        break;
                    case 61:
                        if (!H(obj, i2, i)) {
                            break;
                        }
                        rr7Var.o(i2, (yq7) gw7.p(obj, k2 & 1048575));
                        break;
                    case 62:
                        if (H(obj, i2, i)) {
                            l3 = U(obj, k2 & 1048575);
                            rr7Var.h(i2, l3);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (H(obj, i2, i)) {
                            l4 = U(obj, k2 & 1048575);
                            rr7Var.t(i2, l4);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (H(obj, i2, i)) {
                            l5 = U(obj, k2 & 1048575);
                            rr7Var.H(i2, l5);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (H(obj, i2, i)) {
                            n4 = l(obj, k2 & 1048575);
                            rr7Var.J(i2, n4);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (H(obj, i2, i)) {
                            l6 = U(obj, k2 & 1048575);
                            rr7Var.a(i2, l6);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (H(obj, i2, i)) {
                            n5 = l(obj, k2 & 1048575);
                            rr7Var.c(i2, n5);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (!H(obj, i2, i)) {
                            break;
                        }
                        rr7Var.B(i2, gw7.p(obj, k2 & 1048575), n(i));
                        break;
                }
            }
            tv7 tv7Var = this.m;
            tv7Var.r(tv7Var.d(obj), rr7Var);
        }
    }

    @Override // com.daaw.cv7
    public final void g(Object obj, byte[] bArr, int i, int i2, kq7 kq7Var) {
        if (this.h) {
            X(obj, bArr, i, i2, kq7Var);
        } else {
            M(obj, bArr, i, i2, 0, kq7Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x05ae A[Catch: all -> 0x05a3, TryCatch #3 {all -> 0x05a3, blocks: (B:169:0x0579, B:183:0x05a9, B:185:0x05ae, B:186:0x05b3), top: B:211:0x0579 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05e6 A[LOOP:3: B:201:0x05e2->B:203:0x05e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05b9 A[SYNTHETIC] */
    @Override // com.daaw.cv7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.Object r18, com.daaw.iu7 r19, com.daaw.vr7 r20) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.au7.h(java.lang.Object, com.daaw.iu7, com.daaw.vr7):void");
    }

    public final int i(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final int k(int i) {
        return this.a[i + 1];
    }

    public final ps7 m(int i) {
        int i2 = i / 3;
        return (ps7) this.b[i2 + i2 + 1];
    }

    public final cv7 n(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        cv7 cv7Var = (cv7) this.b[i3];
        if (cv7Var != null) {
            return cv7Var;
        }
        cv7 b = fu7.a().b((Class) this.b[i3 + 1]);
        this.b[i3] = b;
        return b;
    }

    public final Object o(Object obj, int i, Object obj2, tv7 tv7Var, Object obj3) {
        int i2 = this.a[i];
        Object p = gw7.p(obj, k(i) & 1048575);
        if (p == null || m(i) == null) {
            return obj2;
        }
        rt7 rt7Var = (rt7) p;
        qt7 qt7Var = (qt7) p(i);
        throw null;
    }

    public final Object p(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final Object q(Object obj, int i) {
        cv7 n = n(i);
        long k = k(i) & 1048575;
        if (D(obj, i)) {
            Object object = r.getObject(obj, k);
            if (G(object)) {
                return object;
            }
            Object zze = n.zze();
            if (object != null) {
                n.d(zze, object);
            }
            return zze;
        }
        return n.zze();
    }

    public final Object r(Object obj, int i, int i2) {
        cv7 n = n(i2);
        if (H(obj, i, i2)) {
            Object object = r.getObject(obj, k(i2) & 1048575);
            if (G(object)) {
                return object;
            }
            Object zze = n.zze();
            if (object != null) {
                n.d(zze, object);
            }
            return zze;
        }
        return n.zze();
    }

    public final void u(Object obj, Object obj2, int i) {
        if (D(obj2, i)) {
            long k = k(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(obj2, k);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            cv7 n = n(i);
            if (!D(obj, i)) {
                if (G(object)) {
                    Object zze = n.zze();
                    n.d(zze, object);
                    unsafe.putObject(obj, k, zze);
                } else {
                    unsafe.putObject(obj, k, object);
                }
                x(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, k);
            if (!G(object2)) {
                Object zze2 = n.zze();
                n.d(zze2, object2);
                unsafe.putObject(obj, k, zze2);
                object2 = zze2;
            }
            n.d(object2, object);
        }
    }

    public final void v(Object obj, Object obj2, int i) {
        int i2 = this.a[i];
        if (H(obj2, i2, i)) {
            long k = k(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(obj2, k);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            cv7 n = n(i);
            if (!H(obj, i2, i)) {
                if (G(object)) {
                    Object zze = n.zze();
                    n.d(zze, object);
                    unsafe.putObject(obj, k, zze);
                } else {
                    unsafe.putObject(obj, k, object);
                }
                y(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, k);
            if (!G(object2)) {
                Object zze2 = n.zze();
                n.d(zze2, object2);
                unsafe.putObject(obj, k, zze2);
                object2 = zze2;
            }
            n.d(object2, object);
        }
    }

    public final void w(Object obj, int i, iu7 iu7Var) {
        long j;
        Object zzp;
        if (C(i)) {
            j = i & 1048575;
            zzp = iu7Var.zzs();
        } else {
            int i2 = i & 1048575;
            if (this.g) {
                j = i2;
                zzp = iu7Var.zzr();
            } else {
                j = i2;
                zzp = iu7Var.zzp();
            }
        }
        gw7.D(obj, j, zzp);
    }

    public final void x(Object obj, int i) {
        int b0 = b0(i);
        long j = 1048575 & b0;
        if (j == 1048575) {
            return;
        }
        gw7.B(obj, j, (1 << (b0 >>> 20)) | gw7.l(obj, j));
    }

    public final void y(Object obj, int i, int i2) {
        gw7.B(obj, b0(i2) & 1048575, i);
    }

    public final void z(Object obj, int i, Object obj2) {
        r.putObject(obj, k(i) & 1048575, obj2);
        x(obj, i);
    }

    @Override // com.daaw.cv7
    public final int zza(Object obj) {
        return this.h ? T(obj) : S(obj);
    }

    @Override // com.daaw.cv7
    public final Object zze() {
        return ((ls7) this.e).n();
    }
}
