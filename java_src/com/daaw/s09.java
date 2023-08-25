package com.daaw;
/* loaded from: classes.dex */
public final class s09 {
    /* renamed from: a */
    public static int m10799a(ik5 ik5Var, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return ik5Var.m19703s() + 1;
            case 7:
                return ik5Var.m19699w() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public static long m10798b(k09 k09Var, w09 w09Var) {
        k09Var.zzj();
        rz8 rz8Var = (rz8) k09Var;
        rz8Var.m10812k(1, false);
        byte[] bArr = new byte[1];
        rz8Var.mo5661h(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        rz8Var.m10812k(2, false);
        int i2 = 1 != i ? 6 : 7;
        ik5 ik5Var = new ik5(i2);
        ik5Var.m19717e(n09.m15610a(k09Var, ik5Var.m19714h(), 0, i2));
        k09Var.zzj();
        r09 r09Var = new r09();
        if (m10796d(ik5Var, w09Var, 1 == i, r09Var)) {
            return r09Var.f24713a;
        }
        throw dl3.m24267a(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r7 != r18.f30777f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
        if ((r17.m19703s() * 1000) == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
        if (r4 == r3) goto L39;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m10797c(ik5 ik5Var, w09 w09Var, int i, r09 r09Var) {
        int m10799a;
        int m19711k = ik5Var.m19711k();
        long m19729A = ik5Var.m19729A();
        long j = m19729A >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((m19729A >> 12) & 15);
        int i3 = (int) ((m19729A >> 8) & 15);
        int i4 = (int) (15 & (m19729A >> 4));
        int i5 = (int) ((m19729A >> 1) & 7);
        long j2 = m19729A & 1;
        if (i4 > 7 ? !(i4 > 10 || w09Var.f30778g != 2) : i4 == w09Var.f30778g - 1) {
            if ((i5 == 0 || i5 == w09Var.f30780i) && j2 != 1 && m10796d(ik5Var, w09Var, z, r09Var) && (m10799a = m10799a(ik5Var, i2)) != -1 && m10799a <= w09Var.f30773b) {
                int i6 = w09Var.f30776e;
                if (i3 != 0) {
                    if (i3 > 11) {
                        if (i3 != 12) {
                            if (i3 <= 14) {
                                int m19699w = ik5Var.m19699w();
                                if (i3 == 14) {
                                    m19699w *= 10;
                                }
                            }
                        }
                    }
                }
                if (ik5Var.m19703s() == it5.m19414R(ik5Var.m19714h(), m19711k, ik5Var.m19711k() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m10796d(ik5 ik5Var, w09 w09Var, boolean z, r09 r09Var) {
        try {
            long m19727C = ik5Var.m19727C();
            if (!z) {
                m19727C *= w09Var.f30773b;
            }
            r09Var.f24713a = m19727C;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
