package com.daaw;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzadr;
import com.google.android.gms.internal.ads.zzbq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class r92 {
    public static final byte[] a = it5.B("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (r3 != 13) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(com.daaw.b92 r11) {
        /*
            com.daaw.ik5 r11 = r11.b
            r0 = 8
            r11.f(r0)
            r1 = 0
            r2 = r1
            r3 = r2
        La:
            int r4 = r11.i()
            if (r4 < r0) goto Ldf
            int r4 = r11.k()
            int r5 = r11.m()
            int r6 = r11.m()
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r6 != r7) goto L75
            r11.f(r4)
            int r2 = r4 + r5
            r11.g(r0)
            d(r11)
        L2c:
            int r6 = r11.k()
            if (r6 >= r2) goto L73
            int r6 = r11.k()
            int r7 = r11.m()
            int r8 = r11.m()
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r8 != r9) goto L6e
            r11.f(r6)
            int r6 = r6 + r7
            r11.g(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L4f:
            int r7 = r11.k()
            if (r7 >= r6) goto L5f
            com.google.android.gms.internal.ads.zzbp r7 = com.daaw.y92.a(r11)
            if (r7 == 0) goto L4f
            r2.add(r7)
            goto L4f
        L5f:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L66
            goto L73
        L66:
            com.google.android.gms.internal.ads.zzbq r6 = new com.google.android.gms.internal.ads.zzbq
            r6.<init>(r2)
            r2 = r6
            goto Ld9
        L6e:
            int r6 = r6 + r7
            r11.f(r6)
            goto L2c
        L73:
            r2 = r1
            goto Ld9
        L75:
            r7 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r6 != r7) goto Ld9
            r11.f(r4)
            int r3 = r4 + r5
            r6 = 12
            r11.g(r6)
        L84:
            int r7 = r11.k()
            if (r7 >= r3) goto Ld8
            int r7 = r11.k()
            int r8 = r11.m()
            int r9 = r11.m()
            r10 = 1935766900(0x73617574, float:1.7862687E31)
            if (r9 != r10) goto Ld3
            r3 = 14
            if (r8 >= r3) goto La0
            goto Ld8
        La0:
            r3 = 5
            r11.g(r3)
            int r3 = r11.s()
            r7 = 1123024896(0x42f00000, float:120.0)
            if (r3 == r6) goto Lb1
            r6 = 13
            if (r3 == r6) goto Lb5
            goto Ld8
        Lb1:
            if (r3 != r6) goto Lb5
            r7 = 1131413504(0x43700000, float:240.0)
        Lb5:
            r3 = 1
            r11.g(r3)
            int r6 = r11.s()
            com.google.android.gms.internal.ads.zzbq r8 = new com.google.android.gms.internal.ads.zzbq
            com.google.android.gms.internal.ads.zzbp[] r3 = new com.google.android.gms.internal.ads.zzbp[r3]
            com.google.android.gms.internal.ads.zzadx r9 = new com.google.android.gms.internal.ads.zzadx
            r9.<init>(r7, r6)
            r6 = 0
            r3[r6] = r9
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.<init>(r6, r3)
            r3 = r8
            goto Ld9
        Ld3:
            int r7 = r7 + r8
            r11.f(r7)
            goto L84
        Ld8:
            r3 = r1
        Ld9:
            int r4 = r4 + r5
            r11.f(r4)
            goto La
        Ldf:
            android.util.Pair r11 = android.util.Pair.create(r2, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.r92.a(com.daaw.b92):android.util.Pair");
    }

    public static zzbq b(a92 a92Var) {
        zzadr zzadrVar;
        b92 d = a92Var.d(1751411826);
        b92 d2 = a92Var.d(1801812339);
        b92 d3 = a92Var.d(1768715124);
        if (d == null || d2 == null || d3 == null || g(d.b) != 1835299937) {
            return null;
        }
        ik5 ik5Var = d2.b;
        ik5Var.f(12);
        int m = ik5Var.m();
        String[] strArr = new String[m];
        for (int i = 0; i < m; i++) {
            int m2 = ik5Var.m();
            ik5Var.g(4);
            strArr[i] = ik5Var.F(m2 - 8, cy6.c);
        }
        ik5 ik5Var2 = d3.b;
        ik5Var2.f(8);
        ArrayList arrayList = new ArrayList();
        while (ik5Var2.i() > 8) {
            int k = ik5Var2.k();
            int m3 = ik5Var2.m();
            int m4 = ik5Var2.m() - 1;
            if (m4 < 0 || m4 >= m) {
                s95.e("AtomParsers", "Skipped metadata with unknown key index: " + m4);
            } else {
                String str = strArr[m4];
                int i2 = k + m3;
                int i3 = y92.b;
                while (true) {
                    int k2 = ik5Var2.k();
                    if (k2 >= i2) {
                        zzadrVar = null;
                        break;
                    }
                    int m5 = ik5Var2.m();
                    if (ik5Var2.m() == 1684108385) {
                        int m6 = ik5Var2.m();
                        int m7 = ik5Var2.m();
                        int i4 = m5 - 16;
                        byte[] bArr = new byte[i4];
                        ik5Var2.b(bArr, 0, i4);
                        zzadrVar = new zzadr(str, bArr, m7, m6);
                        break;
                    }
                    ik5Var2.f(k2 + m5);
                }
                if (zzadrVar != null) {
                    arrayList.add(zzadrVar);
                }
            }
            ik5Var2.f(k + m3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
        if (r7 == 0) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0665, code lost:
        if (r1 != 3) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x075e, code lost:
        if (r25 == null) goto L588;
     */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0aa4 A[LOOP:13: B:488:0x0aa4->B:492:0x0aae, LOOP_START, PHI: r23 
      PHI: (r23v8 int) = (r23v7 int), (r23v9 int) binds: [B:487:0x0aa2, B:492:0x0aae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0afe  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b13  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0b16  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0b8f  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0e02  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0a9d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List c(com.daaw.a92 r58, com.daaw.y09 r59, long r60, com.google.android.gms.internal.ads.zzx r62, boolean r63, boolean r64, com.daaw.ey6 r65) {
        /*
            Method dump skipped, instructions count: 3601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.r92.c(com.daaw.a92, com.daaw.y09, long, com.google.android.gms.internal.ads.zzx, boolean, boolean, com.daaw.ey6):java.util.List");
    }

    public static void d(ik5 ik5Var) {
        int k = ik5Var.k();
        ik5Var.g(4);
        if (ik5Var.m() != 1751411826) {
            k += 4;
        }
        ik5Var.f(k);
    }

    public static int e(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static int f(ik5 ik5Var) {
        int s = ik5Var.s();
        int i = s & 127;
        while ((s & 128) == 128) {
            s = ik5Var.s();
            i = (i << 7) | (s & 127);
        }
        return i;
    }

    public static int g(ik5 ik5Var) {
        ik5Var.f(16);
        return ik5Var.m();
    }

    public static Pair h(a92 a92Var) {
        b92 d = a92Var.d(1701606260);
        if (d == null) {
            return null;
        }
        ik5 ik5Var = d.b;
        ik5Var.f(8);
        int a2 = c92.a(ik5Var.m());
        int v = ik5Var.v();
        long[] jArr = new long[v];
        long[] jArr2 = new long[v];
        for (int i = 0; i < v; i++) {
            jArr[i] = a2 == 1 ? ik5Var.B() : ik5Var.A();
            jArr2[i] = a2 == 1 ? ik5Var.z() : ik5Var.m();
            if (ik5Var.G() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            ik5Var.g(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static Pair i(ik5 ik5Var) {
        ik5Var.f(8);
        int a2 = c92.a(ik5Var.m());
        ik5Var.g(a2 == 0 ? 8 : 16);
        long A = ik5Var.A();
        ik5Var.g(a2 == 0 ? 4 : 8);
        int w = ik5Var.w();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((w >> 10) & 31) + 96));
        sb.append((char) (((w >> 5) & 31) + 96));
        sb.append((char) ((w & 31) + 96));
        return Pair.create(Long.valueOf(A), sb.toString());
    }

    public static Pair j(ik5 ik5Var, int i, int i2) {
        Integer num;
        ia2 ia2Var;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int k = ik5Var.k();
        while (k - i < i2) {
            ik5Var.f(k);
            int m = ik5Var.m();
            n09.b(m > 0, "childAtomSize must be positive");
            if (ik5Var.m() == 1936289382) {
                int i5 = k + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - k < m) {
                    ik5Var.f(i5);
                    int m2 = ik5Var.m();
                    int m3 = ik5Var.m();
                    if (m3 == 1718775137) {
                        num2 = Integer.valueOf(ik5Var.m());
                    } else if (m3 == 1935894637) {
                        ik5Var.g(4);
                        str = ik5Var.F(4, cy6.c);
                    } else if (m3 == 1935894633) {
                        i6 = i5;
                        i7 = m2;
                    }
                    i5 += m2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    n09.b(num2 != null, "frma atom is mandatory");
                    n09.b(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            ia2Var = null;
                            break;
                        }
                        ik5Var.f(i8);
                        int m4 = ik5Var.m();
                        if (ik5Var.m() == 1952804451) {
                            int m5 = ik5Var.m();
                            ik5Var.g(1);
                            if (c92.a(m5) == 0) {
                                ik5Var.g(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int s = ik5Var.s();
                                i3 = s & 15;
                                i4 = (s & 240) >> 4;
                            }
                            boolean z = ik5Var.s() == 1;
                            int s2 = ik5Var.s();
                            byte[] bArr2 = new byte[16];
                            ik5Var.b(bArr2, 0, 16);
                            if (z && s2 == 0) {
                                int s3 = ik5Var.s();
                                byte[] bArr3 = new byte[s3];
                                ik5Var.b(bArr3, 0, s3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            ia2Var = new ia2(z, str, s2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += m4;
                        }
                    }
                    n09.b(ia2Var != null, "tenc atom is mandatory");
                    int i9 = it5.a;
                    create = Pair.create(num, ia2Var);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            k += m;
        }
        return null;
    }

    public static l92 k(ik5 ik5Var, int i) {
        ik5Var.f(i + 12);
        ik5Var.g(1);
        f(ik5Var);
        ik5Var.g(2);
        int s = ik5Var.s();
        if ((s & 128) != 0) {
            ik5Var.g(2);
        }
        if ((s & 64) != 0) {
            ik5Var.g(ik5Var.s());
        }
        if ((s & 32) != 0) {
            ik5Var.g(2);
        }
        ik5Var.g(1);
        f(ik5Var);
        String d = ak3.d(ik5Var.s());
        if ("audio/mpeg".equals(d) || "audio/vnd.dts".equals(d) || "audio/vnd.dts.hd".equals(d)) {
            return new l92(d, null, -1L, -1L);
        }
        ik5Var.g(4);
        long A = ik5Var.A();
        long A2 = ik5Var.A();
        ik5Var.g(1);
        int f = f(ik5Var);
        byte[] bArr = new byte[f];
        ik5Var.b(bArr, 0, f);
        return new l92(d, bArr, A2 <= 0 ? -1L : A2, A > 0 ? A : -1L);
    }

    public static ByteBuffer l() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(com.daaw.ik5 r24, int r25, int r26, int r27, int r28, java.lang.String r29, boolean r30, com.google.android.gms.internal.ads.zzx r31, com.daaw.n92 r32, int r33) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.r92.m(com.daaw.ik5, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzx, com.daaw.n92, int):void");
    }

    public static void n(ik5 ik5Var, int i, int i2, int i3, n92 n92Var) {
        ik5Var.f(i2 + 16);
        ik5Var.D((char) 0);
        String D = ik5Var.D((char) 0);
        if (D != null) {
            b72 b72Var = new b72();
            b72Var.g(i3);
            b72Var.s(D);
            n92Var.b = b72Var.y();
        }
    }

    public static boolean o(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        return jArr[0] <= j2 && j2 < jArr[it5.P(4, 0, i)] && jArr[it5.P(length + (-4), 0, i)] < j3 && j3 <= j;
    }
}
