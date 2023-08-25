package com.daaw;

import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzacr;
import com.google.android.gms.internal.ads.zzact;
import com.google.android.gms.internal.ads.zzacv;
import com.google.android.gms.internal.ads.zzacx;
import com.google.android.gms.internal.ads.zzacz;
import com.google.android.gms.internal.ads.zzade;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadk;
import com.google.android.gms.internal.ads.zzadm;
import com.google.android.gms.internal.ads.zzado;
import com.google.android.gms.internal.ads.zzbq;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes.dex */
public final class k72 {

    /* renamed from: a */
    public static final i72 f15737a = new i72() { // from class: com.daaw.h72
    };

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzbq m18008a(byte[] bArr, int i, i72 i72Var, o62 o62Var) {
        String str;
        j72 j72Var;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        ik5 ik5Var = new ik5(bArr, i);
        boolean z2 = false;
        if (ik5Var.m19713i() < 10) {
            str = "Data too short to be an ID3 tag";
        } else {
            int m19701u = ik5Var.m19701u();
            if (m19701u == 4801587) {
                int m19703s = ik5Var.m19703s();
                ik5Var.m19715g(1);
                int m19703s2 = ik5Var.m19703s();
                int m19704r = ik5Var.m19704r();
                if (m19703s == 2) {
                    if ((m19703s2 & 64) != 0) {
                        str = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                    j72Var = new j72(m19703s, m19703s >= 4 && (m19703s2 & 128) != 0, m19704r);
                } else {
                    if (m19703s == 3) {
                        if ((m19703s2 & 64) != 0) {
                            int m19709m = ik5Var.m19709m();
                            ik5Var.m19715g(m19709m);
                            m19704r -= m19709m + 4;
                        }
                    } else if (m19703s == 4) {
                        if ((m19703s2 & 64) != 0) {
                            int m19704r2 = ik5Var.m19704r();
                            ik5Var.m19715g(m19704r2 - 4);
                            m19704r -= m19704r2;
                        }
                        if ((m19703s2 & 16) != 0) {
                            m19704r -= 10;
                        }
                    } else {
                        str = "Skipped ID3 tag with unsupported majorVersion=" + m19703s;
                    }
                    j72Var = new j72(m19703s, m19703s >= 4 && (m19703s2 & 128) != 0, m19704r);
                }
                if (j72Var != null) {
                    return null;
                }
                int m19711k = ik5Var.m19711k();
                i2 = j72Var.f14487a;
                int i9 = i2 == 2 ? 6 : 10;
                i3 = j72Var.f14489c;
                z = j72Var.f14488b;
                if (z) {
                    i8 = j72Var.f14489c;
                    i3 = m18004e(ik5Var, i8);
                }
                ik5Var.m19717e(m19711k + i3);
                i4 = j72Var.f14487a;
                if (!m17999j(ik5Var, i4, i9, false)) {
                    i6 = j72Var.f14487a;
                    if (i6 != 4 || !m17999j(ik5Var, 4, i9, true)) {
                        i7 = j72Var.f14487a;
                        s95.m10493e("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + i7);
                        return null;
                    }
                    z2 = true;
                }
                while (ik5Var.m19713i() >= i9) {
                    i5 = j72Var.f14487a;
                    zzade m18003f = m18003f(i5, ik5Var, z2, i9, i72Var);
                    if (m18003f != null) {
                        arrayList.add(m18003f);
                    }
                }
                return new zzbq(arrayList);
            }
            str = "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(m19701u))));
        }
        s95.m10493e("Id3Decoder", str);
        j72Var = null;
        if (j72Var != null) {
        }
    }

    /* renamed from: b */
    public static int m18007b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: c */
    public static int m18006c(byte[] bArr, int i, int i2) {
        int m18005d = m18005d(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return m18005d;
        }
        while (true) {
            int length = bArr.length;
            if (m18005d >= length - 1) {
                return length;
            }
            if ((m18005d - i) % 2 == 0 && bArr[m18005d + 1] == 0) {
                return m18005d;
            }
            m18005d = m18005d(bArr, m18005d + 1);
        }
    }

    /* renamed from: d */
    public static int m18005d(byte[] bArr, int i) {
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

    /* renamed from: e */
    public static int m18004e(ik5 ik5Var, int i) {
        byte[] m19714h = ik5Var.m19714h();
        int m19711k = ik5Var.m19711k();
        int i2 = m19711k;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= m19711k + i) {
                return i;
            }
            if ((m19714h[i2] & 255) == 255 && m19714h[i3] == 0) {
                System.arraycopy(m19714h, i2 + 2, m19714h, i3, (i - (i2 - m19711k)) - 2);
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
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzade m18003f(int i, ik5 ik5Var, boolean z, int i2, i72 i72Var) {
        int m19700v;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        String str;
        int i5;
        int i6;
        String str2;
        int i7;
        String str3;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z5;
        zzade zzactVar;
        int m18005d;
        String m5726a;
        zzade zzadkVar;
        int m19703s = ik5Var.m19703s();
        int m19703s2 = ik5Var.m19703s();
        int m19703s3 = ik5Var.m19703s();
        int m19703s4 = i >= 3 ? ik5Var.m19703s() : 0;
        if (i == 4) {
            m19700v = ik5Var.m19700v();
            if (!z) {
                m19700v = ((m19700v >> 24) << 21) | (m19700v & 255) | (((m19700v >> 8) & 255) << 7) | (((m19700v >> 16) & 255) << 14);
            }
        } else {
            m19700v = i == 3 ? ik5Var.m19700v() : ik5Var.m19701u();
        }
        int m19699w = i >= 3 ? ik5Var.m19699w() : 0;
        zzade zzadeVar = null;
        if (m19703s != 0 || m19703s2 != 0 || m19703s3 != 0 || m19703s4 != 0 || m19700v != 0 || m19699w != 0) {
            int m19711k = ik5Var.m19711k() + m19700v;
            if (m19711k > ik5Var.m19710l()) {
                s95.m10493e("Id3Decoder", "Frame size exceeds remaining tag data");
            } else if (i72Var != null) {
                ik5Var.m19716f(m19711k);
                return null;
            } else {
                if (i == 3) {
                    i3 = (m19699w & 128) != 0 ? 1 : 0;
                    boolean z6 = (m19699w & 64) != 0;
                    z2 = (m19699w & 32) != 0;
                    z3 = z6;
                    z4 = false;
                    i4 = i3;
                } else if (i == 4) {
                    boolean z7 = (m19699w & 64) != 0;
                    i4 = (m19699w & 8) != 0 ? 1 : 0;
                    z3 = (m19699w & 4) != 0;
                    z4 = (m19699w & 2) != 0;
                    int i12 = m19699w & 1;
                    z2 = z7;
                    i3 = i12;
                } else {
                    i3 = 0;
                    z2 = false;
                    i4 = 0;
                    z3 = false;
                    z4 = false;
                }
                if (i4 != 0 || z3) {
                    s95.m10493e("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
                    ik5Var.m19716f(m19711k);
                    return null;
                }
                if (z2) {
                    m19700v--;
                    ik5Var.m19715g(1);
                }
                if (i3 != 0) {
                    m19700v -= 4;
                    ik5Var.m19715g(4);
                }
                if (z4) {
                    m19700v = m18004e(ik5Var, m19700v);
                }
                try {
                    try {
                        try {
                            if (m19703s == 84 && m19703s2 == 88 && m19703s3 == 88 && (i == 2 || m19703s4 == 88)) {
                                if (m19700v > 0) {
                                    int m19703s5 = ik5Var.m19703s();
                                    String m18001h = m18001h(m19703s5);
                                    int i13 = m19700v - 1;
                                    byte[] bArr = new byte[i13];
                                    ik5Var.m19720b(bArr, 0, i13);
                                    int m18006c = m18006c(bArr, 0, m19703s5);
                                    String str4 = new String(bArr, 0, m18006c, m18001h);
                                    int m18007b = m18006c + m18007b(m19703s5);
                                    zzadkVar = new zzadm("TXXX", str4, m18002g(bArr, m18007b, m18006c(bArr, m18007b, m19703s5), m18001h));
                                    zzadeVar = zzadkVar;
                                }
                                i7 = m19703s;
                                i10 = m19703s2;
                                i9 = m19703s3;
                                str3 = "Id3Decoder";
                                i8 = m19703s4;
                                i6 = m19711k;
                            } else if (m19703s == 84) {
                                String m18000i = m18000i(i, 84, m19703s2, m19703s3, m19703s4);
                                if (m19700v > 0) {
                                    int m19703s6 = ik5Var.m19703s();
                                    String m18001h2 = m18001h(m19703s6);
                                    int i14 = m19700v - 1;
                                    byte[] bArr2 = new byte[i14];
                                    ik5Var.m19720b(bArr2, 0, i14);
                                    zzadkVar = new zzadm(m18000i, null, new String(bArr2, 0, m18006c(bArr2, 0, m19703s6), m18001h2));
                                    zzadeVar = zzadkVar;
                                }
                                i7 = m19703s;
                                i10 = m19703s2;
                                i9 = m19703s3;
                                str3 = "Id3Decoder";
                                i8 = m19703s4;
                                i6 = m19711k;
                            } else {
                                if (m19703s != 87) {
                                    i5 = m19703s;
                                } else if (m19703s2 == 88 && m19703s3 == 88 && (i == 2 || m19703s4 == 88)) {
                                    if (m19700v > 0) {
                                        int m19703s7 = ik5Var.m19703s();
                                        String m18001h3 = m18001h(m19703s7);
                                        int i15 = m19700v - 1;
                                        byte[] bArr3 = new byte[i15];
                                        ik5Var.m19720b(bArr3, 0, i15);
                                        int m18006c2 = m18006c(bArr3, 0, m19703s7);
                                        String str5 = new String(bArr3, 0, m18006c2, m18001h3);
                                        int m18007b2 = m18006c2 + m18007b(m19703s7);
                                        zzadkVar = new zzado("WXXX", str5, m18002g(bArr3, m18007b2, m18005d(bArr3, m18007b2), "ISO-8859-1"));
                                        zzadeVar = zzadkVar;
                                    }
                                    i7 = m19703s;
                                    i10 = m19703s2;
                                    i9 = m19703s3;
                                    str3 = "Id3Decoder";
                                    i8 = m19703s4;
                                    i6 = m19711k;
                                } else {
                                    i5 = 87;
                                }
                                if (i5 == 87) {
                                    String m18000i2 = m18000i(i, 87, m19703s2, m19703s3, m19703s4);
                                    byte[] bArr4 = new byte[m19700v];
                                    ik5Var.m19720b(bArr4, 0, m19700v);
                                    zzadkVar = new zzado(m18000i2, null, new String(bArr4, 0, m18005d(bArr4, 0), "ISO-8859-1"));
                                } else {
                                    if (i5 == 80) {
                                        if (m19703s2 == 82 && m19703s3 == 73 && m19703s4 == 86) {
                                            byte[] bArr5 = new byte[m19700v];
                                            ik5Var.m19720b(bArr5, 0, m19700v);
                                            int m18005d2 = m18005d(bArr5, 0);
                                            zzadkVar = new zzadk(new String(bArr5, 0, m18005d2, "ISO-8859-1"), m17998k(bArr5, m18005d2 + 1, m19700v));
                                        } else {
                                            i5 = 80;
                                        }
                                    }
                                    try {
                                    } catch (UnsupportedEncodingException unused) {
                                        str = "Id3Decoder";
                                        m19711k = i6;
                                        s95.m10493e(str, "Unsupported character encoding");
                                        ik5Var.m19716f(m19711k);
                                        return null;
                                    }
                                    try {
                                        if (i5 != 71) {
                                            i6 = m19711k;
                                        } else if (m19703s2 == 69 && m19703s3 == 79 && (m19703s4 == 66 || i == 2)) {
                                            int m19703s8 = ik5Var.m19703s();
                                            String m18001h4 = m18001h(m19703s8);
                                            int i16 = m19700v - 1;
                                            byte[] bArr6 = new byte[i16];
                                            ik5Var.m19720b(bArr6, 0, i16);
                                            int m18005d3 = m18005d(bArr6, 0);
                                            i6 = m19711k;
                                            String str6 = new String(bArr6, 0, m18005d3, "ISO-8859-1");
                                            int i17 = m18005d3 + 1;
                                            int m18006c3 = m18006c(bArr6, i17, m19703s8);
                                            String m18002g = m18002g(bArr6, i17, m18006c3, m18001h4);
                                            int m18007b3 = m18006c3 + m18007b(m19703s8);
                                            int m18006c4 = m18006c(bArr6, m18007b3, m19703s8);
                                            zzade zzaczVar = new zzacz(str6, m18002g, m18002g(bArr6, m18007b3, m18006c4, m18001h4), m17998k(bArr6, m18006c4 + m18007b(m19703s8), i16));
                                            i7 = m19703s;
                                            i10 = m19703s2;
                                            i9 = m19703s3;
                                            zzadeVar = zzaczVar;
                                            str3 = "Id3Decoder";
                                            i8 = m19703s4;
                                        } else {
                                            i6 = m19711k;
                                            i5 = 71;
                                        }
                                        if (i == 2) {
                                            if (i5 == 80 && m19703s2 == 73 && m19703s3 == 67) {
                                                int m19703s9 = ik5Var.m19703s();
                                                String m18001h5 = m18001h(m19703s9);
                                                int i18 = m19700v - 1;
                                                byte[] bArr7 = new byte[i18];
                                                ik5Var.m19720b(bArr7, 0, i18);
                                                if (i == 2) {
                                                    m5726a = "image/".concat(String.valueOf(wx6.m5726a(new String(bArr7, 0, 3, "ISO-8859-1"))));
                                                    if ("image/jpg".equals(m5726a)) {
                                                        m5726a = "image/jpeg";
                                                    }
                                                    m18005d = 2;
                                                } else {
                                                    m18005d = m18005d(bArr7, 0);
                                                    m5726a = wx6.m5726a(new String(bArr7, 0, m18005d, "ISO-8859-1"));
                                                    if (m5726a.indexOf(47) == -1) {
                                                        m5726a = "image/".concat(m5726a);
                                                    }
                                                }
                                                int i19 = bArr7[m18005d + 1] & 255;
                                                int i20 = m18005d + 2;
                                                int m18006c5 = m18006c(bArr7, i20, m19703s9);
                                                str3 = "Id3Decoder";
                                                i7 = m19703s;
                                                zzactVar = new zzacp(m5726a, new String(bArr7, i20, m18006c5 - i20, m18001h5), i19, m17998k(bArr7, m18006c5 + m18007b(m19703s9), i18));
                                                zzadeVar = zzactVar;
                                                i10 = m19703s2;
                                                i9 = m19703s3;
                                                i8 = m19703s4;
                                            }
                                            i7 = m19703s;
                                            str3 = "Id3Decoder";
                                            if (i5 != 67 && m19703s2 == 79 && m19703s3 == 77 && (m19703s4 == 77 || i == 2)) {
                                                if (m19700v < 4) {
                                                    i10 = m19703s2;
                                                    i9 = m19703s3;
                                                    i8 = m19703s4;
                                                    zzadeVar = null;
                                                } else {
                                                    int m19703s10 = ik5Var.m19703s();
                                                    String m18001h6 = m18001h(m19703s10);
                                                    byte[] bArr8 = new byte[3];
                                                    ik5Var.m19720b(bArr8, 0, 3);
                                                    String str7 = new String(bArr8, 0, 3);
                                                    int i21 = m19700v - 4;
                                                    byte[] bArr9 = new byte[i21];
                                                    ik5Var.m19720b(bArr9, 0, i21);
                                                    int m18006c6 = m18006c(bArr9, 0, m19703s10);
                                                    String str8 = new String(bArr9, 0, m18006c6, m18001h6);
                                                    int m18007b4 = m18006c6 + m18007b(m19703s10);
                                                    zzactVar = new zzacx(str7, str8, m18002g(bArr9, m18007b4, m18006c(bArr9, m18007b4, m19703s10), m18001h6));
                                                    zzadeVar = zzactVar;
                                                    i10 = m19703s2;
                                                    i9 = m19703s3;
                                                    i8 = m19703s4;
                                                }
                                            } else if (i5 != 67 && m19703s2 == 72 && m19703s3 == 65 && m19703s4 == 80) {
                                                int m19711k2 = ik5Var.m19711k();
                                                int m18005d4 = m18005d(ik5Var.m19714h(), m19711k2);
                                                String str9 = new String(ik5Var.m19714h(), m19711k2, m18005d4 - m19711k2, "ISO-8859-1");
                                                ik5Var.m19716f(m18005d4 + 1);
                                                int m19709m = ik5Var.m19709m();
                                                int m19709m2 = ik5Var.m19709m();
                                                long m19729A = ik5Var.m19729A();
                                                if (m19729A == 4294967295L) {
                                                    m19729A = -1;
                                                }
                                                long j = m19729A;
                                                long m19729A2 = ik5Var.m19729A();
                                                if (m19729A2 == 4294967295L) {
                                                    m19729A2 = -1;
                                                }
                                                long j2 = m19729A2;
                                                ArrayList arrayList = new ArrayList();
                                                int i22 = m19711k2 + m19700v;
                                                while (ik5Var.m19711k() < i22) {
                                                    zzade m18003f = m18003f(i, ik5Var, z, i2, null);
                                                    if (m18003f != null) {
                                                        arrayList.add(m18003f);
                                                    }
                                                }
                                                zzactVar = new zzact(str9, m19709m, m19709m2, j, j2, (zzade[]) arrayList.toArray(new zzade[0]));
                                                zzadeVar = zzactVar;
                                                i10 = m19703s2;
                                                i9 = m19703s3;
                                                i8 = m19703s4;
                                            } else if (i5 != 67 && m19703s2 == 84 && m19703s3 == 79 && m19703s4 == 67) {
                                                int m19711k3 = ik5Var.m19711k();
                                                int m18005d5 = m18005d(ik5Var.m19714h(), m19711k3);
                                                String str10 = new String(ik5Var.m19714h(), m19711k3, m18005d5 - m19711k3, "ISO-8859-1");
                                                ik5Var.m19716f(m18005d5 + 1);
                                                int m19703s11 = ik5Var.m19703s();
                                                if ((m19703s11 & 2) != 0) {
                                                    i11 = 1;
                                                    z5 = true;
                                                } else {
                                                    i11 = 1;
                                                    z5 = false;
                                                }
                                                int i23 = m19703s11 & i11;
                                                int m19703s12 = ik5Var.m19703s();
                                                String[] strArr = new String[m19703s12];
                                                int i24 = 0;
                                                while (i24 < m19703s12) {
                                                    int m19711k4 = ik5Var.m19711k();
                                                    int i25 = m19703s12;
                                                    int m18005d6 = m18005d(ik5Var.m19714h(), m19711k4);
                                                    strArr[i24] = new String(ik5Var.m19714h(), m19711k4, m18005d6 - m19711k4, "ISO-8859-1");
                                                    ik5Var.m19716f(m18005d6 + 1);
                                                    i24++;
                                                    m19703s12 = i25;
                                                    m19703s4 = m19703s4;
                                                    m19703s3 = m19703s3;
                                                    m19703s2 = m19703s2;
                                                }
                                                int i26 = m19703s2;
                                                int i27 = m19703s3;
                                                int i28 = m19703s4;
                                                ArrayList arrayList2 = new ArrayList();
                                                int i29 = m19711k3 + m19700v;
                                                while (ik5Var.m19711k() < i29) {
                                                    zzade m18003f2 = m18003f(i, ik5Var, z, i2, null);
                                                    if (m18003f2 != null) {
                                                        arrayList2.add(m18003f2);
                                                    }
                                                }
                                                zzadeVar = new zzacv(str10, z5, 1 == i23, strArr, (zzade[]) arrayList2.toArray(new zzade[0]));
                                                i8 = i28;
                                                i9 = i27;
                                                i10 = i26;
                                            } else {
                                                int i30 = m19703s4;
                                                if (i5 != 77) {
                                                    i10 = m19703s2;
                                                    if (i10 == 76) {
                                                        i9 = m19703s3;
                                                        i8 = i30;
                                                        if (i9 == 76 && i8 == 84) {
                                                            int m19699w2 = ik5Var.m19699w();
                                                            int m19701u = ik5Var.m19701u();
                                                            int m19701u2 = ik5Var.m19701u();
                                                            int m19703s13 = ik5Var.m19703s();
                                                            int m19703s14 = ik5Var.m19703s();
                                                            cj5 cj5Var = new cj5();
                                                            cj5Var.m25325g(ik5Var.m19714h(), ik5Var.m19710l());
                                                            cj5Var.m25324h(ik5Var.m19711k() * 8);
                                                            int i31 = ((m19700v - 10) * 8) / (m19703s13 + m19703s14);
                                                            int[] iArr = new int[i31];
                                                            int[] iArr2 = new int[i31];
                                                            for (int i32 = 0; i32 < i31; i32++) {
                                                                int m25329c = cj5Var.m25329c(m19703s13);
                                                                int m25329c2 = cj5Var.m25329c(m19703s14);
                                                                iArr[i32] = m25329c;
                                                                iArr2[i32] = m25329c2;
                                                            }
                                                            zzadeVar = new zzadi(m19699w2, m19701u, m19701u2, iArr, iArr2);
                                                        }
                                                    } else {
                                                        i8 = i30;
                                                        i9 = m19703s3;
                                                    }
                                                } else {
                                                    i8 = i30;
                                                    i9 = m19703s3;
                                                    i10 = m19703s2;
                                                }
                                                String m18000i3 = m18000i(i, i5, i10, i9, i8);
                                                byte[] bArr10 = new byte[m19700v];
                                                ik5Var.m19720b(bArr10, 0, m19700v);
                                                zzadeVar = new zzacr(m18000i3, bArr10);
                                            }
                                        } else {
                                            if (i5 == 65) {
                                                if (m19703s2 == 80) {
                                                    if (m19703s3 == 73) {
                                                    }
                                                }
                                            }
                                            i7 = m19703s;
                                            str3 = "Id3Decoder";
                                            if (i5 != 67) {
                                            }
                                            if (i5 != 67) {
                                            }
                                            if (i5 != 67) {
                                            }
                                            int i302 = m19703s4;
                                            if (i5 != 77) {
                                            }
                                            String m18000i32 = m18000i(i, i5, i10, i9, i8);
                                            byte[] bArr102 = new byte[m19700v];
                                            ik5Var.m19720b(bArr102, 0, m19700v);
                                            zzadeVar = new zzacr(m18000i32, bArr102);
                                        }
                                    } catch (UnsupportedEncodingException unused2) {
                                        m19711k = i6;
                                        str = str2;
                                        s95.m10493e(str, "Unsupported character encoding");
                                        ik5Var.m19716f(m19711k);
                                        return null;
                                    }
                                }
                                zzadeVar = zzadkVar;
                                i7 = m19703s;
                                i10 = m19703s2;
                                i9 = m19703s3;
                                str3 = "Id3Decoder";
                                i8 = m19703s4;
                                i6 = m19711k;
                            }
                            if (zzadeVar == null) {
                                try {
                                    str = str3;
                                } catch (UnsupportedEncodingException unused3) {
                                    str = str3;
                                }
                                try {
                                    s95.m10493e(str, "Failed to decode frame: id=" + m18000i(i, i7, i10, i9, i8) + ", frameSize=" + m19700v);
                                } catch (UnsupportedEncodingException unused4) {
                                    m19711k = i6;
                                    s95.m10493e(str, "Unsupported character encoding");
                                    ik5Var.m19716f(m19711k);
                                    return null;
                                }
                            }
                            ik5Var.m19716f(i6);
                            return zzadeVar;
                        } catch (Throwable th) {
                            th = th;
                            m19711k = i6;
                            ik5Var.m19716f(m19711k);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        ik5Var.m19716f(m19711k);
                        throw th;
                    }
                } catch (UnsupportedEncodingException unused5) {
                    str = "Id3Decoder";
                }
            }
        }
        ik5Var.m19716f(ik5Var.m19710l());
        return null;
    }

    /* renamed from: g */
    public static String m18002g(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* renamed from: h */
    public static String m18001h(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: i */
    public static String m18000i(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
        if ((r10 & 128) != 0) goto L31;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m17999j(ik5 ik5Var, int i, int i2, boolean z) {
        int m19701u;
        long m19701u2;
        int i3;
        int i4;
        int m19711k = ik5Var.m19711k();
        while (true) {
            try {
                if (ik5Var.m19713i() < i2) {
                    return true;
                }
                if (i >= 3) {
                    m19701u = ik5Var.m19709m();
                    m19701u2 = ik5Var.m19729A();
                    i3 = ik5Var.m19699w();
                } else {
                    m19701u = ik5Var.m19701u();
                    m19701u2 = ik5Var.m19701u();
                    i3 = 0;
                }
                if (m19701u == 0 && m19701u2 == 0 && i3 == 0) {
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & m19701u2) != 0) {
                        return false;
                    }
                    m19701u2 = ((m19701u2 >> 24) << 21) | ((255 & (m19701u2 >> 16)) << 14) | (m19701u2 & 255) | (((m19701u2 >> 8) & 255) << 7);
                }
                if (i == 4) {
                    r4 = i3 & 1;
                    i4 = (i3 & 64) == 0 ? 0 : 1;
                } else {
                    if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                    } else {
                        i4 = 0;
                    }
                    r4 = 0;
                }
                if (r4 != 0) {
                    i4 += 4;
                }
                if (m19701u2 < i4) {
                    return false;
                }
                if (ik5Var.m19713i() < m19701u2) {
                    return false;
                }
                ik5Var.m19715g((int) m19701u2);
            } finally {
                ik5Var.m19716f(m19711k);
            }
        }
    }

    /* renamed from: k */
    public static byte[] m17998k(byte[] bArr, int i, int i2) {
        return i2 <= i ? it5.f13996f : Arrays.copyOfRange(bArr, i, i2);
    }
}
