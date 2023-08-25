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

    /* renamed from: L */
    public boolean f8776L;

    /* renamed from: O */
    public ws2 f8779O;

    /* renamed from: P */
    public int f8780P;

    /* renamed from: a */
    public String f8781a;

    /* renamed from: b */
    public int f8782b;

    /* renamed from: c */
    public int f8783c;

    /* renamed from: d */
    public int f8784d;

    /* renamed from: e */
    public boolean f8785e;

    /* renamed from: f */
    public byte[] f8786f;

    /* renamed from: g */
    public vs2 f8787g;

    /* renamed from: h */
    public byte[] f8788h;

    /* renamed from: i */
    public zzavc f8789i;

    /* renamed from: j */
    public int f8790j = -1;

    /* renamed from: k */
    public int f8791k = -1;

    /* renamed from: l */
    public int f8792l = -1;

    /* renamed from: m */
    public int f8793m = -1;

    /* renamed from: n */
    public int f8794n = 0;

    /* renamed from: o */
    public byte[] f8795o = null;

    /* renamed from: p */
    public int f8796p = -1;

    /* renamed from: q */
    public boolean f8797q = false;

    /* renamed from: r */
    public int f8798r = -1;

    /* renamed from: s */
    public int f8799s = -1;

    /* renamed from: t */
    public int f8800t = -1;

    /* renamed from: u */
    public int f8801u = 1000;

    /* renamed from: v */
    public int f8802v = 200;

    /* renamed from: w */
    public float f8803w = -1.0f;

    /* renamed from: x */
    public float f8804x = -1.0f;

    /* renamed from: y */
    public float f8805y = -1.0f;

    /* renamed from: z */
    public float f8806z = -1.0f;

    /* renamed from: A */
    public float f8765A = -1.0f;

    /* renamed from: B */
    public float f8766B = -1.0f;

    /* renamed from: C */
    public float f8767C = -1.0f;

    /* renamed from: D */
    public float f8768D = -1.0f;

    /* renamed from: E */
    public float f8769E = -1.0f;

    /* renamed from: F */
    public float f8770F = -1.0f;

    /* renamed from: G */
    public int f8771G = 1;

    /* renamed from: H */
    public int f8772H = -1;

    /* renamed from: I */
    public int f8773I = 8000;

    /* renamed from: J */
    public long f8774J = 0;

    /* renamed from: K */
    public long f8775K = 0;

    /* renamed from: M */
    public boolean f8777M = true;

    /* renamed from: N */
    public String f8778N = "eng";

    public et2() {
    }

    public /* synthetic */ et2(dt2 dt2Var) {
    }

    /* renamed from: c */
    public static List m23196c(iz2 iz2Var) {
        try {
            iz2Var.m19224w(16);
            if (iz2Var.m19236k() != 826496599) {
                return null;
            }
            int m19244c = iz2Var.m19244c() + 20;
            byte[] bArr = iz2Var.f14125a;
            while (true) {
                int length = bArr.length;
                if (m19244c >= length - 4) {
                    throw new eq2("Failed to find FourCC VC1 initialization data");
                }
                if (bArr[m19244c] == 0 && bArr[m19244c + 1] == 0 && bArr[m19244c + 2] == 1 && bArr[m19244c + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, m19244c, length));
                }
                m19244c++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new eq2("Error parsing FourCC VC1 codec private");
        }
    }

    /* renamed from: d */
    public static List m23195d(byte[] bArr) {
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

    /* renamed from: e */
    public static boolean m23194e(iz2 iz2Var) {
        UUID uuid;
        UUID uuid2;
        try {
            int m19241f = iz2Var.m19241f();
            if (m19241f == 1) {
                return true;
            }
            if (m19241f == 65534) {
                iz2Var.m19225v(24);
                long m19235l = iz2Var.m19235l();
                uuid = ft2.f9890c0;
                if (m19235l == uuid.getMostSignificantBits()) {
                    long m19235l2 = iz2Var.m19235l();
                    uuid2 = ft2.f9890c0;
                    if (m19235l2 == uuid2.getLeastSignificantBits()) {
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
    /* renamed from: b */
    public final void m23197b(os2 os2Var, int i) {
        char c;
        List singletonList;
        List list;
        int i2;
        int i3;
        int m12842h;
        int i4;
        StringBuilder sb;
        zzatd m1124s;
        int i5;
        zzbbb zzbbbVar;
        byte[] bArr;
        int i6;
        String str = this.f8781a;
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
                byte[] bArr2 = this.f8788h;
                singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str2 = "video/mp4v-es";
                i2 = -1;
                i3 = -1;
                break;
            case 6:
                qz2 m11924a = qz2.m11924a(new iz2(this.f8788h));
                list = m11924a.f24656a;
                this.f8780P = m11924a.f24657b;
                str2 = "video/avc";
                singletonList = list;
                i2 = -1;
                i3 = -1;
                break;
            case 7:
                yz2 m3019a = yz2.m3019a(new iz2(this.f8788h));
                list = m3019a.f34290a;
                this.f8780P = m3019a.f34291b;
                str2 = "video/hevc";
                singletonList = list;
                i2 = -1;
                i3 = -1;
                break;
            case '\b':
                singletonList = m23196c(new iz2(this.f8788h));
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
                singletonList = m23195d(this.f8788h);
                str2 = "audio/vorbis";
                i2 = -1;
                i3 = 8192;
                break;
            case 11:
                singletonList = new ArrayList(3);
                singletonList.add(this.f8788h);
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.f8774J).array());
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.f8775K).array());
                str2 = "audio/opus";
                i2 = -1;
                i3 = 5760;
                break;
            case '\f':
                singletonList = Collections.singletonList(this.f8788h);
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
                singletonList = Collections.singletonList(this.f8788h);
                str2 = "audio/x-flac";
                i2 = -1;
                i3 = -1;
                break;
            case 22:
                if (m23194e(new iz2(this.f8788h))) {
                    m12842h = pz2.m12842h(this.f8772H);
                    if (m12842h == 0) {
                        i4 = this.f8772H;
                        sb = new StringBuilder();
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i4);
                        sb.append(". Setting mimeType to audio/x-unknown");
                    }
                    i2 = m12842h;
                    singletonList = null;
                    i3 = -1;
                    break;
                }
                str2 = "audio/x-unknown";
                singletonList = null;
                i2 = -1;
                i3 = -1;
            case 23:
                m12842h = pz2.m12842h(this.f8772H);
                if (m12842h == 0) {
                    i4 = this.f8772H;
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
                i2 = m12842h;
                singletonList = null;
                i3 = -1;
            case 24:
                str2 = "application/x-subrip";
                singletonList = null;
                i2 = -1;
                i3 = -1;
                break;
            case 25:
                singletonList = Collections.singletonList(this.f8788h);
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
                byte[] bArr3 = this.f8788h;
                singletonList = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                str2 = "application/dvbsubs";
                i2 = -1;
                i3 = -1;
                break;
            default:
                throw new eq2("Unrecognized codec identifier.");
        }
        int i8 = (this.f8777M ? 1 : 0) | (true != this.f8776L ? 0 : 2);
        if (fz2.m22128a(str2)) {
            m1124s = zzatd.m1125q(Integer.toString(i), str2, null, -1, i3, this.f8771G, this.f8773I, i2, -1, -1, singletonList, this.f8789i, i8, this.f8778N, null);
            i7 = 1;
        } else if (fz2.m22127b(str2)) {
            if (this.f8794n == 0) {
                int i9 = this.f8792l;
                if (i9 == -1) {
                    i9 = this.f8790j;
                }
                this.f8792l = i9;
                int i10 = this.f8793m;
                if (i10 == -1) {
                    i10 = this.f8791k;
                }
                this.f8793m = i10;
            }
            float f = (this.f8792l == -1 || (i6 = this.f8793m) == -1) ? -1.0f : (this.f8791k * i5) / (this.f8790j * i6);
            if (this.f8797q) {
                if (this.f8803w == -1.0f || this.f8804x == -1.0f || this.f8805y == -1.0f || this.f8806z == -1.0f || this.f8765A == -1.0f || this.f8766B == -1.0f || this.f8767C == -1.0f || this.f8768D == -1.0f || this.f8769E == -1.0f || this.f8770F == -1.0f) {
                    bArr = null;
                } else {
                    bArr = new byte[25];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.put((byte) 0);
                    wrap.putShort((short) ((this.f8803w * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.f8804x * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.f8805y * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.f8806z * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.f8765A * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.f8766B * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.f8767C * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.f8768D * 50000.0f) + 0.5f));
                    wrap.putShort((short) (this.f8769E + 0.5f));
                    wrap.putShort((short) (this.f8770F + 0.5f));
                    wrap.putShort((short) this.f8801u);
                    wrap.putShort((short) this.f8802v);
                }
                zzbbbVar = new zzbbb(this.f8798r, this.f8800t, this.f8799s, bArr);
            } else {
                zzbbbVar = null;
            }
            m1124s = zzatd.m1121v(Integer.toString(i), str2, null, -1, i3, this.f8790j, this.f8791k, -1.0f, singletonList, -1, f, this.f8795o, this.f8796p, zzbbbVar, this.f8789i);
        } else {
            if ("application/x-subrip".equals(str2)) {
                m1124s = zzatd.m1122u(Integer.toString(i), str2, null, -1, i8, this.f8778N, -1, this.f8789i, Long.MAX_VALUE, Collections.emptyList());
            } else if (!"application/vobsub".equals(str2) && !"application/pgs".equals(str2) && !"application/dvbsubs".equals(str2)) {
                throw new eq2("Unexpected MIME type.");
            } else {
                m1124s = zzatd.m1124s(Integer.toString(i), str2, null, -1, singletonList, this.f8778N, this.f8789i);
            }
            i7 = 3;
        }
        ws2 mo9817h = os2Var.mo9817h(this.f8782b, i7);
        this.f8779O = mo9817h;
        mo9817h.mo5828a(m1124s);
    }
}
