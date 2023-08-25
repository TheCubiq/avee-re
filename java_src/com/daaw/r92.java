package com.daaw;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzadr;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzbp;
import com.google.android.gms.internal.ads.zzbq;
import com.google.android.gms.internal.ads.zzx;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class r92 {

    /* renamed from: a */
    public static final byte[] f24985a = it5.m19430B("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (r3 != 13) goto L51;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair m11565a(b92 b92Var) {
        ik5 ik5Var = b92Var.f4558b;
        ik5Var.m19716f(8);
        zzbq zzbqVar = null;
        zzbq zzbqVar2 = null;
        while (ik5Var.m19713i() >= 8) {
            int m19711k = ik5Var.m19711k();
            int m19709m = ik5Var.m19709m();
            int m19709m2 = ik5Var.m19709m();
            if (m19709m2 == 1835365473) {
                ik5Var.m19716f(m19711k);
                int i = m19711k + m19709m;
                ik5Var.m19715g(8);
                m11562d(ik5Var);
                while (true) {
                    if (ik5Var.m19711k() >= i) {
                        break;
                    }
                    int m19711k2 = ik5Var.m19711k();
                    int m19709m3 = ik5Var.m19709m();
                    if (ik5Var.m19709m() == 1768715124) {
                        ik5Var.m19716f(m19711k2);
                        int i2 = m19711k2 + m19709m3;
                        ik5Var.m19715g(8);
                        ArrayList arrayList = new ArrayList();
                        while (ik5Var.m19711k() < i2) {
                            zzbp m3988a = y92.m3988a(ik5Var);
                            if (m3988a != null) {
                                arrayList.add(m3988a);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbqVar = new zzbq(arrayList);
                        }
                    } else {
                        ik5Var.m19716f(m19711k2 + m19709m3);
                    }
                }
                zzbqVar = null;
            } else if (m19709m2 == 1936553057) {
                ik5Var.m19716f(m19711k);
                int i3 = m19711k + m19709m;
                ik5Var.m19715g(12);
                while (true) {
                    if (ik5Var.m19711k() >= i3) {
                        break;
                    }
                    int m19711k3 = ik5Var.m19711k();
                    int m19709m4 = ik5Var.m19709m();
                    if (ik5Var.m19709m() != 1935766900) {
                        ik5Var.m19716f(m19711k3 + m19709m4);
                    } else if (m19709m4 >= 14) {
                        ik5Var.m19715g(5);
                        int m19703s = ik5Var.m19703s();
                        float f = 120.0f;
                        if (m19703s == 12) {
                            if (m19703s == 12) {
                                f = 240.0f;
                            }
                        }
                        ik5Var.m19715g(1);
                        zzbqVar2 = new zzbq(-9223372036854775807L, new zzadx(f, ik5Var.m19703s()));
                    }
                }
                zzbqVar2 = null;
            }
            ik5Var.m19716f(m19711k + m19709m);
        }
        return Pair.create(zzbqVar, zzbqVar2);
    }

    /* renamed from: b */
    public static zzbq m11564b(a92 a92Var) {
        zzadr zzadrVar;
        b92 m27556d = a92Var.m27556d(1751411826);
        b92 m27556d2 = a92Var.m27556d(1801812339);
        b92 m27556d3 = a92Var.m27556d(1768715124);
        if (m27556d == null || m27556d2 == null || m27556d3 == null || m11559g(m27556d.f4558b) != 1835299937) {
            return null;
        }
        ik5 ik5Var = m27556d2.f4558b;
        ik5Var.m19716f(12);
        int m19709m = ik5Var.m19709m();
        String[] strArr = new String[m19709m];
        for (int i = 0; i < m19709m; i++) {
            int m19709m2 = ik5Var.m19709m();
            ik5Var.m19715g(4);
            strArr[i] = ik5Var.m19724F(m19709m2 - 8, cy6.f6275c);
        }
        ik5 ik5Var2 = m27556d3.f4558b;
        ik5Var2.m19716f(8);
        ArrayList arrayList = new ArrayList();
        while (ik5Var2.m19713i() > 8) {
            int m19711k = ik5Var2.m19711k();
            int m19709m3 = ik5Var2.m19709m();
            int m19709m4 = ik5Var2.m19709m() - 1;
            if (m19709m4 < 0 || m19709m4 >= m19709m) {
                s95.m10493e("AtomParsers", "Skipped metadata with unknown key index: " + m19709m4);
            } else {
                String str = strArr[m19709m4];
                int i2 = m19711k + m19709m3;
                int i3 = y92.f33437b;
                while (true) {
                    int m19711k2 = ik5Var2.m19711k();
                    if (m19711k2 >= i2) {
                        zzadrVar = null;
                        break;
                    }
                    int m19709m5 = ik5Var2.m19709m();
                    if (ik5Var2.m19709m() == 1684108385) {
                        int m19709m6 = ik5Var2.m19709m();
                        int m19709m7 = ik5Var2.m19709m();
                        int i4 = m19709m5 - 16;
                        byte[] bArr = new byte[i4];
                        ik5Var2.m19720b(bArr, 0, i4);
                        zzadrVar = new zzadr(str, bArr, m19709m7, m19709m6);
                        break;
                    }
                    ik5Var2.m19716f(m19711k2 + m19709m5);
                }
                if (zzadrVar != null) {
                    arrayList.add(zzadrVar);
                }
            }
            ik5Var2.m19716f(m19711k + m19709m3);
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
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m11563c(a92 a92Var, y09 y09Var, long j, zzx zzxVar, boolean z, boolean z2, ey6 ey6Var) {
        int i;
        long j2;
        int i2;
        long j3;
        int i3;
        int i4;
        int m19709m;
        int i5;
        n92 n92Var;
        ArrayList arrayList;
        String str;
        a92 a92Var2;
        a92 m27557c;
        long[] jArr;
        long[] jArr2;
        ha2 ha2Var;
        int i6;
        ey6 ey6Var2;
        Pair m11558h;
        String str2;
        int i7;
        a92 a92Var3;
        q92 q92Var;
        Pair pair;
        String str3;
        ik5 ik5Var;
        n92 n92Var2;
        zzx zzxVar2;
        int i8;
        String str4;
        int i9;
        int i10;
        int i11;
        int i12;
        float f;
        n92 n92Var3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        n92 n92Var4;
        long j4;
        long j5;
        int i19;
        int i20;
        boolean z3;
        int i21;
        int i22;
        float f2;
        n92 n92Var5;
        byte[] bArr;
        boolean z4;
        byte[] bArr2;
        String str5;
        byte[] bArr3;
        String str6;
        List list;
        String str7;
        String str8;
        int i23;
        int i24;
        y17 y17Var;
        long j6;
        long j7;
        ha2 ha2Var2;
        ArrayList arrayList2;
        m92 p92Var;
        b92 b92Var;
        boolean z5;
        int i25;
        int i26;
        int i27;
        int zza;
        int[] iArr;
        int i28;
        int i29;
        long j8;
        int i30;
        boolean z6;
        int i31;
        int i32;
        int i33;
        int i34;
        ha2 ha2Var3;
        int i35;
        long[] jArr3;
        int i36;
        int[] iArr2;
        long[] jArr4;
        int[] iArr3;
        int i37;
        long j9;
        long[] jArr5;
        int[] iArr4;
        long j10;
        int i38;
        ik5 ik5Var2;
        ik5 ik5Var3;
        int i39;
        long[] jArr6;
        int i40;
        ha2 ha2Var4;
        ka2 ka2Var;
        long[] jArr7;
        int[] iArr5;
        boolean z7;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        ka2 ka2Var2;
        a92 a92Var4 = a92Var;
        zzx zzxVar3 = zzxVar;
        ArrayList arrayList3 = new ArrayList();
        int i46 = 0;
        while (i46 < a92Var4.f3006d.size()) {
            a92 a92Var5 = (a92) a92Var4.f3006d.get(i46);
            if (a92Var5.f5641a != 1953653099) {
                arrayList2 = arrayList3;
                i = i46;
            } else {
                b92 m27556d = a92Var4.m27556d(1836476516);
                Objects.requireNonNull(m27556d);
                a92 m27557c2 = a92Var5.m27557c(1835297121);
                Objects.requireNonNull(m27557c2);
                b92 m27556d2 = m27557c2.m27556d(1751411826);
                Objects.requireNonNull(m27556d2);
                int m11561e = m11561e(m11559g(m27556d2.f4558b));
                i = i46;
                int i47 = -1;
                if (m11561e == -1) {
                    ey6Var2 = ey6Var;
                    str = "AtomParsers";
                    a92Var2 = a92Var5;
                    arrayList = arrayList3;
                } else {
                    b92 m27556d3 = a92Var5.m27556d(1953196132);
                    Objects.requireNonNull(m27556d3);
                    ik5 ik5Var4 = m27556d3.f4558b;
                    ik5Var4.m19716f(8);
                    int m25488a = c92.m25488a(ik5Var4.m19709m());
                    ik5Var4.m19715g(m25488a == 0 ? 8 : 16);
                    int m19709m2 = ik5Var4.m19709m();
                    ik5Var4.m19715g(4);
                    int m19711k = ik5Var4.m19711k();
                    int i48 = m25488a != 0 ? 8 : 4;
                    int i49 = 0;
                    while (true) {
                        if (i49 >= i48) {
                            ik5Var4.m19715g(i48);
                            break;
                        } else if (ik5Var4.m19714h()[m19711k + i49] != -1) {
                            j2 = m25488a == 0 ? ik5Var4.m19729A() : ik5Var4.m19728B();
                        } else {
                            i49++;
                        }
                    }
                    j2 = -9223372036854775807L;
                    ik5Var4.m19715g(16);
                    int m19709m3 = ik5Var4.m19709m();
                    int m19709m4 = ik5Var4.m19709m();
                    ik5Var4.m19715g(4);
                    int m19709m5 = ik5Var4.m19709m();
                    int m19709m6 = ik5Var4.m19709m();
                    int i50 = 65536;
                    String str9 = "AtomParsers";
                    if (m19709m3 == 0) {
                        if (m19709m4 == 65536) {
                            if (m19709m5 != -65536) {
                                m19709m4 = 65536;
                            } else if (m19709m6 == 0) {
                                i2 = 90;
                                q92 q92Var2 = new q92(m19709m2, j2, i2);
                                if (j == -9223372036854775807L) {
                                    j7 = q92Var2.f23783b;
                                    j3 = j7;
                                } else {
                                    j3 = j;
                                }
                                ik5 ik5Var5 = m27556d.f4558b;
                                ik5Var5.m19716f(8);
                                ik5Var5.m19715g(c92.m25488a(ik5Var5.m19709m()) == 0 ? 8 : 16);
                                long m19729A = ik5Var5.m19729A();
                                long m19392g0 = j3 != -9223372036854775807L ? it5.m19392g0(j3, 1000000L, m19729A) : -9223372036854775807L;
                                a92 m27557c3 = m27557c2.m27557c(1835626086);
                                Objects.requireNonNull(m27557c3);
                                a92 m27557c4 = m27557c3.m27557c(1937007212);
                                Objects.requireNonNull(m27557c4);
                                b92 m27556d4 = m27557c2.m27556d(1835296868);
                                Objects.requireNonNull(m27556d4);
                                Pair m11557i = m11557i(m27556d4.f4558b);
                                b92 m27556d5 = m27557c4.m27556d(1937011556);
                                Objects.requireNonNull(m27556d5);
                                ik5 ik5Var6 = m27556d5.f4558b;
                                i3 = q92Var2.f23782a;
                                i4 = q92Var2.f23784c;
                                String str10 = (String) m11557i.second;
                                ik5Var6.m19716f(12);
                                m19709m = ik5Var6.m19709m();
                                n92 n92Var6 = new n92(m19709m);
                                i5 = 0;
                                while (i5 < m19709m) {
                                    ArrayList arrayList4 = arrayList3;
                                    int m19711k2 = ik5Var6.m19711k();
                                    int m19709m7 = ik5Var6.m19709m();
                                    n09.m15609b(m19709m7 > 0, "childAtomSize must be positive");
                                    int m19709m8 = ik5Var6.m19709m();
                                    int i51 = m19709m;
                                    if (m19709m8 == 1635148593 || m19709m8 == 1635148595 || m19709m8 == 1701733238 || m19709m8 == 1831958048 || m19709m8 == 1836070006 || m19709m8 == 1752589105 || m19709m8 == 1751479857 || m19709m8 == 1932670515 || m19709m8 == 1211250227 || m19709m8 == 1987063864 || m19709m8 == 1987063865 || m19709m8 == 1635135537 || m19709m8 == 1685479798 || m19709m8 == 1685479729 || m19709m8 == 1685481573 || m19709m8 == 1685481521) {
                                        n92 n92Var7 = n92Var6;
                                        str2 = str10;
                                        int i52 = i4;
                                        int i53 = i3;
                                        i7 = m11561e;
                                        a92Var3 = a92Var5;
                                        q92Var = q92Var2;
                                        pair = m11557i;
                                        str3 = str9;
                                        ik5Var = ik5Var6;
                                        ik5Var.m19716f(m19711k2 + 16);
                                        ik5Var.m19715g(16);
                                        int m19699w = ik5Var.m19699w();
                                        int m19699w2 = ik5Var.m19699w();
                                        ik5Var.m19715g(50);
                                        int m19711k3 = ik5Var.m19711k();
                                        if (m19709m8 == 1701733238) {
                                            Pair m11556j = m11556j(ik5Var, m19711k2, m19709m7);
                                            if (m11556j != null) {
                                                int intValue = ((Integer) m11556j.first).intValue();
                                                if (zzxVar3 == null) {
                                                    n92Var2 = n92Var7;
                                                    zzxVar2 = null;
                                                } else {
                                                    zzxVar2 = zzxVar3.m1089b(((ia2) m11556j.second).f13393b);
                                                    n92Var2 = n92Var7;
                                                }
                                                n92Var2.f19737a[i5] = (ia2) m11556j.second;
                                                m19709m8 = intValue;
                                            } else {
                                                n92Var2 = n92Var7;
                                                zzxVar2 = zzxVar3;
                                                m19709m8 = 1701733238;
                                            }
                                            ik5Var.m19716f(m19711k3);
                                        } else {
                                            n92Var2 = n92Var7;
                                            zzxVar2 = zzxVar3;
                                        }
                                        if (m19709m8 == 1831958048) {
                                            int i54 = m19709m8;
                                            str4 = "video/mpeg";
                                            i8 = i54;
                                        } else {
                                            i8 = 1211250227;
                                            if (m19709m8 == 1211250227) {
                                                str4 = "video/3gpp";
                                            } else {
                                                i8 = m19709m8;
                                                str4 = null;
                                            }
                                        }
                                        i9 = i5;
                                        int i55 = m19711k3;
                                        zzx zzxVar4 = zzxVar2;
                                        String str11 = null;
                                        float f3 = 1.0f;
                                        int i56 = -1;
                                        byte[] bArr4 = null;
                                        int i57 = -1;
                                        int i58 = -1;
                                        int i59 = -1;
                                        ByteBuffer byteBuffer = null;
                                        l92 l92Var = null;
                                        List list2 = null;
                                        String str12 = str4;
                                        boolean z8 = false;
                                        while (true) {
                                            if (i55 - m19711k2 >= m19709m7) {
                                                i10 = m19709m7;
                                                i11 = m19699w;
                                                i12 = m19699w2;
                                                f = f3;
                                                n92Var3 = n92Var2;
                                                i13 = i56;
                                                break;
                                            }
                                            ik5Var.m19716f(i55);
                                            int m19711k4 = ik5Var.m19711k();
                                            int m19709m9 = ik5Var.m19709m();
                                            if (m19709m9 == 0) {
                                                i13 = i56;
                                                if (ik5Var.m19711k() - m19711k2 == m19709m7) {
                                                    i10 = m19709m7;
                                                    i11 = m19699w;
                                                    i12 = m19699w2;
                                                    f = f3;
                                                    n92Var3 = n92Var2;
                                                    break;
                                                }
                                                i19 = 0;
                                            } else {
                                                i13 = i56;
                                                i19 = m19709m9;
                                            }
                                            int i60 = m19709m7;
                                            int i61 = m19711k2;
                                            n09.m15609b(i19 > 0, "childAtomSize must be positive");
                                            int m19709m10 = ik5Var.m19709m();
                                            if (m19709m10 == 1635148611) {
                                                n09.m15609b(str12 == null, null);
                                                ik5Var.m19716f(m19711k4 + 8);
                                                gz8 m21127a = gz8.m21127a(ik5Var);
                                                list = m21127a.f11899a;
                                                n92Var2.f19739c = m21127a.f11900b;
                                                if (!z8) {
                                                    f3 = m21127a.f11903e;
                                                }
                                                str7 = m21127a.f11904f;
                                                str12 = "video/avc";
                                            } else if (m19709m10 == 1752589123) {
                                                n09.m15609b(str12 == null, null);
                                                ik5Var.m19716f(m19711k4 + 8);
                                                z09 m3003a = z09.m3003a(ik5Var);
                                                list = m3003a.f34320a;
                                                n92Var2.f19739c = m3003a.f34321b;
                                                if (!z8) {
                                                    f3 = m3003a.f34322c;
                                                }
                                                str7 = m3003a.f34323d;
                                                str12 = "video/hevc";
                                            } else {
                                                if (m19709m10 == 1685480259 || m19709m10 == 1685485123) {
                                                    i20 = i8;
                                                    z3 = z8;
                                                    i21 = m19699w;
                                                    i22 = m19699w2;
                                                    f2 = f3;
                                                    n92Var5 = n92Var2;
                                                    bArr = bArr4;
                                                    f09 m22974a = f09.m22974a(ik5Var);
                                                    if (m22974a != null) {
                                                        str11 = m22974a.f8987a;
                                                        str12 = "video/dolby-vision";
                                                    }
                                                } else {
                                                    if (m19709m10 == 1987076931) {
                                                        n09.m15609b(str12 == null, null);
                                                        str6 = i8 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                    } else if (m19709m10 == 1635135811) {
                                                        n09.m15609b(str12 == null, null);
                                                        str6 = "video/av01";
                                                    } else if (m19709m10 == 1668050025) {
                                                        if (byteBuffer == null) {
                                                            byteBuffer = m11554l();
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBuffer;
                                                        byteBuffer2.position(21);
                                                        byteBuffer2.putShort(ik5Var.m19723G());
                                                        byteBuffer2.putShort(ik5Var.m19723G());
                                                        byteBuffer = byteBuffer2;
                                                        i20 = i8;
                                                        i21 = m19699w;
                                                        i22 = m19699w2;
                                                        n92Var5 = n92Var2;
                                                        i55 += i19;
                                                        m19709m7 = i60;
                                                        i56 = i13;
                                                        m19711k2 = i61;
                                                        i8 = i20;
                                                        n92Var2 = n92Var5;
                                                        m19699w2 = i22;
                                                        m19699w = i21;
                                                    } else {
                                                        if (m19709m10 == 1835295606) {
                                                            if (byteBuffer == null) {
                                                                byteBuffer = m11554l();
                                                            }
                                                            ByteBuffer byteBuffer3 = byteBuffer;
                                                            short m19723G = ik5Var.m19723G();
                                                            short m19723G2 = ik5Var.m19723G();
                                                            i20 = i8;
                                                            short m19723G3 = ik5Var.m19723G();
                                                            z3 = z8;
                                                            short m19723G4 = ik5Var.m19723G();
                                                            n92Var5 = n92Var2;
                                                            short m19723G5 = ik5Var.m19723G();
                                                            bArr = bArr4;
                                                            short m19723G6 = ik5Var.m19723G();
                                                            f2 = f3;
                                                            short m19723G7 = ik5Var.m19723G();
                                                            i22 = m19699w2;
                                                            short m19723G8 = ik5Var.m19723G();
                                                            long m19729A2 = ik5Var.m19729A();
                                                            long m19729A3 = ik5Var.m19729A();
                                                            i21 = m19699w;
                                                            byteBuffer3.position(1);
                                                            byteBuffer3.putShort(m19723G5);
                                                            byteBuffer3.putShort(m19723G6);
                                                            byteBuffer3.putShort(m19723G);
                                                            byteBuffer3.putShort(m19723G2);
                                                            byteBuffer3.putShort(m19723G3);
                                                            byteBuffer3.putShort(m19723G4);
                                                            byteBuffer3.putShort(m19723G7);
                                                            byteBuffer3.putShort(m19723G8);
                                                            byteBuffer3.putShort((short) (m19729A2 / 10000));
                                                            byteBuffer3.putShort((short) (m19729A3 / 10000));
                                                            byteBuffer = byteBuffer3;
                                                        } else {
                                                            i20 = i8;
                                                            z3 = z8;
                                                            i21 = m19699w;
                                                            i22 = m19699w2;
                                                            f2 = f3;
                                                            n92Var5 = n92Var2;
                                                            bArr = bArr4;
                                                            if (m19709m10 == 1681012275) {
                                                                n09.m15609b(str12 == null, null);
                                                                str12 = "video/3gpp";
                                                            } else if (m19709m10 == 1702061171) {
                                                                n09.m15609b(str12 == null, null);
                                                                l92 m11555k = m11555k(ik5Var, m19711k4);
                                                                str5 = m11555k.f17151a;
                                                                bArr3 = m11555k.f17152b;
                                                                l92Var = m11555k;
                                                                str12 = str5;
                                                                list2 = bArr3 != null ? y17.m4259v(bArr3) : list2;
                                                            } else if (m19709m10 == 1885434736) {
                                                                ik5Var.m19716f(m19711k4 + 8);
                                                                f3 = ik5Var.m19700v() / ik5Var.m19700v();
                                                                bArr4 = bArr;
                                                                z8 = true;
                                                                i55 += i19;
                                                                m19709m7 = i60;
                                                                i56 = i13;
                                                                m19711k2 = i61;
                                                                i8 = i20;
                                                                n92Var2 = n92Var5;
                                                                m19699w2 = i22;
                                                                m19699w = i21;
                                                            } else if (m19709m10 == 1937126244) {
                                                                int i62 = m19711k4 + 8;
                                                                while (true) {
                                                                    if (i62 - m19711k4 >= i19) {
                                                                        bArr2 = null;
                                                                        break;
                                                                    }
                                                                    ik5Var.m19716f(i62);
                                                                    int m19709m11 = ik5Var.m19709m();
                                                                    if (ik5Var.m19709m() == 1886547818) {
                                                                        bArr2 = Arrays.copyOfRange(ik5Var.m19714h(), i62, m19709m11 + i62);
                                                                        break;
                                                                    }
                                                                    i62 += m19709m11;
                                                                }
                                                                bArr4 = bArr2;
                                                                z8 = z3;
                                                                f3 = f2;
                                                                i55 += i19;
                                                                m19709m7 = i60;
                                                                i56 = i13;
                                                                m19711k2 = i61;
                                                                i8 = i20;
                                                                n92Var2 = n92Var5;
                                                                m19699w2 = i22;
                                                                m19699w = i21;
                                                            } else if (m19709m10 == 1936995172) {
                                                                int m19703s = ik5Var.m19703s();
                                                                int i63 = 3;
                                                                ik5Var.m19715g(3);
                                                                if (m19703s == 0) {
                                                                    int m19703s2 = ik5Var.m19703s();
                                                                    if (m19703s2 == 0) {
                                                                        i63 = 0;
                                                                    } else if (m19703s2 == 1) {
                                                                        i63 = 1;
                                                                    } else if (m19703s2 == 2) {
                                                                        i63 = 2;
                                                                    }
                                                                    i13 = i63;
                                                                }
                                                                i63 = i13;
                                                                i13 = i63;
                                                            } else if (m19709m10 == 1668246642) {
                                                                int m19709m12 = ik5Var.m19709m();
                                                                if (m19709m12 == 1852009592 || m19709m12 == 1852009571) {
                                                                    int m19699w3 = ik5Var.m19699w();
                                                                    int m19699w4 = ik5Var.m19699w();
                                                                    ik5Var.m19715g(2);
                                                                    if (i19 == 19) {
                                                                        z4 = (ik5Var.m19703s() & 128) != 0;
                                                                        i19 = 19;
                                                                    } else {
                                                                        z4 = false;
                                                                    }
                                                                    int m15870a = mo8.m15870a(m19699w3);
                                                                    int i64 = true != z4 ? 2 : 1;
                                                                    i59 = m15870a;
                                                                    i57 = mo8.m15869b(m19699w4);
                                                                    i58 = i64;
                                                                } else {
                                                                    s95.m10493e(str3, "Unsupported color type: ".concat(c92.m25487b(m19709m12)));
                                                                }
                                                            }
                                                        }
                                                        z8 = z3;
                                                        bArr4 = bArr;
                                                        f3 = f2;
                                                        i55 += i19;
                                                        m19709m7 = i60;
                                                        i56 = i13;
                                                        m19711k2 = i61;
                                                        i8 = i20;
                                                        n92Var2 = n92Var5;
                                                        m19699w2 = i22;
                                                        m19699w = i21;
                                                    }
                                                    str12 = str6;
                                                    i20 = i8;
                                                    i21 = m19699w;
                                                    i22 = m19699w2;
                                                    n92Var5 = n92Var2;
                                                    i55 += i19;
                                                    m19709m7 = i60;
                                                    i56 = i13;
                                                    m19711k2 = i61;
                                                    i8 = i20;
                                                    n92Var2 = n92Var5;
                                                    m19699w2 = i22;
                                                    m19699w = i21;
                                                }
                                                z8 = z3;
                                                bArr4 = bArr;
                                                f3 = f2;
                                                i55 += i19;
                                                m19709m7 = i60;
                                                i56 = i13;
                                                m19711k2 = i61;
                                                i8 = i20;
                                                n92Var2 = n92Var5;
                                                m19699w2 = i22;
                                                m19699w = i21;
                                            }
                                            list2 = list;
                                            i20 = i8;
                                            i21 = m19699w;
                                            i22 = m19699w2;
                                            n92Var5 = n92Var2;
                                            str11 = str7;
                                            i55 += i19;
                                            m19709m7 = i60;
                                            i56 = i13;
                                            m19711k2 = i61;
                                            i8 = i20;
                                            n92Var2 = n92Var5;
                                            m19699w2 = i22;
                                            m19699w = i21;
                                        }
                                        byte[] bArr5 = bArr4;
                                        i14 = m19711k2;
                                        if (str12 == null) {
                                            i16 = i52;
                                            i15 = i53;
                                            n92Var4 = n92Var3;
                                        } else {
                                            b72 b72Var = new b72();
                                            i15 = i53;
                                            b72Var.m26386g(i15);
                                            b72Var.m26372s(str12);
                                            b72Var.m26387f0(str11);
                                            b72Var.m26367x(i11);
                                            b72Var.m26388f(i12);
                                            b72Var.m26375p(f);
                                            i16 = i52;
                                            b72Var.m26373r(i16);
                                            b72Var.m26374q(bArr5);
                                            b72Var.m26369v(i13);
                                            b72Var.m26382i(list2);
                                            b72Var.m26396b(zzxVar4);
                                            int i65 = i59;
                                            if (i65 == -1) {
                                                i18 = i58;
                                                i17 = i57;
                                                if (i18 == -1) {
                                                    if (i17 == -1) {
                                                    }
                                                }
                                            } else {
                                                i17 = i57;
                                                i18 = i58;
                                            }
                                            b72Var.m26385g0(new mo8(i65, i18, i17, byteBuffer != null ? byteBuffer.array() : null));
                                            if (l92Var != null) {
                                                j4 = l92Var.f17153c;
                                                b72Var.m26391d0(i47.m20124c(j4));
                                                j5 = l92Var.f17154d;
                                                b72Var.m26376o(i47.m20124c(j5));
                                            }
                                            n92Var4 = n92Var3;
                                            n92Var4.f19738b = b72Var.m26366y();
                                        }
                                    } else if (m19709m8 == 1836069985 || m19709m8 == 1701733217 || m19709m8 == 1633889587 || m19709m8 == 1700998451 || m19709m8 == 1633889588 || m19709m8 == 1835823201 || m19709m8 == 1685353315 || m19709m8 == 1685353317 || m19709m8 == 1685353320 || m19709m8 == 1685353324 || m19709m8 == 1685353336 || m19709m8 == 1935764850 || m19709m8 == 1935767394 || m19709m8 == 1819304813 || m19709m8 == 1936684916 || m19709m8 == 1953984371 || m19709m8 == 778924082 || m19709m8 == 778924083 || m19709m8 == 1835557169 || m19709m8 == 1835560241 || m19709m8 == 1634492771 || m19709m8 == 1634492791 || m19709m8 == 1970037111 || m19709m8 == 1332770163 || m19709m8 == 1716281667) {
                                        int i66 = m11561e;
                                        n92 n92Var8 = n92Var6;
                                        str2 = str10;
                                        q92Var = q92Var2;
                                        pair = m11557i;
                                        str3 = str9;
                                        i7 = i66;
                                        ik5Var = ik5Var6;
                                        a92Var3 = a92Var5;
                                        m11553m(ik5Var6, m19709m8, m19711k2, m19709m7, i3, str2, z2, zzxVar, n92Var8, i5);
                                        i10 = m19709m7;
                                        i14 = m19711k2;
                                        n92Var4 = n92Var8;
                                        i16 = i4;
                                        i15 = i3;
                                        i9 = i5;
                                    } else {
                                        if (m19709m8 == 1414810956 || m19709m8 == 1954034535 || m19709m8 == 2004251764 || m19709m8 == 1937010800 || m19709m8 == 1664495672) {
                                            ik5Var6.m19716f(m19711k2 + 16);
                                            if (m19709m8 == 1414810956) {
                                                str8 = "application/ttml+xml";
                                            } else {
                                                if (m19709m8 == 1954034535) {
                                                    int i67 = m19709m7 - 16;
                                                    byte[] bArr6 = new byte[i67];
                                                    ik5Var6.m19720b(bArr6, 0, i67);
                                                    i23 = i4;
                                                    i24 = m11561e;
                                                    j6 = Long.MAX_VALUE;
                                                    y17Var = y17.m4259v(bArr6);
                                                    str8 = "application/x-quicktime-tx3g";
                                                } else if (m19709m8 == 2004251764) {
                                                    str8 = "application/x-mp4-vtt";
                                                } else if (m19709m8 == 1937010800) {
                                                    str8 = "application/ttml+xml";
                                                    i23 = i4;
                                                    i24 = m11561e;
                                                    y17Var = null;
                                                    j6 = 0;
                                                } else {
                                                    n92Var6.f19740d = 1;
                                                    str8 = "application/x-mp4-cea-608";
                                                }
                                                b72 b72Var2 = new b72();
                                                b72Var2.m26386g(i3);
                                                b72Var2.m26372s(str8);
                                                b72Var2.m26380k(str10);
                                                b72Var2.m26368w(j6);
                                                b72Var2.m26382i(y17Var);
                                                n92Var6.f19738b = b72Var2.m26366y();
                                                i9 = i5;
                                                i10 = m19709m7;
                                                n92Var4 = n92Var6;
                                                str2 = str10;
                                                i15 = i3;
                                                a92Var3 = a92Var5;
                                                i14 = m19711k2;
                                                q92Var = q92Var2;
                                                pair = m11557i;
                                                i7 = i24;
                                                str3 = str9;
                                                i16 = i23;
                                            }
                                            i23 = i4;
                                            i24 = m11561e;
                                            j6 = Long.MAX_VALUE;
                                            y17Var = null;
                                            b72 b72Var22 = new b72();
                                            b72Var22.m26386g(i3);
                                            b72Var22.m26372s(str8);
                                            b72Var22.m26380k(str10);
                                            b72Var22.m26368w(j6);
                                            b72Var22.m26382i(y17Var);
                                            n92Var6.f19738b = b72Var22.m26366y();
                                            i9 = i5;
                                            i10 = m19709m7;
                                            n92Var4 = n92Var6;
                                            str2 = str10;
                                            i15 = i3;
                                            a92Var3 = a92Var5;
                                            i14 = m19711k2;
                                            q92Var = q92Var2;
                                            pair = m11557i;
                                            i7 = i24;
                                            str3 = str9;
                                            i16 = i23;
                                        } else {
                                            if (m19709m8 == 1835365492) {
                                                m11552n(ik5Var6, 1835365492, m19711k2, i3, n92Var6);
                                            } else if (m19709m8 == 1667329389) {
                                                b72 b72Var3 = new b72();
                                                b72Var3.m26386g(i3);
                                                b72Var3.m26372s("application/x-camera-motion");
                                                n92Var6.f19738b = b72Var3.m26366y();
                                            }
                                            i9 = i5;
                                            i10 = m19709m7;
                                            n92Var4 = n92Var6;
                                            str2 = str10;
                                            i16 = i4;
                                            i15 = i3;
                                            i7 = m11561e;
                                            a92Var3 = a92Var5;
                                            i14 = m19711k2;
                                            q92Var = q92Var2;
                                            pair = m11557i;
                                            str3 = str9;
                                        }
                                        ik5Var = ik5Var6;
                                    }
                                    ik5Var.m19716f(i14 + i10);
                                    i5 = i9 + 1;
                                    zzxVar3 = zzxVar;
                                    i3 = i15;
                                    i4 = i16;
                                    n92Var6 = n92Var4;
                                    str9 = str3;
                                    ik5Var6 = ik5Var;
                                    str10 = str2;
                                    m11561e = i7;
                                    m11557i = pair;
                                    q92Var2 = q92Var;
                                    m19709m = i51;
                                    arrayList3 = arrayList4;
                                    a92Var5 = a92Var3;
                                }
                                n92Var = n92Var6;
                                int i68 = m11561e;
                                arrayList = arrayList3;
                                q92 q92Var3 = q92Var2;
                                Pair pair2 = m11557i;
                                str = str9;
                                i47 = -1;
                                a92Var2 = a92Var5;
                                m27557c = a92Var2.m27557c(1701082227);
                                if (m27557c != null || (m11558h = m11558h(m27557c)) == null) {
                                    jArr = null;
                                    jArr2 = null;
                                } else {
                                    jArr = (long[]) m11558h.first;
                                    jArr2 = (long[]) m11558h.second;
                                }
                                if (n92Var.f19738b == null) {
                                    ey6Var2 = ey6Var;
                                } else {
                                    i6 = q92Var3.f23782a;
                                    ha2Var = new ha2(i6, i68, ((Long) pair2.first).longValue(), m19729A, m19392g0, n92Var.f19738b, n92Var.f19740d, n92Var.f19737a, n92Var.f19739c, jArr, jArr2);
                                    ey6Var2 = ey6Var;
                                    ha2Var2 = (ha2) ey6Var2.apply(ha2Var);
                                    if (ha2Var2 == null) {
                                        a92 m27557c5 = a92Var2.m27557c(1835297121);
                                        Objects.requireNonNull(m27557c5);
                                        a92 m27557c6 = m27557c5.m27557c(1835626086);
                                        Objects.requireNonNull(m27557c6);
                                        a92 m27557c7 = m27557c6.m27557c(1937007212);
                                        Objects.requireNonNull(m27557c7);
                                        b92 m27556d6 = m27557c7.m27556d(1937011578);
                                        if (m27556d6 != null) {
                                            p92Var = new o92(m27556d6, ha2Var2.f12292f);
                                        } else {
                                            b92 m27556d7 = m27557c7.m27556d(1937013298);
                                            if (m27556d7 == null) {
                                                throw dl3.m24267a("Track has no sample table size information", null);
                                            }
                                            p92Var = new p92(m27556d7);
                                        }
                                        int zzb = p92Var.zzb();
                                        if (zzb == 0) {
                                            ka2Var = new ka2(ha2Var2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                        } else {
                                            b92 m27556d8 = m27557c7.m27556d(1937007471);
                                            if (m27556d8 == null) {
                                                b92 m27556d9 = m27557c7.m27556d(1668232756);
                                                Objects.requireNonNull(m27556d9);
                                                b92Var = m27556d9;
                                                z5 = true;
                                            } else {
                                                b92Var = m27556d8;
                                                z5 = false;
                                            }
                                            ik5 ik5Var7 = b92Var.f4558b;
                                            b92 m27556d10 = m27557c7.m27556d(1937011555);
                                            Objects.requireNonNull(m27556d10);
                                            ik5 ik5Var8 = m27556d10.f4558b;
                                            b92 m27556d11 = m27557c7.m27556d(1937011827);
                                            Objects.requireNonNull(m27556d11);
                                            ik5 ik5Var9 = m27556d11.f4558b;
                                            b92 m27556d12 = m27557c7.m27556d(1937011571);
                                            ik5 ik5Var10 = m27556d12 != null ? m27556d12.f4558b : null;
                                            b92 m27556d13 = m27557c7.m27556d(1668576371);
                                            ik5 ik5Var11 = m27556d13 != null ? m27556d13.f4558b : null;
                                            d92 d92Var = new d92(ik5Var8, ik5Var7, z5);
                                            ik5Var9.m19716f(12);
                                            int m19700v = ik5Var9.m19700v() + i47;
                                            int m19700v2 = ik5Var9.m19700v();
                                            int m19700v3 = ik5Var9.m19700v();
                                            if (ik5Var11 != null) {
                                                ik5Var11.m19716f(12);
                                                i25 = ik5Var11.m19700v();
                                            } else {
                                                i25 = 0;
                                            }
                                            if (ik5Var10 != null) {
                                                ik5Var10.m19716f(12);
                                                i26 = ik5Var10.m19700v();
                                                if (i26 > 0) {
                                                    i27 = ik5Var10.m19700v() - 1;
                                                    zza = p92Var.zza();
                                                    String str13 = ha2Var2.f12292f.f9275l;
                                                    if (zza != i47 && (("audio/raw".equals(str13) || "audio/g711-mlaw".equals(str13) || "audio/g711-alaw".equals(str13)) && m19700v == 0)) {
                                                        if (i25 == 0 || i26 != 0) {
                                                            m19700v = 0;
                                                        } else {
                                                            int i69 = d92Var.f6638a;
                                                            long[] jArr8 = new long[i69];
                                                            int[] iArr6 = new int[i69];
                                                            while (d92Var.m24593a()) {
                                                                int i70 = d92Var.f6639b;
                                                                jArr8[i70] = d92Var.f6641d;
                                                                iArr6[i70] = d92Var.f6640c;
                                                            }
                                                            long j11 = m19700v3;
                                                            int i71 = 8192 / zza;
                                                            int i72 = 0;
                                                            for (int i73 = 0; i73 < i69; i73++) {
                                                                i72 += it5.m19417O(iArr6[i73], i71);
                                                            }
                                                            long[] jArr9 = new long[i72];
                                                            int[] iArr7 = new int[i72];
                                                            long[] jArr10 = new long[i72];
                                                            int[] iArr8 = new int[i72];
                                                            int i74 = 0;
                                                            int i75 = 0;
                                                            int i76 = 0;
                                                            int i77 = 0;
                                                            while (i74 < i69) {
                                                                int i78 = iArr6[i74];
                                                                long j12 = jArr8[i74];
                                                                int i79 = i69;
                                                                int i80 = i78;
                                                                while (i80 > 0) {
                                                                    int min = Math.min(i71, i80);
                                                                    jArr9[i77] = j12;
                                                                    long[] jArr11 = jArr8;
                                                                    int i81 = zza * min;
                                                                    iArr7[i77] = i81;
                                                                    i76 = Math.max(i76, i81);
                                                                    jArr10[i77] = i75 * j11;
                                                                    iArr8[i77] = 1;
                                                                    j12 += iArr7[i77];
                                                                    i75 += min;
                                                                    i80 -= min;
                                                                    i77++;
                                                                    jArr8 = jArr11;
                                                                    zza = zza;
                                                                }
                                                                i74++;
                                                                i69 = i79;
                                                            }
                                                            long j13 = j11 * i75;
                                                            jArr5 = jArr9;
                                                            iArr3 = iArr8;
                                                            iArr4 = iArr7;
                                                            jArr4 = jArr10;
                                                            i37 = i76;
                                                            ha2Var3 = ha2Var2;
                                                            j9 = j13;
                                                            long m19392g02 = it5.m19392g0(j9, 1000000L, ha2Var3.f12289c);
                                                            jArr6 = ha2Var3.f12294h;
                                                            if (jArr6 == null) {
                                                                it5.m19378r(jArr4, 1000000L, ha2Var3.f12289c);
                                                                ka2Var2 = new ka2(ha2Var3, jArr5, iArr4, i37, jArr4, iArr3, m19392g02);
                                                            } else {
                                                                ha2 ha2Var5 = ha2Var3;
                                                                if (jArr6.length == 1 && ha2Var5.f12288b == 1 && jArr4.length >= 2) {
                                                                    long[] jArr12 = ha2Var5.f12295i;
                                                                    Objects.requireNonNull(jArr12);
                                                                    long j14 = jArr12[0];
                                                                    long m19392g03 = j14 + it5.m19392g0(jArr6[0], ha2Var5.f12289c, ha2Var5.f12290d);
                                                                    i40 = zzb;
                                                                    ha2Var4 = ha2Var5;
                                                                    if (m11551o(jArr4, j9, j14, m19392g03)) {
                                                                        long m19392g04 = it5.m19392g0(j14 - jArr4[0], ha2Var4.f12292f.f9289z, ha2Var4.f12289c);
                                                                        long m19392g05 = it5.m19392g0(j9 - m19392g03, ha2Var4.f12292f.f9289z, ha2Var4.f12289c);
                                                                        if (m19392g04 == 0) {
                                                                            if (m19392g05 != 0) {
                                                                                m19392g04 = 0;
                                                                            }
                                                                        }
                                                                        if (m19392g04 <= 2147483647L && m19392g05 <= 2147483647L) {
                                                                            y09Var.f33208a = (int) m19392g04;
                                                                            y09Var.f33209b = (int) m19392g05;
                                                                            it5.m19378r(jArr4, 1000000L, ha2Var4.f12289c);
                                                                            ka2Var2 = new ka2(ha2Var4, jArr5, iArr4, i37, jArr4, iArr3, it5.m19392g0(ha2Var4.f12294h[0], 1000000L, ha2Var4.f12290d));
                                                                        }
                                                                    }
                                                                } else {
                                                                    i40 = zzb;
                                                                    ha2Var4 = ha2Var5;
                                                                }
                                                                long[] jArr13 = ha2Var4.f12294h;
                                                                int length = jArr13.length;
                                                                if (length == 1) {
                                                                    if (jArr13[0] == 0) {
                                                                        long[] jArr14 = ha2Var4.f12295i;
                                                                        Objects.requireNonNull(jArr14);
                                                                        long j15 = jArr14[0];
                                                                        for (int i82 = 0; i82 < jArr4.length; i82++) {
                                                                            jArr4[i82] = it5.m19392g0(jArr4[i82] - j15, 1000000L, ha2Var4.f12289c);
                                                                        }
                                                                        ka2Var2 = new ka2(ha2Var4, jArr5, iArr4, i37, jArr4, iArr3, it5.m19392g0(j9 - j15, 1000000L, ha2Var4.f12289c));
                                                                    } else {
                                                                        length = 1;
                                                                    }
                                                                }
                                                                boolean z9 = ha2Var4.f12288b == 1;
                                                                int[] iArr9 = new int[length];
                                                                int[] iArr10 = new int[length];
                                                                long[] jArr15 = ha2Var4.f12295i;
                                                                Objects.requireNonNull(jArr15);
                                                                int i83 = 0;
                                                                int i84 = 0;
                                                                int i85 = 0;
                                                                boolean z10 = false;
                                                                while (true) {
                                                                    long[] jArr16 = ha2Var4.f12294h;
                                                                    if (i83 >= jArr16.length) {
                                                                        break;
                                                                    }
                                                                    long[] jArr17 = jArr5;
                                                                    int[] iArr11 = iArr4;
                                                                    long j16 = jArr15[i83];
                                                                    if (j16 != -1) {
                                                                        long j17 = jArr16[i83];
                                                                        boolean z11 = z10;
                                                                        i41 = i37;
                                                                        int i86 = i84;
                                                                        int i87 = i85;
                                                                        long m19392g06 = it5.m19392g0(j17, ha2Var4.f12289c, ha2Var4.f12290d);
                                                                        int i88 = 1;
                                                                        iArr9[i83] = it5.m19418N(jArr4, j16, true, true);
                                                                        iArr10[i83] = it5.m19420L(jArr4, j16 + m19392g06, z9, false);
                                                                        while (true) {
                                                                            i44 = iArr9[i83];
                                                                            i45 = iArr10[i83];
                                                                            if (i44 >= i45 || (iArr3[i44] & i88) != 0) {
                                                                                break;
                                                                            }
                                                                            iArr9[i83] = i44 + 1;
                                                                            i88 = 1;
                                                                        }
                                                                        i43 = i86 + (i45 - i44);
                                                                        z7 = z11 | (i87 != i44);
                                                                        i42 = i45;
                                                                    } else {
                                                                        z7 = z10;
                                                                        i41 = i37;
                                                                        i42 = i85;
                                                                        i43 = i84;
                                                                    }
                                                                    i83++;
                                                                    jArr5 = jArr17;
                                                                    i84 = i43;
                                                                    i85 = i42;
                                                                    i37 = i41;
                                                                    iArr4 = iArr11;
                                                                    z10 = z7;
                                                                }
                                                                long[] jArr18 = jArr5;
                                                                int[] iArr12 = iArr4;
                                                                int i89 = i84;
                                                                int i90 = i37;
                                                                boolean z12 = z10 | (i89 != i40);
                                                                long[] jArr19 = z12 ? new long[i89] : jArr18;
                                                                int[] iArr13 = z12 ? new int[i89] : iArr12;
                                                                int i91 = true == z12 ? 0 : i90;
                                                                int[] iArr14 = z12 ? new int[i89] : iArr3;
                                                                long[] jArr20 = new long[i89];
                                                                int i92 = i91;
                                                                int i93 = 0;
                                                                int i94 = 0;
                                                                long j18 = 0;
                                                                while (i93 < ha2Var4.f12294h.length) {
                                                                    long j19 = ha2Var4.f12295i[i93];
                                                                    int i95 = iArr9[i93];
                                                                    int i96 = iArr10[i93];
                                                                    int[] iArr15 = iArr9;
                                                                    if (z12) {
                                                                        int i97 = i96 - i95;
                                                                        System.arraycopy(jArr18, i95, jArr19, i94, i97);
                                                                        jArr7 = jArr18;
                                                                        iArr5 = iArr12;
                                                                        System.arraycopy(iArr5, i95, iArr13, i94, i97);
                                                                        System.arraycopy(iArr3, i95, iArr14, i94, i97);
                                                                    } else {
                                                                        jArr7 = jArr18;
                                                                        iArr5 = iArr12;
                                                                    }
                                                                    while (i95 < i96) {
                                                                        int[] iArr16 = iArr10;
                                                                        int[] iArr17 = iArr14;
                                                                        long[] jArr21 = jArr4;
                                                                        int[] iArr18 = iArr3;
                                                                        long[] jArr22 = jArr19;
                                                                        jArr20[i94] = it5.m19392g0(j18, 1000000L, ha2Var4.f12290d) + it5.m19392g0(Math.max(0L, jArr4[i95] - j19), 1000000L, ha2Var4.f12289c);
                                                                        if (z12 && iArr13[i94] > i92) {
                                                                            i92 = iArr5[i95];
                                                                        }
                                                                        i94++;
                                                                        i95++;
                                                                        iArr10 = iArr16;
                                                                        jArr4 = jArr21;
                                                                        iArr3 = iArr18;
                                                                        iArr14 = iArr17;
                                                                        jArr19 = jArr22;
                                                                    }
                                                                    j18 += ha2Var4.f12294h[i93];
                                                                    i93++;
                                                                    iArr10 = iArr10;
                                                                    jArr4 = jArr4;
                                                                    iArr3 = iArr3;
                                                                    iArr9 = iArr15;
                                                                    jArr19 = jArr19;
                                                                    iArr12 = iArr5;
                                                                    jArr18 = jArr7;
                                                                }
                                                                ka2Var = new ka2(ha2Var4, jArr19, iArr13, i92, jArr20, iArr14, it5.m19392g0(j18, 1000000L, ha2Var4.f12290d));
                                                            }
                                                            ka2Var = ka2Var2;
                                                        }
                                                    }
                                                    long[] jArr23 = new long[zzb];
                                                    iArr = new int[zzb];
                                                    long[] jArr24 = new long[zzb];
                                                    i28 = i26;
                                                    int[] iArr19 = new int[zzb];
                                                    int i98 = m19700v2;
                                                    int i99 = m19700v3;
                                                    int i100 = i25;
                                                    int i101 = i27;
                                                    int i102 = 0;
                                                    int i103 = 0;
                                                    i29 = 0;
                                                    int i104 = 0;
                                                    j8 = 0;
                                                    long j20 = 0;
                                                    int i105 = m19700v;
                                                    i30 = 0;
                                                    while (true) {
                                                        if (i30 < zzb) {
                                                            break;
                                                        }
                                                        j10 = j8;
                                                        boolean z13 = true;
                                                        while (true) {
                                                            if (i29 != 0) {
                                                                i38 = zzb;
                                                                ik5Var2 = ik5Var9;
                                                                ik5Var3 = ik5Var10;
                                                                i39 = i29;
                                                                break;
                                                            }
                                                            z13 = d92Var.m24593a();
                                                            if (!z13) {
                                                                i38 = zzb;
                                                                ik5Var2 = ik5Var9;
                                                                ik5Var3 = ik5Var10;
                                                                i39 = 0;
                                                                break;
                                                            }
                                                            ik5 ik5Var12 = ik5Var9;
                                                            long j21 = d92Var.f6641d;
                                                            i29 = d92Var.f6640c;
                                                            j10 = j21;
                                                            ik5Var9 = ik5Var12;
                                                            ik5Var10 = ik5Var10;
                                                            zzb = zzb;
                                                        }
                                                        if (!z13) {
                                                            s95.m10493e(str, "Unexpected end of chunk data");
                                                            jArr23 = Arrays.copyOf(jArr23, i30);
                                                            iArr = Arrays.copyOf(iArr, i30);
                                                            jArr24 = Arrays.copyOf(jArr24, i30);
                                                            iArr19 = Arrays.copyOf(iArr19, i30);
                                                            zzb = i30;
                                                            break;
                                                        }
                                                        if (ik5Var11 != null) {
                                                            while (true) {
                                                                if (i104 != 0) {
                                                                    break;
                                                                }
                                                                if (i100 <= 0) {
                                                                    i104 = 0;
                                                                    break;
                                                                }
                                                                i104 = ik5Var11.m19700v();
                                                                i103 = ik5Var11.m19709m();
                                                                i100--;
                                                            }
                                                            i104--;
                                                        }
                                                        jArr23[i30] = j10;
                                                        int zzc = p92Var.zzc();
                                                        iArr[i30] = zzc;
                                                        if (zzc > i102) {
                                                            i102 = zzc;
                                                        }
                                                        jArr24[i30] = j20 + i103;
                                                        iArr19[i30] = ik5Var3 == null ? 1 : 0;
                                                        if (i30 == i101) {
                                                            iArr19[i30] = 1;
                                                            i28--;
                                                            if (i28 > 0) {
                                                                Objects.requireNonNull(ik5Var3);
                                                                i101 = ik5Var3.m19700v() - 1;
                                                            }
                                                        }
                                                        j20 += i99;
                                                        int i106 = i98 - 1;
                                                        if (i106 != 0) {
                                                            i98 = i106;
                                                        } else if (i105 > 0) {
                                                            i105--;
                                                            i98 = ik5Var2.m19700v();
                                                            i99 = ik5Var2.m19709m();
                                                        } else {
                                                            i98 = 0;
                                                        }
                                                        long j22 = j10 + iArr[i30];
                                                        i29 = i39 - 1;
                                                        i30++;
                                                        zzb = i38;
                                                        ik5Var9 = ik5Var2;
                                                        j8 = j22;
                                                        ik5Var10 = ik5Var3;
                                                    }
                                                    long j23 = j20 + i103;
                                                    if (ik5Var11 != null) {
                                                        while (i100 > 0) {
                                                            if (ik5Var11.m19700v() != 0) {
                                                                z6 = false;
                                                                break;
                                                            }
                                                            ik5Var11.m19709m();
                                                            i100--;
                                                        }
                                                    }
                                                    z6 = true;
                                                    if (i28 == 0) {
                                                        i31 = i105;
                                                        i32 = i28;
                                                        i33 = i98;
                                                        i34 = i29;
                                                        ha2Var3 = ha2Var2;
                                                        i35 = i104;
                                                    } else if (i98 != 0) {
                                                        i31 = i105;
                                                        i33 = i98;
                                                        i34 = i29;
                                                        ha2Var3 = ha2Var2;
                                                        i35 = i104;
                                                        i32 = 0;
                                                    } else if (i29 != 0) {
                                                        i31 = i105;
                                                        i34 = i29;
                                                        ha2Var3 = ha2Var2;
                                                        i35 = i104;
                                                        i32 = 0;
                                                        i33 = 0;
                                                    } else if (i105 == 0) {
                                                        jArr3 = jArr23;
                                                        if (i104 != 0) {
                                                            ha2Var3 = ha2Var2;
                                                            i35 = i104;
                                                            i32 = 0;
                                                            i33 = 0;
                                                            i34 = 0;
                                                            i31 = 0;
                                                        } else if (z6) {
                                                            iArr2 = iArr;
                                                            i36 = zzb;
                                                            ha2Var3 = ha2Var2;
                                                            jArr4 = jArr24;
                                                            iArr3 = iArr19;
                                                            i37 = i102;
                                                            j9 = j23;
                                                            jArr5 = jArr3;
                                                            iArr4 = iArr2;
                                                            zzb = i36;
                                                            long m19392g022 = it5.m19392g0(j9, 1000000L, ha2Var3.f12289c);
                                                            jArr6 = ha2Var3.f12294h;
                                                            if (jArr6 == null) {
                                                            }
                                                            ka2Var = ka2Var2;
                                                        } else {
                                                            ha2Var3 = ha2Var2;
                                                            z6 = false;
                                                            i32 = 0;
                                                            i33 = 0;
                                                            i34 = 0;
                                                            i31 = 0;
                                                            i35 = 0;
                                                        }
                                                        int i107 = ha2Var3.f12287a;
                                                        iArr2 = iArr;
                                                        String str14 = true != z6 ? ", ctts invalid" : "";
                                                        StringBuilder sb = new StringBuilder();
                                                        i36 = zzb;
                                                        sb.append("Inconsistent stbl box for track ");
                                                        sb.append(i107);
                                                        sb.append(": remainingSynchronizationSamples ");
                                                        sb.append(i32);
                                                        sb.append(", remainingSamplesAtTimestampDelta ");
                                                        sb.append(i33);
                                                        sb.append(", remainingSamplesInChunk ");
                                                        sb.append(i34);
                                                        sb.append(", remainingTimestampDeltaChanges ");
                                                        sb.append(i31);
                                                        sb.append(", remainingSamplesAtTimestampOffset ");
                                                        sb.append(i35);
                                                        sb.append(str14);
                                                        s95.m10493e(str, sb.toString());
                                                        jArr4 = jArr24;
                                                        iArr3 = iArr19;
                                                        i37 = i102;
                                                        j9 = j23;
                                                        jArr5 = jArr3;
                                                        iArr4 = iArr2;
                                                        zzb = i36;
                                                        long m19392g0222 = it5.m19392g0(j9, 1000000L, ha2Var3.f12289c);
                                                        jArr6 = ha2Var3.f12294h;
                                                        if (jArr6 == null) {
                                                        }
                                                        ka2Var = ka2Var2;
                                                    } else {
                                                        i31 = i105;
                                                        ha2Var3 = ha2Var2;
                                                        i35 = i104;
                                                        i32 = 0;
                                                        i33 = 0;
                                                        i34 = 0;
                                                    }
                                                    jArr3 = jArr23;
                                                    int i1072 = ha2Var3.f12287a;
                                                    iArr2 = iArr;
                                                    if (true != z6) {
                                                    }
                                                    StringBuilder sb2 = new StringBuilder();
                                                    i36 = zzb;
                                                    sb2.append("Inconsistent stbl box for track ");
                                                    sb2.append(i1072);
                                                    sb2.append(": remainingSynchronizationSamples ");
                                                    sb2.append(i32);
                                                    sb2.append(", remainingSamplesAtTimestampDelta ");
                                                    sb2.append(i33);
                                                    sb2.append(", remainingSamplesInChunk ");
                                                    sb2.append(i34);
                                                    sb2.append(", remainingTimestampDeltaChanges ");
                                                    sb2.append(i31);
                                                    sb2.append(", remainingSamplesAtTimestampOffset ");
                                                    sb2.append(i35);
                                                    sb2.append(str14);
                                                    s95.m10493e(str, sb2.toString());
                                                    jArr4 = jArr24;
                                                    iArr3 = iArr19;
                                                    i37 = i102;
                                                    j9 = j23;
                                                    jArr5 = jArr3;
                                                    iArr4 = iArr2;
                                                    zzb = i36;
                                                    long m19392g02222 = it5.m19392g0(j9, 1000000L, ha2Var3.f12289c);
                                                    jArr6 = ha2Var3.f12294h;
                                                    if (jArr6 == null) {
                                                    }
                                                    ka2Var = ka2Var2;
                                                } else {
                                                    ik5Var10 = null;
                                                }
                                            } else {
                                                i26 = 0;
                                            }
                                            i27 = -1;
                                            zza = p92Var.zza();
                                            String str132 = ha2Var2.f12292f.f9275l;
                                            if (zza != i47) {
                                                if (i25 == 0) {
                                                }
                                                m19700v = 0;
                                            }
                                            long[] jArr232 = new long[zzb];
                                            iArr = new int[zzb];
                                            long[] jArr242 = new long[zzb];
                                            i28 = i26;
                                            int[] iArr192 = new int[zzb];
                                            int i982 = m19700v2;
                                            int i992 = m19700v3;
                                            int i1002 = i25;
                                            int i1012 = i27;
                                            int i1022 = 0;
                                            int i1032 = 0;
                                            i29 = 0;
                                            int i1042 = 0;
                                            j8 = 0;
                                            long j202 = 0;
                                            int i1052 = m19700v;
                                            i30 = 0;
                                            while (true) {
                                                if (i30 < zzb) {
                                                }
                                                long j222 = j10 + iArr[i30];
                                                i29 = i39 - 1;
                                                i30++;
                                                zzb = i38;
                                                ik5Var9 = ik5Var2;
                                                j8 = j222;
                                                ik5Var10 = ik5Var3;
                                            }
                                            long j232 = j202 + i1032;
                                            if (ik5Var11 != null) {
                                            }
                                            z6 = true;
                                            if (i28 == 0) {
                                            }
                                            jArr3 = jArr232;
                                            int i10722 = ha2Var3.f12287a;
                                            iArr2 = iArr;
                                            if (true != z6) {
                                            }
                                            StringBuilder sb22 = new StringBuilder();
                                            i36 = zzb;
                                            sb22.append("Inconsistent stbl box for track ");
                                            sb22.append(i10722);
                                            sb22.append(": remainingSynchronizationSamples ");
                                            sb22.append(i32);
                                            sb22.append(", remainingSamplesAtTimestampDelta ");
                                            sb22.append(i33);
                                            sb22.append(", remainingSamplesInChunk ");
                                            sb22.append(i34);
                                            sb22.append(", remainingTimestampDeltaChanges ");
                                            sb22.append(i31);
                                            sb22.append(", remainingSamplesAtTimestampOffset ");
                                            sb22.append(i35);
                                            sb22.append(str14);
                                            s95.m10493e(str, sb22.toString());
                                            jArr4 = jArr242;
                                            iArr3 = iArr192;
                                            i37 = i1022;
                                            j9 = j232;
                                            jArr5 = jArr3;
                                            iArr4 = iArr2;
                                            zzb = i36;
                                            long m19392g022222 = it5.m19392g0(j9, 1000000L, ha2Var3.f12289c);
                                            jArr6 = ha2Var3.f12294h;
                                            if (jArr6 == null) {
                                            }
                                            ka2Var = ka2Var2;
                                        }
                                        arrayList2 = arrayList;
                                        arrayList2.add(ka2Var);
                                    } else {
                                        arrayList2 = arrayList;
                                    }
                                }
                            } else {
                                m19709m4 = 65536;
                                m19709m5 = -65536;
                            }
                        }
                        m19709m3 = 0;
                    }
                    if (m19709m3 == 0) {
                        if (m19709m4 == -65536) {
                            if (m19709m5 != 65536) {
                                i50 = m19709m5;
                            } else if (m19709m6 == 0) {
                                i2 = 270;
                                q92 q92Var22 = new q92(m19709m2, j2, i2);
                                if (j == -9223372036854775807L) {
                                }
                                ik5 ik5Var52 = m27556d.f4558b;
                                ik5Var52.m19716f(8);
                                ik5Var52.m19715g(c92.m25488a(ik5Var52.m19709m()) == 0 ? 8 : 16);
                                long m19729A4 = ik5Var52.m19729A();
                                if (j3 != -9223372036854775807L) {
                                }
                                a92 m27557c32 = m27557c2.m27557c(1835626086);
                                Objects.requireNonNull(m27557c32);
                                a92 m27557c42 = m27557c32.m27557c(1937007212);
                                Objects.requireNonNull(m27557c42);
                                b92 m27556d42 = m27557c2.m27556d(1835296868);
                                Objects.requireNonNull(m27556d42);
                                Pair m11557i2 = m11557i(m27556d42.f4558b);
                                b92 m27556d52 = m27557c42.m27556d(1937011556);
                                Objects.requireNonNull(m27556d52);
                                ik5 ik5Var62 = m27556d52.f4558b;
                                i3 = q92Var22.f23782a;
                                i4 = q92Var22.f23784c;
                                String str102 = (String) m11557i2.second;
                                ik5Var62.m19716f(12);
                                m19709m = ik5Var62.m19709m();
                                n92 n92Var62 = new n92(m19709m);
                                i5 = 0;
                                while (i5 < m19709m) {
                                }
                                n92Var = n92Var62;
                                int i682 = m11561e;
                                arrayList = arrayList3;
                                q92 q92Var32 = q92Var22;
                                Pair pair22 = m11557i2;
                                str = str9;
                                i47 = -1;
                                a92Var2 = a92Var5;
                                m27557c = a92Var2.m27557c(1701082227);
                                if (m27557c != null) {
                                }
                                jArr = null;
                                jArr2 = null;
                                if (n92Var.f19738b == null) {
                                }
                            }
                            m19709m4 = -65536;
                        } else {
                            i50 = m19709m5;
                        }
                        m19709m3 = 0;
                    } else {
                        i50 = m19709m5;
                    }
                    i2 = (m19709m3 == -65536 && m19709m4 == 0 && i50 == 0 && m19709m6 == -65536) ? 180 : 0;
                    q92 q92Var222 = new q92(m19709m2, j2, i2);
                    if (j == -9223372036854775807L) {
                    }
                    ik5 ik5Var522 = m27556d.f4558b;
                    ik5Var522.m19716f(8);
                    ik5Var522.m19715g(c92.m25488a(ik5Var522.m19709m()) == 0 ? 8 : 16);
                    long m19729A42 = ik5Var522.m19729A();
                    if (j3 != -9223372036854775807L) {
                    }
                    a92 m27557c322 = m27557c2.m27557c(1835626086);
                    Objects.requireNonNull(m27557c322);
                    a92 m27557c422 = m27557c322.m27557c(1937007212);
                    Objects.requireNonNull(m27557c422);
                    b92 m27556d422 = m27557c2.m27556d(1835296868);
                    Objects.requireNonNull(m27556d422);
                    Pair m11557i22 = m11557i(m27556d422.f4558b);
                    b92 m27556d522 = m27557c422.m27556d(1937011556);
                    Objects.requireNonNull(m27556d522);
                    ik5 ik5Var622 = m27556d522.f4558b;
                    i3 = q92Var222.f23782a;
                    i4 = q92Var222.f23784c;
                    String str1022 = (String) m11557i22.second;
                    ik5Var622.m19716f(12);
                    m19709m = ik5Var622.m19709m();
                    n92 n92Var622 = new n92(m19709m);
                    i5 = 0;
                    while (i5 < m19709m) {
                    }
                    n92Var = n92Var622;
                    int i6822 = m11561e;
                    arrayList = arrayList3;
                    q92 q92Var322 = q92Var222;
                    Pair pair222 = m11557i22;
                    str = str9;
                    i47 = -1;
                    a92Var2 = a92Var5;
                    m27557c = a92Var2.m27557c(1701082227);
                    if (m27557c != null) {
                    }
                    jArr = null;
                    jArr2 = null;
                    if (n92Var.f19738b == null) {
                    }
                }
                ha2Var = null;
                ha2Var2 = (ha2) ey6Var2.apply(ha2Var);
                if (ha2Var2 == null) {
                }
            }
            i46 = i + 1;
            zzxVar3 = zzxVar;
            arrayList3 = arrayList2;
            a92Var4 = a92Var;
        }
        return arrayList3;
    }

    /* renamed from: d */
    public static void m11562d(ik5 ik5Var) {
        int m19711k = ik5Var.m19711k();
        ik5Var.m19715g(4);
        if (ik5Var.m19709m() != 1751411826) {
            m19711k += 4;
        }
        ik5Var.m19716f(m19711k);
    }

    /* renamed from: e */
    public static int m11561e(int i) {
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

    /* renamed from: f */
    public static int m11560f(ik5 ik5Var) {
        int m19703s = ik5Var.m19703s();
        int i = m19703s & 127;
        while ((m19703s & 128) == 128) {
            m19703s = ik5Var.m19703s();
            i = (i << 7) | (m19703s & 127);
        }
        return i;
    }

    /* renamed from: g */
    public static int m11559g(ik5 ik5Var) {
        ik5Var.m19716f(16);
        return ik5Var.m19709m();
    }

    /* renamed from: h */
    public static Pair m11558h(a92 a92Var) {
        b92 m27556d = a92Var.m27556d(1701606260);
        if (m27556d == null) {
            return null;
        }
        ik5 ik5Var = m27556d.f4558b;
        ik5Var.m19716f(8);
        int m25488a = c92.m25488a(ik5Var.m19709m());
        int m19700v = ik5Var.m19700v();
        long[] jArr = new long[m19700v];
        long[] jArr2 = new long[m19700v];
        for (int i = 0; i < m19700v; i++) {
            jArr[i] = m25488a == 1 ? ik5Var.m19728B() : ik5Var.m19729A();
            jArr2[i] = m25488a == 1 ? ik5Var.m19696z() : ik5Var.m19709m();
            if (ik5Var.m19723G() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            ik5Var.m19715g(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: i */
    public static Pair m11557i(ik5 ik5Var) {
        ik5Var.m19716f(8);
        int m25488a = c92.m25488a(ik5Var.m19709m());
        ik5Var.m19715g(m25488a == 0 ? 8 : 16);
        long m19729A = ik5Var.m19729A();
        ik5Var.m19715g(m25488a == 0 ? 4 : 8);
        int m19699w = ik5Var.m19699w();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((m19699w >> 10) & 31) + 96));
        sb.append((char) (((m19699w >> 5) & 31) + 96));
        sb.append((char) ((m19699w & 31) + 96));
        return Pair.create(Long.valueOf(m19729A), sb.toString());
    }

    /* renamed from: j */
    public static Pair m11556j(ik5 ik5Var, int i, int i2) {
        Integer num;
        ia2 ia2Var;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int m19711k = ik5Var.m19711k();
        while (m19711k - i < i2) {
            ik5Var.m19716f(m19711k);
            int m19709m = ik5Var.m19709m();
            n09.m15609b(m19709m > 0, "childAtomSize must be positive");
            if (ik5Var.m19709m() == 1936289382) {
                int i5 = m19711k + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - m19711k < m19709m) {
                    ik5Var.m19716f(i5);
                    int m19709m2 = ik5Var.m19709m();
                    int m19709m3 = ik5Var.m19709m();
                    if (m19709m3 == 1718775137) {
                        num2 = Integer.valueOf(ik5Var.m19709m());
                    } else if (m19709m3 == 1935894637) {
                        ik5Var.m19715g(4);
                        str = ik5Var.m19724F(4, cy6.f6275c);
                    } else if (m19709m3 == 1935894633) {
                        i6 = i5;
                        i7 = m19709m2;
                    }
                    i5 += m19709m2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    n09.m15609b(num2 != null, "frma atom is mandatory");
                    n09.m15609b(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            ia2Var = null;
                            break;
                        }
                        ik5Var.m19716f(i8);
                        int m19709m4 = ik5Var.m19709m();
                        if (ik5Var.m19709m() == 1952804451) {
                            int m19709m5 = ik5Var.m19709m();
                            ik5Var.m19715g(1);
                            if (c92.m25488a(m19709m5) == 0) {
                                ik5Var.m19715g(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int m19703s = ik5Var.m19703s();
                                i3 = m19703s & 15;
                                i4 = (m19703s & 240) >> 4;
                            }
                            boolean z = ik5Var.m19703s() == 1;
                            int m19703s2 = ik5Var.m19703s();
                            byte[] bArr2 = new byte[16];
                            ik5Var.m19720b(bArr2, 0, 16);
                            if (z && m19703s2 == 0) {
                                int m19703s3 = ik5Var.m19703s();
                                byte[] bArr3 = new byte[m19703s3];
                                ik5Var.m19720b(bArr3, 0, m19703s3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            ia2Var = new ia2(z, str, m19703s2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += m19709m4;
                        }
                    }
                    n09.m15609b(ia2Var != null, "tenc atom is mandatory");
                    int i9 = it5.f13991a;
                    create = Pair.create(num, ia2Var);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            m19711k += m19709m;
        }
        return null;
    }

    /* renamed from: k */
    public static l92 m11555k(ik5 ik5Var, int i) {
        ik5Var.m19716f(i + 12);
        ik5Var.m19715g(1);
        m11560f(ik5Var);
        ik5Var.m19715g(2);
        int m19703s = ik5Var.m19703s();
        if ((m19703s & 128) != 0) {
            ik5Var.m19715g(2);
        }
        if ((m19703s & 64) != 0) {
            ik5Var.m19715g(ik5Var.m19703s());
        }
        if ((m19703s & 32) != 0) {
            ik5Var.m19715g(2);
        }
        ik5Var.m19715g(1);
        m11560f(ik5Var);
        String m27386d = ak3.m27386d(ik5Var.m19703s());
        if ("audio/mpeg".equals(m27386d) || "audio/vnd.dts".equals(m27386d) || "audio/vnd.dts.hd".equals(m27386d)) {
            return new l92(m27386d, null, -1L, -1L);
        }
        ik5Var.m19715g(4);
        long m19729A = ik5Var.m19729A();
        long m19729A2 = ik5Var.m19729A();
        ik5Var.m19715g(1);
        int m11560f = m11560f(ik5Var);
        byte[] bArr = new byte[m11560f];
        ik5Var.m19720b(bArr, 0, m11560f);
        return new l92(m27386d, bArr, m19729A2 <= 0 ? -1L : m19729A2, m19729A > 0 ? m19729A : -1L);
    }

    /* renamed from: l */
    public static ByteBuffer m11554l() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016b  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m11553m(ik5 ik5Var, int i, int i2, int i3, int i4, String str, boolean z, zzx zzxVar, n92 n92Var, int i5) {
        int i6;
        int m19702t;
        int m19709m;
        int i7;
        int i8;
        long j;
        long j2;
        int i9;
        int i10;
        int i11;
        byte[] bArr;
        f92 m26366y;
        String str2;
        boolean z2;
        int i12 = i2;
        int i13 = i3;
        zzx zzxVar2 = zzxVar;
        ik5Var.m19716f(i12 + 16);
        if (z) {
            i6 = ik5Var.m19699w();
            ik5Var.m19715g(6);
        } else {
            ik5Var.m19715g(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int m19699w = ik5Var.m19699w();
            ik5Var.m19715g(6);
            m19702t = ik5Var.m19702t();
            ik5Var.m19716f(ik5Var.m19711k() - 4);
            m19709m = ik5Var.m19709m();
            if (i6 == 1) {
                ik5Var.m19715g(16);
            }
            i7 = m19699w;
        } else if (i6 != 2) {
            return;
        } else {
            ik5Var.m19715g(16);
            m19702t = (int) Math.round(Double.longBitsToDouble(ik5Var.m19696z()));
            i7 = ik5Var.m19700v();
            ik5Var.m19715g(20);
            m19709m = 0;
        }
        int m19711k = ik5Var.m19711k();
        int i14 = 1701733217;
        int i15 = i;
        if (i15 == 1701733217) {
            Pair m11556j = m11556j(ik5Var, i12, i13);
            if (m11556j != null) {
                i14 = ((Integer) m11556j.first).intValue();
                zzxVar2 = zzxVar2 == null ? null : zzxVar2.m1089b(((ia2) m11556j.second).f13393b);
                n92Var.f19737a[i5] = (ia2) m11556j.second;
            }
            ik5Var.m19716f(m19711k);
            i15 = i14;
        }
        String str3 = "audio/raw";
        if (i15 == 1633889587) {
            str3 = "audio/ac3";
        } else if (i15 == 1700998451) {
            str3 = "audio/eac3";
        } else if (i15 == 1633889588) {
            str3 = "audio/ac4";
        } else if (i15 == 1685353315) {
            str3 = "audio/vnd.dts";
        } else if (i15 == 1685353320 || i15 == 1685353324) {
            str3 = "audio/vnd.dts.hd";
        } else if (i15 == 1685353317) {
            str3 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i15 == 1685353336) {
            str3 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i15 == 1935764850) {
            str3 = "audio/3gpp";
        } else if (i15 != 1935767394) {
            if (i15 == 1819304813 || i15 == 1936684916) {
                i8 = 2;
            } else if (i15 == 1953984371) {
                i8 = 268435456;
            } else if (i15 == 778924082 || i15 == 778924083) {
                str3 = "audio/mpeg";
            } else if (i15 == 1835557169) {
                str3 = "audio/mha1";
            } else if (i15 == 1835560241) {
                str3 = "audio/mhm1";
            } else if (i15 == 1634492771) {
                str3 = "audio/alac";
            } else if (i15 == 1634492791) {
                str3 = "audio/g711-alaw";
            } else if (i15 == 1970037111) {
                str3 = "audio/g711-mlaw";
            } else if (i15 == 1332770163) {
                str3 = "audio/opus";
            } else if (i15 == 1716281667) {
                str3 = "audio/flac";
            } else if (i15 == 1835823201) {
                str3 = "audio/true-hd";
            } else {
                i8 = -1;
                str3 = null;
            }
            String str4 = str3;
            l92 l92Var = null;
            String str5 = null;
            List list = null;
            while (m19711k - i12 < i13) {
                ik5Var.m19716f(m19711k);
                int m19709m2 = ik5Var.m19709m();
                String str6 = "childAtomSize must be positive";
                n09.m15609b(m19709m2 > 0, "childAtomSize must be positive");
                int m19709m3 = ik5Var.m19709m();
                if (m19709m3 == 1835557187) {
                    int i16 = m19709m2 - 13;
                    byte[] bArr2 = new byte[i16];
                    ik5Var.m19716f(m19711k + 13);
                    ik5Var.m19720b(bArr2, 0, i16);
                    list = y17.m4259v(bArr2);
                    i9 = i8;
                } else {
                    if (m19709m3 == 1702061171) {
                        i9 = i8;
                        i10 = m19711k;
                        i11 = -1;
                    } else if (z && m19709m3 == 2002876005) {
                        int m19711k2 = ik5Var.m19711k();
                        if (m19711k2 >= m19711k) {
                            str2 = null;
                            z2 = true;
                        } else {
                            str2 = null;
                            z2 = false;
                        }
                        n09.m15609b(z2, str2);
                        i10 = m19711k2;
                        while (true) {
                            if (i10 - m19711k >= m19709m2) {
                                i9 = i8;
                                i11 = -1;
                                i10 = -1;
                                break;
                            }
                            ik5Var.m19716f(i10);
                            int m19709m4 = ik5Var.m19709m();
                            i9 = i8;
                            n09.m15609b(m19709m4 > 0, str6);
                            String str7 = str6;
                            if (ik5Var.m19709m() == 1702061171) {
                                i11 = -1;
                                break;
                            }
                            i10 += m19709m4;
                            i8 = i9;
                            str6 = str7;
                        }
                    } else {
                        i9 = i8;
                        if (m19709m3 == 1684103987) {
                            ik5Var.m19716f(m19711k + 8);
                            m26366y = cz8.m24852c(ik5Var, Integer.toString(i4), str, zzxVar2);
                        } else if (m19709m3 == 1684366131) {
                            ik5Var.m19716f(m19711k + 8);
                            m26366y = cz8.m24851d(ik5Var, Integer.toString(i4), str, zzxVar2);
                        } else if (m19709m3 == 1684103988) {
                            ik5Var.m19716f(m19711k + 8);
                            String num = Integer.toString(i4);
                            int i17 = fz8.f10118b;
                            ik5Var.m19715g(1);
                            int i18 = 1 != ((ik5Var.m19703s() & 32) >> 5) ? 44100 : 48000;
                            b72 b72Var = new b72();
                            b72Var.m26384h(num);
                            b72Var.m26372s("audio/ac4");
                            b72Var.m26389e0(2);
                            b72Var.m26371t(i18);
                            b72Var.m26396b(zzxVar2);
                            b72Var.m26380k(str);
                            m26366y = b72Var.m26366y();
                        } else if (m19709m3 == 1684892784) {
                            if (m19709m <= 0) {
                                throw dl3.m24267a("Invalid sample rate for Dolby TrueHD MLP stream: " + m19709m, null);
                            }
                            m19702t = m19709m;
                            i7 = 2;
                        } else if (m19709m3 == 1684305011) {
                            b72 b72Var2 = new b72();
                            b72Var2.m26386g(i4);
                            b72Var2.m26372s(str4);
                            b72Var2.m26389e0(i7);
                            b72Var2.m26371t(m19702t);
                            b72Var2.m26396b(zzxVar2);
                            b72Var2.m26380k(str);
                            n92Var.f19738b = b72Var2.m26366y();
                        } else if (m19709m3 == 1682927731) {
                            int i19 = m19709m2 - 8;
                            byte[] bArr3 = f24985a;
                            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i19);
                            ik5Var.m19716f(m19711k + 8);
                            ik5Var.m19720b(copyOf, bArr3.length, i19);
                            list = d42.m24647a(copyOf);
                        } else {
                            if (m19709m3 == 1684425825) {
                                int i20 = m19709m2 - 12;
                                byte[] bArr4 = new byte[i20 + 4];
                                bArr4[0] = 102;
                                bArr4[1] = 76;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                ik5Var.m19716f(m19711k + 12);
                                ik5Var.m19720b(bArr4, 4, i20);
                                list = y17.m4259v(bArr4);
                            } else if (m19709m3 == 1634492771) {
                                int i21 = m19709m2 - 12;
                                byte[] bArr5 = new byte[i21];
                                ik5Var.m19716f(m19711k + 12);
                                ik5Var.m19720b(bArr5, 0, i21);
                                ik5 ik5Var2 = new ik5(bArr5);
                                ik5Var2.m19716f(9);
                                int m19703s = ik5Var2.m19703s();
                                ik5Var2.m19716f(20);
                                Pair create = Pair.create(Integer.valueOf(ik5Var2.m19700v()), Integer.valueOf(m19703s));
                                int intValue = ((Integer) create.first).intValue();
                                int intValue2 = ((Integer) create.second).intValue();
                                list = y17.m4259v(bArr5);
                                m19702t = intValue;
                                i7 = intValue2;
                                m19711k += m19709m2;
                                i12 = i2;
                                i13 = i3;
                                i8 = i9;
                            }
                            m19711k += m19709m2;
                            i12 = i2;
                            i13 = i3;
                            i8 = i9;
                        }
                        n92Var.f19738b = m26366y;
                    }
                    if (i10 != i11) {
                        l92 m11555k = m11555k(ik5Var, i10);
                        str4 = m11555k.f17151a;
                        bArr = m11555k.f17152b;
                        if (bArr != null) {
                            if ("audio/mp4a-latm".equals(str4)) {
                                yy8 m1766a = zy8.m1766a(bArr);
                                m19702t = m1766a.f34266a;
                                i7 = m1766a.f34267b;
                                str5 = m1766a.f34268c;
                            }
                            list = y17.m4259v(bArr);
                        }
                        l92Var = m11555k;
                    }
                    m19711k += m19709m2;
                    i12 = i2;
                    i13 = i3;
                    i8 = i9;
                }
                m19711k += m19709m2;
                i12 = i2;
                i13 = i3;
                i8 = i9;
            }
            int i22 = i8;
            if (n92Var.f19738b == null || str4 == null) {
            }
            b72 b72Var3 = new b72();
            b72Var3.m26386g(i4);
            b72Var3.m26372s(str4);
            b72Var3.m26387f0(str5);
            b72Var3.m26389e0(i7);
            b72Var3.m26371t(m19702t);
            b72Var3.m26377n(i22);
            b72Var3.m26382i(list);
            b72Var3.m26396b(zzxVar2);
            b72Var3.m26380k(str);
            if (l92Var != null) {
                j = l92Var.f17153c;
                b72Var3.m26391d0(i47.m20124c(j));
                j2 = l92Var.f17154d;
                b72Var3.m26376o(i47.m20124c(j2));
            }
            n92Var.f19738b = b72Var3.m26366y();
            return;
        } else {
            str3 = "audio/amr-wb";
        }
        i8 = -1;
        String str42 = str3;
        l92 l92Var2 = null;
        String str52 = null;
        List list2 = null;
        while (m19711k - i12 < i13) {
        }
        int i222 = i8;
        if (n92Var.f19738b == null) {
        }
    }

    /* renamed from: n */
    public static void m11552n(ik5 ik5Var, int i, int i2, int i3, n92 n92Var) {
        ik5Var.m19716f(i2 + 16);
        ik5Var.m19726D((char) 0);
        String m19726D = ik5Var.m19726D((char) 0);
        if (m19726D != null) {
            b72 b72Var = new b72();
            b72Var.m26386g(i3);
            b72Var.m26372s(m19726D);
            n92Var.f19738b = b72Var.m26366y();
        }
    }

    /* renamed from: o */
    public static boolean m11551o(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        return jArr[0] <= j2 && j2 < jArr[it5.m19416P(4, 0, i)] && jArr[it5.m19416P(length + (-4), 0, i)] < j3 && j3 <= j;
    }
}
