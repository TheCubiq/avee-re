package com.daaw;
/* loaded from: classes.dex */
public final class lq7 {
    public static int a(byte[] bArr, int i, kq7 kq7Var) {
        int j = j(bArr, i, kq7Var);
        int i2 = kq7Var.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - j) {
                if (i2 == 0) {
                    kq7Var.c = yq7.q;
                    return j;
                }
                kq7Var.c = yq7.G(bArr, j, i2);
                return j + i2;
            }
            throw xs7.j();
        }
        throw xs7.f();
    }

    public static int b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int c(cv7 cv7Var, byte[] bArr, int i, int i2, int i3, kq7 kq7Var) {
        Object zze = cv7Var.zze();
        int n = n(zze, cv7Var, bArr, i, i2, i3, kq7Var);
        cv7Var.b(zze);
        kq7Var.c = zze;
        return n;
    }

    public static int d(cv7 cv7Var, byte[] bArr, int i, int i2, kq7 kq7Var) {
        Object zze = cv7Var.zze();
        int o = o(zze, cv7Var, bArr, i, i2, kq7Var);
        cv7Var.b(zze);
        kq7Var.c = zze;
        return o;
    }

    public static int e(cv7 cv7Var, int i, byte[] bArr, int i2, int i3, us7 us7Var, kq7 kq7Var) {
        int d = d(cv7Var, bArr, i2, i3, kq7Var);
        while (true) {
            us7Var.add(kq7Var.c);
            if (d >= i3) {
                break;
            }
            int j = j(bArr, d, kq7Var);
            if (i != kq7Var.a) {
                break;
            }
            d = d(cv7Var, bArr, j, i3, kq7Var);
        }
        return d;
    }

    public static int f(byte[] bArr, int i, us7 us7Var, kq7 kq7Var) {
        ms7 ms7Var = (ms7) us7Var;
        int j = j(bArr, i, kq7Var);
        int i2 = kq7Var.a + j;
        while (j < i2) {
            j = j(bArr, j, kq7Var);
            ms7Var.i(kq7Var.a);
        }
        if (j == i2) {
            return j;
        }
        throw xs7.j();
    }

    public static int g(byte[] bArr, int i, kq7 kq7Var) {
        int j = j(bArr, i, kq7Var);
        int i2 = kq7Var.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                kq7Var.c = "";
                return j;
            }
            kq7Var.c = new String(bArr, j, i2, vs7.b);
            return j + i2;
        }
        throw xs7.f();
    }

    public static int h(byte[] bArr, int i, kq7 kq7Var) {
        int j = j(bArr, i, kq7Var);
        int i2 = kq7Var.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                kq7Var.c = "";
                return j;
            }
            kq7Var.c = lw7.h(bArr, j, i2);
            return j + i2;
        }
        throw xs7.f();
    }

    public static int i(int i, byte[] bArr, int i2, int i3, uv7 uv7Var, kq7 kq7Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m(bArr, i2, kq7Var);
                uv7Var.j(i, Long.valueOf(kq7Var.b));
                return m;
            } else if (i4 == 1) {
                uv7Var.j(i, Long.valueOf(p(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = j(bArr, i2, kq7Var);
                int i5 = kq7Var.a;
                if (i5 >= 0) {
                    if (i5 <= bArr.length - j) {
                        uv7Var.j(i, i5 == 0 ? yq7.q : yq7.G(bArr, j, i5));
                        return j + i5;
                    }
                    throw xs7.j();
                }
                throw xs7.f();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    uv7Var.j(i, Integer.valueOf(b(bArr, i2)));
                    return i2 + 4;
                }
                throw xs7.c();
            } else {
                int i6 = (i & (-8)) | 4;
                uv7 f = uv7.f();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = j(bArr, i2, kq7Var);
                    int i8 = kq7Var.a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = j2;
                        break;
                    }
                    int i9 = i(i7, bArr, j2, i3, f, kq7Var);
                    i7 = i8;
                    i2 = i9;
                }
                if (i2 > i3 || i7 != i6) {
                    throw xs7.g();
                }
                uv7Var.j(i, f);
                return i2;
            }
        }
        throw xs7.c();
    }

    public static int j(byte[] bArr, int i, kq7 kq7Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            kq7Var.a = b;
            return i2;
        }
        return k(b, bArr, i2, kq7Var);
    }

    public static int k(int i, byte[] bArr, int i2, kq7 kq7Var) {
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
                                kq7Var.a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            kq7Var.a = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        kq7Var.a = i5 | i4;
        return i6;
    }

    public static int l(int i, byte[] bArr, int i2, int i3, us7 us7Var, kq7 kq7Var) {
        ms7 ms7Var = (ms7) us7Var;
        int j = j(bArr, i2, kq7Var);
        while (true) {
            ms7Var.i(kq7Var.a);
            if (j >= i3) {
                break;
            }
            int j2 = j(bArr, j, kq7Var);
            if (i != kq7Var.a) {
                break;
            }
            j = j(bArr, j2, kq7Var);
        }
        return j;
    }

    public static int m(byte[] bArr, int i, kq7 kq7Var) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            kq7Var.b = j;
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
        kq7Var.b = j2;
        return i3;
    }

    public static int n(Object obj, cv7 cv7Var, byte[] bArr, int i, int i2, int i3, kq7 kq7Var) {
        int M = ((au7) cv7Var).M(obj, bArr, i, i2, i3, kq7Var);
        kq7Var.c = obj;
        return M;
    }

    public static int o(Object obj, cv7 cv7Var, byte[] bArr, int i, int i2, kq7 kq7Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = k(i4, bArr, i3, kq7Var);
            i4 = kq7Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw xs7.j();
        }
        int i6 = i4 + i5;
        cv7Var.g(obj, bArr, i5, i6, kq7Var);
        kq7Var.c = obj;
        return i6;
    }

    public static long p(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
