package com.daaw;

import android.util.Pair;
import android.util.SparseArray;
import com.daaw.da1;
import com.daaw.sm1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
/* loaded from: classes.dex */
public final class un0 implements zz {
    public static final e00 Z = new a();
    public static final byte[] a0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] b0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final byte[] c0 = sq1.D("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] d0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] e0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final UUID f0 = new UUID(72057594037932032L, -9223371306706625679L);
    public long A;
    public rl0 B;
    public rl0 C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int[] J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public byte S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public d00 Y;
    public final ov a;
    public final zr1 b;
    public final SparseArray<c> c;
    public final boolean d;
    public final rv0 e;
    public final rv0 f;
    public final rv0 g;
    public final rv0 h;
    public final rv0 i;
    public final rv0 j;
    public final rv0 k;
    public final rv0 l;
    public final rv0 m;
    public ByteBuffer n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public c t;
    public boolean u;
    public int v;
    public long w;
    public boolean x;
    public long y;
    public long z;

    /* loaded from: classes.dex */
    public static class a implements e00 {
        @Override // com.daaw.e00
        public zz[] a() {
            return new zz[]{new un0()};
        }
    }

    /* loaded from: classes.dex */
    public final class b implements pv {
        public b() {
        }

        public /* synthetic */ b(un0 un0Var, a aVar) {
            this();
        }

        @Override // com.daaw.pv
        public void a(int i) {
            un0.this.l(i);
        }

        @Override // com.daaw.pv
        public int b(int i) {
            switch (i) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 241:
                case 251:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 22186:
                case 22203:
                case 25188:
                case 2352003:
                case 2807729:
                    return 2;
                case 134:
                case 17026:
                case 2274716:
                    return 3;
                case 160:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    return 1;
                case 161:
                case 163:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    return 4;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                    return 5;
                default:
                    return 0;
            }
        }

        @Override // com.daaw.pv
        public boolean c(int i) {
            return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
        }

        @Override // com.daaw.pv
        public void d(int i, String str) {
            un0.this.y(i, str);
        }

        @Override // com.daaw.pv
        public void e(int i, double d) {
            un0.this.n(i, d);
        }

        @Override // com.daaw.pv
        public void f(int i, long j, long j2) {
            un0.this.x(i, j, j2);
        }

        @Override // com.daaw.pv
        public void g(int i, int i2, a00 a00Var) {
            un0.this.g(i, i2, a00Var);
        }

        @Override // com.daaw.pv
        public void h(int i, long j) {
            un0.this.o(i, j);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public float A;
        public float B;
        public float C;
        public float D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public long J;
        public long K;
        public d L;
        public boolean M;
        public boolean N;
        public String O;
        public sm1 P;
        public int Q;
        public String a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        public byte[] f;
        public sm1.a g;
        public byte[] h;
        public DrmInitData i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public byte[] o;
        public int p;
        public boolean q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public float w;
        public float x;
        public float y;
        public float z;

        public c() {
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = null;
            this.p = -1;
            this.q = false;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 1000;
            this.v = 200;
            this.w = -1.0f;
            this.x = -1.0f;
            this.y = -1.0f;
            this.z = -1.0f;
            this.A = -1.0f;
            this.B = -1.0f;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 1;
            this.H = -1;
            this.I = 8000;
            this.J = 0L;
            this.K = 0L;
            this.N = true;
            this.O = "eng";
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        public static Pair<String, List<byte[]>> e(rv0 rv0Var) {
            try {
                rv0Var.K(16);
                long n = rv0Var.n();
                if (n == 1482049860) {
                    return new Pair<>("video/3gpp", null);
                }
                if (n == 826496599) {
                    byte[] bArr = rv0Var.a;
                    for (int c = rv0Var.c() + 20; c < bArr.length - 4; c++) {
                        if (bArr[c] == 0 && bArr[c + 1] == 0 && bArr[c + 2] == 1 && bArr[c + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, c, bArr.length)));
                        }
                    }
                    throw new tv0("Failed to find FourCC VC1 initialization data");
                }
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new tv0("Error parsing FourCC private data");
            }
        }

        public static boolean f(rv0 rv0Var) {
            try {
                int p = rv0Var.p();
                if (p == 1) {
                    return true;
                }
                if (p == 65534) {
                    rv0Var.J(24);
                    if (rv0Var.q() == un0.f0.getMostSignificantBits()) {
                        if (rv0Var.q() == un0.f0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new tv0("Error parsing MS/ACM codec private");
            }
        }

        public static List<byte[]> g(byte[] bArr) {
            try {
                if (bArr[0] == 2) {
                    int i = 1;
                    int i2 = 0;
                    while (bArr[i] == -1) {
                        i2 += 255;
                        i++;
                    }
                    int i3 = i + 1;
                    int i4 = i2 + bArr[i];
                    int i5 = 0;
                    while (bArr[i3] == -1) {
                        i5 += 255;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + bArr[i3];
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i9];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new tv0("Error parsing vorbis codec private");
                        }
                        throw new tv0("Error parsing vorbis codec private");
                    }
                    throw new tv0("Error parsing vorbis codec private");
                }
                throw new tv0("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new tv0("Error parsing vorbis codec private");
            }
        }

        public final byte[] b() {
            if (this.w == -1.0f || this.x == -1.0f || this.y == -1.0f || this.z == -1.0f || this.A == -1.0f || this.B == -1.0f || this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
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
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public void c(d00 d00Var, int i) {
            char c;
            List<byte[]> singletonList;
            String str;
            StringBuilder sb;
            int x;
            String str2;
            int i2;
            int i3;
            String str3;
            List<byte[]> list;
            Format w;
            int i4;
            int i5;
            int i6;
            String str4 = this.a;
            str4.hashCode();
            int i7 = 1;
            switch (str4.hashCode()) {
                case -2095576542:
                    if (str4.equals("V_MPEG4/ISO/AP")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -2095575984:
                    if (str4.equals("V_MPEG4/ISO/SP")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1985379776:
                    if (str4.equals("A_MS/ACM")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1784763192:
                    if (str4.equals("A_TRUEHD")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1730367663:
                    if (str4.equals("A_VORBIS")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641358:
                    if (str4.equals("A_MPEG/L2")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641357:
                    if (str4.equals("A_MPEG/L3")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1373388978:
                    if (str4.equals("V_MS/VFW/FOURCC")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -933872740:
                    if (str4.equals("S_DVBSUB")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -538363189:
                    if (str4.equals("V_MPEG4/ISO/ASP")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -538363109:
                    if (str4.equals("V_MPEG4/ISO/AVC")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -425012669:
                    if (str4.equals("S_VOBSUB")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -356037306:
                    if (str4.equals("A_DTS/LOSSLESS")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 62923557:
                    if (str4.equals("A_AAC")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 62923603:
                    if (str4.equals("A_AC3")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 62927045:
                    if (str4.equals("A_DTS")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338133:
                    if (str4.equals("V_VP8")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338134:
                    if (str4.equals("V_VP9")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 99146302:
                    if (str4.equals("S_HDMV/PGS")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 444813526:
                    if (str4.equals("V_THEORA")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 542569478:
                    if (str4.equals("A_DTS/EXPRESS")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 725957860:
                    if (str4.equals("A_PCM/INT/LIT")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 738597099:
                    if (str4.equals("S_TEXT/ASS")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 855502857:
                    if (str4.equals("V_MPEGH/ISO/HEVC")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 1422270023:
                    if (str4.equals("S_TEXT/UTF8")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 1809237540:
                    if (str4.equals("V_MPEG2")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950749482:
                    if (str4.equals("A_EAC3")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950789798:
                    if (str4.equals("A_FLAC")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951062397:
                    if (str4.equals("A_OPUS")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str5 = ". Setting mimeType to ";
            String str6 = "audio/x-unknown";
            switch (c) {
                case 0:
                case 1:
                case '\t':
                    byte[] bArr = this.h;
                    singletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str = "video/mp4v-es";
                    str6 = str;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 2:
                    if (f(new rv0(this.h))) {
                        x = sq1.x(this.H);
                        if (x == 0) {
                            sb = new StringBuilder();
                            sb.append("Unsupported PCM bit depth: ");
                            sb.append(this.H);
                            sb.append(str5);
                            sb.append("audio/x-unknown");
                            singletonList = null;
                            i2 = -1;
                            i3 = -1;
                            break;
                        }
                        i2 = x;
                        str6 = "audio/raw";
                        singletonList = null;
                        i3 = -1;
                    } else {
                        sb = new StringBuilder();
                        str5 = "Non-PCM MS/ACM is unsupported. Setting mimeType to ";
                        sb.append(str5);
                        sb.append("audio/x-unknown");
                        singletonList = null;
                        i2 = -1;
                        i3 = -1;
                    }
                case 3:
                    this.L = new d();
                    str2 = "audio/true-hd";
                    str6 = str2;
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 4:
                    singletonList = g(this.h);
                    str6 = "audio/vorbis";
                    i2 = -1;
                    i3 = 8192;
                    break;
                case 5:
                    str3 = "audio/mpeg-L2";
                    str6 = str3;
                    singletonList = null;
                    i2 = -1;
                    i3 = 4096;
                    break;
                case 6:
                    str3 = "audio/mpeg";
                    str6 = str3;
                    singletonList = null;
                    i2 = -1;
                    i3 = 4096;
                    break;
                case 7:
                    Pair<String, List<byte[]>> e = e(new rv0(this.h));
                    str = (String) e.first;
                    singletonList = (List) e.second;
                    str6 = str;
                    i2 = -1;
                    i3 = -1;
                    break;
                case '\b':
                    byte[] bArr2 = this.h;
                    singletonList = Collections.singletonList(new byte[]{bArr2[0], bArr2[1], bArr2[2], bArr2[3]});
                    str6 = "application/dvbsubs";
                    i2 = -1;
                    i3 = -1;
                    break;
                case '\n':
                    y9 b = y9.b(new rv0(this.h));
                    list = b.a;
                    this.Q = b.b;
                    str = "video/avc";
                    singletonList = list;
                    str6 = str;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 11:
                    singletonList = Collections.singletonList(this.h);
                    str6 = "application/vobsub";
                    i2 = -1;
                    i3 = -1;
                    break;
                case '\f':
                    str2 = "audio/vnd.dts.hd";
                    str6 = str2;
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    break;
                case '\r':
                    singletonList = Collections.singletonList(this.h);
                    str = "audio/mp4a-latm";
                    str6 = str;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 14:
                    str2 = "audio/ac3";
                    str6 = str2;
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 15:
                case 20:
                    str2 = "audio/vnd.dts";
                    str6 = str2;
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 16:
                    str2 = "video/x-vnd.on2.vp8";
                    str6 = str2;
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 17:
                    str2 = "video/x-vnd.on2.vp9";
                    str6 = str2;
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 18:
                    str6 = "application/pgs";
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 19:
                    str2 = "video/x-unknown";
                    str6 = str2;
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 21:
                    x = sq1.x(this.H);
                    if (x == 0) {
                        sb = new StringBuilder();
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(this.H);
                        sb.append(str5);
                        sb.append("audio/x-unknown");
                        singletonList = null;
                        i2 = -1;
                        i3 = -1;
                        break;
                    }
                    i2 = x;
                    str6 = "audio/raw";
                    singletonList = null;
                    i3 = -1;
                case 22:
                    str6 = "text/x-ssa";
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 23:
                    cb0 a = cb0.a(new rv0(this.h));
                    list = a.a;
                    this.Q = a.b;
                    str = "video/hevc";
                    singletonList = list;
                    str6 = str;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 24:
                    str6 = "application/x-subrip";
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 25:
                    str2 = "video/mpeg2";
                    str6 = str2;
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 26:
                    str2 = "audio/eac3";
                    str6 = str2;
                    singletonList = null;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 27:
                    singletonList = Collections.singletonList(this.h);
                    str = "audio/flac";
                    str6 = str;
                    i2 = -1;
                    i3 = -1;
                    break;
                case 28:
                    singletonList = new ArrayList<>(3);
                    singletonList.add(this.h);
                    singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.J).array());
                    singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.K).array());
                    str6 = "audio/opus";
                    i2 = -1;
                    i3 = 5760;
                    break;
                default:
                    throw new tv0("Unrecognized codec identifier.");
            }
            int i8 = (this.N ? 1 : 0) | 0 | (this.M ? 2 : 0);
            if (hq0.k(str6)) {
                w = Format.t(Integer.toString(i), str6, null, -1, i3, this.G, this.I, i2, singletonList, this.i, i8, this.O);
            } else if (hq0.m(str6)) {
                if (this.n == 0) {
                    int i9 = this.l;
                    i4 = -1;
                    if (i9 == -1) {
                        i9 = this.j;
                    }
                    this.l = i9;
                    int i10 = this.m;
                    if (i10 == -1) {
                        i10 = this.k;
                    }
                    this.m = i10;
                } else {
                    i4 = -1;
                }
                w = Format.I(Integer.toString(i), str6, null, -1, i3, this.j, this.k, -1.0f, singletonList, -1, (this.l == i4 || (i6 = this.m) == i4) ? -1.0f : (this.k * i5) / (this.j * i6), this.o, this.p, this.q ? new ColorInfo(this.r, this.t, this.s, b()) : null, this.i);
                i7 = 2;
            } else {
                if ("application/x-subrip".equals(str6)) {
                    w = Format.C(Integer.toString(i), str6, i8, this.O, this.i);
                } else if ("text/x-ssa".equals(str6)) {
                    ArrayList arrayList = new ArrayList(2);
                    arrayList.add(un0.c0);
                    arrayList.add(this.h);
                    w = Format.E(Integer.toString(i), str6, null, -1, i8, this.O, -1, this.i, Long.MAX_VALUE, arrayList);
                } else if (!"application/vobsub".equals(str6) && !"application/pgs".equals(str6) && !"application/dvbsubs".equals(str6)) {
                    throw new tv0("Unexpected MIME type.");
                } else {
                    w = Format.w(Integer.toString(i), str6, null, -1, i8, singletonList, this.O, this.i);
                }
                i7 = 3;
            }
            sm1 a2 = d00Var.a(this.b, i7);
            this.P = a2;
            a2.d(w);
        }

        public void d() {
            d dVar = this.L;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void h() {
            d dVar = this.L;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final byte[] a = new byte[10];
        public boolean b;
        public int c;
        public int d;
        public long e;
        public int f;

        public void a(c cVar) {
            if (!this.b || this.c <= 0) {
                return;
            }
            cVar.P.a(this.e, this.f, this.d, 0, cVar.g);
            this.c = 0;
        }

        public void b() {
            this.b = false;
        }

        public void c(c cVar, long j) {
            if (this.b) {
                int i = this.c;
                int i2 = i + 1;
                this.c = i2;
                if (i == 0) {
                    this.e = j;
                }
                if (i2 < 16) {
                    return;
                }
                cVar.P.a(this.e, this.f, this.d, 0, cVar.g);
                this.c = 0;
            }
        }

        public void d(a00 a00Var, int i, int i2) {
            if (!this.b) {
                a00Var.k(this.a, 0, 10);
                a00Var.i();
                if (u.j(this.a) == -1) {
                    return;
                }
                this.b = true;
                this.c = 0;
            }
            if (this.c == 0) {
                this.f = i;
                this.d = 0;
            }
            this.d += i2;
        }
    }

    public un0() {
        this(0);
    }

    public un0(int i) {
        this(new tq(), i);
    }

    public un0(ov ovVar, int i) {
        this.p = -1L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.y = -1L;
        this.z = -1L;
        this.A = -9223372036854775807L;
        this.a = ovVar;
        ovVar.b(new b(this, null));
        this.d = (i & 1) == 0;
        this.b = new zr1();
        this.c = new SparseArray<>();
        this.g = new rv0(4);
        this.h = new rv0(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new rv0(4);
        this.e = new rv0(sr0.a);
        this.f = new rv0(4);
        this.j = new rv0();
        this.k = new rv0();
        this.l = new rv0(8);
        this.m = new rv0();
    }

    public static int[] m(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    public static boolean p(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str);
    }

    public static void w(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        byte[] D;
        byte[] bArr3;
        if (j == -9223372036854775807L) {
            D = bArr2;
            bArr3 = D;
        } else {
            int i2 = (int) (j / 3600000000L);
            long j3 = j - ((i2 * 3600) * 1000000);
            int i3 = (int) (j3 / 60000000);
            long j4 = j3 - ((i3 * 60) * 1000000);
            int i4 = (int) (j4 / 1000000);
            D = sq1.D(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j4 - (i4 * 1000000)) / j2))));
            bArr3 = bArr2;
        }
        System.arraycopy(D, 0, bArr, i, bArr3.length);
    }

    public final void A(a00 a00Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.k.b() < length) {
            this.k.a = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, this.k.a, 0, bArr.length);
        }
        a00Var.f(this.k.a, bArr.length, i);
        this.k.G(length);
    }

    @Override // com.daaw.zz
    public void a() {
    }

    @Override // com.daaw.zz
    public boolean c(a00 a00Var) {
        return new ce1().b(a00Var);
    }

    @Override // com.daaw.zz
    public int d(a00 a00Var, iy0 iy0Var) {
        this.W = false;
        boolean z = true;
        while (z && !this.W) {
            z = this.a.a(a00Var);
            if (z && q(iy0Var, a00Var.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.c.size(); i++) {
            this.c.valueAt(i).d();
        }
        return -1;
    }

    @Override // com.daaw.zz
    public void f(long j, long j2) {
        this.A = -9223372036854775807L;
        this.E = 0;
        this.a.e();
        this.b.e();
        u();
        for (int i = 0; i < this.c.size(); i++) {
            this.c.valueAt(i).h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f1, code lost:
        throw new com.daaw.tv0("EBML lacing sample size out of range.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(int r20, int r21, com.daaw.a00 r22) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.un0.g(int, int, com.daaw.a00):void");
    }

    public final da1 h() {
        rl0 rl0Var;
        rl0 rl0Var2;
        if (this.p == -1 || this.s == -9223372036854775807L || (rl0Var = this.B) == null || rl0Var.c() == 0 || (rl0Var2 = this.C) == null || rl0Var2.c() != this.B.c()) {
            this.B = null;
            this.C = null;
            return new da1.b(this.s);
        }
        int c2 = this.B.c();
        int[] iArr = new int[c2];
        long[] jArr = new long[c2];
        long[] jArr2 = new long[c2];
        long[] jArr3 = new long[c2];
        int i = 0;
        for (int i2 = 0; i2 < c2; i2++) {
            jArr3[i2] = this.B.b(i2);
            jArr[i2] = this.p + this.C.b(i2);
        }
        while (true) {
            int i3 = c2 - 1;
            if (i >= i3) {
                iArr[i3] = (int) ((this.p + this.o) - jArr[i3]);
                jArr2[i3] = this.s - jArr3[i3];
                this.B = null;
                this.C = null;
                return new hf(iArr, jArr, jArr2, jArr3);
            }
            int i4 = i + 1;
            iArr[i] = (int) (jArr[i4] - jArr[i]);
            jArr2[i] = jArr3[i4] - jArr3[i];
            i = i4;
        }
    }

    @Override // com.daaw.zz
    public void i(d00 d00Var) {
        this.Y = d00Var;
    }

    public final void j(c cVar, long j) {
        d dVar = cVar.L;
        if (dVar != null) {
            dVar.c(cVar, j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.a)) {
                k(cVar, "%02d:%02d:%02d,%03d", 19, 1000L, b0);
            } else if ("S_TEXT/ASS".equals(cVar.a)) {
                k(cVar, "%01d:%02d:%02d:%02d", 21, 10000L, e0);
            }
            cVar.P.a(j, this.M, this.V, 0, cVar.g);
        }
        this.W = true;
        u();
    }

    public final void k(c cVar, String str, int i, long j, byte[] bArr) {
        w(this.k.a, this.G, str, i, j, bArr);
        sm1 sm1Var = cVar.P;
        rv0 rv0Var = this.k;
        sm1Var.c(rv0Var, rv0Var.d());
        this.V += this.k.d();
    }

    public void l(int i) {
        if (i == 160) {
            if (this.E != 2) {
                return;
            }
            if (!this.X) {
                this.M |= 1;
            }
            j(this.c.get(this.K), this.F);
            this.E = 0;
        } else if (i == 174) {
            if (p(this.t.a)) {
                c cVar = this.t;
                cVar.c(this.Y, cVar.b);
                SparseArray<c> sparseArray = this.c;
                c cVar2 = this.t;
                sparseArray.put(cVar2.b, cVar2);
            }
            this.t = null;
        } else if (i == 19899) {
            int i2 = this.v;
            if (i2 != -1) {
                long j = this.w;
                if (j != -1) {
                    if (i2 == 475249515) {
                        this.y = j;
                        return;
                    }
                    return;
                }
            }
            throw new tv0("Mandatory element SeekID or SeekPosition not found");
        } else if (i == 25152) {
            c cVar3 = this.t;
            if (cVar3.e) {
                if (cVar3.g == null) {
                    throw new tv0("Encrypted Track found but ContentEncKeyID was not found");
                }
                cVar3.i = new DrmInitData(new DrmInitData.SchemeData(dd.b, "video/webm", this.t.g.b));
            }
        } else if (i == 28032) {
            c cVar4 = this.t;
            if (cVar4.e && cVar4.f != null) {
                throw new tv0("Combining encryption and compression is not supported");
            }
        } else if (i == 357149030) {
            if (this.q == -9223372036854775807L) {
                this.q = 1000000L;
            }
            long j2 = this.r;
            if (j2 != -9223372036854775807L) {
                this.s = v(j2);
            }
        } else if (i == 374648427) {
            if (this.c.size() == 0) {
                throw new tv0("No valid tracks were found");
            }
            this.Y.n();
        } else if (i == 475249515 && !this.u) {
            this.Y.d(h());
            this.u = true;
        }
    }

    public void n(int i, double d2) {
        if (i == 181) {
            this.t.I = (int) d2;
        } else if (i == 17545) {
            this.r = (long) d2;
        } else {
            switch (i) {
                case 21969:
                    this.t.w = (float) d2;
                    return;
                case 21970:
                    this.t.x = (float) d2;
                    return;
                case 21971:
                    this.t.y = (float) d2;
                    return;
                case 21972:
                    this.t.z = (float) d2;
                    return;
                case 21973:
                    this.t.A = (float) d2;
                    return;
                case 21974:
                    this.t.B = (float) d2;
                    return;
                case 21975:
                    this.t.C = (float) d2;
                    return;
                case 21976:
                    this.t.D = (float) d2;
                    return;
                case 21977:
                    this.t.E = (float) d2;
                    return;
                case 21978:
                    this.t.F = (float) d2;
                    return;
                default:
                    return;
            }
        }
    }

    public void o(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw new tv0("ContentEncodingOrder " + j + " not supported");
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw new tv0("ContentEncodingScope " + j + " not supported");
        } else {
            switch (i) {
                case 131:
                    this.t.c = (int) j;
                    return;
                case 136:
                    this.t.M = j == 1;
                    return;
                case 155:
                    this.G = v(j);
                    return;
                case 159:
                    this.t.G = (int) j;
                    return;
                case 176:
                    this.t.j = (int) j;
                    return;
                case 179:
                    this.B.a(v(j));
                    return;
                case 186:
                    this.t.k = (int) j;
                    return;
                case 215:
                    this.t.b = (int) j;
                    return;
                case 231:
                    this.A = v(j);
                    return;
                case 241:
                    if (this.D) {
                        return;
                    }
                    this.C.a(j);
                    this.D = true;
                    return;
                case 251:
                    this.X = true;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw new tv0("ContentCompAlgo " + j + " not supported");
                case 17029:
                    if (j < 1 || j > 2) {
                        throw new tv0("DocTypeReadVersion " + j + " not supported");
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw new tv0("EBMLReadVersion " + j + " not supported");
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw new tv0("ContentEncAlgo " + j + " not supported");
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw new tv0("AESSettingsCipherMode " + j + " not supported");
                case 21420:
                    this.w = j + this.p;
                    return;
                case 21432:
                    int i2 = (int) j;
                    if (i2 == 0) {
                        this.t.p = 0;
                        return;
                    } else if (i2 == 1) {
                        this.t.p = 2;
                        return;
                    } else if (i2 == 3) {
                        this.t.p = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.t.p = 3;
                        return;
                    }
                case 21680:
                    this.t.l = (int) j;
                    return;
                case 21682:
                    this.t.n = (int) j;
                    return;
                case 21690:
                    this.t.m = (int) j;
                    return;
                case 21930:
                    this.t.N = j == 1;
                    return;
                case 22186:
                    this.t.J = j;
                    return;
                case 22203:
                    this.t.K = j;
                    return;
                case 25188:
                    this.t.H = (int) j;
                    return;
                case 2352003:
                    this.t.d = (int) j;
                    return;
                case 2807729:
                    this.q = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            int i3 = (int) j;
                            if (i3 == 1) {
                                this.t.t = 2;
                                return;
                            } else if (i3 != 2) {
                                return;
                            } else {
                                this.t.t = 1;
                                return;
                            }
                        case 21946:
                            int i4 = (int) j;
                            if (i4 != 1) {
                                if (i4 == 16) {
                                    this.t.s = 6;
                                    return;
                                } else if (i4 == 18) {
                                    this.t.s = 7;
                                    return;
                                } else if (i4 != 6 && i4 != 7) {
                                    return;
                                }
                            }
                            this.t.s = 3;
                            return;
                        case 21947:
                            c cVar = this.t;
                            cVar.q = true;
                            int i5 = (int) j;
                            if (i5 == 1) {
                                cVar.r = 1;
                                return;
                            } else if (i5 == 9) {
                                cVar.r = 6;
                                return;
                            } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                cVar.r = 2;
                                return;
                            } else {
                                return;
                            }
                        case 21948:
                            this.t.u = (int) j;
                            return;
                        case 21949:
                            this.t.v = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public final boolean q(iy0 iy0Var, long j) {
        if (this.x) {
            this.z = j;
            iy0Var.a = this.y;
            this.x = false;
            return true;
        }
        if (this.u) {
            long j2 = this.z;
            if (j2 != -1) {
                iy0Var.a = j2;
                this.z = -1L;
                return true;
            }
        }
        return false;
    }

    public final void r(a00 a00Var, int i) {
        if (this.g.d() >= i) {
            return;
        }
        if (this.g.b() < i) {
            rv0 rv0Var = this.g;
            byte[] bArr = rv0Var.a;
            rv0Var.H(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.g.d());
        }
        rv0 rv0Var2 = this.g;
        a00Var.f(rv0Var2.a, rv0Var2.d(), i - this.g.d());
        this.g.I(i);
    }

    public final int s(a00 a00Var, sm1 sm1Var, int i) {
        int b2;
        int a2 = this.j.a();
        if (a2 > 0) {
            b2 = Math.min(i, a2);
            sm1Var.c(this.j, b2);
        } else {
            b2 = sm1Var.b(a00Var, i, false);
        }
        this.N += b2;
        this.V += b2;
        return b2;
    }

    public final void t(a00 a00Var, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.j.a());
        a00Var.f(bArr, i + min, i2 - min);
        if (min > 0) {
            this.j.g(bArr, i, min);
        }
        this.N += i2;
    }

    public final void u() {
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        this.j.F();
    }

    public final long v(long j) {
        long j2 = this.q;
        if (j2 != -9223372036854775807L) {
            return sq1.T(j, j2, 1000L);
        }
        throw new tv0("Can't scale timecode prior to timecodeScale being set.");
    }

    public void x(int i, long j, long j2) {
        if (i == 160) {
            this.X = false;
        } else if (i == 174) {
            this.t = new c(null);
        } else if (i == 187) {
            this.D = false;
        } else if (i == 19899) {
            this.v = -1;
            this.w = -1L;
        } else if (i == 20533) {
            this.t.e = true;
        } else if (i == 21968) {
            this.t.q = true;
        } else if (i == 408125543) {
            long j3 = this.p;
            if (j3 != -1 && j3 != j) {
                throw new tv0("Multiple Segment elements not supported");
            }
            this.p = j;
            this.o = j2;
        } else if (i == 475249515) {
            this.B = new rl0();
            this.C = new rl0();
        } else if (i == 524531317 && !this.u) {
            if (this.d && this.y != -1) {
                this.x = true;
                return;
            }
            this.Y.d(new da1.b(this.s));
            this.u = true;
        }
    }

    public void y(int i, String str) {
        if (i == 134) {
            this.t.a = str;
        } else if (i != 17026) {
            if (i != 2274716) {
                return;
            }
            this.t.O = str;
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            throw new tv0("DocType " + str + " not supported");
        }
    }

    public final void z(a00 a00Var, c cVar, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.a)) {
            A(a00Var, a0, i);
        } else if ("S_TEXT/ASS".equals(cVar.a)) {
            A(a00Var, d0, i);
        } else {
            sm1 sm1Var = cVar.P;
            if (!this.O) {
                if (cVar.e) {
                    this.M &= -1073741825;
                    if (!this.P) {
                        a00Var.f(this.g.a, 0, 1);
                        this.N++;
                        byte[] bArr = this.g.a;
                        if ((bArr[0] & 128) == 128) {
                            throw new tv0("Extension bit is set in signal byte");
                        }
                        this.S = bArr[0];
                        this.P = true;
                    }
                    byte b2 = this.S;
                    if ((b2 & 1) == 1) {
                        boolean z = (b2 & 2) == 2;
                        this.M |= 1073741824;
                        if (!this.Q) {
                            a00Var.f(this.l.a, 0, 8);
                            this.N += 8;
                            this.Q = true;
                            rv0 rv0Var = this.g;
                            rv0Var.a[0] = (byte) ((z ? 128 : 0) | 8);
                            rv0Var.J(0);
                            sm1Var.c(this.g, 1);
                            this.V++;
                            this.l.J(0);
                            sm1Var.c(this.l, 8);
                            this.V += 8;
                        }
                        if (z) {
                            if (!this.R) {
                                a00Var.f(this.g.a, 0, 1);
                                this.N++;
                                this.g.J(0);
                                this.T = this.g.x();
                                this.R = true;
                            }
                            int i3 = this.T * 4;
                            this.g.G(i3);
                            a00Var.f(this.g.a, 0, i3);
                            this.N += i3;
                            short s = (short) ((this.T / 2) + 1);
                            int i4 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.n;
                            if (byteBuffer == null || byteBuffer.capacity() < i4) {
                                this.n = ByteBuffer.allocate(i4);
                            }
                            this.n.position(0);
                            this.n.putShort(s);
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                i2 = this.T;
                                if (i5 >= i2) {
                                    break;
                                }
                                int B = this.g.B();
                                if (i5 % 2 == 0) {
                                    this.n.putShort((short) (B - i6));
                                } else {
                                    this.n.putInt(B - i6);
                                }
                                i5++;
                                i6 = B;
                            }
                            int i7 = (i - this.N) - i6;
                            int i8 = i2 % 2;
                            ByteBuffer byteBuffer2 = this.n;
                            if (i8 == 1) {
                                byteBuffer2.putInt(i7);
                            } else {
                                byteBuffer2.putShort((short) i7);
                                this.n.putInt(0);
                            }
                            this.m.H(this.n.array(), i4);
                            sm1Var.c(this.m, i4);
                            this.V += i4;
                        }
                    }
                } else {
                    byte[] bArr2 = cVar.f;
                    if (bArr2 != null) {
                        this.j.H(bArr2, bArr2.length);
                    }
                }
                this.O = true;
            }
            int d2 = i + this.j.d();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.a) && !"V_MPEGH/ISO/HEVC".equals(cVar.a)) {
                if (cVar.L != null) {
                    s6.f(this.j.d() == 0);
                    cVar.L.d(a00Var, this.M, d2);
                }
                while (true) {
                    int i9 = this.N;
                    if (i9 >= d2) {
                        break;
                    }
                    s(a00Var, sm1Var, d2 - i9);
                }
            } else {
                byte[] bArr3 = this.f.a;
                bArr3[0] = 0;
                bArr3[1] = 0;
                bArr3[2] = 0;
                int i10 = cVar.Q;
                int i11 = 4 - i10;
                while (this.N < d2) {
                    int i12 = this.U;
                    if (i12 == 0) {
                        t(a00Var, bArr3, i11, i10);
                        this.f.J(0);
                        this.U = this.f.B();
                        this.e.J(0);
                        sm1Var.c(this.e, 4);
                        this.V += 4;
                    } else {
                        this.U = i12 - s(a00Var, sm1Var, i12);
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.a)) {
                this.h.J(0);
                sm1Var.c(this.h, 4);
                this.V += 4;
            }
        }
    }
}
