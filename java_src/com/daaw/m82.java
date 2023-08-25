package com.daaw;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzx;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class m82 {

    /* renamed from: N */
    public byte[] f18615N;

    /* renamed from: T */
    public n42 f18621T;

    /* renamed from: U */
    public boolean f18622U;

    /* renamed from: X */
    public m42 f18625X;

    /* renamed from: Y */
    public int f18626Y;

    /* renamed from: a */
    public String f18627a;

    /* renamed from: b */
    public String f18628b;

    /* renamed from: c */
    public int f18629c;

    /* renamed from: d */
    public int f18630d;

    /* renamed from: e */
    public int f18631e;

    /* renamed from: f */
    public int f18632f;

    /* renamed from: g */
    public int f18633g;

    /* renamed from: h */
    public boolean f18634h;

    /* renamed from: i */
    public byte[] f18635i;

    /* renamed from: j */
    public l42 f18636j;

    /* renamed from: k */
    public byte[] f18637k;

    /* renamed from: l */
    public zzx f18638l;

    /* renamed from: m */
    public int f18639m = -1;

    /* renamed from: n */
    public int f18640n = -1;

    /* renamed from: o */
    public int f18641o = -1;

    /* renamed from: p */
    public int f18642p = -1;

    /* renamed from: q */
    public int f18643q = 0;

    /* renamed from: r */
    public int f18644r = -1;

    /* renamed from: s */
    public float f18645s = 0.0f;

    /* renamed from: t */
    public float f18646t = 0.0f;

    /* renamed from: u */
    public float f18647u = 0.0f;

    /* renamed from: v */
    public byte[] f18648v = null;

    /* renamed from: w */
    public int f18649w = -1;

    /* renamed from: x */
    public boolean f18650x = false;

    /* renamed from: y */
    public int f18651y = -1;

    /* renamed from: z */
    public int f18652z = -1;

    /* renamed from: A */
    public int f18602A = -1;

    /* renamed from: B */
    public int f18603B = 1000;

    /* renamed from: C */
    public int f18604C = 200;

    /* renamed from: D */
    public float f18605D = -1.0f;

    /* renamed from: E */
    public float f18606E = -1.0f;

    /* renamed from: F */
    public float f18607F = -1.0f;

    /* renamed from: G */
    public float f18608G = -1.0f;

    /* renamed from: H */
    public float f18609H = -1.0f;

    /* renamed from: I */
    public float f18610I = -1.0f;

    /* renamed from: J */
    public float f18611J = -1.0f;

    /* renamed from: K */
    public float f18612K = -1.0f;

    /* renamed from: L */
    public float f18613L = -1.0f;

    /* renamed from: M */
    public float f18614M = -1.0f;

    /* renamed from: O */
    public int f18616O = 1;

    /* renamed from: P */
    public int f18617P = -1;

    /* renamed from: Q */
    public int f18618Q = 8000;

    /* renamed from: R */
    public long f18619R = 0;

    /* renamed from: S */
    public long f18620S = 0;

    /* renamed from: V */
    public boolean f18623V = true;

    /* renamed from: W */
    public String f18624W = "eng";

    /* renamed from: f */
    public static Pair m16172f(ik5 ik5Var) {
        try {
            ik5Var.m19715g(16);
            long m19697y = ik5Var.m19697y();
            if (m19697y == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (m19697y == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (m19697y != 826496599) {
                s95.m10493e("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int m19711k = ik5Var.m19711k() + 20;
            byte[] m19714h = ik5Var.m19714h();
            while (true) {
                int length = m19714h.length;
                if (m19711k >= length - 4) {
                    throw dl3.m24267a("Failed to find FourCC VC1 initialization data", null);
                }
                if (m19714h[m19711k] == 0 && m19714h[m19711k + 1] == 0 && m19714h[m19711k + 2] == 1 && m19714h[m19711k + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(m19714h, m19711k, length)));
                }
                m19711k++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw dl3.m24267a("Error parsing FourCC private data", null);
        }
    }

    /* renamed from: g */
    public static List m16171g(byte[] bArr) {
        int i;
        int i2;
        try {
            if (bArr[0] == 2) {
                int i3 = 1;
                int i4 = 0;
                while (true) {
                    i = bArr[i3] & 255;
                    if (i != 255) {
                        break;
                    }
                    i4 += 255;
                    i3++;
                }
                int i5 = i3 + 1;
                int i6 = i4 + i;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5] & 255;
                    if (i2 != 255) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + i2;
                if (bArr[i8] == 1) {
                    byte[] bArr2 = new byte[i6];
                    System.arraycopy(bArr, i8, bArr2, 0, i6);
                    int i10 = i8 + i6;
                    if (bArr[i10] == 3) {
                        int i11 = i10 + i9;
                        if (bArr[i11] == 5) {
                            int length = bArr.length - i11;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i11, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw dl3.m24267a("Error parsing vorbis codec private", null);
                    }
                    throw dl3.m24267a("Error parsing vorbis codec private", null);
                }
                throw dl3.m24267a("Error parsing vorbis codec private", null);
            }
            throw dl3.m24267a("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw dl3.m24267a("Error parsing vorbis codec private", null);
        }
    }

    /* renamed from: h */
    public static boolean m16170h(ik5 ik5Var) {
        UUID uuid;
        UUID uuid2;
        try {
            int m19705q = ik5Var.m19705q();
            if (m19705q == 1) {
                return true;
            }
            if (m19705q == 65534) {
                ik5Var.m19716f(24);
                long m19696z = ik5Var.m19696z();
                uuid = n82.f19651h0;
                if (m19696z == uuid.getMostSignificantBits()) {
                    long m19696z2 = ik5Var.m19696z();
                    uuid2 = n82.f19651h0;
                    if (m19696z2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw dl3.m24267a("Error parsing MS/ACM codec private", null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    /* renamed from: e */
    public final void m16173e(m09 m09Var, int i) {
        char c;
        List singletonList;
        List list;
        String str;
        int i2;
        String str2;
        String str3;
        int i3;
        StringBuilder sb;
        String str4;
        byte[] bArr;
        int i4;
        int i5;
        Map map;
        Map map2;
        int i6;
        Map map3;
        f09 m22974a;
        String str5 = this.f18628b;
        int i7 = 1;
        int i8 = 4;
        int i9 = 0;
        switch (str5.hashCode()) {
            case -2095576542:
                if (str5.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str5.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str5.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str5.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str5.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str5.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str5.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str5.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str5.equals("S_DVBSUB")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str5.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str5.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str5.equals("S_VOBSUB")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str5.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str5.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str5.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str5.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str5.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str5.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str5.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str5.equals("S_HDMV/PGS")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str5.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str5.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str5.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str5.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str5.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str5.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str5.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str5.equals("S_TEXT/WEBVTT")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str5.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str5.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str5.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str5.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str5.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str6 = "audio/raw";
        mo8 mo8Var = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        byte[] bArr2 = null;
        switch (c) {
            case 0:
                str6 = "video/x-vnd.on2.vp8";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 1:
                str6 = "video/x-vnd.on2.vp9";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 2:
                str6 = "video/av01";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 3:
                str6 = "video/mpeg2";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 4:
            case 5:
            case 6:
                byte[] bArr3 = this.f18637k;
                singletonList = bArr3 == null ? null : Collections.singletonList(bArr3);
                str6 = "video/mp4v-es";
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 7:
                gz8 m21127a = gz8.m21127a(new ik5(m16169i(str5)));
                list = m21127a.f11899a;
                this.f18626Y = m21127a.f11900b;
                str = m21127a.f11904f;
                str6 = "video/avc";
                i2 = -1;
                i8 = -1;
                List list2 = list;
                str2 = str;
                singletonList = list2;
                break;
            case '\b':
                z09 m3003a = z09.m3003a(new ik5(m16169i(str5)));
                list = m3003a.f34320a;
                this.f18626Y = m3003a.f34321b;
                str = m3003a.f34323d;
                str6 = "video/hevc";
                i2 = -1;
                i8 = -1;
                List list22 = list;
                str2 = str;
                singletonList = list22;
                break;
            case '\t':
                Pair m16172f = m16172f(new ik5(m16169i(str5)));
                str6 = (String) m16172f.first;
                singletonList = (List) m16172f.second;
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case '\n':
                str6 = "video/x-unknown";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 11:
                singletonList = m16171g(m16169i(str5));
                str6 = "audio/vorbis";
                str2 = null;
                i2 = 8192;
                i8 = -1;
                break;
            case '\f':
                singletonList = new ArrayList(3);
                singletonList.add(m16169i(this.f18628b));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                singletonList.add(allocate.order(byteOrder).putLong(this.f18619R).array());
                singletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f18620S).array());
                str6 = "audio/opus";
                str2 = null;
                i2 = 5760;
                i8 = -1;
                break;
            case '\r':
                singletonList = Collections.singletonList(m16169i(str5));
                yy8 m1766a = zy8.m1766a(this.f18637k);
                this.f18618Q = m1766a.f34266a;
                this.f18616O = m1766a.f34267b;
                str2 = m1766a.f34268c;
                str6 = "audio/mp4a-latm";
                i2 = -1;
                i8 = -1;
                break;
            case 14:
                str6 = "audio/mpeg-L2";
                singletonList = null;
                str2 = null;
                i2 = 4096;
                i8 = -1;
                break;
            case 15:
                str6 = "audio/mpeg";
                singletonList = null;
                str2 = null;
                i2 = 4096;
                i8 = -1;
                break;
            case 16:
                str6 = "audio/ac3";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 17:
                str6 = "audio/eac3";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 18:
                this.f18621T = new n42();
                str6 = "audio/true-hd";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 19:
            case 20:
                str6 = "audio/vnd.dts";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 21:
                str6 = "audio/vnd.dts.hd";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 22:
                singletonList = Collections.singletonList(m16169i(str5));
                str6 = "audio/flac";
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 23:
                if (m16170h(new ik5(m16169i(str5)))) {
                    i8 = it5.m19408X(this.f18617P);
                    if (i8 == 0) {
                        i3 = this.f18617P;
                        sb = new StringBuilder();
                        str4 = "Unsupported PCM bit depth: ";
                        sb.append(str4);
                        sb.append(i3);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        str3 = sb.toString();
                        s95.m10493e("MatroskaExtractor", str3);
                        singletonList = null;
                        str2 = null;
                        str6 = "audio/x-unknown";
                        i2 = -1;
                        i8 = -1;
                        break;
                    }
                    singletonList = null;
                    str2 = null;
                    i2 = -1;
                    break;
                } else {
                    str3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
                    s95.m10493e("MatroskaExtractor", str3);
                    singletonList = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i2 = -1;
                    i8 = -1;
                }
            case 24:
                i8 = it5.m19408X(this.f18617P);
                if (i8 == 0) {
                    i3 = this.f18617P;
                    sb = new StringBuilder();
                    str4 = "Unsupported little endian PCM bit depth: ";
                    sb.append(str4);
                    sb.append(i3);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    str3 = sb.toString();
                    s95.m10493e("MatroskaExtractor", str3);
                    singletonList = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i2 = -1;
                    i8 = -1;
                    break;
                }
                singletonList = null;
                str2 = null;
                i2 = -1;
                break;
            case 25:
                i3 = this.f18617P;
                if (i3 != 8) {
                    if (i3 != 16) {
                        sb = new StringBuilder();
                        str4 = "Unsupported big endian PCM bit depth: ";
                        sb.append(str4);
                        sb.append(i3);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        str3 = sb.toString();
                        s95.m10493e("MatroskaExtractor", str3);
                        singletonList = null;
                        str2 = null;
                        str6 = "audio/x-unknown";
                        i2 = -1;
                        i8 = -1;
                        break;
                    } else {
                        i8 = 268435456;
                        singletonList = null;
                        str2 = null;
                        i2 = -1;
                        break;
                    }
                } else {
                    singletonList = null;
                    str2 = null;
                    i2 = -1;
                    i8 = 3;
                    break;
                }
            case 26:
                i3 = this.f18617P;
                if (i3 != 32) {
                    sb = new StringBuilder();
                    str4 = "Unsupported floating point PCM bit depth: ";
                    sb.append(str4);
                    sb.append(i3);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    str3 = sb.toString();
                    s95.m10493e("MatroskaExtractor", str3);
                    singletonList = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i2 = -1;
                    i8 = -1;
                    break;
                }
                singletonList = null;
                str2 = null;
                i2 = -1;
                break;
            case 27:
                str6 = "application/x-subrip";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 28:
                bArr = n82.f19648e0;
                singletonList = y17.m4258w(bArr, m16169i(this.f18628b));
                str2 = null;
                str6 = "text/x-ssa";
                i2 = -1;
                i8 = -1;
                break;
            case 29:
                singletonList = null;
                str2 = null;
                str6 = "text/vtt";
                i2 = -1;
                i8 = -1;
                break;
            case 30:
                singletonList = y17.m4259v(m16169i(str5));
                str6 = "application/vobsub";
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 31:
                str6 = "application/pgs";
                singletonList = null;
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case ' ':
                byte[] bArr4 = new byte[4];
                System.arraycopy(m16169i(str5), 0, bArr4, 0, 4);
                singletonList = y17.m4259v(bArr4);
                str6 = "application/dvbsubs";
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            default:
                throw dl3.m24267a("Unrecognized codec identifier.", null);
        }
        byte[] bArr5 = this.f18615N;
        if (bArr5 != null && (m22974a = f09.m22974a(new ik5(bArr5))) != null) {
            str2 = m22974a.f8987a;
            str6 = "video/dolby-vision";
        }
        String str7 = str6;
        int i10 = (this.f18623V ? 1 : 0) | (true != this.f18622U ? 0 : 2);
        b72 b72Var = new b72();
        if (ak3.m27383g(str7)) {
            b72Var.m26389e0(this.f18616O);
            b72Var.m26371t(this.f18618Q);
            b72Var.m26377n(i8);
        } else if (ak3.m27382h(str7)) {
            if (this.f18643q == 0) {
                int i11 = this.f18641o;
                i4 = -1;
                if (i11 == -1) {
                    i11 = this.f18639m;
                }
                this.f18641o = i11;
                int i12 = this.f18642p;
                if (i12 == -1) {
                    i12 = this.f18640n;
                }
                this.f18642p = i12;
            } else {
                i4 = -1;
            }
            float f = (this.f18641o == i4 || (i6 = this.f18642p) == i4) ? -1.0f : (this.f18640n * i5) / (this.f18639m * i6);
            if (this.f18650x) {
                if (this.f18605D != -1.0f && this.f18606E != -1.0f && this.f18607F != -1.0f && this.f18608G != -1.0f && this.f18609H != -1.0f && this.f18610I != -1.0f && this.f18611J != -1.0f && this.f18612K != -1.0f && this.f18613L != -1.0f && this.f18614M != -1.0f) {
                    bArr2 = new byte[25];
                    ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                    order.put((byte) 0);
                    order.putShort((short) ((this.f18605D * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.f18606E * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.f18607F * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.f18608G * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.f18609H * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.f18610I * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.f18611J * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.f18612K * 50000.0f) + 0.5f));
                    order.putShort((short) (this.f18613L + 0.5f));
                    order.putShort((short) (this.f18614M + 0.5f));
                    order.putShort((short) this.f18603B);
                    order.putShort((short) this.f18604C);
                }
                mo8Var = new mo8(this.f18651y, this.f18602A, this.f18652z, bArr2);
            }
            if (this.f18627a != null) {
                map = n82.f19652i0;
                if (map.containsKey(this.f18627a)) {
                    map2 = n82.f19652i0;
                    i4 = ((Integer) map2.get(this.f18627a)).intValue();
                }
            }
            if (this.f18644r == 0 && Float.compare(this.f18645s, 0.0f) == 0 && Float.compare(this.f18646t, 0.0f) == 0) {
                if (Float.compare(this.f18647u, 0.0f) != 0) {
                    if (Float.compare(this.f18646t, 90.0f) == 0) {
                        i9 = 90;
                    } else if (Float.compare(this.f18646t, -180.0f) == 0 || Float.compare(this.f18646t, 180.0f) == 0) {
                        i9 = 180;
                    } else if (Float.compare(this.f18646t, -90.0f) == 0) {
                        i9 = 270;
                    }
                }
                b72Var.m26367x(this.f18639m);
                b72Var.m26388f(this.f18640n);
                b72Var.m26375p(f);
                b72Var.m26373r(i9);
                b72Var.m26374q(this.f18648v);
                b72Var.m26369v(this.f18649w);
                b72Var.m26385g0(mo8Var);
                i7 = 2;
            }
            i9 = i4;
            b72Var.m26367x(this.f18639m);
            b72Var.m26388f(this.f18640n);
            b72Var.m26375p(f);
            b72Var.m26373r(i9);
            b72Var.m26374q(this.f18648v);
            b72Var.m26369v(this.f18649w);
            b72Var.m26385g0(mo8Var);
            i7 = 2;
        } else if (!"application/x-subrip".equals(str7) && !"text/x-ssa".equals(str7) && !"text/vtt".equals(str7) && !"application/vobsub".equals(str7) && !"application/pgs".equals(str7) && !"application/dvbsubs".equals(str7)) {
            throw dl3.m24267a("Unexpected MIME type.", null);
        } else {
            i7 = 3;
        }
        if (this.f18627a != null) {
            map3 = n82.f19652i0;
            if (!map3.containsKey(this.f18627a)) {
                b72Var.m26381j(this.f18627a);
            }
        }
        b72Var.m26386g(i);
        b72Var.m26372s(str7);
        b72Var.m26379l(i2);
        b72Var.m26380k(this.f18624W);
        b72Var.m26370u(i10);
        b72Var.m26382i(singletonList);
        b72Var.m26387f0(str2);
        b72Var.m26396b(this.f18638l);
        f92 m26366y = b72Var.m26366y();
        m42 mo3292n = m09Var.mo3292n(this.f18629c, i7);
        this.f18625X = mo3292n;
        mo3292n.mo16218f(m26366y);
    }

    @EnsuresNonNull({"codecPrivate"})
    /* renamed from: i */
    public final byte[] m16169i(String str) {
        byte[] bArr = this.f18637k;
        if (bArr != null) {
            return bArr;
        }
        throw dl3.m24267a("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }
}
