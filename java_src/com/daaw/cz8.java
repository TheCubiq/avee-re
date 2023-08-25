package com.daaw;

import com.google.android.gms.internal.ads.zzx;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class cz8 {

    /* renamed from: a */
    public static final int[] f6316a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f6317b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f6318c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f6319d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f6320e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    public static final int[] f6321f = {69, 87, p21.f22346W0, x21.f31794H0, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g */
    public static final /* synthetic */ int f6322g = 0;

    /* renamed from: a */
    public static int m24854a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f6316a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* renamed from: b */
    public static int m24853b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return m24849f((b & 192) >> 6, b & 63);
        }
        int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
        return i + i;
    }

    /* renamed from: c */
    public static f92 m24852c(ik5 ik5Var, String str, String str2, zzx zzxVar) {
        int i = f6317b[(ik5Var.m19703s() & 192) >> 6];
        int m19703s = ik5Var.m19703s();
        int i2 = f6319d[(m19703s & 56) >> 3];
        if ((m19703s & 4) != 0) {
            i2++;
        }
        b72 b72Var = new b72();
        b72Var.m26384h(str);
        b72Var.m26372s("audio/ac3");
        b72Var.m26389e0(i2);
        b72Var.m26371t(i);
        b72Var.m26396b(zzxVar);
        b72Var.m26380k(str2);
        return b72Var.m26366y();
    }

    /* renamed from: d */
    public static f92 m24851d(ik5 ik5Var, String str, String str2, zzx zzxVar) {
        ik5Var.m19715g(2);
        int i = f6317b[(ik5Var.m19703s() & 192) >> 6];
        int m19703s = ik5Var.m19703s();
        int i2 = f6319d[(m19703s & 14) >> 1];
        if ((m19703s & 1) != 0) {
            i2++;
        }
        if (((ik5Var.m19703s() & 30) >> 1) > 0 && (2 & ik5Var.m19703s()) != 0) {
            i2 += 2;
        }
        String str3 = (ik5Var.m19713i() <= 0 || (ik5Var.m19703s() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        b72 b72Var = new b72();
        b72Var.m26384h(str);
        b72Var.m26372s(str3);
        b72Var.m26389e0(i2);
        b72Var.m26371t(i);
        b72Var.m26396b(zzxVar);
        b72Var.m26380k(str2);
        return b72Var.m26366y();
    }

    /* renamed from: e */
    public static bz8 m24850e(cj5 cj5Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int m25329c;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int m25330b = cj5Var.m25330b();
        cj5Var.m25322j(40);
        int m25329c2 = cj5Var.m25329c(5);
        cj5Var.m25324h(m25330b);
        int i11 = -1;
        if (m25329c2 > 10) {
            cj5Var.m25322j(16);
            int m25329c3 = cj5Var.m25329c(2);
            if (m25329c3 == 0) {
                i11 = 0;
            } else if (m25329c3 == 1) {
                i11 = 1;
            } else if (m25329c3 == 2) {
                i11 = 2;
            }
            cj5Var.m25322j(3);
            int m25329c4 = cj5Var.m25329c(11) + 1;
            int i12 = m25329c4 + m25329c4;
            int m25329c5 = cj5Var.m25329c(2);
            if (m25329c5 == 3) {
                i7 = f6318c[cj5Var.m25329c(2)];
                m25329c = 3;
                i6 = 6;
            } else {
                m25329c = cj5Var.m25329c(2);
                i6 = f6316a[m25329c];
                i7 = f6317b[m25329c5];
            }
            int i13 = i6 * 256;
            int m25329c6 = cj5Var.m25329c(3);
            boolean m25320l = cj5Var.m25320l();
            int i14 = f6319d[m25329c6] + (m25320l ? 1 : 0);
            cj5Var.m25322j(10);
            if (cj5Var.m25320l()) {
                cj5Var.m25322j(8);
            }
            if (m25329c6 == 0) {
                cj5Var.m25322j(5);
                if (cj5Var.m25320l()) {
                    cj5Var.m25322j(8);
                }
                i8 = 0;
                m25329c6 = 0;
            } else {
                i8 = m25329c6;
            }
            if (i11 == 1) {
                if (cj5Var.m25320l()) {
                    cj5Var.m25322j(16);
                }
                i9 = 1;
            } else {
                i9 = i11;
            }
            if (cj5Var.m25320l()) {
                if (i8 > 2) {
                    cj5Var.m25322j(2);
                }
                if ((i8 & 1) != 0 && i8 > 2) {
                    cj5Var.m25322j(6);
                }
                if ((i8 & 4) != 0) {
                    cj5Var.m25322j(6);
                }
                if (m25320l && cj5Var.m25320l()) {
                    cj5Var.m25322j(5);
                }
                if (i9 == 0) {
                    if (cj5Var.m25320l()) {
                        cj5Var.m25322j(6);
                    }
                    if (i8 == 0 && cj5Var.m25320l()) {
                        cj5Var.m25322j(6);
                    }
                    if (cj5Var.m25320l()) {
                        cj5Var.m25322j(6);
                    }
                    int m25329c7 = cj5Var.m25329c(2);
                    if (m25329c7 == 1) {
                        cj5Var.m25322j(5);
                    } else if (m25329c7 == 2) {
                        cj5Var.m25322j(12);
                    } else if (m25329c7 == 3) {
                        int m25329c8 = cj5Var.m25329c(5);
                        if (cj5Var.m25320l()) {
                            cj5Var.m25322j(5);
                            if (cj5Var.m25320l()) {
                                cj5Var.m25322j(4);
                            }
                            if (cj5Var.m25320l()) {
                                cj5Var.m25322j(4);
                            }
                            if (cj5Var.m25320l()) {
                                cj5Var.m25322j(4);
                            }
                            if (cj5Var.m25320l()) {
                                cj5Var.m25322j(4);
                            }
                            if (cj5Var.m25320l()) {
                                cj5Var.m25322j(4);
                            }
                            if (cj5Var.m25320l()) {
                                cj5Var.m25322j(4);
                            }
                            if (cj5Var.m25320l()) {
                                cj5Var.m25322j(4);
                            }
                            if (cj5Var.m25320l()) {
                                if (cj5Var.m25320l()) {
                                    cj5Var.m25322j(4);
                                }
                                if (cj5Var.m25320l()) {
                                    cj5Var.m25322j(4);
                                }
                            }
                        }
                        if (cj5Var.m25320l()) {
                            cj5Var.m25322j(5);
                            if (cj5Var.m25320l()) {
                                cj5Var.m25322j(7);
                                if (cj5Var.m25320l()) {
                                    cj5Var.m25322j(8);
                                    cj5Var.m25322j((m25329c8 + 2) * 8);
                                    cj5Var.m25328d();
                                }
                            }
                        }
                        cj5Var.m25322j((m25329c8 + 2) * 8);
                        cj5Var.m25328d();
                    }
                    if (i8 < 2) {
                        if (cj5Var.m25320l()) {
                            cj5Var.m25322j(14);
                        }
                        if (m25329c6 == 0 && cj5Var.m25320l()) {
                            cj5Var.m25322j(14);
                        }
                    }
                    if (cj5Var.m25320l()) {
                        if (m25329c == 0) {
                            cj5Var.m25322j(5);
                            i9 = 0;
                            m25329c = 0;
                        } else {
                            for (int i15 = 0; i15 < i6; i15++) {
                                if (cj5Var.m25320l()) {
                                    cj5Var.m25322j(5);
                                }
                            }
                        }
                    }
                    i9 = 0;
                }
            }
            if (cj5Var.m25320l()) {
                cj5Var.m25322j(5);
                if (i8 == 2) {
                    cj5Var.m25322j(4);
                    i8 = 2;
                }
                if (i8 >= 6) {
                    cj5Var.m25322j(2);
                }
                if (cj5Var.m25320l()) {
                    i10 = 8;
                    cj5Var.m25322j(8);
                } else {
                    i10 = 8;
                }
                if (i8 == 0 && cj5Var.m25320l()) {
                    cj5Var.m25322j(i10);
                }
                if (m25329c5 < 3) {
                    cj5Var.m25323i();
                }
            }
            if (i9 == 0 && m25329c != 3) {
                cj5Var.m25323i();
            }
            if (i9 == 2 && (m25329c == 3 || cj5Var.m25320l())) {
                cj5Var.m25322j(6);
            }
            str = (cj5Var.m25320l() && cj5Var.m25329c(6) == 1 && cj5Var.m25329c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i11;
            i = i12;
            i5 = i13;
            i2 = i7;
            i3 = i14;
        } else {
            cj5Var.m25322j(32);
            int m25329c9 = cj5Var.m25329c(2);
            String str2 = m25329c9 == 3 ? null : "audio/ac3";
            int m24849f = m24849f(m25329c9, cj5Var.m25329c(6));
            cj5Var.m25322j(8);
            int m25329c10 = cj5Var.m25329c(3);
            if ((m25329c10 & 1) != 0 && m25329c10 != 1) {
                cj5Var.m25322j(2);
            }
            if ((m25329c10 & 4) != 0) {
                cj5Var.m25322j(2);
            }
            if (m25329c10 == 2) {
                cj5Var.m25322j(2);
            }
            str = str2;
            i = m24849f;
            i2 = m25329c9 < 3 ? f6317b[m25329c9] : -1;
            i3 = f6319d[m25329c10] + (cj5Var.m25320l() ? 1 : 0);
            i4 = -1;
            i5 = 1536;
        }
        return new bz8(str, i4, i3, i2, i, i5, null);
    }

    /* renamed from: f */
    public static int m24849f(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f6317b[i];
        if (i4 == 44100) {
            int i5 = f6321f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f6320e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
