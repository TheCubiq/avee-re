package com.daaw;
/* loaded from: classes.dex */
public final class zy8 {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final /* synthetic */ int c = 0;

    public static yy8 a(byte[] bArr) {
        return b(new cj5(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
        if (r11 != 3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.daaw.yy8 b(com.daaw.cj5 r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.zy8.b(com.daaw.cj5, boolean):com.daaw.yy8");
    }

    public static int c(cj5 cj5Var) {
        int c2 = cj5Var.c(5);
        return c2 == 31 ? cj5Var.c(6) + 32 : c2;
    }

    public static int d(cj5 cj5Var) {
        int c2 = cj5Var.c(4);
        if (c2 == 15) {
            return cj5Var.c(24);
        }
        if (c2 < 13) {
            return a[c2];
        }
        throw dl3.a(null, null);
    }
}
