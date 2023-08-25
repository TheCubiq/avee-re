package com.daaw;
/* loaded from: classes.dex */
public final class zy8 {

    /* renamed from: a */
    public static final int[] f35682a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    public static final int[] f35683b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c */
    public static final /* synthetic */ int f35684c = 0;

    /* renamed from: a */
    public static yy8 m1766a(byte[] bArr) {
        return m1765b(new cj5(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
        if (r11 != 3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static yy8 m1765b(cj5 cj5Var, boolean z) {
        int i;
        int m1764c = m1764c(cj5Var);
        int m1763d = m1763d(cj5Var);
        int m25329c = cj5Var.m25329c(4);
        String str = "mp4a.40." + m1764c;
        int i2 = 22;
        if (m1764c == 5 || m1764c == 29) {
            m1763d = m1763d(cj5Var);
            m1764c = m1764c(cj5Var);
            if (m1764c == 22) {
                m25329c = cj5Var.m25329c(4);
            }
        }
        if (z) {
            int i3 = 3;
            if (m1764c != 1 && m1764c != 2 && m1764c != 3 && m1764c != 4 && m1764c != 6 && m1764c != 7 && m1764c != 17) {
                switch (m1764c) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw dl3.m24265c("Unsupported audio object type: " + m1764c);
                }
            }
            if (cj5Var.m25320l()) {
                s95.m10493e("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (cj5Var.m25320l()) {
                cj5Var.m25322j(14);
            }
            boolean m25320l = cj5Var.m25320l();
            if (m25329c != 0) {
                if (m1764c == 6) {
                    i = m1764c;
                } else if (m1764c != 20) {
                    i = m1764c;
                    if (m25320l) {
                        if (m1764c == 22) {
                            cj5Var.m25322j(16);
                        } else {
                            i2 = m1764c;
                        }
                        if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                            cj5Var.m25322j(3);
                        }
                        cj5Var.m25322j(1);
                    }
                    switch (i) {
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            int m25329c2 = cj5Var.m25329c(2);
                            if (m25329c2 == 2) {
                                i3 = m25329c2;
                            }
                            throw dl3.m24265c("Unsupported epConfig: " + i3);
                    }
                } else {
                    m1764c = 20;
                    i = 20;
                }
                cj5Var.m25322j(3);
                if (m25320l) {
                }
                switch (i) {
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i4 = f35683b[m25329c];
        if (i4 != -1) {
            return new yy8(m1763d, i4, str, null);
        }
        throw dl3.m24267a(null, null);
    }

    /* renamed from: c */
    public static int m1764c(cj5 cj5Var) {
        int m25329c = cj5Var.m25329c(5);
        return m25329c == 31 ? cj5Var.m25329c(6) + 32 : m25329c;
    }

    /* renamed from: d */
    public static int m1763d(cj5 cj5Var) {
        int m25329c = cj5Var.m25329c(4);
        if (m25329c == 15) {
            return cj5Var.m25329c(24);
        }
        if (m25329c < 13) {
            return f35682a[m25329c];
        }
        throw dl3.m24267a(null, null);
    }
}
