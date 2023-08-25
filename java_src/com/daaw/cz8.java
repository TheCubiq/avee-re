package com.daaw;

import com.google.android.gms.internal.ads.zzx;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class cz8 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, p21.W0, x21.H0, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final /* synthetic */ int g = 0;

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b2 = bArr[4];
            return f((b2 & 192) >> 6, b2 & 63);
        }
        int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
        return i + i;
    }

    public static f92 c(ik5 ik5Var, String str, String str2, zzx zzxVar) {
        int i = b[(ik5Var.s() & 192) >> 6];
        int s = ik5Var.s();
        int i2 = d[(s & 56) >> 3];
        if ((s & 4) != 0) {
            i2++;
        }
        b72 b72Var = new b72();
        b72Var.h(str);
        b72Var.s("audio/ac3");
        b72Var.e0(i2);
        b72Var.t(i);
        b72Var.b(zzxVar);
        b72Var.k(str2);
        return b72Var.y();
    }

    public static f92 d(ik5 ik5Var, String str, String str2, zzx zzxVar) {
        ik5Var.g(2);
        int i = b[(ik5Var.s() & 192) >> 6];
        int s = ik5Var.s();
        int i2 = d[(s & 14) >> 1];
        if ((s & 1) != 0) {
            i2++;
        }
        if (((ik5Var.s() & 30) >> 1) > 0 && (2 & ik5Var.s()) != 0) {
            i2 += 2;
        }
        String str3 = (ik5Var.i() <= 0 || (ik5Var.s() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        b72 b72Var = new b72();
        b72Var.h(str);
        b72Var.s(str3);
        b72Var.e0(i2);
        b72Var.t(i);
        b72Var.b(zzxVar);
        b72Var.k(str2);
        return b72Var.y();
    }

    public static bz8 e(cj5 cj5Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int c2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int b2 = cj5Var.b();
        cj5Var.j(40);
        int c3 = cj5Var.c(5);
        cj5Var.h(b2);
        int i11 = -1;
        if (c3 > 10) {
            cj5Var.j(16);
            int c4 = cj5Var.c(2);
            if (c4 == 0) {
                i11 = 0;
            } else if (c4 == 1) {
                i11 = 1;
            } else if (c4 == 2) {
                i11 = 2;
            }
            cj5Var.j(3);
            int c5 = cj5Var.c(11) + 1;
            int i12 = c5 + c5;
            int c6 = cj5Var.c(2);
            if (c6 == 3) {
                i7 = c[cj5Var.c(2)];
                c2 = 3;
                i6 = 6;
            } else {
                c2 = cj5Var.c(2);
                i6 = a[c2];
                i7 = b[c6];
            }
            int i13 = i6 * 256;
            int c7 = cj5Var.c(3);
            boolean l = cj5Var.l();
            int i14 = d[c7] + (l ? 1 : 0);
            cj5Var.j(10);
            if (cj5Var.l()) {
                cj5Var.j(8);
            }
            if (c7 == 0) {
                cj5Var.j(5);
                if (cj5Var.l()) {
                    cj5Var.j(8);
                }
                i8 = 0;
                c7 = 0;
            } else {
                i8 = c7;
            }
            if (i11 == 1) {
                if (cj5Var.l()) {
                    cj5Var.j(16);
                }
                i9 = 1;
            } else {
                i9 = i11;
            }
            if (cj5Var.l()) {
                if (i8 > 2) {
                    cj5Var.j(2);
                }
                if ((i8 & 1) != 0 && i8 > 2) {
                    cj5Var.j(6);
                }
                if ((i8 & 4) != 0) {
                    cj5Var.j(6);
                }
                if (l && cj5Var.l()) {
                    cj5Var.j(5);
                }
                if (i9 == 0) {
                    if (cj5Var.l()) {
                        cj5Var.j(6);
                    }
                    if (i8 == 0 && cj5Var.l()) {
                        cj5Var.j(6);
                    }
                    if (cj5Var.l()) {
                        cj5Var.j(6);
                    }
                    int c8 = cj5Var.c(2);
                    if (c8 == 1) {
                        cj5Var.j(5);
                    } else if (c8 == 2) {
                        cj5Var.j(12);
                    } else if (c8 == 3) {
                        int c9 = cj5Var.c(5);
                        if (cj5Var.l()) {
                            cj5Var.j(5);
                            if (cj5Var.l()) {
                                cj5Var.j(4);
                            }
                            if (cj5Var.l()) {
                                cj5Var.j(4);
                            }
                            if (cj5Var.l()) {
                                cj5Var.j(4);
                            }
                            if (cj5Var.l()) {
                                cj5Var.j(4);
                            }
                            if (cj5Var.l()) {
                                cj5Var.j(4);
                            }
                            if (cj5Var.l()) {
                                cj5Var.j(4);
                            }
                            if (cj5Var.l()) {
                                cj5Var.j(4);
                            }
                            if (cj5Var.l()) {
                                if (cj5Var.l()) {
                                    cj5Var.j(4);
                                }
                                if (cj5Var.l()) {
                                    cj5Var.j(4);
                                }
                            }
                        }
                        if (cj5Var.l()) {
                            cj5Var.j(5);
                            if (cj5Var.l()) {
                                cj5Var.j(7);
                                if (cj5Var.l()) {
                                    cj5Var.j(8);
                                    cj5Var.j((c9 + 2) * 8);
                                    cj5Var.d();
                                }
                            }
                        }
                        cj5Var.j((c9 + 2) * 8);
                        cj5Var.d();
                    }
                    if (i8 < 2) {
                        if (cj5Var.l()) {
                            cj5Var.j(14);
                        }
                        if (c7 == 0 && cj5Var.l()) {
                            cj5Var.j(14);
                        }
                    }
                    if (cj5Var.l()) {
                        if (c2 == 0) {
                            cj5Var.j(5);
                            i9 = 0;
                            c2 = 0;
                        } else {
                            for (int i15 = 0; i15 < i6; i15++) {
                                if (cj5Var.l()) {
                                    cj5Var.j(5);
                                }
                            }
                        }
                    }
                    i9 = 0;
                }
            }
            if (cj5Var.l()) {
                cj5Var.j(5);
                if (i8 == 2) {
                    cj5Var.j(4);
                    i8 = 2;
                }
                if (i8 >= 6) {
                    cj5Var.j(2);
                }
                if (cj5Var.l()) {
                    i10 = 8;
                    cj5Var.j(8);
                } else {
                    i10 = 8;
                }
                if (i8 == 0 && cj5Var.l()) {
                    cj5Var.j(i10);
                }
                if (c6 < 3) {
                    cj5Var.i();
                }
            }
            if (i9 == 0 && c2 != 3) {
                cj5Var.i();
            }
            if (i9 == 2 && (c2 == 3 || cj5Var.l())) {
                cj5Var.j(6);
            }
            str = (cj5Var.l() && cj5Var.c(6) == 1 && cj5Var.c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i11;
            i = i12;
            i5 = i13;
            i2 = i7;
            i3 = i14;
        } else {
            cj5Var.j(32);
            int c10 = cj5Var.c(2);
            String str2 = c10 == 3 ? null : "audio/ac3";
            int f2 = f(c10, cj5Var.c(6));
            cj5Var.j(8);
            int c11 = cj5Var.c(3);
            if ((c11 & 1) != 0 && c11 != 1) {
                cj5Var.j(2);
            }
            if ((c11 & 4) != 0) {
                cj5Var.j(2);
            }
            if (c11 == 2) {
                cj5Var.j(2);
            }
            str = str2;
            i = f2;
            i2 = c10 < 3 ? b[c10] : -1;
            i3 = d[c11] + (cj5Var.l() ? 1 : 0);
            i4 = -1;
            i5 = 1536;
        }
        return new bz8(str, i4, i3, i2, i, i5, null);
    }

    public static int f(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            int i5 = f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
