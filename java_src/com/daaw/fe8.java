package com.daaw;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public final class fe8<T> implements ve8<T> {
    public static final int[] p = new int[0];
    public static final Unsafe q = ih8.l();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final zd8 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final zc8 k;
    public final og8 l;
    public final o88 m;
    public final je8 n;
    public final pd8 o;

    public fe8(int[] iArr, Object[] objArr, int i, int i2, zd8 zd8Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, je8 je8Var, zc8 zc8Var, og8 og8Var, o88 o88Var, pd8 pd8Var, byte[] bArr) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = z;
        boolean z3 = false;
        if (o88Var != null && o88Var.c(zd8Var)) {
            z3 = true;
        }
        this.f = z3;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.n = je8Var;
        this.k = zc8Var;
        this.l = og8Var;
        this.m = o88Var;
        this.e = zd8Var;
        this.o = pd8Var;
    }

    public static boolean C(Object obj, int i, ve8 ve8Var) {
        return ve8Var.c(ih8.k(obj, i & 1048575));
    }

    public static boolean D(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ja8) {
            return ((ja8) obj).x();
        }
        return true;
    }

    public static boolean F(Object obj, long j) {
        return ((Boolean) ih8.k(obj, j)).booleanValue();
    }

    public static final void G(int i, Object obj, ki8 ki8Var) {
        if (obj instanceof String) {
            ki8Var.j(i, (String) obj);
        } else {
            ki8Var.y(i, (y68) obj);
        }
    }

    public static qg8 I(Object obj) {
        ja8 ja8Var = (ja8) obj;
        qg8 qg8Var = ja8Var.zzc;
        if (qg8Var == qg8.c()) {
            qg8 f = qg8.f();
            ja8Var.zzc = f;
            return f;
        }
        return qg8Var;
    }

    public static fe8 J(Class cls, td8 td8Var, je8 je8Var, zc8 zc8Var, og8 og8Var, o88 o88Var, pd8 pd8Var) {
        if (td8Var instanceof te8) {
            return K((te8) td8Var, je8Var, zc8Var, og8Var, o88Var, pd8Var);
        }
        ig8 ig8Var = (ig8) td8Var;
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
    public static com.daaw.fe8 K(com.daaw.te8 r34, com.daaw.je8 r35, com.daaw.zc8 r36, com.daaw.og8 r37, com.daaw.o88 r38, com.daaw.pd8 r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.fe8.K(com.daaw.te8, com.daaw.je8, com.daaw.zc8, com.daaw.og8, com.daaw.o88, com.daaw.pd8):com.daaw.fe8");
    }

    public static double L(Object obj, long j) {
        return ((Double) ih8.k(obj, j)).doubleValue();
    }

    public static float M(Object obj, long j) {
        return ((Float) ih8.k(obj, j)).floatValue();
    }

    public static int P(Object obj, long j) {
        return ((Integer) ih8.k(obj, j)).intValue();
    }

    public static int h(int i) {
        return (i >>> 20) & 255;
    }

    public static long j(Object obj, long j) {
        return ((Long) ih8.k(obj, j)).longValue();
    }

    public static Field p(Class cls, String str) {
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

    public static void q(Object obj) {
        if (!D(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public final boolean A(Object obj, int i) {
        int W = W(i);
        long j = W & 1048575;
        if (j != 1048575) {
            return (ih8.h(obj, j) & (1 << (W >>> 20))) != 0;
        }
        int i2 = i(i);
        long j2 = i2 & 1048575;
        switch (h(i2)) {
            case 0:
                return Double.doubleToRawLongBits(ih8.f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(ih8.g(obj, j2)) != 0;
            case 2:
                return ih8.i(obj, j2) != 0;
            case 3:
                return ih8.i(obj, j2) != 0;
            case 4:
                return ih8.h(obj, j2) != 0;
            case 5:
                return ih8.i(obj, j2) != 0;
            case 6:
                return ih8.h(obj, j2) != 0;
            case 7:
                return ih8.B(obj, j2);
            case 8:
                Object k = ih8.k(obj, j2);
                if (k instanceof String) {
                    return !((String) k).isEmpty();
                } else if (k instanceof y68) {
                    return !y68.q.equals(k);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return ih8.k(obj, j2) != null;
            case 10:
                return !y68.q.equals(ih8.k(obj, j2));
            case 11:
                return ih8.h(obj, j2) != 0;
            case 12:
                return ih8.h(obj, j2) != 0;
            case 13:
                return ih8.h(obj, j2) != 0;
            case 14:
                return ih8.i(obj, j2) != 0;
            case 15:
                return ih8.h(obj, j2) != 0;
            case 16:
                return ih8.i(obj, j2) != 0;
            case 17:
                return ih8.k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean B(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? A(obj, i) : (i3 & i4) != 0;
    }

    public final boolean E(Object obj, int i, int i2) {
        return ih8.h(obj, (long) (W(i2) & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0419, code lost:
        if (r6 == 1048575) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x041b, code lost:
        r28.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0421, code lost:
        r3 = r9.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0425, code lost:
        if (r3 >= r9.j) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0427, code lost:
        r4 = r9.h[r3];
        r5 = r9.a[r4];
        r5 = com.daaw.ih8.k(r12, r9.i(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0439, code lost:
        if (r5 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0440, code lost:
        if (r9.k(r4) != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0442, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0445, code lost:
        r5 = (com.daaw.nd8) r5;
        r0 = (com.daaw.ld8) r9.m(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x044d, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0450, code lost:
        if (r7 != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0452, code lost:
        if (r0 != r33) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0459, code lost:
        throw com.daaw.mb8.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x045a, code lost:
        if (r0 > r33) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x045c, code lost:
        if (r1 != r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x045e, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0464, code lost:
        throw com.daaw.mb8.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int H(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.daaw.e58 r35) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.fe8.H(java.lang.Object, byte[], int, int, int, com.daaw.e58):int");
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
        r4 = com.daaw.w78.D(r11) + com.daaw.w78.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (E(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (E(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
        if (E(r17, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
        if (E(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
        if (E(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
        if (E(r17, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012a, code lost:
        r3 = P(r17, r3);
        r4 = com.daaw.w78.a(r11 << 3);
        r3 = com.daaw.w78.z(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013e, code lost:
        if (E(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
        if (E(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
        r6 = r6 + (com.daaw.w78.a(r11 << 3) + com.daaw.w78.b(j(r17, r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015d, code lost:
        if (E(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
        r3 = com.daaw.w78.a(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016d, code lost:
        if (E(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016f, code lost:
        r3 = com.daaw.w78.a(r11 << 3) + 8;
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
    public final int N(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.fe8.N(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x030e, code lost:
        if ((r4 instanceof com.daaw.y68) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0311, code lost:
        r5 = com.daaw.w78.a(r6 << 3);
        r4 = com.daaw.w78.C((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
        if ((r4 instanceof com.daaw.y68) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int O(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.fe8.O(java.lang.Object):int");
    }

    public final int Q(Object obj, byte[] bArr, int i, int i2, int i3, long j, e58 e58Var) {
        Unsafe unsafe = q;
        Object m = m(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((nd8) object).e()) {
            nd8 b = nd8.a().b();
            pd8.b(b, object);
            unsafe.putObject(obj, j, b);
        }
        ld8 ld8Var = (ld8) m;
        throw null;
    }

    public final int R(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, e58 e58Var) {
        Unsafe unsafe = q;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(h58.p(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(h58.b(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m = h58.m(bArr, i, e58Var);
                    unsafe.putObject(obj, j, Long.valueOf(e58Var.b));
                    unsafe.putInt(obj, j2, i4);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int j3 = h58.j(bArr, i, e58Var);
                    unsafe.putObject(obj, j, Integer.valueOf(e58Var.a));
                    unsafe.putInt(obj, j2, i4);
                    return j3;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(h58.p(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(h58.b(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m2 = h58.m(bArr, i, e58Var);
                    unsafe.putObject(obj, j, Boolean.valueOf(e58Var.b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int j4 = h58.j(bArr, i, e58Var);
                    int i9 = e58Var.a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !ei8.f(bArr, j4, j4 + i9)) {
                        throw mb8.c();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, j4, i9, gb8.b));
                        j4 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return j4;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object o = o(obj, i4, i8);
                    int o2 = h58.o(o, l(i8), bArr, i, i2, e58Var);
                    w(obj, i4, i8, o);
                    return o2;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int a = h58.a(bArr, i, e58Var);
                    unsafe.putObject(obj, j, e58Var.c);
                    unsafe.putInt(obj, j2, i4);
                    return a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int j5 = h58.j(bArr, i, e58Var);
                    int i10 = e58Var.a;
                    ua8 k = k(i8);
                    if (k == null || k.a(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        I(obj).j(i3, Long.valueOf(i10));
                    }
                    return j5;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int j6 = h58.j(bArr, i, e58Var);
                    unsafe.putObject(obj, j, Integer.valueOf(k78.a(e58Var.a)));
                    unsafe.putInt(obj, j2, i4);
                    return j6;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m3 = h58.m(bArr, i, e58Var);
                    unsafe.putObject(obj, j, Long.valueOf(k78.b(e58Var.b)));
                    unsafe.putInt(obj, j2, i4);
                    return m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object o3 = o(obj, i4, i8);
                    int n = h58.n(o3, l(i8), bArr, i, i2, (i3 & (-8)) | 4, e58Var);
                    w(obj, i4, i8, o3);
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
    public final int S(java.lang.Object r31, byte[] r32, int r33, int r34, com.daaw.e58 r35) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.fe8.S(java.lang.Object, byte[], int, int, com.daaw.e58):int");
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
        r6 = com.daaw.h58.j(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x025c, code lost:
        if (r20 == r29.a) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x025f, code lost:
        r4 = com.daaw.h58.m(r17, r6, r29);
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
        r12.add(com.daaw.y68.q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        r12.add(com.daaw.y68.q(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        if (r1 >= r19) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r4 = com.daaw.h58.j(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
        if (r20 == r29.a) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
        r1 = com.daaw.h58.j(r17, r4, r29);
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
        throw com.daaw.mb8.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        throw com.daaw.mb8.d();
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
    public final int T(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.daaw.e58 r29) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.fe8.T(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.daaw.e58):int");
    }

    public final int U(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return X(i, 0);
    }

    public final int V(int i, int i2) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return X(i, i2);
    }

    public final int W(int i) {
        return this.a[i + 2];
    }

    public final int X(int i, int i2) {
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
    @Override // com.daaw.ve8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.fe8.a(java.lang.Object):int");
    }

    @Override // com.daaw.ve8
    public final void b(Object obj) {
        if (D(obj)) {
            if (obj instanceof ja8) {
                ja8 ja8Var = (ja8) obj;
                ja8Var.w(Integer.MAX_VALUE);
                ja8Var.zzb = 0;
                ja8Var.u();
            }
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int i2 = i(i);
                long j = 1048575 & i2;
                int h = h(i2);
                if (h != 9) {
                    switch (h) {
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
                            this.k.a(obj, j);
                            continue;
                        case 50:
                            Unsafe unsafe = q;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((nd8) object).c();
                                unsafe.putObject(obj, j, object);
                            } else {
                                continue;
                            }
                        default:
                    }
                }
                if (A(obj, i)) {
                    l(i).b(q.getObject(obj, j));
                }
            }
            this.l.g(obj);
            if (this.f) {
                this.m.b(obj);
            }
        }
    }

    @Override // com.daaw.ve8
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.i) {
            int i6 = this.h[i5];
            int i7 = this.a[i6];
            int i8 = i(i6);
            int i9 = this.a[i6 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i3) {
                if (i10 != 1048575) {
                    i4 = q.getInt(obj, i10);
                }
                i2 = i4;
                i = i10;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & i8) != 0 && !B(obj, i6, i, i2, i11)) {
                return false;
            }
            int h = h(i8);
            if (h != 9 && h != 17) {
                if (h != 27) {
                    if (h == 60 || h == 68) {
                        if (E(obj, i7, i6) && !C(obj, i8, l(i6))) {
                            return false;
                        }
                    } else if (h != 49) {
                        if (h == 50 && !((nd8) ih8.k(obj, i8 & 1048575)).isEmpty()) {
                            ld8 ld8Var = (ld8) m(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) ih8.k(obj, i8 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ve8 l = l(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!l.c(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (B(obj, i6, i, i2, i11) && !C(obj, i8, l(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f) {
            this.m.a(obj);
            throw null;
        }
        return true;
    }

    @Override // com.daaw.ve8
    public final void d(Object obj, Object obj2) {
        q(obj);
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.a.length; i += 3) {
            int i2 = i(i);
            long j = 1048575 & i2;
            int i3 = this.a[i];
            switch (h(i2)) {
                case 0:
                    if (A(obj2, i)) {
                        ih8.t(obj, j, ih8.f(obj2, j));
                        t(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (A(obj2, i)) {
                        ih8.u(obj, j, ih8.g(obj2, j));
                        t(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!A(obj2, i)) {
                        break;
                    }
                    ih8.w(obj, j, ih8.i(obj2, j));
                    t(obj, i);
                    break;
                case 3:
                    if (!A(obj2, i)) {
                        break;
                    }
                    ih8.w(obj, j, ih8.i(obj2, j));
                    t(obj, i);
                    break;
                case 4:
                    if (!A(obj2, i)) {
                        break;
                    }
                    ih8.v(obj, j, ih8.h(obj2, j));
                    t(obj, i);
                    break;
                case 5:
                    if (!A(obj2, i)) {
                        break;
                    }
                    ih8.w(obj, j, ih8.i(obj2, j));
                    t(obj, i);
                    break;
                case 6:
                    if (!A(obj2, i)) {
                        break;
                    }
                    ih8.v(obj, j, ih8.h(obj2, j));
                    t(obj, i);
                    break;
                case 7:
                    if (A(obj2, i)) {
                        ih8.r(obj, j, ih8.B(obj2, j));
                        t(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!A(obj2, i)) {
                        break;
                    }
                    ih8.x(obj, j, ih8.k(obj2, j));
                    t(obj, i);
                    break;
                case 9:
                case 17:
                    r(obj, obj2, i);
                    break;
                case 10:
                    if (!A(obj2, i)) {
                        break;
                    }
                    ih8.x(obj, j, ih8.k(obj2, j));
                    t(obj, i);
                    break;
                case 11:
                    if (!A(obj2, i)) {
                        break;
                    }
                    ih8.v(obj, j, ih8.h(obj2, j));
                    t(obj, i);
                    break;
                case 12:
                    if (!A(obj2, i)) {
                        break;
                    }
                    ih8.v(obj, j, ih8.h(obj2, j));
                    t(obj, i);
                    break;
                case 13:
                    if (!A(obj2, i)) {
                        break;
                    }
                    ih8.v(obj, j, ih8.h(obj2, j));
                    t(obj, i);
                    break;
                case 14:
                    if (!A(obj2, i)) {
                        break;
                    }
                    ih8.w(obj, j, ih8.i(obj2, j));
                    t(obj, i);
                    break;
                case 15:
                    if (!A(obj2, i)) {
                        break;
                    }
                    ih8.v(obj, j, ih8.h(obj2, j));
                    t(obj, i);
                    break;
                case 16:
                    if (!A(obj2, i)) {
                        break;
                    }
                    ih8.w(obj, j, ih8.i(obj2, j));
                    t(obj, i);
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
                    this.k.b(obj, obj2, j);
                    break;
                case 50:
                    ze8.B(this.o, obj, obj2, j);
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
                    if (!E(obj2, i3, i)) {
                        break;
                    }
                    ih8.x(obj, j, ih8.k(obj2, j));
                    u(obj, i3, i);
                    break;
                case 60:
                case 68:
                    s(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!E(obj2, i3, i)) {
                        break;
                    }
                    ih8.x(obj, j, ih8.k(obj2, j));
                    u(obj, i3, i);
                    break;
            }
        }
        ze8.f(this.l, obj, obj2);
        if (this.f) {
            ze8.e(this.m, obj, obj2);
        }
    }

    @Override // com.daaw.ve8
    public final boolean e(Object obj, Object obj2) {
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int i2 = i(i);
            long j = i2 & 1048575;
            switch (h(i2)) {
                case 0:
                    if (z(obj, obj2, i) && Double.doubleToLongBits(ih8.f(obj, j)) == Double.doubleToLongBits(ih8.f(obj2, j))) {
                        break;
                    }
                    return false;
                case 1:
                    if (z(obj, obj2, i) && Float.floatToIntBits(ih8.g(obj, j)) == Float.floatToIntBits(ih8.g(obj2, j))) {
                        break;
                    }
                    return false;
                case 2:
                    if (z(obj, obj2, i) && ih8.i(obj, j) == ih8.i(obj2, j)) {
                        break;
                    }
                    return false;
                case 3:
                    if (z(obj, obj2, i) && ih8.i(obj, j) == ih8.i(obj2, j)) {
                        break;
                    }
                    return false;
                case 4:
                    if (z(obj, obj2, i) && ih8.h(obj, j) == ih8.h(obj2, j)) {
                        break;
                    }
                    return false;
                case 5:
                    if (z(obj, obj2, i) && ih8.i(obj, j) == ih8.i(obj2, j)) {
                        break;
                    }
                    return false;
                case 6:
                    if (z(obj, obj2, i) && ih8.h(obj, j) == ih8.h(obj2, j)) {
                        break;
                    }
                    return false;
                case 7:
                    if (z(obj, obj2, i) && ih8.B(obj, j) == ih8.B(obj2, j)) {
                        break;
                    }
                    return false;
                case 8:
                    if (z(obj, obj2, i) && ze8.z(ih8.k(obj, j), ih8.k(obj2, j))) {
                        break;
                    }
                    return false;
                case 9:
                    if (z(obj, obj2, i) && ze8.z(ih8.k(obj, j), ih8.k(obj2, j))) {
                        break;
                    }
                    return false;
                case 10:
                    if (z(obj, obj2, i) && ze8.z(ih8.k(obj, j), ih8.k(obj2, j))) {
                        break;
                    }
                    return false;
                case 11:
                    if (z(obj, obj2, i) && ih8.h(obj, j) == ih8.h(obj2, j)) {
                        break;
                    }
                    return false;
                case 12:
                    if (z(obj, obj2, i) && ih8.h(obj, j) == ih8.h(obj2, j)) {
                        break;
                    }
                    return false;
                case 13:
                    if (z(obj, obj2, i) && ih8.h(obj, j) == ih8.h(obj2, j)) {
                        break;
                    }
                    return false;
                case 14:
                    if (z(obj, obj2, i) && ih8.i(obj, j) == ih8.i(obj2, j)) {
                        break;
                    }
                    return false;
                case 15:
                    if (z(obj, obj2, i) && ih8.h(obj, j) == ih8.h(obj2, j)) {
                        break;
                    }
                    return false;
                case 16:
                    if (z(obj, obj2, i) && ih8.i(obj, j) == ih8.i(obj2, j)) {
                        break;
                    }
                    return false;
                case 17:
                    if (z(obj, obj2, i) && ze8.z(ih8.k(obj, j), ih8.k(obj2, j))) {
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
                    if (ze8.z(ih8.k(obj, j), ih8.k(obj2, j))) {
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
                    long W = W(i) & 1048575;
                    if (ih8.h(obj, W) == ih8.h(obj2, W) && ze8.z(ih8.k(obj, j), ih8.k(obj2, j))) {
                        break;
                    }
                    return false;
            }
        }
        if (this.l.d(obj).equals(this.l.d(obj2))) {
            if (this.f) {
                this.m.a(obj);
                this.m.a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.ve8
    public final void f(Object obj, ki8 ki8Var) {
        double f;
        float g;
        long i;
        long i2;
        int h;
        long i3;
        int h2;
        boolean B;
        int h3;
        int h4;
        int h5;
        long i4;
        int h6;
        long i5;
        if (!this.g) {
            x(obj, ki8Var);
        } else if (this.f) {
            this.m.a(obj);
            throw null;
        } else {
            int length = this.a.length;
            for (int i6 = 0; i6 < length; i6 += 3) {
                int i7 = i(i6);
                int i8 = this.a[i6];
                switch (h(i7)) {
                    case 0:
                        if (A(obj, i6)) {
                            f = ih8.f(obj, i7 & 1048575);
                            ki8Var.t(i8, f);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (A(obj, i6)) {
                            g = ih8.g(obj, i7 & 1048575);
                            ki8Var.x(i8, g);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (A(obj, i6)) {
                            i = ih8.i(obj, i7 & 1048575);
                            ki8Var.k(i8, i);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (A(obj, i6)) {
                            i2 = ih8.i(obj, i7 & 1048575);
                            ki8Var.F(i8, i2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (A(obj, i6)) {
                            h = ih8.h(obj, i7 & 1048575);
                            ki8Var.v(i8, h);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (A(obj, i6)) {
                            i3 = ih8.i(obj, i7 & 1048575);
                            ki8Var.a(i8, i3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (A(obj, i6)) {
                            h2 = ih8.h(obj, i7 & 1048575);
                            ki8Var.f(i8, h2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (A(obj, i6)) {
                            B = ih8.B(obj, i7 & 1048575);
                            ki8Var.g(i8, B);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!A(obj, i6)) {
                            break;
                        }
                        G(i8, ih8.k(obj, i7 & 1048575), ki8Var);
                        break;
                    case 9:
                        if (!A(obj, i6)) {
                            break;
                        }
                        ki8Var.e(i8, ih8.k(obj, i7 & 1048575), l(i6));
                        break;
                    case 10:
                        if (!A(obj, i6)) {
                            break;
                        }
                        ki8Var.y(i8, (y68) ih8.k(obj, i7 & 1048575));
                        break;
                    case 11:
                        if (A(obj, i6)) {
                            h3 = ih8.h(obj, i7 & 1048575);
                            ki8Var.b(i8, h3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (A(obj, i6)) {
                            h4 = ih8.h(obj, i7 & 1048575);
                            ki8Var.q(i8, h4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (A(obj, i6)) {
                            h5 = ih8.h(obj, i7 & 1048575);
                            ki8Var.w(i8, h5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (A(obj, i6)) {
                            i4 = ih8.i(obj, i7 & 1048575);
                            ki8Var.m(i8, i4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (A(obj, i6)) {
                            h6 = ih8.h(obj, i7 & 1048575);
                            ki8Var.h(i8, h6);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (A(obj, i6)) {
                            i5 = ih8.i(obj, i7 & 1048575);
                            ki8Var.I(i8, i5);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!A(obj, i6)) {
                            break;
                        }
                        ki8Var.E(i8, ih8.k(obj, i7 & 1048575), l(i6));
                        break;
                    case 18:
                        ze8.j(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 19:
                        ze8.n(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 20:
                        ze8.q(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 21:
                        ze8.y(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 22:
                        ze8.p(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 23:
                        ze8.m(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 24:
                        ze8.l(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 25:
                        ze8.h(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 26:
                        ze8.w(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var);
                        break;
                    case 27:
                        ze8.r(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, l(i6));
                        break;
                    case 28:
                        ze8.i(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var);
                        break;
                    case 29:
                        ze8.x(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 30:
                        ze8.k(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 31:
                        ze8.s(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 32:
                        ze8.t(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 33:
                        ze8.u(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 34:
                        ze8.v(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, false);
                        break;
                    case 35:
                        ze8.j(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 36:
                        ze8.n(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 37:
                        ze8.q(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 38:
                        ze8.y(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 39:
                        ze8.p(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 40:
                        ze8.m(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 41:
                        ze8.l(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 42:
                        ze8.h(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 43:
                        ze8.x(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 44:
                        ze8.k(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 45:
                        ze8.s(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 46:
                        ze8.t(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 47:
                        ze8.u(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 48:
                        ze8.v(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, true);
                        break;
                    case 49:
                        ze8.o(i8, (List) ih8.k(obj, i7 & 1048575), ki8Var, l(i6));
                        break;
                    case 50:
                        y(ki8Var, i8, ih8.k(obj, i7 & 1048575), i6);
                        break;
                    case 51:
                        if (E(obj, i8, i6)) {
                            f = L(obj, i7 & 1048575);
                            ki8Var.t(i8, f);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (E(obj, i8, i6)) {
                            g = M(obj, i7 & 1048575);
                            ki8Var.x(i8, g);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (E(obj, i8, i6)) {
                            i = j(obj, i7 & 1048575);
                            ki8Var.k(i8, i);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (E(obj, i8, i6)) {
                            i2 = j(obj, i7 & 1048575);
                            ki8Var.F(i8, i2);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (E(obj, i8, i6)) {
                            h = P(obj, i7 & 1048575);
                            ki8Var.v(i8, h);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (E(obj, i8, i6)) {
                            i3 = j(obj, i7 & 1048575);
                            ki8Var.a(i8, i3);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (E(obj, i8, i6)) {
                            h2 = P(obj, i7 & 1048575);
                            ki8Var.f(i8, h2);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (E(obj, i8, i6)) {
                            B = F(obj, i7 & 1048575);
                            ki8Var.g(i8, B);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!E(obj, i8, i6)) {
                            break;
                        }
                        G(i8, ih8.k(obj, i7 & 1048575), ki8Var);
                        break;
                    case 60:
                        if (!E(obj, i8, i6)) {
                            break;
                        }
                        ki8Var.e(i8, ih8.k(obj, i7 & 1048575), l(i6));
                        break;
                    case 61:
                        if (!E(obj, i8, i6)) {
                            break;
                        }
                        ki8Var.y(i8, (y68) ih8.k(obj, i7 & 1048575));
                        break;
                    case 62:
                        if (E(obj, i8, i6)) {
                            h3 = P(obj, i7 & 1048575);
                            ki8Var.b(i8, h3);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (E(obj, i8, i6)) {
                            h4 = P(obj, i7 & 1048575);
                            ki8Var.q(i8, h4);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (E(obj, i8, i6)) {
                            h5 = P(obj, i7 & 1048575);
                            ki8Var.w(i8, h5);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (E(obj, i8, i6)) {
                            i4 = j(obj, i7 & 1048575);
                            ki8Var.m(i8, i4);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (E(obj, i8, i6)) {
                            h6 = P(obj, i7 & 1048575);
                            ki8Var.h(i8, h6);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (E(obj, i8, i6)) {
                            i5 = j(obj, i7 & 1048575);
                            ki8Var.I(i8, i5);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (!E(obj, i8, i6)) {
                            break;
                        }
                        ki8Var.E(i8, ih8.k(obj, i7 & 1048575), l(i6));
                        break;
                }
            }
            og8 og8Var = this.l;
            og8Var.i(og8Var.d(obj), ki8Var);
        }
    }

    @Override // com.daaw.ve8
    public final void g(Object obj, byte[] bArr, int i, int i2, e58 e58Var) {
        if (this.g) {
            S(obj, bArr, i, i2, e58Var);
        } else {
            H(obj, bArr, i, i2, 0, e58Var);
        }
    }

    public final int i(int i) {
        return this.a[i + 1];
    }

    public final ua8 k(int i) {
        int i2 = i / 3;
        return (ua8) this.b[i2 + i2 + 1];
    }

    public final ve8 l(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        ve8 ve8Var = (ve8) this.b[i3];
        if (ve8Var != null) {
            return ve8Var;
        }
        ve8 b = pe8.a().b((Class) this.b[i3 + 1]);
        this.b[i3] = b;
        return b;
    }

    public final Object m(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final Object n(Object obj, int i) {
        ve8 l = l(i);
        long i2 = i(i) & 1048575;
        if (A(obj, i)) {
            Object object = q.getObject(obj, i2);
            if (D(object)) {
                return object;
            }
            Object zze = l.zze();
            if (object != null) {
                l.d(zze, object);
            }
            return zze;
        }
        return l.zze();
    }

    public final Object o(Object obj, int i, int i2) {
        ve8 l = l(i2);
        if (E(obj, i, i2)) {
            Object object = q.getObject(obj, i(i2) & 1048575);
            if (D(object)) {
                return object;
            }
            Object zze = l.zze();
            if (object != null) {
                l.d(zze, object);
            }
            return zze;
        }
        return l.zze();
    }

    public final void r(Object obj, Object obj2, int i) {
        if (A(obj2, i)) {
            long i2 = i(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, i2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            ve8 l = l(i);
            if (!A(obj, i)) {
                if (D(object)) {
                    Object zze = l.zze();
                    l.d(zze, object);
                    unsafe.putObject(obj, i2, zze);
                } else {
                    unsafe.putObject(obj, i2, object);
                }
                t(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, i2);
            if (!D(object2)) {
                Object zze2 = l.zze();
                l.d(zze2, object2);
                unsafe.putObject(obj, i2, zze2);
                object2 = zze2;
            }
            l.d(object2, object);
        }
    }

    public final void s(Object obj, Object obj2, int i) {
        int i2 = this.a[i];
        if (E(obj2, i2, i)) {
            long i3 = i(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, i3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            ve8 l = l(i);
            if (!E(obj, i2, i)) {
                if (D(object)) {
                    Object zze = l.zze();
                    l.d(zze, object);
                    unsafe.putObject(obj, i3, zze);
                } else {
                    unsafe.putObject(obj, i3, object);
                }
                u(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, i3);
            if (!D(object2)) {
                Object zze2 = l.zze();
                l.d(zze2, object2);
                unsafe.putObject(obj, i3, zze2);
                object2 = zze2;
            }
            l.d(object2, object);
        }
    }

    public final void t(Object obj, int i) {
        int W = W(i);
        long j = 1048575 & W;
        if (j == 1048575) {
            return;
        }
        ih8.v(obj, j, (1 << (W >>> 20)) | ih8.h(obj, j));
    }

    public final void u(Object obj, int i, int i2) {
        ih8.v(obj, W(i2) & 1048575, i);
    }

    public final void v(Object obj, int i, Object obj2) {
        q.putObject(obj, i(i) & 1048575, obj2);
        t(obj, i);
    }

    public final void w(Object obj, int i, int i2, Object obj2) {
        q.putObject(obj, i(i2) & 1048575, obj2);
        u(obj, i, i2);
    }

    public final void x(Object obj, ki8 ki8Var) {
        int i;
        if (this.f) {
            this.m.a(obj);
            throw null;
        }
        int length = this.a.length;
        Unsafe unsafe = q;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < length) {
            int i6 = i(i3);
            int[] iArr = this.a;
            int i7 = iArr[i3];
            int h = h(i6);
            if (h <= 17) {
                int i8 = iArr[i3 + 2];
                int i9 = i8 & i2;
                if (i9 != i5) {
                    i4 = unsafe.getInt(obj, i9);
                    i5 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j = i6 & i2;
            switch (h) {
                case 0:
                    if ((i4 & i) != 0) {
                        ki8Var.t(i7, ih8.f(obj, j));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 1:
                    if ((i4 & i) != 0) {
                        ki8Var.x(i7, ih8.g(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 2:
                    if ((i4 & i) != 0) {
                        ki8Var.k(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 3:
                    if ((i4 & i) != 0) {
                        ki8Var.F(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 4:
                    if ((i4 & i) != 0) {
                        ki8Var.v(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 5:
                    if ((i4 & i) != 0) {
                        ki8Var.a(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 6:
                    if ((i4 & i) != 0) {
                        ki8Var.f(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 7:
                    if ((i4 & i) != 0) {
                        ki8Var.g(i7, ih8.B(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 8:
                    if ((i4 & i) != 0) {
                        G(i7, unsafe.getObject(obj, j), ki8Var);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 9:
                    if ((i4 & i) != 0) {
                        ki8Var.e(i7, unsafe.getObject(obj, j), l(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 10:
                    if ((i4 & i) != 0) {
                        ki8Var.y(i7, (y68) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 11:
                    if ((i4 & i) != 0) {
                        ki8Var.b(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 12:
                    if ((i4 & i) != 0) {
                        ki8Var.q(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 13:
                    if ((i4 & i) != 0) {
                        ki8Var.w(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 14:
                    if ((i4 & i) != 0) {
                        ki8Var.m(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 15:
                    if ((i4 & i) != 0) {
                        ki8Var.h(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 16:
                    if ((i4 & i) != 0) {
                        ki8Var.I(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 17:
                    if ((i4 & i) != 0) {
                        ki8Var.E(i7, unsafe.getObject(obj, j), l(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 18:
                    ze8.j(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 19:
                    ze8.n(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 20:
                    ze8.q(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 21:
                    ze8.y(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 22:
                    ze8.p(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 23:
                    ze8.m(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 24:
                    ze8.l(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 25:
                    ze8.h(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 26:
                    ze8.w(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var);
                    break;
                case 27:
                    ze8.r(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, l(i3));
                    break;
                case 28:
                    ze8.i(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var);
                    break;
                case 29:
                    ze8.x(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    break;
                case 30:
                    ze8.k(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    break;
                case 31:
                    ze8.s(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    break;
                case 32:
                    ze8.t(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    break;
                case 33:
                    ze8.u(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    break;
                case 34:
                    ze8.v(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    break;
                case 35:
                    ze8.j(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 36:
                    ze8.n(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 37:
                    ze8.q(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 38:
                    ze8.y(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 39:
                    ze8.p(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 40:
                    ze8.m(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 41:
                    ze8.l(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 42:
                    ze8.h(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 43:
                    ze8.x(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 44:
                    ze8.k(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 45:
                    ze8.s(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 46:
                    ze8.t(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 47:
                    ze8.u(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 48:
                    ze8.v(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 49:
                    ze8.o(this.a[i3], (List) unsafe.getObject(obj, j), ki8Var, l(i3));
                    break;
                case 50:
                    y(ki8Var, i7, unsafe.getObject(obj, j), i3);
                    break;
                case 51:
                    if (E(obj, i7, i3)) {
                        ki8Var.t(i7, L(obj, j));
                        break;
                    }
                    break;
                case 52:
                    if (E(obj, i7, i3)) {
                        ki8Var.x(i7, M(obj, j));
                        break;
                    }
                    break;
                case 53:
                    if (E(obj, i7, i3)) {
                        ki8Var.k(i7, j(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (E(obj, i7, i3)) {
                        ki8Var.F(i7, j(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (E(obj, i7, i3)) {
                        ki8Var.v(i7, P(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (E(obj, i7, i3)) {
                        ki8Var.a(i7, j(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (E(obj, i7, i3)) {
                        ki8Var.f(i7, P(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (E(obj, i7, i3)) {
                        ki8Var.g(i7, F(obj, j));
                        break;
                    }
                    break;
                case 59:
                    if (E(obj, i7, i3)) {
                        G(i7, unsafe.getObject(obj, j), ki8Var);
                        break;
                    }
                    break;
                case 60:
                    if (E(obj, i7, i3)) {
                        ki8Var.e(i7, unsafe.getObject(obj, j), l(i3));
                        break;
                    }
                    break;
                case 61:
                    if (E(obj, i7, i3)) {
                        ki8Var.y(i7, (y68) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (E(obj, i7, i3)) {
                        ki8Var.b(i7, P(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (E(obj, i7, i3)) {
                        ki8Var.q(i7, P(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (E(obj, i7, i3)) {
                        ki8Var.w(i7, P(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (E(obj, i7, i3)) {
                        ki8Var.m(i7, j(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (E(obj, i7, i3)) {
                        ki8Var.h(i7, P(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (E(obj, i7, i3)) {
                        ki8Var.I(i7, j(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (E(obj, i7, i3)) {
                        ki8Var.E(i7, unsafe.getObject(obj, j), l(i3));
                        break;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        og8 og8Var = this.l;
        og8Var.i(og8Var.d(obj), ki8Var);
    }

    public final void y(ki8 ki8Var, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        ld8 ld8Var = (ld8) m(i2);
        throw null;
    }

    public final boolean z(Object obj, Object obj2, int i) {
        return A(obj, i) == A(obj2, i);
    }

    @Override // com.daaw.ve8
    public final int zza(Object obj) {
        return this.g ? O(obj) : N(obj);
    }

    @Override // com.daaw.ve8
    public final Object zze() {
        return ((ja8) this.e).k();
    }
}
