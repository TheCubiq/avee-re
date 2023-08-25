package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class z09 {

    /* renamed from: a */
    public final List f34320a;

    /* renamed from: b */
    public final int f34321b;

    /* renamed from: c */
    public final float f34322c;

    /* renamed from: d */
    public final String f34323d;

    public z09(List list, int i, int i2, int i3, float f, String str) {
        this.f34320a = list;
        this.f34321b = i;
        this.f34322c = f;
        this.f34323d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0374 A[Catch: ArrayIndexOutOfBoundsException -> 0x040a, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x040a, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:9:0x0032, B:10:0x0035, B:12:0x0045, B:14:0x0052, B:17:0x006f, B:20:0x0098, B:22:0x009e, B:23:0x00a3, B:24:0x00a6, B:27:0x00ae, B:28:0x00b7, B:30:0x00bf, B:32:0x00c5, B:33:0x00c7, B:35:0x00cd, B:36:0x00cf, B:37:0x00d2, B:39:0x00d7, B:40:0x00dd, B:42:0x00e7, B:43:0x00eb, B:45:0x00f9, B:56:0x011f, B:58:0x012d, B:63:0x0143, B:64:0x014f, B:66:0x0167, B:74:0x0175, B:76:0x017b, B:87:0x01aa, B:78:0x0184, B:80:0x0199, B:83:0x019f, B:88:0x01b0, B:89:0x01ba, B:91:0x01c9, B:92:0x01d7, B:95:0x01e9, B:97:0x01ef, B:99:0x0212, B:101:0x0218, B:103:0x0223, B:102:0x021f, B:104:0x0226, B:106:0x0230, B:108:0x0236, B:110:0x023c, B:111:0x0242, B:113:0x0247, B:115:0x024b, B:118:0x0258, B:120:0x025e, B:122:0x0262, B:123:0x0268, B:124:0x026b, B:126:0x0275, B:128:0x027b, B:130:0x027f, B:131:0x0285, B:133:0x028a, B:135:0x028e, B:138:0x0299, B:140:0x029f, B:142:0x02a5, B:143:0x02ab, B:144:0x02ae, B:152:0x02f3, B:145:0x02b7, B:147:0x02ce, B:148:0x02dc, B:150:0x02e1, B:153:0x0303, B:156:0x0312, B:158:0x0318, B:159:0x0321, B:161:0x032b, B:163:0x0331, B:165:0x033b, B:168:0x0349, B:174:0x036e, B:176:0x0374, B:177:0x0377, B:179:0x037d, B:181:0x0387, B:182:0x038c, B:184:0x0392, B:185:0x0398, B:187:0x03a1, B:189:0x03a6, B:191:0x03c2, B:171:0x0351, B:172:0x0356, B:192:0x03dd, B:195:0x03f6, B:197:0x03ff, B:196:0x03fb), top: B:203:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037d A[Catch: ArrayIndexOutOfBoundsException -> 0x040a, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x040a, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:9:0x0032, B:10:0x0035, B:12:0x0045, B:14:0x0052, B:17:0x006f, B:20:0x0098, B:22:0x009e, B:23:0x00a3, B:24:0x00a6, B:27:0x00ae, B:28:0x00b7, B:30:0x00bf, B:32:0x00c5, B:33:0x00c7, B:35:0x00cd, B:36:0x00cf, B:37:0x00d2, B:39:0x00d7, B:40:0x00dd, B:42:0x00e7, B:43:0x00eb, B:45:0x00f9, B:56:0x011f, B:58:0x012d, B:63:0x0143, B:64:0x014f, B:66:0x0167, B:74:0x0175, B:76:0x017b, B:87:0x01aa, B:78:0x0184, B:80:0x0199, B:83:0x019f, B:88:0x01b0, B:89:0x01ba, B:91:0x01c9, B:92:0x01d7, B:95:0x01e9, B:97:0x01ef, B:99:0x0212, B:101:0x0218, B:103:0x0223, B:102:0x021f, B:104:0x0226, B:106:0x0230, B:108:0x0236, B:110:0x023c, B:111:0x0242, B:113:0x0247, B:115:0x024b, B:118:0x0258, B:120:0x025e, B:122:0x0262, B:123:0x0268, B:124:0x026b, B:126:0x0275, B:128:0x027b, B:130:0x027f, B:131:0x0285, B:133:0x028a, B:135:0x028e, B:138:0x0299, B:140:0x029f, B:142:0x02a5, B:143:0x02ab, B:144:0x02ae, B:152:0x02f3, B:145:0x02b7, B:147:0x02ce, B:148:0x02dc, B:150:0x02e1, B:153:0x0303, B:156:0x0312, B:158:0x0318, B:159:0x0321, B:161:0x032b, B:163:0x0331, B:165:0x033b, B:168:0x0349, B:174:0x036e, B:176:0x0374, B:177:0x0377, B:179:0x037d, B:181:0x0387, B:182:0x038c, B:184:0x0392, B:185:0x0398, B:187:0x03a1, B:189:0x03a6, B:191:0x03c2, B:171:0x0351, B:172:0x0356, B:192:0x03dd, B:195:0x03f6, B:197:0x03ff, B:196:0x03fb), top: B:203:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0392 A[Catch: ArrayIndexOutOfBoundsException -> 0x040a, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x040a, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:9:0x0032, B:10:0x0035, B:12:0x0045, B:14:0x0052, B:17:0x006f, B:20:0x0098, B:22:0x009e, B:23:0x00a3, B:24:0x00a6, B:27:0x00ae, B:28:0x00b7, B:30:0x00bf, B:32:0x00c5, B:33:0x00c7, B:35:0x00cd, B:36:0x00cf, B:37:0x00d2, B:39:0x00d7, B:40:0x00dd, B:42:0x00e7, B:43:0x00eb, B:45:0x00f9, B:56:0x011f, B:58:0x012d, B:63:0x0143, B:64:0x014f, B:66:0x0167, B:74:0x0175, B:76:0x017b, B:87:0x01aa, B:78:0x0184, B:80:0x0199, B:83:0x019f, B:88:0x01b0, B:89:0x01ba, B:91:0x01c9, B:92:0x01d7, B:95:0x01e9, B:97:0x01ef, B:99:0x0212, B:101:0x0218, B:103:0x0223, B:102:0x021f, B:104:0x0226, B:106:0x0230, B:108:0x0236, B:110:0x023c, B:111:0x0242, B:113:0x0247, B:115:0x024b, B:118:0x0258, B:120:0x025e, B:122:0x0262, B:123:0x0268, B:124:0x026b, B:126:0x0275, B:128:0x027b, B:130:0x027f, B:131:0x0285, B:133:0x028a, B:135:0x028e, B:138:0x0299, B:140:0x029f, B:142:0x02a5, B:143:0x02ab, B:144:0x02ae, B:152:0x02f3, B:145:0x02b7, B:147:0x02ce, B:148:0x02dc, B:150:0x02e1, B:153:0x0303, B:156:0x0312, B:158:0x0318, B:159:0x0321, B:161:0x032b, B:163:0x0331, B:165:0x033b, B:168:0x0349, B:174:0x036e, B:176:0x0374, B:177:0x0377, B:179:0x037d, B:181:0x0387, B:182:0x038c, B:184:0x0392, B:185:0x0398, B:187:0x03a1, B:189:0x03a6, B:191:0x03c2, B:171:0x0351, B:172:0x0356, B:192:0x03dd, B:195:0x03f6, B:197:0x03ff, B:196:0x03fb), top: B:203:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a1 A[Catch: ArrayIndexOutOfBoundsException -> 0x040a, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x040a, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:9:0x0032, B:10:0x0035, B:12:0x0045, B:14:0x0052, B:17:0x006f, B:20:0x0098, B:22:0x009e, B:23:0x00a3, B:24:0x00a6, B:27:0x00ae, B:28:0x00b7, B:30:0x00bf, B:32:0x00c5, B:33:0x00c7, B:35:0x00cd, B:36:0x00cf, B:37:0x00d2, B:39:0x00d7, B:40:0x00dd, B:42:0x00e7, B:43:0x00eb, B:45:0x00f9, B:56:0x011f, B:58:0x012d, B:63:0x0143, B:64:0x014f, B:66:0x0167, B:74:0x0175, B:76:0x017b, B:87:0x01aa, B:78:0x0184, B:80:0x0199, B:83:0x019f, B:88:0x01b0, B:89:0x01ba, B:91:0x01c9, B:92:0x01d7, B:95:0x01e9, B:97:0x01ef, B:99:0x0212, B:101:0x0218, B:103:0x0223, B:102:0x021f, B:104:0x0226, B:106:0x0230, B:108:0x0236, B:110:0x023c, B:111:0x0242, B:113:0x0247, B:115:0x024b, B:118:0x0258, B:120:0x025e, B:122:0x0262, B:123:0x0268, B:124:0x026b, B:126:0x0275, B:128:0x027b, B:130:0x027f, B:131:0x0285, B:133:0x028a, B:135:0x028e, B:138:0x0299, B:140:0x029f, B:142:0x02a5, B:143:0x02ab, B:144:0x02ae, B:152:0x02f3, B:145:0x02b7, B:147:0x02ce, B:148:0x02dc, B:150:0x02e1, B:153:0x0303, B:156:0x0312, B:158:0x0318, B:159:0x0321, B:161:0x032b, B:163:0x0331, B:165:0x033b, B:168:0x0349, B:174:0x036e, B:176:0x0374, B:177:0x0377, B:179:0x037d, B:181:0x0387, B:182:0x038c, B:184:0x0392, B:185:0x0398, B:187:0x03a1, B:189:0x03a6, B:191:0x03c2, B:171:0x0351, B:172:0x0356, B:192:0x03dd, B:195:0x03f6, B:197:0x03ff, B:196:0x03fb), top: B:203:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z09 m3003a(ik5 ik5Var) {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        byte[] bArr2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        try {
            ik5Var.m19715g(21);
            int m19703s = ik5Var.m19703s() & 3;
            int m19703s2 = ik5Var.m19703s();
            int m19711k = ik5Var.m19711k();
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < m19703s2; i17++) {
                ik5Var.m19715g(1);
                int m19699w = ik5Var.m19699w();
                for (int i18 = 0; i18 < m19699w; i18++) {
                    int m19699w2 = ik5Var.m19699w();
                    i16 += m19699w2 + 4;
                    ik5Var.m19715g(m19699w2);
                }
            }
            ik5Var.m19716f(m19711k);
            byte[] bArr3 = new byte[i16];
            String str = null;
            int i19 = 0;
            int i20 = 0;
            int i21 = -1;
            int i22 = -1;
            float f2 = 1.0f;
            while (i19 < m19703s2) {
                int m19703s3 = ik5Var.m19703s() & 63;
                int m19699w3 = ik5Var.m19699w();
                int i23 = 0;
                while (i23 < m19699w3) {
                    int m19699w4 = ik5Var.m19699w();
                    System.arraycopy(c42.f5462a, i15, bArr3, i20, 4);
                    int i24 = i20 + 4;
                    System.arraycopy(ik5Var.m19714h(), ik5Var.m19711k(), bArr3, i24, m19699w4);
                    if (m19703s3 == 33 && i23 == 0) {
                        e42 e42Var = new e42(bArr3, i24 + 2, i24 + m19699w4);
                        e42Var.m23723e(4);
                        int m23727a = e42Var.m23727a(3);
                        e42Var.m23724d();
                        int m23727a2 = e42Var.m23727a(2);
                        boolean m23722f = e42Var.m23722f();
                        int m23727a3 = e42Var.m23727a(5);
                        int i25 = 0;
                        for (int i26 = 0; i26 < 32; i26++) {
                            if (e42Var.m23722f()) {
                                i25 |= 1 << i26;
                            }
                        }
                        int[] iArr = new int[6];
                        for (int i27 = 0; i27 < 6; i27++) {
                            iArr[i27] = e42Var.m23727a(8);
                        }
                        int m23727a4 = e42Var.m23727a(8);
                        int i28 = 0;
                        for (int i29 = 0; i29 < m23727a; i29++) {
                            if (e42Var.m23722f()) {
                                i28 += 89;
                            }
                            if (e42Var.m23722f()) {
                                i28 += 8;
                            }
                        }
                        e42Var.m23723e(i28);
                        if (m23727a > 0) {
                            int i30 = 8 - m23727a;
                            e42Var.m23723e(i30 + i30);
                        }
                        e42Var.m23725c();
                        int m23725c = e42Var.m23725c();
                        if (m23725c == 3) {
                            e42Var.m23724d();
                            m23725c = 3;
                        }
                        int m23725c2 = e42Var.m23725c();
                        int m23725c3 = e42Var.m23725c();
                        if (e42Var.m23722f()) {
                            int m23725c4 = e42Var.m23725c();
                            int m23725c5 = e42Var.m23725c();
                            int m23725c6 = e42Var.m23725c();
                            int m23725c7 = e42Var.m23725c();
                            if (m23725c != 1) {
                                i2 = m19703s2;
                                i13 = 1;
                                if (m23725c == 2) {
                                    m23725c = 2;
                                } else {
                                    i14 = 1;
                                    m23725c2 -= i14 * (m23725c4 + m23725c5);
                                    m23725c3 -= (m23725c != i13 ? 2 : 1) * (m23725c6 + m23725c7);
                                }
                            } else {
                                i2 = m19703s2;
                                i13 = 1;
                            }
                            i14 = 2;
                            m23725c2 -= i14 * (m23725c4 + m23725c5);
                            m23725c3 -= (m23725c != i13 ? 2 : 1) * (m23725c6 + m23725c7);
                        } else {
                            i2 = m19703s2;
                        }
                        e42Var.m23725c();
                        e42Var.m23725c();
                        int m23725c8 = e42Var.m23725c();
                        for (int i31 = true != e42Var.m23722f() ? m23727a : 0; i31 <= m23727a; i31++) {
                            e42Var.m23725c();
                            e42Var.m23725c();
                            e42Var.m23725c();
                        }
                        e42Var.m23725c();
                        e42Var.m23725c();
                        e42Var.m23725c();
                        e42Var.m23725c();
                        e42Var.m23725c();
                        e42Var.m23725c();
                        if (e42Var.m23722f() && e42Var.m23722f()) {
                            int i32 = 0;
                            while (i32 < 4) {
                                int i33 = 0;
                                while (i33 < 6) {
                                    if (e42Var.m23722f()) {
                                        i11 = m23725c2;
                                        i12 = m19703s3;
                                        int min = Math.min(64, 1 << ((i32 + i32) + 4));
                                        if (i32 > 1) {
                                            e42Var.m23726b();
                                        }
                                        for (int i34 = 0; i34 < min; i34++) {
                                            e42Var.m23726b();
                                        }
                                    } else {
                                        e42Var.m23725c();
                                        i11 = m23725c2;
                                        i12 = m19703s3;
                                    }
                                    i33 += i32 == 3 ? 3 : 1;
                                    m23725c2 = i11;
                                    m19703s3 = i12;
                                }
                                i32++;
                                m23725c2 = m23725c2;
                            }
                        }
                        int i35 = m23725c2;
                        i5 = m19703s3;
                        e42Var.m23723e(2);
                        if (e42Var.m23722f()) {
                            e42Var.m23723e(8);
                            e42Var.m23725c();
                            e42Var.m23725c();
                            e42Var.m23724d();
                        }
                        int m23725c9 = e42Var.m23725c();
                        int[] iArr2 = new int[0];
                        int[] iArr3 = new int[0];
                        i6 = m19699w3;
                        int i36 = 0;
                        int i37 = -1;
                        int i38 = -1;
                        while (i36 < m23725c9) {
                            if (i36 == 0 || !e42Var.m23722f()) {
                                i7 = m19703s;
                                bArr2 = bArr3;
                                i8 = m23725c9;
                                i9 = i19;
                                i10 = i16;
                                int m23725c10 = e42Var.m23725c();
                                int m23725c11 = e42Var.m23725c();
                                int[] iArr4 = new int[m23725c10];
                                for (int i39 = 0; i39 < m23725c10; i39++) {
                                    iArr4[i39] = e42Var.m23725c() + 1;
                                    e42Var.m23724d();
                                }
                                int[] iArr5 = new int[m23725c11];
                                for (int i40 = 0; i40 < m23725c11; i40++) {
                                    iArr5[i40] = e42Var.m23725c() + 1;
                                    e42Var.m23724d();
                                }
                                i37 = m23725c10;
                                i38 = m23725c11;
                                iArr2 = iArr4;
                                iArr3 = iArr5;
                            } else {
                                i8 = m23725c9;
                                int i41 = i37 + i38;
                                boolean m23722f2 = e42Var.m23722f();
                                int m23725c12 = (1 - ((m23722f2 ? 1 : 0) + (m23722f2 ? 1 : 0))) * (e42Var.m23725c() + 1);
                                i7 = m19703s;
                                int i42 = i41 + 1;
                                bArr2 = bArr3;
                                boolean[] zArr = new boolean[i42];
                                i10 = i16;
                                for (int i43 = 0; i43 <= i41; i43++) {
                                    if (e42Var.m23722f()) {
                                        zArr[i43] = true;
                                    } else {
                                        zArr[i43] = e42Var.m23722f();
                                    }
                                }
                                int[] iArr6 = new int[i42];
                                int[] iArr7 = new int[i42];
                                int i44 = 0;
                                for (int i45 = i38 - 1; i45 >= 0; i45--) {
                                    int i46 = iArr3[i45] + m23725c12;
                                    if (i46 < 0 && zArr[i37 + i45]) {
                                        iArr6[i44] = i46;
                                        i44++;
                                    }
                                }
                                if (m23725c12 < 0 && zArr[i41]) {
                                    iArr6[i44] = m23725c12;
                                    i44++;
                                }
                                i9 = i19;
                                int i47 = i44;
                                for (int i48 = 0; i48 < i37; i48++) {
                                    int i49 = iArr2[i48] + m23725c12;
                                    if (i49 < 0 && zArr[i48]) {
                                        iArr6[i47] = i49;
                                        i47++;
                                    }
                                }
                                int[] copyOf = Arrays.copyOf(iArr6, i47);
                                int i50 = 0;
                                for (int i51 = i37 - 1; i51 >= 0; i51--) {
                                    int i52 = iArr2[i51] + m23725c12;
                                    if (i52 > 0 && zArr[i51]) {
                                        iArr7[i50] = i52;
                                        i50++;
                                    }
                                }
                                if (m23725c12 > 0 && zArr[i41]) {
                                    iArr7[i50] = m23725c12;
                                    i50++;
                                }
                                int i53 = i50;
                                for (int i54 = 0; i54 < i38; i54++) {
                                    int i55 = iArr3[i54] + m23725c12;
                                    if (i55 > 0 && zArr[i37 + i54]) {
                                        iArr7[i53] = i55;
                                        i53++;
                                    }
                                }
                                iArr2 = copyOf;
                                iArr3 = Arrays.copyOf(iArr7, i53);
                                i38 = i53;
                                i37 = i47;
                            }
                            i36++;
                            m23725c9 = i8;
                            m19703s = i7;
                            bArr3 = bArr2;
                            i16 = i10;
                            i19 = i9;
                        }
                        i = m19703s;
                        bArr = bArr3;
                        i3 = i19;
                        i4 = i16;
                        if (e42Var.m23722f()) {
                            for (int i56 = 0; i56 < e42Var.m23725c(); i56++) {
                                e42Var.m23723e(m23725c8 + 5);
                            }
                        }
                        e42Var.m23723e(2);
                        if (e42Var.m23722f()) {
                            if (e42Var.m23722f()) {
                                int m23727a5 = e42Var.m23727a(8);
                                if (m23727a5 == 255) {
                                    int m23727a6 = e42Var.m23727a(16);
                                    int m23727a7 = e42Var.m23727a(16);
                                    if (m23727a6 != 0 && m23727a7 != 0) {
                                        f = m23727a6 / m23727a7;
                                        if (e42Var.m23722f()) {
                                            e42Var.m23724d();
                                        }
                                        if (e42Var.m23722f()) {
                                            e42Var.m23723e(4);
                                            if (e42Var.m23722f()) {
                                                e42Var.m23723e(24);
                                            }
                                        }
                                        if (e42Var.m23722f()) {
                                            e42Var.m23725c();
                                            e42Var.m23725c();
                                        }
                                        e42Var.m23724d();
                                        if (e42Var.m23722f()) {
                                            m23725c3 += m23725c3;
                                        }
                                    }
                                } else if (m23727a5 < 17) {
                                    f = c42.f5463b[m23727a5];
                                    if (e42Var.m23722f()) {
                                    }
                                    if (e42Var.m23722f()) {
                                    }
                                    if (e42Var.m23722f()) {
                                    }
                                    e42Var.m23724d();
                                    if (e42Var.m23722f()) {
                                    }
                                } else {
                                    s95.m10493e("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + m23727a5);
                                }
                            }
                            f = 1.0f;
                            if (e42Var.m23722f()) {
                            }
                            if (e42Var.m23722f()) {
                            }
                            if (e42Var.m23722f()) {
                            }
                            e42Var.m23724d();
                            if (e42Var.m23722f()) {
                            }
                        } else {
                            f = 1.0f;
                        }
                        str = ar4.m27131b(m23727a2, m23722f, m23727a3, i25, iArr, m23727a4);
                        f2 = f;
                        i22 = m23725c3;
                        i21 = i35;
                        i23 = 0;
                    } else {
                        i = m19703s;
                        i2 = m19703s2;
                        bArr = bArr3;
                        i3 = i19;
                        i4 = i16;
                        i5 = m19703s3;
                        i6 = m19699w3;
                    }
                    i20 = i24 + m19699w4;
                    ik5Var.m19715g(m19699w4);
                    i23++;
                    m19699w3 = i6;
                    m19703s3 = i5;
                    m19703s2 = i2;
                    m19703s = i;
                    bArr3 = bArr;
                    i16 = i4;
                    i19 = i3;
                    i15 = 0;
                }
                i19++;
                i15 = 0;
            }
            return new z09(i16 == 0 ? Collections.emptyList() : Collections.singletonList(bArr3), m19703s + 1, i21, i22, f2, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw dl3.m24267a("Error parsing HEVC config", e);
        }
    }
}
