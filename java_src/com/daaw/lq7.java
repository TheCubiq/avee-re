package com.daaw;
/* loaded from: classes.dex */
public final class lq7 {
    /* renamed from: a */
    public static int m16660a(byte[] bArr, int i, kq7 kq7Var) {
        int m16651j = m16651j(bArr, i, kq7Var);
        int i2 = kq7Var.f16704a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m16651j) {
                if (i2 == 0) {
                    kq7Var.f16706c = yq7.f33966q;
                    return m16651j;
                }
                kq7Var.f16706c = yq7.m3423G(bArr, m16651j, i2);
                return m16651j + i2;
            }
            throw xs7.m4534j();
        }
        throw xs7.m4538f();
    }

    /* renamed from: b */
    public static int m16659b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    public static int m16658c(cv7 cv7Var, byte[] bArr, int i, int i2, int i3, kq7 kq7Var) {
        Object zze = cv7Var.zze();
        int m16647n = m16647n(zze, cv7Var, bArr, i, i2, i3, kq7Var);
        cv7Var.mo24960b(zze);
        kq7Var.f16706c = zze;
        return m16647n;
    }

    /* renamed from: d */
    public static int m16657d(cv7 cv7Var, byte[] bArr, int i, int i2, kq7 kq7Var) {
        Object zze = cv7Var.zze();
        int m16646o = m16646o(zze, cv7Var, bArr, i, i2, kq7Var);
        cv7Var.mo24960b(zze);
        kq7Var.f16706c = zze;
        return m16646o;
    }

    /* renamed from: e */
    public static int m16656e(cv7 cv7Var, int i, byte[] bArr, int i2, int i3, us7 us7Var, kq7 kq7Var) {
        int m16657d = m16657d(cv7Var, bArr, i2, i3, kq7Var);
        while (true) {
            us7Var.add(kq7Var.f16706c);
            if (m16657d >= i3) {
                break;
            }
            int m16651j = m16651j(bArr, m16657d, kq7Var);
            if (i != kq7Var.f16704a) {
                break;
            }
            m16657d = m16657d(cv7Var, bArr, m16651j, i3, kq7Var);
        }
        return m16657d;
    }

    /* renamed from: f */
    public static int m16655f(byte[] bArr, int i, us7 us7Var, kq7 kq7Var) {
        ms7 ms7Var = (ms7) us7Var;
        int m16651j = m16651j(bArr, i, kq7Var);
        int i2 = kq7Var.f16704a + m16651j;
        while (m16651j < i2) {
            m16651j = m16651j(bArr, m16651j, kq7Var);
            ms7Var.mo12226i(kq7Var.f16704a);
        }
        if (m16651j == i2) {
            return m16651j;
        }
        throw xs7.m4534j();
    }

    /* renamed from: g */
    public static int m16654g(byte[] bArr, int i, kq7 kq7Var) {
        int m16651j = m16651j(bArr, i, kq7Var);
        int i2 = kq7Var.f16704a;
        if (i2 >= 0) {
            if (i2 == 0) {
                kq7Var.f16706c = "";
                return m16651j;
            }
            kq7Var.f16706c = new String(bArr, m16651j, i2, vs7.f30558b);
            return m16651j + i2;
        }
        throw xs7.m4538f();
    }

    /* renamed from: h */
    public static int m16653h(byte[] bArr, int i, kq7 kq7Var) {
        int m16651j = m16651j(bArr, i, kq7Var);
        int i2 = kq7Var.f16704a;
        if (i2 >= 0) {
            if (i2 == 0) {
                kq7Var.f16706c = "";
                return m16651j;
            }
            kq7Var.f16706c = lw7.m16413h(bArr, m16651j, i2);
            return m16651j + i2;
        }
        throw xs7.m4538f();
    }

    /* renamed from: i */
    public static int m16652i(int i, byte[] bArr, int i2, int i3, uv7 uv7Var, kq7 kq7Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m16648m = m16648m(bArr, i2, kq7Var);
                uv7Var.m7672j(i, Long.valueOf(kq7Var.f16705b));
                return m16648m;
            } else if (i4 == 1) {
                uv7Var.m7672j(i, Long.valueOf(m16645p(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int m16651j = m16651j(bArr, i2, kq7Var);
                int i5 = kq7Var.f16704a;
                if (i5 >= 0) {
                    if (i5 <= bArr.length - m16651j) {
                        uv7Var.m7672j(i, i5 == 0 ? yq7.f33966q : yq7.m3423G(bArr, m16651j, i5));
                        return m16651j + i5;
                    }
                    throw xs7.m4534j();
                }
                throw xs7.m4538f();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    uv7Var.m7672j(i, Integer.valueOf(m16659b(bArr, i2)));
                    return i2 + 4;
                }
                throw xs7.m4541c();
            } else {
                int i6 = (i & (-8)) | 4;
                uv7 m7676f = uv7.m7676f();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int m16651j2 = m16651j(bArr, i2, kq7Var);
                    int i8 = kq7Var.f16704a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = m16651j2;
                        break;
                    }
                    int m16652i = m16652i(i7, bArr, m16651j2, i3, m7676f, kq7Var);
                    i7 = i8;
                    i2 = m16652i;
                }
                if (i2 > i3 || i7 != i6) {
                    throw xs7.m4537g();
                }
                uv7Var.m7672j(i, m7676f);
                return i2;
            }
        }
        throw xs7.m4541c();
    }

    /* renamed from: j */
    public static int m16651j(byte[] bArr, int i, kq7 kq7Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            kq7Var.f16704a = b;
            return i2;
        }
        return m16650k(b, bArr, i2, kq7Var);
    }

    /* renamed from: k */
    public static int m16650k(int i, byte[] bArr, int i2, kq7 kq7Var) {
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
                                kq7Var.f16704a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            kq7Var.f16704a = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        kq7Var.f16704a = i5 | i4;
        return i6;
    }

    /* renamed from: l */
    public static int m16649l(int i, byte[] bArr, int i2, int i3, us7 us7Var, kq7 kq7Var) {
        ms7 ms7Var = (ms7) us7Var;
        int m16651j = m16651j(bArr, i2, kq7Var);
        while (true) {
            ms7Var.mo12226i(kq7Var.f16704a);
            if (m16651j >= i3) {
                break;
            }
            int m16651j2 = m16651j(bArr, m16651j, kq7Var);
            if (i != kq7Var.f16704a) {
                break;
            }
            m16651j = m16651j(bArr, m16651j2, kq7Var);
        }
        return m16651j;
    }

    /* renamed from: m */
    public static int m16648m(byte[] bArr, int i, kq7 kq7Var) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            kq7Var.f16705b = j;
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
        kq7Var.f16705b = j2;
        return i3;
    }

    /* renamed from: n */
    public static int m16647n(Object obj, cv7 cv7Var, byte[] bArr, int i, int i2, int i3, kq7 kq7Var) {
        int m27000M = ((au7) cv7Var).m27000M(obj, bArr, i, i2, i3, kq7Var);
        kq7Var.f16706c = obj;
        return m27000M;
    }

    /* renamed from: o */
    public static int m16646o(Object obj, cv7 cv7Var, byte[] bArr, int i, int i2, kq7 kq7Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m16650k(i4, bArr, i3, kq7Var);
            i4 = kq7Var.f16704a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw xs7.m4534j();
        }
        int i6 = i4 + i5;
        cv7Var.mo24955g(obj, bArr, i5, i6, kq7Var);
        kq7Var.f16706c = obj;
        return i6;
    }

    /* renamed from: p */
    public static long m16645p(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
