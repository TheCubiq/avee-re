package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzxk;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class sx8 extends hp8 {

    /* renamed from: v1 */
    public static final int[] f26750v1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: w1 */
    public static boolean f26751w1;

    /* renamed from: x1 */
    public static boolean f26752x1;

    /* renamed from: Q0 */
    public final Context f26753Q0;

    /* renamed from: R0 */
    public final cy8 f26754R0;

    /* renamed from: S0 */
    public final vy8 f26755S0;

    /* renamed from: T0 */
    public final boolean f26756T0;

    /* renamed from: U0 */
    public rx8 f26757U0;

    /* renamed from: V0 */
    public boolean f26758V0;

    /* renamed from: W0 */
    public boolean f26759W0;

    /* renamed from: X0 */
    public Surface f26760X0;

    /* renamed from: Y0 */
    public zzxk f26761Y0;

    /* renamed from: Z0 */
    public boolean f26762Z0;

    /* renamed from: a1 */
    public int f26763a1;

    /* renamed from: b1 */
    public boolean f26764b1;

    /* renamed from: c1 */
    public boolean f26765c1;

    /* renamed from: d1 */
    public boolean f26766d1;

    /* renamed from: e1 */
    public long f26767e1;

    /* renamed from: f1 */
    public long f26768f1;

    /* renamed from: g1 */
    public long f26769g1;

    /* renamed from: h1 */
    public int f26770h1;

    /* renamed from: i1 */
    public int f26771i1;

    /* renamed from: j1 */
    public int f26772j1;

    /* renamed from: k1 */
    public long f26773k1;

    /* renamed from: l1 */
    public long f26774l1;

    /* renamed from: m1 */
    public long f26775m1;

    /* renamed from: n1 */
    public int f26776n1;

    /* renamed from: o1 */
    public int f26777o1;

    /* renamed from: p1 */
    public int f26778p1;

    /* renamed from: q1 */
    public int f26779q1;

    /* renamed from: r1 */
    public float f26780r1;

    /* renamed from: s1 */
    public ll4 f26781s1;

    /* renamed from: t1 */
    public int f26782t1;

    /* renamed from: u1 */
    public vx8 f26783u1;

    public sx8(Context context, ap8 ap8Var, jp8 jp8Var, long j, boolean z, Handler handler, wy8 wy8Var, int i, float f) {
        super(2, ap8Var, jp8Var, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f26753Q0 = applicationContext;
        this.f26754R0 = new cy8(applicationContext);
        this.f26755S0 = new vy8(handler, wy8Var);
        this.f26756T0 = "NVIDIA".equals(it5.f13993c);
        this.f26768f1 = -9223372036854775807L;
        this.f26777o1 = -1;
        this.f26778p1 = -1;
        this.f26780r1 = -1.0f;
        this.f26763a1 = 1;
        this.f26782t1 = 0;
        this.f26781s1 = null;
    }

    /* renamed from: A0 */
    public static List m9776A0(Context context, jp8 jp8Var, f92 f92Var, boolean z, boolean z2) {
        String str = f92Var.f9275l;
        if (str == null) {
            return y17.m4260u();
        }
        List m20476f = hq8.m20476f(str, z, z2);
        String m20477e = hq8.m20477e(f92Var);
        if (m20477e == null) {
            return y17.m4262s(m20476f);
        }
        List m20476f2 = hq8.m20476f(m20477e, z, z2);
        if (it5.f13991a < 26 || !"video/dolby-vision".equals(f92Var.f9275l) || m20476f2.isEmpty() || qx8.m11946a(context)) {
            v17 m4266o = y17.m4266o();
            m4266o.m7547g(m20476f);
            m4266o.m7547g(m20476f2);
            return m4266o.m7546h();
        }
        return y17.m4262s(m20476f2);
    }

    /* renamed from: E0 */
    public static boolean m9769E0(long j) {
        return j < -30000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
        if (r3.equals("video/av01") != false) goto L19;
     */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m9743w0(ep8 ep8Var, f92 f92Var) {
        int intValue;
        int i = f92Var.f9280q;
        int i2 = f92Var.f9281r;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        String str = f92Var.f9275l;
        char c = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair m20480b = hq8.m20480b(f92Var);
            str = (m20480b == null || !((intValue = ((Integer) m20480b.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 6;
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
                return ((i * i2) * 3) / 4;
            case 4:
                return Math.max(2097152, ((i * i2) * 3) / 4);
            case 5:
                String str2 = it5.f13994d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(it5.f13993c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && ep8Var.f8671f)))) {
                    return -1;
                }
                return ((it5.m19417O(i, 16) * it5.m19417O(i2, 16)) * 768) / 4;
            case 6:
                return ((i * i2) * 3) / 8;
            default:
                return -1;
        }
    }

    /* renamed from: x0 */
    public static int m9741x0(ep8 ep8Var, f92 f92Var) {
        if (f92Var.f9276m != -1) {
            int size = f92Var.f9277n.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) f92Var.f9277n.get(i2)).length;
            }
            return f92Var.f9276m + i;
        }
        return m9743w0(ep8Var, f92Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04c0, code lost:
        if (r0.equals("deb") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x07a0, code lost:
        if (r10 != 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m9737z0(String str) {
        char c;
        char c2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (sx8.class) {
            if (!f26751w1) {
                int i = it5.f13991a;
                char c3 = 28;
                char c4 = 65535;
                if (i <= 28) {
                    String str2 = it5.f13992b;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                    }
                    f26752x1 = z;
                    f26751w1 = true;
                }
                if (i > 27 || !"HWEML".equals(it5.f13992b)) {
                    String str3 = it5.f13994d;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        default:
                            if (i <= 26) {
                                String str4 = it5.f13992b;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c3 = '6';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c3 = '7';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c3 = '8';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c3 = 'J';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c3 = 22;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c3 = 'Y';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c3 = 'Z';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c3 = 'e';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c3 = 'f';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c3 = 'g';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c3 = '\r';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c3 = 't';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c3 = 137;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c3 = 21;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c3 = 'h';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c3 = '_';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c3 = 130;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c3 = 'a';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c3 = 'b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c3 = 'c';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c3 = '4';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c3 = 18;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c3 = 'F';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c3 = 'v';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c3 = 'W';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c3 = 5;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c3 = 6;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c3 = 'x';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c3 = '\"';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c3 = '~';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c3 = 'X';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c3 = '\t';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c3 = 'w';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c3 = 131;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c3 = 132;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c3 = '[';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c3 = '3';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c3 = '5';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c3 = 'i';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c3 = 'y';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c3 = 17;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c3 = 138;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c3 = 31;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c3 = 134;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c3 = 20;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c3 = 'q';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c3 = 127;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c3 = 129;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c3 = 16;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c3 = 'T';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c3 = 'I';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c3 = 'O';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c3 = 'P';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c3 = 'V';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c3 = '^';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c3 = 'k';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c3 = 's';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c3 = 139;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c3 = 26;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c3 = 27;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c3 = '1';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c3 = '$';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c3 = '%';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c3 = '&';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c3 = '\'';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c3 = '(';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c3 = ')';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c3 = ']';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c3 = 'm';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c3 = 'o';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c3 = 136;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c3 = '2';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c3 = 'K';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c3 = 'U';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c3 = '\\';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c3 = 'S';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c3 = 4;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c3 = 15;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c3 = 7;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c3 = 30;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c3 = '*';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c3 = '+';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c3 = ',';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c3 = '-';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c3 = '.';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c3 = '/';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c3 = '0';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c3 = 'l';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c3 = 'n';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c3 = 'p';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c3 = 128;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c3 = 135;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c3 = 'C';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c3 = 'L';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c3 = 'M';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c3 = '\b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c3 = 25;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c3 = 'R';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c3 = '<';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c3 = 11;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c3 = '\f';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c3 = 'z';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c3 = '{';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c3 = '|';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c3 = '}';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c3 = 'j';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c3 = 'r';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c3 = '9';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c3 = ':';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c3 = ';';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c3 = 'Q';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c3 = '\n';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c3 = 'H';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c3 = '`';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c3 = 'N';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c3 = 'G';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c3 = '>';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c3 = '#';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c3 = '=';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c3 = 133;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c3 = 23;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c3 = 24;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c3 = 'D';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c3 = 'u';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c3 = 'd';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c3 = 'E';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c3 = 19;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c3 = 29;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c3 = '?';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c3 = '@';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c3 = 14;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c3 = ' ';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c3 = '!';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c3 = 'A';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c3 = 'B';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                switch (c3) {
                                    default:
                                        if (str3.hashCode() == -594534941 && str3.equals("JSN-L21")) {
                                            c4 = 0;
                                            break;
                                        }
                                        break;
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
                                    case '!':
                                    case '\"':
                                    case '#':
                                    case '$':
                                    case '%':
                                    case '&':
                                    case '\'':
                                    case '(':
                                    case ')':
                                    case '*':
                                    case '+':
                                    case ',':
                                    case '-':
                                    case '.':
                                    case '/':
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case p21.f22268J0 /* 91 */:
                                    case p21.f22274K0 /* 92 */:
                                    case p21.f22280L0 /* 93 */:
                                    case p21.f22286M0 /* 94 */:
                                    case p21.f22292N0 /* 95 */:
                                    case p21.f22298O0 /* 96 */:
                                    case p21.f22304P0 /* 97 */:
                                    case p21.f22310Q0 /* 98 */:
                                    case p21.f22316R0 /* 99 */:
                                    case p21.f22322S0 /* 100 */:
                                    case p21.f22328T0 /* 101 */:
                                    case p21.f22334U0 /* 102 */:
                                    case p21.f22340V0 /* 103 */:
                                    case p21.f22346W0 /* 104 */:
                                    case 'i':
                                    case p21.f22352X0 /* 106 */:
                                    case p21.f22358Y0 /* 107 */:
                                    case p21.f22364Z0 /* 108 */:
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case x21.f31769C0 /* 116 */:
                                    case x21.f31774D0 /* 117 */:
                                    case x21.f31779E0 /* 118 */:
                                    case x21.f31784F0 /* 119 */:
                                    case x21.f31789G0 /* 120 */:
                                    case x21.f31794H0 /* 121 */:
                                    case x21.f31799I0 /* 122 */:
                                    case x21.f31804J0 /* 123 */:
                                    case x21.f31809K0 /* 124 */:
                                    case x21.f31814L0 /* 125 */:
                                    case x21.f31819M0 /* 126 */:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        break;
                                }
                            }
                            break;
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                            break;
                    }
                    f26752x1 = z;
                    f26751w1 = true;
                }
                z = true;
                f26752x1 = z;
                f26751w1 = true;
            }
        }
        return f26752x1;
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    @TargetApi(17)
    /* renamed from: A */
    public final void mo9777A() {
        try {
            super.mo9777A();
            if (this.f26761Y0 != null) {
                m9771D0();
            }
        } catch (Throwable th) {
            if (this.f26761Y0 != null) {
                m9771D0();
            }
            throw th;
        }
    }

    @Override // com.daaw.nk7
    /* renamed from: B */
    public final void mo9775B() {
        this.f26770h1 = 0;
        this.f26769g1 = SystemClock.elapsedRealtime();
        this.f26774l1 = SystemClock.elapsedRealtime() * 1000;
        this.f26775m1 = 0L;
        this.f26776n1 = 0;
        this.f26754R0.m24875g();
    }

    /* renamed from: B0 */
    public final void m9774B0() {
        int i = this.f26777o1;
        if (i == -1) {
            if (this.f26778p1 == -1) {
                return;
            }
            i = -1;
        }
        ll4 ll4Var = this.f26781s1;
        if (ll4Var != null && ll4Var.f17522a == i && ll4Var.f17523b == this.f26778p1 && ll4Var.f17524c == this.f26779q1 && ll4Var.f17525d == this.f26780r1) {
            return;
        }
        ll4 ll4Var2 = new ll4(i, this.f26778p1, this.f26779q1, this.f26780r1);
        this.f26781s1 = ll4Var2;
        this.f26755S0.m6644t(ll4Var2);
    }

    @Override // com.daaw.nk7
    /* renamed from: C */
    public final void mo9773C() {
        this.f26768f1 = -9223372036854775807L;
        if (this.f26770h1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f26755S0.m6660d(this.f26770h1, elapsedRealtime - this.f26769g1);
            this.f26770h1 = 0;
            this.f26769g1 = elapsedRealtime;
        }
        int i = this.f26776n1;
        if (i != 0) {
            this.f26755S0.m6646r(this.f26775m1, i);
            this.f26775m1 = 0L;
            this.f26776n1 = 0;
        }
        this.f26754R0.m24874h();
    }

    /* renamed from: C0 */
    public final void m9772C0() {
        ll4 ll4Var = this.f26781s1;
        if (ll4Var != null) {
            this.f26755S0.m6644t(ll4Var);
        }
    }

    /* renamed from: D0 */
    public final void m9771D0() {
        Surface surface = this.f26760X0;
        zzxk zzxkVar = this.f26761Y0;
        if (surface == zzxkVar) {
            this.f26760X0 = null;
        }
        zzxkVar.release();
        this.f26761Y0 = null;
    }

    @Override // com.daaw.hp8
    /* renamed from: E */
    public final float mo9770E(float f, f92 f92Var, f92[] f92VarArr) {
        float f2 = -1.0f;
        for (f92 f92Var2 : f92VarArr) {
            float f3 = f92Var2.f9282s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.daaw.hp8
    /* renamed from: F */
    public final int mo9768F(jp8 jp8Var, f92 f92Var) {
        boolean z;
        if (ak3.m27382h(f92Var.f9275l)) {
            int i = 0;
            boolean z2 = f92Var.f9278o != null;
            List m9776A0 = m9776A0(this.f26753Q0, jp8Var, f92Var, z2, false);
            if (z2 && m9776A0.isEmpty()) {
                m9776A0 = m9776A0(this.f26753Q0, jp8Var, f92Var, false, false);
            }
            if (m9776A0.isEmpty()) {
                return 129;
            }
            if (hp8.m20518r0(f92Var)) {
                ep8 ep8Var = (ep8) m9776A0.get(0);
                boolean m23309d = ep8Var.m23309d(f92Var);
                if (!m23309d) {
                    for (int i2 = 1; i2 < m9776A0.size(); i2++) {
                        ep8 ep8Var2 = (ep8) m9776A0.get(i2);
                        if (ep8Var2.m23309d(f92Var)) {
                            ep8Var = ep8Var2;
                            z = false;
                            m23309d = true;
                            break;
                        }
                    }
                }
                z = true;
                int i3 = true != m23309d ? 3 : 4;
                int i4 = true != ep8Var.m23308e(f92Var) ? 8 : 16;
                int i5 = true != ep8Var.f8672g ? 0 : 64;
                int i6 = true != z ? 0 : 128;
                if (it5.f13991a >= 26 && "video/dolby-vision".equals(f92Var.f9275l) && !qx8.m11946a(this.f26753Q0)) {
                    i6 = 256;
                }
                if (m23309d) {
                    List m9776A02 = m9776A0(this.f26753Q0, jp8Var, f92Var, z2, true);
                    if (!m9776A02.isEmpty()) {
                        ep8 ep8Var3 = (ep8) hq8.m20475g(m9776A02, f92Var).get(0);
                        if (ep8Var3.m23309d(f92Var) && ep8Var3.m23308e(f92Var)) {
                            i = 32;
                        }
                    }
                }
                return i3 | i4 | i | i5 | i6;
            }
            return 130;
        }
        return 128;
    }

    /* renamed from: F0 */
    public final boolean m9767F0(ep8 ep8Var) {
        return it5.f13991a >= 23 && !m9737z0(ep8Var.f8666a) && (!ep8Var.f8671f || zzxk.m1087b(this.f26753Q0));
    }

    @Override // com.daaw.hp8
    /* renamed from: G */
    public final tm7 mo9766G(ep8 ep8Var, f92 f92Var, f92 f92Var2) {
        int i;
        int i2;
        tm7 m23311b = ep8Var.m23311b(f92Var, f92Var2);
        int i3 = m23311b.f27879e;
        int i4 = f92Var2.f9280q;
        rx8 rx8Var = this.f26757U0;
        if (i4 > rx8Var.f25702a || f92Var2.f9281r > rx8Var.f25703b) {
            i3 |= 256;
        }
        if (m9741x0(ep8Var, f92Var2) > this.f26757U0.f25704c) {
            i3 |= 64;
        }
        String str = ep8Var.f8666a;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = m23311b.f27878d;
            i2 = 0;
        }
        return new tm7(str, f92Var, f92Var2, i, i2);
    }

    /* renamed from: G0 */
    public final void m9765G0(bp8 bp8Var, int i, long j) {
        m9774B0();
        int i2 = it5.f13991a;
        Trace.beginSection("releaseOutputBuffer");
        bp8Var.mo18327g(i, true);
        Trace.endSection();
        this.f26774l1 = SystemClock.elapsedRealtime() * 1000;
        this.f12794J0.f24154e++;
        this.f26771i1 = 0;
        m9754X();
    }

    @Override // com.daaw.hp8
    /* renamed from: H */
    public final tm7 mo9764H(a78 a78Var) {
        tm7 mo9764H = super.mo9764H(a78Var);
        this.f26755S0.m6658f(a78Var.f2960a, mo9764H);
        return mo9764H;
    }

    /* renamed from: H0 */
    public final void m9763H0(bp8 bp8Var, int i, long j, long j2) {
        m9774B0();
        int i2 = it5.f13991a;
        Trace.beginSection("releaseOutputBuffer");
        bp8Var.mo18333a(i, j2);
        Trace.endSection();
        this.f26774l1 = SystemClock.elapsedRealtime() * 1000;
        this.f12794J0.f24154e++;
        this.f26771i1 = 0;
        m9754X();
    }

    /* renamed from: I0 */
    public final void m9762I0(bp8 bp8Var, int i, long j) {
        int i2 = it5.f13991a;
        Trace.beginSection("skipVideoBuffer");
        bp8Var.mo18327g(i, false);
        Trace.endSection();
        this.f12794J0.f24155f++;
    }

    /* renamed from: J0 */
    public final void m9761J0(int i, int i2) {
        ql7 ql7Var = this.f12794J0;
        ql7Var.f24157h += i;
        int i3 = i + i2;
        ql7Var.f24156g += i3;
        this.f26770h1 += i3;
        int i4 = this.f26771i1 + i3;
        this.f26771i1 = i4;
        ql7Var.f24158i = Math.max(i4, ql7Var.f24158i);
    }

    @Override // com.daaw.hp8
    @TargetApi(17)
    /* renamed from: K */
    public final zo8 mo9760K(ep8 ep8Var, f92 f92Var, MediaCrypto mediaCrypto, float f) {
        rx8 rx8Var;
        Point point;
        Pair m20480b;
        int m9743w0;
        f92 f92Var2 = f92Var;
        zzxk zzxkVar = this.f26761Y0;
        if (zzxkVar != null && zzxkVar.f37038p != ep8Var.f8671f) {
            m9771D0();
        }
        String str = ep8Var.f8668c;
        f92[] m15104p = m15104p();
        int i = f92Var2.f9280q;
        int i2 = f92Var2.f9281r;
        int m9741x0 = m9741x0(ep8Var, f92Var);
        int length = m15104p.length;
        if (length == 1) {
            if (m9741x0 != -1 && (m9743w0 = m9743w0(ep8Var, f92Var)) != -1) {
                m9741x0 = Math.min((int) (m9741x0 * 1.5f), m9743w0);
            }
            rx8Var = new rx8(i, i2, m9741x0);
        } else {
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                f92 f92Var3 = m15104p[i3];
                if (f92Var2.f9287x != null && f92Var3.f9287x == null) {
                    b72 m22830b = f92Var3.m22830b();
                    m22830b.m26385g0(f92Var2.f9287x);
                    f92Var3 = m22830b.m26366y();
                }
                if (ep8Var.m23311b(f92Var2, f92Var3).f27878d != 0) {
                    int i4 = f92Var3.f9280q;
                    z |= i4 == -1 || f92Var3.f9281r == -1;
                    i = Math.max(i, i4);
                    i2 = Math.max(i2, f92Var3.f9281r);
                    m9741x0 = Math.max(m9741x0, m9741x0(ep8Var, f92Var3));
                }
            }
            if (z) {
                s95.m10493e("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
                int i5 = f92Var2.f9281r;
                int i6 = f92Var2.f9280q;
                boolean z2 = i5 > i6;
                int i7 = z2 ? i5 : i6;
                if (true == z2) {
                    i5 = i6;
                }
                float f2 = i5 / i7;
                int[] iArr = f26750v1;
                int i8 = 0;
                while (i8 < 9) {
                    int i9 = iArr[i8];
                    int[] iArr2 = iArr;
                    int i10 = (int) (i9 * f2);
                    if (i9 <= i7 || i10 <= i5) {
                        break;
                    }
                    int i11 = i5;
                    float f3 = f2;
                    if (it5.f13991a >= 21) {
                        int i12 = true != z2 ? i9 : i10;
                        if (true != z2) {
                            i9 = i10;
                        }
                        Point m23312a = ep8Var.m23312a(i12, i9);
                        if (ep8Var.m23307f(m23312a.x, m23312a.y, f92Var2.f9282s)) {
                            point = m23312a;
                            break;
                        }
                        i8++;
                        f92Var2 = f92Var;
                        iArr = iArr2;
                        i5 = i11;
                        f2 = f3;
                    } else {
                        try {
                            int m19417O = it5.m19417O(i9, 16) * 16;
                            int m19417O2 = it5.m19417O(i10, 16) * 16;
                            if (m19417O * m19417O2 <= hq8.m20481a()) {
                                int i13 = true != z2 ? m19417O : m19417O2;
                                if (true != z2) {
                                    m19417O = m19417O2;
                                }
                                point = new Point(i13, m19417O);
                            } else {
                                i8++;
                                f92Var2 = f92Var;
                                iArr = iArr2;
                                i5 = i11;
                                f2 = f3;
                            }
                        } catch (qp8 unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    b72 m22830b2 = f92Var.m22830b();
                    m22830b2.m26367x(i);
                    m22830b2.m26388f(i2);
                    m9741x0 = Math.max(m9741x0, m9743w0(ep8Var, m22830b2.m26366y()));
                    s95.m10493e("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
                }
            }
            rx8Var = new rx8(i, i2, m9741x0);
        }
        this.f26757U0 = rx8Var;
        boolean z3 = this.f26756T0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", f92Var.f9280q);
        mediaFormat.setInteger("height", f92Var.f9281r);
        yb5.m3940b(mediaFormat, f92Var.f9277n);
        float f4 = f92Var.f9282s;
        if (f4 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f4);
        }
        yb5.m3941a(mediaFormat, "rotation-degrees", f92Var.f9283t);
        mo8 mo8Var = f92Var.f9287x;
        if (mo8Var != null) {
            yb5.m3941a(mediaFormat, "color-transfer", mo8Var.f19053c);
            yb5.m3941a(mediaFormat, "color-standard", mo8Var.f19051a);
            yb5.m3941a(mediaFormat, "color-range", mo8Var.f19052b);
            byte[] bArr = mo8Var.f19054d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(f92Var.f9275l) && (m20480b = hq8.m20480b(f92Var)) != null) {
            yb5.m3941a(mediaFormat, "profile", ((Integer) m20480b.first).intValue());
        }
        mediaFormat.setInteger("max-width", rx8Var.f25702a);
        mediaFormat.setInteger("max-height", rx8Var.f25703b);
        yb5.m3941a(mediaFormat, "max-input-size", rx8Var.f25704c);
        if (it5.f13991a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z3) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.f26760X0 == null) {
            if (!m9767F0(ep8Var)) {
                throw new IllegalStateException();
            }
            if (this.f26761Y0 == null) {
                this.f26761Y0 = zzxk.m1088a(this.f26753Q0, ep8Var.f8671f);
            }
            this.f26760X0 = this.f26761Y0;
        }
        return zo8.m2021b(ep8Var, mediaFormat, f92Var, this.f26760X0, null);
    }

    @Override // com.daaw.hp8
    /* renamed from: L */
    public final List mo9759L(jp8 jp8Var, f92 f92Var, boolean z) {
        return hq8.m20475g(m9776A0(this.f26753Q0, jp8Var, f92Var, false, false), f92Var);
    }

    @Override // com.daaw.hp8
    /* renamed from: M */
    public final void mo9758M(Exception exc) {
        s95.m10495c("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f26755S0.m6645s(exc);
    }

    @Override // com.daaw.hp8
    /* renamed from: N */
    public final void mo9757N(String str, zo8 zo8Var, long j, long j2) {
        this.f26755S0.m6663a(str, j, j2);
        this.f26758V0 = m9737z0(str);
        ep8 m20524h0 = m20524h0();
        Objects.requireNonNull(m20524h0);
        boolean z = false;
        if (it5.f13991a >= 29 && "video/x-vnd.on2.vp9".equals(m20524h0.f8667b)) {
            MediaCodecInfo.CodecProfileLevel[] m23306g = m20524h0.m23306g();
            int length = m23306g.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (m23306g[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f26759W0 = z;
    }

    @Override // com.daaw.hp8
    /* renamed from: O */
    public final void mo9756O(String str) {
        this.f26755S0.m6662b(str);
    }

    @Override // com.daaw.hp8
    /* renamed from: W */
    public final void mo9755W(f92 f92Var, MediaFormat mediaFormat) {
        bp8 m20525f0 = m20525f0();
        if (m20525f0 != null) {
            m20525f0.mo18328f(this.f26763a1);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.f26777o1 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f26778p1 = integer;
        float f = f92Var.f9284u;
        this.f26780r1 = f;
        if (it5.f13991a >= 21) {
            int i = f92Var.f9283t;
            if (i == 90 || i == 270) {
                int i2 = this.f26777o1;
                this.f26777o1 = integer;
                this.f26778p1 = i2;
                this.f26780r1 = 1.0f / f;
            }
        } else {
            this.f26779q1 = f92Var.f9283t;
        }
        this.f26754R0.m24879c(f92Var.f9282s);
    }

    /* renamed from: X */
    public final void m9754X() {
        this.f26766d1 = true;
        if (this.f26764b1) {
            return;
        }
        this.f26764b1 = true;
        this.f26755S0.m6647q(this.f26760X0);
        this.f26762Z0 = true;
    }

    @Override // com.daaw.hp8
    /* renamed from: Y */
    public final void mo9753Y() {
        this.f26764b1 = false;
        int i = it5.f13991a;
    }

    @Override // com.daaw.hp8
    /* renamed from: Z */
    public final void mo9752Z(ma7 ma7Var) {
        this.f26772j1++;
        int i = it5.f13991a;
    }

    @Override // com.daaw.i98, com.daaw.l98
    /* renamed from: a */
    public final String mo9751a() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.daaw.hp8
    /* renamed from: b0 */
    public final boolean mo9750b0(long j, long j2, bp8 bp8Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, f92 f92Var) {
        boolean z3;
        int m15100t;
        Objects.requireNonNull(bp8Var);
        if (this.f26767e1 == -9223372036854775807L) {
            this.f26767e1 = j;
        }
        if (j3 != this.f26773k1) {
            this.f26754R0.m24878d(j3);
            this.f26773k1 = j3;
        }
        long m20526e0 = m20526e0();
        long j4 = j3 - m20526e0;
        if (z && !z2) {
            m9762I0(bp8Var, i, j4);
            return true;
        }
        double m20527d0 = m20527d0();
        boolean z4 = mo15107m() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        double d = j3 - j;
        Double.isNaN(d);
        Double.isNaN(m20527d0);
        long j5 = (long) (d / m20527d0);
        if (z4) {
            j5 -= elapsedRealtime - j2;
        }
        if (this.f26760X0 == this.f26761Y0) {
            if (m9769E0(j5)) {
                m9762I0(bp8Var, i, j4);
                m9739y0(j5);
                return true;
            }
            return false;
        }
        long j6 = elapsedRealtime - this.f26774l1;
        boolean z5 = this.f26766d1 ? !this.f26764b1 : z4 || this.f26765c1;
        if (this.f26768f1 == -9223372036854775807L && j >= m20526e0 && (z5 || (z4 && m9769E0(j5) && j6 > 100000))) {
            long nanoTime = System.nanoTime();
            if (it5.f13991a >= 21) {
                m9763H0(bp8Var, i, j4, nanoTime);
            } else {
                m9765G0(bp8Var, i, j4);
            }
            m9739y0(j5);
            return true;
        } else if (!z4 || j == this.f26767e1) {
            return false;
        } else {
            long nanoTime2 = System.nanoTime();
            long m24881a = this.f26754R0.m24881a((j5 * 1000) + nanoTime2);
            long j7 = (m24881a - nanoTime2) / 1000;
            long j8 = this.f26768f1;
            if (j7 < -500000 && !z2 && (m15100t = m15100t(j)) != 0) {
                if (j8 != -9223372036854775807L) {
                    ql7 ql7Var = this.f12794J0;
                    ql7Var.f24153d += m15100t;
                    ql7Var.f24155f += this.f26772j1;
                } else {
                    this.f12794J0.f24159j++;
                    m9761J0(m15100t, this.f26772j1);
                }
                m20520o0();
                return false;
            } else if (m9769E0(j7) && !z2) {
                if (j8 != -9223372036854775807L) {
                    m9762I0(bp8Var, i, j4);
                    z3 = true;
                } else {
                    int i4 = it5.f13991a;
                    Trace.beginSection("dropVideoBuffer");
                    bp8Var.mo18327g(i, false);
                    Trace.endSection();
                    z3 = true;
                    m9761J0(0, 1);
                }
                m9739y0(j7);
                return z3;
            } else if (it5.f13991a >= 21) {
                if (j7 < 50000) {
                    m9763H0(bp8Var, i, j4, m24881a);
                    m9739y0(j7);
                    return true;
                }
                return false;
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep(((-10000) + j7) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                m9765G0(bp8Var, i, j4);
                m9739y0(j7);
                return true;
            } else {
                return false;
            }
        }
    }

    @Override // com.daaw.hp8, com.daaw.nk7, com.daaw.i98
    /* renamed from: e */
    public final void mo9749e(float f, float f2) {
        super.mo9749e(f, f2);
        this.f26754R0.m24877e(f);
    }

    @Override // com.daaw.hp8
    /* renamed from: g0 */
    public final cp8 mo9748g0(Throwable th, ep8 ep8Var) {
        return new px8(th, ep8Var, this.f26760X0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.daaw.nk7, com.daaw.w88
    /* renamed from: h */
    public final void mo6337h(int i, Object obj) {
        if (i != 1) {
            if (i == 7) {
                this.f26783u1 = (vx8) obj;
                return;
            } else if (i == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.f26782t1 != intValue) {
                    this.f26782t1 = intValue;
                    return;
                }
                return;
            } else if (i != 4) {
                if (i != 5) {
                    return;
                }
                this.f26754R0.m24872j(((Integer) obj).intValue());
                return;
            } else {
                int intValue2 = ((Integer) obj).intValue();
                this.f26763a1 = intValue2;
                bp8 m20525f0 = m20525f0();
                if (m20525f0 != null) {
                    m20525f0.mo18328f(intValue2);
                    return;
                }
                return;
            }
        }
        zzxk zzxkVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzxkVar == null) {
            zzxk zzxkVar2 = this.f26761Y0;
            if (zzxkVar2 != null) {
                zzxkVar = zzxkVar2;
            } else {
                ep8 m20524h0 = m20524h0();
                if (m20524h0 != null && m9767F0(m20524h0)) {
                    zzxkVar = zzxk.m1088a(this.f26753Q0, m20524h0.f8671f);
                    this.f26761Y0 = zzxkVar;
                }
            }
        }
        if (this.f26760X0 == zzxkVar) {
            if (zzxkVar == null || zzxkVar == this.f26761Y0) {
                return;
            }
            m9772C0();
            if (this.f26762Z0) {
                this.f26755S0.m6647q(this.f26760X0);
                return;
            }
            return;
        }
        this.f26760X0 = zzxkVar;
        this.f26754R0.m24873i(zzxkVar);
        this.f26762Z0 = false;
        int mo15107m = mo15107m();
        bp8 m20525f02 = m20525f0();
        if (m20525f02 != null) {
            if (it5.f13991a < 23 || zzxkVar == null || this.f26758V0) {
                m20522l0();
                m20523j0();
            } else {
                m20525f02.mo18329e(zzxkVar);
            }
        }
        if (zzxkVar == null || zzxkVar == this.f26761Y0) {
            this.f26781s1 = null;
            this.f26764b1 = false;
            int i2 = it5.f13991a;
            return;
        }
        m9772C0();
        this.f26764b1 = false;
        int i3 = it5.f13991a;
        if (mo15107m == 2) {
            this.f26768f1 = -9223372036854775807L;
        }
    }

    @Override // com.daaw.hp8
    @TargetApi(29)
    /* renamed from: i0 */
    public final void mo9747i0(ma7 ma7Var) {
        if (this.f26759W0) {
            ByteBuffer byteBuffer = ma7Var.f18731f;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        bp8 m20525f0 = m20525f0();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        m20525f0.mo18325o(bundle);
                    }
                }
            }
        }
    }

    @Override // com.daaw.hp8
    /* renamed from: k0 */
    public final void mo9746k0(long j) {
        super.mo9746k0(j);
        this.f26772j1--;
    }

    @Override // com.daaw.hp8
    /* renamed from: m0 */
    public final void mo9745m0() {
        super.mo9745m0();
        this.f26772j1 = 0;
    }

    @Override // com.daaw.hp8
    /* renamed from: q0 */
    public final boolean mo9744q0(ep8 ep8Var) {
        return this.f26760X0 != null || m9767F0(ep8Var);
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    /* renamed from: x */
    public final void mo9742x() {
        this.f26781s1 = null;
        this.f26764b1 = false;
        int i = it5.f13991a;
        this.f26762Z0 = false;
        try {
            super.mo9742x();
        } finally {
            this.f26755S0.m6661c(this.f12794J0);
        }
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    /* renamed from: y */
    public final void mo9740y(boolean z, boolean z2) {
        super.mo9740y(z, z2);
        m15098v();
        this.f26755S0.m6659e(this.f12794J0);
        this.f26765c1 = z2;
        this.f26766d1 = false;
    }

    /* renamed from: y0 */
    public final void m9739y0(long j) {
        ql7 ql7Var = this.f12794J0;
        ql7Var.f24160k += j;
        ql7Var.f24161l++;
        this.f26775m1 += j;
        this.f26776n1++;
    }

    @Override // com.daaw.hp8, com.daaw.nk7
    /* renamed from: z */
    public final void mo9738z(long j, boolean z) {
        super.mo9738z(j, z);
        this.f26764b1 = false;
        int i = it5.f13991a;
        this.f26754R0.m24876f();
        this.f26773k1 = -9223372036854775807L;
        this.f26767e1 = -9223372036854775807L;
        this.f26771i1 = 0;
        this.f26768f1 = -9223372036854775807L;
    }

    @Override // com.daaw.hp8, com.daaw.i98
    public final boolean zzN() {
        zzxk zzxkVar;
        if (super.zzN() && (this.f26764b1 || (((zzxkVar = this.f26761Y0) != null && this.f26760X0 == zzxkVar) || m20525f0() == null))) {
            this.f26768f1 = -9223372036854775807L;
            return true;
        } else if (this.f26768f1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f26768f1) {
                return true;
            }
            this.f26768f1 = -9223372036854775807L;
            return false;
        }
    }
}
