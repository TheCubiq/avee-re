package com.daaw;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzavc;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
/* loaded from: classes.dex */
public final class ft2 implements ns2 {
    public static final ps2 Z = new at2();
    public static final byte[] a0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] b0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final UUID c0 = new UUID(72057594037932032L, -9223371306706625679L);
    public dz2 A;
    public dz2 B;
    public boolean C;
    public int D;
    public long E;
    public long F;
    public int G;
    public int H;
    public int[] I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public byte R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public os2 X;
    public final zs2 Y;
    public final kt2 a;
    public final SparseArray b;
    public final boolean c;
    public final iz2 d;
    public final iz2 e;
    public final iz2 f;
    public final iz2 g;
    public final iz2 h;
    public final iz2 i;
    public final iz2 j;
    public final iz2 k;
    public final iz2 l;
    public ByteBuffer m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public et2 s;
    public boolean t;
    public int u;
    public long v;
    public boolean w;
    public long x;
    public long y;
    public long z;

    public ft2(int i) {
        zs2 zs2Var = new zs2();
        this.o = -1L;
        this.p = -9223372036854775807L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.x = -1L;
        this.y = -1L;
        this.z = -9223372036854775807L;
        this.Y = zs2Var;
        zs2Var.b(new ct2(this, null));
        this.c = true;
        this.a = new kt2();
        this.b = new SparseArray();
        this.f = new iz2(4);
        this.g = new iz2(ByteBuffer.allocate(4).putInt(-1).array());
        this.h = new iz2(4);
        this.d = new iz2(gz2.a);
        this.e = new iz2(4);
        this.i = new iz2();
        this.j = new iz2();
        this.k = new iz2(8);
        this.l = new iz2();
    }

    public static final int l(int i) {
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

    public static final boolean m(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public static int[] q(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.daaw.ns2
    public final boolean b(ms2 ms2Var) {
        return new gt2().a(ms2Var);
    }

    @Override // com.daaw.ns2
    public final void c(os2 os2Var) {
        this.X = os2Var;
    }

    @Override // com.daaw.ns2
    public final void d(long j, long j2) {
        this.z = -9223372036854775807L;
        this.D = 0;
        this.Y.a();
        this.a.d();
        p();
    }

    @Override // com.daaw.ns2
    public final int e(ms2 ms2Var, ss2 ss2Var) {
        this.V = false;
        while (!this.V) {
            if (!this.Y.c(ms2Var)) {
                return -1;
            }
            long d = ms2Var.d();
            if (this.w) {
                this.y = d;
                ss2Var.a = this.x;
                this.w = false;
                return 1;
            } else if (this.t) {
                long j = this.y;
                if (j != -1) {
                    ss2Var.a = j;
                    this.y = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    public final void f(int i) {
        us2 ts2Var;
        dz2 dz2Var;
        dz2 dz2Var2;
        int i2;
        int i3 = 0;
        if (i == 160) {
            if (this.D != 2) {
                return;
            }
            if (!this.W) {
                this.L |= 1;
            }
            o((et2) this.b.get(this.J), this.E);
            this.D = 0;
        } else if (i == 174) {
            String str = this.s.a;
            if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                et2 et2Var = this.s;
                et2Var.b(this.X, et2Var.b);
                SparseArray sparseArray = this.b;
                et2 et2Var2 = this.s;
                sparseArray.put(et2Var2.b, et2Var2);
            }
            this.s = null;
        } else if (i == 19899) {
            int i4 = this.u;
            if (i4 != -1) {
                long j = this.v;
                if (j != -1) {
                    if (i4 == 475249515) {
                        this.x = j;
                        return;
                    }
                    return;
                }
            }
            throw new eq2("Mandatory element SeekID or SeekPosition not found");
        } else if (i == 25152) {
            et2 et2Var3 = this.s;
            if (et2Var3.e) {
                if (et2Var3.g == null) {
                    throw new eq2("Encrypted Track found but ContentEncKeyID was not found");
                }
                et2Var3.i = new zzavc(new zzavb(jp2.b, "video/webm", this.s.g.b, false));
            }
        } else if (i == 28032) {
            et2 et2Var4 = this.s;
            if (et2Var4.e && et2Var4.f != null) {
                throw new eq2("Combining encryption and compression is not supported");
            }
        } else if (i == 357149030) {
            if (this.p == -9223372036854775807L) {
                this.p = 1000000L;
            }
            long j2 = this.q;
            if (j2 != -9223372036854775807L) {
                this.r = n(j2);
            }
        } else if (i == 374648427) {
            if (this.b.size() == 0) {
                throw new eq2("No valid tracks were found");
            }
            this.X.zzb();
        } else if (i == 475249515 && !this.t) {
            os2 os2Var = this.X;
            if (this.o == -1 || this.r == -9223372036854775807L || (dz2Var = this.A) == null || dz2Var.a() == 0 || (dz2Var2 = this.B) == null || dz2Var2.a() != dz2Var.a()) {
                this.A = null;
                this.B = null;
                ts2Var = new ts2(this.r);
            } else {
                int a = dz2Var.a();
                int[] iArr = new int[a];
                long[] jArr = new long[a];
                long[] jArr2 = new long[a];
                long[] jArr3 = new long[a];
                for (int i5 = 0; i5 < a; i5++) {
                    jArr3[i5] = this.A.b(i5);
                    jArr[i5] = this.o + this.B.b(i5);
                }
                while (true) {
                    i2 = a - 1;
                    if (i3 >= i2) {
                        break;
                    }
                    int i6 = i3 + 1;
                    iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                    jArr2[i3] = jArr3[i6] - jArr3[i3];
                    i3 = i6;
                }
                iArr[i2] = (int) ((this.o + this.n) - jArr[i2]);
                jArr2[i2] = this.r - jArr3[i2];
                this.A = null;
                this.B = null;
                ts2Var = new ls2(iArr, jArr, jArr2, jArr3);
            }
            os2Var.b(ts2Var);
            this.t = true;
        }
    }

    public final void g(int i, double d) {
        if (i == 181) {
            this.s.I = (int) d;
        } else if (i == 17545) {
            this.q = (long) d;
        } else {
            switch (i) {
                case 21969:
                    this.s.w = (float) d;
                    return;
                case 21970:
                    this.s.x = (float) d;
                    return;
                case 21971:
                    this.s.y = (float) d;
                    return;
                case 21972:
                    this.s.z = (float) d;
                    return;
                case 21973:
                    this.s.A = (float) d;
                    return;
                case 21974:
                    this.s.B = (float) d;
                    return;
                case 21975:
                    this.s.C = (float) d;
                    return;
                case 21976:
                    this.s.D = (float) d;
                    return;
                case 21977:
                    this.s.E = (float) d;
                    return;
                case 21978:
                    this.s.F = (float) d;
                    return;
                default:
                    return;
            }
        }
    }

    public final void h(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw new eq2("ContentEncodingOrder " + j + " not supported");
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw new eq2("ContentEncodingScope " + j + " not supported");
        } else {
            switch (i) {
                case 131:
                    this.s.c = (int) j;
                    return;
                case 136:
                    this.s.L = j == 1;
                    return;
                case 155:
                    this.F = n(j);
                    return;
                case 159:
                    this.s.G = (int) j;
                    return;
                case 176:
                    this.s.j = (int) j;
                    return;
                case 179:
                    this.A.c(n(j));
                    return;
                case 186:
                    this.s.k = (int) j;
                    return;
                case 215:
                    this.s.b = (int) j;
                    return;
                case 231:
                    this.z = n(j);
                    return;
                case 241:
                    if (this.C) {
                        return;
                    }
                    this.B.c(j);
                    this.C = true;
                    return;
                case 251:
                    this.W = true;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw new eq2("ContentCompAlgo " + j + " not supported");
                case 17029:
                    if (j < 1 || j > 2) {
                        throw new eq2("DocTypeReadVersion " + j + " not supported");
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw new eq2("EBMLReadVersion " + j + " not supported");
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw new eq2("ContentEncAlgo " + j + " not supported");
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw new eq2("AESSettingsCipherMode " + j + " not supported");
                case 21420:
                    this.v = j + this.o;
                    return;
                case 21432:
                    int i2 = (int) j;
                    if (i2 == 0) {
                        this.s.p = 0;
                        return;
                    } else if (i2 == 1) {
                        this.s.p = 2;
                        return;
                    } else if (i2 == 3) {
                        this.s.p = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.s.p = 3;
                        return;
                    }
                case 21680:
                    this.s.l = (int) j;
                    return;
                case 21682:
                    this.s.n = (int) j;
                    return;
                case 21690:
                    this.s.m = (int) j;
                    return;
                case 21930:
                    this.s.M = j == 1;
                    return;
                case 22186:
                    this.s.J = j;
                    return;
                case 22203:
                    this.s.K = j;
                    return;
                case 25188:
                    this.s.H = (int) j;
                    return;
                case 2352003:
                    this.s.d = (int) j;
                    return;
                case 2807729:
                    this.p = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            int i3 = (int) j;
                            if (i3 == 1) {
                                this.s.t = 2;
                                return;
                            } else if (i3 != 2) {
                                return;
                            } else {
                                this.s.t = 1;
                                return;
                            }
                        case 21946:
                            int i4 = (int) j;
                            if (i4 != 1) {
                                if (i4 == 16) {
                                    this.s.s = 6;
                                    return;
                                } else if (i4 == 18) {
                                    this.s.s = 7;
                                    return;
                                } else if (i4 != 6 && i4 != 7) {
                                    return;
                                }
                            }
                            this.s.s = 3;
                            return;
                        case 21947:
                            et2 et2Var = this.s;
                            et2Var.q = true;
                            int i5 = (int) j;
                            if (i5 == 1) {
                                et2Var.r = 1;
                                return;
                            } else if (i5 == 9) {
                                et2Var.r = 6;
                                return;
                            } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                et2Var.r = 2;
                                return;
                            } else {
                                return;
                            }
                        case 21948:
                            this.s.u = (int) j;
                            return;
                        case 21949:
                            this.s.v = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public final void i(int i, long j, long j2) {
        if (i == 160) {
            this.W = false;
        } else if (i == 174) {
            this.s = new et2(null);
        } else if (i == 187) {
            this.C = false;
        } else if (i == 19899) {
            this.u = -1;
            this.v = -1L;
        } else if (i == 20533) {
            this.s.e = true;
        } else if (i == 21968) {
            this.s.q = true;
        } else if (i == 408125543) {
            long j3 = this.o;
            if (j3 != -1 && j3 != j) {
                throw new eq2("Multiple Segment elements not supported");
            }
            this.o = j;
            this.n = j2;
        } else if (i == 475249515) {
            this.A = new dz2(32);
            this.B = new dz2(32);
        } else if (i == 524531317 && !this.t) {
            if (this.c && this.x != -1) {
                this.w = true;
                return;
            }
            this.X.b(new ts2(this.r));
            this.t = true;
        }
    }

    public final void j(int i, String str) {
        if (i == 134) {
            this.s.a = str;
        } else if (i != 17026) {
            if (i != 2274716) {
                return;
            }
            et2.a(this.s, str);
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            throw new eq2("DocType " + str + " not supported");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e9, code lost:
        throw new com.daaw.eq2("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r19, int r20, com.daaw.ms2 r21) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ft2.k(int, int, com.daaw.ms2):void");
    }

    public final long n(long j) {
        long j2 = this.p;
        if (j2 != -9223372036854775807L) {
            return pz2.j(j, j2, 1000L);
        }
        throw new eq2("Can't scale timecode prior to timecodeScale being set.");
    }

    public final void o(et2 et2Var, long j) {
        int i;
        byte[] q;
        if ("S_TEXT/UTF8".equals(et2Var.a)) {
            byte[] bArr = this.j.a;
            long j2 = this.F;
            if (j2 == -9223372036854775807L) {
                q = b0;
            } else {
                int i2 = (int) (j2 / 3600000000L);
                long j3 = j2 - (i2 * 3600000000L);
                int i3 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i3);
                q = pz2.q(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (i * 1000000)) / 1000))));
            }
            System.arraycopy(q, 0, bArr, 19, 12);
            ws2 ws2Var = et2Var.O;
            iz2 iz2Var = this.j;
            ws2Var.c(iz2Var, iz2Var.d());
            this.U += this.j.d();
        }
        et2Var.O.d(j, this.L, this.U, 0, et2Var.g);
        this.V = true;
        p();
    }

    public final void p() {
        this.M = 0;
        this.U = 0;
        this.T = 0;
        this.N = false;
        this.O = false;
        this.Q = false;
        this.S = 0;
        this.R = (byte) 0;
        this.P = false;
        this.i.r();
    }

    public final int r(ms2 ms2Var, ws2 ws2Var, int i) {
        int b;
        int a = this.i.a();
        if (a > 0) {
            b = Math.min(i, a);
            ws2Var.c(this.i, b);
        } else {
            b = ws2Var.b(ms2Var, i, false);
        }
        this.M += b;
        this.U += b;
        return b;
    }

    public final void s(ms2 ms2Var, int i) {
        if (this.f.d() >= i) {
            return;
        }
        if (this.f.b() < i) {
            iz2 iz2Var = this.f;
            byte[] bArr = iz2Var.a;
            int length = bArr.length;
            iz2Var.t(Arrays.copyOf(bArr, Math.max(length + length, i)), this.f.d());
        }
        iz2 iz2Var2 = this.f;
        ms2Var.h(iz2Var2.a, iz2Var2.d(), i - this.f.d(), false);
        this.f.u(i);
    }

    public final void t(ms2 ms2Var, et2 et2Var, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(et2Var.a)) {
            int i3 = i + 32;
            if (this.j.b() < i3) {
                this.j.a = Arrays.copyOf(a0, i3 + i);
            }
            ms2Var.h(this.j.a, 32, i, false);
            this.j.v(0);
            this.j.u(i3);
            return;
        }
        ws2 ws2Var = et2Var.O;
        if (!this.N) {
            if (et2Var.e) {
                this.L &= -1073741825;
                if (!this.O) {
                    ms2Var.h(this.f.a, 0, 1, false);
                    this.M++;
                    byte b = this.f.a[0];
                    if ((b & 128) == 128) {
                        throw new eq2("Extension bit is set in signal byte");
                    }
                    this.R = b;
                    this.O = true;
                }
                byte b2 = this.R;
                if ((b2 & 1) == 1) {
                    int i4 = b2 & 2;
                    this.L |= 1073741824;
                    if (!this.P) {
                        ms2Var.h(this.k.a, 0, 8, false);
                        this.M += 8;
                        this.P = true;
                        iz2 iz2Var = this.f;
                        iz2Var.a[0] = (byte) ((i4 != 2 ? 0 : 128) | 8);
                        iz2Var.v(0);
                        ws2Var.c(this.f, 1);
                        this.U++;
                        this.k.v(0);
                        ws2Var.c(this.k, 8);
                        this.U += 8;
                    }
                    if (i4 == 2) {
                        if (!this.Q) {
                            ms2Var.h(this.f.a, 0, 1, false);
                            this.M++;
                            this.f.v(0);
                            this.S = this.f.g();
                            this.Q = true;
                        }
                        int i5 = this.S * 4;
                        this.f.s(i5);
                        ms2Var.h(this.f.a, 0, i5, false);
                        this.M += i5;
                        int i6 = (this.S >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.m;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.m = ByteBuffer.allocate(i7);
                        }
                        this.m.position(0);
                        this.m.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.S;
                            if (i8 >= i2) {
                                break;
                            }
                            int i10 = this.f.i();
                            if (i8 % 2 == 0) {
                                this.m.putShort((short) (i10 - i9));
                            } else {
                                this.m.putInt(i10 - i9);
                            }
                            i8++;
                            i9 = i10;
                        }
                        int i11 = (i - this.M) - i9;
                        if ((i2 & 1) == 1) {
                            this.m.putInt(i11);
                        } else {
                            this.m.putShort((short) i11);
                            this.m.putInt(0);
                        }
                        this.l.t(this.m.array(), i7);
                        ws2Var.c(this.l, i7);
                        this.U += i7;
                    }
                }
            } else {
                byte[] bArr = et2Var.f;
                if (bArr != null) {
                    this.i.t(bArr, bArr.length);
                }
            }
            this.N = true;
        }
        int d = i + this.i.d();
        if (!"V_MPEG4/ISO/AVC".equals(et2Var.a) && !"V_MPEGH/ISO/HEVC".equals(et2Var.a)) {
            while (true) {
                int i12 = this.M;
                if (i12 >= d) {
                    break;
                }
                r(ms2Var, ws2Var, d - i12);
            }
        } else {
            byte[] bArr2 = this.e.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i13 = et2Var.P;
            int i14 = 4 - i13;
            while (this.M < d) {
                int i15 = this.T;
                if (i15 == 0) {
                    int min = Math.min(i13, this.i.a());
                    ms2Var.h(bArr2, i14 + min, i13 - min, false);
                    if (min > 0) {
                        this.i.q(bArr2, i14, min);
                    }
                    this.M += i13;
                    this.e.v(0);
                    this.T = this.e.i();
                    this.d.v(0);
                    ws2Var.c(this.d, 4);
                    this.U += 4;
                } else {
                    this.T = i15 - r(ms2Var, ws2Var, i15);
                }
            }
        }
        if ("A_VORBIS".equals(et2Var.a)) {
            this.g.v(0);
            ws2Var.c(this.g, 4);
            this.U += 4;
        }
    }
}
