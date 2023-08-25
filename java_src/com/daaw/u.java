package com.daaw;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class u {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, p21.W0, x21.H0, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(String str, int i, int i2, int i3, int i4, int i5) {
            this.a = str;
            this.b = i;
            this.d = i2;
            this.c = i3;
            this.e = i4;
            this.f = i5;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((byteBuffer.getInt(i + 4) & (-16777217)) == -1167101192) {
                return i - position;
            }
        }
        return -1;
    }

    public static int b() {
        return 1536;
    }

    public static int c(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = b;
            if (i >= iArr.length || i2 < 0) {
                return -1;
            }
            int[] iArr2 = f;
            if (i3 >= iArr2.length) {
                return -1;
            }
            int i4 = iArr[i];
            if (i4 == 44100) {
                return (iArr2[i3] + (i2 % 2)) * 2;
            }
            int i5 = e[i3];
            return i4 == 32000 ? i5 * 6 : i5 * 4;
        }
        return -1;
    }

    public static Format d(rv0 rv0Var, String str, String str2, DrmInitData drmInitData) {
        int i = b[(rv0Var.x() & 192) >> 6];
        int x = rv0Var.x();
        int i2 = d[(x & 56) >> 3];
        if ((x & 4) != 0) {
            i2++;
        }
        return Format.u(str, "audio/ac3", null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    public static b e(qv0 qv0Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int h;
        int i6;
        int i7;
        int i8;
        int e2 = qv0Var.e();
        qv0Var.o(40);
        boolean z = qv0Var.h(5) == 16;
        qv0Var.m(e2);
        int i9 = -1;
        if (z) {
            qv0Var.o(16);
            int h2 = qv0Var.h(2);
            if (h2 == 0) {
                i9 = 0;
            } else if (h2 == 1) {
                i9 = 1;
            } else if (h2 == 2) {
                i9 = 2;
            }
            qv0Var.o(3);
            int h3 = (qv0Var.h(11) + 1) * 2;
            int h4 = qv0Var.h(2);
            if (h4 == 3) {
                i7 = c[qv0Var.h(2)];
                h = 3;
                i6 = 6;
            } else {
                h = qv0Var.h(2);
                i6 = a[h];
                i7 = b[h4];
            }
            int i10 = i6 * 256;
            int h5 = qv0Var.h(3);
            boolean g = qv0Var.g();
            int i11 = d[h5] + (g ? 1 : 0);
            qv0Var.o(10);
            if (qv0Var.g()) {
                qv0Var.o(8);
            }
            if (h5 == 0) {
                qv0Var.o(5);
                if (qv0Var.g()) {
                    qv0Var.o(8);
                }
            }
            if (i9 == 1 && qv0Var.g()) {
                qv0Var.o(16);
            }
            if (qv0Var.g()) {
                if (h5 > 2) {
                    qv0Var.o(2);
                }
                if ((h5 & 1) != 0 && h5 > 2) {
                    qv0Var.o(6);
                }
                if ((h5 & 4) != 0) {
                    qv0Var.o(6);
                }
                if (g && qv0Var.g()) {
                    qv0Var.o(5);
                }
                if (i9 == 0) {
                    if (qv0Var.g()) {
                        qv0Var.o(6);
                    }
                    if (h5 == 0 && qv0Var.g()) {
                        qv0Var.o(6);
                    }
                    if (qv0Var.g()) {
                        qv0Var.o(6);
                    }
                    int h6 = qv0Var.h(2);
                    if (h6 == 1) {
                        qv0Var.o(5);
                    } else if (h6 == 2) {
                        qv0Var.o(12);
                    } else if (h6 == 3) {
                        int h7 = qv0Var.h(5);
                        if (qv0Var.g()) {
                            qv0Var.o(5);
                            if (qv0Var.g()) {
                                qv0Var.o(4);
                            }
                            if (qv0Var.g()) {
                                qv0Var.o(4);
                            }
                            if (qv0Var.g()) {
                                qv0Var.o(4);
                            }
                            if (qv0Var.g()) {
                                qv0Var.o(4);
                            }
                            if (qv0Var.g()) {
                                qv0Var.o(4);
                            }
                            if (qv0Var.g()) {
                                qv0Var.o(4);
                            }
                            if (qv0Var.g()) {
                                qv0Var.o(4);
                            }
                            if (qv0Var.g()) {
                                if (qv0Var.g()) {
                                    qv0Var.o(4);
                                }
                                if (qv0Var.g()) {
                                    qv0Var.o(4);
                                }
                            }
                        }
                        if (qv0Var.g()) {
                            qv0Var.o(5);
                            if (qv0Var.g()) {
                                qv0Var.o(7);
                                if (qv0Var.g()) {
                                    qv0Var.o(8);
                                }
                            }
                        }
                        qv0Var.o((h7 + 2) * 8);
                        qv0Var.c();
                    }
                    if (h5 < 2) {
                        if (qv0Var.g()) {
                            qv0Var.o(14);
                        }
                        if (h5 == 0 && qv0Var.g()) {
                            qv0Var.o(14);
                        }
                    }
                    if (qv0Var.g()) {
                        if (h == 0) {
                            qv0Var.o(5);
                        } else {
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (qv0Var.g()) {
                                    qv0Var.o(5);
                                }
                            }
                        }
                    }
                }
            }
            if (qv0Var.g()) {
                qv0Var.o(5);
                if (h5 == 2) {
                    qv0Var.o(4);
                }
                if (h5 >= 6) {
                    qv0Var.o(2);
                }
                if (qv0Var.g()) {
                    qv0Var.o(8);
                }
                if (h5 == 0 && qv0Var.g()) {
                    qv0Var.o(8);
                }
                i8 = 3;
                if (h4 < 3) {
                    qv0Var.n();
                }
            } else {
                i8 = 3;
            }
            if (i9 == 0 && h != i8) {
                qv0Var.n();
            }
            if (i9 == 2 && (h == i8 || qv0Var.g())) {
                qv0Var.o(6);
            }
            str = (qv0Var.g() && qv0Var.h(6) == 1 && qv0Var.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i9;
            i = h3;
            i2 = i7;
            i5 = i10;
            i3 = i11;
        } else {
            qv0Var.o(32);
            int h8 = qv0Var.h(2);
            int c2 = c(h8, qv0Var.h(6));
            qv0Var.o(8);
            int h9 = qv0Var.h(3);
            if ((h9 & 1) != 0 && h9 != 1) {
                qv0Var.o(2);
            }
            if ((h9 & 4) != 0) {
                qv0Var.o(2);
            }
            if (h9 == 2) {
                qv0Var.o(2);
            }
            str = "audio/ac3";
            i = c2;
            i2 = b[h8];
            i3 = d[h9] + (qv0Var.g() ? 1 : 0);
            i4 = -1;
            i5 = 1536;
        }
        return new b(str, i4, i3, i2, i, i5);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        return c((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static Format g(rv0 rv0Var, String str, String str2, DrmInitData drmInitData) {
        rv0Var.K(2);
        int i = b[(rv0Var.x() & 192) >> 6];
        int x = rv0Var.x();
        int i2 = d[(x & 14) >> 1];
        if ((x & 1) != 0) {
            i2++;
        }
        if (((rv0Var.x() & 30) >> 1) > 0 && (2 & rv0Var.x()) != 0) {
            i2 += 2;
        }
        return Format.u(str, (rv0Var.a() <= 0 || (rv0Var.x() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    public static int h(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static int i(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }
}
