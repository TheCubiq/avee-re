package com.daaw;
/* loaded from: classes2.dex */
public final class h58 {
    /* renamed from: a */
    public static int m21017a(byte[] bArr, int i, e58 e58Var) {
        int m21008j = m21008j(bArr, i, e58Var);
        int i2 = e58Var.f8130a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m21008j) {
                if (i2 == 0) {
                    e58Var.f8132c = y68.f33399q;
                    return m21008j;
                }
                e58Var.f8132c = y68.m4063q(bArr, m21008j, i2);
                return m21008j + i2;
            }
            throw mb8.m16104f();
        }
        throw mb8.m16106d();
    }

    /* renamed from: b */
    public static int m21016b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    public static int m21015c(ve8 ve8Var, byte[] bArr, int i, int i2, int i3, e58 e58Var) {
        Object zze = ve8Var.zze();
        int m21004n = m21004n(zze, ve8Var, bArr, i, i2, i3, e58Var);
        ve8Var.mo7204b(zze);
        e58Var.f8132c = zze;
        return m21004n;
    }

    /* renamed from: d */
    public static int m21014d(ve8 ve8Var, byte[] bArr, int i, int i2, e58 e58Var) {
        Object zze = ve8Var.zze();
        int m21003o = m21003o(zze, ve8Var, bArr, i, i2, e58Var);
        ve8Var.mo7204b(zze);
        e58Var.f8132c = zze;
        return m21003o;
    }

    /* renamed from: e */
    public static int m21013e(ve8 ve8Var, int i, byte[] bArr, int i2, int i3, db8 db8Var, e58 e58Var) {
        int m21014d = m21014d(ve8Var, bArr, i2, i3, e58Var);
        while (true) {
            db8Var.add(e58Var.f8132c);
            if (m21014d >= i3) {
                break;
            }
            int m21008j = m21008j(bArr, m21014d, e58Var);
            if (i != e58Var.f8130a) {
                break;
            }
            m21014d = m21014d(ve8Var, bArr, m21008j, i3, e58Var);
        }
        return m21014d;
    }

    /* renamed from: f */
    public static int m21012f(byte[] bArr, int i, db8 db8Var, e58 e58Var) {
        ma8 ma8Var = (ma8) db8Var;
        int m21008j = m21008j(bArr, i, e58Var);
        int i2 = e58Var.f8130a + m21008j;
        while (m21008j < i2) {
            m21008j = m21008j(bArr, m21008j, e58Var);
            ma8Var.m16123i(e58Var.f8130a);
        }
        if (m21008j == i2) {
            return m21008j;
        }
        throw mb8.m16104f();
    }

    /* renamed from: g */
    public static int m21011g(byte[] bArr, int i, e58 e58Var) {
        int m21008j = m21008j(bArr, i, e58Var);
        int i2 = e58Var.f8130a;
        if (i2 >= 0) {
            if (i2 == 0) {
                e58Var.f8132c = "";
                return m21008j;
            }
            e58Var.f8132c = new String(bArr, m21008j, i2, gb8.f11017b);
            return m21008j + i2;
        }
        throw mb8.m16106d();
    }

    /* renamed from: h */
    public static int m21010h(byte[] bArr, int i, e58 e58Var) {
        int m21008j = m21008j(bArr, i, e58Var);
        int i2 = e58Var.f8130a;
        if (i2 >= 0) {
            if (i2 == 0) {
                e58Var.f8132c = "";
                return m21008j;
            }
            e58Var.f8132c = ei8.m23448d(bArr, m21008j, i2);
            return m21008j + i2;
        }
        throw mb8.m16106d();
    }

    /* renamed from: i */
    public static int m21009i(int i, byte[] bArr, int i2, int i3, qg8 qg8Var, e58 e58Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m21005m = m21005m(bArr, i2, e58Var);
                qg8Var.m12537j(i, Long.valueOf(e58Var.f8131b));
                return m21005m;
            } else if (i4 == 1) {
                qg8Var.m12537j(i, Long.valueOf(m21002p(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int m21008j = m21008j(bArr, i2, e58Var);
                int i5 = e58Var.f8130a;
                if (i5 >= 0) {
                    if (i5 <= bArr.length - m21008j) {
                        qg8Var.m12537j(i, i5 == 0 ? y68.f33399q : y68.m4063q(bArr, m21008j, i5));
                        return m21008j + i5;
                    }
                    throw mb8.m16104f();
                }
                throw mb8.m16106d();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    qg8Var.m12537j(i, Integer.valueOf(m21016b(bArr, i2)));
                    return i2 + 4;
                }
                throw mb8.m16108b();
            } else {
                int i6 = (i & (-8)) | 4;
                qg8 m12541f = qg8.m12541f();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int m21008j2 = m21008j(bArr, i2, e58Var);
                    int i8 = e58Var.f8130a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = m21008j2;
                        break;
                    }
                    int m21009i = m21009i(i7, bArr, m21008j2, i3, m12541f, e58Var);
                    i7 = i8;
                    i2 = m21009i;
                }
                if (i2 > i3 || i7 != i6) {
                    throw mb8.m16105e();
                }
                qg8Var.m12537j(i, m12541f);
                return i2;
            }
        }
        throw mb8.m16108b();
    }

    /* renamed from: j */
    public static int m21008j(byte[] bArr, int i, e58 e58Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            e58Var.f8130a = b;
            return i2;
        }
        return m21007k(b, bArr, i2, e58Var);
    }

    /* renamed from: k */
    public static int m21007k(int i, byte[] bArr, int i2, e58 e58Var) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                e58Var.f8130a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            e58Var.f8130a = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        e58Var.f8130a = i5 | i4;
        return i6;
    }

    /* renamed from: l */
    public static int m21006l(int i, byte[] bArr, int i2, int i3, db8 db8Var, e58 e58Var) {
        ma8 ma8Var = (ma8) db8Var;
        int m21008j = m21008j(bArr, i2, e58Var);
        while (true) {
            ma8Var.m16123i(e58Var.f8130a);
            if (m21008j >= i3) {
                break;
            }
            int m21008j2 = m21008j(bArr, m21008j, e58Var);
            if (i != e58Var.f8130a) {
                break;
            }
            m21008j = m21008j(bArr, m21008j2, e58Var);
        }
        return m21008j;
    }

    /* renamed from: m */
    public static int m21005m(byte[] bArr, int i, e58 e58Var) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            e58Var.f8131b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        e58Var.f8131b = j2;
        return i3;
    }

    /* renamed from: n */
    public static int m21004n(Object obj, ve8 ve8Var, byte[] bArr, int i, int i2, int i3, e58 e58Var) {
        int m22735H = ((fe8) ve8Var).m22735H(obj, bArr, i, i2, i3, e58Var);
        e58Var.f8132c = obj;
        return m22735H;
    }

    /* renamed from: o */
    public static int m21003o(Object obj, ve8 ve8Var, byte[] bArr, int i, int i2, e58 e58Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m21007k(i4, bArr, i3, e58Var);
            i4 = e58Var.f8130a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw mb8.m16104f();
        }
        int i6 = i4 + i5;
        ve8Var.mo7199g(obj, bArr, i5, i6, e58Var);
        e58Var.f8132c = obj;
        return i6;
    }

    /* renamed from: p */
    public static long m21002p(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
