package com.daaw;
/* loaded from: classes2.dex */
public final class h58 {
    public static int a(byte[] bArr, int i, e58 e58Var) {
        int j = j(bArr, i, e58Var);
        int i2 = e58Var.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - j) {
                if (i2 == 0) {
                    e58Var.c = y68.q;
                    return j;
                }
                e58Var.c = y68.q(bArr, j, i2);
                return j + i2;
            }
            throw mb8.f();
        }
        throw mb8.d();
    }

    public static int b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int c(ve8 ve8Var, byte[] bArr, int i, int i2, int i3, e58 e58Var) {
        Object zze = ve8Var.zze();
        int n = n(zze, ve8Var, bArr, i, i2, i3, e58Var);
        ve8Var.b(zze);
        e58Var.c = zze;
        return n;
    }

    public static int d(ve8 ve8Var, byte[] bArr, int i, int i2, e58 e58Var) {
        Object zze = ve8Var.zze();
        int o = o(zze, ve8Var, bArr, i, i2, e58Var);
        ve8Var.b(zze);
        e58Var.c = zze;
        return o;
    }

    public static int e(ve8 ve8Var, int i, byte[] bArr, int i2, int i3, db8 db8Var, e58 e58Var) {
        int d = d(ve8Var, bArr, i2, i3, e58Var);
        while (true) {
            db8Var.add(e58Var.c);
            if (d >= i3) {
                break;
            }
            int j = j(bArr, d, e58Var);
            if (i != e58Var.a) {
                break;
            }
            d = d(ve8Var, bArr, j, i3, e58Var);
        }
        return d;
    }

    public static int f(byte[] bArr, int i, db8 db8Var, e58 e58Var) {
        ma8 ma8Var = (ma8) db8Var;
        int j = j(bArr, i, e58Var);
        int i2 = e58Var.a + j;
        while (j < i2) {
            j = j(bArr, j, e58Var);
            ma8Var.i(e58Var.a);
        }
        if (j == i2) {
            return j;
        }
        throw mb8.f();
    }

    public static int g(byte[] bArr, int i, e58 e58Var) {
        int j = j(bArr, i, e58Var);
        int i2 = e58Var.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                e58Var.c = "";
                return j;
            }
            e58Var.c = new String(bArr, j, i2, gb8.b);
            return j + i2;
        }
        throw mb8.d();
    }

    public static int h(byte[] bArr, int i, e58 e58Var) {
        int j = j(bArr, i, e58Var);
        int i2 = e58Var.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                e58Var.c = "";
                return j;
            }
            e58Var.c = ei8.d(bArr, j, i2);
            return j + i2;
        }
        throw mb8.d();
    }

    public static int i(int i, byte[] bArr, int i2, int i3, qg8 qg8Var, e58 e58Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m(bArr, i2, e58Var);
                qg8Var.j(i, Long.valueOf(e58Var.b));
                return m;
            } else if (i4 == 1) {
                qg8Var.j(i, Long.valueOf(p(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = j(bArr, i2, e58Var);
                int i5 = e58Var.a;
                if (i5 >= 0) {
                    if (i5 <= bArr.length - j) {
                        qg8Var.j(i, i5 == 0 ? y68.q : y68.q(bArr, j, i5));
                        return j + i5;
                    }
                    throw mb8.f();
                }
                throw mb8.d();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    qg8Var.j(i, Integer.valueOf(b(bArr, i2)));
                    return i2 + 4;
                }
                throw mb8.b();
            } else {
                int i6 = (i & (-8)) | 4;
                qg8 f = qg8.f();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = j(bArr, i2, e58Var);
                    int i8 = e58Var.a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = j2;
                        break;
                    }
                    int i9 = i(i7, bArr, j2, i3, f, e58Var);
                    i7 = i8;
                    i2 = i9;
                }
                if (i2 > i3 || i7 != i6) {
                    throw mb8.e();
                }
                qg8Var.j(i, f);
                return i2;
            }
        }
        throw mb8.b();
    }

    public static int j(byte[] bArr, int i, e58 e58Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            e58Var.a = b;
            return i2;
        }
        return k(b, bArr, i2, e58Var);
    }

    public static int k(int i, byte[] bArr, int i2, e58 e58Var) {
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
                                e58Var.a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            e58Var.a = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        e58Var.a = i5 | i4;
        return i6;
    }

    public static int l(int i, byte[] bArr, int i2, int i3, db8 db8Var, e58 e58Var) {
        ma8 ma8Var = (ma8) db8Var;
        int j = j(bArr, i2, e58Var);
        while (true) {
            ma8Var.i(e58Var.a);
            if (j >= i3) {
                break;
            }
            int j2 = j(bArr, j, e58Var);
            if (i != e58Var.a) {
                break;
            }
            j = j(bArr, j2, e58Var);
        }
        return j;
    }

    public static int m(byte[] bArr, int i, e58 e58Var) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            e58Var.b = j;
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
        e58Var.b = j2;
        return i3;
    }

    public static int n(Object obj, ve8 ve8Var, byte[] bArr, int i, int i2, int i3, e58 e58Var) {
        int H = ((fe8) ve8Var).H(obj, bArr, i, i2, i3, e58Var);
        e58Var.c = obj;
        return H;
    }

    public static int o(Object obj, ve8 ve8Var, byte[] bArr, int i, int i2, e58 e58Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = k(i4, bArr, i3, e58Var);
            i4 = e58Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw mb8.f();
        }
        int i6 = i4 + i5;
        ve8Var.g(obj, bArr, i5, i6, e58Var);
        e58Var.c = obj;
        return i6;
    }

    public static long p(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
