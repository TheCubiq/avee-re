package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class qz2 {

    /* renamed from: a */
    public final List f24656a;

    /* renamed from: b */
    public final int f24657b;

    /* renamed from: c */
    public final float f24658c;

    public qz2(List list, int i, int i2, int i3, float f) {
        this.f24656a = list;
        this.f24657b = i;
        this.f24658c = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5 A[Catch: ArrayIndexOutOfBoundsException -> 0x01a6, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01a6, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:8:0x002a, B:10:0x0031, B:13:0x0040, B:60:0x00dc, B:62:0x00e5, B:68:0x0104, B:70:0x011e, B:71:0x0121, B:73:0x012e, B:83:0x014e, B:82:0x014b, B:84:0x0156, B:86:0x015c, B:88:0x0162, B:90:0x016a, B:93:0x0176, B:96:0x017f, B:97:0x0184, B:100:0x0199, B:64:0x00eb, B:65:0x00f9, B:67:0x00fe, B:35:0x008e, B:37:0x0094, B:39:0x009a, B:46:0x00b3, B:55:0x00ca, B:58:0x00d6, B:59:0x00d9, B:102:0x01a0, B:103:0x01a5), top: B:108:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011e A[Catch: ArrayIndexOutOfBoundsException -> 0x01a6, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01a6, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:8:0x002a, B:10:0x0031, B:13:0x0040, B:60:0x00dc, B:62:0x00e5, B:68:0x0104, B:70:0x011e, B:71:0x0121, B:73:0x012e, B:83:0x014e, B:82:0x014b, B:84:0x0156, B:86:0x015c, B:88:0x0162, B:90:0x016a, B:93:0x0176, B:96:0x017f, B:97:0x0184, B:100:0x0199, B:64:0x00eb, B:65:0x00f9, B:67:0x00fe, B:35:0x008e, B:37:0x0094, B:39:0x009a, B:46:0x00b3, B:55:0x00ca, B:58:0x00d6, B:59:0x00d9, B:102:0x01a0, B:103:0x01a5), top: B:108:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e A[Catch: ArrayIndexOutOfBoundsException -> 0x01a6, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01a6, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:8:0x002a, B:10:0x0031, B:13:0x0040, B:60:0x00dc, B:62:0x00e5, B:68:0x0104, B:70:0x011e, B:71:0x0121, B:73:0x012e, B:83:0x014e, B:82:0x014b, B:84:0x0156, B:86:0x015c, B:88:0x0162, B:90:0x016a, B:93:0x0176, B:96:0x017f, B:97:0x0184, B:100:0x0199, B:64:0x00eb, B:65:0x00f9, B:67:0x00fe, B:35:0x008e, B:37:0x0094, B:39:0x009a, B:46:0x00b3, B:55:0x00ca, B:58:0x00d6, B:59:0x00d9, B:102:0x01a0, B:103:0x01a5), top: B:108:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016a A[Catch: ArrayIndexOutOfBoundsException -> 0x01a6, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x01a6, blocks: (B:3:0x0003, B:5:0x0011, B:7:0x0020, B:8:0x002a, B:10:0x0031, B:13:0x0040, B:60:0x00dc, B:62:0x00e5, B:68:0x0104, B:70:0x011e, B:71:0x0121, B:73:0x012e, B:83:0x014e, B:82:0x014b, B:84:0x0156, B:86:0x015c, B:88:0x0162, B:90:0x016a, B:93:0x0176, B:96:0x017f, B:97:0x0184, B:100:0x0199, B:64:0x00eb, B:65:0x00f9, B:67:0x00fe, B:35:0x008e, B:37:0x0094, B:39:0x009a, B:46:0x00b3, B:55:0x00ca, B:58:0x00d6, B:59:0x00d9, B:102:0x01a0, B:103:0x01a5), top: B:108:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qz2 m11924a(iz2 iz2Var) {
        int i;
        int i2;
        float f;
        int m18144c;
        int i3;
        int m18144c2;
        boolean m18142e;
        int m18146a;
        try {
            iz2Var.m19224w(4);
            int m19240g = (iz2Var.m19240g() & 3) + 1;
            if (m19240g != 3) {
                ArrayList arrayList = new ArrayList();
                int m19240g2 = iz2Var.m19240g() & 31;
                for (int i4 = 0; i4 < m19240g2; i4++) {
                    arrayList.add(m11923b(iz2Var));
                }
                int m19240g3 = iz2Var.m19240g();
                for (int i5 = 0; i5 < m19240g3; i5++) {
                    arrayList.add(m11923b(iz2Var));
                }
                float f2 = 1.0f;
                if (m19240g2 > 0) {
                    jz2 jz2Var = new jz2((byte[]) arrayList.get(0), m19240g, ((byte[]) arrayList.get(0)).length);
                    jz2Var.m18143d(8);
                    int m18146a2 = jz2Var.m18146a(8);
                    jz2Var.m18143d(16);
                    jz2Var.m18144c();
                    if (m18146a2 != 100 && m18146a2 != 110 && m18146a2 != 122 && m18146a2 != 244 && m18146a2 != 44 && m18146a2 != 83 && m18146a2 != 86 && m18146a2 != 118 && m18146a2 != 128 && m18146a2 != 138) {
                        m18144c = 1;
                        jz2Var.m18144c();
                        m18144c2 = jz2Var.m18144c();
                        if (m18144c2 != 0) {
                            jz2Var.m18144c();
                        } else if (m18144c2 == 1) {
                            jz2Var.m18142e();
                            jz2Var.m18145b();
                            jz2Var.m18145b();
                            long m18144c3 = jz2Var.m18144c();
                            for (int i6 = 0; i6 < m18144c3; i6++) {
                                jz2Var.m18144c();
                            }
                        }
                        jz2Var.m18144c();
                        jz2Var.m18143d(1);
                        int m18144c4 = jz2Var.m18144c() + 1;
                        m18142e = jz2Var.m18142e();
                        int i7 = 2 - (m18142e ? 1 : 0);
                        int m18144c5 = (jz2Var.m18144c() + 1) * i7;
                        if (!m18142e) {
                            jz2Var.m18143d(1);
                        }
                        jz2Var.m18143d(1);
                        int i8 = m18144c4 * 16;
                        int i9 = m18144c5 * 16;
                        if (jz2Var.m18142e()) {
                            int m18144c6 = jz2Var.m18144c();
                            int m18144c7 = jz2Var.m18144c();
                            int m18144c8 = jz2Var.m18144c();
                            int m18144c9 = jz2Var.m18144c();
                            if (m18144c != 0) {
                                int i10 = m18144c == 3 ? 1 : 2;
                                i7 *= m18144c == 1 ? 2 : 1;
                                r3 = i10;
                            }
                            i8 -= (m18144c6 + m18144c7) * r3;
                            i9 -= (m18144c8 + m18144c9) * i7;
                        }
                        if (jz2Var.m18142e() && jz2Var.m18142e()) {
                            m18146a = jz2Var.m18146a(8);
                            if (m18146a != 255) {
                                int m18146a3 = jz2Var.m18146a(16);
                                int m18146a4 = jz2Var.m18146a(16);
                                if (m18146a3 != 0 && m18146a4 != 0) {
                                    f2 = m18146a3 / m18146a4;
                                }
                            } else if (m18146a < 17) {
                                f2 = gz2.f11864b[m18146a];
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Unexpected aspect_ratio_idc value: ");
                                sb.append(m18146a);
                            }
                        }
                        f = f2;
                        i2 = i9;
                        i = i8;
                    }
                    m18144c = jz2Var.m18144c();
                    if (m18144c == 3) {
                        jz2Var.m18142e();
                        i3 = 3;
                    } else {
                        i3 = m18144c;
                    }
                    jz2Var.m18144c();
                    jz2Var.m18144c();
                    jz2Var.m18143d(1);
                    if (jz2Var.m18142e()) {
                        int i11 = i3 != 3 ? 8 : 12;
                        int i12 = 0;
                        while (i12 < i11) {
                            if (jz2Var.m18142e()) {
                                int i13 = i12 < 6 ? 16 : 64;
                                int i14 = 8;
                                int i15 = 8;
                                for (int i16 = 0; i16 < i13; i16++) {
                                    if (i14 != 0) {
                                        i14 = ((jz2Var.m18145b() + i15) + 256) % 256;
                                    }
                                    if (i14 != 0) {
                                        i15 = i14;
                                    }
                                }
                            }
                            i12++;
                        }
                    }
                    jz2Var.m18144c();
                    m18144c2 = jz2Var.m18144c();
                    if (m18144c2 != 0) {
                    }
                    jz2Var.m18144c();
                    jz2Var.m18143d(1);
                    int m18144c42 = jz2Var.m18144c() + 1;
                    m18142e = jz2Var.m18142e();
                    int i72 = 2 - (m18142e ? 1 : 0);
                    int m18144c52 = (jz2Var.m18144c() + 1) * i72;
                    if (!m18142e) {
                    }
                    jz2Var.m18143d(1);
                    int i82 = m18144c42 * 16;
                    int i92 = m18144c52 * 16;
                    if (jz2Var.m18142e()) {
                    }
                    if (jz2Var.m18142e()) {
                        m18146a = jz2Var.m18146a(8);
                        if (m18146a != 255) {
                        }
                    }
                    f = f2;
                    i2 = i92;
                    i = i82;
                } else {
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                }
                return new qz2(arrayList, m19240g, i, i2, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new eq2("Error parsing AVC config", e);
        }
    }

    /* renamed from: b */
    public static byte[] m11923b(iz2 iz2Var) {
        int m19237j = iz2Var.m19237j();
        int m19244c = iz2Var.m19244c();
        iz2Var.m19224w(m19237j);
        return bz2.m25718b(iz2Var.f14125a, m19244c, m19237j);
    }
}
