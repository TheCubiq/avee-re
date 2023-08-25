package com.daaw;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ut2 {

    /* renamed from: a */
    public static final int f29518a = pz2.m12843g("vide");

    /* renamed from: b */
    public static final int f29519b = pz2.m12843g("soun");

    /* renamed from: c */
    public static final int f29520c = pz2.m12843g("text");

    /* renamed from: d */
    public static final int f29521d = pz2.m12843g("sbtl");

    /* renamed from: e */
    public static final int f29522e = pz2.m12843g("subt");

    /* renamed from: f */
    public static final int f29523f = pz2.m12843g("clcp");

    /* renamed from: g */
    public static final int f29524g = pz2.m12843g("cenc");

    /* renamed from: h */
    public static final int f29525h = pz2.m12843g("meta");

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
        if (r12 == 0) goto L415;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0821 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c1  */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.List] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fu2 m7721a(lt2 lt2Var, mt2 mt2Var, long j, zzavc zzavcVar, boolean z) {
        long j2;
        int i;
        mt2 mt2Var2;
        long j3;
        int i2;
        int i3;
        int m19242e;
        int i4;
        qt2 qt2Var;
        lt2 m16570d;
        fu2 fu2Var;
        Pair create;
        int i5;
        mt2 m16569e;
        int i6;
        String str;
        iz2 iz2Var;
        Pair pair;
        tt2 tt2Var;
        int i7;
        int i8;
        int i9;
        qt2 qt2Var2;
        int i10;
        int i11;
        boolean z2;
        byte[] bArr;
        String str2;
        int i12;
        int i13;
        int i14;
        int i15;
        int m19244c;
        int i16;
        int i17;
        int i18;
        int i19;
        qt2 qt2Var3;
        int i20;
        int i21;
        String str3;
        int i22;
        String str4;
        qt2 qt2Var4;
        int m19244c2;
        String str5;
        int i23;
        String str6;
        zzatd m14880c;
        String str7;
        Object obj;
        long j4;
        zzavc zzavcVar2 = zzavcVar;
        lt2 m16570d2 = lt2Var.m16570d(nt2.f20641F);
        iz2 iz2Var2 = m16570d2.m16569e(nt2.f20665T).f19141P0;
        iz2Var2.m19225v(16);
        int m19242e2 = iz2Var2.m19242e();
        int i24 = -1;
        int i25 = m19242e2 == f29519b ? 1 : m19242e2 == f29518a ? 2 : (m19242e2 == f29520c || m19242e2 == f29521d || m19242e2 == f29522e || m19242e2 == f29523f) ? 3 : m19242e2 == f29525h ? 4 : -1;
        String str8 = null;
        if (i25 == -1) {
            return null;
        }
        iz2 iz2Var3 = lt2Var.m16569e(nt2.f20661P).f19141P0;
        iz2Var3.m19225v(8);
        int m14828b = nt2.m14828b(iz2Var3.m19242e());
        iz2Var3.m19224w(m14828b == 0 ? 8 : 16);
        int m19242e3 = iz2Var3.m19242e();
        iz2Var3.m19224w(4);
        int m19244c3 = iz2Var3.m19244c();
        int i26 = m14828b == 0 ? 4 : 8;
        int i27 = 0;
        while (true) {
            if (i27 >= i26) {
                iz2Var3.m19224w(i26);
                break;
            } else if (iz2Var3.f14125a[m19244c3 + i27] != -1) {
                j2 = m14828b == 0 ? iz2Var3.m19234m() : iz2Var3.m19233n();
            } else {
                i27++;
            }
        }
        j2 = -9223372036854775807L;
        iz2Var3.m19224w(16);
        int m19242e4 = iz2Var3.m19242e();
        int m19242e5 = iz2Var3.m19242e();
        iz2Var3.m19224w(4);
        int m19242e6 = iz2Var3.m19242e();
        int m19242e7 = iz2Var3.m19242e();
        int i28 = 65536;
        if (m19242e4 == 0) {
            if (m19242e5 != 65536) {
                m19242e4 = 0;
            } else if (m19242e6 != -65536) {
                m19242e4 = 0;
                m19242e5 = 65536;
            } else if (m19242e7 == 0) {
                i = 90;
                tt2 tt2Var2 = new tt2(m19242e3, j2, i);
                if (j == -9223372036854775807L) {
                    j4 = tt2Var2.f28060b;
                    j3 = j4;
                    mt2Var2 = mt2Var;
                } else {
                    mt2Var2 = mt2Var;
                    j3 = j;
                }
                iz2 iz2Var4 = mt2Var2.f19141P0;
                iz2Var4.m19225v(8);
                iz2Var4.m19224w(nt2.m14828b(iz2Var4.m19242e()) == 0 ? 8 : 16);
                long m19234m = iz2Var4.m19234m();
                long m12840j = j3 == -9223372036854775807L ? -9223372036854775807L : pz2.m12840j(j3, 1000000L, m19234m);
                lt2 m16570d3 = m16570d2.m16570d(nt2.f20643G).m16570d(nt2.f20645H);
                iz2 iz2Var5 = m16570d2.m16569e(nt2.f20664S).f19141P0;
                iz2Var5.m19225v(8);
                int m14828b2 = nt2.m14828b(iz2Var5.m19242e());
                iz2Var5.m19224w(m14828b2 == 0 ? 8 : 16);
                long m19234m2 = iz2Var5.m19234m();
                iz2Var5.m19224w(m14828b2 == 0 ? 4 : 8);
                int m19237j = iz2Var5.m19237j();
                StringBuilder sb = new StringBuilder();
                sb.append((char) (((m19237j >> 10) & 31) + 96));
                sb.append((char) (((m19237j >> 5) & 31) + 96));
                sb.append((char) ((m19237j & 31) + 96));
                Pair create2 = Pair.create(Long.valueOf(m19234m2), sb.toString());
                iz2 iz2Var6 = m16570d3.m16569e(nt2.f20666U).f19141P0;
                i2 = tt2Var2.f28059a;
                i3 = tt2Var2.f28061c;
                String str9 = (String) create2.second;
                iz2Var6.m19225v(12);
                m19242e = iz2Var6.m19242e();
                qt2 qt2Var5 = new qt2(m19242e);
                i4 = 0;
                while (i4 < m19242e) {
                    int m19244c4 = iz2Var6.m19244c();
                    int m19242e8 = iz2Var6.m19242e();
                    int i29 = i25;
                    String str10 = "childAtomSize should be positive";
                    az2.m26584d(m19242e8 > 0, "childAtomSize should be positive");
                    int m19242e9 = iz2Var6.m19242e();
                    if (m19242e9 == nt2.f20675c || m19242e9 == nt2.f20677d || m19242e9 == nt2.f20672a0 || m19242e9 == nt2.f20694l0 || m19242e9 == nt2.f20679e || m19242e9 == nt2.f20681f || m19242e9 == nt2.f20683g || m19242e9 == nt2.f20652K0 || m19242e9 == nt2.f20654L0) {
                        int i30 = i4;
                        i6 = m19242e;
                        str = str9;
                        iz2Var = iz2Var6;
                        pair = create2;
                        tt2Var = tt2Var2;
                        qt2 qt2Var6 = qt2Var5;
                        iz2Var.m19225v(m19244c4 + 16);
                        iz2Var.m19224w(16);
                        int m19237j2 = iz2Var.m19237j();
                        int m19237j3 = iz2Var.m19237j();
                        iz2Var.m19224w(50);
                        int m19244c5 = iz2Var.m19244c();
                        int i31 = m19242e8;
                        if (m19242e9 == nt2.f20672a0) {
                            m19242e9 = m7717e(iz2Var, m19244c4, i31, qt2Var6, i30);
                            iz2Var.m19225v(m19244c5);
                        }
                        String str11 = null;
                        boolean z3 = false;
                        List list = null;
                        float f = 1.0f;
                        byte[] bArr2 = null;
                        int i32 = -1;
                        while (m19244c5 - m19244c4 < i31) {
                            iz2Var.m19225v(m19244c5);
                            int m19244c6 = iz2Var.m19244c();
                            int m19242e10 = iz2Var.m19242e();
                            if (m19242e10 == 0) {
                                if (iz2Var.m19244c() - m19244c4 == i31) {
                                    break;
                                }
                                m19242e10 = 0;
                            }
                            az2.m26584d(m19242e10 > 0, "childAtomSize should be positive");
                            int m19242e11 = iz2Var.m19242e();
                            int i33 = i31;
                            if (m19242e11 == nt2.f20647I) {
                                az2.m26583e(str11 == null);
                                iz2Var.m19225v(m19244c6 + 8);
                                qz2 m11924a = qz2.m11924a(iz2Var);
                                list = m11924a.f24656a;
                                qt2Var6.f24318c = m11924a.f24657b;
                                if (!z3) {
                                    f = m11924a.f24658c;
                                }
                                str11 = "video/avc";
                            } else if (m19242e11 == nt2.f20649J) {
                                az2.m26583e(str11 == null);
                                iz2Var.m19225v(m19244c6 + 8);
                                yz2 m3019a = yz2.m3019a(iz2Var);
                                list = m3019a.f34290a;
                                qt2Var6.f24318c = m3019a.f34291b;
                                str11 = "video/hevc";
                            } else if (m19242e11 == nt2.f20656M0) {
                                az2.m26583e(str11 == null);
                                str11 = m19242e9 == nt2.f20652K0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                            } else if (m19242e11 == nt2.f20685h) {
                                az2.m26583e(str11 == null);
                                str11 = "video/3gpp";
                            } else {
                                if (m19242e11 == nt2.f20651K) {
                                    az2.m26583e(str11 == null);
                                    Pair m7716f = m7716f(iz2Var, m19244c6);
                                    list = Collections.singletonList((byte[]) m7716f.second);
                                    i11 = m19242e9;
                                    str11 = (String) m7716f.first;
                                } else if (m19242e11 == nt2.f20690j0) {
                                    iz2Var.m19225v(m19244c6 + 8);
                                    f = iz2Var.m19238i() / iz2Var.m19238i();
                                    i11 = m19242e9;
                                    z3 = true;
                                } else if (m19242e11 == nt2.f20648I0) {
                                    int i34 = m19244c6 + 8;
                                    while (true) {
                                        if (i34 - m19244c6 >= m19242e10) {
                                            i11 = m19242e9;
                                            z2 = z3;
                                            bArr = null;
                                            break;
                                        }
                                        iz2Var.m19225v(i34);
                                        int m19242e12 = iz2Var.m19242e();
                                        i11 = m19242e9;
                                        z2 = z3;
                                        if (iz2Var.m19242e() == nt2.f20650J0) {
                                            bArr = Arrays.copyOfRange(iz2Var.f14125a, i34, m19242e12 + i34);
                                            break;
                                        }
                                        i34 += m19242e12;
                                        z3 = z2;
                                        m19242e9 = i11;
                                    }
                                    z3 = z2;
                                    bArr2 = bArr;
                                } else {
                                    i11 = m19242e9;
                                    boolean z4 = z3;
                                    if (m19242e11 == nt2.f20646H0) {
                                        int m19240g = iz2Var.m19240g();
                                        iz2Var.m19224w(3);
                                        if (m19240g == 0) {
                                            int m19240g2 = iz2Var.m19240g();
                                            if (m19240g2 == 0) {
                                                z3 = z4;
                                                i32 = 0;
                                            } else if (m19240g2 == 1) {
                                                z3 = z4;
                                                i32 = 1;
                                            } else if (m19240g2 == 2) {
                                                z3 = z4;
                                                i32 = 2;
                                            } else if (m19240g2 == 3) {
                                                z3 = z4;
                                                i32 = 3;
                                            }
                                            m19244c5 += m19242e10;
                                            m19242e9 = i11;
                                            i31 = i33;
                                        }
                                    }
                                    z3 = z4;
                                    m19244c5 += m19242e10;
                                    m19242e9 = i11;
                                    i31 = i33;
                                }
                                m19244c5 += m19242e10;
                                m19242e9 = i11;
                                i31 = i33;
                            }
                            i11 = m19242e9;
                            m19244c5 += m19242e10;
                            m19242e9 = i11;
                            i31 = i33;
                        }
                        i7 = i31;
                        if (str11 != null) {
                            i10 = i7;
                            i8 = i30;
                            byte[] bArr3 = bArr2;
                            i9 = m19244c4;
                            qt2Var2 = qt2Var6;
                            qt2Var2.f24317b = zzatd.m1121v(Integer.toString(i2), str11, null, -1, -1, m19237j2, m19237j3, -1.0f, list, i3, f, bArr3, i32, null, zzavcVar);
                            iz2Var.m19225v(i9 + i10);
                            i4 = i8 + 1;
                            zzavcVar2 = zzavcVar;
                            iz2Var6 = iz2Var;
                            qt2Var5 = qt2Var2;
                            tt2Var2 = tt2Var;
                            i25 = i29;
                            m19242e = i6;
                            str9 = str;
                            create2 = pair;
                            str8 = null;
                            i24 = -1;
                        } else {
                            i8 = i30;
                            i9 = m19244c4;
                            qt2Var2 = qt2Var6;
                        }
                    } else {
                        if (m19242e9 == nt2.f20689j || m19242e9 == nt2.f20674b0 || m19242e9 == nt2.f20699o || m19242e9 == nt2.f20703q || m19242e9 == nt2.f20707s || m19242e9 == nt2.f20713v || m19242e9 == nt2.f20709t || m19242e9 == nt2.f20711u || m19242e9 == nt2.f20720y0 || m19242e9 == nt2.f20722z0 || m19242e9 == nt2.f20695m || m19242e9 == nt2.f20697n || m19242e9 == nt2.f20691k || m19242e9 == nt2.f20660O0) {
                            int i35 = i4;
                            qt2 qt2Var7 = qt2Var5;
                            i6 = m19242e;
                            str2 = str9;
                            Pair pair2 = create2;
                            int i36 = m19242e8;
                            int i37 = m19244c4;
                            iz2Var6.m19225v(i37 + 16);
                            if (z) {
                                i12 = iz2Var6.m19237j();
                                iz2Var6.m19224w(6);
                            } else {
                                iz2Var6.m19224w(8);
                                i12 = 0;
                            }
                            if (i12 != 0) {
                                i13 = 1;
                                if (i12 != 1) {
                                    if (i12 == 2) {
                                        iz2Var6.m19224w(16);
                                        i14 = (int) Math.round(Double.longBitsToDouble(iz2Var6.m19235l()));
                                        i15 = iz2Var6.m19238i();
                                        iz2Var6.m19224w(20);
                                        m19244c = iz2Var6.m19244c();
                                        if (m19242e9 != nt2.f20674b0) {
                                            i16 = i35;
                                            m19242e9 = m7717e(iz2Var6, i37, i36, qt2Var7, i16);
                                            iz2Var6.m19225v(m19244c);
                                        } else {
                                            i16 = i35;
                                        }
                                        String str12 = m19242e9 != nt2.f20699o ? "audio/ac3" : m19242e9 == nt2.f20703q ? "audio/eac3" : m19242e9 == nt2.f20707s ? "audio/vnd.dts" : (m19242e9 == nt2.f20709t || m19242e9 == nt2.f20711u) ? "audio/vnd.dts.hd" : m19242e9 == nt2.f20713v ? "audio/vnd.dts.hd;profile=lbr" : m19242e9 == nt2.f20720y0 ? "audio/3gpp" : m19242e9 == nt2.f20722z0 ? "audio/amr-wb" : (m19242e9 == nt2.f20695m || m19242e9 == nt2.f20697n) ? "audio/raw" : m19242e9 == nt2.f20691k ? "audio/mpeg" : m19242e9 == nt2.f20660O0 ? "audio/alac" : null;
                                        int i38 = i15;
                                        int i39 = i14;
                                        byte[] bArr4 = null;
                                        while (m19244c - i37 < i36) {
                                            iz2Var6.m19225v(m19244c);
                                            int m19242e13 = iz2Var6.m19242e();
                                            az2.m26584d(m19242e13 > 0, str10);
                                            int m19242e14 = iz2Var6.m19242e();
                                            int i40 = nt2.f20651K;
                                            if (m19242e14 == i40 || (z && m19242e14 == nt2.f20693l)) {
                                                i20 = i16;
                                                String str13 = str12;
                                                i21 = i37;
                                                str3 = str10;
                                                i22 = i36;
                                                str4 = str2;
                                                qt2Var4 = qt2Var7;
                                                if (m19242e14 != i40) {
                                                    m19244c2 = iz2Var6.m19244c();
                                                    while (true) {
                                                        if (m19244c2 - m19244c >= m19242e13) {
                                                            m19244c2 = -1;
                                                            break;
                                                        }
                                                        iz2Var6.m19225v(m19244c2);
                                                        int m19242e15 = iz2Var6.m19242e();
                                                        az2.m26584d(m19242e15 > 0, str3);
                                                        if (iz2Var6.m19242e() == nt2.f20651K) {
                                                            break;
                                                        }
                                                        m19244c2 += m19242e15;
                                                    }
                                                } else {
                                                    m19244c2 = m19244c;
                                                }
                                                if (m19244c2 != -1) {
                                                    Pair m7716f2 = m7716f(iz2Var6, m19244c2);
                                                    String str14 = (String) m7716f2.first;
                                                    bArr4 = (byte[]) m7716f2.second;
                                                    if ("audio/mp4a-latm".equals(str14)) {
                                                        Pair m25719a = bz2.m25719a(bArr4);
                                                        int intValue = ((Integer) m25719a.first).intValue();
                                                        i38 = ((Integer) m25719a.second).intValue();
                                                        str12 = str14;
                                                        i39 = intValue;
                                                    } else {
                                                        str12 = str14;
                                                    }
                                                } else {
                                                    str12 = str13;
                                                }
                                            } else {
                                                if (m19242e14 == nt2.f20701p) {
                                                    iz2Var6.m19225v(m19244c + 8);
                                                    str5 = str2;
                                                    m14880c = nq2.m14881b(iz2Var6, Integer.toString(i2), str5, zzavcVar2);
                                                } else {
                                                    str5 = str2;
                                                    if (m19242e14 == nt2.f20705r) {
                                                        iz2Var6.m19225v(m19244c + 8);
                                                        m14880c = nq2.m14880c(iz2Var6, Integer.toString(i2), str5, zzavcVar2);
                                                    } else {
                                                        if (m19242e14 == nt2.f20715w) {
                                                            i23 = m19244c;
                                                            i20 = i16;
                                                            str6 = str12;
                                                            str4 = str5;
                                                            i21 = i37;
                                                            str3 = str10;
                                                            i22 = i36;
                                                            qt2Var4 = qt2Var7;
                                                            qt2Var4.f24317b = zzatd.m1126l(Integer.toString(i2), str12, null, -1, -1, i38, i39, null, zzavcVar, 0, str4);
                                                            m19242e13 = m19242e13;
                                                        } else {
                                                            i23 = m19244c;
                                                            i20 = i16;
                                                            str6 = str12;
                                                            str4 = str5;
                                                            i21 = i37;
                                                            str3 = str10;
                                                            i22 = i36;
                                                            qt2Var4 = qt2Var7;
                                                            if (m19242e14 == nt2.f20660O0) {
                                                                byte[] bArr5 = new byte[m19242e13];
                                                                m19244c = i23;
                                                                iz2Var6.m19225v(m19244c);
                                                                iz2Var6.m19230q(bArr5, 0, m19242e13);
                                                                bArr4 = bArr5;
                                                                str12 = str6;
                                                            }
                                                        }
                                                        m19244c = i23;
                                                        str12 = str6;
                                                    }
                                                }
                                                qt2Var7.f24317b = m14880c;
                                                i20 = i16;
                                                str6 = str12;
                                                str4 = str5;
                                                i21 = i37;
                                                str3 = str10;
                                                i22 = i36;
                                                qt2Var4 = qt2Var7;
                                                str12 = str6;
                                            }
                                            m19244c += m19242e13;
                                            qt2Var7 = qt2Var4;
                                            str10 = str3;
                                            str2 = str4;
                                            i36 = i22;
                                            i16 = i20;
                                            i37 = i21;
                                            zzavcVar2 = zzavcVar;
                                        }
                                        i17 = i16;
                                        String str15 = str12;
                                        i18 = i37;
                                        i19 = i36;
                                        str = str2;
                                        qt2Var3 = qt2Var7;
                                        if (qt2Var3.f24317b == null || str15 == null) {
                                            pair = pair2;
                                            iz2Var = iz2Var6;
                                            tt2Var = tt2Var2;
                                            qt2Var2 = qt2Var3;
                                            i10 = i19;
                                            i8 = i17;
                                            i9 = i18;
                                            iz2Var.m19225v(i9 + i10);
                                            i4 = i8 + 1;
                                            zzavcVar2 = zzavcVar;
                                            iz2Var6 = iz2Var;
                                            qt2Var5 = qt2Var2;
                                            tt2Var2 = tt2Var;
                                            i25 = i29;
                                            m19242e = i6;
                                            str9 = str;
                                            create2 = pair;
                                            str8 = null;
                                            i24 = -1;
                                        } else {
                                            iz2Var = iz2Var6;
                                            pair = pair2;
                                            i7 = i19;
                                            tt2Var = tt2Var2;
                                            qt2Var3.f24317b = zzatd.m1125q(Integer.toString(i2), str15, null, -1, -1, i38, i39, true != "audio/raw".equals(str15) ? -1 : 2, -1, -1, bArr4 == null ? null : Collections.singletonList(bArr4), zzavcVar, 0, str, null);
                                            qt2Var2 = qt2Var3;
                                            i8 = i17;
                                            i9 = i18;
                                        }
                                    } else {
                                        pair = pair2;
                                        i9 = i37;
                                        qt2Var2 = qt2Var7;
                                        iz2Var = iz2Var6;
                                        i10 = i36;
                                        tt2Var = tt2Var2;
                                        i8 = i35;
                                    }
                                }
                            } else {
                                i13 = 1;
                            }
                            int m19237j4 = iz2Var6.m19237j();
                            iz2Var6.m19224w(6);
                            int m19239h = iz2Var6.m19239h();
                            if (i12 == i13) {
                                iz2Var6.m19224w(16);
                            }
                            i14 = m19239h;
                            i15 = m19237j4;
                            m19244c = iz2Var6.m19244c();
                            if (m19242e9 != nt2.f20674b0) {
                            }
                            String str122 = m19242e9 != nt2.f20699o ? "audio/ac3" : m19242e9 == nt2.f20703q ? "audio/eac3" : m19242e9 == nt2.f20707s ? "audio/vnd.dts" : (m19242e9 == nt2.f20709t || m19242e9 == nt2.f20711u) ? "audio/vnd.dts.hd" : m19242e9 == nt2.f20713v ? "audio/vnd.dts.hd;profile=lbr" : m19242e9 == nt2.f20720y0 ? "audio/3gpp" : m19242e9 == nt2.f20722z0 ? "audio/amr-wb" : (m19242e9 == nt2.f20695m || m19242e9 == nt2.f20697n) ? "audio/raw" : m19242e9 == nt2.f20691k ? "audio/mpeg" : m19242e9 == nt2.f20660O0 ? "audio/alac" : null;
                            int i382 = i15;
                            int i392 = i14;
                            byte[] bArr42 = null;
                            while (m19244c - i37 < i36) {
                            }
                            i17 = i16;
                            String str152 = str122;
                            i18 = i37;
                            i19 = i36;
                            str = str2;
                            qt2Var3 = qt2Var7;
                            if (qt2Var3.f24317b == null) {
                            }
                            pair = pair2;
                            iz2Var = iz2Var6;
                            tt2Var = tt2Var2;
                            qt2Var2 = qt2Var3;
                            i10 = i19;
                            i8 = i17;
                            i9 = i18;
                            iz2Var.m19225v(i9 + i10);
                            i4 = i8 + 1;
                            zzavcVar2 = zzavcVar;
                            iz2Var6 = iz2Var;
                            qt2Var5 = qt2Var2;
                            tt2Var2 = tt2Var;
                            i25 = i29;
                            m19242e = i6;
                            str9 = str;
                            create2 = pair;
                            str8 = null;
                            i24 = -1;
                        } else {
                            int i41 = nt2.f20692k0;
                            if (m19242e9 == i41 || m19242e9 == nt2.f20712u0 || m19242e9 == nt2.f20714v0 || m19242e9 == nt2.f20716w0 || m19242e9 == nt2.f20718x0) {
                                iz2Var6.m19225v(m19244c4 + 16);
                                long j5 = Long.MAX_VALUE;
                                if (m19242e9 == i41) {
                                    obj = str8;
                                    str7 = "application/ttml+xml";
                                } else if (m19242e9 == nt2.f20712u0) {
                                    int i42 = m19242e8 - 16;
                                    byte[] bArr6 = new byte[i42];
                                    iz2Var6.m19230q(bArr6, 0, i42);
                                    Object singletonList = Collections.singletonList(bArr6);
                                    str7 = "application/x-quicktime-tx3g";
                                    obj = singletonList;
                                } else if (m19242e9 == nt2.f20714v0) {
                                    str7 = "application/x-mp4-vtt";
                                    obj = str8;
                                } else if (m19242e9 == nt2.f20716w0) {
                                    obj = str8;
                                    str7 = "application/ttml+xml";
                                    j5 = 0;
                                } else if (m19242e9 != nt2.f20718x0) {
                                    throw new IllegalStateException();
                                } else {
                                    qt2Var5.f24319d = 1;
                                    str7 = "application/x-mp4-cea-608";
                                    obj = str8;
                                    qt2 qt2Var8 = qt2Var5;
                                    i6 = m19242e;
                                    str2 = str9;
                                    qt2Var8.f24317b = zzatd.m1122u(Integer.toString(i2), str7, null, -1, 0, str9, -1, zzavcVar, j5, obj);
                                    pair = create2;
                                    qt2Var2 = qt2Var8;
                                    iz2Var = iz2Var6;
                                    i10 = m19242e8;
                                    tt2Var = tt2Var2;
                                    i8 = i4;
                                    i9 = m19244c4;
                                }
                                qt2 qt2Var82 = qt2Var5;
                                i6 = m19242e;
                                str2 = str9;
                                qt2Var82.f24317b = zzatd.m1122u(Integer.toString(i2), str7, null, -1, 0, str9, -1, zzavcVar, j5, obj);
                                pair = create2;
                                qt2Var2 = qt2Var82;
                                iz2Var = iz2Var6;
                                i10 = m19242e8;
                                tt2Var = tt2Var2;
                                i8 = i4;
                                i9 = m19244c4;
                            } else {
                                if (m19242e9 == nt2.f20658N0) {
                                    qt2Var5.f24317b = zzatd.m1123t(Integer.toString(i2), "application/x-camera-motion", str8, i24, zzavcVar2);
                                }
                                i10 = m19242e8;
                                i9 = m19244c4;
                                i8 = i4;
                                qt2Var2 = qt2Var5;
                                i6 = m19242e;
                                str = str9;
                                iz2Var = iz2Var6;
                                pair = create2;
                                tt2Var = tt2Var2;
                                iz2Var.m19225v(i9 + i10);
                                i4 = i8 + 1;
                                zzavcVar2 = zzavcVar;
                                iz2Var6 = iz2Var;
                                qt2Var5 = qt2Var2;
                                tt2Var2 = tt2Var;
                                i25 = i29;
                                m19242e = i6;
                                str9 = str;
                                create2 = pair;
                                str8 = null;
                                i24 = -1;
                            }
                        }
                        str = str2;
                        iz2Var.m19225v(i9 + i10);
                        i4 = i8 + 1;
                        zzavcVar2 = zzavcVar;
                        iz2Var6 = iz2Var;
                        qt2Var5 = qt2Var2;
                        tt2Var2 = tt2Var;
                        i25 = i29;
                        m19242e = i6;
                        str9 = str;
                        create2 = pair;
                        str8 = null;
                        i24 = -1;
                    }
                    i10 = i7;
                    iz2Var.m19225v(i9 + i10);
                    i4 = i8 + 1;
                    zzavcVar2 = zzavcVar;
                    iz2Var6 = iz2Var;
                    qt2Var5 = qt2Var2;
                    tt2Var2 = tt2Var;
                    i25 = i29;
                    m19242e = i6;
                    str9 = str;
                    create2 = pair;
                    str8 = null;
                    i24 = -1;
                }
                qt2Var = qt2Var5;
                int i43 = i25;
                Pair pair3 = create2;
                tt2 tt2Var3 = tt2Var2;
                m16570d = lt2Var.m16570d(nt2.f20662Q);
                if (m16570d != null || (m16569e = m16570d.m16569e(nt2.f20663R)) == null) {
                    fu2Var = null;
                    create = Pair.create(null, null);
                } else {
                    iz2 iz2Var7 = m16569e.f19141P0;
                    iz2Var7.m19225v(8);
                    int m14828b3 = nt2.m14828b(iz2Var7.m19242e());
                    int m19238i = iz2Var7.m19238i();
                    long[] jArr = new long[m19238i];
                    long[] jArr2 = new long[m19238i];
                    for (int i44 = 0; i44 < m19238i; i44++) {
                        jArr[i44] = m14828b3 == 1 ? iz2Var7.m19233n() : iz2Var7.m19234m();
                        jArr2[i44] = m14828b3 == 1 ? iz2Var7.m19235l() : iz2Var7.m19242e();
                        if (iz2Var7.m19231p() != 1) {
                            throw new IllegalArgumentException("Unsupported media rate.");
                        }
                        iz2Var7.m19224w(2);
                    }
                    create = Pair.create(jArr, jArr2);
                    fu2Var = null;
                }
                if (qt2Var.f24317b == null) {
                    return fu2Var;
                }
                i5 = tt2Var3.f28059a;
                return new fu2(i5, i43, ((Long) pair3.first).longValue(), m19234m, m12840j, qt2Var.f24317b, qt2Var.f24319d, qt2Var.f24316a, qt2Var.f24318c, (long[]) create.first, (long[]) create.second);
            } else {
                m19242e4 = 0;
                m19242e5 = 65536;
                m19242e6 = -65536;
            }
        }
        if (m19242e4 != 0) {
            i28 = m19242e6;
        } else if (m19242e5 == -65536) {
            if (m19242e6 != 65536) {
                i28 = m19242e6;
            } else if (m19242e7 == 0) {
                i = 270;
                tt2 tt2Var22 = new tt2(m19242e3, j2, i);
                if (j == -9223372036854775807L) {
                }
                iz2 iz2Var42 = mt2Var2.f19141P0;
                iz2Var42.m19225v(8);
                iz2Var42.m19224w(nt2.m14828b(iz2Var42.m19242e()) == 0 ? 8 : 16);
                long m19234m3 = iz2Var42.m19234m();
                if (j3 == -9223372036854775807L) {
                }
                lt2 m16570d32 = m16570d2.m16570d(nt2.f20643G).m16570d(nt2.f20645H);
                iz2 iz2Var52 = m16570d2.m16569e(nt2.f20664S).f19141P0;
                iz2Var52.m19225v(8);
                int m14828b22 = nt2.m14828b(iz2Var52.m19242e());
                iz2Var52.m19224w(m14828b22 == 0 ? 8 : 16);
                long m19234m22 = iz2Var52.m19234m();
                iz2Var52.m19224w(m14828b22 == 0 ? 4 : 8);
                int m19237j5 = iz2Var52.m19237j();
                StringBuilder sb2 = new StringBuilder();
                sb2.append((char) (((m19237j5 >> 10) & 31) + 96));
                sb2.append((char) (((m19237j5 >> 5) & 31) + 96));
                sb2.append((char) ((m19237j5 & 31) + 96));
                Pair create22 = Pair.create(Long.valueOf(m19234m22), sb2.toString());
                iz2 iz2Var62 = m16570d32.m16569e(nt2.f20666U).f19141P0;
                i2 = tt2Var22.f28059a;
                i3 = tt2Var22.f28061c;
                String str92 = (String) create22.second;
                iz2Var62.m19225v(12);
                m19242e = iz2Var62.m19242e();
                qt2 qt2Var52 = new qt2(m19242e);
                i4 = 0;
                while (i4 < m19242e) {
                }
                qt2Var = qt2Var52;
                int i432 = i25;
                Pair pair32 = create22;
                tt2 tt2Var32 = tt2Var22;
                m16570d = lt2Var.m16570d(nt2.f20662Q);
                if (m16570d != null) {
                }
                fu2Var = null;
                create = Pair.create(null, null);
                if (qt2Var.f24317b == null) {
                }
            }
            m19242e4 = 0;
            m19242e5 = -65536;
        } else {
            i28 = m19242e6;
            m19242e4 = 0;
        }
        i = (m19242e4 == -65536 && m19242e5 == 0 && i28 == 0 && m19242e7 == -65536) ? 180 : 0;
        tt2 tt2Var222 = new tt2(m19242e3, j2, i);
        if (j == -9223372036854775807L) {
        }
        iz2 iz2Var422 = mt2Var2.f19141P0;
        iz2Var422.m19225v(8);
        iz2Var422.m19224w(nt2.m14828b(iz2Var422.m19242e()) == 0 ? 8 : 16);
        long m19234m32 = iz2Var422.m19234m();
        if (j3 == -9223372036854775807L) {
        }
        lt2 m16570d322 = m16570d2.m16570d(nt2.f20643G).m16570d(nt2.f20645H);
        iz2 iz2Var522 = m16570d2.m16569e(nt2.f20664S).f19141P0;
        iz2Var522.m19225v(8);
        int m14828b222 = nt2.m14828b(iz2Var522.m19242e());
        iz2Var522.m19224w(m14828b222 == 0 ? 8 : 16);
        long m19234m222 = iz2Var522.m19234m();
        iz2Var522.m19224w(m14828b222 == 0 ? 4 : 8);
        int m19237j52 = iz2Var522.m19237j();
        StringBuilder sb22 = new StringBuilder();
        sb22.append((char) (((m19237j52 >> 10) & 31) + 96));
        sb22.append((char) (((m19237j52 >> 5) & 31) + 96));
        sb22.append((char) ((m19237j52 & 31) + 96));
        Pair create222 = Pair.create(Long.valueOf(m19234m222), sb22.toString());
        iz2 iz2Var622 = m16570d322.m16569e(nt2.f20666U).f19141P0;
        i2 = tt2Var222.f28059a;
        i3 = tt2Var222.f28061c;
        String str922 = (String) create222.second;
        iz2Var622.m19225v(12);
        m19242e = iz2Var622.m19242e();
        qt2 qt2Var522 = new qt2(m19242e);
        i4 = 0;
        while (i4 < m19242e) {
        }
        qt2Var = qt2Var522;
        int i4322 = i25;
        Pair pair322 = create222;
        tt2 tt2Var322 = tt2Var222;
        m16570d = lt2Var.m16570d(nt2.f20662Q);
        if (m16570d != null) {
        }
        fu2Var = null;
        create = Pair.create(null, null);
        if (qt2Var.f24317b == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0175 A[LOOP:10: B:59:0x0175->B:60:0x0177, LOOP_START, PHI: r14 r15 r22 r25 
      PHI: (r14v3 int) = (r14v1 int), (r14v10 int) binds: [B:58:0x0173, B:60:0x0177] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r15v3 int) = (r15v1 int), (r15v9 int) binds: [B:58:0x0173, B:60:0x0177] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r22v2 int) = (r22v1 int), (r22v5 int) binds: [B:58:0x0173, B:60:0x0177] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v2 long) = (r25v1 long), (r25v4 long) binds: [B:58:0x0173, B:60:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0225  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static iu2 m7720b(fu2 fu2Var, lt2 lt2Var, rs2 rs2Var) {
        pt2 st2Var;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        fu2 fu2Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        long[] jArr;
        long[] jArr2;
        int[] iArr2;
        pt2 pt2Var;
        long[] jArr3;
        int i11;
        int i12;
        long[] jArr4;
        int[] iArr3;
        int[] iArr4;
        long[] jArr5;
        boolean z2;
        long[] jArr6;
        int[] iArr5;
        long[] jArr7;
        int length;
        mt2 m16569e = lt2Var.m16569e(nt2.f20704q0);
        if (m16569e != null) {
            st2Var = new rt2(m16569e);
        } else {
            mt2 m16569e2 = lt2Var.m16569e(nt2.f20706r0);
            if (m16569e2 == null) {
                throw new eq2("Track has no sample table size information");
            }
            st2Var = new st2(m16569e2);
        }
        int zza = st2Var.zza();
        if (zza == 0) {
            return new iu2(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        mt2 m16569e3 = lt2Var.m16569e(nt2.f20708s0);
        if (m16569e3 == null) {
            m16569e3 = lt2Var.m16569e(nt2.f20710t0);
            z = true;
        } else {
            z = false;
        }
        iz2 iz2Var = m16569e3.f19141P0;
        iz2 iz2Var2 = lt2Var.m16569e(nt2.f20702p0).f19141P0;
        iz2 iz2Var3 = lt2Var.m16569e(nt2.f20696m0).f19141P0;
        mt2 m16569e4 = lt2Var.m16569e(nt2.f20698n0);
        iz2 iz2Var4 = m16569e4 != null ? m16569e4.f19141P0 : null;
        mt2 m16569e5 = lt2Var.m16569e(nt2.f20700o0);
        iz2 iz2Var5 = m16569e5 != null ? m16569e5.f19141P0 : null;
        ot2 ot2Var = new ot2(iz2Var2, iz2Var, z);
        iz2Var3.m19225v(12);
        int m19238i = iz2Var3.m19238i() - 1;
        int m19238i2 = iz2Var3.m19238i();
        int m19238i3 = iz2Var3.m19238i();
        if (iz2Var5 != null) {
            iz2Var5.m19225v(12);
            i = iz2Var5.m19238i();
        } else {
            i = 0;
        }
        if (iz2Var4 != null) {
            iz2Var4.m19225v(12);
            i2 = iz2Var4.m19238i();
            if (i2 > 0) {
                i3 = iz2Var4.m19238i() - 1;
                if (st2Var.zzc() && "audio/raw".equals(fu2Var.f9970f.f36794u) && m19238i == 0) {
                    if (i != 0 && i2 == 0) {
                        int i13 = ot2Var.f21955a;
                        long[] jArr8 = new long[i13];
                        int[] iArr6 = new int[i13];
                        while (ot2Var.m13977a()) {
                            int i14 = ot2Var.f21956b;
                            jArr8[i14] = ot2Var.f21958d;
                            iArr6[i14] = ot2Var.f21957c;
                        }
                        int zzb = st2Var.zzb();
                        long j2 = m19238i3;
                        int i15 = 8192 / zzb;
                        int i16 = 0;
                        for (int i17 = 0; i17 < i13; i17++) {
                            i16 += pz2.m12846d(iArr6[i17], i15);
                        }
                        long[] jArr9 = new long[i16];
                        iArr = new int[i16];
                        long[] jArr10 = new long[i16];
                        int[] iArr7 = new int[i16];
                        int i18 = 0;
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 0;
                        while (i18 < i13) {
                            int i22 = iArr6[i18];
                            long j3 = jArr8[i18];
                            int i23 = i19;
                            int i24 = i20;
                            int i25 = i13;
                            int i26 = i24;
                            long[] jArr11 = jArr8;
                            int i27 = i22;
                            while (i27 > 0) {
                                int min = Math.min(i15, i27);
                                jArr9[i21] = j3;
                                int[] iArr8 = iArr6;
                                int i28 = zzb * min;
                                iArr[i21] = i28;
                                int max = Math.max(i23, i28);
                                jArr10[i21] = i26 * j2;
                                iArr7[i21] = 1;
                                j3 += iArr[i21];
                                i26 += min;
                                i27 -= min;
                                i21++;
                                iArr6 = iArr8;
                                i23 = max;
                            }
                            i18++;
                            i19 = i23;
                            jArr8 = jArr11;
                            i20 = i26;
                            i13 = i25;
                        }
                        fu2Var2 = fu2Var;
                        iArr2 = iArr7;
                        jArr = jArr10;
                        i10 = i19;
                        j = 0;
                        jArr2 = jArr9;
                        jArr4 = fu2Var2.f9973i;
                        if (jArr4 != null || rs2Var.m10977a()) {
                            int[] iArr9 = iArr2;
                            pz2.m12836n(jArr, 1000000L, fu2Var2.f9967c);
                            return new iu2(jArr2, iArr, i10, jArr, iArr9);
                        }
                        if (jArr4.length == 1 && fu2Var2.f9966b == 1 && (length = jArr.length) >= 2) {
                            long j4 = fu2Var2.f9974j[0];
                            long m12840j = j4 + pz2.m12840j(jArr4[0], fu2Var2.f9967c, fu2Var2.f9968d);
                            long j5 = jArr[0];
                            if (j5 <= j4 && j4 < jArr[1] && jArr[length - 1] < m12840j && m12840j <= j) {
                                long m12840j2 = pz2.m12840j(j4 - j5, fu2Var2.f9970f.f36780H, fu2Var2.f9967c);
                                long m12840j3 = pz2.m12840j(j - m12840j, fu2Var2.f9970f.f36780H, fu2Var2.f9967c);
                                if (m12840j2 == 0) {
                                    if (m12840j3 != 0) {
                                        m12840j2 = 0;
                                    }
                                }
                                if (m12840j2 <= 2147483647L && m12840j3 <= 2147483647L) {
                                    rs2Var.f25570a = (int) m12840j2;
                                    rs2Var.f25571b = (int) m12840j3;
                                    pz2.m12836n(jArr, 1000000L, fu2Var2.f9967c);
                                    return new iu2(jArr2, iArr, i10, jArr, iArr2);
                                }
                            }
                        }
                        long[] jArr12 = fu2Var2.f9973i;
                        if (jArr12.length == 1) {
                            char c = 0;
                            if (jArr12[0] == 0) {
                                int i29 = 0;
                                while (i29 < jArr.length) {
                                    jArr[i29] = pz2.m12840j(jArr[i29] - fu2Var2.f9974j[c], 1000000L, fu2Var2.f9967c);
                                    i29++;
                                    c = 0;
                                }
                                return new iu2(jArr2, iArr, i10, jArr, iArr2);
                            }
                        }
                        boolean z3 = fu2Var2.f9966b == 1;
                        int i30 = 0;
                        int i31 = 0;
                        boolean z4 = false;
                        int i32 = 0;
                        while (true) {
                            long[] jArr13 = fu2Var2.f9973i;
                            if (i32 >= jArr13.length) {
                                break;
                            }
                            int[] iArr10 = iArr;
                            int i33 = i10;
                            long j6 = fu2Var2.f9974j[i32];
                            if (j6 != -1) {
                                jArr7 = jArr2;
                                long m12840j4 = pz2.m12840j(jArr13[i32], fu2Var2.f9967c, fu2Var2.f9968d);
                                int m12848b = pz2.m12848b(jArr, j6, true, true);
                                int m12848b2 = pz2.m12848b(jArr, j6 + m12840j4, z3, false);
                                i30 += m12848b2 - m12848b;
                                z4 = (i31 != m12848b) | z4;
                                i31 = m12848b2;
                            } else {
                                jArr7 = jArr2;
                            }
                            i32++;
                            iArr = iArr10;
                            jArr2 = jArr7;
                            i10 = i33;
                        }
                        long[] jArr14 = jArr2;
                        int[] iArr11 = iArr;
                        int i34 = i10;
                        boolean z5 = (i30 != zza) | z4;
                        long[] jArr15 = z5 ? new long[i30] : jArr14;
                        int[] iArr12 = z5 ? new int[i30] : iArr11;
                        int i35 = true == z5 ? 0 : i34;
                        int[] iArr13 = z5 ? new int[i30] : iArr2;
                        long[] jArr16 = new long[i30];
                        int i36 = i35;
                        long j7 = 0;
                        int i37 = 0;
                        int i38 = 0;
                        while (true) {
                            long[] jArr17 = fu2Var2.f9973i;
                            if (i37 >= jArr17.length) {
                                break;
                            }
                            long j8 = j7;
                            long j9 = fu2Var2.f9974j[i37];
                            long j10 = jArr17[i37];
                            if (j9 != -1) {
                                int[] iArr14 = iArr2;
                                jArr5 = jArr16;
                                long m12840j5 = pz2.m12840j(j10, fu2Var2.f9967c, fu2Var2.f9968d);
                                int m12848b3 = pz2.m12848b(jArr, j9, true, true);
                                int m12848b4 = pz2.m12848b(jArr, m12840j5 + j9, z3, false);
                                if (z5) {
                                    int i39 = m12848b4 - m12848b3;
                                    System.arraycopy(jArr14, m12848b3, jArr15, i38, i39);
                                    iArr3 = iArr11;
                                    System.arraycopy(iArr3, m12848b3, iArr12, i38, i39);
                                    z2 = z3;
                                    iArr5 = iArr14;
                                    System.arraycopy(iArr5, m12848b3, iArr13, i38, i39);
                                } else {
                                    iArr3 = iArr11;
                                    z2 = z3;
                                    iArr5 = iArr14;
                                }
                                int i40 = i36;
                                while (m12848b3 < m12848b4) {
                                    int[] iArr15 = iArr5;
                                    long[] jArr18 = jArr14;
                                    long j11 = j9;
                                    jArr5[i38] = pz2.m12840j(j8, 1000000L, fu2Var2.f9968d) + pz2.m12840j(jArr[m12848b3] - j9, 1000000L, fu2Var2.f9967c);
                                    if (z5 && iArr12[i38] > i40) {
                                        i40 = iArr3[m12848b3];
                                    }
                                    i38++;
                                    m12848b3++;
                                    j9 = j11;
                                    jArr14 = jArr18;
                                    iArr5 = iArr15;
                                }
                                iArr4 = iArr5;
                                jArr6 = jArr14;
                                i36 = i40;
                            } else {
                                iArr3 = iArr11;
                                iArr4 = iArr2;
                                jArr5 = jArr16;
                                z2 = z3;
                                jArr6 = jArr14;
                            }
                            j7 = j8 + j10;
                            i37++;
                            iArr11 = iArr3;
                            jArr16 = jArr5;
                            jArr14 = jArr6;
                            z3 = z2;
                            iArr2 = iArr4;
                        }
                        long[] jArr19 = jArr16;
                        int i41 = 0;
                        int i42 = 0;
                        while (true) {
                            if (i41 < iArr13.length) {
                                if (i42 != 0) {
                                    break;
                                }
                                i42 = iArr13[i41] & 1;
                                i41++;
                            } else if (i42 == 0) {
                                throw new eq2("The edited sample sequence does not contain a sync sample.");
                            }
                        }
                        return new iu2(jArr15, iArr12, i36, jArr19, iArr13);
                    }
                    m19238i = 0;
                }
                long[] jArr20 = new long[zza];
                int[] iArr16 = new int[zza];
                long[] jArr21 = new long[zza];
                i4 = i2;
                int[] iArr17 = new int[zza];
                long j12 = 0;
                j = 0;
                int i43 = 0;
                i5 = 0;
                int i44 = 0;
                int i45 = 0;
                int i46 = 0;
                while (i5 < zza) {
                    while (i45 == 0) {
                        az2.m26583e(ot2Var.m13977a());
                        j12 = ot2Var.f21958d;
                        i45 = ot2Var.f21957c;
                        m19238i2 = m19238i2;
                        m19238i3 = m19238i3;
                    }
                    int i47 = m19238i2;
                    int i48 = m19238i3;
                    if (iz2Var5 != null) {
                        while (true) {
                            if (i44 != 0) {
                                break;
                            }
                            if (i <= 0) {
                                i44 = 0;
                                break;
                            }
                            i44 = iz2Var5.m19238i();
                            i46 = iz2Var5.m19242e();
                            i--;
                        }
                        i44--;
                    }
                    int i49 = i46;
                    jArr20[i5] = j12;
                    int zzb2 = st2Var.zzb();
                    iArr16[i5] = zzb2;
                    if (zzb2 > i43) {
                        jArr3 = jArr20;
                        i43 = zzb2;
                        pt2Var = st2Var;
                    } else {
                        pt2Var = st2Var;
                        jArr3 = jArr20;
                    }
                    jArr21[i5] = j + i49;
                    iArr17[i5] = iz2Var4 == null ? 1 : 0;
                    if (i5 == i3) {
                        iArr17[i5] = 1;
                        i4--;
                        if (i4 > 0) {
                            i3 = iz2Var4.m19238i() - 1;
                        }
                    }
                    int[] iArr18 = iArr17;
                    j += i48;
                    int i50 = i47 - 1;
                    if (i50 != 0) {
                        i11 = i48;
                        i12 = i50;
                    } else if (m19238i > 0) {
                        i12 = iz2Var3.m19238i();
                        i11 = iz2Var3.m19238i();
                        m19238i--;
                    } else {
                        i11 = i48;
                        i12 = 0;
                    }
                    int i51 = i12;
                    int i52 = i11;
                    j12 += iArr16[i5];
                    i45--;
                    i5++;
                    st2Var = pt2Var;
                    jArr20 = jArr3;
                    iArr17 = iArr18;
                    m19238i3 = i52;
                    i46 = i49;
                    m19238i2 = i51;
                }
                long[] jArr22 = jArr20;
                int[] iArr19 = iArr17;
                int i53 = m19238i2;
                az2.m26585c(i44 != 0);
                while (i > 0) {
                    az2.m26585c(iz2Var5.m19238i() == 0);
                    iz2Var5.m19242e();
                    i--;
                }
                if (i4 != 0) {
                    if (i53 != 0) {
                        fu2Var2 = fu2Var;
                        i6 = i43;
                        i8 = i45;
                        i9 = i53;
                    } else if (i45 != 0) {
                        i9 = 0;
                        fu2Var2 = fu2Var;
                        i6 = i43;
                        i8 = i45;
                    } else if (m19238i == 0) {
                        fu2Var2 = fu2Var;
                        i6 = i43;
                        i10 = i6;
                        iArr = iArr16;
                        jArr = jArr21;
                        jArr2 = jArr22;
                        iArr2 = iArr19;
                        jArr4 = fu2Var2.f9973i;
                        if (jArr4 != null) {
                        }
                        int[] iArr92 = iArr2;
                        pz2.m12836n(jArr, 1000000L, fu2Var2.f9967c);
                        return new iu2(jArr2, iArr, i10, jArr, iArr92);
                    } else {
                        i9 = 0;
                        i8 = 0;
                        fu2Var2 = fu2Var;
                        i6 = i43;
                    }
                    i7 = 0;
                } else {
                    fu2Var2 = fu2Var;
                    i6 = i43;
                    i7 = i4;
                    i8 = i45;
                    i9 = i53;
                }
                int i54 = fu2Var2.f9965a;
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent stbl box for track ");
                sb.append(i54);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i7);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i9);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i8);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(m19238i);
                i10 = i6;
                iArr = iArr16;
                jArr = jArr21;
                jArr2 = jArr22;
                iArr2 = iArr19;
                jArr4 = fu2Var2.f9973i;
                if (jArr4 != null) {
                }
                int[] iArr922 = iArr2;
                pz2.m12836n(jArr, 1000000L, fu2Var2.f9967c);
                return new iu2(jArr2, iArr, i10, jArr, iArr922);
            }
            iz2Var4 = null;
        } else {
            i2 = 0;
        }
        i3 = -1;
        if (st2Var.zzc()) {
            if (i != 0) {
            }
            m19238i = 0;
        }
        long[] jArr202 = new long[zza];
        int[] iArr162 = new int[zza];
        long[] jArr212 = new long[zza];
        i4 = i2;
        int[] iArr172 = new int[zza];
        long j122 = 0;
        j = 0;
        int i432 = 0;
        i5 = 0;
        int i442 = 0;
        int i452 = 0;
        int i462 = 0;
        while (i5 < zza) {
        }
        long[] jArr222 = jArr202;
        int[] iArr192 = iArr172;
        int i532 = m19238i2;
        az2.m26585c(i442 != 0);
        while (i > 0) {
        }
        if (i4 != 0) {
        }
        int i542 = fu2Var2.f9965a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Inconsistent stbl box for track ");
        sb2.append(i542);
        sb2.append(": remainingSynchronizationSamples ");
        sb2.append(i7);
        sb2.append(", remainingSamplesAtTimestampDelta ");
        sb2.append(i9);
        sb2.append(", remainingSamplesInChunk ");
        sb2.append(i8);
        sb2.append(", remainingTimestampDeltaChanges ");
        sb2.append(m19238i);
        i10 = i6;
        iArr = iArr162;
        jArr = jArr212;
        jArr2 = jArr222;
        iArr2 = iArr192;
        jArr4 = fu2Var2.f9973i;
        if (jArr4 != null) {
        }
        int[] iArr9222 = iArr2;
        pz2.m12836n(jArr, 1000000L, fu2Var2.f9967c);
        return new iu2(jArr2, iArr, i10, jArr, iArr9222);
    }

    /* renamed from: c */
    public static zzaxo m7719c(mt2 mt2Var, boolean z) {
        if (z) {
            return null;
        }
        iz2 iz2Var = mt2Var.f19141P0;
        iz2Var.m19225v(8);
        while (iz2Var.m19246a() >= 8) {
            int m19244c = iz2Var.m19244c();
            int m19242e = iz2Var.m19242e();
            if (iz2Var.m19242e() == nt2.f20634B0) {
                iz2Var.m19225v(m19244c);
                int i = m19244c + m19242e;
                iz2Var.m19224w(12);
                while (iz2Var.m19244c() < i) {
                    int m19244c2 = iz2Var.m19244c();
                    int m19242e2 = iz2Var.m19242e();
                    if (iz2Var.m19242e() == nt2.f20636C0) {
                        iz2Var.m19225v(m19244c2);
                        int i2 = m19244c2 + m19242e2;
                        iz2Var.m19224w(8);
                        ArrayList arrayList = new ArrayList();
                        while (iz2Var.m19244c() < i2) {
                            zzaxn m27017a = au2.m27017a(iz2Var);
                            if (m27017a != null) {
                                arrayList.add(m27017a);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return new zzaxo(arrayList);
                    }
                    iz2Var.m19224w(m19242e2 - 8);
                }
                return null;
            }
            iz2Var.m19224w(m19242e - 8);
        }
        return null;
    }

    /* renamed from: d */
    public static int m7718d(iz2 iz2Var) {
        int m19240g = iz2Var.m19240g();
        int i = m19240g & 127;
        while ((m19240g & 128) == 128) {
            m19240g = iz2Var.m19240g();
            i = (i << 7) | (m19240g & 127);
        }
        return i;
    }

    /* renamed from: e */
    public static int m7717e(iz2 iz2Var, int i, int i2, qt2 qt2Var, int i3) {
        int m19244c = iz2Var.m19244c();
        while (true) {
            if (m19244c - i >= i2) {
                return 0;
            }
            iz2Var.m19225v(m19244c);
            int m19242e = iz2Var.m19242e();
            az2.m26584d(m19242e > 0, "childAtomSize should be positive");
            if (iz2Var.m19242e() == nt2.f20668W) {
                int i4 = m19244c + 8;
                Pair pair = null;
                Integer num = null;
                gu2 gu2Var = null;
                boolean z = false;
                while (i4 - m19244c < m19242e) {
                    iz2Var.m19225v(i4);
                    int m19242e2 = iz2Var.m19242e();
                    int m19242e3 = iz2Var.m19242e();
                    if (m19242e3 == nt2.f20676c0) {
                        num = Integer.valueOf(iz2Var.m19242e());
                    } else if (m19242e3 == nt2.f20669X) {
                        iz2Var.m19224w(4);
                        z = iz2Var.m19242e() == f29524g;
                    } else if (m19242e3 == nt2.f20670Y) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= m19242e2) {
                                gu2Var = null;
                                break;
                            }
                            iz2Var.m19225v(i5);
                            int m19242e4 = iz2Var.m19242e();
                            if (iz2Var.m19242e() == nt2.f20671Z) {
                                iz2Var.m19224w(6);
                                boolean z2 = iz2Var.m19240g() == 1;
                                int m19240g = iz2Var.m19240g();
                                byte[] bArr = new byte[16];
                                iz2Var.m19230q(bArr, 0, 16);
                                gu2Var = new gu2(z2, m19240g, bArr);
                            } else {
                                i5 += m19242e4;
                            }
                        }
                    }
                    i4 += m19242e2;
                }
                if (z) {
                    az2.m26584d(num != null, "frma atom is mandatory");
                    az2.m26584d(gu2Var != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, gu2Var);
                }
                if (pair != null) {
                    qt2Var.f24316a[i3] = (gu2) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            m19244c += m19242e;
        }
    }

    /* renamed from: f */
    public static Pair m7716f(iz2 iz2Var, int i) {
        iz2Var.m19225v(i + 12);
        iz2Var.m19224w(1);
        m7718d(iz2Var);
        iz2Var.m19224w(2);
        int m19240g = iz2Var.m19240g();
        if ((m19240g & 128) != 0) {
            iz2Var.m19224w(2);
        }
        if ((m19240g & 64) != 0) {
            iz2Var.m19224w(iz2Var.m19237j());
        }
        if ((m19240g & 32) != 0) {
            iz2Var.m19224w(2);
        }
        iz2Var.m19224w(1);
        m7718d(iz2Var);
        int m19240g2 = iz2Var.m19240g();
        String str = null;
        if (m19240g2 == 32) {
            str = "video/mp4v-es";
        } else if (m19240g2 == 33) {
            str = "video/avc";
        } else if (m19240g2 != 35) {
            if (m19240g2 != 64) {
                if (m19240g2 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (m19240g2 == 165) {
                    str = "audio/ac3";
                } else if (m19240g2 != 166) {
                    switch (m19240g2) {
                        case p21.f22334U0 /* 102 */:
                        case p21.f22340V0 /* 103 */:
                        case p21.f22346W0 /* 104 */:
                            break;
                        default:
                            switch (m19240g2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        iz2Var.m19224w(12);
        iz2Var.m19224w(1);
        int m7718d = m7718d(iz2Var);
        byte[] bArr = new byte[m7718d];
        iz2Var.m19230q(bArr, 0, m7718d);
        return Pair.create(str, bArr);
    }
}
