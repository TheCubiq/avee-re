package com.daaw;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzw;
import com.google.android.gms.internal.ads.zzx;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
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

    /* renamed from: c0 */
    public static final q09 f19646c0 = new q09() { // from class: com.daaw.j82
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = n82.f19646c0;
            return new j09[]{new n82(0)};
        }
    };

    /* renamed from: d0 */
    public static final byte[] f19647d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: e0 */
    public static final byte[] f19648e0 = it5.m19430B("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0 */
    public static final byte[] f19649f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0 */
    public static final byte[] f19650g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: h0 */
    public static final UUID f19651h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: i0 */
    public static final Map f19652i0;

    /* renamed from: A */
    public long f19653A;

    /* renamed from: B */
    public long f19654B;

    /* renamed from: C */
    public va5 f19655C;

    /* renamed from: D */
    public va5 f19656D;

    /* renamed from: E */
    public boolean f19657E;

    /* renamed from: F */
    public boolean f19658F;

    /* renamed from: G */
    public int f19659G;

    /* renamed from: H */
    public long f19660H;

    /* renamed from: I */
    public long f19661I;

    /* renamed from: J */
    public int f19662J;

    /* renamed from: K */
    public int f19663K;

    /* renamed from: L */
    public int[] f19664L;

    /* renamed from: M */
    public int f19665M;

    /* renamed from: N */
    public int f19666N;

    /* renamed from: O */
    public int f19667O;

    /* renamed from: P */
    public int f19668P;

    /* renamed from: Q */
    public boolean f19669Q;

    /* renamed from: R */
    public long f19670R;

    /* renamed from: S */
    public int f19671S;

    /* renamed from: T */
    public int f19672T;

    /* renamed from: U */
    public int f19673U;

    /* renamed from: V */
    public boolean f19674V;

    /* renamed from: W */
    public boolean f19675W;

    /* renamed from: X */
    public boolean f19676X;

    /* renamed from: Y */
    public int f19677Y;

    /* renamed from: Z */
    public byte f19678Z;

    /* renamed from: a */
    public final i82 f19679a;

    /* renamed from: a0 */
    public boolean f19680a0;

    /* renamed from: b */
    public final p82 f19681b;

    /* renamed from: b0 */
    public m09 f19682b0;

    /* renamed from: c */
    public final SparseArray f19683c;

    /* renamed from: d */
    public final boolean f19684d;

    /* renamed from: e */
    public final ik5 f19685e;

    /* renamed from: f */
    public final ik5 f19686f;

    /* renamed from: g */
    public final ik5 f19687g;

    /* renamed from: h */
    public final ik5 f19688h;

    /* renamed from: i */
    public final ik5 f19689i;

    /* renamed from: j */
    public final ik5 f19690j;

    /* renamed from: k */
    public final ik5 f19691k;

    /* renamed from: l */
    public final ik5 f19692l;

    /* renamed from: m */
    public final ik5 f19693m;

    /* renamed from: n */
    public final ik5 f19694n;

    /* renamed from: o */
    public ByteBuffer f19695o;

    /* renamed from: p */
    public long f19696p;

    /* renamed from: q */
    public long f19697q;

    /* renamed from: r */
    public long f19698r;

    /* renamed from: s */
    public long f19699s;

    /* renamed from: t */
    public long f19700t;

    /* renamed from: u */
    public m82 f19701u;

    /* renamed from: v */
    public boolean f19702v;

    /* renamed from: w */
    public int f19703w;

    /* renamed from: x */
    public long f19704x;

    /* renamed from: y */
    public boolean f19705y;

    /* renamed from: z */
    public long f19706z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f19652i0 = Collections.unmodifiableMap(hashMap);
    }

    public n82(int i) {
        g82 g82Var = new g82();
        this.f19697q = -1L;
        this.f19698r = -9223372036854775807L;
        this.f19699s = -9223372036854775807L;
        this.f19700t = -9223372036854775807L;
        this.f19706z = -1L;
        this.f19653A = -1L;
        this.f19654B = -9223372036854775807L;
        this.f19679a = g82Var;
        g82Var.mo20030b(new l82(this, null));
        this.f19684d = true;
        this.f19681b = new p82();
        this.f19683c = new SparseArray();
        this.f19687g = new ik5(4);
        this.f19688h = new ik5(ByteBuffer.allocate(4).putInt(-1).array());
        this.f19689i = new ik5(4);
        this.f19685e = new ik5(c42.f5462a);
        this.f19686f = new ik5(4);
        this.f19690j = new ik5();
        this.f19691k = new ik5();
        this.f19692l = new ik5(8);
        this.f19693m = new ik5();
        this.f19694n = new ik5();
        this.f19664L = new int[1];
    }

    /* renamed from: n */
    public static final int m15426n(int i) {
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

    /* renamed from: o */
    public static final boolean m15425o(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: y */
    public static byte[] m15415y(long j, String str, long j2) {
        uo4.m7874d(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return it5.m19430B(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    /* renamed from: z */
    public static int[] m15414z(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.daaw.j09
    /* renamed from: a */
    public final boolean mo3957a(k09 k09Var) {
        return new o82().m14450a(k09Var);
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f19682b0 = m09Var;
    }

    @Override // com.daaw.j09
    /* renamed from: d */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        this.f19658F = false;
        while (!this.f19658F) {
            if (!this.f19679a.mo20031a(k09Var)) {
                for (int i = 0; i < this.f19683c.size(); i++) {
                    m82 m82Var = (m82) this.f19683c.valueAt(i);
                    m82.m16174d(m82Var);
                    n42 n42Var = m82Var.f18621T;
                    if (n42Var != null) {
                        n42Var.m15532a(m82Var.f18625X, m82Var.f18636j);
                    }
                }
                return -1;
            }
            long zzf = k09Var.zzf();
            if (this.f19705y) {
                this.f19653A = zzf;
                f42Var.f9093a = this.f19706z;
                this.f19705y = false;
                return 1;
            } else if (this.f19702v) {
                long j = this.f19653A;
                if (j != -1) {
                    f42Var.f9093a = j;
                    this.f19653A = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        this.f19654B = -9223372036854775807L;
        this.f19659G = 0;
        this.f19679a.zzb();
        this.f19681b.m13588e();
        m15417w();
        for (int i = 0; i < this.f19683c.size(); i++) {
            n42 n42Var = ((m82) this.f19683c.valueAt(i)).f18621T;
            if (n42Var != null) {
                n42Var.m15531b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0282, code lost:
        throw com.daaw.dl3.m24267a("EBML lacing sample size out of range.", null);
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m15433g(int i, int i2, k09 k09Var) {
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = 1;
        int i9 = 0;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (this.f19659G != 2) {
                    return;
                }
                m82 m82Var = (m82) this.f19683c.get(this.f19665M);
                if (this.f19668P != 4 || !"V_VP9".equals(m82Var.f18628b)) {
                    ((rz8) k09Var).m10811l(i2, false);
                    return;
                }
                this.f19694n.m19719c(i2);
                ((rz8) k09Var).mo5663e(this.f19694n.m19714h(), 0, i2, false);
                return;
            } else if (i7 == 16877) {
                m15420t(i);
                m82 m82Var2 = this.f19701u;
                if (m82.m16177a(m82Var2) != 1685485123 && m82.m16177a(m82Var2) != 1685480259) {
                    ((rz8) k09Var).m10811l(i2, false);
                    return;
                }
                byte[] bArr = new byte[i2];
                m82Var2.f18615N = bArr;
                ((rz8) k09Var).mo5663e(bArr, 0, i2, false);
                return;
            } else if (i7 == 16981) {
                m15420t(i);
                byte[] bArr2 = new byte[i2];
                this.f19701u.f18635i = bArr2;
                ((rz8) k09Var).mo5663e(bArr2, 0, i2, false);
                return;
            } else if (i7 == 18402) {
                byte[] bArr3 = new byte[i2];
                ((rz8) k09Var).mo5663e(bArr3, 0, i2, false);
                m15420t(i);
                this.f19701u.f18636j = new l42(1, bArr3, 0, 0);
                return;
            } else if (i7 == 21419) {
                Arrays.fill(this.f19689i.m19714h(), (byte) 0);
                ((rz8) k09Var).mo5663e(this.f19689i.m19714h(), 4 - i2, i2, false);
                this.f19689i.m19716f(0);
                this.f19703w = (int) this.f19689i.m19729A();
                return;
            } else if (i7 == 25506) {
                m15420t(i);
                byte[] bArr4 = new byte[i2];
                this.f19701u.f18637k = bArr4;
                ((rz8) k09Var).mo5663e(bArr4, 0, i2, false);
                return;
            } else if (i7 != 30322) {
                throw dl3.m24267a("Unexpected id: " + i7, null);
            } else {
                m15420t(i);
                byte[] bArr5 = new byte[i2];
                this.f19701u.f18648v = bArr5;
                ((rz8) k09Var).mo5663e(bArr5, 0, i2, false);
                return;
            }
        }
        int i10 = 8;
        if (this.f19659G == 0) {
            this.f19665M = (int) this.f19681b.m13589d(k09Var, false, true, 8);
            this.f19666N = this.f19681b.m13592a();
            this.f19661I = -9223372036854775807L;
            this.f19659G = 1;
            this.f19687g.m19719c(0);
        }
        m82 m82Var3 = (m82) this.f19683c.get(this.f19665M);
        if (m82Var3 == null) {
            ((rz8) k09Var).m10811l(i2 - this.f19666N, false);
            this.f19659G = 0;
            return;
        }
        m82.m16174d(m82Var3);
        if (this.f19659G == 1) {
            m15418v(k09Var, 3);
            int i11 = (this.f19687g.m19714h()[2] & 6) >> 1;
            byte b = 255;
            if (i11 == 0) {
                this.f19663K = 1;
                int[] m15414z = m15414z(this.f19664L, 1);
                this.f19664L = m15414z;
                m15414z[0] = (i2 - this.f19666N) - 3;
            } else {
                m15418v(k09Var, 4);
                int i12 = (this.f19687g.m19714h()[3] & 255) + 1;
                this.f19663K = i12;
                int[] m15414z2 = m15414z(this.f19664L, i12);
                this.f19664L = m15414z2;
                if (i11 == 2) {
                    int i13 = this.f19666N;
                    int i14 = this.f19663K;
                    Arrays.fill(m15414z2, 0, i14, ((i2 - i13) - 4) / i14);
                } else if (i11 == 1) {
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 4;
                    while (true) {
                        i3 = this.f19663K - 1;
                        if (i15 >= i3) {
                            break;
                        }
                        this.f19664L[i15] = 0;
                        do {
                            i17++;
                            m15418v(k09Var, i17);
                            i4 = this.f19687g.m19714h()[i17 - 1] & 255;
                            int[] iArr = this.f19664L;
                            i5 = iArr[i15] + i4;
                            iArr[i15] = i5;
                        } while (i4 == 255);
                        i16 += i5;
                        i15++;
                    }
                    this.f19664L[i3] = ((i2 - this.f19666N) - i17) - i16;
                } else if (i11 != 3) {
                    throw dl3.m24267a("Unexpected lacing value: 2", null);
                } else {
                    int i18 = 0;
                    int i19 = 4;
                    int i20 = 0;
                    while (true) {
                        int i21 = this.f19663K - 1;
                        if (i18 >= i21) {
                            this.f19664L[i21] = ((i2 - this.f19666N) - i19) - i20;
                            break;
                        }
                        this.f19664L[i18] = i9;
                        i19++;
                        m15418v(k09Var, i19);
                        int i22 = i19 - 1;
                        if (this.f19687g.m19714h()[i22] == 0) {
                            throw dl3.m24267a("No valid varint length mask found", null);
                        }
                        int i23 = 0;
                        while (true) {
                            if (i23 >= i10) {
                                j = 0;
                                break;
                            }
                            int i24 = i8 << (7 - i23);
                            if ((this.f19687g.m19714h()[i22] & i24) != 0) {
                                i19 += i23;
                                m15418v(k09Var, i19);
                                int i25 = i22 + 1;
                                j = this.f19687g.m19714h()[i22] & b & (i24 ^ (-1));
                                while (i25 < i19) {
                                    j = (j << i10) | (this.f19687g.m19714h()[i25] & 255);
                                    i25++;
                                    i10 = 8;
                                }
                                if (i18 > 0) {
                                    j -= (1 << ((i23 * 7) + 6)) - 1;
                                }
                            } else {
                                i23++;
                                i8 = 1;
                                i10 = 8;
                                b = 255;
                            }
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            break;
                        }
                        int i26 = (int) j;
                        int[] iArr2 = this.f19664L;
                        if (i18 != 0) {
                            i26 += iArr2[i18 - 1];
                        }
                        iArr2[i18] = i26;
                        i20 += i26;
                        i18++;
                        i8 = 1;
                        i9 = 0;
                        i10 = 8;
                        b = 255;
                    }
                }
            }
            this.f19660H = this.f19654B + m15422r((this.f19687g.m19714h()[0] << 8) | (this.f19687g.m19714h()[1] & 255));
            if (m82Var3.f18630d != 2) {
                if (i7 == 163) {
                    if ((this.f19687g.m19714h()[2] & 128) == 128) {
                        i7 = 163;
                    } else {
                        i7 = 163;
                    }
                }
                i6 = 0;
                this.f19667O = i6;
                this.f19659G = 2;
                this.f19662J = 0;
            }
            i6 = 1;
            this.f19667O = i6;
            this.f19659G = 2;
            this.f19662J = 0;
        }
        if (i7 == 163) {
            while (true) {
                int i27 = this.f19662J;
                if (i27 >= this.f19663K) {
                    this.f19659G = 0;
                    return;
                }
                m15419u(m82Var3, ((this.f19662J * m82Var3.f18631e) / 1000) + this.f19660H, this.f19667O, m15424p(k09Var, m82Var3, this.f19664L[i27], false), 0);
                this.f19662J++;
            }
        } else {
            while (true) {
                int i28 = this.f19662J;
                if (i28 >= this.f19663K) {
                    return;
                }
                int[] iArr3 = this.f19664L;
                iArr3[i28] = m15424p(k09Var, m82Var3, iArr3[i28], true);
                this.f19662J++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e8, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L95;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m15432h(int i) {
        int i2;
        int i3;
        i42 h42Var;
        int i4;
        uo4.m7876b(this.f19682b0);
        char c = '\b';
        if (i == 160) {
            if (this.f19659G != 2) {
                return;
            }
            m82 m82Var = (m82) this.f19683c.get(this.f19665M);
            m82.m16174d(m82Var);
            if (this.f19670R > 0 && "A_OPUS".equals(m82Var.f18628b)) {
                ik5 ik5Var = this.f19694n;
                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f19670R).array();
                ik5Var.m19718d(array, array.length);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f19663K; i6++) {
                i5 += this.f19664L[i6];
            }
            int i7 = 0;
            while (i7 < this.f19663K) {
                long j = ((m82Var.f18631e * i7) / 1000) + this.f19660H;
                int i8 = this.f19667O;
                if (i7 == 0) {
                    if (!this.f19669Q) {
                        i8 |= 1;
                    }
                    i3 = i8;
                    i2 = 0;
                } else {
                    i2 = i7;
                    i3 = i8;
                }
                int i9 = this.f19664L[i2];
                int i10 = i5 - i9;
                m15419u(m82Var, j, i3, i9, i10);
                i7 = i2 + 1;
                i5 = i10;
            }
            this.f19659G = 0;
        } else if (i == 174) {
            m82 m82Var2 = this.f19701u;
            uo4.m7876b(m82Var2);
            String str = m82Var2.f18628b;
            if (str == null) {
                throw dl3.m24267a("CodecId is missing in TrackEntry element", null);
            }
            switch (str.hashCode()) {
                case -2095576542:
                    if (str.equals("V_MPEG4/ISO/AP")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -2095575984:
                    if (str.equals("V_MPEG4/ISO/SP")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1985379776:
                    if (str.equals("A_MS/ACM")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -1784763192:
                    if (str.equals("A_TRUEHD")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1730367663:
                    if (str.equals("A_VORBIS")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641358:
                    if (str.equals("A_MPEG/L2")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641357:
                    if (str.equals("A_MPEG/L3")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -1373388978:
                    if (str.equals("V_MS/VFW/FOURCC")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -933872740:
                    if (str.equals("S_DVBSUB")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case -538363189:
                    if (str.equals("V_MPEG4/ISO/ASP")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -538363109:
                    if (str.equals("V_MPEG4/ISO/AVC")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -425012669:
                    if (str.equals("S_VOBSUB")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case -356037306:
                    if (str.equals("A_DTS/LOSSLESS")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 62923557:
                    if (str.equals("A_AAC")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 62923603:
                    if (str.equals("A_AC3")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 62927045:
                    if (str.equals("A_DTS")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 82318131:
                    if (str.equals("V_AV1")) {
                        c = 2;
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
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 444813526:
                    if (str.equals("V_THEORA")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 542569478:
                    if (str.equals("A_DTS/EXPRESS")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 635596514:
                    if (str.equals("A_PCM/FLOAT/IEEE")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 725948237:
                    if (str.equals("A_PCM/INT/BIG")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 725957860:
                    if (str.equals("A_PCM/INT/LIT")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 738597099:
                    if (str.equals("S_TEXT/ASS")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case 855502857:
                    break;
                case 1045209816:
                    if (str.equals("S_TEXT/WEBVTT")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 1422270023:
                    if (str.equals("S_TEXT/UTF8")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 1809237540:
                    if (str.equals("V_MPEG2")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950749482:
                    if (str.equals("A_EAC3")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950789798:
                    if (str.equals("A_FLAC")) {
                        c = 22;
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
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case ' ':
                    m82Var2.m16173e(this.f19682b0, m82Var2.f18629c);
                    this.f19683c.put(m82Var2.f18629c, m82Var2);
                    break;
            }
            this.f19701u = null;
        } else if (i == 19899) {
            int i11 = this.f19703w;
            if (i11 != -1) {
                long j2 = this.f19704x;
                if (j2 != -1) {
                    if (i11 == 475249515) {
                        this.f19706z = j2;
                        return;
                    }
                    return;
                }
            }
            throw dl3.m24267a("Mandatory element SeekID or SeekPosition not found", null);
        } else if (i == 25152) {
            m15420t(i);
            m82 m82Var3 = this.f19701u;
            if (m82Var3.f18634h) {
                if (m82Var3.f18636j == null) {
                    throw dl3.m24267a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                m82Var3.f18638l = new zzx(null, new zzw(ak8.f3281a, null, "video/webm", this.f19701u.f18636j.f17027b));
            }
        } else if (i == 28032) {
            m15420t(i);
            m82 m82Var4 = this.f19701u;
            if (m82Var4.f18634h && m82Var4.f18635i != null) {
                throw dl3.m24267a("Combining encryption and compression is not supported", null);
            }
        } else if (i == 357149030) {
            if (this.f19698r == -9223372036854775807L) {
                this.f19698r = 1000000L;
            }
            long j3 = this.f19699s;
            if (j3 != -9223372036854775807L) {
                this.f19700t = m15422r(j3);
            }
        } else if (i == 374648427) {
            if (this.f19683c.size() == 0) {
                throw dl3.m24267a("No valid tracks were found", null);
            }
            this.f19682b0.zzC();
        } else if (i == 475249515) {
            if (!this.f19702v) {
                m09 m09Var = this.f19682b0;
                va5 va5Var = this.f19655C;
                va5 va5Var2 = this.f19656D;
                if (this.f19697q == -1 || this.f19700t == -9223372036854775807L || va5Var == null || va5Var.m7300a() == 0 || va5Var2 == null || va5Var2.m7300a() != va5Var.m7300a()) {
                    h42Var = new h42(this.f19700t, 0L);
                } else {
                    int m7300a = va5Var.m7300a();
                    int[] iArr = new int[m7300a];
                    long[] jArr = new long[m7300a];
                    long[] jArr2 = new long[m7300a];
                    long[] jArr3 = new long[m7300a];
                    for (int i12 = 0; i12 < m7300a; i12++) {
                        jArr3[i12] = va5Var.m7299b(i12);
                        jArr[i12] = this.f19697q + va5Var2.m7299b(i12);
                    }
                    int i13 = 0;
                    while (true) {
                        i4 = m7300a - 1;
                        if (i13 >= i4) {
                            break;
                        }
                        int i14 = i13 + 1;
                        iArr[i13] = (int) (jArr[i14] - jArr[i13]);
                        jArr2[i13] = jArr3[i14] - jArr3[i13];
                        i13 = i14;
                    }
                    iArr[i4] = (int) ((this.f19697q + this.f19696p) - jArr[i4]);
                    long j4 = this.f19700t - jArr3[i4];
                    jArr2[i4] = j4;
                    if (j4 <= 0) {
                        s95.m10493e("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                        iArr = Arrays.copyOf(iArr, i4);
                        jArr = Arrays.copyOf(jArr, i4);
                        jArr2 = Arrays.copyOf(jArr2, i4);
                        jArr3 = Arrays.copyOf(jArr3, i4);
                    }
                    h42Var = new pz8(iArr, jArr, jArr2, jArr3);
                }
                m09Var.mo3297i(h42Var);
                this.f19702v = true;
            }
            this.f19655C = null;
            this.f19656D = null;
        }
    }

    /* renamed from: i */
    public final void m15431i(int i, double d) {
        if (i == 181) {
            m15420t(i);
            this.f19701u.f18618Q = (int) d;
        } else if (i == 17545) {
            this.f19699s = (long) d;
        } else {
            switch (i) {
                case 21969:
                    m15420t(i);
                    this.f19701u.f18605D = (float) d;
                    return;
                case 21970:
                    m15420t(i);
                    this.f19701u.f18606E = (float) d;
                    return;
                case 21971:
                    m15420t(i);
                    this.f19701u.f18607F = (float) d;
                    return;
                case 21972:
                    m15420t(i);
                    this.f19701u.f18608G = (float) d;
                    return;
                case 21973:
                    m15420t(i);
                    this.f19701u.f18609H = (float) d;
                    return;
                case 21974:
                    m15420t(i);
                    this.f19701u.f18610I = (float) d;
                    return;
                case 21975:
                    m15420t(i);
                    this.f19701u.f18611J = (float) d;
                    return;
                case 21976:
                    m15420t(i);
                    this.f19701u.f18612K = (float) d;
                    return;
                case 21977:
                    m15420t(i);
                    this.f19701u.f18613L = (float) d;
                    return;
                case 21978:
                    m15420t(i);
                    this.f19701u.f18614M = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            m15420t(i);
                            this.f19701u.f18645s = (float) d;
                            return;
                        case 30324:
                            m15420t(i);
                            this.f19701u.f18646t = (float) d;
                            return;
                        case 30325:
                            m15420t(i);
                            this.f19701u.f18647u = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* renamed from: j */
    public final void m15430j(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw dl3.m24267a("ContentEncodingOrder " + j + " not supported", null);
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw dl3.m24267a("ContentEncodingScope " + j + " not supported", null);
        } else {
            switch (i) {
                case 131:
                    m15420t(i);
                    this.f19701u.f18630d = (int) j;
                    return;
                case 136:
                    m15420t(i);
                    this.f19701u.f18623V = j == 1;
                    return;
                case 155:
                    this.f19661I = m15422r(j);
                    return;
                case 159:
                    m15420t(i);
                    this.f19701u.f18616O = (int) j;
                    return;
                case 176:
                    m15420t(i);
                    this.f19701u.f18639m = (int) j;
                    return;
                case 179:
                    m15421s(i);
                    this.f19655C.m7298c(m15422r(j));
                    return;
                case 186:
                    m15420t(i);
                    this.f19701u.f18640n = (int) j;
                    return;
                case 215:
                    m15420t(i);
                    this.f19701u.f18629c = (int) j;
                    return;
                case 231:
                    this.f19654B = m15422r(j);
                    return;
                case 238:
                    this.f19668P = (int) j;
                    return;
                case 241:
                    if (this.f19657E) {
                        return;
                    }
                    m15421s(i);
                    this.f19656D.m7298c(j);
                    this.f19657E = true;
                    return;
                case 251:
                    this.f19669Q = true;
                    return;
                case 16871:
                    m15420t(i);
                    m82.m16176b(this.f19701u, (int) j);
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw dl3.m24267a("ContentCompAlgo " + j + " not supported", null);
                case 17029:
                    if (j < 1 || j > 2) {
                        throw dl3.m24267a("DocTypeReadVersion " + j + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw dl3.m24267a("EBMLReadVersion " + j + " not supported", null);
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw dl3.m24267a("ContentEncAlgo " + j + " not supported", null);
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw dl3.m24267a("AESSettingsCipherMode " + j + " not supported", null);
                case 21420:
                    this.f19704x = j + this.f19697q;
                    return;
                case 21432:
                    m15420t(i);
                    int i2 = (int) j;
                    if (i2 == 0) {
                        this.f19701u.f18649w = 0;
                        return;
                    } else if (i2 == 1) {
                        this.f19701u.f18649w = 2;
                        return;
                    } else if (i2 == 3) {
                        this.f19701u.f18649w = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.f19701u.f18649w = 3;
                        return;
                    }
                case 21680:
                    m15420t(i);
                    this.f19701u.f18641o = (int) j;
                    return;
                case 21682:
                    m15420t(i);
                    this.f19701u.f18643q = (int) j;
                    return;
                case 21690:
                    m15420t(i);
                    this.f19701u.f18642p = (int) j;
                    return;
                case 21930:
                    m15420t(i);
                    this.f19701u.f18622U = j == 1;
                    return;
                case 21998:
                    m15420t(i);
                    this.f19701u.f18632f = (int) j;
                    return;
                case 22186:
                    m15420t(i);
                    this.f19701u.f18619R = j;
                    return;
                case 22203:
                    m15420t(i);
                    this.f19701u.f18620S = j;
                    return;
                case 25188:
                    m15420t(i);
                    this.f19701u.f18617P = (int) j;
                    return;
                case 30114:
                    this.f19670R = j;
                    return;
                case 30321:
                    m15420t(i);
                    int i3 = (int) j;
                    if (i3 == 0) {
                        this.f19701u.f18644r = 0;
                        return;
                    } else if (i3 == 1) {
                        this.f19701u.f18644r = 1;
                        return;
                    } else if (i3 == 2) {
                        this.f19701u.f18644r = 2;
                        return;
                    } else if (i3 != 3) {
                        return;
                    } else {
                        this.f19701u.f18644r = 3;
                        return;
                    }
                case 2352003:
                    m15420t(i);
                    this.f19701u.f18631e = (int) j;
                    return;
                case 2807729:
                    this.f19698r = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            m15420t(i);
                            int i4 = (int) j;
                            if (i4 == 1) {
                                this.f19701u.f18602A = 2;
                                return;
                            } else if (i4 != 2) {
                                return;
                            } else {
                                this.f19701u.f18602A = 1;
                                return;
                            }
                        case 21946:
                            m15420t(i);
                            int m15869b = mo8.m15869b((int) j);
                            if (m15869b != -1) {
                                this.f19701u.f18652z = m15869b;
                                return;
                            }
                            return;
                        case 21947:
                            m15420t(i);
                            m82 m82Var = this.f19701u;
                            m82Var.f18650x = true;
                            int m15870a = mo8.m15870a((int) j);
                            if (m15870a != -1) {
                                m82Var.f18651y = m15870a;
                                return;
                            }
                            return;
                        case 21948:
                            m15420t(i);
                            this.f19701u.f18603B = (int) j;
                            return;
                        case 21949:
                            m15420t(i);
                            this.f19701u.f18604C = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* renamed from: k */
    public final void m15429k(int i, long j, long j2) {
        uo4.m7876b(this.f19682b0);
        if (i == 160) {
            this.f19669Q = false;
            this.f19670R = 0L;
        } else if (i == 174) {
            this.f19701u = new m82();
        } else if (i == 187) {
            this.f19657E = false;
        } else if (i == 19899) {
            this.f19703w = -1;
            this.f19704x = -1L;
        } else if (i == 20533) {
            m15420t(i);
            this.f19701u.f18634h = true;
        } else if (i == 21968) {
            m15420t(i);
            this.f19701u.f18650x = true;
        } else if (i == 408125543) {
            long j3 = this.f19697q;
            if (j3 != -1 && j3 != j) {
                throw dl3.m24267a("Multiple Segment elements not supported", null);
            }
            this.f19697q = j;
            this.f19696p = j2;
        } else if (i == 475249515) {
            this.f19655C = new va5(32);
            this.f19656D = new va5(32);
        } else if (i == 524531317 && !this.f19702v) {
            if (this.f19684d && this.f19706z != -1) {
                this.f19705y = true;
                return;
            }
            this.f19682b0.mo3297i(new h42(this.f19700t, 0L));
            this.f19702v = true;
        }
    }

    /* renamed from: l */
    public final void m15428l(int i, String str) {
        if (i == 134) {
            m15420t(i);
            this.f19701u.f18628b = str;
        } else if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw dl3.m24267a("DocType " + str + " not supported", null);
        } else if (i == 21358) {
            m15420t(i);
            this.f19701u.f18627a = str;
        } else if (i != 2274716) {
        } else {
            m15420t(i);
            m82.m16175c(this.f19701u, str);
        }
    }

    @RequiresNonNull({"#2.output"})
    /* renamed from: p */
    public final int m15424p(k09 k09Var, m82 m82Var, int i, boolean z) {
        int i2;
        if ("S_TEXT/UTF8".equals(m82Var.f18628b)) {
            m15416x(k09Var, f19647d0, i);
        } else if ("S_TEXT/ASS".equals(m82Var.f18628b)) {
            m15416x(k09Var, f19649f0, i);
        } else if ("S_TEXT/WEBVTT".equals(m82Var.f18628b)) {
            m15416x(k09Var, f19650g0, i);
        } else {
            m42 m42Var = m82Var.f18625X;
            if (!this.f19674V) {
                if (m82Var.f18634h) {
                    this.f19667O &= -1073741825;
                    if (!this.f19675W) {
                        ((rz8) k09Var).mo5663e(this.f19687g.m19714h(), 0, 1, false);
                        this.f19671S++;
                        if ((this.f19687g.m19714h()[0] & 128) == 128) {
                            throw dl3.m24267a("Extension bit is set in signal byte", null);
                        }
                        this.f19678Z = this.f19687g.m19714h()[0];
                        this.f19675W = true;
                    }
                    byte b = this.f19678Z;
                    if ((b & 1) == 1) {
                        int i3 = b & 2;
                        this.f19667O |= 1073741824;
                        if (!this.f19680a0) {
                            ((rz8) k09Var).mo5663e(this.f19692l.m19714h(), 0, 8, false);
                            this.f19671S += 8;
                            this.f19680a0 = true;
                            this.f19687g.m19714h()[0] = (byte) ((i3 != 2 ? 0 : 128) | 8);
                            this.f19687g.m19716f(0);
                            m42Var.mo16223a(this.f19687g, 1, 1);
                            this.f19672T++;
                            this.f19692l.m19716f(0);
                            m42Var.mo16223a(this.f19692l, 8, 1);
                            this.f19672T += 8;
                        }
                        if (i3 == 2) {
                            if (!this.f19676X) {
                                ((rz8) k09Var).mo5663e(this.f19687g.m19714h(), 0, 1, false);
                                this.f19671S++;
                                this.f19687g.m19716f(0);
                                this.f19677Y = this.f19687g.m19703s();
                                this.f19676X = true;
                            }
                            int i4 = this.f19677Y * 4;
                            this.f19687g.m19719c(i4);
                            ((rz8) k09Var).mo5663e(this.f19687g.m19714h(), 0, i4, false);
                            this.f19671S += i4;
                            int i5 = (this.f19677Y >> 1) + 1;
                            int i6 = (i5 * 6) + 2;
                            ByteBuffer byteBuffer = this.f19695o;
                            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                this.f19695o = ByteBuffer.allocate(i6);
                            }
                            this.f19695o.position(0);
                            this.f19695o.putShort((short) i5);
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                i2 = this.f19677Y;
                                if (i7 >= i2) {
                                    break;
                                }
                                int m19700v = this.f19687g.m19700v();
                                if (i7 % 2 == 0) {
                                    this.f19695o.putShort((short) (m19700v - i8));
                                } else {
                                    this.f19695o.putInt(m19700v - i8);
                                }
                                i7++;
                                i8 = m19700v;
                            }
                            int i9 = (i - this.f19671S) - i8;
                            if ((i2 & 1) == 1) {
                                this.f19695o.putInt(i9);
                            } else {
                                this.f19695o.putShort((short) i9);
                                this.f19695o.putInt(0);
                            }
                            this.f19693m.m19718d(this.f19695o.array(), i6);
                            m42Var.mo16223a(this.f19693m, i6, 1);
                            this.f19672T += i6;
                        }
                    }
                } else {
                    byte[] bArr = m82Var.f18635i;
                    if (bArr != null) {
                        this.f19690j.m19718d(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(m82Var.f18628b) ? m82Var.f18632f > 0 : z) {
                    this.f19667O |= 268435456;
                    this.f19694n.m19719c(0);
                    int m19710l = (this.f19690j.m19710l() + i) - this.f19671S;
                    this.f19687g.m19719c(4);
                    this.f19687g.m19714h()[0] = (byte) ((m19710l >> 24) & 255);
                    this.f19687g.m19714h()[1] = (byte) ((m19710l >> 16) & 255);
                    this.f19687g.m19714h()[2] = (byte) ((m19710l >> 8) & 255);
                    this.f19687g.m19714h()[3] = (byte) (m19710l & 255);
                    m42Var.mo16223a(this.f19687g, 4, 2);
                    this.f19672T += 4;
                }
                this.f19674V = true;
            }
            int m19710l2 = i + this.f19690j.m19710l();
            if (!"V_MPEG4/ISO/AVC".equals(m82Var.f18628b) && !"V_MPEGH/ISO/HEVC".equals(m82Var.f18628b)) {
                if (m82Var.f18621T != null) {
                    uo4.m7872f(this.f19690j.m19710l() == 0);
                    m82Var.f18621T.m15529d(k09Var);
                }
                while (true) {
                    int i10 = this.f19671S;
                    if (i10 >= m19710l2) {
                        break;
                    }
                    int m15423q = m15423q(k09Var, m42Var, m19710l2 - i10);
                    this.f19671S += m15423q;
                    this.f19672T += m15423q;
                }
            } else {
                byte[] m19714h = this.f19686f.m19714h();
                m19714h[0] = 0;
                m19714h[1] = 0;
                m19714h[2] = 0;
                int i11 = m82Var.f18626Y;
                int i12 = 4 - i11;
                while (this.f19671S < m19710l2) {
                    int i13 = this.f19673U;
                    if (i13 == 0) {
                        int min = Math.min(i11, this.f19690j.m19713i());
                        ((rz8) k09Var).mo5663e(m19714h, i12 + min, i11 - min, false);
                        if (min > 0) {
                            this.f19690j.m19720b(m19714h, i12, min);
                        }
                        this.f19671S += i11;
                        this.f19686f.m19716f(0);
                        this.f19673U = this.f19686f.m19700v();
                        this.f19685e.m19716f(0);
                        k42.m18050b(m42Var, this.f19685e, 4);
                        this.f19672T += 4;
                    } else {
                        int m15423q2 = m15423q(k09Var, m42Var, i13);
                        this.f19671S += m15423q2;
                        this.f19672T += m15423q2;
                        this.f19673U -= m15423q2;
                    }
                }
            }
            if ("A_VORBIS".equals(m82Var.f18628b)) {
                this.f19688h.m19716f(0);
                k42.m18050b(m42Var, this.f19688h, 4);
                this.f19672T += 4;
            }
        }
        int i14 = this.f19672T;
        m15417w();
        return i14;
    }

    /* renamed from: q */
    public final int m15423q(k09 k09Var, m42 m42Var, int i) {
        int m19713i = this.f19690j.m19713i();
        if (m19713i > 0) {
            int min = Math.min(i, m19713i);
            k42.m18050b(m42Var, this.f19690j, min);
            return min;
        }
        return k42.m18051a(m42Var, k09Var, i, false);
    }

    /* renamed from: r */
    public final long m15422r(long j) {
        long j2 = this.f19698r;
        if (j2 != -9223372036854775807L) {
            return it5.m19392g0(j, j2, 1000L);
        }
        throw dl3.m24267a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* renamed from: s */
    public final void m15421s(int i) {
        if (this.f19655C == null || this.f19656D == null) {
            throw dl3.m24267a("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* renamed from: t */
    public final void m15420t(int i) {
        if (this.f19701u != null) {
            return;
        }
        throw dl3.m24267a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de A[EDGE_INSN: B:63:0x00de->B:52:0x00de ?: BREAK  , SYNTHETIC] */
    @RequiresNonNull({"#1.output"})
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m15419u(m82 m82Var, long j, int i, int i2, int i3) {
        char c;
        byte[] m15415y;
        int i4;
        int m19711k;
        int m19710l;
        String str;
        n42 n42Var = m82Var.f18621T;
        if (n42Var != null) {
            n42Var.m15530c(m82Var.f18625X, j, i, i2, i3, m82Var.f18636j);
        } else {
            if ("S_TEXT/UTF8".equals(m82Var.f18628b) || "S_TEXT/ASS".equals(m82Var.f18628b) || "S_TEXT/WEBVTT".equals(m82Var.f18628b)) {
                if (this.f19663K > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j2 = this.f19661I;
                    if (j2 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        String str2 = m82Var.f18628b;
                        byte[] m19714h = this.f19691k.m19714h();
                        int hashCode = str2.hashCode();
                        if (hashCode == 738597099) {
                            if (str2.equals("S_TEXT/ASS")) {
                                c = 1;
                                if (c != 0) {
                                }
                                System.arraycopy(m15415y, 0, m19714h, i4, m15415y.length);
                                m19711k = this.f19691k.m19711k();
                                while (true) {
                                    if (m19711k >= this.f19691k.m19710l()) {
                                    }
                                    m19711k++;
                                }
                                m42 m42Var = m82Var.f18625X;
                                ik5 ik5Var = this.f19691k;
                                k42.m18050b(m42Var, ik5Var, ik5Var.m19710l());
                                m19710l = i2 + this.f19691k.m19710l();
                                if ((i & 268435456) != 0) {
                                }
                                m82Var.f18625X.mo16222b(j, i, m19710l, i3, m82Var.f18636j);
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            System.arraycopy(m15415y, 0, m19714h, i4, m15415y.length);
                            m19711k = this.f19691k.m19711k();
                            while (true) {
                                if (m19711k >= this.f19691k.m19710l()) {
                                }
                                m19711k++;
                            }
                            m42 m42Var2 = m82Var.f18625X;
                            ik5 ik5Var2 = this.f19691k;
                            k42.m18050b(m42Var2, ik5Var2, ik5Var2.m19710l());
                            m19710l = i2 + this.f19691k.m19710l();
                            if ((i & 268435456) != 0) {
                            }
                            m82Var.f18625X.mo16222b(j, i, m19710l, i3, m82Var.f18636j);
                        } else if (hashCode != 1045209816) {
                            if (hashCode == 1422270023 && str2.equals("S_TEXT/UTF8")) {
                                c = 0;
                                if (c != 0) {
                                    m15415y = m15415y(j2, "%02d:%02d:%02d,%03d", 1000L);
                                    i4 = 19;
                                } else if (c == 1) {
                                    m15415y = m15415y(j2, "%01d:%02d:%02d:%02d", 10000L);
                                    i4 = 21;
                                } else if (c != 2) {
                                    throw new IllegalArgumentException();
                                } else {
                                    m15415y = m15415y(j2, "%02d:%02d:%02d.%03d", 1000L);
                                    i4 = 25;
                                }
                                System.arraycopy(m15415y, 0, m19714h, i4, m15415y.length);
                                m19711k = this.f19691k.m19711k();
                                while (true) {
                                    if (m19711k >= this.f19691k.m19710l()) {
                                        break;
                                    } else if (this.f19691k.m19714h()[m19711k] == 0) {
                                        this.f19691k.m19717e(m19711k);
                                        break;
                                    } else {
                                        m19711k++;
                                    }
                                }
                                m42 m42Var22 = m82Var.f18625X;
                                ik5 ik5Var22 = this.f19691k;
                                k42.m18050b(m42Var22, ik5Var22, ik5Var22.m19710l());
                                m19710l = i2 + this.f19691k.m19710l();
                                if ((i & 268435456) != 0) {
                                    if (this.f19663K > 1) {
                                        this.f19694n.m19719c(0);
                                    } else {
                                        int m19710l2 = this.f19694n.m19710l();
                                        m82Var.f18625X.mo16223a(this.f19694n, m19710l2, 2);
                                        m19710l += m19710l2;
                                    }
                                }
                                m82Var.f18625X.mo16222b(j, i, m19710l, i3, m82Var.f18636j);
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            System.arraycopy(m15415y, 0, m19714h, i4, m15415y.length);
                            m19711k = this.f19691k.m19711k();
                            while (true) {
                                if (m19711k >= this.f19691k.m19710l()) {
                                }
                                m19711k++;
                            }
                            m42 m42Var222 = m82Var.f18625X;
                            ik5 ik5Var222 = this.f19691k;
                            k42.m18050b(m42Var222, ik5Var222, ik5Var222.m19710l());
                            m19710l = i2 + this.f19691k.m19710l();
                            if ((i & 268435456) != 0) {
                            }
                            m82Var.f18625X.mo16222b(j, i, m19710l, i3, m82Var.f18636j);
                        } else {
                            if (str2.equals("S_TEXT/WEBVTT")) {
                                c = 2;
                                if (c != 0) {
                                }
                                System.arraycopy(m15415y, 0, m19714h, i4, m15415y.length);
                                m19711k = this.f19691k.m19711k();
                                while (true) {
                                    if (m19711k >= this.f19691k.m19710l()) {
                                    }
                                    m19711k++;
                                }
                                m42 m42Var2222 = m82Var.f18625X;
                                ik5 ik5Var2222 = this.f19691k;
                                k42.m18050b(m42Var2222, ik5Var2222, ik5Var2222.m19710l());
                                m19710l = i2 + this.f19691k.m19710l();
                                if ((i & 268435456) != 0) {
                                }
                                m82Var.f18625X.mo16222b(j, i, m19710l, i3, m82Var.f18636j);
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            System.arraycopy(m15415y, 0, m19714h, i4, m15415y.length);
                            m19711k = this.f19691k.m19711k();
                            while (true) {
                                if (m19711k >= this.f19691k.m19710l()) {
                                }
                                m19711k++;
                            }
                            m42 m42Var22222 = m82Var.f18625X;
                            ik5 ik5Var22222 = this.f19691k;
                            k42.m18050b(m42Var22222, ik5Var22222, ik5Var22222.m19710l());
                            m19710l = i2 + this.f19691k.m19710l();
                            if ((i & 268435456) != 0) {
                            }
                            m82Var.f18625X.mo16222b(j, i, m19710l, i3, m82Var.f18636j);
                        }
                    }
                }
                s95.m10493e("MatroskaExtractor", str);
            }
            m19710l = i2;
            if ((i & 268435456) != 0) {
            }
            m82Var.f18625X.mo16222b(j, i, m19710l, i3, m82Var.f18636j);
        }
        this.f19658F = true;
    }

    /* renamed from: v */
    public final void m15418v(k09 k09Var, int i) {
        if (this.f19687g.m19710l() >= i) {
            return;
        }
        if (this.f19687g.m19712j() < i) {
            ik5 ik5Var = this.f19687g;
            int m19712j = ik5Var.m19712j();
            ik5Var.m19722H(Math.max(m19712j + m19712j, i));
        }
        ((rz8) k09Var).mo5663e(this.f19687g.m19714h(), this.f19687g.m19710l(), i - this.f19687g.m19710l(), false);
        this.f19687g.m19717e(i);
    }

    /* renamed from: w */
    public final void m15417w() {
        this.f19671S = 0;
        this.f19672T = 0;
        this.f19673U = 0;
        this.f19674V = false;
        this.f19675W = false;
        this.f19676X = false;
        this.f19677Y = 0;
        this.f19678Z = (byte) 0;
        this.f19680a0 = false;
        this.f19690j.m19719c(0);
    }

    /* renamed from: x */
    public final void m15416x(k09 k09Var, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        if (this.f19691k.m19712j() < i2) {
            ik5 ik5Var = this.f19691k;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            ik5Var.m19718d(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f19691k.m19714h(), 0, length);
        }
        ((rz8) k09Var).mo5663e(this.f19691k.m19714h(), length, i, false);
        this.f19691k.m19716f(0);
        this.f19691k.m19717e(i2);
    }
}
