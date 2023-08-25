package com.daaw;

import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes.dex */
public final class k72 {
    public static final i72 a = new i72() { // from class: com.daaw.h72
    };

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.ads.zzbq a(byte[] r11, int r12, com.daaw.i72 r13, com.daaw.o62 r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.k72.a(byte[], int, com.daaw.i72, com.daaw.o62):com.google.android.gms.internal.ads.zzbq");
    }

    public static int b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static int c(byte[] bArr, int i, int i2) {
        int d = d(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return d;
        }
        while (true) {
            int length = bArr.length;
            if (d >= length - 1) {
                return length;
            }
            if ((d - i) % 2 == 0 && bArr[d + 1] == 0) {
                return d;
            }
            d = d(bArr, d + 1);
        }
    }

    public static int d(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    public static int e(ik5 ik5Var, int i) {
        byte[] h = ik5Var.h();
        int k = ik5Var.k();
        int i2 = k;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= k + i) {
                return i;
            }
            if ((h[i2] & 255) == 255 && h[i3] == 0) {
                System.arraycopy(h, i2 + 2, h, i3, (i - (i2 - k)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x026c, code lost:
        if (r9 == 67) goto L121;
     */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0539: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:239:0x0537 */
    /* JADX WARN: Removed duplicated region for block: B:213:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzade f(int r34, com.daaw.ik5 r35, boolean r36, int r37, com.daaw.i72 r38) {
        /*
            Method dump skipped, instructions count: 1369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.k72.f(int, com.daaw.ik5, boolean, int, com.daaw.i72):com.google.android.gms.internal.ads.zzade");
    }

    public static String g(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    public static String h(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String i(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
        if ((r10 & 128) != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(com.daaw.ik5 r19, int r20, int r21, boolean r22) {
        /*
            r1 = r19
            r0 = r20
            int r2 = r19.k()
        L8:
            int r3 = r19.i()     // Catch: java.lang.Throwable -> Lae
            r4 = 1
            r5 = r21
            if (r3 < r5) goto Laa
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r19.m()     // Catch: java.lang.Throwable -> Lae
            long r8 = r19.A()     // Catch: java.lang.Throwable -> Lae
            int r10 = r19.w()     // Catch: java.lang.Throwable -> Lae
            goto L2c
        L22:
            int r7 = r19.u()     // Catch: java.lang.Throwable -> Lae
            int r8 = r19.u()     // Catch: java.lang.Throwable -> Lae
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 == 0) goto L37
            goto L3b
        L37:
            r1.f(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6a
            if (r22 != 0) goto L6a
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4c
            r1.f(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r11 = r11 & r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 24
            long r8 = r8 >> r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L6a:
            if (r0 != r7) goto L7a
            r3 = r10 & 64
            if (r3 == 0) goto L71
            goto L72
        L71:
            r4 = 0
        L72:
            r3 = r10 & 1
            r18 = r4
            r4 = r3
            r3 = r18
            goto L8a
        L7a:
            if (r0 != r3) goto L88
            r3 = r10 & 32
            if (r3 == 0) goto L82
            r3 = 1
            goto L83
        L82:
            r3 = 0
        L83:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L89
            goto L8a
        L88:
            r3 = 0
        L89:
            r4 = 0
        L8a:
            if (r4 == 0) goto L8e
            int r3 = r3 + 4
        L8e:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L97
            r1.f(r2)
            return r6
        L97:
            int r3 = r19.i()     // Catch: java.lang.Throwable -> Lae
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La4
            r1.f(r2)
            return r6
        La4:
            int r3 = (int) r8
            r1.g(r3)     // Catch: java.lang.Throwable -> Lae
            goto L8
        Laa:
            r1.f(r2)
            return r4
        Lae:
            r0 = move-exception
            r1.f(r2)
            goto Lb4
        Lb3:
            throw r0
        Lb4:
            goto Lb3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.k72.j(com.daaw.ik5, int, int, boolean):boolean");
    }

    public static byte[] k(byte[] bArr, int i, int i2) {
        return i2 <= i ? it5.f : Arrays.copyOfRange(bArr, i, i2);
    }
}
