package com.daaw;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.conscrypt.NativeConstants;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public final class fe8<T> implements ve8<T> {

    /* renamed from: p */
    public static final int[] f9502p = new int[0];

    /* renamed from: q */
    public static final Unsafe f9503q = ih8.m19801l();

    /* renamed from: a */
    public final int[] f9504a;

    /* renamed from: b */
    public final Object[] f9505b;

    /* renamed from: c */
    public final int f9506c;

    /* renamed from: d */
    public final int f9507d;

    /* renamed from: e */
    public final zd8 f9508e;

    /* renamed from: f */
    public final boolean f9509f;

    /* renamed from: g */
    public final boolean f9510g;

    /* renamed from: h */
    public final int[] f9511h;

    /* renamed from: i */
    public final int f9512i;

    /* renamed from: j */
    public final int f9513j;

    /* renamed from: k */
    public final zc8 f9514k;

    /* renamed from: l */
    public final og8 f9515l;

    /* renamed from: m */
    public final o88 f9516m;

    /* renamed from: n */
    public final je8 f9517n;

    /* renamed from: o */
    public final pd8 f9518o;

    public fe8(int[] iArr, Object[] objArr, int i, int i2, zd8 zd8Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, je8 je8Var, zc8 zc8Var, og8 og8Var, o88 o88Var, pd8 pd8Var, byte[] bArr) {
        this.f9504a = iArr;
        this.f9505b = objArr;
        this.f9506c = i;
        this.f9507d = i2;
        this.f9510g = z;
        boolean z3 = false;
        if (o88Var != null && o88Var.mo11574c(zd8Var)) {
            z3 = true;
        }
        this.f9509f = z3;
        this.f9511h = iArr2;
        this.f9512i = i3;
        this.f9513j = i4;
        this.f9517n = je8Var;
        this.f9514k = zc8Var;
        this.f9515l = og8Var;
        this.f9516m = o88Var;
        this.f9508e = zd8Var;
        this.f9518o = pd8Var;
    }

    /* renamed from: C */
    public static boolean m22740C(Object obj, int i, ve8 ve8Var) {
        return ve8Var.mo7203c(ih8.m19802k(obj, i & 1048575));
    }

    /* renamed from: D */
    public static boolean m22739D(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ja8) {
            return ((ja8) obj).m18659x();
        }
        return true;
    }

    /* renamed from: F */
    public static boolean m22737F(Object obj, long j) {
        return ((Boolean) ih8.m19802k(obj, j)).booleanValue();
    }

    /* renamed from: G */
    public static final void m22736G(int i, Object obj, ki8 ki8Var) {
        if (obj instanceof String) {
            ki8Var.mo2659j(i, (String) obj);
        } else {
            ki8Var.mo2644y(i, (y68) obj);
        }
    }

    /* renamed from: I */
    public static qg8 m22734I(Object obj) {
        ja8 ja8Var = (ja8) obj;
        qg8 qg8Var = ja8Var.zzc;
        if (qg8Var == qg8.m12544c()) {
            qg8 m12541f = qg8.m12541f();
            ja8Var.zzc = m12541f;
            return m12541f;
        }
        return qg8Var;
    }

    /* renamed from: J */
    public static fe8 m22733J(Class cls, td8 td8Var, je8 je8Var, zc8 zc8Var, og8 og8Var, o88 o88Var, pd8 pd8Var) {
        if (td8Var instanceof te8) {
            return m22732K((te8) td8Var, je8Var, zc8Var, og8Var, o88Var, pd8Var);
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
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fe8 m22732K(te8 te8Var, je8 je8Var, zc8 zc8Var, og8 og8Var, o88 o88Var, pd8 pd8Var) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        Object[] objArr;
        String str;
        Class<?> cls;
        int i20;
        int i21;
        int i22;
        Field m22710p;
        char charAt12;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field m22710p2;
        Object obj2;
        Field m22710p3;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        int i29;
        char charAt16;
        boolean z = te8Var.zzc() == 2;
        String m9217a = te8Var.m9217a();
        int length = m9217a.length();
        char c = 55296;
        if (m9217a.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (m9217a.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int charAt17 = m9217a.charAt(i);
        if (charAt17 >= 55296) {
            int i32 = charAt17 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                charAt16 = m9217a.charAt(i31);
                if (charAt16 < 55296) {
                    break;
                }
                i32 |= (charAt16 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            charAt17 = i32 | (charAt16 << i33);
            i31 = i29;
        }
        if (charAt17 == 0) {
            iArr = f9502p;
            i3 = 0;
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i4 = 0;
            charAt3 = 0;
            i2 = 0;
        } else {
            int i34 = i31 + 1;
            int charAt18 = m9217a.charAt(i31);
            if (charAt18 >= 55296) {
                int i35 = charAt18 & 8191;
                int i36 = 13;
                while (true) {
                    i13 = i34 + 1;
                    charAt11 = m9217a.charAt(i34);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i35 |= (charAt11 & 8191) << i36;
                    i36 += 13;
                    i34 = i13;
                }
                charAt18 = i35 | (charAt11 << i36);
                i34 = i13;
            }
            int i37 = i34 + 1;
            int charAt19 = m9217a.charAt(i34);
            if (charAt19 >= 55296) {
                int i38 = charAt19 & 8191;
                int i39 = 13;
                while (true) {
                    i12 = i37 + 1;
                    charAt10 = m9217a.charAt(i37);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i38 |= (charAt10 & 8191) << i39;
                    i39 += 13;
                    i37 = i12;
                }
                charAt19 = i38 | (charAt10 << i39);
                i37 = i12;
            }
            int i40 = i37 + 1;
            charAt = m9217a.charAt(i37);
            if (charAt >= 55296) {
                int i41 = charAt & 8191;
                int i42 = 13;
                while (true) {
                    i11 = i40 + 1;
                    charAt9 = m9217a.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i11;
                }
                charAt = i41 | (charAt9 << i42);
                i40 = i11;
            }
            int i43 = i40 + 1;
            int charAt20 = m9217a.charAt(i40);
            if (charAt20 >= 55296) {
                int i44 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i10 = i43 + 1;
                    charAt8 = m9217a.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i10;
                }
                charAt20 = i44 | (charAt8 << i45);
                i43 = i10;
            }
            int i46 = i43 + 1;
            charAt2 = m9217a.charAt(i43);
            if (charAt2 >= 55296) {
                int i47 = charAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i9 = i46 + 1;
                    charAt7 = m9217a.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i9;
                }
                charAt2 = i47 | (charAt7 << i48);
                i46 = i9;
            }
            int i49 = i46 + 1;
            int charAt21 = m9217a.charAt(i46);
            if (charAt21 >= 55296) {
                int i50 = charAt21 & 8191;
                int i51 = 13;
                while (true) {
                    i8 = i49 + 1;
                    charAt6 = m9217a.charAt(i49);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i50 |= (charAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i8;
                }
                charAt21 = i50 | (charAt6 << i51);
                i49 = i8;
            }
            int i52 = i49 + 1;
            int charAt22 = m9217a.charAt(i49);
            if (charAt22 >= 55296) {
                int i53 = charAt22 & 8191;
                int i54 = 13;
                while (true) {
                    i7 = i52 + 1;
                    charAt5 = m9217a.charAt(i52);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i53 |= (charAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i7;
                }
                charAt22 = i53 | (charAt5 << i54);
                i52 = i7;
            }
            int i55 = i52 + 1;
            charAt3 = m9217a.charAt(i52);
            if (charAt3 >= 55296) {
                int i56 = charAt3 & 8191;
                int i57 = 13;
                while (true) {
                    i6 = i55 + 1;
                    charAt4 = m9217a.charAt(i55);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i56 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i6;
                }
                charAt3 = i56 | (charAt4 << i57);
                i55 = i6;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i2 = charAt18 + charAt18 + charAt19;
            i3 = charAt18;
            i31 = i55;
            int i58 = charAt21;
            i4 = charAt20;
            i5 = i58;
        }
        Unsafe unsafe = f9503q;
        Object[] m9216b = te8Var.m9216b();
        Class<?> cls2 = te8Var.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i59 = charAt3 + i5;
        int i60 = charAt3;
        int i61 = i59;
        int i62 = 0;
        int i63 = 0;
        while (i31 < length) {
            int i64 = i31 + 1;
            int charAt23 = m9217a.charAt(i31);
            if (charAt23 >= c) {
                int i65 = charAt23 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i28 = i66 + 1;
                    charAt15 = m9217a.charAt(i66);
                    if (charAt15 < c) {
                        break;
                    }
                    i65 |= (charAt15 & 8191) << i67;
                    i67 += 13;
                    i66 = i28;
                }
                charAt23 = i65 | (charAt15 << i67);
                i14 = i28;
            } else {
                i14 = i64;
            }
            int i68 = i14 + 1;
            int charAt24 = m9217a.charAt(i14);
            if (charAt24 >= c) {
                int i69 = charAt24 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    charAt14 = m9217a.charAt(i70);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i69 |= (charAt14 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                    length = i15;
                }
                charAt24 = i69 | (charAt14 << i71);
                i16 = i27;
            } else {
                i15 = length;
                i16 = i68;
            }
            int i72 = charAt24 & 255;
            int i73 = charAt3;
            if ((charAt24 & NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV) != 0) {
                iArr[i63] = i62;
                i63++;
            }
            if (i72 >= 51) {
                int i74 = i16 + 1;
                int charAt25 = m9217a.charAt(i16);
                if (charAt25 >= 55296) {
                    int i75 = charAt25 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i26 = i76 + 1;
                        charAt13 = m9217a.charAt(i76);
                        i18 = i4;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i75 |= (charAt13 & 8191) << i77;
                        i77 += 13;
                        i76 = i26;
                        i4 = i18;
                    }
                    charAt25 = i75 | (charAt13 << i77);
                    i24 = i26;
                } else {
                    i18 = i4;
                    i24 = i74;
                }
                int i78 = i72 - 51;
                i20 = i24;
                if (i78 == 9 || i78 == 17) {
                    int i79 = i62 / 3;
                    i25 = i2 + 1;
                    objArr2[i79 + i79 + 1] = m9216b[i2];
                } else {
                    if (i78 == 12 && !z) {
                        int i80 = i62 / 3;
                        i25 = i2 + 1;
                        objArr2[i80 + i80 + 1] = m9216b[i2];
                    }
                    int i81 = charAt25 + charAt25;
                    obj = m9216b[i81];
                    if (obj instanceof Field) {
                        m22710p2 = m22710p(cls2, (String) obj);
                        m9216b[i81] = m22710p2;
                    } else {
                        m22710p2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m22710p2);
                    int i82 = i81 + 1;
                    obj2 = m9216b[i82];
                    if (obj2 instanceof Field) {
                        m22710p3 = m22710p(cls2, (String) obj2);
                        m9216b[i82] = m22710p3;
                    } else {
                        m22710p3 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(m22710p3);
                    str = m9217a;
                    cls = cls2;
                    i21 = objectFieldOffset3;
                    objArr = objArr2;
                    objectFieldOffset = objectFieldOffset2;
                    i22 = 0;
                }
                i2 = i25;
                int i812 = charAt25 + charAt25;
                obj = m9216b[i812];
                if (obj instanceof Field) {
                }
                iArr2 = iArr3;
                i17 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m22710p2);
                int i822 = i812 + 1;
                obj2 = m9216b[i822];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(m22710p3);
                str = m9217a;
                cls = cls2;
                i21 = objectFieldOffset32;
                objArr = objArr2;
                objectFieldOffset = objectFieldOffset22;
                i22 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i83 = i2 + 1;
                Field m22710p4 = m22710p(cls2, (String) m9216b[i2]);
                if (i72 == 9 || i72 == 17) {
                    int i84 = i62 / 3;
                    objArr2[i84 + i84 + 1] = m22710p4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        int i85 = i62 / 3;
                        i23 = i83 + 1;
                        objArr2[i85 + i85 + 1] = m9216b[i83];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        if (!z) {
                            int i86 = i62 / 3;
                            i23 = i83 + 1;
                            objArr2[i86 + i86 + 1] = m9216b[i83];
                        }
                    } else if (i72 == 50) {
                        int i87 = i60 + 1;
                        iArr[i60] = i62;
                        int i88 = i62 / 3;
                        int i89 = i88 + i88;
                        int i90 = i83 + 1;
                        objArr2[i89] = m9216b[i83];
                        if ((charAt24 & 2048) != 0) {
                            i83 = i90 + 1;
                            objArr2[i89 + 1] = m9216b[i90];
                            i60 = i87;
                        } else {
                            i60 = i87;
                            i19 = i90;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(m22710p4);
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i72 > 17) {
                                str = m9217a;
                                cls = cls2;
                                i20 = i16;
                                i21 = 1048575;
                                i22 = 0;
                            } else {
                                int i91 = i16 + 1;
                                int charAt26 = m9217a.charAt(i16);
                                if (charAt26 >= 55296) {
                                    int i92 = charAt26 & 8191;
                                    int i93 = 13;
                                    while (true) {
                                        i20 = i91 + 1;
                                        charAt12 = m9217a.charAt(i91);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i92 |= (charAt12 & 8191) << i93;
                                        i93 += 13;
                                        i91 = i20;
                                    }
                                    charAt26 = i92 | (charAt12 << i93);
                                } else {
                                    i20 = i91;
                                }
                                int i94 = i3 + i3 + (charAt26 / 32);
                                Object obj3 = m9216b[i94];
                                str = m9217a;
                                if (obj3 instanceof Field) {
                                    m22710p = (Field) obj3;
                                } else {
                                    m22710p = m22710p(cls2, (String) obj3);
                                    m9216b[i94] = m22710p;
                                }
                                cls = cls2;
                                i21 = (int) unsafe.objectFieldOffset(m22710p);
                                i22 = charAt26 % 32;
                            }
                            if (i72 >= 18 && i72 <= 49) {
                                iArr[i61] = objectFieldOffset;
                                i61++;
                            }
                            i2 = i19;
                        }
                    }
                    i19 = i23;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m22710p4);
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = m9217a;
                    cls = cls2;
                    i20 = i16;
                    i21 = 1048575;
                    i22 = 0;
                    if (i72 >= 18) {
                        iArr[i61] = objectFieldOffset;
                        i61++;
                    }
                    i2 = i19;
                }
                i19 = i83;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m22710p4);
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = m9217a;
                cls = cls2;
                i20 = i16;
                i21 = 1048575;
                i22 = 0;
                if (i72 >= 18) {
                }
                i2 = i19;
            }
            int i95 = i62 + 1;
            iArr2[i62] = charAt23;
            int i96 = i95 + 1;
            iArr2[i95] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i72 << 20) | objectFieldOffset;
            i62 = i96 + 1;
            iArr2[i96] = (i22 << 20) | i21;
            cls2 = cls;
            charAt = i17;
            charAt3 = i73;
            i31 = i20;
            length = i15;
            objArr2 = objArr;
            m9217a = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new fe8(iArr3, objArr2, charAt, i4, te8Var.zza(), z, false, iArr, charAt3, i59, je8Var, zc8Var, og8Var, o88Var, pd8Var, null);
    }

    /* renamed from: L */
    public static double m22731L(Object obj, long j) {
        return ((Double) ih8.m19802k(obj, j)).doubleValue();
    }

    /* renamed from: M */
    public static float m22730M(Object obj, long j) {
        return ((Float) ih8.m19802k(obj, j)).floatValue();
    }

    /* renamed from: P */
    public static int m22727P(Object obj, long j) {
        return ((Integer) ih8.m19802k(obj, j)).intValue();
    }

    /* renamed from: h */
    public static int m22718h(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: j */
    public static long m22716j(Object obj, long j) {
        return ((Long) ih8.m19802k(obj, j)).longValue();
    }

    /* renamed from: p */
    public static Field m22710p(Class cls, String str) {
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

    /* renamed from: q */
    public static void m22709q(Object obj) {
        if (!m22739D(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* renamed from: A */
    public final boolean m22742A(Object obj, int i) {
        int m22720W = m22720W(i);
        long j = m22720W & 1048575;
        if (j != 1048575) {
            return (ih8.m19805h(obj, j) & (1 << (m22720W >>> 20))) != 0;
        }
        int m22717i = m22717i(i);
        long j2 = m22717i & 1048575;
        switch (m22718h(m22717i)) {
            case 0:
                return Double.doubleToRawLongBits(ih8.m19807f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(ih8.m19806g(obj, j2)) != 0;
            case 2:
                return ih8.m19804i(obj, j2) != 0;
            case 3:
                return ih8.m19804i(obj, j2) != 0;
            case 4:
                return ih8.m19805h(obj, j2) != 0;
            case 5:
                return ih8.m19804i(obj, j2) != 0;
            case 6:
                return ih8.m19805h(obj, j2) != 0;
            case 7:
                return ih8.m19816B(obj, j2);
            case 8:
                Object m19802k = ih8.m19802k(obj, j2);
                if (m19802k instanceof String) {
                    return !((String) m19802k).isEmpty();
                } else if (m19802k instanceof y68) {
                    return !y68.f33399q.equals(m19802k);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return ih8.m19802k(obj, j2) != null;
            case 10:
                return !y68.f33399q.equals(ih8.m19802k(obj, j2));
            case 11:
                return ih8.m19805h(obj, j2) != 0;
            case 12:
                return ih8.m19805h(obj, j2) != 0;
            case 13:
                return ih8.m19805h(obj, j2) != 0;
            case 14:
                return ih8.m19804i(obj, j2) != 0;
            case 15:
                return ih8.m19805h(obj, j2) != 0;
            case 16:
                return ih8.m19804i(obj, j2) != 0;
            case 17:
                return ih8.m19802k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: B */
    public final boolean m22741B(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m22742A(obj, i) : (i3 & i4) != 0;
    }

    /* renamed from: E */
    public final boolean m22738E(Object obj, int i, int i2) {
        return ih8.m19805h(obj, (long) (m22720W(i2) & 1048575)) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0419, code lost:
        if (r6 == 1048575) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x041b, code lost:
        r28.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0421, code lost:
        r3 = r9.f9512i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0425, code lost:
        if (r3 >= r9.f9513j) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0427, code lost:
        r4 = r9.f9511h[r3];
        r5 = r9.f9504a[r4];
        r5 = com.daaw.ih8.m19802k(r12, r9.m22717i(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0439, code lost:
        if (r5 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0440, code lost:
        if (r9.m22715k(r4) != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0442, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0445, code lost:
        r5 = (com.daaw.nd8) r5;
        r0 = (com.daaw.ld8) r9.m22713m(r4);
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
        throw com.daaw.mb8.m16105e();
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
        throw com.daaw.mb8.m16105e();
     */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m22735H(Object obj, byte[] bArr, int i, int i2, int i3, e58 e58Var) {
        Unsafe unsafe;
        int i4;
        Object obj2;
        fe8<T> fe8Var;
        byte b;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj3;
        int i10;
        e58 e58Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j;
        int i18;
        int i19;
        int i20;
        fe8<T> fe8Var2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i21 = i2;
        int i22 = i3;
        e58 e58Var3 = e58Var;
        m22709q(obj);
        Unsafe unsafe2 = f9503q;
        int i23 = i;
        int i24 = 0;
        int i25 = -1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 1048575;
        while (true) {
            if (i23 < i21) {
                int i29 = i23 + 1;
                byte b2 = bArr2[i23];
                if (b2 < 0) {
                    int m21007k = h58.m21007k(b2, bArr2, i29, e58Var3);
                    b = e58Var3.f8130a;
                    i29 = m21007k;
                } else {
                    b = b2;
                }
                int i30 = b >>> 3;
                int i31 = b & 7;
                int m22721V = i30 > i25 ? fe8Var2.m22721V(i30, i26 / 3) : fe8Var2.m22722U(i30);
                if (m22721V == -1) {
                    i5 = i30;
                    i6 = i29;
                    i7 = b;
                    i8 = i27;
                    unsafe = unsafe2;
                    i4 = i22;
                    i9 = 0;
                } else {
                    int[] iArr = fe8Var2.f9504a;
                    int i32 = iArr[m22721V + 1];
                    int m22718h = m22718h(i32);
                    int i33 = i29;
                    long j2 = i32 & 1048575;
                    if (m22718h <= 17) {
                        int i34 = iArr[m22721V + 2];
                        int i35 = 1 << (i34 >>> 20);
                        int i36 = i34 & 1048575;
                        int i37 = b;
                        if (i36 != i28) {
                            if (i28 != 1048575) {
                                unsafe2.putInt(obj4, i28, i27);
                            }
                            i11 = i36;
                            i8 = unsafe2.getInt(obj4, i36);
                        } else {
                            i8 = i27;
                            i11 = i28;
                        }
                        switch (m22718h) {
                            case 0:
                                i12 = m22721V;
                                i13 = i30;
                                i14 = i33;
                                if (i31 != 1) {
                                    i7 = i37;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    ih8.m19793t(obj4, j2, Double.longBitsToDouble(h58.m21002p(bArr2, i14)));
                                    i23 = i14 + 8;
                                    i27 = i8 | i35;
                                    i25 = i13;
                                    i26 = i12;
                                    i24 = i37;
                                    break;
                                }
                            case 1:
                                i12 = m22721V;
                                i13 = i30;
                                i14 = i33;
                                if (i31 != 5) {
                                    i7 = i37;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    ih8.m19792u(obj4, j2, Float.intBitsToFloat(h58.m21016b(bArr2, i14)));
                                    i23 = i14 + 4;
                                    i27 = i8 | i35;
                                    i25 = i13;
                                    i26 = i12;
                                    i24 = i37;
                                    break;
                                }
                            case 2:
                            case 3:
                                i12 = m22721V;
                                i13 = i30;
                                i14 = i33;
                                if (i31 != 0) {
                                    i7 = i37;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    int m21005m = h58.m21005m(bArr2, i14, e58Var3);
                                    unsafe2.putLong(obj, j2, e58Var3.f8131b);
                                    i27 = i8 | i35;
                                    i23 = m21005m;
                                    i25 = i13;
                                    i26 = i12;
                                    i24 = i37;
                                    break;
                                }
                            case 4:
                            case 11:
                                i12 = m22721V;
                                i13 = i30;
                                i14 = i33;
                                if (i31 != 0) {
                                    i7 = i37;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    i23 = h58.m21008j(bArr2, i14, e58Var3);
                                    unsafe2.putInt(obj4, j2, e58Var3.f8130a);
                                    i27 = i8 | i35;
                                    i25 = i13;
                                    i26 = i12;
                                    i24 = i37;
                                    break;
                                }
                            case 5:
                            case 14:
                                i12 = m22721V;
                                i13 = i30;
                                if (i31 != 1) {
                                    i37 = i37;
                                    i14 = i33;
                                    i7 = i37;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    i37 = i37;
                                    i14 = i33;
                                    unsafe2.putLong(obj, j2, h58.m21002p(bArr2, i33));
                                    i23 = i14 + 8;
                                    i27 = i8 | i35;
                                    i25 = i13;
                                    i26 = i12;
                                    i24 = i37;
                                    break;
                                }
                            case 6:
                            case 13:
                                i12 = m22721V;
                                i15 = i37;
                                i13 = i30;
                                i16 = i33;
                                if (i31 != 5) {
                                    i7 = i15;
                                    i14 = i16;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j2, h58.m21016b(bArr2, i16));
                                    i23 = i16 + 4;
                                    i27 = i8 | i35;
                                    i24 = i15;
                                    i25 = i13;
                                    i26 = i12;
                                    break;
                                }
                            case 7:
                                i12 = m22721V;
                                i15 = i37;
                                i13 = i30;
                                i16 = i33;
                                if (i31 != 0) {
                                    i7 = i15;
                                    i14 = i16;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    i23 = h58.m21005m(bArr2, i16, e58Var3);
                                    ih8.m19795r(obj4, j2, e58Var3.f8131b != 0);
                                    i27 = i8 | i35;
                                    i24 = i15;
                                    i25 = i13;
                                    i26 = i12;
                                    break;
                                }
                            case 8:
                                i12 = m22721V;
                                i15 = i37;
                                i13 = i30;
                                i16 = i33;
                                if (i31 != 2) {
                                    i7 = i15;
                                    i14 = i16;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    i23 = (536870912 & i32) == 0 ? h58.m21011g(bArr2, i16, e58Var3) : h58.m21010h(bArr2, i16, e58Var3);
                                    unsafe2.putObject(obj4, j2, e58Var3.f8132c);
                                    i27 = i8 | i35;
                                    i24 = i15;
                                    i25 = i13;
                                    i26 = i12;
                                    break;
                                }
                            case 9:
                                i12 = m22721V;
                                i7 = i37;
                                i13 = i30;
                                i17 = i33;
                                if (i31 != 2) {
                                    i14 = i17;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    Object m22712n = fe8Var2.m22712n(obj4, i12);
                                    i23 = h58.m21003o(m22712n, fe8Var2.m22714l(i12), bArr, i17, i2, e58Var);
                                    fe8Var2.m22704v(obj4, i12, m22712n);
                                    i27 = i8 | i35;
                                    i24 = i7;
                                    i25 = i13;
                                    i26 = i12;
                                    break;
                                }
                            case 10:
                                i12 = m22721V;
                                i7 = i37;
                                i13 = i30;
                                i17 = i33;
                                if (i31 != 2) {
                                    i14 = i17;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    i23 = h58.m21017a(bArr2, i17, e58Var3);
                                    unsafe2.putObject(obj4, j2, e58Var3.f8132c);
                                    i27 = i8 | i35;
                                    i24 = i7;
                                    i25 = i13;
                                    i26 = i12;
                                    break;
                                }
                            case 12:
                                i12 = m22721V;
                                i7 = i37;
                                i13 = i30;
                                i17 = i33;
                                j = j2;
                                if (i31 != 0) {
                                    i14 = i17;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    i23 = h58.m21008j(bArr2, i17, e58Var3);
                                    i18 = e58Var3.f8130a;
                                    ua8 m22715k = fe8Var2.m22715k(i12);
                                    if (m22715k != null && !m22715k.mo8358a(i18)) {
                                        m22734I(obj).m12537j(i7, Long.valueOf(i18));
                                        i24 = i7;
                                        i25 = i13;
                                        i26 = i12;
                                        i27 = i8;
                                        break;
                                    }
                                    unsafe2.putInt(obj4, j, i18);
                                    i27 = i8 | i35;
                                    i24 = i7;
                                    i25 = i13;
                                    i26 = i12;
                                    break;
                                }
                                break;
                            case 15:
                                i12 = m22721V;
                                i7 = i37;
                                i13 = i30;
                                i17 = i33;
                                j = j2;
                                if (i31 != 0) {
                                    i14 = i17;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    i23 = h58.m21008j(bArr2, i17, e58Var3);
                                    i18 = k78.m17983a(e58Var3.f8130a);
                                    unsafe2.putInt(obj4, j, i18);
                                    i27 = i8 | i35;
                                    i24 = i7;
                                    i25 = i13;
                                    i26 = i12;
                                    break;
                                }
                            case 16:
                                if (i31 != 0) {
                                    i12 = m22721V;
                                    i13 = i30;
                                    i7 = i37;
                                    i14 = i33;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    int m21005m2 = h58.m21005m(bArr2, i33, e58Var3);
                                    i13 = i30;
                                    i12 = m22721V;
                                    i7 = i37;
                                    unsafe2.putLong(obj, j2, k78.m17982b(e58Var3.f8131b));
                                    i27 = i8 | i35;
                                    i23 = m21005m2;
                                    i24 = i7;
                                    i25 = i13;
                                    i26 = i12;
                                    break;
                                }
                            default:
                                i12 = m22721V;
                                i13 = i30;
                                i14 = i33;
                                if (i31 != 3) {
                                    i7 = i37;
                                    i4 = i3;
                                    i6 = i14;
                                    unsafe = unsafe2;
                                    i5 = i13;
                                    i9 = i12;
                                    i28 = i11;
                                    break;
                                } else {
                                    Object m22712n2 = fe8Var2.m22712n(obj4, i12);
                                    i7 = i37;
                                    i23 = h58.m21004n(m22712n2, fe8Var2.m22714l(i12), bArr, i14, i2, (i13 << 3) | 4, e58Var);
                                    fe8Var2.m22704v(obj4, i12, m22712n2);
                                    i27 = i8 | i35;
                                    i24 = i7;
                                    i25 = i13;
                                    i26 = i12;
                                    break;
                                }
                        }
                        i28 = i11;
                        i21 = i2;
                        i22 = i3;
                    } else {
                        i12 = m22721V;
                        int i38 = b;
                        i11 = i28;
                        if (m22718h != 27) {
                            i8 = i27;
                            if (m22718h <= 49) {
                                i5 = i30;
                                i19 = i38;
                                unsafe = unsafe2;
                                i9 = i12;
                                i23 = m22723T(obj, bArr, i33, i2, i38, i5, i31, i12, i32, m22718h, j2, e58Var);
                                if (i23 != i33) {
                                    fe8Var2 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i25 = i5;
                                    i21 = i2;
                                    i22 = i3;
                                    e58Var3 = e58Var;
                                    i24 = i19;
                                    i26 = i9;
                                    i27 = i8;
                                    i28 = i11;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i6 = i23;
                                    i7 = i19;
                                }
                            } else {
                                i19 = i38;
                                i5 = i30;
                                i20 = i33;
                                unsafe = unsafe2;
                                i9 = i12;
                                if (m22718h != 50) {
                                    i23 = m22725R(obj, bArr, i20, i2, i19, i5, i31, i32, m22718h, j2, i9, e58Var);
                                    if (i23 != i20) {
                                        fe8Var2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i25 = i5;
                                        i21 = i2;
                                        i22 = i3;
                                        e58Var3 = e58Var;
                                        i24 = i19;
                                        i26 = i9;
                                        i27 = i8;
                                        i28 = i11;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i6 = i23;
                                        i7 = i19;
                                    }
                                } else if (i31 == 2) {
                                    i23 = m22726Q(obj, bArr, i20, i2, i9, j2, e58Var);
                                    if (i23 != i20) {
                                        fe8Var2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i25 = i5;
                                        i21 = i2;
                                        i22 = i3;
                                        e58Var3 = e58Var;
                                        i24 = i19;
                                        i26 = i9;
                                        i27 = i8;
                                        i28 = i11;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i6 = i23;
                                        i7 = i19;
                                    }
                                }
                            }
                            i28 = i11;
                        } else if (i31 == 2) {
                            db8 db8Var = (db8) unsafe2.getObject(obj4, j2);
                            if (!db8Var.zzc()) {
                                int size = db8Var.size();
                                db8Var = db8Var.mo5295b(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j2, db8Var);
                            }
                            i8 = i27;
                            i23 = h58.m21013e(fe8Var2.m22714l(i12), i38, bArr, i33, i2, db8Var, e58Var);
                            i25 = i30;
                            i24 = i38;
                            i26 = i12;
                            i27 = i8;
                            i28 = i11;
                            i21 = i2;
                            i22 = i3;
                        } else {
                            i8 = i27;
                            i5 = i30;
                            i19 = i38;
                            i20 = i33;
                            unsafe = unsafe2;
                            i9 = i12;
                        }
                        i4 = i3;
                        i6 = i20;
                        i7 = i19;
                        i28 = i11;
                    }
                }
                if (i7 != i4 || i4 == 0) {
                    if (this.f9509f) {
                        e58Var2 = e58Var;
                        l88 l88Var = e58Var2.f8133d;
                        if (l88Var != l88.f17143c) {
                            i10 = i5;
                            if (l88Var.m17098b(this.f9508e, i10) != null) {
                                ba8 ba8Var = (ba8) obj;
                                throw null;
                            }
                            i23 = h58.m21009i(i7, bArr, i6, i2, m22734I(obj), e58Var);
                            obj3 = obj;
                            i21 = i2;
                            i24 = i7;
                            fe8Var2 = this;
                            e58Var3 = e58Var2;
                            i25 = i10;
                            obj4 = obj3;
                            i26 = i9;
                            i27 = i8;
                            unsafe2 = unsafe;
                            bArr2 = bArr;
                            i22 = i4;
                        } else {
                            obj3 = obj;
                            i10 = i5;
                        }
                    } else {
                        obj3 = obj;
                        i10 = i5;
                        e58Var2 = e58Var;
                    }
                    i23 = h58.m21009i(i7, bArr, i6, i2, m22734I(obj), e58Var);
                    i21 = i2;
                    i24 = i7;
                    fe8Var2 = this;
                    e58Var3 = e58Var2;
                    i25 = i10;
                    obj4 = obj3;
                    i26 = i9;
                    i27 = i8;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i22 = i4;
                } else {
                    fe8Var = this;
                    obj2 = obj;
                    i23 = i6;
                    i24 = i7;
                    i27 = i8;
                }
            } else {
                unsafe = unsafe2;
                i4 = i22;
                obj2 = obj4;
                fe8Var = fe8Var2;
            }
        }
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
        r4 = com.daaw.w78.m6385D(r11) + com.daaw.w78.m6384a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (m22738E(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (m22738E(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
        if (m22738E(r17, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
        if (m22738E(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
        if (m22738E(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
        if (m22738E(r17, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012a, code lost:
        r3 = m22727P(r17, r3);
        r4 = com.daaw.w78.m6384a(r11 << 3);
        r3 = com.daaw.w78.m6359z(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013e, code lost:
        if (m22738E(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
        if (m22738E(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
        r6 = r6 + (com.daaw.w78.m6384a(r11 << 3) + com.daaw.w78.m6383b(m22716j(r17, r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015d, code lost:
        if (m22738E(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
        r3 = com.daaw.w78.m6384a(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016d, code lost:
        if (m22738E(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016f, code lost:
        r3 = com.daaw.w78.m6384a(r11 << 3) + 8;
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
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m22729N(Object obj) {
        int i;
        int m6384a;
        Object object;
        int m6384a2;
        int m6386C;
        int m6384a3;
        int i2;
        int m2395W;
        int m2407K;
        int m6385D;
        Object object2;
        int m6384a4;
        int m22727P;
        Unsafe unsafe = f9503q;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i4 < this.f9504a.length) {
            int m22717i = m22717i(i4);
            int[] iArr = this.f9504a;
            int i8 = iArr[i4];
            int m22718h = m22718h(m22717i);
            if (m22718h <= 17) {
                int i9 = iArr[i4 + 2];
                int i10 = i9 & i3;
                i = 1 << (i9 >>> 20);
                if (i10 != i7) {
                    i6 = unsafe.getInt(obj, i10);
                    i7 = i10;
                }
            } else {
                i = 0;
            }
            long j = m22717i & i3;
            switch (m22718h) {
                case 0:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    m6384a = w78.m6384a(i8 << 3) + 8;
                    i5 += m6384a;
                    break;
                case 1:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    m6384a = w78.m6384a(i8 << 3) + 4;
                    i5 += m6384a;
                    break;
                case 2:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    i5 += w78.m6384a(i8 << 3) + w78.m6383b(unsafe.getLong(obj, j));
                    break;
                case 3:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    i5 += w78.m6384a(i8 << 3) + w78.m6383b(unsafe.getLong(obj, j));
                    break;
                case 4:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    int i11 = unsafe.getInt(obj, j);
                    m6384a2 = w78.m6384a(i8 << 3);
                    m6386C = w78.m6359z(i11);
                    m6384a3 = m6384a2 + m6386C;
                    i5 += m6384a3;
                    break;
                case 5:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    m6384a = w78.m6384a(i8 << 3) + 8;
                    i5 += m6384a;
                    break;
                case 6:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    m6384a = w78.m6384a(i8 << 3) + 4;
                    i5 += m6384a;
                    break;
                case 7:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        m6384a = w78.m6384a(i8 << 3) + 1;
                        i5 += m6384a;
                        break;
                    }
                case 8:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        object = unsafe.getObject(obj, j);
                        if (!(object instanceof y68)) {
                            m6384a2 = w78.m6384a(i8 << 3);
                            m6386C = w78.m6386C((String) object);
                            m6384a3 = m6384a2 + m6386C;
                            i5 += m6384a3;
                            break;
                        }
                        int m6384a5 = w78.m6384a(i8 << 3);
                        int mo2805f = ((y68) object).mo2805f();
                        m6384a3 = m6384a5 + w78.m6384a(mo2805f) + mo2805f;
                        i5 += m6384a3;
                    }
                case 9:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        m6384a = ze8.m2401Q(i8, unsafe.getObject(obj, j), m22714l(i4));
                        i5 += m6384a;
                        break;
                    }
                case 10:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        object = unsafe.getObject(obj, j);
                        int m6384a52 = w78.m6384a(i8 << 3);
                        int mo2805f2 = ((y68) object).mo2805f();
                        m6384a3 = m6384a52 + w78.m6384a(mo2805f2) + mo2805f2;
                        i5 += m6384a3;
                        break;
                    }
                case 11:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i2 = unsafe.getInt(obj, j);
                        m6384a2 = w78.m6384a(i8 << 3);
                        m6386C = w78.m6384a(i2);
                        m6384a3 = m6384a2 + m6386C;
                        i5 += m6384a3;
                        break;
                    }
                case 12:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    int i112 = unsafe.getInt(obj, j);
                    m6384a2 = w78.m6384a(i8 << 3);
                    m6386C = w78.m6359z(i112);
                    m6384a3 = m6384a2 + m6386C;
                    i5 += m6384a3;
                    break;
                case 13:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    m6384a = w78.m6384a(i8 << 3) + 4;
                    i5 += m6384a;
                    break;
                case 14:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    m6384a = w78.m6384a(i8 << 3) + 8;
                    i5 += m6384a;
                    break;
                case 15:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i12 = unsafe.getInt(obj, j);
                        m6384a2 = w78.m6384a(i8 << 3);
                        i2 = (i12 >> 31) ^ (i12 + i12);
                        m6386C = w78.m6384a(i2);
                        m6384a3 = m6384a2 + m6386C;
                        i5 += m6384a3;
                        break;
                    }
                case 16:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        i5 += w78.m6384a(i8 << 3) + w78.m6383b((j2 >> 63) ^ (j2 + j2));
                        break;
                    }
                case 17:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        m6384a = w78.m6360y(i8, (zd8) unsafe.getObject(obj, j), m22714l(i4));
                        i5 += m6384a;
                        break;
                    }
                case 18:
                case 23:
                    m6384a = ze8.m2408J(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m6384a;
                    break;
                case 19:
                case 24:
                    m6384a = ze8.m2410H(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m6384a;
                    break;
                case 20:
                    m6384a = ze8.m2403O(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m6384a;
                    break;
                case 21:
                    m6384a = ze8.m2392Z(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m6384a;
                    break;
                case 22:
                    m6384a = ze8.m2405M(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m6384a;
                    break;
                case 25:
                    m6384a = ze8.m2417A(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m6384a;
                    break;
                case 26:
                    m2395W = ze8.m2395W(i8, (List) unsafe.getObject(obj, j));
                    i5 += m2395W;
                    break;
                case 27:
                    m2395W = ze8.m2400R(i8, (List) unsafe.getObject(obj, j), m22714l(i4));
                    i5 += m2395W;
                    break;
                case 28:
                    m2395W = ze8.m2413E(i8, (List) unsafe.getObject(obj, j));
                    i5 += m2395W;
                    break;
                case 29:
                    m2395W = ze8.m2394X(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m2395W;
                    break;
                case 30:
                    m2395W = ze8.m2412F(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m2395W;
                    break;
                case 31:
                    m2395W = ze8.m2410H(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m2395W;
                    break;
                case 32:
                    m2395W = ze8.m2408J(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m2395W;
                    break;
                case 33:
                    m2395W = ze8.m2399S(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m2395W;
                    break;
                case 34:
                    m2395W = ze8.m2397U(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m2395W;
                    break;
                case 35:
                    m2407K = ze8.m2407K((List) unsafe.getObject(obj, j));
                    break;
                case 36:
                    m2407K = ze8.m2409I((List) unsafe.getObject(obj, j));
                    break;
                case 37:
                    m2407K = ze8.m2402P((List) unsafe.getObject(obj, j));
                    break;
                case 38:
                    m2407K = ze8.m2390a0((List) unsafe.getObject(obj, j));
                    break;
                case 39:
                    m2407K = ze8.m2404N((List) unsafe.getObject(obj, j));
                    break;
                case 40:
                    m2407K = ze8.m2407K((List) unsafe.getObject(obj, j));
                    break;
                case 41:
                    m2407K = ze8.m2409I((List) unsafe.getObject(obj, j));
                    break;
                case 42:
                    m2407K = ze8.m2414D((List) unsafe.getObject(obj, j));
                    break;
                case 43:
                    m2407K = ze8.m2393Y((List) unsafe.getObject(obj, j));
                    break;
                case 44:
                    m2407K = ze8.m2411G((List) unsafe.getObject(obj, j));
                    break;
                case 45:
                    m2407K = ze8.m2409I((List) unsafe.getObject(obj, j));
                    break;
                case 46:
                    m2407K = ze8.m2407K((List) unsafe.getObject(obj, j));
                    break;
                case 47:
                    m2407K = ze8.m2398T((List) unsafe.getObject(obj, j));
                    break;
                case 48:
                    m2407K = ze8.m2396V((List) unsafe.getObject(obj, j));
                    break;
                case 49:
                    m2395W = ze8.m2406L(i8, (List) unsafe.getObject(obj, j), m22714l(i4));
                    i5 += m2395W;
                    break;
                case 50:
                    pd8.m13433a(i8, unsafe.getObject(obj, j), m22713m(i4));
                    break;
                case 58:
                    if (m22738E(obj, i8, i4)) {
                        m2395W = w78.m6384a(i8 << 3) + 1;
                        i5 += m2395W;
                    }
                    break;
                case 59:
                    if (m22738E(obj, i8, i4)) {
                        object2 = unsafe.getObject(obj, j);
                        if (!(object2 instanceof y68)) {
                            m6385D = w78.m6384a(i8 << 3);
                            m2407K = w78.m6386C((String) object2);
                            m6384a4 = m6385D + m2407K;
                            i5 += m6384a4;
                        }
                        int m6384a6 = w78.m6384a(i8 << 3);
                        int mo2805f3 = ((y68) object2).mo2805f();
                        m6384a4 = m6384a6 + w78.m6384a(mo2805f3) + mo2805f3;
                        i5 += m6384a4;
                    }
                    break;
                case 60:
                    if (m22738E(obj, i8, i4)) {
                        m2395W = ze8.m2401Q(i8, unsafe.getObject(obj, j), m22714l(i4));
                        i5 += m2395W;
                    }
                    break;
                case 61:
                    if (m22738E(obj, i8, i4)) {
                        object2 = unsafe.getObject(obj, j);
                        int m6384a62 = w78.m6384a(i8 << 3);
                        int mo2805f32 = ((y68) object2).mo2805f();
                        m6384a4 = m6384a62 + w78.m6384a(mo2805f32) + mo2805f32;
                        i5 += m6384a4;
                    }
                    break;
                case 62:
                    if (m22738E(obj, i8, i4)) {
                        m22727P = m22727P(obj, j);
                        m6385D = w78.m6384a(i8 << 3);
                        m2407K = w78.m6384a(m22727P);
                        m6384a4 = m6385D + m2407K;
                        i5 += m6384a4;
                    }
                    break;
                case 66:
                    if (m22738E(obj, i8, i4)) {
                        int m22727P2 = m22727P(obj, j);
                        m6385D = w78.m6384a(i8 << 3);
                        m22727P = (m22727P2 >> 31) ^ (m22727P2 + m22727P2);
                        m2407K = w78.m6384a(m22727P);
                        m6384a4 = m6385D + m2407K;
                        i5 += m6384a4;
                    }
                    break;
                case 67:
                    if (m22738E(obj, i8, i4)) {
                        long m22716j = m22716j(obj, j);
                        i5 += w78.m6384a(i8 << 3) + w78.m6383b((m22716j >> 63) ^ (m22716j + m22716j));
                    }
                    break;
                case 68:
                    if (m22738E(obj, i8, i4)) {
                        m2395W = w78.m6360y(i8, (zd8) unsafe.getObject(obj, j), m22714l(i4));
                        i5 += m2395W;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        og8 og8Var = this.f9515l;
        int mo10364a = i5 + og8Var.mo10364a(og8Var.mo10361d(obj));
        if (this.f9509f) {
            this.f9516m.mo11576a(obj);
            throw null;
        }
        return mo10364a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x030e, code lost:
        if ((r4 instanceof com.daaw.y68) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0311, code lost:
        r5 = com.daaw.w78.m6384a(r6 << 3);
        r4 = com.daaw.w78.m6386C((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
        if ((r4 instanceof com.daaw.y68) != false) goto L53;
     */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m22728O(Object obj) {
        long m19804i;
        Object m19802k;
        int m19805h;
        int m19805h2;
        int m19805h3;
        long m19804i2;
        int m2408J;
        int m2407K;
        int m6385D;
        int m6384a;
        Unsafe unsafe = f9503q;
        int i = 0;
        for (int i2 = 0; i2 < this.f9504a.length; i2 += 3) {
            int m22717i = m22717i(i2);
            int m22718h = m22718h(m22717i);
            int i3 = this.f9504a[i2];
            long j = m22717i & 1048575;
            if (m22718h >= d98.f6677b0.zza() && m22718h <= d98.f6690o0.zza()) {
                int i4 = this.f9504a[i2 + 2];
            }
            switch (m22718h) {
                case 0:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 8;
                    break;
                case 1:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 4;
                    break;
                case 2:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m19804i = ih8.m19804i(obj, j);
                    i += w78.m6384a(i3 << 3) + w78.m6383b(m19804i);
                case 3:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m19804i = ih8.m19804i(obj, j);
                    i += w78.m6384a(i3 << 3) + w78.m6383b(m19804i);
                case 4:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m19805h2 = ih8.m19805h(obj, j);
                    m6385D = w78.m6384a(i3 << 3);
                    m2407K = w78.m6359z(m19805h2);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 5:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 8;
                    break;
                case 6:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 4;
                    break;
                case 7:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 1;
                    break;
                case 8:
                    if (m22742A(obj, i2)) {
                        m19802k = ih8.m19802k(obj, j);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m2408J = ze8.m2401Q(i3, ih8.m19802k(obj, j), m22714l(i2));
                    break;
                case 10:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m19802k = ih8.m19802k(obj, j);
                    int m6384a2 = w78.m6384a(i3 << 3);
                    int mo2805f = ((y68) m19802k).mo2805f();
                    m6384a = m6384a2 + w78.m6384a(mo2805f) + mo2805f;
                    i += m6384a;
                case 11:
                    if (m22742A(obj, i2)) {
                        m19805h = ih8.m19805h(obj, j);
                        m6385D = w78.m6384a(i3 << 3);
                        m2407K = w78.m6384a(m19805h);
                        m6384a = m6385D + m2407K;
                        i += m6384a;
                    } else {
                        continue;
                    }
                case 12:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m19805h2 = ih8.m19805h(obj, j);
                    m6385D = w78.m6384a(i3 << 3);
                    m2407K = w78.m6359z(m19805h2);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 13:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 4;
                    break;
                case 14:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 8;
                    break;
                case 15:
                    if (m22742A(obj, i2)) {
                        m19805h3 = ih8.m19805h(obj, j);
                        m6385D = w78.m6384a(i3 << 3);
                        m19805h = (m19805h3 >> 31) ^ (m19805h3 + m19805h3);
                        m2407K = w78.m6384a(m19805h);
                        m6384a = m6385D + m2407K;
                        i += m6384a;
                    } else {
                        continue;
                    }
                case 16:
                    if (m22742A(obj, i2)) {
                        m19804i2 = ih8.m19804i(obj, j);
                        m6385D = w78.m6384a(i3 << 3);
                        m2407K = w78.m6383b((m19804i2 >> 63) ^ (m19804i2 + m19804i2));
                        m6384a = m6385D + m2407K;
                        i += m6384a;
                    } else {
                        continue;
                    }
                case 17:
                    if (!m22742A(obj, i2)) {
                        continue;
                    }
                    m2408J = w78.m6360y(i3, (zd8) ih8.m19802k(obj, j), m22714l(i2));
                    break;
                case 18:
                case 23:
                case 32:
                    m2408J = ze8.m2408J(i3, (List) ih8.m19802k(obj, j), false);
                    break;
                case 19:
                case 24:
                case 31:
                    m2408J = ze8.m2410H(i3, (List) ih8.m19802k(obj, j), false);
                    break;
                case 20:
                    m2408J = ze8.m2403O(i3, (List) ih8.m19802k(obj, j), false);
                    break;
                case 21:
                    m2408J = ze8.m2392Z(i3, (List) ih8.m19802k(obj, j), false);
                    break;
                case 22:
                    m2408J = ze8.m2405M(i3, (List) ih8.m19802k(obj, j), false);
                    break;
                case 25:
                    m2408J = ze8.m2417A(i3, (List) ih8.m19802k(obj, j), false);
                    break;
                case 26:
                    m2408J = ze8.m2395W(i3, (List) ih8.m19802k(obj, j));
                    break;
                case 27:
                    m2408J = ze8.m2400R(i3, (List) ih8.m19802k(obj, j), m22714l(i2));
                    break;
                case 28:
                    m2408J = ze8.m2413E(i3, (List) ih8.m19802k(obj, j));
                    break;
                case 29:
                    m2408J = ze8.m2394X(i3, (List) ih8.m19802k(obj, j), false);
                    break;
                case 30:
                    m2408J = ze8.m2412F(i3, (List) ih8.m19802k(obj, j), false);
                    break;
                case 33:
                    m2408J = ze8.m2399S(i3, (List) ih8.m19802k(obj, j), false);
                    break;
                case 34:
                    m2408J = ze8.m2397U(i3, (List) ih8.m19802k(obj, j), false);
                    break;
                case 35:
                    m2407K = ze8.m2407K((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 36:
                    m2407K = ze8.m2409I((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 37:
                    m2407K = ze8.m2402P((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 38:
                    m2407K = ze8.m2390a0((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 39:
                    m2407K = ze8.m2404N((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 40:
                    m2407K = ze8.m2407K((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 41:
                    m2407K = ze8.m2409I((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 42:
                    m2407K = ze8.m2414D((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 43:
                    m2407K = ze8.m2393Y((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 44:
                    m2407K = ze8.m2411G((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 45:
                    m2407K = ze8.m2409I((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 46:
                    m2407K = ze8.m2407K((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 47:
                    m2407K = ze8.m2398T((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 48:
                    m2407K = ze8.m2396V((List) unsafe.getObject(obj, j));
                    if (m2407K <= 0) {
                        continue;
                    }
                    m6385D = w78.m6385D(i3) + w78.m6384a(m2407K);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 49:
                    m2408J = ze8.m2406L(i3, (List) ih8.m19802k(obj, j), m22714l(i2));
                    break;
                case 50:
                    pd8.m13433a(i3, ih8.m19802k(obj, j), m22713m(i2));
                    continue;
                case 51:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 8;
                    break;
                case 52:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 4;
                    break;
                case 53:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m19804i = m22716j(obj, j);
                    i += w78.m6384a(i3 << 3) + w78.m6383b(m19804i);
                case 54:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m19804i = m22716j(obj, j);
                    i += w78.m6384a(i3 << 3) + w78.m6383b(m19804i);
                case 55:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m19805h2 = m22727P(obj, j);
                    m6385D = w78.m6384a(i3 << 3);
                    m2407K = w78.m6359z(m19805h2);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 56:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 8;
                    break;
                case 57:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 4;
                    break;
                case 58:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 1;
                    break;
                case 59:
                    if (m22738E(obj, i3, i2)) {
                        m19802k = ih8.m19802k(obj, j);
                        break;
                    } else {
                        continue;
                    }
                case 60:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m2408J = ze8.m2401Q(i3, ih8.m19802k(obj, j), m22714l(i2));
                    break;
                case 61:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m19802k = ih8.m19802k(obj, j);
                    int m6384a22 = w78.m6384a(i3 << 3);
                    int mo2805f2 = ((y68) m19802k).mo2805f();
                    m6384a = m6384a22 + w78.m6384a(mo2805f2) + mo2805f2;
                    i += m6384a;
                case 62:
                    if (m22738E(obj, i3, i2)) {
                        m19805h = m22727P(obj, j);
                        m6385D = w78.m6384a(i3 << 3);
                        m2407K = w78.m6384a(m19805h);
                        m6384a = m6385D + m2407K;
                        i += m6384a;
                    } else {
                        continue;
                    }
                case 63:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m19805h2 = m22727P(obj, j);
                    m6385D = w78.m6384a(i3 << 3);
                    m2407K = w78.m6359z(m19805h2);
                    m6384a = m6385D + m2407K;
                    i += m6384a;
                case 64:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 4;
                    break;
                case 65:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m2408J = w78.m6384a(i3 << 3) + 8;
                    break;
                case 66:
                    if (m22738E(obj, i3, i2)) {
                        m19805h3 = m22727P(obj, j);
                        m6385D = w78.m6384a(i3 << 3);
                        m19805h = (m19805h3 >> 31) ^ (m19805h3 + m19805h3);
                        m2407K = w78.m6384a(m19805h);
                        m6384a = m6385D + m2407K;
                        i += m6384a;
                    } else {
                        continue;
                    }
                case 67:
                    if (m22738E(obj, i3, i2)) {
                        m19804i2 = m22716j(obj, j);
                        m6385D = w78.m6384a(i3 << 3);
                        m2407K = w78.m6383b((m19804i2 >> 63) ^ (m19804i2 + m19804i2));
                        m6384a = m6385D + m2407K;
                        i += m6384a;
                    } else {
                        continue;
                    }
                case 68:
                    if (!m22738E(obj, i3, i2)) {
                        continue;
                    }
                    m2408J = w78.m6360y(i3, (zd8) ih8.m19802k(obj, j), m22714l(i2));
                    break;
                default:
            }
            i += m2408J;
        }
        og8 og8Var = this.f9515l;
        return i + og8Var.mo10364a(og8Var.mo10361d(obj));
    }

    /* renamed from: Q */
    public final int m22726Q(Object obj, byte[] bArr, int i, int i2, int i3, long j, e58 e58Var) {
        Unsafe unsafe = f9503q;
        Object m22713m = m22713m(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((nd8) object).m15213e()) {
            nd8 m15216b = nd8.m15217a().m15216b();
            pd8.m13432b(m15216b, object);
            unsafe.putObject(obj, j, m15216b);
        }
        ld8 ld8Var = (ld8) m22713m;
        throw null;
    }

    /* renamed from: R */
    public final int m22725R(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, e58 e58Var) {
        Unsafe unsafe = f9503q;
        long j2 = this.f9504a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(h58.m21002p(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(h58.m21016b(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m21005m = h58.m21005m(bArr, i, e58Var);
                    unsafe.putObject(obj, j, Long.valueOf(e58Var.f8131b));
                    unsafe.putInt(obj, j2, i4);
                    return m21005m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m21008j = h58.m21008j(bArr, i, e58Var);
                    unsafe.putObject(obj, j, Integer.valueOf(e58Var.f8130a));
                    unsafe.putInt(obj, j2, i4);
                    return m21008j;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(h58.m21002p(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(h58.m21016b(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m21005m2 = h58.m21005m(bArr, i, e58Var);
                    unsafe.putObject(obj, j, Boolean.valueOf(e58Var.f8131b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return m21005m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int m21008j2 = h58.m21008j(bArr, i, e58Var);
                    int i9 = e58Var.f8130a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !ei8.m23446f(bArr, m21008j2, m21008j2 + i9)) {
                        throw mb8.m16107c();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m21008j2, i9, gb8.f11017b));
                        m21008j2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m21008j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object m22711o = m22711o(obj, i4, i8);
                    int m21003o = h58.m21003o(m22711o, m22714l(i8), bArr, i, i2, e58Var);
                    m22703w(obj, i4, i8, m22711o);
                    return m21003o;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m21017a = h58.m21017a(bArr, i, e58Var);
                    unsafe.putObject(obj, j, e58Var.f8132c);
                    unsafe.putInt(obj, j2, i4);
                    return m21017a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m21008j3 = h58.m21008j(bArr, i, e58Var);
                    int i10 = e58Var.f8130a;
                    ua8 m22715k = m22715k(i8);
                    if (m22715k == null || m22715k.mo8358a(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        m22734I(obj).m12537j(i3, Long.valueOf(i10));
                    }
                    return m21008j3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int m21008j4 = h58.m21008j(bArr, i, e58Var);
                    unsafe.putObject(obj, j, Integer.valueOf(k78.m17983a(e58Var.f8130a)));
                    unsafe.putInt(obj, j2, i4);
                    return m21008j4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m21005m3 = h58.m21005m(bArr, i, e58Var);
                    unsafe.putObject(obj, j, Long.valueOf(k78.m17982b(e58Var.f8131b)));
                    unsafe.putInt(obj, j2, i4);
                    return m21005m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object m22711o2 = m22711o(obj, i4, i8);
                    int m21004n = h58.m21004n(m22711o2, m22714l(i8), bArr, i, i2, (i3 & (-8)) | 4, e58Var);
                    m22703w(obj, i4, i8, m22711o2);
                    return m21004n;
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
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m22724S(Object obj, byte[] bArr, int i, int i2, e58 e58Var) {
        byte b;
        int i3;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        Unsafe unsafe2;
        int i7;
        Unsafe unsafe3;
        int i8;
        fe8<T> fe8Var;
        Unsafe unsafe4;
        int i9;
        int i10;
        int i11;
        fe8<T> fe8Var2 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i12 = i2;
        e58 e58Var2 = e58Var;
        m22709q(obj);
        Unsafe unsafe5 = f9503q;
        int i13 = -1;
        int i14 = 1048575;
        int i15 = i;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1048575;
        while (i15 < i12) {
            int i20 = i15 + 1;
            byte b2 = bArr2[i15];
            if (b2 < 0) {
                i3 = h58.m21007k(b2, bArr2, i20, e58Var2);
                b = e58Var2.f8130a;
            } else {
                b = b2;
                i3 = i20;
            }
            int i21 = b >>> 3;
            int i22 = b & 7;
            int m22721V = i21 > i16 ? fe8Var2.m22721V(i21, i17 / 3) : fe8Var2.m22722U(i21);
            if (m22721V == i13) {
                i4 = i3;
                i5 = i21;
                unsafe = unsafe5;
                i6 = 0;
            } else {
                int[] iArr = fe8Var2.f9504a;
                int i23 = iArr[m22721V + 1];
                int m22718h = m22718h(i23);
                Unsafe unsafe6 = unsafe5;
                long j = i23 & i14;
                if (m22718h <= 17) {
                    int i24 = iArr[m22721V + 2];
                    int i25 = 1 << (i24 >>> 20);
                    int i26 = i24 & 1048575;
                    if (i26 != i19) {
                        if (i19 != 1048575) {
                            long j2 = i19;
                            unsafe4 = unsafe6;
                            unsafe4.putInt(obj2, j2, i18);
                        } else {
                            unsafe4 = unsafe6;
                        }
                        if (i26 != 1048575) {
                            i18 = unsafe4.getInt(obj2, i26);
                        }
                        unsafe2 = unsafe4;
                        i19 = i26;
                    } else {
                        unsafe2 = unsafe6;
                    }
                    switch (m22718h) {
                        case 0:
                            fe8Var = this;
                            i5 = i21;
                            i6 = m22721V;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 1) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                ih8.m19793t(obj2, j, Double.longBitsToDouble(h58.m21002p(bArr2, i3)));
                                i15 = i3 + 8;
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                fe8Var2 = fe8Var;
                                i12 = i2;
                                break;
                            }
                        case 1:
                            fe8Var = this;
                            i5 = i21;
                            i6 = m22721V;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 5) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                ih8.m19792u(obj2, j, Float.intBitsToFloat(h58.m21016b(bArr2, i3)));
                                i15 = i3 + 4;
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                fe8Var2 = fe8Var;
                                i12 = i2;
                                break;
                            }
                        case 2:
                        case 3:
                            fe8Var = this;
                            i5 = i21;
                            i6 = m22721V;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 0) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                int m21005m = h58.m21005m(bArr2, i3, e58Var2);
                                unsafe3.putLong(obj, j, e58Var2.f8131b);
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i15 = m21005m;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                fe8Var2 = fe8Var;
                                i12 = i2;
                                break;
                            }
                        case 4:
                        case 11:
                            fe8Var = this;
                            i5 = i21;
                            i6 = m22721V;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 0) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                i15 = h58.m21008j(bArr2, i3, e58Var2);
                                unsafe3.putInt(obj2, j, e58Var2.f8130a);
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                fe8Var2 = fe8Var;
                                i12 = i2;
                                break;
                            }
                        case 5:
                        case 14:
                            fe8Var = this;
                            i5 = i21;
                            i6 = m22721V;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 1) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                unsafe3.putLong(obj, j, h58.m21002p(bArr2, i3));
                                i15 = i3 + 8;
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                fe8Var2 = fe8Var;
                                i12 = i2;
                                break;
                            }
                        case 6:
                        case 13:
                            fe8Var = this;
                            i5 = i21;
                            i6 = m22721V;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 5) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                unsafe3.putInt(obj2, j, h58.m21016b(bArr2, i3));
                                i15 = i3 + 4;
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                fe8Var2 = fe8Var;
                                i12 = i2;
                                break;
                            }
                        case 7:
                            fe8Var = this;
                            i5 = i21;
                            i6 = m22721V;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 0) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                i15 = h58.m21005m(bArr2, i3, e58Var2);
                                ih8.m19795r(obj2, j, e58Var2.f8131b != 0);
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                fe8Var2 = fe8Var;
                                i12 = i2;
                                break;
                            }
                        case 8:
                            fe8Var = this;
                            i5 = i21;
                            i6 = m22721V;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 2) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                i15 = (i23 & 536870912) == 0 ? h58.m21011g(bArr2, i3, e58Var2) : h58.m21010h(bArr2, i3, e58Var2);
                                unsafe3.putObject(obj2, j, e58Var2.f8132c);
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                fe8Var2 = fe8Var;
                                i12 = i2;
                                break;
                            }
                        case 9:
                            i5 = i21;
                            i6 = m22721V;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 2) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                fe8Var = this;
                                Object m22712n = fe8Var.m22712n(obj2, i6);
                                i15 = h58.m21003o(m22712n, fe8Var.m22714l(i6), bArr, i3, i2, e58Var);
                                fe8Var.m22704v(obj2, i6, m22712n);
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                fe8Var2 = fe8Var;
                                i12 = i2;
                                break;
                            }
                        case 10:
                            i5 = i21;
                            i6 = m22721V;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 == 2) {
                                i15 = h58.m21017a(bArr2, i3, e58Var2);
                                unsafe3.putObject(obj2, j, e58Var2.f8132c);
                                i18 |= i25;
                                i12 = i2;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                fe8Var2 = this;
                                break;
                            }
                            i4 = i3;
                            unsafe = unsafe3;
                            i19 = i7;
                            break;
                        case 12:
                            i5 = i21;
                            i6 = m22721V;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 == 0) {
                                i15 = h58.m21008j(bArr2, i3, e58Var2);
                                i8 = e58Var2.f8130a;
                                unsafe3.putInt(obj2, j, i8);
                                i18 |= i25;
                                i12 = i2;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                fe8Var2 = this;
                                break;
                            }
                            i4 = i3;
                            unsafe = unsafe3;
                            i19 = i7;
                            break;
                        case 15:
                            i5 = i21;
                            i6 = m22721V;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 == 0) {
                                i15 = h58.m21008j(bArr2, i3, e58Var2);
                                i8 = k78.m17983a(e58Var2.f8130a);
                                unsafe3.putInt(obj2, j, i8);
                                i18 |= i25;
                                i12 = i2;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                fe8Var2 = this;
                                break;
                            }
                            i4 = i3;
                            unsafe = unsafe3;
                            i19 = i7;
                            break;
                        case 16:
                            if (i22 != 0) {
                                i5 = i21;
                                i6 = m22721V;
                                i7 = i19;
                                unsafe3 = unsafe2;
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                int m21005m2 = h58.m21005m(bArr2, i3, e58Var2);
                                unsafe2.putLong(obj, j, k78.m17982b(e58Var2.f8131b));
                                i18 |= i25;
                                unsafe5 = unsafe2;
                                i15 = m21005m2;
                                i17 = m22721V;
                                i19 = i19;
                                i16 = i21;
                                i14 = 1048575;
                                i13 = -1;
                                fe8Var2 = this;
                                i12 = i2;
                                break;
                            }
                        default:
                            i5 = i21;
                            i6 = m22721V;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            i4 = i3;
                            unsafe = unsafe3;
                            i19 = i7;
                            break;
                    }
                } else {
                    i5 = i21;
                    int i27 = i19;
                    fe8<T> fe8Var3 = fe8Var2;
                    i6 = m22721V;
                    if (m22718h != 27) {
                        if (m22718h <= 49) {
                            int i28 = i3;
                            i10 = i18;
                            i11 = i27;
                            unsafe = unsafe6;
                            i15 = m22723T(obj, bArr, i3, i2, b, i5, i22, i6, i23, m22718h, j, e58Var);
                        } else {
                            i9 = i3;
                            i10 = i18;
                            unsafe = unsafe6;
                            i11 = i27;
                            if (m22718h != 50) {
                                i15 = m22725R(obj, bArr, i9, i2, b, i5, i22, i23, m22718h, j, i6, e58Var);
                            } else if (i22 == 2) {
                                i15 = m22726Q(obj, bArr, i9, i2, i6, j, e58Var);
                            }
                        }
                        i14 = 1048575;
                        i13 = -1;
                        fe8Var2 = this;
                    } else if (i22 == 2) {
                        db8 db8Var = (db8) unsafe6.getObject(obj2, j);
                        if (!db8Var.zzc()) {
                            int size = db8Var.size();
                            db8Var = db8Var.mo5295b(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj2, j, db8Var);
                        }
                        i15 = h58.m21013e(fe8Var3.m22714l(i6), b, bArr, i3, i2, db8Var, e58Var);
                        i12 = i2;
                        unsafe5 = unsafe6;
                        i18 = i18;
                        i17 = i6;
                        i19 = i27;
                        i16 = i5;
                        i14 = 1048575;
                        fe8Var2 = fe8Var3;
                        i13 = -1;
                    } else {
                        i9 = i3;
                        i10 = i18;
                        unsafe = unsafe6;
                        i11 = i27;
                    }
                    i4 = i9;
                    i18 = i10;
                    i19 = i11;
                    i15 = h58.m21009i(b, bArr, i4, i2, m22734I(obj), e58Var);
                    obj2 = obj;
                    bArr2 = bArr;
                    i12 = i2;
                    e58Var2 = e58Var;
                    i17 = i6;
                    i16 = i5;
                    unsafe5 = unsafe;
                    i14 = 1048575;
                    i13 = -1;
                    fe8Var2 = this;
                }
            }
            i15 = h58.m21009i(b, bArr, i4, i2, m22734I(obj), e58Var);
            obj2 = obj;
            bArr2 = bArr;
            i12 = i2;
            e58Var2 = e58Var;
            i17 = i6;
            i16 = i5;
            unsafe5 = unsafe;
            i14 = 1048575;
            i13 = -1;
            fe8Var2 = this;
        }
        int i29 = i18;
        Unsafe unsafe7 = unsafe5;
        if (i19 != 1048575) {
            unsafe7.putInt(obj, i19, i29);
        }
        if (i15 == i2) {
            return i15;
        }
        throw mb8.m16105e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x024c, code lost:
        if (r29.f8131b != 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x024e, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0250, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0251, code lost:
        r12.m18041e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0254, code lost:
        if (r4 >= r19) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0256, code lost:
        r6 = com.daaw.h58.m21008j(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x025c, code lost:
        if (r20 == r29.f8130a) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x025f, code lost:
        r4 = com.daaw.h58.m21005m(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0267, code lost:
        if (r29.f8131b == 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x026a, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (r4 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
        r12.add(com.daaw.y68.f33399q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        r12.add(com.daaw.y68.m4063q(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        if (r1 >= r19) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r4 = com.daaw.h58.m21008j(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
        if (r20 == r29.f8130a) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
        r1 = com.daaw.h58.m21008j(r17, r4, r29);
        r4 = r29.f8130a;
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
        throw com.daaw.mb8.m16104f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        throw com.daaw.mb8.m16106d();
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
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m22723T(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, e58 e58Var) {
        int i8;
        int i9;
        int i10;
        int i11;
        int m21008j;
        int i12 = i;
        Unsafe unsafe = f9503q;
        db8 db8Var = (db8) unsafe.getObject(obj, j2);
        if (!db8Var.zzc()) {
            int size = db8Var.size();
            db8Var = db8Var.mo5295b(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, db8Var);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    c88 c88Var = (c88) db8Var;
                    int m21008j2 = h58.m21008j(bArr, i12, e58Var);
                    int i13 = e58Var.f8130a + m21008j2;
                    while (m21008j2 < i13) {
                        c88Var.m25509e(Double.longBitsToDouble(h58.m21002p(bArr, m21008j2)));
                        m21008j2 += 8;
                    }
                    if (m21008j2 == i13) {
                        return m21008j2;
                    }
                    throw mb8.m16104f();
                }
                if (i5 == 1) {
                    c88 c88Var2 = (c88) db8Var;
                    long m21002p = h58.m21002p(bArr, i);
                    while (true) {
                        c88Var2.m25509e(Double.longBitsToDouble(m21002p));
                        i8 = i12 + 8;
                        if (i8 < i2) {
                            i12 = h58.m21008j(bArr, i8, e58Var);
                            if (i3 == e58Var.f8130a) {
                                m21002p = h58.m21002p(bArr, i12);
                            }
                        }
                    }
                    return i8;
                }
                return i12;
            case 19:
            case 36:
                if (i5 == 2) {
                    g98 g98Var = (g98) db8Var;
                    int m21008j3 = h58.m21008j(bArr, i12, e58Var);
                    int i14 = e58Var.f8130a + m21008j3;
                    while (m21008j3 < i14) {
                        g98Var.m21877e(Float.intBitsToFloat(h58.m21016b(bArr, m21008j3)));
                        m21008j3 += 4;
                    }
                    if (m21008j3 == i14) {
                        return m21008j3;
                    }
                    throw mb8.m16104f();
                }
                if (i5 == 5) {
                    g98 g98Var2 = (g98) db8Var;
                    int m21016b = h58.m21016b(bArr, i);
                    while (true) {
                        g98Var2.m21877e(Float.intBitsToFloat(m21016b));
                        i9 = i12 + 4;
                        if (i9 < i2) {
                            i12 = h58.m21008j(bArr, i9, e58Var);
                            if (i3 == e58Var.f8130a) {
                                m21016b = h58.m21016b(bArr, i12);
                            }
                        }
                    }
                    return i9;
                }
                return i12;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    cd8 cd8Var = (cd8) db8Var;
                    int m21008j4 = h58.m21008j(bArr, i12, e58Var);
                    int i15 = e58Var.f8130a + m21008j4;
                    while (m21008j4 < i15) {
                        m21008j4 = h58.m21005m(bArr, m21008j4, e58Var);
                        cd8Var.m25414f(e58Var.f8131b);
                    }
                    if (m21008j4 == i15) {
                        return m21008j4;
                    }
                    throw mb8.m16104f();
                }
                if (i5 == 0) {
                    cd8 cd8Var2 = (cd8) db8Var;
                    do {
                        int m21005m = h58.m21005m(bArr, i12, e58Var);
                        cd8Var2.m25414f(e58Var.f8131b);
                        if (m21005m < i2) {
                            i12 = h58.m21008j(bArr, m21005m, e58Var);
                        }
                        return m21005m;
                    } while (i3 == e58Var.f8130a);
                    return m21005m;
                }
                return i12;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return h58.m21012f(bArr, i12, db8Var, e58Var);
                }
                if (i5 == 0) {
                    return h58.m21006l(i3, bArr, i, i2, db8Var, e58Var);
                }
                return i12;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    cd8 cd8Var3 = (cd8) db8Var;
                    int m21008j5 = h58.m21008j(bArr, i12, e58Var);
                    int i16 = e58Var.f8130a + m21008j5;
                    while (m21008j5 < i16) {
                        cd8Var3.m25414f(h58.m21002p(bArr, m21008j5));
                        m21008j5 += 8;
                    }
                    if (m21008j5 == i16) {
                        return m21008j5;
                    }
                    throw mb8.m16104f();
                }
                if (i5 == 1) {
                    cd8 cd8Var4 = (cd8) db8Var;
                    long m21002p2 = h58.m21002p(bArr, i);
                    while (true) {
                        cd8Var4.m25414f(m21002p2);
                        i10 = i12 + 8;
                        if (i10 < i2) {
                            i12 = h58.m21008j(bArr, i10, e58Var);
                            if (i3 == e58Var.f8130a) {
                                m21002p2 = h58.m21002p(bArr, i12);
                            }
                        }
                    }
                    return i10;
                }
                return i12;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    ma8 ma8Var = (ma8) db8Var;
                    int m21008j6 = h58.m21008j(bArr, i12, e58Var);
                    int i17 = e58Var.f8130a + m21008j6;
                    while (m21008j6 < i17) {
                        ma8Var.m16123i(h58.m21016b(bArr, m21008j6));
                        m21008j6 += 4;
                    }
                    if (m21008j6 == i17) {
                        return m21008j6;
                    }
                    throw mb8.m16104f();
                }
                if (i5 == 5) {
                    ma8 ma8Var2 = (ma8) db8Var;
                    int m21016b2 = h58.m21016b(bArr, i);
                    while (true) {
                        ma8Var2.m16123i(m21016b2);
                        i11 = i12 + 4;
                        if (i11 < i2) {
                            i12 = h58.m21008j(bArr, i11, e58Var);
                            if (i3 == e58Var.f8130a) {
                                m21016b2 = h58.m21016b(bArr, i12);
                            }
                        }
                    }
                    return i11;
                }
                return i12;
            case 25:
            case 42:
                if (i5 != 2) {
                    if (i5 == 0) {
                        k58 k58Var = (k58) db8Var;
                        int m21005m2 = h58.m21005m(bArr, i12, e58Var);
                        break;
                    }
                    return i12;
                }
                k58 k58Var2 = (k58) db8Var;
                m21008j = h58.m21008j(bArr, i12, e58Var);
                int i18 = e58Var.f8130a + m21008j;
                while (m21008j < i18) {
                    m21008j = h58.m21005m(bArr, m21008j, e58Var);
                    k58Var2.m18041e(e58Var.f8131b != 0);
                }
                if (m21008j != i18) {
                    throw mb8.m16104f();
                }
                return m21008j;
            case 26:
                if (i5 == 2) {
                    int i19 = ((j & 536870912) > 0L ? 1 : ((j & 536870912) == 0L ? 0 : -1));
                    i12 = h58.m21008j(bArr, i12, e58Var);
                    if (i19 == 0) {
                        int i20 = e58Var.f8130a;
                        if (i20 < 0) {
                            throw mb8.m16106d();
                        }
                        if (i20 != 0) {
                            String str = new String(bArr, i12, i20, gb8.f11017b);
                            db8Var.add(str);
                            i12 += i20;
                            if (i12 < i2) {
                                int m21008j7 = h58.m21008j(bArr, i12, e58Var);
                                if (i3 == e58Var.f8130a) {
                                    i12 = h58.m21008j(bArr, m21008j7, e58Var);
                                    i20 = e58Var.f8130a;
                                    if (i20 < 0) {
                                        throw mb8.m16106d();
                                    }
                                    if (i20 != 0) {
                                        str = new String(bArr, i12, i20, gb8.f11017b);
                                        db8Var.add(str);
                                        i12 += i20;
                                        if (i12 < i2) {
                                        }
                                    }
                                }
                            }
                        }
                        db8Var.add("");
                        if (i12 < i2) {
                        }
                    } else {
                        int i21 = e58Var.f8130a;
                        if (i21 < 0) {
                            throw mb8.m16106d();
                        }
                        if (i21 != 0) {
                            int i22 = i12 + i21;
                            if (!ei8.m23446f(bArr, i12, i22)) {
                                throw mb8.m16107c();
                            }
                            String str2 = new String(bArr, i12, i21, gb8.f11017b);
                            db8Var.add(str2);
                            i12 = i22;
                            if (i12 < i2) {
                                int m21008j8 = h58.m21008j(bArr, i12, e58Var);
                                if (i3 == e58Var.f8130a) {
                                    i12 = h58.m21008j(bArr, m21008j8, e58Var);
                                    int i23 = e58Var.f8130a;
                                    if (i23 < 0) {
                                        throw mb8.m16106d();
                                    }
                                    if (i23 != 0) {
                                        i22 = i12 + i23;
                                        if (!ei8.m23446f(bArr, i12, i22)) {
                                            throw mb8.m16107c();
                                        }
                                        str2 = new String(bArr, i12, i23, gb8.f11017b);
                                        db8Var.add(str2);
                                        i12 = i22;
                                        if (i12 < i2) {
                                        }
                                    }
                                }
                            }
                        }
                        db8Var.add("");
                        if (i12 < i2) {
                        }
                    }
                }
                return i12;
            case 27:
                if (i5 == 2) {
                    return h58.m21013e(m22714l(i6), i3, bArr, i, i2, db8Var, e58Var);
                }
                return i12;
            case 28:
                if (i5 == 2) {
                    int m21008j9 = h58.m21008j(bArr, i12, e58Var);
                    int i24 = e58Var.f8130a;
                    if (i24 < 0) {
                        throw mb8.m16106d();
                    }
                    if (i24 > bArr.length - m21008j9) {
                        throw mb8.m16104f();
                    }
                }
                return i12;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        m21008j = h58.m21006l(i3, bArr, i, i2, db8Var, e58Var);
                    }
                    return i12;
                }
                m21008j = h58.m21012f(bArr, i12, db8Var, e58Var);
                ze8.m2387c(obj, i4, db8Var, m22715k(i6), null, this.f9515l);
                return m21008j;
            case 33:
            case 47:
                if (i5 == 2) {
                    ma8 ma8Var3 = (ma8) db8Var;
                    int m21008j10 = h58.m21008j(bArr, i12, e58Var);
                    int i25 = e58Var.f8130a + m21008j10;
                    while (m21008j10 < i25) {
                        m21008j10 = h58.m21008j(bArr, m21008j10, e58Var);
                        ma8Var3.m16123i(k78.m17983a(e58Var.f8130a));
                    }
                    if (m21008j10 == i25) {
                        return m21008j10;
                    }
                    throw mb8.m16104f();
                }
                if (i5 == 0) {
                    ma8 ma8Var4 = (ma8) db8Var;
                    do {
                        int m21008j11 = h58.m21008j(bArr, i12, e58Var);
                        ma8Var4.m16123i(k78.m17983a(e58Var.f8130a));
                        if (m21008j11 < i2) {
                            i12 = h58.m21008j(bArr, m21008j11, e58Var);
                        }
                        return m21008j11;
                    } while (i3 == e58Var.f8130a);
                    return m21008j11;
                }
                return i12;
            case 34:
            case 48:
                if (i5 == 2) {
                    cd8 cd8Var5 = (cd8) db8Var;
                    int m21008j12 = h58.m21008j(bArr, i12, e58Var);
                    int i26 = e58Var.f8130a + m21008j12;
                    while (m21008j12 < i26) {
                        m21008j12 = h58.m21005m(bArr, m21008j12, e58Var);
                        cd8Var5.m25414f(k78.m17982b(e58Var.f8131b));
                    }
                    if (m21008j12 == i26) {
                        return m21008j12;
                    }
                    throw mb8.m16104f();
                }
                if (i5 == 0) {
                    cd8 cd8Var6 = (cd8) db8Var;
                    do {
                        int m21005m3 = h58.m21005m(bArr, i12, e58Var);
                        cd8Var6.m25414f(k78.m17982b(e58Var.f8131b));
                        if (m21005m3 < i2) {
                            i12 = h58.m21008j(bArr, m21005m3, e58Var);
                        }
                        return m21005m3;
                    } while (i3 == e58Var.f8130a);
                    return m21005m3;
                }
                return i12;
            default:
                if (i5 == 3) {
                    ve8 m22714l = m22714l(i6);
                    int i27 = (i3 & (-8)) | 4;
                    int m21015c = h58.m21015c(m22714l, bArr, i, i2, i27, e58Var);
                    while (true) {
                        db8Var.add(e58Var.f8132c);
                        if (m21015c < i2) {
                            int m21008j13 = h58.m21008j(bArr, m21015c, e58Var);
                            if (i3 == e58Var.f8130a) {
                                m21015c = h58.m21015c(m22714l, bArr, m21008j13, i2, i27, e58Var);
                            }
                        }
                    }
                    return m21015c;
                }
                return i12;
        }
    }

    /* renamed from: U */
    public final int m22722U(int i) {
        if (i < this.f9506c || i > this.f9507d) {
            return -1;
        }
        return m22719X(i, 0);
    }

    /* renamed from: V */
    public final int m22721V(int i, int i2) {
        if (i < this.f9506c || i > this.f9507d) {
            return -1;
        }
        return m22719X(i, i2);
    }

    /* renamed from: W */
    public final int m22720W(int i) {
        return this.f9504a[i + 2];
    }

    /* renamed from: X */
    public final int m22719X(int i, int i2) {
        int length = (this.f9504a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f9504a[i4];
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo7205a(Object obj) {
        int i;
        double m19807f;
        float m19806g;
        long m19804i;
        int m19805h;
        boolean m19816B;
        Object m19802k;
        int length = this.f9504a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m22717i = m22717i(i3);
            int i4 = this.f9504a[i3];
            long j = 1048575 & m22717i;
            int i5 = 37;
            switch (m22718h(m22717i)) {
                case 0:
                    i = i2 * 53;
                    m19807f = ih8.m19807f(obj, j);
                    m19804i = Double.doubleToLongBits(m19807f);
                    m19805h = gb8.m21818c(m19804i);
                    i2 = i + m19805h;
                    break;
                case 1:
                    i = i2 * 53;
                    m19806g = ih8.m19806g(obj, j);
                    m19805h = Float.floatToIntBits(m19806g);
                    i2 = i + m19805h;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i2 * 53;
                    m19804i = ih8.m19804i(obj, j);
                    m19805h = gb8.m21818c(m19804i);
                    i2 = i + m19805h;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i2 * 53;
                    m19805h = ih8.m19805h(obj, j);
                    i2 = i + m19805h;
                    break;
                case 7:
                    i = i2 * 53;
                    m19816B = ih8.m19816B(obj, j);
                    m19805h = gb8.m21820a(m19816B);
                    i2 = i + m19805h;
                    break;
                case 8:
                    i = i2 * 53;
                    m19805h = ((String) ih8.m19802k(obj, j)).hashCode();
                    i2 = i + m19805h;
                    break;
                case 9:
                    m19802k = ih8.m19802k(obj, j);
                    break;
                case 10:
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
                    i = i2 * 53;
                    m19805h = ih8.m19802k(obj, j).hashCode();
                    i2 = i + m19805h;
                    break;
                case 17:
                    m19802k = ih8.m19802k(obj, j);
                    break;
                case 51:
                    if (m22738E(obj, i4, i3)) {
                        i = i2 * 53;
                        m19807f = m22731L(obj, j);
                        m19804i = Double.doubleToLongBits(m19807f);
                        m19805h = gb8.m21818c(m19804i);
                        i2 = i + m19805h;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m22738E(obj, i4, i3)) {
                        i = i2 * 53;
                        m19806g = m22730M(obj, j);
                        m19805h = Float.floatToIntBits(m19806g);
                        i2 = i + m19805h;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19804i = m22716j(obj, j);
                    m19805h = gb8.m21818c(m19804i);
                    i2 = i + m19805h;
                    break;
                case 54:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19804i = m22716j(obj, j);
                    m19805h = gb8.m21818c(m19804i);
                    i2 = i + m19805h;
                    break;
                case 55:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19805h = m22727P(obj, j);
                    i2 = i + m19805h;
                    break;
                case 56:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19804i = m22716j(obj, j);
                    m19805h = gb8.m21818c(m19804i);
                    i2 = i + m19805h;
                    break;
                case 57:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19805h = m22727P(obj, j);
                    i2 = i + m19805h;
                    break;
                case 58:
                    if (m22738E(obj, i4, i3)) {
                        i = i2 * 53;
                        m19816B = m22737F(obj, j);
                        m19805h = gb8.m21820a(m19816B);
                        i2 = i + m19805h;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19805h = ((String) ih8.m19802k(obj, j)).hashCode();
                    i2 = i + m19805h;
                    break;
                case 60:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19805h = ih8.m19802k(obj, j).hashCode();
                    i2 = i + m19805h;
                    break;
                case 61:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19805h = ih8.m19802k(obj, j).hashCode();
                    i2 = i + m19805h;
                    break;
                case 62:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19805h = m22727P(obj, j);
                    i2 = i + m19805h;
                    break;
                case 63:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19805h = m22727P(obj, j);
                    i2 = i + m19805h;
                    break;
                case 64:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19805h = m22727P(obj, j);
                    i2 = i + m19805h;
                    break;
                case 65:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19804i = m22716j(obj, j);
                    m19805h = gb8.m21818c(m19804i);
                    i2 = i + m19805h;
                    break;
                case 66:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19805h = m22727P(obj, j);
                    i2 = i + m19805h;
                    break;
                case 67:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19804i = m22716j(obj, j);
                    m19805h = gb8.m21818c(m19804i);
                    i2 = i + m19805h;
                    break;
                case 68:
                    if (!m22738E(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m19805h = ih8.m19802k(obj, j).hashCode();
                    i2 = i + m19805h;
                    break;
            }
        }
        int hashCode = (i2 * 53) + this.f9515l.mo10361d(obj).hashCode();
        if (this.f9509f) {
            this.f9516m.mo11576a(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.daaw.ve8
    /* renamed from: b */
    public final void mo7204b(Object obj) {
        if (m22739D(obj)) {
            if (obj instanceof ja8) {
                ja8 ja8Var = (ja8) obj;
                ja8Var.m18660w(Integer.MAX_VALUE);
                ja8Var.zzb = 0;
                ja8Var.m18662u();
            }
            int length = this.f9504a.length;
            for (int i = 0; i < length; i += 3) {
                int m22717i = m22717i(i);
                long j = 1048575 & m22717i;
                int m22718h = m22718h(m22717i);
                if (m22718h != 9) {
                    switch (m22718h) {
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
                            this.f9514k.mo2483a(obj, j);
                            continue;
                        case 50:
                            Unsafe unsafe = f9503q;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((nd8) object).m15215c();
                                unsafe.putObject(obj, j, object);
                            } else {
                                continue;
                            }
                        default:
                    }
                }
                if (m22742A(obj, i)) {
                    m22714l(i).mo7204b(f9503q.getObject(obj, j));
                }
            }
            this.f9515l.mo10358g(obj);
            if (this.f9509f) {
                this.f9516m.mo11575b(obj);
            }
        }
    }

    @Override // com.daaw.ve8
    /* renamed from: c */
    public final boolean mo7203c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f9512i) {
            int i6 = this.f9511h[i5];
            int i7 = this.f9504a[i6];
            int m22717i = m22717i(i6);
            int i8 = this.f9504a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f9503q.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m22717i) != 0 && !m22741B(obj, i6, i, i2, i10)) {
                return false;
            }
            int m22718h = m22718h(m22717i);
            if (m22718h != 9 && m22718h != 17) {
                if (m22718h != 27) {
                    if (m22718h == 60 || m22718h == 68) {
                        if (m22738E(obj, i7, i6) && !m22740C(obj, m22717i, m22714l(i6))) {
                            return false;
                        }
                    } else if (m22718h != 49) {
                        if (m22718h == 50 && !((nd8) ih8.m19802k(obj, m22717i & 1048575)).isEmpty()) {
                            ld8 ld8Var = (ld8) m22713m(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) ih8.m19802k(obj, m22717i & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ve8 m22714l = m22714l(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m22714l.mo7203c(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m22741B(obj, i6, i, i2, i10) && !m22740C(obj, m22717i, m22714l(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f9509f) {
            this.f9516m.mo11576a(obj);
            throw null;
        }
        return true;
    }

    @Override // com.daaw.ve8
    /* renamed from: d */
    public final void mo7202d(Object obj, Object obj2) {
        m22709q(obj);
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.f9504a.length; i += 3) {
            int m22717i = m22717i(i);
            long j = 1048575 & m22717i;
            int i2 = this.f9504a[i];
            switch (m22718h(m22717i)) {
                case 0:
                    if (m22742A(obj2, i)) {
                        ih8.m19793t(obj, j, ih8.m19807f(obj2, j));
                        m22706t(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m22742A(obj2, i)) {
                        ih8.m19792u(obj, j, ih8.m19806g(obj2, j));
                        m22706t(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!m22742A(obj2, i)) {
                        break;
                    }
                    ih8.m19790w(obj, j, ih8.m19804i(obj2, j));
                    m22706t(obj, i);
                    break;
                case 3:
                    if (!m22742A(obj2, i)) {
                        break;
                    }
                    ih8.m19790w(obj, j, ih8.m19804i(obj2, j));
                    m22706t(obj, i);
                    break;
                case 4:
                    if (!m22742A(obj2, i)) {
                        break;
                    }
                    ih8.m19791v(obj, j, ih8.m19805h(obj2, j));
                    m22706t(obj, i);
                    break;
                case 5:
                    if (!m22742A(obj2, i)) {
                        break;
                    }
                    ih8.m19790w(obj, j, ih8.m19804i(obj2, j));
                    m22706t(obj, i);
                    break;
                case 6:
                    if (!m22742A(obj2, i)) {
                        break;
                    }
                    ih8.m19791v(obj, j, ih8.m19805h(obj2, j));
                    m22706t(obj, i);
                    break;
                case 7:
                    if (m22742A(obj2, i)) {
                        ih8.m19795r(obj, j, ih8.m19816B(obj2, j));
                        m22706t(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m22742A(obj2, i)) {
                        break;
                    }
                    ih8.m19789x(obj, j, ih8.m19802k(obj2, j));
                    m22706t(obj, i);
                    break;
                case 9:
                case 17:
                    m22708r(obj, obj2, i);
                    break;
                case 10:
                    if (!m22742A(obj2, i)) {
                        break;
                    }
                    ih8.m19789x(obj, j, ih8.m19802k(obj2, j));
                    m22706t(obj, i);
                    break;
                case 11:
                    if (!m22742A(obj2, i)) {
                        break;
                    }
                    ih8.m19791v(obj, j, ih8.m19805h(obj2, j));
                    m22706t(obj, i);
                    break;
                case 12:
                    if (!m22742A(obj2, i)) {
                        break;
                    }
                    ih8.m19791v(obj, j, ih8.m19805h(obj2, j));
                    m22706t(obj, i);
                    break;
                case 13:
                    if (!m22742A(obj2, i)) {
                        break;
                    }
                    ih8.m19791v(obj, j, ih8.m19805h(obj2, j));
                    m22706t(obj, i);
                    break;
                case 14:
                    if (!m22742A(obj2, i)) {
                        break;
                    }
                    ih8.m19790w(obj, j, ih8.m19804i(obj2, j));
                    m22706t(obj, i);
                    break;
                case 15:
                    if (!m22742A(obj2, i)) {
                        break;
                    }
                    ih8.m19791v(obj, j, ih8.m19805h(obj2, j));
                    m22706t(obj, i);
                    break;
                case 16:
                    if (!m22742A(obj2, i)) {
                        break;
                    }
                    ih8.m19790w(obj, j, ih8.m19804i(obj2, j));
                    m22706t(obj, i);
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
                    this.f9514k.mo2482b(obj, obj2, j);
                    break;
                case 50:
                    ze8.m2416B(this.f9518o, obj, obj2, j);
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
                    if (!m22738E(obj2, i2, i)) {
                        break;
                    }
                    ih8.m19789x(obj, j, ih8.m19802k(obj2, j));
                    m22705u(obj, i2, i);
                    break;
                case 60:
                case 68:
                    m22707s(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m22738E(obj2, i2, i)) {
                        break;
                    }
                    ih8.m19789x(obj, j, ih8.m19802k(obj2, j));
                    m22705u(obj, i2, i);
                    break;
            }
        }
        ze8.m2384f(this.f9515l, obj, obj2);
        if (this.f9509f) {
            ze8.m2385e(this.f9516m, obj, obj2);
        }
    }

    @Override // com.daaw.ve8
    /* renamed from: e */
    public final boolean mo7201e(Object obj, Object obj2) {
        int length = this.f9504a.length;
        for (int i = 0; i < length; i += 3) {
            int m22717i = m22717i(i);
            long j = m22717i & 1048575;
            switch (m22718h(m22717i)) {
                case 0:
                    if (m22700z(obj, obj2, i) && Double.doubleToLongBits(ih8.m19807f(obj, j)) == Double.doubleToLongBits(ih8.m19807f(obj2, j))) {
                        break;
                    }
                    return false;
                case 1:
                    if (m22700z(obj, obj2, i) && Float.floatToIntBits(ih8.m19806g(obj, j)) == Float.floatToIntBits(ih8.m19806g(obj2, j))) {
                        break;
                    }
                    return false;
                case 2:
                    if (m22700z(obj, obj2, i) && ih8.m19804i(obj, j) == ih8.m19804i(obj2, j)) {
                        break;
                    }
                    return false;
                case 3:
                    if (m22700z(obj, obj2, i) && ih8.m19804i(obj, j) == ih8.m19804i(obj2, j)) {
                        break;
                    }
                    return false;
                case 4:
                    if (m22700z(obj, obj2, i) && ih8.m19805h(obj, j) == ih8.m19805h(obj2, j)) {
                        break;
                    }
                    return false;
                case 5:
                    if (m22700z(obj, obj2, i) && ih8.m19804i(obj, j) == ih8.m19804i(obj2, j)) {
                        break;
                    }
                    return false;
                case 6:
                    if (m22700z(obj, obj2, i) && ih8.m19805h(obj, j) == ih8.m19805h(obj2, j)) {
                        break;
                    }
                    return false;
                case 7:
                    if (m22700z(obj, obj2, i) && ih8.m19816B(obj, j) == ih8.m19816B(obj2, j)) {
                        break;
                    }
                    return false;
                case 8:
                    if (m22700z(obj, obj2, i) && ze8.m2364z(ih8.m19802k(obj, j), ih8.m19802k(obj2, j))) {
                        break;
                    }
                    return false;
                case 9:
                    if (m22700z(obj, obj2, i) && ze8.m2364z(ih8.m19802k(obj, j), ih8.m19802k(obj2, j))) {
                        break;
                    }
                    return false;
                case 10:
                    if (m22700z(obj, obj2, i) && ze8.m2364z(ih8.m19802k(obj, j), ih8.m19802k(obj2, j))) {
                        break;
                    }
                    return false;
                case 11:
                    if (m22700z(obj, obj2, i) && ih8.m19805h(obj, j) == ih8.m19805h(obj2, j)) {
                        break;
                    }
                    return false;
                case 12:
                    if (m22700z(obj, obj2, i) && ih8.m19805h(obj, j) == ih8.m19805h(obj2, j)) {
                        break;
                    }
                    return false;
                case 13:
                    if (m22700z(obj, obj2, i) && ih8.m19805h(obj, j) == ih8.m19805h(obj2, j)) {
                        break;
                    }
                    return false;
                case 14:
                    if (m22700z(obj, obj2, i) && ih8.m19804i(obj, j) == ih8.m19804i(obj2, j)) {
                        break;
                    }
                    return false;
                case 15:
                    if (m22700z(obj, obj2, i) && ih8.m19805h(obj, j) == ih8.m19805h(obj2, j)) {
                        break;
                    }
                    return false;
                case 16:
                    if (m22700z(obj, obj2, i) && ih8.m19804i(obj, j) == ih8.m19804i(obj2, j)) {
                        break;
                    }
                    return false;
                case 17:
                    if (m22700z(obj, obj2, i) && ze8.m2364z(ih8.m19802k(obj, j), ih8.m19802k(obj2, j))) {
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
                    if (ze8.m2364z(ih8.m19802k(obj, j), ih8.m19802k(obj2, j))) {
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
                    long m22720W = m22720W(i) & 1048575;
                    if (ih8.m19805h(obj, m22720W) == ih8.m19805h(obj2, m22720W) && ze8.m2364z(ih8.m19802k(obj, j), ih8.m19802k(obj2, j))) {
                        break;
                    }
                    return false;
            }
        }
        if (this.f9515l.mo10361d(obj).equals(this.f9515l.mo10361d(obj2))) {
            if (this.f9509f) {
                this.f9516m.mo11576a(obj);
                this.f9516m.mo11576a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.ve8
    /* renamed from: f */
    public final void mo7200f(Object obj, ki8 ki8Var) {
        double m19807f;
        float m19806g;
        long m19804i;
        long m19804i2;
        int m19805h;
        long m19804i3;
        int m19805h2;
        boolean m19816B;
        int m19805h3;
        int m19805h4;
        int m19805h5;
        long m19804i4;
        int m19805h6;
        long m19804i5;
        if (!this.f9510g) {
            m22702x(obj, ki8Var);
        } else if (this.f9509f) {
            this.f9516m.mo11576a(obj);
            throw null;
        } else {
            int length = this.f9504a.length;
            for (int i = 0; i < length; i += 3) {
                int m22717i = m22717i(i);
                int i2 = this.f9504a[i];
                switch (m22718h(m22717i)) {
                    case 0:
                        if (m22742A(obj, i)) {
                            m19807f = ih8.m19807f(obj, m22717i & 1048575);
                            ki8Var.mo2649t(i2, m19807f);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m22742A(obj, i)) {
                            m19806g = ih8.m19806g(obj, m22717i & 1048575);
                            ki8Var.mo2645x(i2, m19806g);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m22742A(obj, i)) {
                            m19804i = ih8.m19804i(obj, m22717i & 1048575);
                            ki8Var.mo2658k(i2, m19804i);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m22742A(obj, i)) {
                            m19804i2 = ih8.m19804i(obj, m22717i & 1048575);
                            ki8Var.mo2673F(i2, m19804i2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m22742A(obj, i)) {
                            m19805h = ih8.m19805h(obj, m22717i & 1048575);
                            ki8Var.mo2647v(i2, m19805h);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m22742A(obj, i)) {
                            m19804i3 = ih8.m19804i(obj, m22717i & 1048575);
                            ki8Var.mo2668a(i2, m19804i3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m22742A(obj, i)) {
                            m19805h2 = ih8.m19805h(obj, m22717i & 1048575);
                            ki8Var.mo2663f(i2, m19805h2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m22742A(obj, i)) {
                            m19816B = ih8.m19816B(obj, m22717i & 1048575);
                            ki8Var.mo2662g(i2, m19816B);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!m22742A(obj, i)) {
                            break;
                        }
                        m22736G(i2, ih8.m19802k(obj, m22717i & 1048575), ki8Var);
                        break;
                    case 9:
                        if (!m22742A(obj, i)) {
                            break;
                        }
                        ki8Var.mo2664e(i2, ih8.m19802k(obj, m22717i & 1048575), m22714l(i));
                        break;
                    case 10:
                        if (!m22742A(obj, i)) {
                            break;
                        }
                        ki8Var.mo2644y(i2, (y68) ih8.m19802k(obj, m22717i & 1048575));
                        break;
                    case 11:
                        if (m22742A(obj, i)) {
                            m19805h3 = ih8.m19805h(obj, m22717i & 1048575);
                            ki8Var.mo2667b(i2, m19805h3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m22742A(obj, i)) {
                            m19805h4 = ih8.m19805h(obj, m22717i & 1048575);
                            ki8Var.mo2652q(i2, m19805h4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m22742A(obj, i)) {
                            m19805h5 = ih8.m19805h(obj, m22717i & 1048575);
                            ki8Var.mo2646w(i2, m19805h5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m22742A(obj, i)) {
                            m19804i4 = ih8.m19804i(obj, m22717i & 1048575);
                            ki8Var.mo2656m(i2, m19804i4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m22742A(obj, i)) {
                            m19805h6 = ih8.m19805h(obj, m22717i & 1048575);
                            ki8Var.mo2661h(i2, m19805h6);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m22742A(obj, i)) {
                            m19804i5 = ih8.m19804i(obj, m22717i & 1048575);
                            ki8Var.mo2670I(i2, m19804i5);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!m22742A(obj, i)) {
                            break;
                        }
                        ki8Var.mo2674E(i2, ih8.m19802k(obj, m22717i & 1048575), m22714l(i));
                        break;
                    case 18:
                        ze8.m2380j(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 19:
                        ze8.m2376n(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 20:
                        ze8.m2373q(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 21:
                        ze8.m2365y(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 22:
                        ze8.m2374p(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 23:
                        ze8.m2377m(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 24:
                        ze8.m2378l(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 25:
                        ze8.m2382h(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 26:
                        ze8.m2367w(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var);
                        break;
                    case 27:
                        ze8.m2372r(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, m22714l(i));
                        break;
                    case 28:
                        ze8.m2381i(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var);
                        break;
                    case 29:
                        ze8.m2366x(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 30:
                        ze8.m2379k(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 31:
                        ze8.m2371s(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 32:
                        ze8.m2370t(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 33:
                        ze8.m2369u(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 34:
                        ze8.m2368v(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, false);
                        break;
                    case 35:
                        ze8.m2380j(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 36:
                        ze8.m2376n(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 37:
                        ze8.m2373q(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 38:
                        ze8.m2365y(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 39:
                        ze8.m2374p(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 40:
                        ze8.m2377m(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 41:
                        ze8.m2378l(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 42:
                        ze8.m2382h(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 43:
                        ze8.m2366x(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 44:
                        ze8.m2379k(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 45:
                        ze8.m2371s(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 46:
                        ze8.m2370t(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 47:
                        ze8.m2369u(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 48:
                        ze8.m2368v(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, true);
                        break;
                    case 49:
                        ze8.m2375o(i2, (List) ih8.m19802k(obj, m22717i & 1048575), ki8Var, m22714l(i));
                        break;
                    case 50:
                        m22701y(ki8Var, i2, ih8.m19802k(obj, m22717i & 1048575), i);
                        break;
                    case 51:
                        if (m22738E(obj, i2, i)) {
                            m19807f = m22731L(obj, m22717i & 1048575);
                            ki8Var.mo2649t(i2, m19807f);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m22738E(obj, i2, i)) {
                            m19806g = m22730M(obj, m22717i & 1048575);
                            ki8Var.mo2645x(i2, m19806g);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m22738E(obj, i2, i)) {
                            m19804i = m22716j(obj, m22717i & 1048575);
                            ki8Var.mo2658k(i2, m19804i);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m22738E(obj, i2, i)) {
                            m19804i2 = m22716j(obj, m22717i & 1048575);
                            ki8Var.mo2673F(i2, m19804i2);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m22738E(obj, i2, i)) {
                            m19805h = m22727P(obj, m22717i & 1048575);
                            ki8Var.mo2647v(i2, m19805h);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m22738E(obj, i2, i)) {
                            m19804i3 = m22716j(obj, m22717i & 1048575);
                            ki8Var.mo2668a(i2, m19804i3);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m22738E(obj, i2, i)) {
                            m19805h2 = m22727P(obj, m22717i & 1048575);
                            ki8Var.mo2663f(i2, m19805h2);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m22738E(obj, i2, i)) {
                            m19816B = m22737F(obj, m22717i & 1048575);
                            ki8Var.mo2662g(i2, m19816B);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!m22738E(obj, i2, i)) {
                            break;
                        }
                        m22736G(i2, ih8.m19802k(obj, m22717i & 1048575), ki8Var);
                        break;
                    case 60:
                        if (!m22738E(obj, i2, i)) {
                            break;
                        }
                        ki8Var.mo2664e(i2, ih8.m19802k(obj, m22717i & 1048575), m22714l(i));
                        break;
                    case 61:
                        if (!m22738E(obj, i2, i)) {
                            break;
                        }
                        ki8Var.mo2644y(i2, (y68) ih8.m19802k(obj, m22717i & 1048575));
                        break;
                    case 62:
                        if (m22738E(obj, i2, i)) {
                            m19805h3 = m22727P(obj, m22717i & 1048575);
                            ki8Var.mo2667b(i2, m19805h3);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m22738E(obj, i2, i)) {
                            m19805h4 = m22727P(obj, m22717i & 1048575);
                            ki8Var.mo2652q(i2, m19805h4);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m22738E(obj, i2, i)) {
                            m19805h5 = m22727P(obj, m22717i & 1048575);
                            ki8Var.mo2646w(i2, m19805h5);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m22738E(obj, i2, i)) {
                            m19804i4 = m22716j(obj, m22717i & 1048575);
                            ki8Var.mo2656m(i2, m19804i4);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m22738E(obj, i2, i)) {
                            m19805h6 = m22727P(obj, m22717i & 1048575);
                            ki8Var.mo2661h(i2, m19805h6);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m22738E(obj, i2, i)) {
                            m19804i5 = m22716j(obj, m22717i & 1048575);
                            ki8Var.mo2670I(i2, m19804i5);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (!m22738E(obj, i2, i)) {
                            break;
                        }
                        ki8Var.mo2674E(i2, ih8.m19802k(obj, m22717i & 1048575), m22714l(i));
                        break;
                }
            }
            og8 og8Var = this.f9515l;
            og8Var.mo10356i(og8Var.mo10361d(obj), ki8Var);
        }
    }

    @Override // com.daaw.ve8
    /* renamed from: g */
    public final void mo7199g(Object obj, byte[] bArr, int i, int i2, e58 e58Var) {
        if (this.f9510g) {
            m22724S(obj, bArr, i, i2, e58Var);
        } else {
            m22735H(obj, bArr, i, i2, 0, e58Var);
        }
    }

    /* renamed from: i */
    public final int m22717i(int i) {
        return this.f9504a[i + 1];
    }

    /* renamed from: k */
    public final ua8 m22715k(int i) {
        int i2 = i / 3;
        return (ua8) this.f9505b[i2 + i2 + 1];
    }

    /* renamed from: l */
    public final ve8 m22714l(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        ve8 ve8Var = (ve8) this.f9505b[i3];
        if (ve8Var != null) {
            return ve8Var;
        }
        ve8 m13417b = pe8.m13418a().m13417b((Class) this.f9505b[i3 + 1]);
        this.f9505b[i3] = m13417b;
        return m13417b;
    }

    /* renamed from: m */
    public final Object m22713m(int i) {
        int i2 = i / 3;
        return this.f9505b[i2 + i2];
    }

    /* renamed from: n */
    public final Object m22712n(Object obj, int i) {
        ve8 m22714l = m22714l(i);
        long m22717i = m22717i(i) & 1048575;
        if (m22742A(obj, i)) {
            Object object = f9503q.getObject(obj, m22717i);
            if (m22739D(object)) {
                return object;
            }
            Object zze = m22714l.zze();
            if (object != null) {
                m22714l.mo7202d(zze, object);
            }
            return zze;
        }
        return m22714l.zze();
    }

    /* renamed from: o */
    public final Object m22711o(Object obj, int i, int i2) {
        ve8 m22714l = m22714l(i2);
        if (m22738E(obj, i, i2)) {
            Object object = f9503q.getObject(obj, m22717i(i2) & 1048575);
            if (m22739D(object)) {
                return object;
            }
            Object zze = m22714l.zze();
            if (object != null) {
                m22714l.mo7202d(zze, object);
            }
            return zze;
        }
        return m22714l.zze();
    }

    /* renamed from: r */
    public final void m22708r(Object obj, Object obj2, int i) {
        if (m22742A(obj2, i)) {
            long m22717i = m22717i(i) & 1048575;
            Unsafe unsafe = f9503q;
            Object object = unsafe.getObject(obj2, m22717i);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f9504a[i] + " is present but null: " + obj2.toString());
            }
            ve8 m22714l = m22714l(i);
            if (!m22742A(obj, i)) {
                if (m22739D(object)) {
                    Object zze = m22714l.zze();
                    m22714l.mo7202d(zze, object);
                    unsafe.putObject(obj, m22717i, zze);
                } else {
                    unsafe.putObject(obj, m22717i, object);
                }
                m22706t(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m22717i);
            if (!m22739D(object2)) {
                Object zze2 = m22714l.zze();
                m22714l.mo7202d(zze2, object2);
                unsafe.putObject(obj, m22717i, zze2);
                object2 = zze2;
            }
            m22714l.mo7202d(object2, object);
        }
    }

    /* renamed from: s */
    public final void m22707s(Object obj, Object obj2, int i) {
        int i2 = this.f9504a[i];
        if (m22738E(obj2, i2, i)) {
            long m22717i = m22717i(i) & 1048575;
            Unsafe unsafe = f9503q;
            Object object = unsafe.getObject(obj2, m22717i);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f9504a[i] + " is present but null: " + obj2.toString());
            }
            ve8 m22714l = m22714l(i);
            if (!m22738E(obj, i2, i)) {
                if (m22739D(object)) {
                    Object zze = m22714l.zze();
                    m22714l.mo7202d(zze, object);
                    unsafe.putObject(obj, m22717i, zze);
                } else {
                    unsafe.putObject(obj, m22717i, object);
                }
                m22705u(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m22717i);
            if (!m22739D(object2)) {
                Object zze2 = m22714l.zze();
                m22714l.mo7202d(zze2, object2);
                unsafe.putObject(obj, m22717i, zze2);
                object2 = zze2;
            }
            m22714l.mo7202d(object2, object);
        }
    }

    /* renamed from: t */
    public final void m22706t(Object obj, int i) {
        int m22720W = m22720W(i);
        long j = 1048575 & m22720W;
        if (j == 1048575) {
            return;
        }
        ih8.m19791v(obj, j, (1 << (m22720W >>> 20)) | ih8.m19805h(obj, j));
    }

    /* renamed from: u */
    public final void m22705u(Object obj, int i, int i2) {
        ih8.m19791v(obj, m22720W(i2) & 1048575, i);
    }

    /* renamed from: v */
    public final void m22704v(Object obj, int i, Object obj2) {
        f9503q.putObject(obj, m22717i(i) & 1048575, obj2);
        m22706t(obj, i);
    }

    /* renamed from: w */
    public final void m22703w(Object obj, int i, int i2, Object obj2) {
        f9503q.putObject(obj, m22717i(i2) & 1048575, obj2);
        m22705u(obj, i, i2);
    }

    /* renamed from: x */
    public final void m22702x(Object obj, ki8 ki8Var) {
        int i;
        if (this.f9509f) {
            this.f9516m.mo11576a(obj);
            throw null;
        }
        int length = this.f9504a.length;
        Unsafe unsafe = f9503q;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < length) {
            int m22717i = m22717i(i3);
            int[] iArr = this.f9504a;
            int i6 = iArr[i3];
            int m22718h = m22718h(m22717i);
            if (m22718h <= 17) {
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
            long j = m22717i & i2;
            switch (m22718h) {
                case 0:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2649t(i6, ih8.m19807f(obj, j));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 1:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2645x(i6, ih8.m19806g(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 2:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2658k(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 3:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2673F(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 4:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2647v(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 5:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2668a(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 6:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2663f(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 7:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2662g(i6, ih8.m19816B(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 8:
                    if ((i4 & i) != 0) {
                        m22736G(i6, unsafe.getObject(obj, j), ki8Var);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 9:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2664e(i6, unsafe.getObject(obj, j), m22714l(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 10:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2644y(i6, (y68) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 11:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2667b(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 12:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2652q(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 13:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2646w(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 14:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2656m(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 15:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2661h(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 16:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2670I(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 17:
                    if ((i4 & i) != 0) {
                        ki8Var.mo2674E(i6, unsafe.getObject(obj, j), m22714l(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 18:
                    ze8.m2380j(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 19:
                    ze8.m2376n(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 20:
                    ze8.m2373q(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 21:
                    ze8.m2365y(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 22:
                    ze8.m2374p(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 23:
                    ze8.m2377m(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 24:
                    ze8.m2378l(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 25:
                    ze8.m2382h(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 26:
                    ze8.m2367w(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var);
                    break;
                case 27:
                    ze8.m2372r(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, m22714l(i3));
                    break;
                case 28:
                    ze8.m2381i(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var);
                    break;
                case 29:
                    ze8.m2366x(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    break;
                case 30:
                    ze8.m2379k(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    break;
                case 31:
                    ze8.m2371s(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    break;
                case 32:
                    ze8.m2370t(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    break;
                case 33:
                    ze8.m2369u(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    break;
                case 34:
                    ze8.m2368v(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, false);
                    break;
                case 35:
                    ze8.m2380j(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 36:
                    ze8.m2376n(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 37:
                    ze8.m2373q(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 38:
                    ze8.m2365y(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 39:
                    ze8.m2374p(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 40:
                    ze8.m2377m(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 41:
                    ze8.m2378l(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 42:
                    ze8.m2382h(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 43:
                    ze8.m2366x(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 44:
                    ze8.m2379k(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 45:
                    ze8.m2371s(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 46:
                    ze8.m2370t(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 47:
                    ze8.m2369u(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 48:
                    ze8.m2368v(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, true);
                    break;
                case 49:
                    ze8.m2375o(this.f9504a[i3], (List) unsafe.getObject(obj, j), ki8Var, m22714l(i3));
                    break;
                case 50:
                    m22701y(ki8Var, i6, unsafe.getObject(obj, j), i3);
                    break;
                case 51:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2649t(i6, m22731L(obj, j));
                        break;
                    }
                    break;
                case 52:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2645x(i6, m22730M(obj, j));
                        break;
                    }
                    break;
                case 53:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2658k(i6, m22716j(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2673F(i6, m22716j(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2647v(i6, m22727P(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2668a(i6, m22716j(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2663f(i6, m22727P(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2662g(i6, m22737F(obj, j));
                        break;
                    }
                    break;
                case 59:
                    if (m22738E(obj, i6, i3)) {
                        m22736G(i6, unsafe.getObject(obj, j), ki8Var);
                        break;
                    }
                    break;
                case 60:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2664e(i6, unsafe.getObject(obj, j), m22714l(i3));
                        break;
                    }
                    break;
                case 61:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2644y(i6, (y68) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2667b(i6, m22727P(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2652q(i6, m22727P(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2646w(i6, m22727P(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2656m(i6, m22716j(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2661h(i6, m22727P(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2670I(i6, m22716j(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (m22738E(obj, i6, i3)) {
                        ki8Var.mo2674E(i6, unsafe.getObject(obj, j), m22714l(i3));
                        break;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        og8 og8Var = this.f9515l;
        og8Var.mo10356i(og8Var.mo10361d(obj), ki8Var);
    }

    /* renamed from: y */
    public final void m22701y(ki8 ki8Var, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        ld8 ld8Var = (ld8) m22713m(i2);
        throw null;
    }

    /* renamed from: z */
    public final boolean m22700z(Object obj, Object obj2, int i) {
        return m22742A(obj, i) == m22742A(obj2, i);
    }

    @Override // com.daaw.ve8
    public final int zza(Object obj) {
        return this.f9510g ? m22728O(obj) : m22729N(obj);
    }

    @Override // com.daaw.ve8
    public final Object zze() {
        return ((ja8) this.f9508e).m18671k();
    }
}
