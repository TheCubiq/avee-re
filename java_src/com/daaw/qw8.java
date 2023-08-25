package com.daaw;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class qw8 implements mw8, qz6 {

    /* renamed from: C */
    public static final y17 f24549C = y17.m4256y(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: D */
    public static final y17 f24550D = y17.m4256y(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: E */
    public static final y17 f24551E = y17.m4256y(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: F */
    public static final y17 f24552F = y17.m4256y(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: G */
    public static final y17 f24553G = y17.m4256y(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: H */
    public static final y17 f24554H = y17.m4256y(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: I */
    public static qw8 f24555I;

    /* renamed from: A */
    public long f24556A;

    /* renamed from: B */
    public long f24557B;

    /* renamed from: p */
    public final b27 f24558p;

    /* renamed from: s */
    public final xp4 f24561s;

    /* renamed from: u */
    public int f24563u;

    /* renamed from: v */
    public long f24564v;

    /* renamed from: w */
    public long f24565w;

    /* renamed from: x */
    public int f24566x;

    /* renamed from: y */
    public long f24567y;

    /* renamed from: z */
    public long f24568z;

    /* renamed from: q */
    public final kw8 f24559q = new kw8();

    /* renamed from: r */
    public final mx8 f24560r = new mx8(2000);

    /* renamed from: t */
    public final boolean f24562t = true;

    public /* synthetic */ qw8(Context context, Map map, int i, xp4 xp4Var, boolean z, pw8 pw8Var) {
        this.f24558p = b27.m26519c(map);
        this.f24561s = xp4Var;
        if (context == null) {
            this.f24566x = 0;
            this.f24556A = m12006g(0);
            return;
        }
        bi5 m26143b = bi5.m26143b(context);
        int m26144a = m26143b.m26144a();
        this.f24566x = m26144a;
        this.f24556A = m12006g(m26144a);
        m26143b.m26141d(new ow8(this));
    }

    /* renamed from: d */
    public static synchronized qw8 m12008d(Context context) {
        qw8 qw8Var;
        synchronized (qw8.class) {
            if (f24555I == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                int[] m12002k = m12002k(it5.m19384l(context));
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                y17 y17Var = f24549C;
                hashMap.put(2, (Long) y17Var.get(m12002k[0]));
                hashMap.put(3, (Long) f24550D.get(m12002k[1]));
                hashMap.put(4, (Long) f24551E.get(m12002k[2]));
                hashMap.put(5, (Long) f24552F.get(m12002k[3]));
                hashMap.put(10, (Long) f24553G.get(m12002k[4]));
                hashMap.put(9, (Long) f24554H.get(m12002k[5]));
                hashMap.put(7, (Long) y17Var.get(m12002k[0]));
                f24555I = new qw8(applicationContext, hashMap, 2000, xp4.f32865a, true, null);
            }
            qw8Var = f24555I;
        }
        return qw8Var;
    }

    /* renamed from: j */
    public static boolean m12003j(pa6 pa6Var, boolean z) {
        return z && !pa6Var.m13534b(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0136, code lost:
        if (r3.equals("VU") != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x014e, code lost:
        if (r3.equals("VI") != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0166, code lost:
        if (r3.equals("VE") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0170, code lost:
        if (r3.equals("VC") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x017a, code lost:
        if (r3.equals("VA") != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0192, code lost:
        if (r3.equals("UY") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01aa, code lost:
        if (r3.equals("UG") != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01b4, code lost:
        if (r3.equals("UA") != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01cc, code lost:
        if (r3.equals("TW") != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d6, code lost:
        if (r3.equals("TV") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01fc, code lost:
        if (r3.equals("TO") != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0206, code lost:
        if (r3.equals("TN") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0210, code lost:
        if (r3.equals("TM") != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x021a, code lost:
        if (r3.equals("TL") != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0232, code lost:
        if (r3.equals("TJ") != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x024a, code lost:
        if (r3.equals("TG") != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0254, code lost:
        if (r3.equals("TD") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x025e, code lost:
        if (r3.equals("TC") != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0275, code lost:
        if (r3.equals("SY") != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x027f, code lost:
        if (r3.equals("SX") != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0286, code lost:
        return new int[]{1, 2, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x028d, code lost:
        if (r3.equals("SV") != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x02c1, code lost:
        if (r3.equals("SO") != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x02d9, code lost:
        if (r3.equals("SM") != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02e3, code lost:
        if (r3.equals("SL") != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x02ea, code lost:
        return new int[]{3, 3, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x02f1, code lost:
        if (r3.equals("SK") != false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x02fb, code lost:
        if (r3.equals("SI") != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0305, code lost:
        if (r3.equals("SH") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x031d, code lost:
        if (r3.equals("SE") != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0327, code lost:
        if (r3.equals("SD") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0331, code lost:
        if (r3.equals("SC") != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0338, code lost:
        return new int[]{4, 2, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0377, code lost:
        if (r3.equals("RS") != false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x038f, code lost:
        if (r3.equals("RE") != false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x03b5, code lost:
        if (r3.equals("PT") != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x03db, code lost:
        if (r3.equals("PM") != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
        if (r3.equals("CI") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x03e5, code lost:
        if (r3.equals("PL") != false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x03ee, code lost:
        if (r3.equals("PK") != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0406, code lost:
        if (r3.equals(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_PG) != false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0410, code lost:
        if (r3.equals("PF") != false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x041a, code lost:
        if (r3.equals("PE") != false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0424, code lost:
        if (r3.equals("PA") != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x043b, code lost:
        if (r3.equals("NZ") != false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0442, code lost:
        return new int[]{1, 1, 2, 2, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0449, code lost:
        if (r3.equals("NU") != false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0452, code lost:
        if (r3.equals("NR") != false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0459, code lost:
        return new int[]{4, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x046e, code lost:
        if (r3.equals("NO") != false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0486, code lost:
        if (r3.equals("NI") != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x048d, code lost:
        return new int[]{2, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x04a2, code lost:
        if (r3.equals("NE") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x04ba, code lost:
        if (r3.equals("NA") != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
        if (r3.equals("CG") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0518, code lost:
        if (r3.equals("MT") != false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0522, code lost:
        if (r3.equals("MS") != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x052c, code lost:
        if (r3.equals("MR") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0533, code lost:
        return new int[]{4, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
        if (r3.equals("CF") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x053a, code lost:
        if (r3.equals("MQ") != false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0544, code lost:
        if (r3.equals("MP") != false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x054d, code lost:
        if (r3.equals("MO") != false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0554, code lost:
        return new int[]{0, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0577, code lost:
        if (r3.equals("ML") != false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x057e, code lost:
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0593, code lost:
        if (r3.equals("MH") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x059d, code lost:
        if (r3.equals("MG") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x05a7, code lost:
        if (r3.equals("MF") != false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x05ae, code lost:
        return new int[]{1, 2, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x05c3, code lost:
        if (r3.equals("MD") != false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x05ca, code lost:
        return new int[]{1, 0, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x05ed, code lost:
        if (r3.equals("LY") != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x05f7, code lost:
        if (r3.equals("LV") != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007e, code lost:
        if (r3.equals("BN") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x062b, code lost:
        if (r3.equals("LR") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0643, code lost:
        if (r3.equals("LI") != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x064d, code lost:
        if (r3.equals("LC") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0681, code lost:
        if (r3.equals("KY") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x068b, code lost:
        if (r3.equals("KW") != false) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
        if (r3.equals("BM") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x06a3, code lost:
        if (r3.equals("KP") != false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x06ad, code lost:
        if (r3.equals("KN") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x06b7, code lost:
        if (r3.equals("KM") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x06c1, code lost:
        if (r3.equals("KI") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x06c8, code lost:
        return new int[]{4, 2, 4, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x06dd, code lost:
        if (r3.equals("KG") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x06e4, code lost:
        return new int[]{2, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x06eb, code lost:
        if (r3.equals("KE") != false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0092, code lost:
        if (r3.equals("BL") != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x071f, code lost:
        if (r3.equals("JE") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0726, code lost:
        return new int[]{4, 2, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x073b, code lost:
        if (r3.equals("IS") != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0761, code lost:
        if (r3.equals("IO") != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0768, code lost:
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x077d, code lost:
        if (r3.equals("IM") != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0784, code lost:
        return new int[]{0, 2, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x078b, code lost:
        if (r3.equals("IL") != false) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0795, code lost:
        if (r3.equals("IE") != false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x07bb, code lost:
        if (r3.equals("HT") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x07c5, code lost:
        if (r3.equals("HR") != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x07ea, code lost:
        if (r3.equals("GW") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x07f4, code lost:
        if (r3.equals("GU") != false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x07fb, code lost:
        return new int[]{1, 2, 4, 4, 4, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0810, code lost:
        if (r3.equals("GR") != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0817, code lost:
        return new int[]{1, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x082c, code lost:
        if (r3.equals("GP") != false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0833, code lost:
        return new int[]{2, 1, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0848, code lost:
        if (r3.equals("GM") != false) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0852, code lost:
        if (r3.equals("GL") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x085c, code lost:
        if (r3.equals("GI") != false) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0866, code lost:
        if (r3.equals("GH") != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x086d, code lost:
        return new int[]{3, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0874, code lost:
        if (r3.equals("GG") != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x087b, code lost:
        return new int[]{0, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0882, code lost:
        if (r3.equals("GF") != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x089a, code lost:
        if (r3.equals("GD") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x08b2, code lost:
        if (r3.equals("GA") != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08b9, code lost:
        return new int[]{3, 4, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x08ce, code lost:
        if (r3.equals("FO") != false) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x08e6, code lost:
        if (r3.equals("FK") != false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x08ed, code lost:
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c6, code lost:
        if (r3.equals("AR") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x091e, code lost:
        if (r3.equals("ES") != false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x0925, code lost:
        return new int[]{0, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x092c, code lost:
        if (r3.equals("ER") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x0933, code lost:
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x093a, code lost:
        if (r3.equals("EG") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x0941, code lost:
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0948, code lost:
        if (r3.equals("EE") != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x094f, code lost:
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d0, code lost:
        if (r3.equals("AQ") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x0964, code lost:
        if (r3.equals("DZ") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x096b, code lost:
        return new int[]{3, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x0980, code lost:
        if (r3.equals("DM") != false) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0998, code lost:
        if (r3.equals("DJ") != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x09af, code lost:
        if (r3.equals("CZ") != false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x09b6, code lost:
        return new int[]{0, 0, 2, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x09bd, code lost:
        if (r3.equals("CY") != false) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x09c4, code lost:
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00da, code lost:
        if (r3.equals("ZW") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x09cb, code lost:
        if (r3.equals("CX") != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x09d2, code lost:
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x09d9, code lost:
        if (r3.equals("CW") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x09e0, code lost:
        return new int[]{2, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x09f5, code lost:
        if (r3.equals("CU") != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x09fc, code lost:
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x0a3b, code lost:
        if (r3.equals("CL") != false) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x0a42, code lost:
        return new int[]{1, 2, 2, 2, 3, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0a49, code lost:
        if (r3.equals("CK") != false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x0a50, code lost:
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x0a81, code lost:
        if (r3.equals("BQ") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x0a99, code lost:
        if (r3.equals("BI") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0aa0, code lost:
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x0ab5, code lost:
        if (r3.equals("BG") != false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x0abc, code lost:
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x0aed, code lost:
        if (r3.equals("AZ") != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x0af4, code lost:
        return new int[]{3, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x0b25, code lost:
        if (r3.equals("AF") != false) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x0b2c, code lost:
        return new int[]{4, 3, 3, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0b41, code lost:
        if (r3.equals("AD") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0b48, code lost:
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0100, code lost:
        if (r3.equals("YT") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0b87, code lost:
        if (r3.equals("BB") != false) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x0b8e, code lost:
        return new int[]{0, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x0ba3, code lost:
        if (r3.equals("AX") != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x0baa, code lost:
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x010a, code lost:
        if (r3.equals("YE") != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:887:0x0bcd, code lost:
        if (r3.equals("AL") != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:0x0bd4, code lost:
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0114, code lost:
        if (r3.equals("XK") != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x012c, code lost:
        if (r3.equals("WF") != false) goto L111;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] m12002k(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 2091) {
            if (hashCode != 2092) {
                if (hashCode != 2102) {
                    if (hashCode != 2103) {
                        if (hashCode != 2111) {
                            if (hashCode != 2112) {
                                if (hashCode != 2129) {
                                    if (hashCode != 2130) {
                                        if (hashCode != 2135) {
                                            if (hashCode != 2136) {
                                                switch (hashCode) {
                                                    case 2083:
                                                        break;
                                                    case 2084:
                                                        if (str.equals("AE")) {
                                                            return new int[]{1, 4, 4, 4, 4, 0};
                                                        }
                                                        break;
                                                    case 2085:
                                                        break;
                                                    case 2086:
                                                        if (str.equals("AG")) {
                                                            return new int[]{2, 4, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    default:
                                                        switch (hashCode) {
                                                            case 2088:
                                                                if (str.equals("AI")) {
                                                                    return new int[]{0, 2, 0, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2094:
                                                                if (str.equals("AO")) {
                                                                    return new int[]{4, 4, 3, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2105:
                                                                break;
                                                            case 2114:
                                                                if (str.equals("BD")) {
                                                                    return new int[]{2, 1, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2115:
                                                                if (str.equals("BE")) {
                                                                    return new int[]{0, 1, 4, 4, 3, 2};
                                                                }
                                                                break;
                                                            case 2116:
                                                                if (str.equals("BF")) {
                                                                    return new int[]{4, 3, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2117:
                                                                break;
                                                            case 2118:
                                                                if (str.equals("BH")) {
                                                                    return new int[]{1, 2, 1, 3, 4, 2};
                                                                }
                                                                break;
                                                            case 2119:
                                                                break;
                                                            case 2120:
                                                                if (str.equals("BJ")) {
                                                                    return new int[]{4, 4, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2127:
                                                                break;
                                                            case 2133:
                                                                if (str.equals("BW")) {
                                                                    return new int[]{3, 2, 1, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2142:
                                                                if (str.equals("CA")) {
                                                                    return new int[]{0, 2, 2, 2, 3, 2};
                                                                }
                                                                break;
                                                            case 2145:
                                                                if (str.equals("CD")) {
                                                                    return new int[]{4, 2, 3, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2152:
                                                                break;
                                                            case 2153:
                                                                break;
                                                            case 2154:
                                                                if (str.equals("CM")) {
                                                                    return new int[]{3, 3, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2155:
                                                                if (str.equals("CN")) {
                                                                    return new int[]{2, 0, 1, 1, 3, 2};
                                                                }
                                                                break;
                                                            case 2156:
                                                                if (str.equals("CO")) {
                                                                    return new int[]{2, 3, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2159:
                                                                if (str.equals("CR")) {
                                                                    return new int[]{2, 3, 4, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2162:
                                                                break;
                                                            case 2163:
                                                                if (str.equals("CV")) {
                                                                    return new int[]{2, 1, 0, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2164:
                                                                break;
                                                            case 2165:
                                                                break;
                                                            case 2166:
                                                                break;
                                                            case 2167:
                                                                break;
                                                            case 2177:
                                                                if (str.equals("DE")) {
                                                                    return new int[]{0, 1, 2, 2, 2, 3};
                                                                }
                                                                break;
                                                            case 2182:
                                                                break;
                                                            case 2183:
                                                                if (str.equals("DK")) {
                                                                    return new int[]{0, 0, 3, 2, 0, 2};
                                                                }
                                                                break;
                                                            case 2185:
                                                                break;
                                                            case 2187:
                                                                if (str.equals("DO")) {
                                                                    return new int[]{3, 4, 4, 4, 4, 2};
                                                                }
                                                                break;
                                                            case 2198:
                                                                break;
                                                            case 2206:
                                                                if (str.equals("EC")) {
                                                                    return new int[]{2, 3, 2, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2208:
                                                                break;
                                                            case 2210:
                                                                break;
                                                            case 2221:
                                                                break;
                                                            case 2222:
                                                                break;
                                                            case 2223:
                                                                if (str.equals("ET")) {
                                                                    return new int[]{4, 3, 3, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2243:
                                                                if (str.equals("FI")) {
                                                                    return new int[]{0, 0, 0, 3, 0, 2};
                                                                }
                                                                break;
                                                            case 2244:
                                                                if (str.equals("FJ")) {
                                                                    return new int[]{3, 1, 2, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2245:
                                                                break;
                                                            case 2247:
                                                                if (str.equals("FM")) {
                                                                    return new int[]{4, 2, 4, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2249:
                                                                break;
                                                            case 2252:
                                                                if (str.equals("FR")) {
                                                                    return new int[]{1, 2, 3, 1, 0, 2};
                                                                }
                                                                break;
                                                            case 2266:
                                                                break;
                                                            case 2267:
                                                                if (str.equals("GB")) {
                                                                    return new int[]{0, 0, 1, 1, 1, 1};
                                                                }
                                                                break;
                                                            case 2269:
                                                                break;
                                                            case 2270:
                                                                if (str.equals("GE")) {
                                                                    return new int[]{1, 1, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2271:
                                                                break;
                                                            case 2272:
                                                                break;
                                                            case 2273:
                                                                break;
                                                            case 2274:
                                                                break;
                                                            case 2277:
                                                                break;
                                                            case 2278:
                                                                break;
                                                            case 2279:
                                                                if (str.equals("GN")) {
                                                                    return new int[]{4, 3, 4, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2281:
                                                                break;
                                                            case 2282:
                                                                if (str.equals("GQ")) {
                                                                    return new int[]{4, 2, 1, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2283:
                                                                break;
                                                            case 2285:
                                                                if (str.equals("GT")) {
                                                                    return new int[]{2, 3, 2, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2286:
                                                                break;
                                                            case 2288:
                                                                break;
                                                            case 2290:
                                                                if (str.equals("GY")) {
                                                                    return new int[]{3, 2, 2, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2307:
                                                                if (str.equals("HK")) {
                                                                    return new int[]{0, 1, 2, 3, 2, 0};
                                                                }
                                                                break;
                                                            case 2314:
                                                                break;
                                                            case 2316:
                                                                break;
                                                            case 2317:
                                                                if (str.equals("HU")) {
                                                                    return new int[]{0, 0, 0, 1, 3, 2};
                                                                }
                                                                break;
                                                            case 2331:
                                                                if (str.equals("ID")) {
                                                                    return new int[]{3, 1, 2, 2, 3, 2};
                                                                }
                                                                break;
                                                            case 2332:
                                                                break;
                                                            case 2339:
                                                                break;
                                                            case 2340:
                                                                break;
                                                            case 2341:
                                                                if (str.equals("IN")) {
                                                                    return new int[]{1, 1, 3, 2, 3, 3};
                                                                }
                                                                break;
                                                            case 2342:
                                                                break;
                                                            case 2344:
                                                                if (str.equals("IQ")) {
                                                                    return new int[]{3, 2, 2, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2345:
                                                                if (str.equals("IR")) {
                                                                    return new int[]{3, 0, 1, 1, 4, 1};
                                                                }
                                                                break;
                                                            case 2346:
                                                                break;
                                                            case 2347:
                                                                if (str.equals("IT")) {
                                                                    return new int[]{0, 0, 0, 1, 1, 2};
                                                                }
                                                                break;
                                                            case 2363:
                                                                break;
                                                            case 2371:
                                                                if (str.equals("JM")) {
                                                                    return new int[]{2, 4, 3, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2373:
                                                                if (str.equals("JO")) {
                                                                    return new int[]{2, 1, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2374:
                                                                if (str.equals("JP")) {
                                                                    return new int[]{0, 1, 1, 2, 2, 4};
                                                                }
                                                                break;
                                                            case 2394:
                                                                break;
                                                            case 2396:
                                                                break;
                                                            case 2397:
                                                                if (str.equals("KH")) {
                                                                    return new int[]{2, 1, 4, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2398:
                                                                break;
                                                            case 2402:
                                                                break;
                                                            case 2403:
                                                                break;
                                                            case 2405:
                                                                break;
                                                            case 2407:
                                                                if (str.equals("KR")) {
                                                                    return new int[]{0, 1, 1, 3, 4, 4};
                                                                }
                                                                break;
                                                            case 2412:
                                                                break;
                                                            case 2414:
                                                                break;
                                                            case 2415:
                                                                if (str.equals("KZ")) {
                                                                    return new int[]{2, 1, 2, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2421:
                                                                if (str.equals("LA")) {
                                                                    return new int[]{1, 2, 1, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2422:
                                                                if (str.equals("LB")) {
                                                                    return new int[]{3, 3, 2, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2423:
                                                                break;
                                                            case 2429:
                                                                break;
                                                            case 2431:
                                                                if (str.equals("LK")) {
                                                                    return new int[]{3, 1, 3, 3, 4, 2};
                                                                }
                                                                break;
                                                            case 2438:
                                                                break;
                                                            case 2439:
                                                                if (str.equals("LS")) {
                                                                    return new int[]{3, 3, 2, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2440:
                                                                if (str.equals("LT")) {
                                                                    return new int[]{0, 0, 0, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2441:
                                                                if (str.equals("LU")) {
                                                                    return new int[]{1, 0, 3, 2, 1, 4};
                                                                }
                                                                break;
                                                            case 2442:
                                                                break;
                                                            case 2445:
                                                                break;
                                                            case 2452:
                                                                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                                                                    return new int[]{3, 3, 1, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2454:
                                                                if (str.equals("MC")) {
                                                                    return new int[]{0, 2, 2, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2455:
                                                                break;
                                                            case 2456:
                                                                if (str.equals("ME")) {
                                                                    return new int[]{2, 0, 0, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2457:
                                                                break;
                                                            case 2458:
                                                                break;
                                                            case 2459:
                                                                break;
                                                            case 2462:
                                                                if (str.equals("MK")) {
                                                                    return new int[]{1, 0, 0, 1, 3, 2};
                                                                }
                                                                break;
                                                            case 2463:
                                                                break;
                                                            case 2464:
                                                                if (str.equals("MM")) {
                                                                    return new int[]{2, 4, 2, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2465:
                                                                if (str.equals("MN")) {
                                                                    return new int[]{2, 0, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2466:
                                                                break;
                                                            case 2467:
                                                                break;
                                                            case 2468:
                                                                break;
                                                            case 2469:
                                                                break;
                                                            case 2470:
                                                                break;
                                                            case 2471:
                                                                break;
                                                            case 2472:
                                                                if (str.equals("MU")) {
                                                                    return new int[]{3, 1, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2473:
                                                                if (str.equals("MV")) {
                                                                    return new int[]{3, 4, 1, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2474:
                                                                if (str.equals("MW")) {
                                                                    return new int[]{4, 2, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2475:
                                                                if (str.equals("MX")) {
                                                                    return new int[]{2, 4, 3, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2476:
                                                                if (str.equals("MY")) {
                                                                    return new int[]{1, 0, 3, 1, 3, 2};
                                                                }
                                                                break;
                                                            case 2477:
                                                                if (str.equals("MZ")) {
                                                                    return new int[]{3, 1, 2, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2483:
                                                                break;
                                                            case 2485:
                                                                if (str.equals("NC")) {
                                                                    return new int[]{3, 3, 4, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2487:
                                                                break;
                                                            case 2489:
                                                                if (str.equals("NG")) {
                                                                    return new int[]{3, 4, 2, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2491:
                                                                break;
                                                            case 2494:
                                                                if (str.equals("NL")) {
                                                                    return new int[]{0, 2, 2, 3, 0, 3};
                                                                }
                                                                break;
                                                            case 2497:
                                                                break;
                                                            case 2498:
                                                                if (str.equals("NP")) {
                                                                    return new int[]{2, 2, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2500:
                                                                break;
                                                            case 2503:
                                                                break;
                                                            case 2508:
                                                                break;
                                                            case 2526:
                                                                if (str.equals("OM")) {
                                                                    return new int[]{2, 3, 1, 3, 4, 2};
                                                                }
                                                                break;
                                                            case 2545:
                                                                break;
                                                            case 2549:
                                                                break;
                                                            case 2550:
                                                                break;
                                                            case 2551:
                                                                break;
                                                            case 2552:
                                                                if (str.equals("PH")) {
                                                                    return new int[]{2, 1, 3, 3, 3, 0};
                                                                }
                                                                break;
                                                            case 2555:
                                                                break;
                                                            case 2556:
                                                                break;
                                                            case 2557:
                                                                break;
                                                            case 2562:
                                                                if (str.equals("PR")) {
                                                                    return new int[]{2, 0, 2, 1, 2, 1};
                                                                }
                                                                break;
                                                            case 2563:
                                                                if (str.equals("PS")) {
                                                                    return new int[]{3, 4, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2564:
                                                                break;
                                                            case 2567:
                                                                if (str.equals("PW")) {
                                                                    return new int[]{2, 2, 4, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2576:
                                                                if (str.equals("QA")) {
                                                                    return new int[]{2, 4, 4, 4, 4, 2};
                                                                }
                                                                break;
                                                            case 2611:
                                                                break;
                                                            case 2621:
                                                                if (str.equals("RO")) {
                                                                    return new int[]{0, 0, 1, 2, 1, 2};
                                                                }
                                                                break;
                                                            case 2625:
                                                                break;
                                                            case 2627:
                                                                if (str.equals("RU")) {
                                                                    return new int[]{1, 0, 0, 0, 4, 3};
                                                                }
                                                                break;
                                                            case 2629:
                                                                if (str.equals("RW")) {
                                                                    return new int[]{3, 4, 2, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2638:
                                                                if (str.equals("SA")) {
                                                                    return new int[]{3, 1, 1, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2639:
                                                                if (str.equals("SB")) {
                                                                    return new int[]{4, 2, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2640:
                                                                break;
                                                            case 2641:
                                                                break;
                                                            case 2642:
                                                                break;
                                                            case 2644:
                                                                if (str.equals("SG")) {
                                                                    return new int[]{1, 1, 2, 2, 2, 1};
                                                                }
                                                                break;
                                                            case 2645:
                                                                break;
                                                            case 2646:
                                                                break;
                                                            case 2648:
                                                                break;
                                                            case 2649:
                                                                break;
                                                            case 2650:
                                                                break;
                                                            case 2651:
                                                                if (str.equals("SN")) {
                                                                    return new int[]{4, 4, 4, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2652:
                                                                break;
                                                            case 2655:
                                                                if (str.equals("SR")) {
                                                                    return new int[]{2, 4, 3, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2656:
                                                                if (str.equals("SS")) {
                                                                    return new int[]{4, 3, 2, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2657:
                                                                if (str.equals("ST")) {
                                                                    return new int[]{2, 2, 1, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2659:
                                                                break;
                                                            case 2661:
                                                                break;
                                                            case 2662:
                                                                break;
                                                            case 2663:
                                                                if (str.equals("SZ")) {
                                                                    return new int[]{3, 3, 3, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2671:
                                                                break;
                                                            case 2672:
                                                                break;
                                                            case 2675:
                                                                break;
                                                            case 2676:
                                                                if (str.equals("TH")) {
                                                                    return new int[]{0, 2, 2, 3, 3, 4};
                                                                }
                                                                break;
                                                            case 2678:
                                                                break;
                                                            case 2679:
                                                                if (str.equals("TK")) {
                                                                    return new int[]{2, 2, 2, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2680:
                                                                break;
                                                            case 2681:
                                                                break;
                                                            case 2682:
                                                                break;
                                                            case 2683:
                                                                break;
                                                            case 2686:
                                                                if (str.equals("TR")) {
                                                                    return new int[]{1, 1, 0, 0, 2, 2};
                                                                }
                                                                break;
                                                            case 2688:
                                                                if (str.equals("TT")) {
                                                                    return new int[]{1, 4, 1, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2690:
                                                                break;
                                                            case 2691:
                                                                break;
                                                            case 2694:
                                                                if (str.equals("TZ")) {
                                                                    return new int[]{3, 4, 3, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2700:
                                                                break;
                                                            case 2706:
                                                                break;
                                                            case 2718:
                                                                if (str.equals("US")) {
                                                                    return new int[]{1, 0, 2, 2, 3, 1};
                                                                }
                                                                break;
                                                            case 2724:
                                                                break;
                                                            case 2725:
                                                                if (str.equals("UZ")) {
                                                                    return new int[]{2, 2, 3, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2731:
                                                                break;
                                                            case 2733:
                                                                break;
                                                            case 2735:
                                                                break;
                                                            case 2737:
                                                                if (str.equals("VG")) {
                                                                    return new int[]{2, 2, 1, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2739:
                                                                break;
                                                            case 2744:
                                                                if (str.equals("VN")) {
                                                                    return new int[]{0, 3, 3, 4, 2, 2};
                                                                }
                                                                break;
                                                            case 2751:
                                                                break;
                                                            case 2767:
                                                                break;
                                                            case 2780:
                                                                if (str.equals("WS")) {
                                                                    return new int[]{3, 1, 3, 1, 2, 2};
                                                                }
                                                                break;
                                                            case 2803:
                                                                break;
                                                            case 2828:
                                                                break;
                                                            case 2843:
                                                                break;
                                                            case 2855:
                                                                if (str.equals("ZA")) {
                                                                    return new int[]{3, 2, 2, 1, 1, 2};
                                                                }
                                                                break;
                                                            case 2867:
                                                                if (str.equals("ZM")) {
                                                                    return new int[]{3, 3, 4, 2, 2, 2};
                                                                }
                                                                break;
                                                            case 2877:
                                                                break;
                                                            default:
                                                                switch (hashCode) {
                                                                    case 2096:
                                                                        break;
                                                                    case 2097:
                                                                        break;
                                                                    case 2098:
                                                                        if (str.equals("AS")) {
                                                                            return new int[]{2, 2, 3, 3, 2, 2};
                                                                        }
                                                                        break;
                                                                    case 2099:
                                                                        if (str.equals("AT")) {
                                                                            return new int[]{1, 0, 1, 1, 0, 0};
                                                                        }
                                                                        break;
                                                                    case 2100:
                                                                        if (str.equals("AU")) {
                                                                            return new int[]{0, 1, 1, 1, 2, 0};
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (hashCode) {
                                                                            case 2122:
                                                                                break;
                                                                            case 2123:
                                                                                break;
                                                                            case 2124:
                                                                                break;
                                                                            case 2125:
                                                                                if (str.equals("BO")) {
                                                                                    return new int[]{1, 2, 3, 2, 2, 2};
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (hashCode) {
                                                                                    case 2149:
                                                                                        if (str.equals("CH")) {
                                                                                            return new int[]{0, 0, 0, 1, 0, 2};
                                                                                        }
                                                                                        break;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                            } else if (str.equals("BZ")) {
                                                return new int[]{2, 4, 2, 1, 2, 2};
                                            }
                                        } else if (str.equals("BY")) {
                                            return new int[]{0, 1, 2, 3, 2, 2};
                                        }
                                    } else if (str.equals("BT")) {
                                        return new int[]{3, 1, 3, 2, 2, 2};
                                    }
                                } else if (str.equals("BS")) {
                                    return new int[]{4, 4, 2, 2, 2, 2};
                                }
                            }
                        } else if (str.equals("BA")) {
                            return new int[]{1, 2, 1, 1, 2, 2};
                        }
                    }
                } else if (str.equals("AW")) {
                    return new int[]{1, 3, 4, 4, 2, 2};
                }
            } else if (str.equals("AM")) {
                return new int[]{2, 3, 2, 3, 2, 2};
            }
            return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    @Override // com.daaw.qz6
    /* renamed from: D */
    public final synchronized void mo11898D(p46 p46Var, pa6 pa6Var, boolean z, int i) {
        if (m12003j(pa6Var, z)) {
            this.f24565w += i;
        }
    }

    @Override // com.daaw.qz6
    /* renamed from: a */
    public final synchronized void mo11897a(p46 p46Var, pa6 pa6Var, boolean z) {
        if (m12003j(pa6Var, z)) {
            uo4.m7872f(this.f24563u > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.f24564v);
            this.f24567y += i;
            long j = this.f24568z;
            long j2 = this.f24565w;
            this.f24568z = j + j2;
            if (i > 0) {
                this.f24560r.m15680b((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i);
                if (this.f24567y >= 2000 || this.f24568z >= 524288) {
                    this.f24556A = this.f24560r.m15681a(0.5f);
                }
                m12005h(i, this.f24565w, this.f24556A);
                this.f24564v = elapsedRealtime;
                this.f24565w = 0L;
            }
            this.f24563u--;
        }
    }

    @Override // com.daaw.mw8
    /* renamed from: b */
    public final void mo12010b(lw8 lw8Var) {
        this.f24559q.m17372c(lw8Var);
    }

    @Override // com.daaw.mw8
    /* renamed from: c */
    public final void mo12009c(Handler handler, lw8 lw8Var) {
        Objects.requireNonNull(lw8Var);
        this.f24559q.m17374a(handler, lw8Var);
    }

    @Override // com.daaw.qz6
    /* renamed from: f */
    public final void mo11896f(p46 p46Var, pa6 pa6Var, boolean z) {
    }

    /* renamed from: g */
    public final long m12006g(int i) {
        Long l = (Long) this.f24558p.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) this.f24558p.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    /* renamed from: h */
    public final void m12005h(int i, long j, long j2) {
        int i2;
        long j3;
        if (i == 0) {
            if (j != 0) {
                j3 = j;
            } else if (j2 == this.f24557B) {
                return;
            } else {
                j3 = 0;
            }
            i2 = 0;
        } else {
            i2 = i;
            j3 = j;
        }
        this.f24557B = j2;
        this.f24559q.m17373b(i2, j3, j2);
    }

    /* renamed from: i */
    public final synchronized void m12004i(int i) {
        int i2 = this.f24566x;
        if (i2 == 0 || this.f24562t) {
            if (i2 == i) {
                return;
            }
            this.f24566x = i;
            if (i != 1 && i != 0 && i != 8) {
                this.f24556A = m12006g(i);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                m12005h(this.f24563u > 0 ? (int) (elapsedRealtime - this.f24564v) : 0, this.f24565w, this.f24556A);
                this.f24564v = elapsedRealtime;
                this.f24565w = 0L;
                this.f24568z = 0L;
                this.f24567y = 0L;
                this.f24560r.m15679c();
            }
        }
    }

    @Override // com.daaw.qz6
    /* renamed from: l */
    public final synchronized void mo11895l(p46 p46Var, pa6 pa6Var, boolean z) {
        if (m12003j(pa6Var, z)) {
            if (this.f24563u == 0) {
                this.f24564v = SystemClock.elapsedRealtime();
            }
            this.f24563u++;
        }
    }
}
