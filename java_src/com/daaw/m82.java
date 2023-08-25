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
    public byte[] N;
    public n42 T;
    public boolean U;
    public m42 X;
    public int Y;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public byte[] i;
    public l42 j;
    public byte[] k;
    public zzx l;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = 0;
    public int r = -1;
    public float s = 0.0f;
    public float t = 0.0f;
    public float u = 0.0f;
    public byte[] v = null;
    public int w = -1;
    public boolean x = false;
    public int y = -1;
    public int z = -1;
    public int A = -1;
    public int B = 1000;
    public int C = 200;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public int O = 1;
    public int P = -1;
    public int Q = 8000;
    public long R = 0;
    public long S = 0;
    public boolean V = true;
    public String W = "eng";

    public static Pair f(ik5 ik5Var) {
        try {
            ik5Var.g(16);
            long y = ik5Var.y();
            if (y == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (y == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (y != 826496599) {
                s95.e("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int k = ik5Var.k() + 20;
            byte[] h = ik5Var.h();
            while (true) {
                int length = h.length;
                if (k >= length - 4) {
                    throw dl3.a("Failed to find FourCC VC1 initialization data", null);
                }
                if (h[k] == 0 && h[k + 1] == 0 && h[k + 2] == 1 && h[k + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(h, k, length)));
                }
                k++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw dl3.a("Error parsing FourCC private data", null);
        }
    }

    public static List g(byte[] bArr) {
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
                        throw dl3.a("Error parsing vorbis codec private", null);
                    }
                    throw dl3.a("Error parsing vorbis codec private", null);
                }
                throw dl3.a("Error parsing vorbis codec private", null);
            }
            throw dl3.a("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw dl3.a("Error parsing vorbis codec private", null);
        }
    }

    public static boolean h(ik5 ik5Var) {
        UUID uuid;
        UUID uuid2;
        try {
            int q = ik5Var.q();
            if (q == 1) {
                return true;
            }
            if (q == 65534) {
                ik5Var.f(24);
                long z = ik5Var.z();
                uuid = n82.h0;
                if (z == uuid.getMostSignificantBits()) {
                    long z2 = ik5Var.z();
                    uuid2 = n82.h0;
                    if (z2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw dl3.a("Error parsing MS/ACM codec private", null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    public final void e(m09 m09Var, int i) {
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
        f09 a;
        String str5 = this.b;
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
                byte[] bArr3 = this.k;
                singletonList = bArr3 == null ? null : Collections.singletonList(bArr3);
                str6 = "video/mp4v-es";
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 7:
                gz8 a2 = gz8.a(new ik5(i(str5)));
                list = a2.a;
                this.Y = a2.b;
                str = a2.f;
                str6 = "video/avc";
                i2 = -1;
                i8 = -1;
                List list2 = list;
                str2 = str;
                singletonList = list2;
                break;
            case '\b':
                z09 a3 = z09.a(new ik5(i(str5)));
                list = a3.a;
                this.Y = a3.b;
                str = a3.d;
                str6 = "video/hevc";
                i2 = -1;
                i8 = -1;
                List list22 = list;
                str2 = str;
                singletonList = list22;
                break;
            case '\t':
                Pair f = f(new ik5(i(str5)));
                str6 = (String) f.first;
                singletonList = (List) f.second;
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
                singletonList = g(i(str5));
                str6 = "audio/vorbis";
                str2 = null;
                i2 = 8192;
                i8 = -1;
                break;
            case '\f':
                singletonList = new ArrayList(3);
                singletonList.add(i(this.b));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                singletonList.add(allocate.order(byteOrder).putLong(this.R).array());
                singletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.S).array());
                str6 = "audio/opus";
                str2 = null;
                i2 = 5760;
                i8 = -1;
                break;
            case '\r':
                singletonList = Collections.singletonList(i(str5));
                yy8 a4 = zy8.a(this.k);
                this.Q = a4.a;
                this.O = a4.b;
                str2 = a4.c;
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
                this.T = new n42();
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
                singletonList = Collections.singletonList(i(str5));
                str6 = "audio/flac";
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            case 23:
                if (h(new ik5(i(str5)))) {
                    i8 = it5.X(this.P);
                    if (i8 == 0) {
                        i3 = this.P;
                        sb = new StringBuilder();
                        str4 = "Unsupported PCM bit depth: ";
                        sb.append(str4);
                        sb.append(i3);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        str3 = sb.toString();
                        s95.e("MatroskaExtractor", str3);
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
                    s95.e("MatroskaExtractor", str3);
                    singletonList = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i2 = -1;
                    i8 = -1;
                }
            case 24:
                i8 = it5.X(this.P);
                if (i8 == 0) {
                    i3 = this.P;
                    sb = new StringBuilder();
                    str4 = "Unsupported little endian PCM bit depth: ";
                    sb.append(str4);
                    sb.append(i3);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    str3 = sb.toString();
                    s95.e("MatroskaExtractor", str3);
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
                i3 = this.P;
                if (i3 != 8) {
                    if (i3 != 16) {
                        sb = new StringBuilder();
                        str4 = "Unsupported big endian PCM bit depth: ";
                        sb.append(str4);
                        sb.append(i3);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        str3 = sb.toString();
                        s95.e("MatroskaExtractor", str3);
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
                i3 = this.P;
                if (i3 != 32) {
                    sb = new StringBuilder();
                    str4 = "Unsupported floating point PCM bit depth: ";
                    sb.append(str4);
                    sb.append(i3);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    str3 = sb.toString();
                    s95.e("MatroskaExtractor", str3);
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
                bArr = n82.e0;
                singletonList = y17.w(bArr, i(this.b));
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
                singletonList = y17.v(i(str5));
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
                System.arraycopy(i(str5), 0, bArr4, 0, 4);
                singletonList = y17.v(bArr4);
                str6 = "application/dvbsubs";
                str2 = null;
                i2 = -1;
                i8 = -1;
                break;
            default:
                throw dl3.a("Unrecognized codec identifier.", null);
        }
        byte[] bArr5 = this.N;
        if (bArr5 != null && (a = f09.a(new ik5(bArr5))) != null) {
            str2 = a.a;
            str6 = "video/dolby-vision";
        }
        String str7 = str6;
        int i10 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
        b72 b72Var = new b72();
        if (ak3.g(str7)) {
            b72Var.e0(this.O);
            b72Var.t(this.Q);
            b72Var.n(i8);
        } else if (ak3.h(str7)) {
            if (this.q == 0) {
                int i11 = this.o;
                i4 = -1;
                if (i11 == -1) {
                    i11 = this.m;
                }
                this.o = i11;
                int i12 = this.p;
                if (i12 == -1) {
                    i12 = this.n;
                }
                this.p = i12;
            } else {
                i4 = -1;
            }
            float f2 = (this.o == i4 || (i6 = this.p) == i4) ? -1.0f : (this.n * i5) / (this.m * i6);
            if (this.x) {
                if (this.D != -1.0f && this.E != -1.0f && this.F != -1.0f && this.G != -1.0f && this.H != -1.0f && this.I != -1.0f && this.J != -1.0f && this.K != -1.0f && this.L != -1.0f && this.M != -1.0f) {
                    bArr2 = new byte[25];
                    ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                    order.put((byte) 0);
                    order.putShort((short) ((this.D * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.E * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.F * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.G * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.H * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.I * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.J * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.K * 50000.0f) + 0.5f));
                    order.putShort((short) (this.L + 0.5f));
                    order.putShort((short) (this.M + 0.5f));
                    order.putShort((short) this.B);
                    order.putShort((short) this.C);
                }
                mo8Var = new mo8(this.y, this.A, this.z, bArr2);
            }
            if (this.a != null) {
                map = n82.i0;
                if (map.containsKey(this.a)) {
                    map2 = n82.i0;
                    i4 = ((Integer) map2.get(this.a)).intValue();
                }
            }
            if (this.r == 0 && Float.compare(this.s, 0.0f) == 0 && Float.compare(this.t, 0.0f) == 0) {
                if (Float.compare(this.u, 0.0f) != 0) {
                    if (Float.compare(this.t, 90.0f) == 0) {
                        i9 = 90;
                    } else if (Float.compare(this.t, -180.0f) == 0 || Float.compare(this.t, 180.0f) == 0) {
                        i9 = 180;
                    } else if (Float.compare(this.t, -90.0f) == 0) {
                        i9 = 270;
                    }
                }
                b72Var.x(this.m);
                b72Var.f(this.n);
                b72Var.p(f2);
                b72Var.r(i9);
                b72Var.q(this.v);
                b72Var.v(this.w);
                b72Var.g0(mo8Var);
                i7 = 2;
            }
            i9 = i4;
            b72Var.x(this.m);
            b72Var.f(this.n);
            b72Var.p(f2);
            b72Var.r(i9);
            b72Var.q(this.v);
            b72Var.v(this.w);
            b72Var.g0(mo8Var);
            i7 = 2;
        } else if (!"application/x-subrip".equals(str7) && !"text/x-ssa".equals(str7) && !"text/vtt".equals(str7) && !"application/vobsub".equals(str7) && !"application/pgs".equals(str7) && !"application/dvbsubs".equals(str7)) {
            throw dl3.a("Unexpected MIME type.", null);
        } else {
            i7 = 3;
        }
        if (this.a != null) {
            map3 = n82.i0;
            if (!map3.containsKey(this.a)) {
                b72Var.j(this.a);
            }
        }
        b72Var.g(i);
        b72Var.s(str7);
        b72Var.l(i2);
        b72Var.k(this.W);
        b72Var.u(i10);
        b72Var.i(singletonList);
        b72Var.f0(str2);
        b72Var.b(this.l);
        f92 y = b72Var.y();
        m42 n = m09Var.n(this.c, i7);
        this.X = n;
        n.f(y);
    }

    @EnsuresNonNull({"codecPrivate"})
    public final byte[] i(String str) {
        byte[] bArr = this.k;
        if (bArr != null) {
            return bArr;
        }
        throw dl3.a("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }
}
