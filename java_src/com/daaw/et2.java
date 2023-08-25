package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzbbb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class et2 {
    public boolean L;
    public ws2 O;
    public int P;
    public String a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public byte[] f;
    public vs2 g;
    public byte[] h;
    public zzavc i;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = 0;
    public byte[] o = null;
    public int p = -1;
    public boolean q = false;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = 1000;
    public int v = 200;
    public float w = -1.0f;
    public float x = -1.0f;
    public float y = -1.0f;
    public float z = -1.0f;
    public float A = -1.0f;
    public float B = -1.0f;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public int G = 1;
    public int H = -1;
    public int I = 8000;
    public long J = 0;
    public long K = 0;
    public boolean M = true;
    public String N = "eng";

    public et2() {
    }

    public /* synthetic */ et2(dt2 dt2Var) {
    }

    public static List c(iz2 iz2Var) {
        try {
            iz2Var.w(16);
            if (iz2Var.k() != 826496599) {
                return null;
            }
            int c = iz2Var.c() + 20;
            byte[] bArr = iz2Var.a;
            while (true) {
                int length = bArr.length;
                if (c >= length - 4) {
                    throw new eq2("Failed to find FourCC VC1 initialization data");
                }
                if (bArr[c] == 0 && bArr[c + 1] == 0 && bArr[c + 2] == 1 && bArr[c + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, c, length));
                }
                c++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new eq2("Error parsing FourCC VC1 codec private");
        }
    }

    public static List d(byte[] bArr) {
        int i;
        int i2;
        try {
            if (bArr[0] == 2) {
                int i3 = 1;
                int i4 = 0;
                while (true) {
                    i = bArr[i3];
                    if (i != -1) {
                        break;
                    }
                    i4 += 255;
                    i3++;
                }
                int i5 = i3 + 1;
                int i6 = i4 + i;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if (i2 != -1) {
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
                        throw new eq2("Error parsing vorbis codec private");
                    }
                    throw new eq2("Error parsing vorbis codec private");
                }
                throw new eq2("Error parsing vorbis codec private");
            }
            throw new eq2("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new eq2("Error parsing vorbis codec private");
        }
    }

    public static boolean e(iz2 iz2Var) {
        UUID uuid;
        UUID uuid2;
        try {
            int f = iz2Var.f();
            if (f == 1) {
                return true;
            }
            if (f == 65534) {
                iz2Var.v(24);
                long l = iz2Var.l();
                uuid = ft2.c0;
                if (l == uuid.getMostSignificantBits()) {
                    long l2 = iz2Var.l();
                    uuid2 = ft2.c0;
                    if (l2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new eq2("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(os2 os2Var, int i) {
        char c;
        List singletonList;
        List list;
        int i2;
        int i3;
        int h;
        int i4;
        StringBuilder sb;
        zzatd s;
        int i5;
        zzbbb zzbbbVar;
        byte[] bArr;
        int i6;
        String str = this.a;
        int i7 = 2;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str2 = "audio/raw";
        switch (c) {
            case 0:
                str2 = "video/x-vnd.on2.vp8";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                break;
            case 1:
                str2 = "video/x-vnd.on2.vp9";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                break;
            case 2:
                str2 = "video/mpeg2";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                break;
            case 3:
            case 4:
            case 5:
                byte[] bArr2 = this.h;
                singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str2 = "video/mp4v-es";
                i2 = -1;
                i3 = -1;
                break;
            case 6:
                qz2 a = qz2.a(new iz2(this.h));
                list = a.a;
                this.P = a.b;
                str2 = "video/avc";
                singletonList = list;
                i2 = -1;
                i3 = -1;
                break;
            case 7:
                yz2 a2 = yz2.a(new iz2(this.h));
                list = a2.a;
                this.P = a2.b;
                str2 = "video/hevc";
                singletonList = list;
                i2 = -1;
                i3 = -1;
                break;
            case '\b':
                singletonList = c(new iz2(this.h));
                str2 = singletonList != null ? "video/wvc1" : "video/x-unknown";
                i2 = -1;
                i3 = -1;
                break;
            case '\t':
                str2 = "video/x-unknown";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                break;
            case '\n':
                singletonList = d(this.h);
                str2 = "audio/vorbis";
                i2 = -1;
                i3 = 8192;
                break;
            case 11:
                singletonList = new ArrayList(3);
                singletonList.add(this.h);
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.J).array());
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.K).array());
                str2 = "audio/opus";
                i2 = -1;
                i3 = 5760;
                break;
            case '\f':
                singletonList = Collections.singletonList(this.h);
                str2 = "audio/mp4a-latm";
                i2 = -1;
                i3 = -1;
                break;
            case '\r':
                str2 = "audio/mpeg-L2";
                singletonList = null;
                i2 = -1;
                i3 = 4096;
                break;
            case 14:
                str2 = "audio/mpeg";
                singletonList = null;
                i2 = -1;
                i3 = 4096;
                break;
            case 15:
                str2 = "audio/ac3";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                break;
            case 16:
                str2 = "audio/eac3";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                break;
            case 17:
                str2 = "audio/true-hd";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                break;
            case 18:
            case 19:
                str2 = "audio/vnd.dts";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                break;
            case 20:
                str2 = "audio/vnd.dts.hd";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                break;
            case 21:
                singletonList = Collections.singletonList(this.h);
                str2 = "audio/x-flac";
                i2 = -1;
                i3 = -1;
                break;
            case 22:
                if (e(new iz2(this.h))) {
                    h = pz2.h(this.H);
                    if (h == 0) {
                        i4 = this.H;
                        sb = new StringBuilder();
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i4);
                        sb.append(". Setting mimeType to audio/x-unknown");
                    }
                    i2 = h;
                    singletonList = null;
                    i3 = -1;
                    break;
                }
                str2 = "audio/x-unknown";
                singletonList = null;
                i2 = -1;
                i3 = -1;
            case 23:
                h = pz2.h(this.H);
                if (h == 0) {
                    i4 = this.H;
                    sb = new StringBuilder();
                    sb.append("Unsupported PCM bit depth: ");
                    sb.append(i4);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    str2 = "audio/x-unknown";
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    break;
                }
                i2 = h;
                singletonList = null;
                i3 = -1;
            case 24:
                str2 = "application/x-subrip";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                break;
            case 25:
                singletonList = Collections.singletonList(this.h);
                str2 = "application/vobsub";
                i2 = -1;
                i3 = -1;
                break;
            case 26:
                str2 = "application/pgs";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                break;
            case 27:
                byte[] bArr3 = this.h;
                singletonList = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                str2 = "application/dvbsubs";
                i2 = -1;
                i3 = -1;
                break;
            default:
                throw new eq2("Unrecognized codec identifier.");
        }
        int i8 = (this.M ? 1 : 0) | (true != this.L ? 0 : 2);
        if (fz2.a(str2)) {
            s = zzatd.q(Integer.toString(i), str2, null, -1, i3, this.G, this.I, i2, -1, -1, singletonList, this.i, i8, this.N, null);
            i7 = 1;
        } else if (fz2.b(str2)) {
            if (this.n == 0) {
                int i9 = this.l;
                if (i9 == -1) {
                    i9 = this.j;
                }
                this.l = i9;
                int i10 = this.m;
                if (i10 == -1) {
                    i10 = this.k;
                }
                this.m = i10;
            }
            float f = (this.l == -1 || (i6 = this.m) == -1) ? -1.0f : (this.k * i5) / (this.j * i6);
            if (this.q) {
                if (this.w == -1.0f || this.x == -1.0f || this.y == -1.0f || this.z == -1.0f || this.A == -1.0f || this.B == -1.0f || this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f) {
                    bArr = null;
                } else {
                    bArr = new byte[25];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.put((byte) 0);
                    wrap.putShort((short) ((this.w * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.x * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.y * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.z * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.A * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.B * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.C * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.D * 50000.0f) + 0.5f));
                    wrap.putShort((short) (this.E + 0.5f));
                    wrap.putShort((short) (this.F + 0.5f));
                    wrap.putShort((short) this.u);
                    wrap.putShort((short) this.v);
                }
                zzbbbVar = new zzbbb(this.r, this.t, this.s, bArr);
            } else {
                zzbbbVar = null;
            }
            s = zzatd.v(Integer.toString(i), str2, null, -1, i3, this.j, this.k, -1.0f, singletonList, -1, f, this.o, this.p, zzbbbVar, this.i);
        } else {
            if ("application/x-subrip".equals(str2)) {
                s = zzatd.u(Integer.toString(i), str2, null, -1, i8, this.N, -1, this.i, Long.MAX_VALUE, Collections.emptyList());
            } else if (!"application/vobsub".equals(str2) && !"application/pgs".equals(str2) && !"application/dvbsubs".equals(str2)) {
                throw new eq2("Unexpected MIME type.");
            } else {
                s = zzatd.s(Integer.toString(i), str2, null, -1, singletonList, this.N, this.i);
            }
            i7 = 3;
        }
        ws2 h2 = os2Var.h(this.b, i7);
        this.O = h2;
        h2.a(s);
    }
}
