package com.daaw;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
/* renamed from: com.daaw.u */
/* loaded from: classes.dex */
public final class C3150u {

    /* renamed from: a */
    public static final int[] f28295a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f28296b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f28297c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f28298d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f28299e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    public static final int[] f28300f = {69, 87, p21.f22346W0, x21.f31794H0, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.daaw.u$b */
    /* loaded from: classes.dex */
    public static final class C3152b {

        /* renamed from: a */
        public final String f28301a;

        /* renamed from: b */
        public final int f28302b;

        /* renamed from: c */
        public final int f28303c;

        /* renamed from: d */
        public final int f28304d;

        /* renamed from: e */
        public final int f28305e;

        /* renamed from: f */
        public final int f28306f;

        public C3152b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f28301a = str;
            this.f28302b = i;
            this.f28304d = i2;
            this.f28303c = i3;
            this.f28305e = i4;
            this.f28306f = i5;
        }
    }

    /* renamed from: a */
    public static int m8656a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((byteBuffer.getInt(i + 4) & (-16777217)) == -1167101192) {
                return i - position;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m8655b() {
        return 1536;
    }

    /* renamed from: c */
    public static int m8654c(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = f28296b;
            if (i >= iArr.length || i2 < 0) {
                return -1;
            }
            int[] iArr2 = f28300f;
            if (i3 >= iArr2.length) {
                return -1;
            }
            int i4 = iArr[i];
            if (i4 == 44100) {
                return (iArr2[i3] + (i2 % 2)) * 2;
            }
            int i5 = f28299e[i3];
            return i4 == 32000 ? i5 * 6 : i5 * 4;
        }
        return -1;
    }

    /* renamed from: d */
    public static Format m8653d(rv0 rv0Var, String str, String str2, DrmInitData drmInitData) {
        int i = f28296b[(rv0Var.m10896x() & 192) >> 6];
        int m10896x = rv0Var.m10896x();
        int i2 = f28298d[(m10896x & 56) >> 3];
        if ((m10896x & 4) != 0) {
            i2++;
        }
        return Format.m1722u(str, "audio/ac3", null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    /* renamed from: e */
    public static C3152b m8652e(qv0 qv0Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int m12125h;
        int i6;
        int i7;
        int i8;
        int m12128e = qv0Var.m12128e();
        qv0Var.m12118o(40);
        boolean z = qv0Var.m12125h(5) == 16;
        qv0Var.m12120m(m12128e);
        int i9 = -1;
        if (z) {
            qv0Var.m12118o(16);
            int m12125h2 = qv0Var.m12125h(2);
            if (m12125h2 == 0) {
                i9 = 0;
            } else if (m12125h2 == 1) {
                i9 = 1;
            } else if (m12125h2 == 2) {
                i9 = 2;
            }
            qv0Var.m12118o(3);
            int m12125h3 = (qv0Var.m12125h(11) + 1) * 2;
            int m12125h4 = qv0Var.m12125h(2);
            if (m12125h4 == 3) {
                i7 = f28297c[qv0Var.m12125h(2)];
                m12125h = 3;
                i6 = 6;
            } else {
                m12125h = qv0Var.m12125h(2);
                i6 = f28295a[m12125h];
                i7 = f28296b[m12125h4];
            }
            int i10 = i6 * 256;
            int m12125h5 = qv0Var.m12125h(3);
            boolean m12126g = qv0Var.m12126g();
            int i11 = f28298d[m12125h5] + (m12126g ? 1 : 0);
            qv0Var.m12118o(10);
            if (qv0Var.m12126g()) {
                qv0Var.m12118o(8);
            }
            if (m12125h5 == 0) {
                qv0Var.m12118o(5);
                if (qv0Var.m12126g()) {
                    qv0Var.m12118o(8);
                }
            }
            if (i9 == 1 && qv0Var.m12126g()) {
                qv0Var.m12118o(16);
            }
            if (qv0Var.m12126g()) {
                if (m12125h5 > 2) {
                    qv0Var.m12118o(2);
                }
                if ((m12125h5 & 1) != 0 && m12125h5 > 2) {
                    qv0Var.m12118o(6);
                }
                if ((m12125h5 & 4) != 0) {
                    qv0Var.m12118o(6);
                }
                if (m12126g && qv0Var.m12126g()) {
                    qv0Var.m12118o(5);
                }
                if (i9 == 0) {
                    if (qv0Var.m12126g()) {
                        qv0Var.m12118o(6);
                    }
                    if (m12125h5 == 0 && qv0Var.m12126g()) {
                        qv0Var.m12118o(6);
                    }
                    if (qv0Var.m12126g()) {
                        qv0Var.m12118o(6);
                    }
                    int m12125h6 = qv0Var.m12125h(2);
                    if (m12125h6 == 1) {
                        qv0Var.m12118o(5);
                    } else if (m12125h6 == 2) {
                        qv0Var.m12118o(12);
                    } else if (m12125h6 == 3) {
                        int m12125h7 = qv0Var.m12125h(5);
                        if (qv0Var.m12126g()) {
                            qv0Var.m12118o(5);
                            if (qv0Var.m12126g()) {
                                qv0Var.m12118o(4);
                            }
                            if (qv0Var.m12126g()) {
                                qv0Var.m12118o(4);
                            }
                            if (qv0Var.m12126g()) {
                                qv0Var.m12118o(4);
                            }
                            if (qv0Var.m12126g()) {
                                qv0Var.m12118o(4);
                            }
                            if (qv0Var.m12126g()) {
                                qv0Var.m12118o(4);
                            }
                            if (qv0Var.m12126g()) {
                                qv0Var.m12118o(4);
                            }
                            if (qv0Var.m12126g()) {
                                qv0Var.m12118o(4);
                            }
                            if (qv0Var.m12126g()) {
                                if (qv0Var.m12126g()) {
                                    qv0Var.m12118o(4);
                                }
                                if (qv0Var.m12126g()) {
                                    qv0Var.m12118o(4);
                                }
                            }
                        }
                        if (qv0Var.m12126g()) {
                            qv0Var.m12118o(5);
                            if (qv0Var.m12126g()) {
                                qv0Var.m12118o(7);
                                if (qv0Var.m12126g()) {
                                    qv0Var.m12118o(8);
                                }
                            }
                        }
                        qv0Var.m12118o((m12125h7 + 2) * 8);
                        qv0Var.m12130c();
                    }
                    if (m12125h5 < 2) {
                        if (qv0Var.m12126g()) {
                            qv0Var.m12118o(14);
                        }
                        if (m12125h5 == 0 && qv0Var.m12126g()) {
                            qv0Var.m12118o(14);
                        }
                    }
                    if (qv0Var.m12126g()) {
                        if (m12125h == 0) {
                            qv0Var.m12118o(5);
                        } else {
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (qv0Var.m12126g()) {
                                    qv0Var.m12118o(5);
                                }
                            }
                        }
                    }
                }
            }
            if (qv0Var.m12126g()) {
                qv0Var.m12118o(5);
                if (m12125h5 == 2) {
                    qv0Var.m12118o(4);
                }
                if (m12125h5 >= 6) {
                    qv0Var.m12118o(2);
                }
                if (qv0Var.m12126g()) {
                    qv0Var.m12118o(8);
                }
                if (m12125h5 == 0 && qv0Var.m12126g()) {
                    qv0Var.m12118o(8);
                }
                i8 = 3;
                if (m12125h4 < 3) {
                    qv0Var.m12119n();
                }
            } else {
                i8 = 3;
            }
            if (i9 == 0 && m12125h != i8) {
                qv0Var.m12119n();
            }
            if (i9 == 2 && (m12125h == i8 || qv0Var.m12126g())) {
                qv0Var.m12118o(6);
            }
            str = (qv0Var.m12126g() && qv0Var.m12125h(6) == 1 && qv0Var.m12125h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i9;
            i = m12125h3;
            i2 = i7;
            i5 = i10;
            i3 = i11;
        } else {
            qv0Var.m12118o(32);
            int m12125h8 = qv0Var.m12125h(2);
            int m8654c = m8654c(m12125h8, qv0Var.m12125h(6));
            qv0Var.m12118o(8);
            int m12125h9 = qv0Var.m12125h(3);
            if ((m12125h9 & 1) != 0 && m12125h9 != 1) {
                qv0Var.m12118o(2);
            }
            if ((m12125h9 & 4) != 0) {
                qv0Var.m12118o(2);
            }
            if (m12125h9 == 2) {
                qv0Var.m12118o(2);
            }
            str = "audio/ac3";
            i = m8654c;
            i2 = f28296b[m12125h8];
            i3 = f28298d[m12125h9] + (qv0Var.m12126g() ? 1 : 0);
            i4 = -1;
            i5 = 1536;
        }
        return new C3152b(str, i4, i3, i2, i, i5);
    }

    /* renamed from: f */
    public static int m8651f(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        return m8654c((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    /* renamed from: g */
    public static Format m8650g(rv0 rv0Var, String str, String str2, DrmInitData drmInitData) {
        rv0Var.m10920K(2);
        int i = f28296b[(rv0Var.m10896x() & 192) >> 6];
        int m10896x = rv0Var.m10896x();
        int i2 = f28298d[(m10896x & 14) >> 1];
        if ((m10896x & 1) != 0) {
            i2++;
        }
        if (((rv0Var.m10896x() & 30) >> 1) > 0 && (2 & rv0Var.m10896x()) != 0) {
            i2 += 2;
        }
        return Format.m1722u(str, (rv0Var.m10919a() <= 0 || (rv0Var.m10896x() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    /* renamed from: h */
    public static int m8649h(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f28295a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    /* renamed from: i */
    public static int m8648i(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* renamed from: j */
    public static int m8647j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }
}
