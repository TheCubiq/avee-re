package com.daaw;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.conscrypt.NativeConstants;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class au7<T> implements cv7<T> {

    /* renamed from: q */
    public static final int[] f3648q = new int[0];

    /* renamed from: r */
    public static final Unsafe f3649r = gw7.m21169q();

    /* renamed from: a */
    public final int[] f3650a;

    /* renamed from: b */
    public final Object[] f3651b;

    /* renamed from: c */
    public final int f3652c;

    /* renamed from: d */
    public final int f3653d;

    /* renamed from: e */
    public final xt7 f3654e;

    /* renamed from: f */
    public final boolean f3655f;

    /* renamed from: g */
    public final boolean f3656g;

    /* renamed from: h */
    public final boolean f3657h;

    /* renamed from: i */
    public final int[] f3658i;

    /* renamed from: j */
    public final int f3659j;

    /* renamed from: k */
    public final int f3660k;

    /* renamed from: l */
    public final lt7 f3661l;

    /* renamed from: m */
    public final tv7 f3662m;

    /* renamed from: n */
    public final wr7 f3663n;

    /* renamed from: o */
    public final cu7 f3664o;

    /* renamed from: p */
    public final st7 f3665p;

    public au7(int[] iArr, Object[] objArr, int i, int i2, xt7 xt7Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, cu7 cu7Var, lt7 lt7Var, tv7 tv7Var, wr7 wr7Var, st7 st7Var, byte[] bArr) {
        this.f3650a = iArr;
        this.f3651b = objArr;
        this.f3652c = i;
        this.f3653d = i2;
        this.f3656g = xt7Var instanceof ls7;
        this.f3657h = z;
        boolean z3 = false;
        if (wr7Var != null && wr7Var.mo4777h(xt7Var)) {
            z3 = true;
        }
        this.f3655f = z3;
        this.f3658i = iArr2;
        this.f3659j = i3;
        this.f3660k = i4;
        this.f3664o = cu7Var;
        this.f3661l = lt7Var;
        this.f3662m = tv7Var;
        this.f3663n = wr7Var;
        this.f3654e = xt7Var;
        this.f3665p = st7Var;
    }

    /* renamed from: C */
    public static boolean m27010C(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: F */
    public static boolean m27007F(Object obj, int i, cv7 cv7Var) {
        return cv7Var.mo24959c(gw7.m21170p(obj, i & 1048575));
    }

    /* renamed from: G */
    public static boolean m27006G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ls7) {
            return ((ls7) obj).m16594F();
        }
        return true;
    }

    /* renamed from: I */
    public static boolean m27004I(Object obj, long j) {
        return ((Boolean) gw7.m21170p(obj, j)).booleanValue();
    }

    /* renamed from: L */
    public static final void m27001L(int i, Object obj, rr7 rr7Var) {
        if (obj instanceof String) {
            rr7Var.m11029f(i, (String) obj);
        } else {
            rr7Var.m11020o(i, (yq7) obj);
        }
    }

    /* renamed from: N */
    public static uv7 m26999N(Object obj) {
        ls7 ls7Var = (ls7) obj;
        uv7 uv7Var = ls7Var.zzc;
        if (uv7Var == uv7.m7679c()) {
            uv7 m7676f = uv7.m7676f();
            ls7Var.zzc = m7676f;
            return m7676f;
        }
        return uv7Var;
    }

    /* renamed from: O */
    public static au7 m26998O(Class cls, ut7 ut7Var, cu7 cu7Var, lt7 lt7Var, tv7 tv7Var, wr7 wr7Var, st7 st7Var) {
        if (ut7Var instanceof hu7) {
            return m26997P((hu7) ut7Var, cu7Var, lt7Var, tv7Var, wr7Var, st7Var);
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
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static au7 m26997P(hu7 hu7Var, cu7 cu7Var, lt7 lt7Var, tv7 tv7Var, wr7 wr7Var, st7 st7Var) {
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
        Field m26974s;
        char charAt12;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field m26974s2;
        Object obj2;
        Field m26974s3;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        int i29;
        char charAt16;
        boolean z = hu7Var.zzc() == 2;
        String m20414a = hu7Var.m20414a();
        int length = m20414a.length();
        char c = 55296;
        if (m20414a.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (m20414a.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int charAt17 = m20414a.charAt(i);
        if (charAt17 >= 55296) {
            int i32 = charAt17 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                charAt16 = m20414a.charAt(i31);
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
            iArr = f3648q;
            i3 = 0;
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i4 = 0;
            charAt3 = 0;
            i2 = 0;
        } else {
            int i34 = i31 + 1;
            int charAt18 = m20414a.charAt(i31);
            if (charAt18 >= 55296) {
                int i35 = charAt18 & 8191;
                int i36 = 13;
                while (true) {
                    i13 = i34 + 1;
                    charAt11 = m20414a.charAt(i34);
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
            int charAt19 = m20414a.charAt(i34);
            if (charAt19 >= 55296) {
                int i38 = charAt19 & 8191;
                int i39 = 13;
                while (true) {
                    i12 = i37 + 1;
                    charAt10 = m20414a.charAt(i37);
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
            charAt = m20414a.charAt(i37);
            if (charAt >= 55296) {
                int i41 = charAt & 8191;
                int i42 = 13;
                while (true) {
                    i11 = i40 + 1;
                    charAt9 = m20414a.charAt(i40);
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
            int charAt20 = m20414a.charAt(i40);
            if (charAt20 >= 55296) {
                int i44 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i10 = i43 + 1;
                    charAt8 = m20414a.charAt(i43);
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
            charAt2 = m20414a.charAt(i43);
            if (charAt2 >= 55296) {
                int i47 = charAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i9 = i46 + 1;
                    charAt7 = m20414a.charAt(i46);
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
            int charAt21 = m20414a.charAt(i46);
            if (charAt21 >= 55296) {
                int i50 = charAt21 & 8191;
                int i51 = 13;
                while (true) {
                    i8 = i49 + 1;
                    charAt6 = m20414a.charAt(i49);
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
            int charAt22 = m20414a.charAt(i49);
            if (charAt22 >= 55296) {
                int i53 = charAt22 & 8191;
                int i54 = 13;
                while (true) {
                    i7 = i52 + 1;
                    charAt5 = m20414a.charAt(i52);
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
            charAt3 = m20414a.charAt(i52);
            if (charAt3 >= 55296) {
                int i56 = charAt3 & 8191;
                int i57 = 13;
                while (true) {
                    i6 = i55 + 1;
                    charAt4 = m20414a.charAt(i55);
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
        Unsafe unsafe = f3649r;
        Object[] m20413b = hu7Var.m20413b();
        Class<?> cls2 = hu7Var.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i59 = charAt3 + i5;
        int i60 = charAt3;
        int i61 = i59;
        int i62 = 0;
        int i63 = 0;
        while (i31 < length) {
            int i64 = i31 + 1;
            int charAt23 = m20414a.charAt(i31);
            if (charAt23 >= c) {
                int i65 = charAt23 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i28 = i66 + 1;
                    charAt15 = m20414a.charAt(i66);
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
            int charAt24 = m20414a.charAt(i14);
            if (charAt24 >= c) {
                int i69 = charAt24 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    charAt14 = m20414a.charAt(i70);
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
                int charAt25 = m20414a.charAt(i16);
                if (charAt25 >= 55296) {
                    int i75 = charAt25 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i26 = i76 + 1;
                        charAt13 = m20414a.charAt(i76);
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
                    objArr2[i79 + i79 + 1] = m20413b[i2];
                } else {
                    if (i78 == 12 && !z) {
                        int i80 = i62 / 3;
                        i25 = i2 + 1;
                        objArr2[i80 + i80 + 1] = m20413b[i2];
                    }
                    int i81 = charAt25 + charAt25;
                    obj = m20413b[i81];
                    if (obj instanceof Field) {
                        m26974s2 = m26974s(cls2, (String) obj);
                        m20413b[i81] = m26974s2;
                    } else {
                        m26974s2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m26974s2);
                    int i82 = i81 + 1;
                    obj2 = m20413b[i82];
                    if (obj2 instanceof Field) {
                        m26974s3 = m26974s(cls2, (String) obj2);
                        m20413b[i82] = m26974s3;
                    } else {
                        m26974s3 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(m26974s3);
                    str = m20414a;
                    cls = cls2;
                    i21 = objectFieldOffset3;
                    objArr = objArr2;
                    objectFieldOffset = objectFieldOffset2;
                    i22 = 0;
                }
                i2 = i25;
                int i812 = charAt25 + charAt25;
                obj = m20413b[i812];
                if (obj instanceof Field) {
                }
                iArr2 = iArr3;
                i17 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m26974s2);
                int i822 = i812 + 1;
                obj2 = m20413b[i822];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(m26974s3);
                str = m20414a;
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
                Field m26974s4 = m26974s(cls2, (String) m20413b[i2]);
                if (i72 == 9 || i72 == 17) {
                    int i84 = i62 / 3;
                    objArr2[i84 + i84 + 1] = m26974s4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        int i85 = i62 / 3;
                        i23 = i83 + 1;
                        objArr2[i85 + i85 + 1] = m20413b[i83];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        if (!z) {
                            int i86 = i62 / 3;
                            i23 = i83 + 1;
                            objArr2[i86 + i86 + 1] = m20413b[i83];
                        }
                    } else if (i72 == 50) {
                        int i87 = i60 + 1;
                        iArr[i60] = i62;
                        int i88 = i62 / 3;
                        int i89 = i88 + i88;
                        int i90 = i83 + 1;
                        objArr2[i89] = m20413b[i83];
                        if ((charAt24 & 2048) != 0) {
                            i83 = i90 + 1;
                            objArr2[i89 + 1] = m20413b[i90];
                            i60 = i87;
                        } else {
                            i60 = i87;
                            i19 = i90;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(m26974s4);
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i72 > 17) {
                                str = m20414a;
                                cls = cls2;
                                i20 = i16;
                                i21 = 1048575;
                                i22 = 0;
                            } else {
                                int i91 = i16 + 1;
                                int charAt26 = m20414a.charAt(i16);
                                if (charAt26 >= 55296) {
                                    int i92 = charAt26 & 8191;
                                    int i93 = 13;
                                    while (true) {
                                        i20 = i91 + 1;
                                        charAt12 = m20414a.charAt(i91);
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
                                Object obj3 = m20413b[i94];
                                str = m20414a;
                                if (obj3 instanceof Field) {
                                    m26974s = (Field) obj3;
                                } else {
                                    m26974s = m26974s(cls2, (String) obj3);
                                    m20413b[i94] = m26974s;
                                }
                                cls = cls2;
                                i21 = (int) unsafe.objectFieldOffset(m26974s);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m26974s4);
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = m20414a;
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(m26974s4);
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = m20414a;
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
            m20414a = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new au7(iArr3, objArr2, charAt, i4, hu7Var.zza(), z, false, iArr, charAt3, i59, cu7Var, lt7Var, tv7Var, wr7Var, st7Var, null);
    }

    /* renamed from: Q */
    public static double m26996Q(Object obj, long j) {
        return ((Double) gw7.m21170p(obj, j)).doubleValue();
    }

    /* renamed from: R */
    public static float m26995R(Object obj, long j) {
        return ((Float) gw7.m21170p(obj, j)).floatValue();
    }

    /* renamed from: U */
    public static int m26992U(Object obj, long j) {
        return ((Integer) gw7.m21170p(obj, j)).intValue();
    }

    /* renamed from: j */
    public static int m26983j(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: l */
    public static long m26981l(Object obj, long j) {
        return ((Long) gw7.m21170p(obj, j)).longValue();
    }

    /* renamed from: s */
    public static Field m26974s(Class cls, String str) {
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

    /* renamed from: t */
    public static void m26973t(Object obj) {
        if (!m27006G(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* renamed from: A */
    public final void m27012A(Object obj, int i, int i2, Object obj2) {
        f3649r.putObject(obj, m26982k(i2) & 1048575, obj2);
        m26968y(obj, i, i2);
    }

    /* renamed from: B */
    public final boolean m27011B(Object obj, Object obj2, int i) {
        return m27009D(obj, i) == m27009D(obj2, i);
    }

    /* renamed from: D */
    public final boolean m27009D(Object obj, int i) {
        int m26985b0 = m26985b0(i);
        long j = m26985b0 & 1048575;
        if (j != 1048575) {
            return (gw7.m21174l(obj, j) & (1 << (m26985b0 >>> 20))) != 0;
        }
        int m26982k = m26982k(i);
        long j2 = m26982k & 1048575;
        switch (m26983j(m26982k)) {
            case 0:
                return Double.doubleToRawLongBits(gw7.m21176j(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(gw7.m21175k(obj, j2)) != 0;
            case 2:
                return gw7.m21172n(obj, j2) != 0;
            case 3:
                return gw7.m21172n(obj, j2) != 0;
            case 4:
                return gw7.m21174l(obj, j2) != 0;
            case 5:
                return gw7.m21172n(obj, j2) != 0;
            case 6:
                return gw7.m21174l(obj, j2) != 0;
            case 7:
                return gw7.m21186H(obj, j2);
            case 8:
                Object m21170p = gw7.m21170p(obj, j2);
                if (m21170p instanceof String) {
                    return !((String) m21170p).isEmpty();
                } else if (m21170p instanceof yq7) {
                    return !yq7.f33966q.equals(m21170p);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return gw7.m21170p(obj, j2) != null;
            case 10:
                return !yq7.f33966q.equals(gw7.m21170p(obj, j2));
            case 11:
                return gw7.m21174l(obj, j2) != 0;
            case 12:
                return gw7.m21174l(obj, j2) != 0;
            case 13:
                return gw7.m21174l(obj, j2) != 0;
            case 14:
                return gw7.m21172n(obj, j2) != 0;
            case 15:
                return gw7.m21174l(obj, j2) != 0;
            case 16:
                return gw7.m21172n(obj, j2) != 0;
            case 17:
                return gw7.m21170p(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: E */
    public final boolean m27008E(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m27009D(obj, i) : (i3 & i4) != 0;
    }

    /* renamed from: H */
    public final boolean m27005H(Object obj, int i, int i2) {
        return gw7.m21174l(obj, (long) (m26985b0(i2) & 1048575)) == i;
    }

    /* renamed from: J */
    public final void m27003J(Object obj, rr7 rr7Var) {
        int i;
        if (this.f3655f) {
            this.f3663n.mo4784a(obj);
            throw null;
        }
        int length = this.f3650a.length;
        Unsafe unsafe = f3649r;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < length) {
            int m26982k = m26982k(i3);
            int[] iArr = this.f3650a;
            int i6 = iArr[i3];
            int m26983j = m26983j(m26982k);
            if (m26983j <= 17) {
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
            long j = m26982k & i2;
            switch (m26983j) {
                case 0:
                    if ((i4 & i) != 0) {
                        rr7Var.m11018q(i6, gw7.m21176j(obj, j));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 1:
                    if ((i4 & i) != 0) {
                        rr7Var.m11009z(i6, gw7.m21175k(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 2:
                    if ((i4 & i) != 0) {
                        rr7Var.m11041E(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 3:
                    if ((i4 & i) != 0) {
                        rr7Var.m11025j(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 4:
                    if ((i4 & i) != 0) {
                        rr7Var.m11043C(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 5:
                    if ((i4 & i) != 0) {
                        rr7Var.m11011x(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 6:
                    if ((i4 & i) != 0) {
                        rr7Var.m11013v(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 7:
                    if ((i4 & i) != 0) {
                        rr7Var.m11022m(i6, gw7.m21186H(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 8:
                    if ((i4 & i) != 0) {
                        m27001L(i6, unsafe.getObject(obj, j), rr7Var);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 9:
                    if ((i4 & i) != 0) {
                        rr7Var.m11039G(i6, unsafe.getObject(obj, j), m26979n(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 10:
                    if ((i4 & i) != 0) {
                        rr7Var.m11020o(i6, (yq7) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 11:
                    if ((i4 & i) != 0) {
                        rr7Var.m11027h(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 12:
                    if ((i4 & i) != 0) {
                        rr7Var.m11015t(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 13:
                    if ((i4 & i) != 0) {
                        rr7Var.m11038H(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 14:
                    if ((i4 & i) != 0) {
                        rr7Var.m11036J(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 15:
                    if ((i4 & i) != 0) {
                        rr7Var.m11034a(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 16:
                    if ((i4 & i) != 0) {
                        rr7Var.m11032c(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 17:
                    if ((i4 & i) != 0) {
                        rr7Var.m11044B(i6, unsafe.getObject(obj, j), m26979n(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                case 18:
                    ev7.m23127l(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 19:
                    ev7.m23123p(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 20:
                    ev7.m23120s(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 21:
                    ev7.m23165B(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 22:
                    ev7.m23121r(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 23:
                    ev7.m23124o(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 24:
                    ev7.m23125n(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 25:
                    ev7.m23129j(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                case 26:
                    ev7.m23114y(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var);
                    break;
                case 27:
                    ev7.m23119t(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, m26979n(i3));
                    break;
                case 28:
                    ev7.m23128k(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var);
                    break;
                case 29:
                    ev7.m23113z(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    break;
                case 30:
                    ev7.m23126m(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    break;
                case 31:
                    ev7.m23118u(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    break;
                case 32:
                    ev7.m23117v(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    break;
                case 33:
                    ev7.m23116w(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    break;
                case 34:
                    ev7.m23115x(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, false);
                    break;
                case 35:
                    ev7.m23127l(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 36:
                    ev7.m23123p(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 37:
                    ev7.m23120s(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 38:
                    ev7.m23165B(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 39:
                    ev7.m23121r(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 40:
                    ev7.m23124o(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 41:
                    ev7.m23125n(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 42:
                    ev7.m23129j(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 43:
                    ev7.m23113z(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 44:
                    ev7.m23126m(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 45:
                    ev7.m23118u(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 46:
                    ev7.m23117v(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 47:
                    ev7.m23116w(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 48:
                    ev7.m23115x(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, true);
                    break;
                case 49:
                    ev7.m23122q(this.f3650a[i3], (List) unsafe.getObject(obj, j), rr7Var, m26979n(i3));
                    break;
                case 50:
                    m27002K(rr7Var, i6, unsafe.getObject(obj, j), i3);
                    break;
                case 51:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11018q(i6, m26996Q(obj, j));
                        break;
                    }
                    break;
                case 52:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11009z(i6, m26995R(obj, j));
                        break;
                    }
                    break;
                case 53:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11041E(i6, m26981l(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11025j(i6, m26981l(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11043C(i6, m26992U(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11011x(i6, m26981l(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11013v(i6, m26992U(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11022m(i6, m27004I(obj, j));
                        break;
                    }
                    break;
                case 59:
                    if (m27005H(obj, i6, i3)) {
                        m27001L(i6, unsafe.getObject(obj, j), rr7Var);
                        break;
                    }
                    break;
                case 60:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11039G(i6, unsafe.getObject(obj, j), m26979n(i3));
                        break;
                    }
                    break;
                case 61:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11020o(i6, (yq7) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11027h(i6, m26992U(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11015t(i6, m26992U(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11038H(i6, m26992U(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11036J(i6, m26981l(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11034a(i6, m26992U(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11032c(i6, m26981l(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (m27005H(obj, i6, i3)) {
                        rr7Var.m11044B(i6, unsafe.getObject(obj, j), m26979n(i3));
                        break;
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        tv7 tv7Var = this.f3662m;
        tv7Var.mo6711r(tv7Var.mo6724d(obj), rr7Var);
    }

    /* renamed from: K */
    public final void m27002K(rr7 rr7Var, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        qt7 qt7Var = (qt7) m26977p(i2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x041f, code lost:
        if (r0 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0421, code lost:
        r27.putInt(r12, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0427, code lost:
        r10 = r9.f3659j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x042c, code lost:
        if (r10 >= r9.f3660k) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x042e, code lost:
        m26978o(r29, r9.f3658i[r10], null, r9.f3662m, r29);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0443, code lost:
        if (r7 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0445, code lost:
        if (r6 != r32) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x044c, code lost:
        throw com.daaw.xs7.m4537g();
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
        throw com.daaw.xs7.m4537g();
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m27000M(Object obj, byte[] bArr, int i, int i2, int i3, kq7 kq7Var) {
        Unsafe unsafe;
        int i4;
        Object obj2;
        au7<T> au7Var;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b;
        int i9;
        int i10;
        int i11;
        int i12;
        Object obj3;
        int i13;
        kq7 kq7Var2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long j;
        int i21;
        int i22;
        int i23;
        au7<T> au7Var2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i24 = i2;
        int i25 = i3;
        kq7 kq7Var3 = kq7Var;
        m26973t(obj);
        Unsafe unsafe2 = f3649r;
        int i26 = i;
        int i27 = 0;
        int i28 = -1;
        int i29 = 0;
        int i30 = 0;
        int i31 = 1048575;
        while (true) {
            if (i26 < i24) {
                int i32 = i26 + 1;
                byte b2 = bArr2[i26];
                if (b2 < 0) {
                    int m16650k = lq7.m16650k(b2, bArr2, i32, kq7Var3);
                    b = kq7Var3.f16704a;
                    i32 = m16650k;
                } else {
                    b = b2;
                }
                int i33 = b >>> 3;
                int i34 = b & 7;
                int m26986a0 = i33 > i28 ? au7Var2.m26986a0(i33, i29 / 3) : au7Var2.m26987Z(i33);
                if (m26986a0 == -1) {
                    i9 = i33;
                    i10 = i32;
                    i6 = b;
                    i11 = i30;
                    unsafe = unsafe2;
                    i4 = i25;
                    i12 = 0;
                } else {
                    int[] iArr = au7Var2.f3650a;
                    int i35 = iArr[m26986a0 + 1];
                    int m26983j = m26983j(i35);
                    int i36 = i32;
                    long j2 = i35 & 1048575;
                    if (m26983j <= 17) {
                        int i37 = iArr[m26986a0 + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = i37 & 1048575;
                        int i40 = b;
                        if (i39 != i31) {
                            if (i31 != 1048575) {
                                unsafe2.putInt(obj4, i31, i30);
                            }
                            i14 = i39;
                            i11 = unsafe2.getInt(obj4, i39);
                        } else {
                            i11 = i30;
                            i14 = i31;
                        }
                        switch (m26983j) {
                            case 0:
                                i15 = m26986a0;
                                i16 = i33;
                                i17 = i36;
                                if (i34 != 1) {
                                    i6 = i40;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    gw7.m21160z(obj4, j2, Double.longBitsToDouble(lq7.m16645p(bArr2, i17)));
                                    i26 = i17 + 8;
                                    i30 = i11 | i38;
                                    i28 = i16;
                                    i29 = i15;
                                    i27 = i40;
                                    break;
                                }
                            case 1:
                                i15 = m26986a0;
                                i16 = i33;
                                i17 = i36;
                                if (i34 != 5) {
                                    i6 = i40;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    gw7.m21193A(obj4, j2, Float.intBitsToFloat(lq7.m16659b(bArr2, i17)));
                                    i26 = i17 + 4;
                                    i30 = i11 | i38;
                                    i28 = i16;
                                    i29 = i15;
                                    i27 = i40;
                                    break;
                                }
                            case 2:
                            case 3:
                                i15 = m26986a0;
                                i16 = i33;
                                i17 = i36;
                                if (i34 != 0) {
                                    i6 = i40;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    int m16648m = lq7.m16648m(bArr2, i17, kq7Var3);
                                    unsafe2.putLong(obj, j2, kq7Var3.f16705b);
                                    i30 = i11 | i38;
                                    i26 = m16648m;
                                    i28 = i16;
                                    i29 = i15;
                                    i27 = i40;
                                    break;
                                }
                            case 4:
                            case 11:
                                i15 = m26986a0;
                                i16 = i33;
                                i17 = i36;
                                if (i34 != 0) {
                                    i6 = i40;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    i26 = lq7.m16651j(bArr2, i17, kq7Var3);
                                    unsafe2.putInt(obj4, j2, kq7Var3.f16704a);
                                    i30 = i11 | i38;
                                    i28 = i16;
                                    i29 = i15;
                                    i27 = i40;
                                    break;
                                }
                            case 5:
                            case 14:
                                i15 = m26986a0;
                                i16 = i33;
                                if (i34 != 1) {
                                    i40 = i40;
                                    i17 = i36;
                                    i6 = i40;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    i40 = i40;
                                    i17 = i36;
                                    unsafe2.putLong(obj, j2, lq7.m16645p(bArr2, i36));
                                    i26 = i17 + 8;
                                    i30 = i11 | i38;
                                    i28 = i16;
                                    i29 = i15;
                                    i27 = i40;
                                    break;
                                }
                            case 6:
                            case 13:
                                i15 = m26986a0;
                                i18 = i40;
                                i16 = i33;
                                i19 = i36;
                                if (i34 != 5) {
                                    i6 = i18;
                                    i17 = i19;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j2, lq7.m16659b(bArr2, i19));
                                    i26 = i19 + 4;
                                    i30 = i11 | i38;
                                    i27 = i18;
                                    i28 = i16;
                                    i29 = i15;
                                    break;
                                }
                            case 7:
                                i15 = m26986a0;
                                i18 = i40;
                                i16 = i33;
                                i19 = i36;
                                if (i34 != 0) {
                                    i6 = i18;
                                    i17 = i19;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    i26 = lq7.m16648m(bArr2, i19, kq7Var3);
                                    gw7.m21162x(obj4, j2, kq7Var3.f16705b != 0);
                                    i30 = i11 | i38;
                                    i27 = i18;
                                    i28 = i16;
                                    i29 = i15;
                                    break;
                                }
                            case 8:
                                i15 = m26986a0;
                                i18 = i40;
                                i16 = i33;
                                i19 = i36;
                                if (i34 != 2) {
                                    i6 = i18;
                                    i17 = i19;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    i26 = (536870912 & i35) == 0 ? lq7.m16654g(bArr2, i19, kq7Var3) : lq7.m16653h(bArr2, i19, kq7Var3);
                                    unsafe2.putObject(obj4, j2, kq7Var3.f16706c);
                                    i30 = i11 | i38;
                                    i27 = i18;
                                    i28 = i16;
                                    i29 = i15;
                                    break;
                                }
                            case 9:
                                i15 = m26986a0;
                                i6 = i40;
                                i16 = i33;
                                i20 = i36;
                                if (i34 != 2) {
                                    i17 = i20;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    Object m26976q = au7Var2.m26976q(obj4, i15);
                                    i26 = lq7.m16646o(m26976q, au7Var2.m26979n(i15), bArr, i20, i2, kq7Var);
                                    au7Var2.m26967z(obj4, i15, m26976q);
                                    i30 = i11 | i38;
                                    i27 = i6;
                                    i28 = i16;
                                    i29 = i15;
                                    break;
                                }
                            case 10:
                                i15 = m26986a0;
                                i6 = i40;
                                i16 = i33;
                                i20 = i36;
                                if (i34 != 2) {
                                    i17 = i20;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    i26 = lq7.m16660a(bArr2, i20, kq7Var3);
                                    unsafe2.putObject(obj4, j2, kq7Var3.f16706c);
                                    i30 = i11 | i38;
                                    i27 = i6;
                                    i28 = i16;
                                    i29 = i15;
                                    break;
                                }
                            case 12:
                                i15 = m26986a0;
                                i6 = i40;
                                i16 = i33;
                                i20 = i36;
                                j = j2;
                                if (i34 != 0) {
                                    i17 = i20;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    i26 = lq7.m16651j(bArr2, i20, kq7Var3);
                                    i21 = kq7Var3.f16704a;
                                    ps7 m26980m = au7Var2.m26980m(i15);
                                    if (m26980m != null && !m26980m.mo3065a(i21)) {
                                        m26999N(obj).m7672j(i6, Long.valueOf(i21));
                                        i27 = i6;
                                        i28 = i16;
                                        i29 = i15;
                                        i30 = i11;
                                        break;
                                    }
                                    unsafe2.putInt(obj4, j, i21);
                                    i30 = i11 | i38;
                                    i27 = i6;
                                    i28 = i16;
                                    i29 = i15;
                                    break;
                                }
                                break;
                            case 15:
                                i15 = m26986a0;
                                i6 = i40;
                                i16 = i33;
                                i20 = i36;
                                j = j2;
                                if (i34 != 0) {
                                    i17 = i20;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    i26 = lq7.m16651j(bArr2, i20, kq7Var3);
                                    i21 = jr7.m18301e(kq7Var3.f16704a);
                                    unsafe2.putInt(obj4, j, i21);
                                    i30 = i11 | i38;
                                    i27 = i6;
                                    i28 = i16;
                                    i29 = i15;
                                    break;
                                }
                            case 16:
                                if (i34 != 0) {
                                    i15 = m26986a0;
                                    i16 = i33;
                                    i6 = i40;
                                    i17 = i36;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    int m16648m2 = lq7.m16648m(bArr2, i36, kq7Var3);
                                    i16 = i33;
                                    i15 = m26986a0;
                                    i6 = i40;
                                    unsafe2.putLong(obj, j2, jr7.m18300f(kq7Var3.f16705b));
                                    i30 = i11 | i38;
                                    i26 = m16648m2;
                                    i27 = i6;
                                    i28 = i16;
                                    i29 = i15;
                                    break;
                                }
                            default:
                                i15 = m26986a0;
                                i16 = i33;
                                i17 = i36;
                                if (i34 != 3) {
                                    i6 = i40;
                                    i4 = i3;
                                    i10 = i17;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i12 = i15;
                                    i31 = i14;
                                    break;
                                } else {
                                    Object m26976q2 = au7Var2.m26976q(obj4, i15);
                                    i6 = i40;
                                    i26 = lq7.m16647n(m26976q2, au7Var2.m26979n(i15), bArr, i17, i2, (i16 << 3) | 4, kq7Var);
                                    au7Var2.m26967z(obj4, i15, m26976q2);
                                    i30 = i11 | i38;
                                    i27 = i6;
                                    i28 = i16;
                                    i29 = i15;
                                    break;
                                }
                        }
                        i31 = i14;
                        i24 = i2;
                        i25 = i3;
                    } else {
                        i15 = m26986a0;
                        int i41 = b;
                        i14 = i31;
                        if (m26983j != 27) {
                            i11 = i30;
                            if (m26983j <= 49) {
                                i9 = i33;
                                i22 = i41;
                                unsafe = unsafe2;
                                i12 = i15;
                                i26 = m26988Y(obj, bArr, i36, i2, i41, i9, i34, i15, i35, m26983j, j2, kq7Var);
                                if (i26 != i36) {
                                    au7Var2 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i28 = i9;
                                    i24 = i2;
                                    i25 = i3;
                                    kq7Var3 = kq7Var;
                                    i27 = i22;
                                    i29 = i12;
                                    i30 = i11;
                                    i31 = i14;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i10 = i26;
                                    i6 = i22;
                                }
                            } else {
                                i22 = i41;
                                i9 = i33;
                                i23 = i36;
                                unsafe = unsafe2;
                                i12 = i15;
                                if (m26983j != 50) {
                                    i26 = m26990W(obj, bArr, i23, i2, i22, i9, i34, i35, m26983j, j2, i12, kq7Var);
                                    if (i26 != i23) {
                                        au7Var2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i28 = i9;
                                        i24 = i2;
                                        i25 = i3;
                                        kq7Var3 = kq7Var;
                                        i27 = i22;
                                        i29 = i12;
                                        i30 = i11;
                                        i31 = i14;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i10 = i26;
                                        i6 = i22;
                                    }
                                } else if (i34 == 2) {
                                    i26 = m26991V(obj, bArr, i23, i2, i12, j2, kq7Var);
                                    if (i26 != i23) {
                                        au7Var2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i28 = i9;
                                        i24 = i2;
                                        i25 = i3;
                                        kq7Var3 = kq7Var;
                                        i27 = i22;
                                        i29 = i12;
                                        i30 = i11;
                                        i31 = i14;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i10 = i26;
                                        i6 = i22;
                                    }
                                }
                            }
                            i31 = i14;
                        } else if (i34 == 2) {
                            us7 us7Var = (us7) unsafe2.getObject(obj4, j2);
                            if (!us7Var.zzc()) {
                                int size = us7Var.size();
                                us7Var = us7Var.mo7741b(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j2, us7Var);
                            }
                            i11 = i30;
                            i26 = lq7.m16656e(au7Var2.m26979n(i15), i41, bArr, i36, i2, us7Var, kq7Var);
                            i28 = i33;
                            i27 = i41;
                            i29 = i15;
                            i30 = i11;
                            i31 = i14;
                            i24 = i2;
                            i25 = i3;
                        } else {
                            i11 = i30;
                            i9 = i33;
                            i22 = i41;
                            i23 = i36;
                            unsafe = unsafe2;
                            i12 = i15;
                        }
                        i4 = i3;
                        i10 = i23;
                        i6 = i22;
                        i31 = i14;
                    }
                }
                if (i6 != i4 || i4 == 0) {
                    if (this.f3655f) {
                        kq7Var2 = kq7Var;
                        vr7 vr7Var = kq7Var2.f16707d;
                        if (vr7Var != vr7.f30539c) {
                            i13 = i9;
                            if (vr7Var.m6832c(this.f3654e, i13) != null) {
                                js7 js7Var = (js7) obj;
                                throw null;
                            }
                            i26 = lq7.m16652i(i6, bArr, i10, i2, m26999N(obj), kq7Var);
                            obj3 = obj;
                            i24 = i2;
                            i27 = i6;
                            au7Var2 = this;
                            kq7Var3 = kq7Var2;
                            i28 = i13;
                            obj4 = obj3;
                            i29 = i12;
                            i30 = i11;
                            unsafe2 = unsafe;
                            bArr2 = bArr;
                            i25 = i4;
                        } else {
                            obj3 = obj;
                            i13 = i9;
                        }
                    } else {
                        obj3 = obj;
                        i13 = i9;
                        kq7Var2 = kq7Var;
                    }
                    i26 = lq7.m16652i(i6, bArr, i10, i2, m26999N(obj), kq7Var);
                    i24 = i2;
                    i27 = i6;
                    au7Var2 = this;
                    kq7Var3 = kq7Var2;
                    i28 = i13;
                    obj4 = obj3;
                    i29 = i12;
                    i30 = i11;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i25 = i4;
                } else {
                    au7Var = this;
                    obj2 = obj;
                    i7 = i31;
                    i30 = i11;
                    i8 = 1048575;
                    i5 = i10;
                }
            } else {
                int i42 = i31;
                unsafe = unsafe2;
                i4 = i25;
                obj2 = obj4;
                au7Var = au7Var2;
                i5 = i26;
                i6 = i27;
                i7 = i42;
                i8 = 1048575;
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
        r4 = com.daaw.qr7.m12257e(r11) + com.daaw.qr7.m12256f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (m27005H(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (m27005H(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
        if (m27005H(r17, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
        if (m27005H(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
        if (m27005H(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
        if (m27005H(r17, r11, r5) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012a, code lost:
        r3 = m26992U(r17, r3);
        r4 = com.daaw.qr7.m12256f(r11 << 3);
        r3 = com.daaw.qr7.m12263G(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013e, code lost:
        if (m27005H(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
        if (m27005H(r17, r11, r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
        r6 = r6 + (com.daaw.qr7.m12256f(r11 << 3) + com.daaw.qr7.m12255g(m26981l(r17, r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015d, code lost:
        if (m27005H(r17, r11, r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
        r3 = com.daaw.qr7.m12256f(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016d, code lost:
        if (m27005H(r17, r11, r5) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016f, code lost:
        r3 = com.daaw.qr7.m12256f(r11 << 3) + 8;
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
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m26994S(Object obj) {
        int i;
        int m12256f;
        Object object;
        int m12256f2;
        int m12258d;
        int m12256f3;
        int i2;
        int m23144W;
        int m23156K;
        int m12257e;
        Object object2;
        int m12256f4;
        int m26992U;
        Unsafe unsafe = f3649r;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i4 < this.f3650a.length) {
            int m26982k = m26982k(i4);
            int[] iArr = this.f3650a;
            int i8 = iArr[i4];
            int m26983j = m26983j(m26982k);
            if (m26983j <= 17) {
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
            long j = m26982k & i3;
            switch (m26983j) {
                case 0:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    m12256f = qr7.m12256f(i8 << 3) + 8;
                    i5 += m12256f;
                    break;
                case 1:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    m12256f = qr7.m12256f(i8 << 3) + 4;
                    i5 += m12256f;
                    break;
                case 2:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    i5 += qr7.m12256f(i8 << 3) + qr7.m12255g(unsafe.getLong(obj, j));
                    break;
                case 3:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    i5 += qr7.m12256f(i8 << 3) + qr7.m12255g(unsafe.getLong(obj, j));
                    break;
                case 4:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    int i11 = unsafe.getInt(obj, j);
                    m12256f2 = qr7.m12256f(i8 << 3);
                    m12258d = qr7.m12263G(i11);
                    m12256f3 = m12256f2 + m12258d;
                    i5 += m12256f3;
                    break;
                case 5:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    m12256f = qr7.m12256f(i8 << 3) + 8;
                    i5 += m12256f;
                    break;
                case 6:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    m12256f = qr7.m12256f(i8 << 3) + 4;
                    i5 += m12256f;
                    break;
                case 7:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        m12256f = qr7.m12256f(i8 << 3) + 1;
                        i5 += m12256f;
                        break;
                    }
                case 8:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        object = unsafe.getObject(obj, j);
                        if (!(object instanceof yq7)) {
                            m12256f2 = qr7.m12256f(i8 << 3);
                            m12258d = qr7.m12258d((String) object);
                            m12256f3 = m12256f2 + m12258d;
                            i5 += m12256f3;
                            break;
                        }
                        int m12256f5 = qr7.m12256f(i8 << 3);
                        int mo3411o = ((yq7) object).mo3411o();
                        m12256f3 = m12256f5 + qr7.m12256f(mo3411o) + mo3411o;
                        i5 += m12256f3;
                    }
                case 9:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        m12256f = ev7.m23150Q(i8, unsafe.getObject(obj, j), m26979n(i4));
                        i5 += m12256f;
                        break;
                    }
                case 10:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        object = unsafe.getObject(obj, j);
                        int m12256f52 = qr7.m12256f(i8 << 3);
                        int mo3411o2 = ((yq7) object).mo3411o();
                        m12256f3 = m12256f52 + qr7.m12256f(mo3411o2) + mo3411o2;
                        i5 += m12256f3;
                        break;
                    }
                case 11:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i2 = unsafe.getInt(obj, j);
                        m12256f2 = qr7.m12256f(i8 << 3);
                        m12258d = qr7.m12256f(i2);
                        m12256f3 = m12256f2 + m12258d;
                        i5 += m12256f3;
                        break;
                    }
                case 12:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    int i112 = unsafe.getInt(obj, j);
                    m12256f2 = qr7.m12256f(i8 << 3);
                    m12258d = qr7.m12263G(i112);
                    m12256f3 = m12256f2 + m12258d;
                    i5 += m12256f3;
                    break;
                case 13:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    m12256f = qr7.m12256f(i8 << 3) + 4;
                    i5 += m12256f;
                    break;
                case 14:
                    if ((i6 & i) == 0) {
                        break;
                    }
                    m12256f = qr7.m12256f(i8 << 3) + 8;
                    i5 += m12256f;
                    break;
                case 15:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i12 = unsafe.getInt(obj, j);
                        m12256f2 = qr7.m12256f(i8 << 3);
                        i2 = (i12 >> 31) ^ (i12 + i12);
                        m12258d = qr7.m12256f(i2);
                        m12256f3 = m12256f2 + m12258d;
                        i5 += m12256f3;
                        break;
                    }
                case 16:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        i5 += qr7.m12256f(i8 << 3) + qr7.m12255g((j2 >> 63) ^ (j2 + j2));
                        break;
                    }
                case 17:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        m12256f = qr7.m12264F(i8, (xt7) unsafe.getObject(obj, j), m26979n(i4));
                        i5 += m12256f;
                        break;
                    }
                case 18:
                case 23:
                    m12256f = ev7.m23157J(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m12256f;
                    break;
                case 19:
                case 24:
                    m12256f = ev7.m23159H(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m12256f;
                    break;
                case 20:
                    m12256f = ev7.m23152O(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m12256f;
                    break;
                case 21:
                    m12256f = ev7.m23141Z(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m12256f;
                    break;
                case 22:
                    m12256f = ev7.m23154M(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m12256f;
                    break;
                case 25:
                    m12256f = ev7.m23166A(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m12256f;
                    break;
                case 26:
                    m23144W = ev7.m23144W(i8, (List) unsafe.getObject(obj, j));
                    i5 += m23144W;
                    break;
                case 27:
                    m23144W = ev7.m23149R(i8, (List) unsafe.getObject(obj, j), m26979n(i4));
                    i5 += m23144W;
                    break;
                case 28:
                    m23144W = ev7.m23162E(i8, (List) unsafe.getObject(obj, j));
                    i5 += m23144W;
                    break;
                case 29:
                    m23144W = ev7.m23143X(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m23144W;
                    break;
                case 30:
                    m23144W = ev7.m23161F(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m23144W;
                    break;
                case 31:
                    m23144W = ev7.m23159H(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m23144W;
                    break;
                case 32:
                    m23144W = ev7.m23157J(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m23144W;
                    break;
                case 33:
                    m23144W = ev7.m23148S(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m23144W;
                    break;
                case 34:
                    m23144W = ev7.m23146U(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += m23144W;
                    break;
                case 35:
                    m23156K = ev7.m23156K((List) unsafe.getObject(obj, j));
                    break;
                case 36:
                    m23156K = ev7.m23158I((List) unsafe.getObject(obj, j));
                    break;
                case 37:
                    m23156K = ev7.m23151P((List) unsafe.getObject(obj, j));
                    break;
                case 38:
                    m23156K = ev7.m23139a0((List) unsafe.getObject(obj, j));
                    break;
                case 39:
                    m23156K = ev7.m23153N((List) unsafe.getObject(obj, j));
                    break;
                case 40:
                    m23156K = ev7.m23156K((List) unsafe.getObject(obj, j));
                    break;
                case 41:
                    m23156K = ev7.m23158I((List) unsafe.getObject(obj, j));
                    break;
                case 42:
                    m23156K = ev7.m23163D((List) unsafe.getObject(obj, j));
                    break;
                case 43:
                    m23156K = ev7.m23142Y((List) unsafe.getObject(obj, j));
                    break;
                case 44:
                    m23156K = ev7.m23160G((List) unsafe.getObject(obj, j));
                    break;
                case 45:
                    m23156K = ev7.m23158I((List) unsafe.getObject(obj, j));
                    break;
                case 46:
                    m23156K = ev7.m23156K((List) unsafe.getObject(obj, j));
                    break;
                case 47:
                    m23156K = ev7.m23147T((List) unsafe.getObject(obj, j));
                    break;
                case 48:
                    m23156K = ev7.m23145V((List) unsafe.getObject(obj, j));
                    break;
                case 49:
                    m23144W = ev7.m23155L(i8, (List) unsafe.getObject(obj, j), m26979n(i4));
                    i5 += m23144W;
                    break;
                case 50:
                    st7.m9885a(i8, unsafe.getObject(obj, j), m26977p(i4));
                    break;
                case 58:
                    if (m27005H(obj, i8, i4)) {
                        m23144W = qr7.m12256f(i8 << 3) + 1;
                        i5 += m23144W;
                    }
                    break;
                case 59:
                    if (m27005H(obj, i8, i4)) {
                        object2 = unsafe.getObject(obj, j);
                        if (!(object2 instanceof yq7)) {
                            m12257e = qr7.m12256f(i8 << 3);
                            m23156K = qr7.m12258d((String) object2);
                            m12256f4 = m12257e + m23156K;
                            i5 += m12256f4;
                        }
                        int m12256f6 = qr7.m12256f(i8 << 3);
                        int mo3411o3 = ((yq7) object2).mo3411o();
                        m12256f4 = m12256f6 + qr7.m12256f(mo3411o3) + mo3411o3;
                        i5 += m12256f4;
                    }
                    break;
                case 60:
                    if (m27005H(obj, i8, i4)) {
                        m23144W = ev7.m23150Q(i8, unsafe.getObject(obj, j), m26979n(i4));
                        i5 += m23144W;
                    }
                    break;
                case 61:
                    if (m27005H(obj, i8, i4)) {
                        object2 = unsafe.getObject(obj, j);
                        int m12256f62 = qr7.m12256f(i8 << 3);
                        int mo3411o32 = ((yq7) object2).mo3411o();
                        m12256f4 = m12256f62 + qr7.m12256f(mo3411o32) + mo3411o32;
                        i5 += m12256f4;
                    }
                    break;
                case 62:
                    if (m27005H(obj, i8, i4)) {
                        m26992U = m26992U(obj, j);
                        m12257e = qr7.m12256f(i8 << 3);
                        m23156K = qr7.m12256f(m26992U);
                        m12256f4 = m12257e + m23156K;
                        i5 += m12256f4;
                    }
                    break;
                case 66:
                    if (m27005H(obj, i8, i4)) {
                        int m26992U2 = m26992U(obj, j);
                        m12257e = qr7.m12256f(i8 << 3);
                        m26992U = (m26992U2 >> 31) ^ (m26992U2 + m26992U2);
                        m23156K = qr7.m12256f(m26992U);
                        m12256f4 = m12257e + m23156K;
                        i5 += m12256f4;
                    }
                    break;
                case 67:
                    if (m27005H(obj, i8, i4)) {
                        long m26981l = m26981l(obj, j);
                        i5 += qr7.m12256f(i8 << 3) + qr7.m12255g((m26981l >> 63) ^ (m26981l + m26981l));
                    }
                    break;
                case 68:
                    if (m27005H(obj, i8, i4)) {
                        m23144W = qr7.m12264F(i8, (xt7) unsafe.getObject(obj, j), m26979n(i4));
                        i5 += m23144W;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        tv7 tv7Var = this.f3662m;
        int mo6727a = i5 + tv7Var.mo6727a(tv7Var.mo6724d(obj));
        if (this.f3655f) {
            this.f3663n.mo4784a(obj);
            throw null;
        }
        return mo6727a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x030e, code lost:
        if ((r4 instanceof com.daaw.yq7) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0311, code lost:
        r5 = com.daaw.qr7.m12256f(r6 << 3);
        r4 = com.daaw.qr7.m12258d((java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
        if ((r4 instanceof com.daaw.yq7) != false) goto L53;
     */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m26993T(Object obj) {
        long m21172n;
        Object m21170p;
        int m21174l;
        int m21174l2;
        int m21174l3;
        long m21172n2;
        int m23157J;
        int m23156K;
        int m12257e;
        int m12256f;
        Unsafe unsafe = f3649r;
        int i = 0;
        for (int i2 = 0; i2 < this.f3650a.length; i2 += 3) {
            int m26982k = m26982k(i2);
            int m26983j = m26983j(m26982k);
            int i3 = this.f3650a[i2];
            long j = m26982k & 1048575;
            if (m26983j >= bs7.f5134b0.zza() && m26983j <= bs7.f5147o0.zza()) {
                int i4 = this.f3650a[i2 + 2];
            }
            switch (m26983j) {
                case 0:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 8;
                    break;
                case 1:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 4;
                    break;
                case 2:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m21172n = gw7.m21172n(obj, j);
                    i += qr7.m12256f(i3 << 3) + qr7.m12255g(m21172n);
                case 3:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m21172n = gw7.m21172n(obj, j);
                    i += qr7.m12256f(i3 << 3) + qr7.m12255g(m21172n);
                case 4:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m21174l2 = gw7.m21174l(obj, j);
                    m12257e = qr7.m12256f(i3 << 3);
                    m23156K = qr7.m12263G(m21174l2);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 5:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 8;
                    break;
                case 6:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 4;
                    break;
                case 7:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 1;
                    break;
                case 8:
                    if (m27009D(obj, i2)) {
                        m21170p = gw7.m21170p(obj, j);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m23157J = ev7.m23150Q(i3, gw7.m21170p(obj, j), m26979n(i2));
                    break;
                case 10:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m21170p = gw7.m21170p(obj, j);
                    int m12256f2 = qr7.m12256f(i3 << 3);
                    int mo3411o = ((yq7) m21170p).mo3411o();
                    m12256f = m12256f2 + qr7.m12256f(mo3411o) + mo3411o;
                    i += m12256f;
                case 11:
                    if (m27009D(obj, i2)) {
                        m21174l = gw7.m21174l(obj, j);
                        m12257e = qr7.m12256f(i3 << 3);
                        m23156K = qr7.m12256f(m21174l);
                        m12256f = m12257e + m23156K;
                        i += m12256f;
                    } else {
                        continue;
                    }
                case 12:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m21174l2 = gw7.m21174l(obj, j);
                    m12257e = qr7.m12256f(i3 << 3);
                    m23156K = qr7.m12263G(m21174l2);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 13:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 4;
                    break;
                case 14:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 8;
                    break;
                case 15:
                    if (m27009D(obj, i2)) {
                        m21174l3 = gw7.m21174l(obj, j);
                        m12257e = qr7.m12256f(i3 << 3);
                        m21174l = (m21174l3 >> 31) ^ (m21174l3 + m21174l3);
                        m23156K = qr7.m12256f(m21174l);
                        m12256f = m12257e + m23156K;
                        i += m12256f;
                    } else {
                        continue;
                    }
                case 16:
                    if (m27009D(obj, i2)) {
                        m21172n2 = gw7.m21172n(obj, j);
                        m12257e = qr7.m12256f(i3 << 3);
                        m23156K = qr7.m12255g((m21172n2 >> 63) ^ (m21172n2 + m21172n2));
                        m12256f = m12257e + m23156K;
                        i += m12256f;
                    } else {
                        continue;
                    }
                case 17:
                    if (!m27009D(obj, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12264F(i3, (xt7) gw7.m21170p(obj, j), m26979n(i2));
                    break;
                case 18:
                case 23:
                case 32:
                    m23157J = ev7.m23157J(i3, (List) gw7.m21170p(obj, j), false);
                    break;
                case 19:
                case 24:
                case 31:
                    m23157J = ev7.m23159H(i3, (List) gw7.m21170p(obj, j), false);
                    break;
                case 20:
                    m23157J = ev7.m23152O(i3, (List) gw7.m21170p(obj, j), false);
                    break;
                case 21:
                    m23157J = ev7.m23141Z(i3, (List) gw7.m21170p(obj, j), false);
                    break;
                case 22:
                    m23157J = ev7.m23154M(i3, (List) gw7.m21170p(obj, j), false);
                    break;
                case 25:
                    m23157J = ev7.m23166A(i3, (List) gw7.m21170p(obj, j), false);
                    break;
                case 26:
                    m23157J = ev7.m23144W(i3, (List) gw7.m21170p(obj, j));
                    break;
                case 27:
                    m23157J = ev7.m23149R(i3, (List) gw7.m21170p(obj, j), m26979n(i2));
                    break;
                case 28:
                    m23157J = ev7.m23162E(i3, (List) gw7.m21170p(obj, j));
                    break;
                case 29:
                    m23157J = ev7.m23143X(i3, (List) gw7.m21170p(obj, j), false);
                    break;
                case 30:
                    m23157J = ev7.m23161F(i3, (List) gw7.m21170p(obj, j), false);
                    break;
                case 33:
                    m23157J = ev7.m23148S(i3, (List) gw7.m21170p(obj, j), false);
                    break;
                case 34:
                    m23157J = ev7.m23146U(i3, (List) gw7.m21170p(obj, j), false);
                    break;
                case 35:
                    m23156K = ev7.m23156K((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 36:
                    m23156K = ev7.m23158I((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 37:
                    m23156K = ev7.m23151P((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 38:
                    m23156K = ev7.m23139a0((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 39:
                    m23156K = ev7.m23153N((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 40:
                    m23156K = ev7.m23156K((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 41:
                    m23156K = ev7.m23158I((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 42:
                    m23156K = ev7.m23163D((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 43:
                    m23156K = ev7.m23142Y((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 44:
                    m23156K = ev7.m23160G((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 45:
                    m23156K = ev7.m23158I((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 46:
                    m23156K = ev7.m23156K((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 47:
                    m23156K = ev7.m23147T((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 48:
                    m23156K = ev7.m23145V((List) unsafe.getObject(obj, j));
                    if (m23156K <= 0) {
                        continue;
                    }
                    m12257e = qr7.m12257e(i3) + qr7.m12256f(m23156K);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 49:
                    m23157J = ev7.m23155L(i3, (List) gw7.m21170p(obj, j), m26979n(i2));
                    break;
                case 50:
                    st7.m9885a(i3, gw7.m21170p(obj, j), m26977p(i2));
                    continue;
                case 51:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 8;
                    break;
                case 52:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 4;
                    break;
                case 53:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m21172n = m26981l(obj, j);
                    i += qr7.m12256f(i3 << 3) + qr7.m12255g(m21172n);
                case 54:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m21172n = m26981l(obj, j);
                    i += qr7.m12256f(i3 << 3) + qr7.m12255g(m21172n);
                case 55:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m21174l2 = m26992U(obj, j);
                    m12257e = qr7.m12256f(i3 << 3);
                    m23156K = qr7.m12263G(m21174l2);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 56:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 8;
                    break;
                case 57:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 4;
                    break;
                case 58:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 1;
                    break;
                case 59:
                    if (m27005H(obj, i3, i2)) {
                        m21170p = gw7.m21170p(obj, j);
                        break;
                    } else {
                        continue;
                    }
                case 60:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m23157J = ev7.m23150Q(i3, gw7.m21170p(obj, j), m26979n(i2));
                    break;
                case 61:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m21170p = gw7.m21170p(obj, j);
                    int m12256f22 = qr7.m12256f(i3 << 3);
                    int mo3411o2 = ((yq7) m21170p).mo3411o();
                    m12256f = m12256f22 + qr7.m12256f(mo3411o2) + mo3411o2;
                    i += m12256f;
                case 62:
                    if (m27005H(obj, i3, i2)) {
                        m21174l = m26992U(obj, j);
                        m12257e = qr7.m12256f(i3 << 3);
                        m23156K = qr7.m12256f(m21174l);
                        m12256f = m12257e + m23156K;
                        i += m12256f;
                    } else {
                        continue;
                    }
                case 63:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m21174l2 = m26992U(obj, j);
                    m12257e = qr7.m12256f(i3 << 3);
                    m23156K = qr7.m12263G(m21174l2);
                    m12256f = m12257e + m23156K;
                    i += m12256f;
                case 64:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 4;
                    break;
                case 65:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12256f(i3 << 3) + 8;
                    break;
                case 66:
                    if (m27005H(obj, i3, i2)) {
                        m21174l3 = m26992U(obj, j);
                        m12257e = qr7.m12256f(i3 << 3);
                        m21174l = (m21174l3 >> 31) ^ (m21174l3 + m21174l3);
                        m23156K = qr7.m12256f(m21174l);
                        m12256f = m12257e + m23156K;
                        i += m12256f;
                    } else {
                        continue;
                    }
                case 67:
                    if (m27005H(obj, i3, i2)) {
                        m21172n2 = m26981l(obj, j);
                        m12257e = qr7.m12256f(i3 << 3);
                        m23156K = qr7.m12255g((m21172n2 >> 63) ^ (m21172n2 + m21172n2));
                        m12256f = m12257e + m23156K;
                        i += m12256f;
                    } else {
                        continue;
                    }
                case 68:
                    if (!m27005H(obj, i3, i2)) {
                        continue;
                    }
                    m23157J = qr7.m12264F(i3, (xt7) gw7.m21170p(obj, j), m26979n(i2));
                    break;
                default:
            }
            i += m23157J;
        }
        tv7 tv7Var = this.f3662m;
        return i + tv7Var.mo6727a(tv7Var.mo6724d(obj));
    }

    /* renamed from: V */
    public final int m26991V(Object obj, byte[] bArr, int i, int i2, int i3, long j, kq7 kq7Var) {
        Unsafe unsafe = f3649r;
        Object m26977p = m26977p(i3);
        Object object = unsafe.getObject(obj, j);
        if (st7.m9884b(object)) {
            rt7 m10954b = rt7.m10955a().m10954b();
            st7.m9883c(m10954b, object);
            unsafe.putObject(obj, j, m10954b);
        }
        qt7 qt7Var = (qt7) m26977p;
        throw null;
    }

    /* renamed from: W */
    public final int m26990W(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, kq7 kq7Var) {
        Unsafe unsafe = f3649r;
        long j2 = this.f3650a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(lq7.m16645p(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(lq7.m16659b(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m16648m = lq7.m16648m(bArr, i, kq7Var);
                    unsafe.putObject(obj, j, Long.valueOf(kq7Var.f16705b));
                    unsafe.putInt(obj, j2, i4);
                    return m16648m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m16651j = lq7.m16651j(bArr, i, kq7Var);
                    unsafe.putObject(obj, j, Integer.valueOf(kq7Var.f16704a));
                    unsafe.putInt(obj, j2, i4);
                    return m16651j;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(lq7.m16645p(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(lq7.m16659b(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m16648m2 = lq7.m16648m(bArr, i, kq7Var);
                    unsafe.putObject(obj, j, Boolean.valueOf(kq7Var.f16705b != 0));
                    unsafe.putInt(obj, j2, i4);
                    return m16648m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int m16651j2 = lq7.m16651j(bArr, i, kq7Var);
                    int i9 = kq7Var.f16704a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !lw7.m16411j(bArr, m16651j2, m16651j2 + i9)) {
                        throw xs7.m4540d();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m16651j2, i9, vs7.f30558b));
                        m16651j2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m16651j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object m26975r = m26975r(obj, i4, i8);
                    int m16646o = lq7.m16646o(m26975r, m26979n(i8), bArr, i, i2, kq7Var);
                    m27012A(obj, i4, i8, m26975r);
                    return m16646o;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m16660a = lq7.m16660a(bArr, i, kq7Var);
                    unsafe.putObject(obj, j, kq7Var.f16706c);
                    unsafe.putInt(obj, j2, i4);
                    return m16660a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m16651j3 = lq7.m16651j(bArr, i, kq7Var);
                    int i10 = kq7Var.f16704a;
                    ps7 m26980m = m26980m(i8);
                    if (m26980m == null || m26980m.mo3065a(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        m26999N(obj).m7672j(i3, Long.valueOf(i10));
                    }
                    return m16651j3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int m16651j4 = lq7.m16651j(bArr, i, kq7Var);
                    unsafe.putObject(obj, j, Integer.valueOf(jr7.m18301e(kq7Var.f16704a)));
                    unsafe.putInt(obj, j2, i4);
                    return m16651j4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m16648m3 = lq7.m16648m(bArr, i, kq7Var);
                    unsafe.putObject(obj, j, Long.valueOf(jr7.m18300f(kq7Var.f16705b)));
                    unsafe.putInt(obj, j2, i4);
                    return m16648m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object m26975r2 = m26975r(obj, i4, i8);
                    int m16647n = lq7.m16647n(m26975r2, m26979n(i8), bArr, i, i2, (i3 & (-8)) | 4, kq7Var);
                    m27012A(obj, i4, i8, m26975r2);
                    return m16647n;
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
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m26989X(Object obj, byte[] bArr, int i, int i2, kq7 kq7Var) {
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
        au7<T> au7Var;
        Unsafe unsafe4;
        int i9;
        int i10;
        int i11;
        au7<T> au7Var2 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i12 = i2;
        kq7 kq7Var2 = kq7Var;
        m26973t(obj);
        Unsafe unsafe5 = f3649r;
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
                i3 = lq7.m16650k(b2, bArr2, i20, kq7Var2);
                b = kq7Var2.f16704a;
            } else {
                b = b2;
                i3 = i20;
            }
            int i21 = b >>> 3;
            int i22 = b & 7;
            int m26986a0 = i21 > i16 ? au7Var2.m26986a0(i21, i17 / 3) : au7Var2.m26987Z(i21);
            if (m26986a0 == i13) {
                i4 = i3;
                i5 = i21;
                unsafe = unsafe5;
                i6 = 0;
            } else {
                int[] iArr = au7Var2.f3650a;
                int i23 = iArr[m26986a0 + 1];
                int m26983j = m26983j(i23);
                Unsafe unsafe6 = unsafe5;
                long j = i23 & i14;
                if (m26983j <= 17) {
                    int i24 = iArr[m26986a0 + 2];
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
                    switch (m26983j) {
                        case 0:
                            au7Var = this;
                            i5 = i21;
                            i6 = m26986a0;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 1) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                gw7.m21160z(obj2, j, Double.longBitsToDouble(lq7.m16645p(bArr2, i3)));
                                i15 = i3 + 8;
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                au7Var2 = au7Var;
                                i12 = i2;
                                break;
                            }
                        case 1:
                            au7Var = this;
                            i5 = i21;
                            i6 = m26986a0;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 5) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                gw7.m21193A(obj2, j, Float.intBitsToFloat(lq7.m16659b(bArr2, i3)));
                                i15 = i3 + 4;
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                au7Var2 = au7Var;
                                i12 = i2;
                                break;
                            }
                        case 2:
                        case 3:
                            au7Var = this;
                            i5 = i21;
                            i6 = m26986a0;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 0) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                int m16648m = lq7.m16648m(bArr2, i3, kq7Var2);
                                unsafe3.putLong(obj, j, kq7Var2.f16705b);
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i15 = m16648m;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                au7Var2 = au7Var;
                                i12 = i2;
                                break;
                            }
                        case 4:
                        case 11:
                            au7Var = this;
                            i5 = i21;
                            i6 = m26986a0;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 0) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                i15 = lq7.m16651j(bArr2, i3, kq7Var2);
                                unsafe3.putInt(obj2, j, kq7Var2.f16704a);
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                au7Var2 = au7Var;
                                i12 = i2;
                                break;
                            }
                        case 5:
                        case 14:
                            au7Var = this;
                            i5 = i21;
                            i6 = m26986a0;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 1) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                unsafe3.putLong(obj, j, lq7.m16645p(bArr2, i3));
                                i15 = i3 + 8;
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                au7Var2 = au7Var;
                                i12 = i2;
                                break;
                            }
                        case 6:
                        case 13:
                            au7Var = this;
                            i5 = i21;
                            i6 = m26986a0;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 5) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                unsafe3.putInt(obj2, j, lq7.m16659b(bArr2, i3));
                                i15 = i3 + 4;
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                au7Var2 = au7Var;
                                i12 = i2;
                                break;
                            }
                        case 7:
                            au7Var = this;
                            i5 = i21;
                            i6 = m26986a0;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 0) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                i15 = lq7.m16648m(bArr2, i3, kq7Var2);
                                gw7.m21162x(obj2, j, kq7Var2.f16705b != 0);
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                au7Var2 = au7Var;
                                i12 = i2;
                                break;
                            }
                        case 8:
                            au7Var = this;
                            i5 = i21;
                            i6 = m26986a0;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 2) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                i15 = (i23 & 536870912) == 0 ? lq7.m16654g(bArr2, i3, kq7Var2) : lq7.m16653h(bArr2, i3, kq7Var2);
                                unsafe3.putObject(obj2, j, kq7Var2.f16706c);
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                au7Var2 = au7Var;
                                i12 = i2;
                                break;
                            }
                        case 9:
                            i5 = i21;
                            i6 = m26986a0;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 != 2) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                au7Var = this;
                                Object m26976q = au7Var.m26976q(obj2, i6);
                                i15 = lq7.m16646o(m26976q, au7Var.m26979n(i6), bArr, i3, i2, kq7Var);
                                au7Var.m26967z(obj2, i6, m26976q);
                                i18 |= i25;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                au7Var2 = au7Var;
                                i12 = i2;
                                break;
                            }
                        case 10:
                            i5 = i21;
                            i6 = m26986a0;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 == 2) {
                                i15 = lq7.m16660a(bArr2, i3, kq7Var2);
                                unsafe3.putObject(obj2, j, kq7Var2.f16706c);
                                i18 |= i25;
                                i12 = i2;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                au7Var2 = this;
                                break;
                            }
                            i4 = i3;
                            unsafe = unsafe3;
                            i19 = i7;
                            break;
                        case 12:
                            i5 = i21;
                            i6 = m26986a0;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 == 0) {
                                i15 = lq7.m16651j(bArr2, i3, kq7Var2);
                                i8 = kq7Var2.f16704a;
                                unsafe3.putInt(obj2, j, i8);
                                i18 |= i25;
                                i12 = i2;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                au7Var2 = this;
                                break;
                            }
                            i4 = i3;
                            unsafe = unsafe3;
                            i19 = i7;
                            break;
                        case 15:
                            i5 = i21;
                            i6 = m26986a0;
                            i7 = i19;
                            unsafe3 = unsafe2;
                            if (i22 == 0) {
                                i15 = lq7.m16651j(bArr2, i3, kq7Var2);
                                i8 = jr7.m18301e(kq7Var2.f16704a);
                                unsafe3.putInt(obj2, j, i8);
                                i18 |= i25;
                                i12 = i2;
                                unsafe5 = unsafe3;
                                i17 = i6;
                                i19 = i7;
                                i16 = i5;
                                i14 = 1048575;
                                i13 = -1;
                                au7Var2 = this;
                                break;
                            }
                            i4 = i3;
                            unsafe = unsafe3;
                            i19 = i7;
                            break;
                        case 16:
                            if (i22 != 0) {
                                i5 = i21;
                                i6 = m26986a0;
                                i7 = i19;
                                unsafe3 = unsafe2;
                                i4 = i3;
                                unsafe = unsafe3;
                                i19 = i7;
                                break;
                            } else {
                                int m16648m2 = lq7.m16648m(bArr2, i3, kq7Var2);
                                unsafe2.putLong(obj, j, jr7.m18300f(kq7Var2.f16705b));
                                i18 |= i25;
                                unsafe5 = unsafe2;
                                i15 = m16648m2;
                                i17 = m26986a0;
                                i19 = i19;
                                i16 = i21;
                                i14 = 1048575;
                                i13 = -1;
                                au7Var2 = this;
                                i12 = i2;
                                break;
                            }
                        default:
                            i5 = i21;
                            i6 = m26986a0;
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
                    au7<T> au7Var3 = au7Var2;
                    i6 = m26986a0;
                    if (m26983j != 27) {
                        if (m26983j <= 49) {
                            int i28 = i3;
                            i10 = i18;
                            i11 = i27;
                            unsafe = unsafe6;
                            i15 = m26988Y(obj, bArr, i3, i2, b, i5, i22, i6, i23, m26983j, j, kq7Var);
                        } else {
                            i9 = i3;
                            i10 = i18;
                            unsafe = unsafe6;
                            i11 = i27;
                            if (m26983j != 50) {
                                i15 = m26990W(obj, bArr, i9, i2, b, i5, i22, i23, m26983j, j, i6, kq7Var);
                            } else if (i22 == 2) {
                                i15 = m26991V(obj, bArr, i9, i2, i6, j, kq7Var);
                            }
                        }
                        i14 = 1048575;
                        i13 = -1;
                        au7Var2 = this;
                    } else if (i22 == 2) {
                        us7 us7Var = (us7) unsafe6.getObject(obj2, j);
                        if (!us7Var.zzc()) {
                            int size = us7Var.size();
                            us7Var = us7Var.mo7741b(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj2, j, us7Var);
                        }
                        i15 = lq7.m16656e(au7Var3.m26979n(i6), b, bArr, i3, i2, us7Var, kq7Var);
                        i12 = i2;
                        unsafe5 = unsafe6;
                        i18 = i18;
                        i17 = i6;
                        i19 = i27;
                        i16 = i5;
                        i14 = 1048575;
                        au7Var2 = au7Var3;
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
                    i15 = lq7.m16652i(b, bArr, i4, i2, m26999N(obj), kq7Var);
                    obj2 = obj;
                    bArr2 = bArr;
                    i12 = i2;
                    kq7Var2 = kq7Var;
                    i17 = i6;
                    i16 = i5;
                    unsafe5 = unsafe;
                    i14 = 1048575;
                    i13 = -1;
                    au7Var2 = this;
                }
            }
            i15 = lq7.m16652i(b, bArr, i4, i2, m26999N(obj), kq7Var);
            obj2 = obj;
            bArr2 = bArr;
            i12 = i2;
            kq7Var2 = kq7Var;
            i17 = i6;
            i16 = i5;
            unsafe5 = unsafe;
            i14 = 1048575;
            i13 = -1;
            au7Var2 = this;
        }
        int i29 = i18;
        Unsafe unsafe7 = unsafe5;
        if (i19 != 1048575) {
            unsafe7.putInt(obj, i19, i29);
        }
        if (i15 == i2) {
            return i15;
        }
        throw xs7.m4537g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x024c, code lost:
        if (r29.f16705b != 0) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x024e, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0250, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0251, code lost:
        r12.m15837e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0254, code lost:
        if (r4 >= r19) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0256, code lost:
        r6 = com.daaw.lq7.m16651j(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x025c, code lost:
        if (r20 == r29.f16704a) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x025f, code lost:
        r4 = com.daaw.lq7.m16648m(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0267, code lost:
        if (r29.f16705b == 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x026a, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (r4 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
        r12.add(com.daaw.yq7.f33966q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        r12.add(com.daaw.yq7.m3423G(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        if (r1 >= r19) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r4 = com.daaw.lq7.m16651j(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0133, code lost:
        if (r20 == r29.f16704a) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
        r1 = com.daaw.lq7.m16651j(r17, r4, r29);
        r4 = r29.f16704a;
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
        throw com.daaw.xs7.m4534j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        throw com.daaw.xs7.m4538f();
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
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m26988Y(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, kq7 kq7Var) {
        int i8;
        int i9;
        int i10;
        int i11;
        int m16651j;
        int i12 = i;
        Unsafe unsafe = f3649r;
        us7 us7Var = (us7) unsafe.getObject(obj, j2);
        if (!us7Var.zzc()) {
            int size = us7Var.size();
            us7Var = us7Var.mo7741b(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, us7Var);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    sr7 sr7Var = (sr7) us7Var;
                    int m16651j2 = lq7.m16651j(bArr, i12, kq7Var);
                    int i13 = kq7Var.f16704a + m16651j2;
                    while (m16651j2 < i13) {
                        sr7Var.m9934e(Double.longBitsToDouble(lq7.m16645p(bArr, m16651j2)));
                        m16651j2 += 8;
                    }
                    if (m16651j2 == i13) {
                        return m16651j2;
                    }
                    throw xs7.m4534j();
                }
                if (i5 == 1) {
                    sr7 sr7Var2 = (sr7) us7Var;
                    long m16645p = lq7.m16645p(bArr, i);
                    while (true) {
                        sr7Var2.m9934e(Double.longBitsToDouble(m16645p));
                        i8 = i12 + 8;
                        if (i8 < i2) {
                            i12 = lq7.m16651j(bArr, i8, kq7Var);
                            if (i3 == kq7Var.f16704a) {
                                m16645p = lq7.m16645p(bArr, i12);
                            }
                        }
                    }
                    return i8;
                }
                return i12;
            case 19:
            case 36:
                if (i5 == 2) {
                    cs7 cs7Var = (cs7) us7Var;
                    int m16651j3 = lq7.m16651j(bArr, i12, kq7Var);
                    int i14 = kq7Var.f16704a + m16651j3;
                    while (m16651j3 < i14) {
                        cs7Var.m24988e(Float.intBitsToFloat(lq7.m16659b(bArr, m16651j3)));
                        m16651j3 += 4;
                    }
                    if (m16651j3 == i14) {
                        return m16651j3;
                    }
                    throw xs7.m4534j();
                }
                if (i5 == 5) {
                    cs7 cs7Var2 = (cs7) us7Var;
                    int m16659b = lq7.m16659b(bArr, i);
                    while (true) {
                        cs7Var2.m24988e(Float.intBitsToFloat(m16659b));
                        i9 = i12 + 4;
                        if (i9 < i2) {
                            i12 = lq7.m16651j(bArr, i9, kq7Var);
                            if (i3 == kq7Var.f16704a) {
                                m16659b = lq7.m16659b(bArr, i12);
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
                    mt7 mt7Var = (mt7) us7Var;
                    int m16651j4 = lq7.m16651j(bArr, i12, kq7Var);
                    int i15 = kq7Var.f16704a + m16651j4;
                    while (m16651j4 < i15) {
                        m16651j4 = lq7.m16648m(bArr, m16651j4, kq7Var);
                        mt7Var.m15767h(kq7Var.f16705b);
                    }
                    if (m16651j4 == i15) {
                        return m16651j4;
                    }
                    throw xs7.m4534j();
                }
                if (i5 == 0) {
                    mt7 mt7Var2 = (mt7) us7Var;
                    do {
                        int m16648m = lq7.m16648m(bArr, i12, kq7Var);
                        mt7Var2.m15767h(kq7Var.f16705b);
                        if (m16648m < i2) {
                            i12 = lq7.m16651j(bArr, m16648m, kq7Var);
                        }
                        return m16648m;
                    } while (i3 == kq7Var.f16704a);
                    return m16648m;
                }
                return i12;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return lq7.m16655f(bArr, i12, us7Var, kq7Var);
                }
                if (i5 == 0) {
                    return lq7.m16649l(i3, bArr, i, i2, us7Var, kq7Var);
                }
                return i12;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    mt7 mt7Var3 = (mt7) us7Var;
                    int m16651j5 = lq7.m16651j(bArr, i12, kq7Var);
                    int i16 = kq7Var.f16704a + m16651j5;
                    while (m16651j5 < i16) {
                        mt7Var3.m15767h(lq7.m16645p(bArr, m16651j5));
                        m16651j5 += 8;
                    }
                    if (m16651j5 == i16) {
                        return m16651j5;
                    }
                    throw xs7.m4534j();
                }
                if (i5 == 1) {
                    mt7 mt7Var4 = (mt7) us7Var;
                    long m16645p2 = lq7.m16645p(bArr, i);
                    while (true) {
                        mt7Var4.m15767h(m16645p2);
                        i10 = i12 + 8;
                        if (i10 < i2) {
                            i12 = lq7.m16651j(bArr, i10, kq7Var);
                            if (i3 == kq7Var.f16704a) {
                                m16645p2 = lq7.m16645p(bArr, i12);
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
                    ms7 ms7Var = (ms7) us7Var;
                    int m16651j6 = lq7.m16651j(bArr, i12, kq7Var);
                    int i17 = kq7Var.f16704a + m16651j6;
                    while (m16651j6 < i17) {
                        ms7Var.mo12226i(lq7.m16659b(bArr, m16651j6));
                        m16651j6 += 4;
                    }
                    if (m16651j6 == i17) {
                        return m16651j6;
                    }
                    throw xs7.m4534j();
                }
                if (i5 == 5) {
                    ms7 ms7Var2 = (ms7) us7Var;
                    int m16659b2 = lq7.m16659b(bArr, i);
                    while (true) {
                        ms7Var2.mo12226i(m16659b2);
                        i11 = i12 + 4;
                        if (i11 < i2) {
                            i12 = lq7.m16651j(bArr, i11, kq7Var);
                            if (i3 == kq7Var.f16704a) {
                                m16659b2 = lq7.m16659b(bArr, i12);
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
                        mq7 mq7Var = (mq7) us7Var;
                        int m16648m2 = lq7.m16648m(bArr, i12, kq7Var);
                        break;
                    }
                    return i12;
                }
                mq7 mq7Var2 = (mq7) us7Var;
                m16651j = lq7.m16651j(bArr, i12, kq7Var);
                int i18 = kq7Var.f16704a + m16651j;
                while (m16651j < i18) {
                    m16651j = lq7.m16648m(bArr, m16651j, kq7Var);
                    mq7Var2.m15837e(kq7Var.f16705b != 0);
                }
                if (m16651j != i18) {
                    throw xs7.m4534j();
                }
                return m16651j;
            case 26:
                if (i5 == 2) {
                    int i19 = ((j & 536870912) > 0L ? 1 : ((j & 536870912) == 0L ? 0 : -1));
                    i12 = lq7.m16651j(bArr, i12, kq7Var);
                    if (i19 == 0) {
                        int i20 = kq7Var.f16704a;
                        if (i20 < 0) {
                            throw xs7.m4538f();
                        }
                        if (i20 != 0) {
                            String str = new String(bArr, i12, i20, vs7.f30558b);
                            us7Var.add(str);
                            i12 += i20;
                            if (i12 < i2) {
                                int m16651j7 = lq7.m16651j(bArr, i12, kq7Var);
                                if (i3 == kq7Var.f16704a) {
                                    i12 = lq7.m16651j(bArr, m16651j7, kq7Var);
                                    i20 = kq7Var.f16704a;
                                    if (i20 < 0) {
                                        throw xs7.m4538f();
                                    }
                                    if (i20 != 0) {
                                        str = new String(bArr, i12, i20, vs7.f30558b);
                                        us7Var.add(str);
                                        i12 += i20;
                                        if (i12 < i2) {
                                        }
                                    }
                                }
                            }
                        }
                        us7Var.add("");
                        if (i12 < i2) {
                        }
                    } else {
                        int i21 = kq7Var.f16704a;
                        if (i21 < 0) {
                            throw xs7.m4538f();
                        }
                        if (i21 != 0) {
                            int i22 = i12 + i21;
                            if (!lw7.m16411j(bArr, i12, i22)) {
                                throw xs7.m4540d();
                            }
                            String str2 = new String(bArr, i12, i21, vs7.f30558b);
                            us7Var.add(str2);
                            i12 = i22;
                            if (i12 < i2) {
                                int m16651j8 = lq7.m16651j(bArr, i12, kq7Var);
                                if (i3 == kq7Var.f16704a) {
                                    i12 = lq7.m16651j(bArr, m16651j8, kq7Var);
                                    int i23 = kq7Var.f16704a;
                                    if (i23 < 0) {
                                        throw xs7.m4538f();
                                    }
                                    if (i23 != 0) {
                                        i22 = i12 + i23;
                                        if (!lw7.m16411j(bArr, i12, i22)) {
                                            throw xs7.m4540d();
                                        }
                                        str2 = new String(bArr, i12, i23, vs7.f30558b);
                                        us7Var.add(str2);
                                        i12 = i22;
                                        if (i12 < i2) {
                                        }
                                    }
                                }
                            }
                        }
                        us7Var.add("");
                        if (i12 < i2) {
                        }
                    }
                }
                return i12;
            case 27:
                if (i5 == 2) {
                    return lq7.m16656e(m26979n(i6), i3, bArr, i, i2, us7Var, kq7Var);
                }
                return i12;
            case 28:
                if (i5 == 2) {
                    int m16651j9 = lq7.m16651j(bArr, i12, kq7Var);
                    int i24 = kq7Var.f16704a;
                    if (i24 < 0) {
                        throw xs7.m4538f();
                    }
                    if (i24 > bArr.length - m16651j9) {
                        throw xs7.m4534j();
                    }
                }
                return i12;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        m16651j = lq7.m16649l(i3, bArr, i, i2, us7Var, kq7Var);
                    }
                    return i12;
                }
                m16651j = lq7.m16655f(bArr, i12, us7Var, kq7Var);
                ev7.m23136c(obj, i4, us7Var, m26980m(i6), null, this.f3662m);
                return m16651j;
            case 33:
            case 47:
                if (i5 == 2) {
                    ms7 ms7Var3 = (ms7) us7Var;
                    int m16651j10 = lq7.m16651j(bArr, i12, kq7Var);
                    int i25 = kq7Var.f16704a + m16651j10;
                    while (m16651j10 < i25) {
                        m16651j10 = lq7.m16651j(bArr, m16651j10, kq7Var);
                        ms7Var3.mo12226i(jr7.m18301e(kq7Var.f16704a));
                    }
                    if (m16651j10 == i25) {
                        return m16651j10;
                    }
                    throw xs7.m4534j();
                }
                if (i5 == 0) {
                    ms7 ms7Var4 = (ms7) us7Var;
                    do {
                        int m16651j11 = lq7.m16651j(bArr, i12, kq7Var);
                        ms7Var4.mo12226i(jr7.m18301e(kq7Var.f16704a));
                        if (m16651j11 < i2) {
                            i12 = lq7.m16651j(bArr, m16651j11, kq7Var);
                        }
                        return m16651j11;
                    } while (i3 == kq7Var.f16704a);
                    return m16651j11;
                }
                return i12;
            case 34:
            case 48:
                if (i5 == 2) {
                    mt7 mt7Var5 = (mt7) us7Var;
                    int m16651j12 = lq7.m16651j(bArr, i12, kq7Var);
                    int i26 = kq7Var.f16704a + m16651j12;
                    while (m16651j12 < i26) {
                        m16651j12 = lq7.m16648m(bArr, m16651j12, kq7Var);
                        mt7Var5.m15767h(jr7.m18300f(kq7Var.f16705b));
                    }
                    if (m16651j12 == i26) {
                        return m16651j12;
                    }
                    throw xs7.m4534j();
                }
                if (i5 == 0) {
                    mt7 mt7Var6 = (mt7) us7Var;
                    do {
                        int m16648m3 = lq7.m16648m(bArr, i12, kq7Var);
                        mt7Var6.m15767h(jr7.m18300f(kq7Var.f16705b));
                        if (m16648m3 < i2) {
                            i12 = lq7.m16651j(bArr, m16648m3, kq7Var);
                        }
                        return m16648m3;
                    } while (i3 == kq7Var.f16704a);
                    return m16648m3;
                }
                return i12;
            default:
                if (i5 == 3) {
                    cv7 m26979n = m26979n(i6);
                    int i27 = (i3 & (-8)) | 4;
                    int m16658c = lq7.m16658c(m26979n, bArr, i, i2, i27, kq7Var);
                    while (true) {
                        us7Var.add(kq7Var.f16706c);
                        if (m16658c < i2) {
                            int m16651j13 = lq7.m16651j(bArr, m16658c, kq7Var);
                            if (i3 == kq7Var.f16704a) {
                                m16658c = lq7.m16658c(m26979n, bArr, m16651j13, i2, i27, kq7Var);
                            }
                        }
                    }
                    return m16658c;
                }
                return i12;
        }
    }

    /* renamed from: Z */
    public final int m26987Z(int i) {
        if (i < this.f3652c || i > this.f3653d) {
            return -1;
        }
        return m26984i(i, 0);
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo24961a(Object obj) {
        int i;
        double m21176j;
        float m21175k;
        long m21172n;
        int m21174l;
        boolean m21186H;
        Object m21170p;
        int length = this.f3650a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m26982k = m26982k(i3);
            int i4 = this.f3650a[i3];
            long j = 1048575 & m26982k;
            int i5 = 37;
            switch (m26983j(m26982k)) {
                case 0:
                    i = i2 * 53;
                    m21176j = gw7.m21176j(obj, j);
                    m21172n = Double.doubleToLongBits(m21176j);
                    m21174l = vs7.m6818c(m21172n);
                    i2 = i + m21174l;
                    break;
                case 1:
                    i = i2 * 53;
                    m21175k = gw7.m21175k(obj, j);
                    m21174l = Float.floatToIntBits(m21175k);
                    i2 = i + m21174l;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i2 * 53;
                    m21172n = gw7.m21172n(obj, j);
                    m21174l = vs7.m6818c(m21172n);
                    i2 = i + m21174l;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i2 * 53;
                    m21174l = gw7.m21174l(obj, j);
                    i2 = i + m21174l;
                    break;
                case 7:
                    i = i2 * 53;
                    m21186H = gw7.m21186H(obj, j);
                    m21174l = vs7.m6820a(m21186H);
                    i2 = i + m21174l;
                    break;
                case 8:
                    i = i2 * 53;
                    m21174l = ((String) gw7.m21170p(obj, j)).hashCode();
                    i2 = i + m21174l;
                    break;
                case 9:
                    m21170p = gw7.m21170p(obj, j);
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
                    m21174l = gw7.m21170p(obj, j).hashCode();
                    i2 = i + m21174l;
                    break;
                case 17:
                    m21170p = gw7.m21170p(obj, j);
                    break;
                case 51:
                    if (m27005H(obj, i4, i3)) {
                        i = i2 * 53;
                        m21176j = m26996Q(obj, j);
                        m21172n = Double.doubleToLongBits(m21176j);
                        m21174l = vs7.m6818c(m21172n);
                        i2 = i + m21174l;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m27005H(obj, i4, i3)) {
                        i = i2 * 53;
                        m21175k = m26995R(obj, j);
                        m21174l = Float.floatToIntBits(m21175k);
                        i2 = i + m21174l;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21172n = m26981l(obj, j);
                    m21174l = vs7.m6818c(m21172n);
                    i2 = i + m21174l;
                    break;
                case 54:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21172n = m26981l(obj, j);
                    m21174l = vs7.m6818c(m21172n);
                    i2 = i + m21174l;
                    break;
                case 55:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21174l = m26992U(obj, j);
                    i2 = i + m21174l;
                    break;
                case 56:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21172n = m26981l(obj, j);
                    m21174l = vs7.m6818c(m21172n);
                    i2 = i + m21174l;
                    break;
                case 57:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21174l = m26992U(obj, j);
                    i2 = i + m21174l;
                    break;
                case 58:
                    if (m27005H(obj, i4, i3)) {
                        i = i2 * 53;
                        m21186H = m27004I(obj, j);
                        m21174l = vs7.m6820a(m21186H);
                        i2 = i + m21174l;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21174l = ((String) gw7.m21170p(obj, j)).hashCode();
                    i2 = i + m21174l;
                    break;
                case 60:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21174l = gw7.m21170p(obj, j).hashCode();
                    i2 = i + m21174l;
                    break;
                case 61:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21174l = gw7.m21170p(obj, j).hashCode();
                    i2 = i + m21174l;
                    break;
                case 62:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21174l = m26992U(obj, j);
                    i2 = i + m21174l;
                    break;
                case 63:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21174l = m26992U(obj, j);
                    i2 = i + m21174l;
                    break;
                case 64:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21174l = m26992U(obj, j);
                    i2 = i + m21174l;
                    break;
                case 65:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21172n = m26981l(obj, j);
                    m21174l = vs7.m6818c(m21172n);
                    i2 = i + m21174l;
                    break;
                case 66:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21174l = m26992U(obj, j);
                    i2 = i + m21174l;
                    break;
                case 67:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21172n = m26981l(obj, j);
                    m21174l = vs7.m6818c(m21172n);
                    i2 = i + m21174l;
                    break;
                case 68:
                    if (!m27005H(obj, i4, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    m21174l = gw7.m21170p(obj, j).hashCode();
                    i2 = i + m21174l;
                    break;
            }
        }
        int hashCode = (i2 * 53) + this.f3662m.mo6724d(obj).hashCode();
        if (this.f3655f) {
            this.f3663n.mo4784a(obj);
            throw null;
        }
        return hashCode;
    }

    /* renamed from: a0 */
    public final int m26986a0(int i, int i2) {
        if (i < this.f3652c || i > this.f3653d) {
            return -1;
        }
        return m26984i(i, i2);
    }

    @Override // com.daaw.cv7
    /* renamed from: b */
    public final void mo24960b(Object obj) {
        if (m27006G(obj)) {
            if (obj instanceof ls7) {
                ls7 ls7Var = (ls7) obj;
                ls7Var.m16596D(Integer.MAX_VALUE);
                ls7Var.zza = 0;
                ls7Var.m16598B();
            }
            int length = this.f3650a.length;
            for (int i = 0; i < length; i += 3) {
                int m26982k = m26982k(i);
                long j = 1048575 & m26982k;
                int m26983j = m26983j(m26982k);
                if (m26983j != 9) {
                    switch (m26983j) {
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
                            this.f3661l.mo16560b(obj, j);
                            continue;
                        case 50:
                            Unsafe unsafe = f3649r;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((rt7) object).m10953c();
                                unsafe.putObject(obj, j, object);
                            } else {
                                continue;
                            }
                        default:
                    }
                }
                if (m27009D(obj, i)) {
                    m26979n(i).mo24960b(f3649r.getObject(obj, j));
                }
            }
            this.f3662m.mo6715m(obj);
            if (this.f3655f) {
                this.f3663n.mo4780e(obj);
            }
        }
    }

    /* renamed from: b0 */
    public final int m26985b0(int i) {
        return this.f3650a[i + 2];
    }

    @Override // com.daaw.cv7
    /* renamed from: c */
    public final boolean mo24959c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f3659j) {
            int i6 = this.f3658i[i5];
            int i7 = this.f3650a[i6];
            int m26982k = m26982k(i6);
            int i8 = this.f3650a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f3649r.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m26982k) != 0 && !m27008E(obj, i6, i, i2, i10)) {
                return false;
            }
            int m26983j = m26983j(m26982k);
            if (m26983j != 9 && m26983j != 17) {
                if (m26983j != 27) {
                    if (m26983j == 60 || m26983j == 68) {
                        if (m27005H(obj, i7, i6) && !m27007F(obj, m26982k, m26979n(i6))) {
                            return false;
                        }
                    } else if (m26983j != 49) {
                        if (m26983j == 50 && !((rt7) gw7.m21170p(obj, m26982k & 1048575)).isEmpty()) {
                            qt7 qt7Var = (qt7) m26977p(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) gw7.m21170p(obj, m26982k & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    cv7 m26979n = m26979n(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m26979n.mo24959c(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m27008E(obj, i6, i, i2, i10) && !m27007F(obj, m26982k, m26979n(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f3655f) {
            this.f3663n.mo4784a(obj);
            throw null;
        }
        return true;
    }

    @Override // com.daaw.cv7
    /* renamed from: d */
    public final void mo24958d(Object obj, Object obj2) {
        m26973t(obj);
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.f3650a.length; i += 3) {
            int m26982k = m26982k(i);
            long j = 1048575 & m26982k;
            int i2 = this.f3650a[i];
            switch (m26983j(m26982k)) {
                case 0:
                    if (m27009D(obj2, i)) {
                        gw7.m21160z(obj, j, gw7.m21176j(obj2, j));
                        m26969x(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m27009D(obj2, i)) {
                        gw7.m21193A(obj, j, gw7.m21175k(obj2, j));
                        m26969x(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!m27009D(obj2, i)) {
                        break;
                    }
                    gw7.m21191C(obj, j, gw7.m21172n(obj2, j));
                    m26969x(obj, i);
                    break;
                case 3:
                    if (!m27009D(obj2, i)) {
                        break;
                    }
                    gw7.m21191C(obj, j, gw7.m21172n(obj2, j));
                    m26969x(obj, i);
                    break;
                case 4:
                    if (!m27009D(obj2, i)) {
                        break;
                    }
                    gw7.m21192B(obj, j, gw7.m21174l(obj2, j));
                    m26969x(obj, i);
                    break;
                case 5:
                    if (!m27009D(obj2, i)) {
                        break;
                    }
                    gw7.m21191C(obj, j, gw7.m21172n(obj2, j));
                    m26969x(obj, i);
                    break;
                case 6:
                    if (!m27009D(obj2, i)) {
                        break;
                    }
                    gw7.m21192B(obj, j, gw7.m21174l(obj2, j));
                    m26969x(obj, i);
                    break;
                case 7:
                    if (m27009D(obj2, i)) {
                        gw7.m21162x(obj, j, gw7.m21186H(obj2, j));
                        m26969x(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m27009D(obj2, i)) {
                        break;
                    }
                    gw7.m21190D(obj, j, gw7.m21170p(obj2, j));
                    m26969x(obj, i);
                    break;
                case 9:
                case 17:
                    m26972u(obj, obj2, i);
                    break;
                case 10:
                    if (!m27009D(obj2, i)) {
                        break;
                    }
                    gw7.m21190D(obj, j, gw7.m21170p(obj2, j));
                    m26969x(obj, i);
                    break;
                case 11:
                    if (!m27009D(obj2, i)) {
                        break;
                    }
                    gw7.m21192B(obj, j, gw7.m21174l(obj2, j));
                    m26969x(obj, i);
                    break;
                case 12:
                    if (!m27009D(obj2, i)) {
                        break;
                    }
                    gw7.m21192B(obj, j, gw7.m21174l(obj2, j));
                    m26969x(obj, i);
                    break;
                case 13:
                    if (!m27009D(obj2, i)) {
                        break;
                    }
                    gw7.m21192B(obj, j, gw7.m21174l(obj2, j));
                    m26969x(obj, i);
                    break;
                case 14:
                    if (!m27009D(obj2, i)) {
                        break;
                    }
                    gw7.m21191C(obj, j, gw7.m21172n(obj2, j));
                    m26969x(obj, i);
                    break;
                case 15:
                    if (!m27009D(obj2, i)) {
                        break;
                    }
                    gw7.m21192B(obj, j, gw7.m21174l(obj2, j));
                    m26969x(obj, i);
                    break;
                case 16:
                    if (!m27009D(obj2, i)) {
                        break;
                    }
                    gw7.m21191C(obj, j, gw7.m21172n(obj2, j));
                    m26969x(obj, i);
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
                    this.f3661l.mo16559c(obj, obj2, j);
                    break;
                case 50:
                    ev7.m23130i(this.f3665p, obj, obj2, j);
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
                    if (!m27005H(obj2, i2, i)) {
                        break;
                    }
                    gw7.m21190D(obj, j, gw7.m21170p(obj2, j));
                    m26968y(obj, i2, i);
                    break;
                case 60:
                case 68:
                    m26971v(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m27005H(obj2, i2, i)) {
                        break;
                    }
                    gw7.m21190D(obj, j, gw7.m21170p(obj2, j));
                    m26968y(obj, i2, i);
                    break;
            }
        }
        ev7.m23133f(this.f3662m, obj, obj2);
        if (this.f3655f) {
            ev7.m23134e(this.f3663n, obj, obj2);
        }
    }

    @Override // com.daaw.cv7
    /* renamed from: e */
    public final boolean mo24957e(Object obj, Object obj2) {
        int length = this.f3650a.length;
        for (int i = 0; i < length; i += 3) {
            int m26982k = m26982k(i);
            long j = m26982k & 1048575;
            switch (m26983j(m26982k)) {
                case 0:
                    if (m27011B(obj, obj2, i) && Double.doubleToLongBits(gw7.m21176j(obj, j)) == Double.doubleToLongBits(gw7.m21176j(obj2, j))) {
                        break;
                    }
                    return false;
                case 1:
                    if (m27011B(obj, obj2, i) && Float.floatToIntBits(gw7.m21175k(obj, j)) == Float.floatToIntBits(gw7.m21175k(obj2, j))) {
                        break;
                    }
                    return false;
                case 2:
                    if (m27011B(obj, obj2, i) && gw7.m21172n(obj, j) == gw7.m21172n(obj2, j)) {
                        break;
                    }
                    return false;
                case 3:
                    if (m27011B(obj, obj2, i) && gw7.m21172n(obj, j) == gw7.m21172n(obj2, j)) {
                        break;
                    }
                    return false;
                case 4:
                    if (m27011B(obj, obj2, i) && gw7.m21174l(obj, j) == gw7.m21174l(obj2, j)) {
                        break;
                    }
                    return false;
                case 5:
                    if (m27011B(obj, obj2, i) && gw7.m21172n(obj, j) == gw7.m21172n(obj2, j)) {
                        break;
                    }
                    return false;
                case 6:
                    if (m27011B(obj, obj2, i) && gw7.m21174l(obj, j) == gw7.m21174l(obj2, j)) {
                        break;
                    }
                    return false;
                case 7:
                    if (m27011B(obj, obj2, i) && gw7.m21186H(obj, j) == gw7.m21186H(obj2, j)) {
                        break;
                    }
                    return false;
                case 8:
                    if (m27011B(obj, obj2, i) && ev7.m23131h(gw7.m21170p(obj, j), gw7.m21170p(obj2, j))) {
                        break;
                    }
                    return false;
                case 9:
                    if (m27011B(obj, obj2, i) && ev7.m23131h(gw7.m21170p(obj, j), gw7.m21170p(obj2, j))) {
                        break;
                    }
                    return false;
                case 10:
                    if (m27011B(obj, obj2, i) && ev7.m23131h(gw7.m21170p(obj, j), gw7.m21170p(obj2, j))) {
                        break;
                    }
                    return false;
                case 11:
                    if (m27011B(obj, obj2, i) && gw7.m21174l(obj, j) == gw7.m21174l(obj2, j)) {
                        break;
                    }
                    return false;
                case 12:
                    if (m27011B(obj, obj2, i) && gw7.m21174l(obj, j) == gw7.m21174l(obj2, j)) {
                        break;
                    }
                    return false;
                case 13:
                    if (m27011B(obj, obj2, i) && gw7.m21174l(obj, j) == gw7.m21174l(obj2, j)) {
                        break;
                    }
                    return false;
                case 14:
                    if (m27011B(obj, obj2, i) && gw7.m21172n(obj, j) == gw7.m21172n(obj2, j)) {
                        break;
                    }
                    return false;
                case 15:
                    if (m27011B(obj, obj2, i) && gw7.m21174l(obj, j) == gw7.m21174l(obj2, j)) {
                        break;
                    }
                    return false;
                case 16:
                    if (m27011B(obj, obj2, i) && gw7.m21172n(obj, j) == gw7.m21172n(obj2, j)) {
                        break;
                    }
                    return false;
                case 17:
                    if (m27011B(obj, obj2, i) && ev7.m23131h(gw7.m21170p(obj, j), gw7.m21170p(obj2, j))) {
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
                    if (ev7.m23131h(gw7.m21170p(obj, j), gw7.m21170p(obj2, j))) {
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
                    long m26985b0 = m26985b0(i) & 1048575;
                    if (gw7.m21174l(obj, m26985b0) == gw7.m21174l(obj2, m26985b0) && ev7.m23131h(gw7.m21170p(obj, j), gw7.m21170p(obj2, j))) {
                        break;
                    }
                    return false;
            }
        }
        if (this.f3662m.mo6724d(obj).equals(this.f3662m.mo6724d(obj2))) {
            if (this.f3655f) {
                this.f3663n.mo4784a(obj);
                this.f3663n.mo4784a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.cv7
    /* renamed from: f */
    public final void mo24956f(Object obj, rr7 rr7Var) {
        double m21176j;
        float m21175k;
        long m21172n;
        long m21172n2;
        int m21174l;
        long m21172n3;
        int m21174l2;
        boolean m21186H;
        int m21174l3;
        int m21174l4;
        int m21174l5;
        long m21172n4;
        int m21174l6;
        long m21172n5;
        if (!this.f3657h) {
            m27003J(obj, rr7Var);
        } else if (this.f3655f) {
            this.f3663n.mo4784a(obj);
            throw null;
        } else {
            int length = this.f3650a.length;
            for (int i = 0; i < length; i += 3) {
                int m26982k = m26982k(i);
                int i2 = this.f3650a[i];
                switch (m26983j(m26982k)) {
                    case 0:
                        if (m27009D(obj, i)) {
                            m21176j = gw7.m21176j(obj, m26982k & 1048575);
                            rr7Var.m11018q(i2, m21176j);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m27009D(obj, i)) {
                            m21175k = gw7.m21175k(obj, m26982k & 1048575);
                            rr7Var.m11009z(i2, m21175k);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m27009D(obj, i)) {
                            m21172n = gw7.m21172n(obj, m26982k & 1048575);
                            rr7Var.m11041E(i2, m21172n);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m27009D(obj, i)) {
                            m21172n2 = gw7.m21172n(obj, m26982k & 1048575);
                            rr7Var.m11025j(i2, m21172n2);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m27009D(obj, i)) {
                            m21174l = gw7.m21174l(obj, m26982k & 1048575);
                            rr7Var.m11043C(i2, m21174l);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m27009D(obj, i)) {
                            m21172n3 = gw7.m21172n(obj, m26982k & 1048575);
                            rr7Var.m11011x(i2, m21172n3);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m27009D(obj, i)) {
                            m21174l2 = gw7.m21174l(obj, m26982k & 1048575);
                            rr7Var.m11013v(i2, m21174l2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m27009D(obj, i)) {
                            m21186H = gw7.m21186H(obj, m26982k & 1048575);
                            rr7Var.m11022m(i2, m21186H);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!m27009D(obj, i)) {
                            break;
                        }
                        m27001L(i2, gw7.m21170p(obj, m26982k & 1048575), rr7Var);
                        break;
                    case 9:
                        if (!m27009D(obj, i)) {
                            break;
                        }
                        rr7Var.m11039G(i2, gw7.m21170p(obj, m26982k & 1048575), m26979n(i));
                        break;
                    case 10:
                        if (!m27009D(obj, i)) {
                            break;
                        }
                        rr7Var.m11020o(i2, (yq7) gw7.m21170p(obj, m26982k & 1048575));
                        break;
                    case 11:
                        if (m27009D(obj, i)) {
                            m21174l3 = gw7.m21174l(obj, m26982k & 1048575);
                            rr7Var.m11027h(i2, m21174l3);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m27009D(obj, i)) {
                            m21174l4 = gw7.m21174l(obj, m26982k & 1048575);
                            rr7Var.m11015t(i2, m21174l4);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m27009D(obj, i)) {
                            m21174l5 = gw7.m21174l(obj, m26982k & 1048575);
                            rr7Var.m11038H(i2, m21174l5);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m27009D(obj, i)) {
                            m21172n4 = gw7.m21172n(obj, m26982k & 1048575);
                            rr7Var.m11036J(i2, m21172n4);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m27009D(obj, i)) {
                            m21174l6 = gw7.m21174l(obj, m26982k & 1048575);
                            rr7Var.m11034a(i2, m21174l6);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m27009D(obj, i)) {
                            m21172n5 = gw7.m21172n(obj, m26982k & 1048575);
                            rr7Var.m11032c(i2, m21172n5);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (!m27009D(obj, i)) {
                            break;
                        }
                        rr7Var.m11044B(i2, gw7.m21170p(obj, m26982k & 1048575), m26979n(i));
                        break;
                    case 18:
                        ev7.m23127l(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 19:
                        ev7.m23123p(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 20:
                        ev7.m23120s(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 21:
                        ev7.m23165B(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 22:
                        ev7.m23121r(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 23:
                        ev7.m23124o(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 24:
                        ev7.m23125n(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 25:
                        ev7.m23129j(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 26:
                        ev7.m23114y(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var);
                        break;
                    case 27:
                        ev7.m23119t(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, m26979n(i));
                        break;
                    case 28:
                        ev7.m23128k(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var);
                        break;
                    case 29:
                        ev7.m23113z(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 30:
                        ev7.m23126m(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 31:
                        ev7.m23118u(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 32:
                        ev7.m23117v(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 33:
                        ev7.m23116w(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 34:
                        ev7.m23115x(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, false);
                        break;
                    case 35:
                        ev7.m23127l(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 36:
                        ev7.m23123p(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 37:
                        ev7.m23120s(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 38:
                        ev7.m23165B(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 39:
                        ev7.m23121r(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 40:
                        ev7.m23124o(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 41:
                        ev7.m23125n(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 42:
                        ev7.m23129j(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 43:
                        ev7.m23113z(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 44:
                        ev7.m23126m(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 45:
                        ev7.m23118u(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 46:
                        ev7.m23117v(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 47:
                        ev7.m23116w(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 48:
                        ev7.m23115x(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, true);
                        break;
                    case 49:
                        ev7.m23122q(i2, (List) gw7.m21170p(obj, m26982k & 1048575), rr7Var, m26979n(i));
                        break;
                    case 50:
                        m27002K(rr7Var, i2, gw7.m21170p(obj, m26982k & 1048575), i);
                        break;
                    case 51:
                        if (m27005H(obj, i2, i)) {
                            m21176j = m26996Q(obj, m26982k & 1048575);
                            rr7Var.m11018q(i2, m21176j);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m27005H(obj, i2, i)) {
                            m21175k = m26995R(obj, m26982k & 1048575);
                            rr7Var.m11009z(i2, m21175k);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m27005H(obj, i2, i)) {
                            m21172n = m26981l(obj, m26982k & 1048575);
                            rr7Var.m11041E(i2, m21172n);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m27005H(obj, i2, i)) {
                            m21172n2 = m26981l(obj, m26982k & 1048575);
                            rr7Var.m11025j(i2, m21172n2);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m27005H(obj, i2, i)) {
                            m21174l = m26992U(obj, m26982k & 1048575);
                            rr7Var.m11043C(i2, m21174l);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m27005H(obj, i2, i)) {
                            m21172n3 = m26981l(obj, m26982k & 1048575);
                            rr7Var.m11011x(i2, m21172n3);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m27005H(obj, i2, i)) {
                            m21174l2 = m26992U(obj, m26982k & 1048575);
                            rr7Var.m11013v(i2, m21174l2);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m27005H(obj, i2, i)) {
                            m21186H = m27004I(obj, m26982k & 1048575);
                            rr7Var.m11022m(i2, m21186H);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!m27005H(obj, i2, i)) {
                            break;
                        }
                        m27001L(i2, gw7.m21170p(obj, m26982k & 1048575), rr7Var);
                        break;
                    case 60:
                        if (!m27005H(obj, i2, i)) {
                            break;
                        }
                        rr7Var.m11039G(i2, gw7.m21170p(obj, m26982k & 1048575), m26979n(i));
                        break;
                    case 61:
                        if (!m27005H(obj, i2, i)) {
                            break;
                        }
                        rr7Var.m11020o(i2, (yq7) gw7.m21170p(obj, m26982k & 1048575));
                        break;
                    case 62:
                        if (m27005H(obj, i2, i)) {
                            m21174l3 = m26992U(obj, m26982k & 1048575);
                            rr7Var.m11027h(i2, m21174l3);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m27005H(obj, i2, i)) {
                            m21174l4 = m26992U(obj, m26982k & 1048575);
                            rr7Var.m11015t(i2, m21174l4);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m27005H(obj, i2, i)) {
                            m21174l5 = m26992U(obj, m26982k & 1048575);
                            rr7Var.m11038H(i2, m21174l5);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m27005H(obj, i2, i)) {
                            m21172n4 = m26981l(obj, m26982k & 1048575);
                            rr7Var.m11036J(i2, m21172n4);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m27005H(obj, i2, i)) {
                            m21174l6 = m26992U(obj, m26982k & 1048575);
                            rr7Var.m11034a(i2, m21174l6);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m27005H(obj, i2, i)) {
                            m21172n5 = m26981l(obj, m26982k & 1048575);
                            rr7Var.m11032c(i2, m21172n5);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (!m27005H(obj, i2, i)) {
                            break;
                        }
                        rr7Var.m11044B(i2, gw7.m21170p(obj, m26982k & 1048575), m26979n(i));
                        break;
                }
            }
            tv7 tv7Var = this.f3662m;
            tv7Var.mo6711r(tv7Var.mo6724d(obj), rr7Var);
        }
    }

    @Override // com.daaw.cv7
    /* renamed from: g */
    public final void mo24955g(Object obj, byte[] bArr, int i, int i2, kq7 kq7Var) {
        if (this.f3657h) {
            m26989X(obj, bArr, i, i2, kq7Var);
        } else {
            m27000M(obj, bArr, i, i2, 0, kq7Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x05ae A[Catch: all -> 0x05a3, TryCatch #3 {all -> 0x05a3, blocks: (B:169:0x0579, B:183:0x05a9, B:185:0x05ae, B:186:0x05b3), top: B:211:0x0579 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05e6 A[LOOP:3: B:201:0x05e2->B:203:0x05e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05b9 A[SYNTHETIC] */
    @Override // com.daaw.cv7
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo24954h(Object obj, iu7 iu7Var, vr7 vr7Var) {
        Object obj2;
        tv7 tv7Var;
        Object obj3;
        int i;
        tv7 tv7Var2;
        Object obj4;
        wr7 wr7Var;
        vr7 vr7Var2;
        Object obj5;
        xt7 xt7Var;
        List mo16561a;
        List mo16561a2;
        List mo16561a3;
        List mo16561a4;
        List mo16561a5;
        List mo16561a6;
        List mo16561a7;
        List mo16561a8;
        List mo16561a9;
        xt7 xt7Var2;
        Object obj6 = obj;
        vr7 vr7Var3 = vr7Var;
        Objects.requireNonNull(vr7Var);
        m26973t(obj);
        tv7 tv7Var3 = this.f3662m;
        wr7 wr7Var2 = this.f3663n;
        Object obj7 = null;
        as7 as7Var = null;
        while (true) {
            try {
                int zzc = iu7Var.zzc();
                int m26987Z = m26987Z(zzc);
                if (m26987Z >= 0) {
                    tv7Var = tv7Var3;
                    obj3 = obj6;
                    try {
                        int m26982k = m26982k(m26987Z);
                        try {
                            switch (m26983j(m26982k)) {
                                case 0:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21160z(obj3, m26982k & 1048575, iu7Var.zza());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 1:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21193A(obj3, m26982k & 1048575, iu7Var.zzb());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 2:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21191C(obj3, m26982k & 1048575, iu7Var.zzl());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 3:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21191C(obj3, m26982k & 1048575, iu7Var.zzo());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 4:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21192B(obj3, m26982k & 1048575, iu7Var.zzg());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 5:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21191C(obj3, m26982k & 1048575, iu7Var.zzk());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 6:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21192B(obj3, m26982k & 1048575, iu7Var.zzf());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 7:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21162x(obj3, m26982k & 1048575, iu7Var.zzN());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 8:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    m26970w(obj3, m26982k, iu7Var);
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 9:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    xt7Var = (xt7) m26976q(obj3, m26987Z);
                                    iu7Var.mo17467k(xt7Var, m26979n(m26987Z), vr7Var2);
                                    m26967z(obj3, m26987Z, xt7Var);
                                    obj7 = obj5;
                                    break;
                                case 10:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21190D(obj3, m26982k & 1048575, iu7Var.zzp());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 11:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21192B(obj3, m26982k & 1048575, iu7Var.zzj());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 12:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    int zze = iu7Var.zze();
                                    ps7 m26980m = m26980m(m26987Z);
                                    if (m26980m != null && !m26980m.mo3065a(zze)) {
                                        obj7 = ev7.m23135d(obj3, zzc, zze, obj5, tv7Var);
                                        break;
                                    }
                                    gw7.m21192B(obj3, m26982k & 1048575, zze);
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 13:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21192B(obj3, m26982k & 1048575, iu7Var.zzh());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 14:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21191C(obj3, m26982k & 1048575, iu7Var.zzm());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 15:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21192B(obj3, m26982k & 1048575, iu7Var.zzi());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 16:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    gw7.m21191C(obj3, m26982k & 1048575, iu7Var.zzn());
                                    m26969x(obj3, m26987Z);
                                    obj7 = obj5;
                                    break;
                                case 17:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    xt7Var = (xt7) m26976q(obj3, m26987Z);
                                    iu7Var.mo17470h(xt7Var, m26979n(m26987Z), vr7Var2);
                                    m26967z(obj3, m26987Z, xt7Var);
                                    obj7 = obj5;
                                    break;
                                case 18:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17473e(mo16561a);
                                    obj7 = obj5;
                                    break;
                                case 19:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a2 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17459s(mo16561a2);
                                    obj7 = obj5;
                                    break;
                                case 20:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a3 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17475c(mo16561a3);
                                    obj7 = obj5;
                                    break;
                                case 21:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a4 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17474d(mo16561a4);
                                    obj7 = obj5;
                                    break;
                                case 22:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a5 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17471g(mo16561a5);
                                    obj7 = obj5;
                                    break;
                                case 23:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a6 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17464n(mo16561a6);
                                    obj7 = obj5;
                                    break;
                                case 24:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a7 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17466l(mo16561a7);
                                    obj7 = obj5;
                                    break;
                                case 25:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a8 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17461q(mo16561a8);
                                    obj7 = obj5;
                                    break;
                                case 26:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    if (m27010C(m26982k)) {
                                        ((kr7) iu7Var).m17458t(this.f3661l.mo16561a(obj3, m26982k & 1048575), true);
                                    } else {
                                        ((kr7) iu7Var).m17458t(this.f3661l.mo16561a(obj3, m26982k & 1048575), false);
                                    }
                                    obj7 = obj5;
                                    break;
                                case 27:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    iu7Var.mo17460r(this.f3661l.mo16561a(obj3, m26982k & 1048575), m26979n(m26987Z), vr7Var2);
                                    obj7 = obj5;
                                    break;
                                case 28:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    iu7Var.mo17472f(this.f3661l.mo16561a(obj3, m26982k & 1048575));
                                    obj7 = obj5;
                                    break;
                                case 29:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a9 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17462p(mo16561a9);
                                    obj7 = obj5;
                                    break;
                                case 30:
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    List mo16561a10 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17476b(mo16561a10);
                                    obj7 = ev7.m23136c(obj, zzc, mo16561a10, m26980m(m26987Z), obj7, tv7Var);
                                    break;
                                case 31:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    iu7Var.mo17468j(this.f3661l.mo16561a(obj3, m26982k & 1048575));
                                    obj7 = obj5;
                                    break;
                                case 32:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    iu7Var.mo17469i(this.f3661l.mo16561a(obj3, m26982k & 1048575));
                                    obj7 = obj5;
                                    break;
                                case 33:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    iu7Var.mo17463o(this.f3661l.mo16561a(obj3, m26982k & 1048575));
                                    obj7 = obj5;
                                    break;
                                case 34:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    iu7Var.mo17465m(this.f3661l.mo16561a(obj3, m26982k & 1048575));
                                    obj7 = obj5;
                                    break;
                                case 35:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17473e(mo16561a);
                                    obj7 = obj5;
                                    break;
                                case 36:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a2 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17459s(mo16561a2);
                                    obj7 = obj5;
                                    break;
                                case 37:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a3 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17475c(mo16561a3);
                                    obj7 = obj5;
                                    break;
                                case 38:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a4 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17474d(mo16561a4);
                                    obj7 = obj5;
                                    break;
                                case 39:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a5 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17471g(mo16561a5);
                                    obj7 = obj5;
                                    break;
                                case 40:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a6 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17464n(mo16561a6);
                                    obj7 = obj5;
                                    break;
                                case 41:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a7 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17466l(mo16561a7);
                                    obj7 = obj5;
                                    break;
                                case 42:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a8 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17461q(mo16561a8);
                                    obj7 = obj5;
                                    break;
                                case 43:
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    mo16561a9 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17462p(mo16561a9);
                                    obj7 = obj5;
                                    break;
                                case 44:
                                    List mo16561a11 = this.f3661l.mo16561a(obj3, m26982k & 1048575);
                                    iu7Var.mo17476b(mo16561a11);
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = ev7.m23136c(obj, zzc, mo16561a11, m26980m(m26987Z), obj7, tv7Var);
                                    break;
                                case 45:
                                    iu7Var.mo17468j(this.f3661l.mo16561a(obj3, m26982k & 1048575));
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 46:
                                    iu7Var.mo17469i(this.f3661l.mo16561a(obj3, m26982k & 1048575));
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 47:
                                    iu7Var.mo17463o(this.f3661l.mo16561a(obj3, m26982k & 1048575));
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 48:
                                    iu7Var.mo17465m(this.f3661l.mo16561a(obj3, m26982k & 1048575));
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 49:
                                    iu7Var.mo17477a(this.f3661l.mo16561a(obj3, m26982k & 1048575), m26979n(m26987Z), vr7Var3);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 50:
                                    Object m26977p = m26977p(m26987Z);
                                    long m26982k2 = m26982k(m26987Z) & 1048575;
                                    Object m21170p = gw7.m21170p(obj3, m26982k2);
                                    if (m21170p == null) {
                                        m21170p = rt7.m10955a().m10954b();
                                        gw7.m21190D(obj3, m26982k2, m21170p);
                                    } else if (st7.m9884b(m21170p)) {
                                        Object m10954b = rt7.m10955a().m10954b();
                                        st7.m9883c(m10954b, m21170p);
                                        gw7.m21190D(obj3, m26982k2, m10954b);
                                        m21170p = m10954b;
                                    }
                                    rt7 rt7Var = (rt7) m21170p;
                                    qt7 qt7Var = (qt7) m26977p;
                                    throw null;
                                    break;
                                case 51:
                                    gw7.m21190D(obj3, m26982k & 1048575, Double.valueOf(iu7Var.zza()));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 52:
                                    gw7.m21190D(obj3, m26982k & 1048575, Float.valueOf(iu7Var.zzb()));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 53:
                                    gw7.m21190D(obj3, m26982k & 1048575, Long.valueOf(iu7Var.zzl()));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 54:
                                    gw7.m21190D(obj3, m26982k & 1048575, Long.valueOf(iu7Var.zzo()));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 55:
                                    gw7.m21190D(obj3, m26982k & 1048575, Integer.valueOf(iu7Var.zzg()));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 56:
                                    gw7.m21190D(obj3, m26982k & 1048575, Long.valueOf(iu7Var.zzk()));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 57:
                                    gw7.m21190D(obj3, m26982k & 1048575, Integer.valueOf(iu7Var.zzf()));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 58:
                                    gw7.m21190D(obj3, m26982k & 1048575, Boolean.valueOf(iu7Var.zzN()));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 59:
                                    m26970w(obj3, m26982k, iu7Var);
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 60:
                                    xt7Var2 = (xt7) m26975r(obj3, zzc, m26987Z);
                                    iu7Var.mo17467k(xt7Var2, m26979n(m26987Z), vr7Var3);
                                    m27012A(obj3, zzc, m26987Z, xt7Var2);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 61:
                                    gw7.m21190D(obj3, m26982k & 1048575, iu7Var.zzp());
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 62:
                                    gw7.m21190D(obj3, m26982k & 1048575, Integer.valueOf(iu7Var.zzj()));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 63:
                                    int zze2 = iu7Var.zze();
                                    ps7 m26980m2 = m26980m(m26987Z);
                                    if (m26980m2 != null && !m26980m2.mo3065a(zze2)) {
                                        obj7 = ev7.m23135d(obj3, zzc, zze2, obj7, tv7Var);
                                        wr7Var = wr7Var2;
                                        vr7Var2 = vr7Var3;
                                        break;
                                    }
                                    gw7.m21190D(obj3, m26982k & 1048575, Integer.valueOf(zze2));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 64:
                                    gw7.m21190D(obj3, m26982k & 1048575, Integer.valueOf(iu7Var.zzh()));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 65:
                                    gw7.m21190D(obj3, m26982k & 1048575, Long.valueOf(iu7Var.zzm()));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 66:
                                    gw7.m21190D(obj3, m26982k & 1048575, Integer.valueOf(iu7Var.zzi()));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 67:
                                    gw7.m21190D(obj3, m26982k & 1048575, Long.valueOf(iu7Var.zzn()));
                                    m26968y(obj3, zzc, m26987Z);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                case 68:
                                    xt7Var2 = (xt7) m26975r(obj3, zzc, m26987Z);
                                    iu7Var.mo17470h(xt7Var2, m26979n(m26987Z), vr7Var3);
                                    m27012A(obj3, zzc, m26987Z, xt7Var2);
                                    obj5 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    obj7 = obj5;
                                    break;
                                default:
                                    obj2 = obj7;
                                    wr7Var = wr7Var2;
                                    vr7Var2 = vr7Var3;
                                    if (obj2 == null) {
                                        try {
                                            obj7 = tv7Var.mo6725c(obj3);
                                        } catch (ws7 unused) {
                                            obj7 = obj2;
                                            tv7Var.mo6712q(iu7Var);
                                            if (obj7 == null) {
                                            }
                                            if (!tv7Var.m8760p(obj7, iu7Var)) {
                                            }
                                            obj6 = obj3;
                                            wr7Var2 = wr7Var;
                                            vr7Var3 = vr7Var2;
                                            tv7Var3 = tv7Var;
                                        } catch (Throwable th) {
                                            th = th;
                                            obj7 = obj2;
                                            while (i < this.f3660k) {
                                            }
                                            if (obj7 != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        obj7 = obj2;
                                    }
                                    try {
                                        try {
                                            if (!tv7Var.m8760p(obj7, iu7Var)) {
                                                for (int i2 = this.f3659j; i2 < this.f3660k; i2++) {
                                                    obj7 = m26978o(obj, this.f3658i[i2], obj7, tv7Var, obj);
                                                }
                                                if (obj7 != null) {
                                                    tv7Var.mo6714n(obj3, obj7);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (ws7 unused2) {
                                            tv7Var.mo6712q(iu7Var);
                                            if (obj7 == null) {
                                                obj7 = tv7Var.mo6725c(obj3);
                                            }
                                            if (!tv7Var.m8760p(obj7, iu7Var)) {
                                                for (int i3 = this.f3659j; i3 < this.f3660k; i3++) {
                                                    obj7 = m26978o(obj, this.f3658i[i3], obj7, tv7Var, obj);
                                                }
                                                if (obj7 != null) {
                                                    tv7Var.mo6714n(obj3, obj7);
                                                    return;
                                                }
                                                return;
                                            }
                                            obj6 = obj3;
                                            wr7Var2 = wr7Var;
                                            vr7Var3 = vr7Var2;
                                            tv7Var3 = tv7Var;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        for (i = this.f3659j; i < this.f3660k; i++) {
                                            obj7 = m26978o(obj, this.f3658i[i], obj7, tv7Var, obj);
                                        }
                                        if (obj7 != null) {
                                            tv7Var.mo6714n(obj3, obj7);
                                        }
                                        throw th;
                                    }
                            }
                        } catch (ws7 unused3) {
                            obj2 = obj7;
                            wr7Var = wr7Var2;
                            vr7Var2 = vr7Var3;
                        }
                        obj6 = obj3;
                        wr7Var2 = wr7Var;
                        vr7Var3 = vr7Var2;
                        tv7Var3 = tv7Var;
                    } catch (Throwable th3) {
                        th = th3;
                        obj2 = obj7;
                        obj7 = obj2;
                        while (i < this.f3660k) {
                        }
                        if (obj7 != null) {
                        }
                        throw th;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i4 = this.f3659j; i4 < this.f3660k; i4++) {
                        obj7 = m26978o(obj, this.f3658i[i4], obj7, tv7Var3, obj);
                    }
                    if (obj7 != null) {
                        tv7Var3.mo6714n(obj6, obj7);
                        return;
                    }
                    return;
                } else {
                    try {
                        Object mo4782c = !this.f3655f ? null : wr7Var2.mo4782c(vr7Var3, this.f3654e, zzc);
                        if (mo4782c != null) {
                            as7 mo4783b = as7Var == null ? wr7Var2.mo4783b(obj6) : as7Var;
                            tv7Var2 = tv7Var3;
                            obj4 = obj6;
                            try {
                                obj7 = wr7Var2.mo4781d(obj, iu7Var, mo4782c, vr7Var, mo4783b, obj7, tv7Var2);
                                as7Var = mo4783b;
                            } catch (Throwable th4) {
                                th = th4;
                                obj3 = obj4;
                                tv7Var = tv7Var2;
                                obj2 = obj7;
                                obj7 = obj2;
                                while (i < this.f3660k) {
                                }
                                if (obj7 != null) {
                                }
                                throw th;
                            }
                        } else {
                            tv7Var2 = tv7Var3;
                            obj4 = obj6;
                            tv7Var2.mo6712q(iu7Var);
                            if (obj7 == null) {
                                obj7 = tv7Var2.mo6725c(obj4);
                            }
                            try {
                                if (!tv7Var2.m8760p(obj7, iu7Var)) {
                                    int i5 = this.f3659j;
                                    while (i5 < this.f3660k) {
                                        tv7 tv7Var4 = tv7Var2;
                                        obj7 = m26978o(obj, this.f3658i[i5], obj7, tv7Var4, obj);
                                        i5++;
                                        obj4 = obj4;
                                        tv7Var2 = tv7Var4;
                                    }
                                    Object obj8 = obj4;
                                    tv7 tv7Var5 = tv7Var2;
                                    if (obj7 != null) {
                                        tv7Var5.mo6714n(obj8, obj7);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj3 = obj4;
                                tv7Var = tv7Var2;
                                while (i < this.f3660k) {
                                }
                                if (obj7 != null) {
                                }
                                throw th;
                            }
                        }
                        obj6 = obj4;
                        tv7Var3 = tv7Var2;
                    } catch (Throwable th6) {
                        th = th6;
                        tv7Var = tv7Var3;
                        obj3 = obj6;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                obj2 = obj7;
                tv7Var = tv7Var3;
                obj3 = obj6;
            }
        }
    }

    /* renamed from: i */
    public final int m26984i(int i, int i2) {
        int length = (this.f3650a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f3650a[i4];
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

    /* renamed from: k */
    public final int m26982k(int i) {
        return this.f3650a[i + 1];
    }

    /* renamed from: m */
    public final ps7 m26980m(int i) {
        int i2 = i / 3;
        return (ps7) this.f3651b[i2 + i2 + 1];
    }

    /* renamed from: n */
    public final cv7 m26979n(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        cv7 cv7Var = (cv7) this.f3651b[i3];
        if (cv7Var != null) {
            return cv7Var;
        }
        cv7 m22254b = fu7.m22255a().m22254b((Class) this.f3651b[i3 + 1]);
        this.f3651b[i3] = m22254b;
        return m22254b;
    }

    /* renamed from: o */
    public final Object m26978o(Object obj, int i, Object obj2, tv7 tv7Var, Object obj3) {
        int i2 = this.f3650a[i];
        Object m21170p = gw7.m21170p(obj, m26982k(i) & 1048575);
        if (m21170p == null || m26980m(i) == null) {
            return obj2;
        }
        rt7 rt7Var = (rt7) m21170p;
        qt7 qt7Var = (qt7) m26977p(i);
        throw null;
    }

    /* renamed from: p */
    public final Object m26977p(int i) {
        int i2 = i / 3;
        return this.f3651b[i2 + i2];
    }

    /* renamed from: q */
    public final Object m26976q(Object obj, int i) {
        cv7 m26979n = m26979n(i);
        long m26982k = m26982k(i) & 1048575;
        if (m27009D(obj, i)) {
            Object object = f3649r.getObject(obj, m26982k);
            if (m27006G(object)) {
                return object;
            }
            Object zze = m26979n.zze();
            if (object != null) {
                m26979n.mo24958d(zze, object);
            }
            return zze;
        }
        return m26979n.zze();
    }

    /* renamed from: r */
    public final Object m26975r(Object obj, int i, int i2) {
        cv7 m26979n = m26979n(i2);
        if (m27005H(obj, i, i2)) {
            Object object = f3649r.getObject(obj, m26982k(i2) & 1048575);
            if (m27006G(object)) {
                return object;
            }
            Object zze = m26979n.zze();
            if (object != null) {
                m26979n.mo24958d(zze, object);
            }
            return zze;
        }
        return m26979n.zze();
    }

    /* renamed from: u */
    public final void m26972u(Object obj, Object obj2, int i) {
        if (m27009D(obj2, i)) {
            long m26982k = m26982k(i) & 1048575;
            Unsafe unsafe = f3649r;
            Object object = unsafe.getObject(obj2, m26982k);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f3650a[i] + " is present but null: " + obj2.toString());
            }
            cv7 m26979n = m26979n(i);
            if (!m27009D(obj, i)) {
                if (m27006G(object)) {
                    Object zze = m26979n.zze();
                    m26979n.mo24958d(zze, object);
                    unsafe.putObject(obj, m26982k, zze);
                } else {
                    unsafe.putObject(obj, m26982k, object);
                }
                m26969x(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m26982k);
            if (!m27006G(object2)) {
                Object zze2 = m26979n.zze();
                m26979n.mo24958d(zze2, object2);
                unsafe.putObject(obj, m26982k, zze2);
                object2 = zze2;
            }
            m26979n.mo24958d(object2, object);
        }
    }

    /* renamed from: v */
    public final void m26971v(Object obj, Object obj2, int i) {
        int i2 = this.f3650a[i];
        if (m27005H(obj2, i2, i)) {
            long m26982k = m26982k(i) & 1048575;
            Unsafe unsafe = f3649r;
            Object object = unsafe.getObject(obj2, m26982k);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f3650a[i] + " is present but null: " + obj2.toString());
            }
            cv7 m26979n = m26979n(i);
            if (!m27005H(obj, i2, i)) {
                if (m27006G(object)) {
                    Object zze = m26979n.zze();
                    m26979n.mo24958d(zze, object);
                    unsafe.putObject(obj, m26982k, zze);
                } else {
                    unsafe.putObject(obj, m26982k, object);
                }
                m26968y(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m26982k);
            if (!m27006G(object2)) {
                Object zze2 = m26979n.zze();
                m26979n.mo24958d(zze2, object2);
                unsafe.putObject(obj, m26982k, zze2);
                object2 = zze2;
            }
            m26979n.mo24958d(object2, object);
        }
    }

    /* renamed from: w */
    public final void m26970w(Object obj, int i, iu7 iu7Var) {
        long j;
        Object zzp;
        if (m27010C(i)) {
            j = i & 1048575;
            zzp = iu7Var.zzs();
        } else {
            int i2 = i & 1048575;
            if (this.f3656g) {
                j = i2;
                zzp = iu7Var.zzr();
            } else {
                j = i2;
                zzp = iu7Var.zzp();
            }
        }
        gw7.m21190D(obj, j, zzp);
    }

    /* renamed from: x */
    public final void m26969x(Object obj, int i) {
        int m26985b0 = m26985b0(i);
        long j = 1048575 & m26985b0;
        if (j == 1048575) {
            return;
        }
        gw7.m21192B(obj, j, (1 << (m26985b0 >>> 20)) | gw7.m21174l(obj, j));
    }

    /* renamed from: y */
    public final void m26968y(Object obj, int i, int i2) {
        gw7.m21192B(obj, m26985b0(i2) & 1048575, i);
    }

    /* renamed from: z */
    public final void m26967z(Object obj, int i, Object obj2) {
        f3649r.putObject(obj, m26982k(i) & 1048575, obj2);
        m26969x(obj, i);
    }

    @Override // com.daaw.cv7
    public final int zza(Object obj) {
        return this.f3657h ? m26993T(obj) : m26994S(obj);
    }

    @Override // com.daaw.cv7
    public final Object zze() {
        return ((ls7) this.f3654e).m16585n();
    }
}
