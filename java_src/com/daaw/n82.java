package com.daaw;

import android.net.Uri;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class n82 implements j09 {
    public static final q09 c0 = new q09() { // from class: com.daaw.j82
        @Override // com.daaw.q09
        public final /* synthetic */ j09[] a(Uri uri, Map map) {
            return p09.a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = n82.c0;
            return new j09[]{new n82(0)};
        }
    };
    public static final byte[] d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] e0 = it5.B("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final byte[] f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID h0 = new UUID(72057594037932032L, -9223371306706625679L);
    public static final Map i0;
    public long A;
    public long B;
    public va5 C;
    public va5 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final i82 a;
    public boolean a0;
    public final p82 b;
    public m09 b0;
    public final SparseArray c;
    public final boolean d;
    public final ik5 e;
    public final ik5 f;
    public final ik5 g;
    public final ik5 h;
    public final ik5 i;
    public final ik5 j;
    public final ik5 k;
    public final ik5 l;
    public final ik5 m;
    public final ik5 n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public m82 u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        i0 = Collections.unmodifiableMap(hashMap);
    }

    public n82(int i) {
        g82 g82Var = new g82();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = g82Var;
        g82Var.b(new l82(this, null));
        this.d = true;
        this.b = new p82();
        this.c = new SparseArray();
        this.g = new ik5(4);
        this.h = new ik5(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new ik5(4);
        this.e = new ik5(c42.a);
        this.f = new ik5(4);
        this.j = new ik5();
        this.k = new ik5();
        this.l = new ik5(8);
        this.m = new ik5();
        this.n = new ik5();
        this.L = new int[1];
    }

    public static final int n(int i) {
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
            case 238:
            case 241:
            case 251:
            case 16871:
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
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
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
            case 165:
            case 16877:
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
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public static final boolean o(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public static byte[] y(long j, String str, long j2) {
        uo4.d(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return it5.B(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    public static int[] z(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.daaw.j09
    public final boolean a(k09 k09Var) {
        return new o82().a(k09Var);
    }

    @Override // com.daaw.j09
    public final void c(m09 m09Var) {
        this.b0 = m09Var;
    }

    @Override // com.daaw.j09
    public final int d(k09 k09Var, f42 f42Var) {
        this.F = false;
        while (!this.F) {
            if (!this.a.a(k09Var)) {
                for (int i = 0; i < this.c.size(); i++) {
                    m82 m82Var = (m82) this.c.valueAt(i);
                    m82.d(m82Var);
                    n42 n42Var = m82Var.T;
                    if (n42Var != null) {
                        n42Var.a(m82Var.X, m82Var.j);
                    }
                }
                return -1;
            }
            long zzf = k09Var.zzf();
            if (this.y) {
                this.A = zzf;
                f42Var.a = this.z;
                this.y = false;
                return 1;
            } else if (this.v) {
                long j = this.A;
                if (j != -1) {
                    f42Var.a = j;
                    this.A = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.daaw.j09
    public final void f(long j, long j2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.a.zzb();
        this.b.e();
        w();
        for (int i = 0; i < this.c.size(); i++) {
            n42 n42Var = ((m82) this.c.valueAt(i)).T;
            if (n42Var != null) {
                n42Var.b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0282, code lost:
        throw com.daaw.dl3.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r19, int r20, com.daaw.k09 r21) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.n82.g(int, int, com.daaw.k09):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e8, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r22) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.n82.h(int):void");
    }

    public final void i(int i, double d) {
        if (i == 181) {
            t(i);
            this.u.Q = (int) d;
        } else if (i == 17545) {
            this.s = (long) d;
        } else {
            switch (i) {
                case 21969:
                    t(i);
                    this.u.D = (float) d;
                    return;
                case 21970:
                    t(i);
                    this.u.E = (float) d;
                    return;
                case 21971:
                    t(i);
                    this.u.F = (float) d;
                    return;
                case 21972:
                    t(i);
                    this.u.G = (float) d;
                    return;
                case 21973:
                    t(i);
                    this.u.H = (float) d;
                    return;
                case 21974:
                    t(i);
                    this.u.I = (float) d;
                    return;
                case 21975:
                    t(i);
                    this.u.J = (float) d;
                    return;
                case 21976:
                    t(i);
                    this.u.K = (float) d;
                    return;
                case 21977:
                    t(i);
                    this.u.L = (float) d;
                    return;
                case 21978:
                    t(i);
                    this.u.M = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            t(i);
                            this.u.s = (float) d;
                            return;
                        case 30324:
                            t(i);
                            this.u.t = (float) d;
                            return;
                        case 30325:
                            t(i);
                            this.u.u = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public final void j(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw dl3.a("ContentEncodingOrder " + j + " not supported", null);
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw dl3.a("ContentEncodingScope " + j + " not supported", null);
        } else {
            switch (i) {
                case 131:
                    t(i);
                    this.u.d = (int) j;
                    return;
                case 136:
                    t(i);
                    this.u.V = j == 1;
                    return;
                case 155:
                    this.I = r(j);
                    return;
                case 159:
                    t(i);
                    this.u.O = (int) j;
                    return;
                case 176:
                    t(i);
                    this.u.m = (int) j;
                    return;
                case 179:
                    s(i);
                    this.C.c(r(j));
                    return;
                case 186:
                    t(i);
                    this.u.n = (int) j;
                    return;
                case 215:
                    t(i);
                    this.u.c = (int) j;
                    return;
                case 231:
                    this.B = r(j);
                    return;
                case 238:
                    this.P = (int) j;
                    return;
                case 241:
                    if (this.E) {
                        return;
                    }
                    s(i);
                    this.D.c(j);
                    this.E = true;
                    return;
                case 251:
                    this.Q = true;
                    return;
                case 16871:
                    t(i);
                    m82.b(this.u, (int) j);
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw dl3.a("ContentCompAlgo " + j + " not supported", null);
                case 17029:
                    if (j < 1 || j > 2) {
                        throw dl3.a("DocTypeReadVersion " + j + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw dl3.a("EBMLReadVersion " + j + " not supported", null);
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw dl3.a("ContentEncAlgo " + j + " not supported", null);
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw dl3.a("AESSettingsCipherMode " + j + " not supported", null);
                case 21420:
                    this.x = j + this.q;
                    return;
                case 21432:
                    t(i);
                    int i2 = (int) j;
                    if (i2 == 0) {
                        this.u.w = 0;
                        return;
                    } else if (i2 == 1) {
                        this.u.w = 2;
                        return;
                    } else if (i2 == 3) {
                        this.u.w = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.u.w = 3;
                        return;
                    }
                case 21680:
                    t(i);
                    this.u.o = (int) j;
                    return;
                case 21682:
                    t(i);
                    this.u.q = (int) j;
                    return;
                case 21690:
                    t(i);
                    this.u.p = (int) j;
                    return;
                case 21930:
                    t(i);
                    this.u.U = j == 1;
                    return;
                case 21998:
                    t(i);
                    this.u.f = (int) j;
                    return;
                case 22186:
                    t(i);
                    this.u.R = j;
                    return;
                case 22203:
                    t(i);
                    this.u.S = j;
                    return;
                case 25188:
                    t(i);
                    this.u.P = (int) j;
                    return;
                case 30114:
                    this.R = j;
                    return;
                case 30321:
                    t(i);
                    int i3 = (int) j;
                    if (i3 == 0) {
                        this.u.r = 0;
                        return;
                    } else if (i3 == 1) {
                        this.u.r = 1;
                        return;
                    } else if (i3 == 2) {
                        this.u.r = 2;
                        return;
                    } else if (i3 != 3) {
                        return;
                    } else {
                        this.u.r = 3;
                        return;
                    }
                case 2352003:
                    t(i);
                    this.u.e = (int) j;
                    return;
                case 2807729:
                    this.r = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            t(i);
                            int i4 = (int) j;
                            if (i4 == 1) {
                                this.u.A = 2;
                                return;
                            } else if (i4 != 2) {
                                return;
                            } else {
                                this.u.A = 1;
                                return;
                            }
                        case 21946:
                            t(i);
                            int b = mo8.b((int) j);
                            if (b != -1) {
                                this.u.z = b;
                                return;
                            }
                            return;
                        case 21947:
                            t(i);
                            m82 m82Var = this.u;
                            m82Var.x = true;
                            int a = mo8.a((int) j);
                            if (a != -1) {
                                m82Var.y = a;
                                return;
                            }
                            return;
                        case 21948:
                            t(i);
                            this.u.B = (int) j;
                            return;
                        case 21949:
                            t(i);
                            this.u.C = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public final void k(int i, long j, long j2) {
        uo4.b(this.b0);
        if (i == 160) {
            this.Q = false;
            this.R = 0L;
        } else if (i == 174) {
            this.u = new m82();
        } else if (i == 187) {
            this.E = false;
        } else if (i == 19899) {
            this.w = -1;
            this.x = -1L;
        } else if (i == 20533) {
            t(i);
            this.u.h = true;
        } else if (i == 21968) {
            t(i);
            this.u.x = true;
        } else if (i == 408125543) {
            long j3 = this.q;
            if (j3 != -1 && j3 != j) {
                throw dl3.a("Multiple Segment elements not supported", null);
            }
            this.q = j;
            this.p = j2;
        } else if (i == 475249515) {
            this.C = new va5(32);
            this.D = new va5(32);
        } else if (i == 524531317 && !this.v) {
            if (this.d && this.z != -1) {
                this.y = true;
                return;
            }
            this.b0.i(new h42(this.t, 0L));
            this.v = true;
        }
    }

    public final void l(int i, String str) {
        if (i == 134) {
            t(i);
            this.u.b = str;
        } else if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw dl3.a("DocType " + str + " not supported", null);
        } else if (i == 21358) {
            t(i);
            this.u.a = str;
        } else if (i != 2274716) {
        } else {
            t(i);
            m82.c(this.u, str);
        }
    }

    @RequiresNonNull({"#2.output"})
    public final int p(k09 k09Var, m82 m82Var, int i, boolean z) {
        int i2;
        if ("S_TEXT/UTF8".equals(m82Var.b)) {
            x(k09Var, d0, i);
        } else if ("S_TEXT/ASS".equals(m82Var.b)) {
            x(k09Var, f0, i);
        } else if ("S_TEXT/WEBVTT".equals(m82Var.b)) {
            x(k09Var, g0, i);
        } else {
            m42 m42Var = m82Var.X;
            if (!this.V) {
                if (m82Var.h) {
                    this.O &= -1073741825;
                    if (!this.W) {
                        ((rz8) k09Var).e(this.g.h(), 0, 1, false);
                        this.S++;
                        if ((this.g.h()[0] & 128) == 128) {
                            throw dl3.a("Extension bit is set in signal byte", null);
                        }
                        this.Z = this.g.h()[0];
                        this.W = true;
                    }
                    byte b = this.Z;
                    if ((b & 1) == 1) {
                        int i3 = b & 2;
                        this.O |= 1073741824;
                        if (!this.a0) {
                            ((rz8) k09Var).e(this.l.h(), 0, 8, false);
                            this.S += 8;
                            this.a0 = true;
                            this.g.h()[0] = (byte) ((i3 != 2 ? 0 : 128) | 8);
                            this.g.f(0);
                            m42Var.a(this.g, 1, 1);
                            this.T++;
                            this.l.f(0);
                            m42Var.a(this.l, 8, 1);
                            this.T += 8;
                        }
                        if (i3 == 2) {
                            if (!this.X) {
                                ((rz8) k09Var).e(this.g.h(), 0, 1, false);
                                this.S++;
                                this.g.f(0);
                                this.Y = this.g.s();
                                this.X = true;
                            }
                            int i4 = this.Y * 4;
                            this.g.c(i4);
                            ((rz8) k09Var).e(this.g.h(), 0, i4, false);
                            this.S += i4;
                            int i5 = (this.Y >> 1) + 1;
                            int i6 = (i5 * 6) + 2;
                            ByteBuffer byteBuffer = this.o;
                            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                this.o = ByteBuffer.allocate(i6);
                            }
                            this.o.position(0);
                            this.o.putShort((short) i5);
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                i2 = this.Y;
                                if (i7 >= i2) {
                                    break;
                                }
                                int v = this.g.v();
                                if (i7 % 2 == 0) {
                                    this.o.putShort((short) (v - i8));
                                } else {
                                    this.o.putInt(v - i8);
                                }
                                i7++;
                                i8 = v;
                            }
                            int i9 = (i - this.S) - i8;
                            if ((i2 & 1) == 1) {
                                this.o.putInt(i9);
                            } else {
                                this.o.putShort((short) i9);
                                this.o.putInt(0);
                            }
                            this.m.d(this.o.array(), i6);
                            m42Var.a(this.m, i6, 1);
                            this.T += i6;
                        }
                    }
                } else {
                    byte[] bArr = m82Var.i;
                    if (bArr != null) {
                        this.j.d(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(m82Var.b) ? m82Var.f > 0 : z) {
                    this.O |= 268435456;
                    this.n.c(0);
                    int l = (this.j.l() + i) - this.S;
                    this.g.c(4);
                    this.g.h()[0] = (byte) ((l >> 24) & 255);
                    this.g.h()[1] = (byte) ((l >> 16) & 255);
                    this.g.h()[2] = (byte) ((l >> 8) & 255);
                    this.g.h()[3] = (byte) (l & 255);
                    m42Var.a(this.g, 4, 2);
                    this.T += 4;
                }
                this.V = true;
            }
            int l2 = i + this.j.l();
            if (!"V_MPEG4/ISO/AVC".equals(m82Var.b) && !"V_MPEGH/ISO/HEVC".equals(m82Var.b)) {
                if (m82Var.T != null) {
                    uo4.f(this.j.l() == 0);
                    m82Var.T.d(k09Var);
                }
                while (true) {
                    int i10 = this.S;
                    if (i10 >= l2) {
                        break;
                    }
                    int q = q(k09Var, m42Var, l2 - i10);
                    this.S += q;
                    this.T += q;
                }
            } else {
                byte[] h = this.f.h();
                h[0] = 0;
                h[1] = 0;
                h[2] = 0;
                int i11 = m82Var.Y;
                int i12 = 4 - i11;
                while (this.S < l2) {
                    int i13 = this.U;
                    if (i13 == 0) {
                        int min = Math.min(i11, this.j.i());
                        ((rz8) k09Var).e(h, i12 + min, i11 - min, false);
                        if (min > 0) {
                            this.j.b(h, i12, min);
                        }
                        this.S += i11;
                        this.f.f(0);
                        this.U = this.f.v();
                        this.e.f(0);
                        k42.b(m42Var, this.e, 4);
                        this.T += 4;
                    } else {
                        int q2 = q(k09Var, m42Var, i13);
                        this.S += q2;
                        this.T += q2;
                        this.U -= q2;
                    }
                }
            }
            if ("A_VORBIS".equals(m82Var.b)) {
                this.h.f(0);
                k42.b(m42Var, this.h, 4);
                this.T += 4;
            }
        }
        int i14 = this.T;
        w();
        return i14;
    }

    public final int q(k09 k09Var, m42 m42Var, int i) {
        int i2 = this.j.i();
        if (i2 > 0) {
            int min = Math.min(i, i2);
            k42.b(m42Var, this.j, min);
            return min;
        }
        return k42.a(m42Var, k09Var, i, false);
    }

    public final long r(long j) {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return it5.g0(j, j2, 1000L);
        }
        throw dl3.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void s(int i) {
        if (this.C == null || this.D == null) {
            throw dl3.a("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    public final void t(int i) {
        if (this.u != null) {
            return;
        }
        throw dl3.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de A[EDGE_INSN: B:63:0x00de->B:52:0x00de ?: BREAK  , SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(com.daaw.m82 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.n82.u(com.daaw.m82, long, int, int, int):void");
    }

    public final void v(k09 k09Var, int i) {
        if (this.g.l() >= i) {
            return;
        }
        if (this.g.j() < i) {
            ik5 ik5Var = this.g;
            int j = ik5Var.j();
            ik5Var.H(Math.max(j + j, i));
        }
        ((rz8) k09Var).e(this.g.h(), this.g.l(), i - this.g.l(), false);
        this.g.e(i);
    }

    public final void w() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.c(0);
    }

    public final void x(k09 k09Var, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        if (this.k.j() < i2) {
            ik5 ik5Var = this.k;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            ik5Var.d(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.k.h(), 0, length);
        }
        ((rz8) k09Var).e(this.k.h(), length, i, false);
        this.k.f(0);
        this.k.e(i2);
    }
}
