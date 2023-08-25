package com.daaw;
/* loaded from: classes.dex */
public final class fz8 {

    /* renamed from: a */
    public static final int[] f10117a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: b */
    public static final /* synthetic */ int f10118b = 0;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
        if (r11 != 11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
        if (r11 != 11) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
        if (r11 != 8) goto L44;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ez8 m22117a(cj5 cj5Var) {
        int i;
        int i2;
        int m25329c;
        int m25329c2 = cj5Var.m25329c(16);
        int m25329c3 = cj5Var.m25329c(16);
        if (m25329c3 == 65535) {
            m25329c3 = cj5Var.m25329c(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = m25329c3 + i;
        if (m25329c2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int m25329c4 = cj5Var.m25329c(2);
        if (m25329c4 == 3) {
            int i5 = 0;
            while (true) {
                m25329c = i5 + cj5Var.m25329c(2);
                if (!cj5Var.m25320l()) {
                    break;
                }
                i5 = (m25329c + 1) << 2;
            }
            m25329c4 = m25329c + 3;
        }
        int m25329c5 = cj5Var.m25329c(10);
        if (cj5Var.m25320l() && cj5Var.m25329c(3) > 0) {
            cj5Var.m25322j(2);
        }
        int i6 = true != cj5Var.m25320l() ? 44100 : 48000;
        int m25329c6 = cj5Var.m25329c(4);
        if (i6 == 44100 && m25329c6 == 13) {
            i2 = f10117a[13];
        } else if (i6 != 48000 || m25329c6 >= 14) {
            i2 = 0;
        } else {
            int i7 = f10117a[m25329c6];
            int i8 = m25329c5 % 5;
            if (i8 != 1) {
                if (i8 == 2) {
                    if (m25329c6 != 8) {
                    }
                    i7++;
                    i2 = i7;
                } else if (i8 != 3) {
                    if (i8 == 4) {
                        if (m25329c6 != 3) {
                            if (m25329c6 != 8) {
                            }
                        }
                        i7++;
                    }
                    i2 = i7;
                }
            }
            if (m25329c6 != 3) {
            }
            i7++;
            i2 = i7;
        }
        return new ez8(m25329c4, 2, i6, i4, i2, null);
    }

    /* renamed from: b */
    public static void m22116b(int i, ik5 ik5Var) {
        ik5Var.m19719c(7);
        byte[] m19714h = ik5Var.m19714h();
        m19714h[0] = -84;
        m19714h[1] = 64;
        m19714h[2] = -1;
        m19714h[3] = -1;
        m19714h[4] = (byte) ((i >> 16) & 255);
        m19714h[5] = (byte) ((i >> 8) & 255);
        m19714h[6] = (byte) (i & 255);
    }
}
