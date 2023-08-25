package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzatd;
import java.io.IOException;
/* loaded from: classes.dex */
public final class aq2 implements Handler.Callback, vv2, ex2, xv2 {

    /* renamed from: A */
    public fq2 f3433A;

    /* renamed from: B */
    public gq2 f3434B;

    /* renamed from: C */
    public ez2 f3435C;

    /* renamed from: D */
    public yv2 f3436D;

    /* renamed from: E */
    public gq2[] f3437E;

    /* renamed from: F */
    public boolean f3438F;

    /* renamed from: G */
    public boolean f3439G;

    /* renamed from: H */
    public boolean f3440H;

    /* renamed from: I */
    public boolean f3441I;

    /* renamed from: L */
    public int f3444L;

    /* renamed from: M */
    public int f3445M;

    /* renamed from: N */
    public long f3446N;

    /* renamed from: O */
    public int f3447O;

    /* renamed from: P */
    public up2 f3448P;

    /* renamed from: Q */
    public long f3449Q;

    /* renamed from: R */
    public sp2 f3450R;

    /* renamed from: S */
    public sp2 f3451S;

    /* renamed from: T */
    public sp2 f3452T;

    /* renamed from: U */
    public mq2 f3453U;

    /* renamed from: V */
    public boolean f3454V;

    /* renamed from: W */
    public boolean f3455W;

    /* renamed from: X */
    public int f3456X;

    /* renamed from: Y */
    public volatile int f3457Y;

    /* renamed from: Z */
    public volatile int f3458Z;

    /* renamed from: a0 */
    public final y34 f3459a0;

    /* renamed from: p */
    public final gq2[] f3460p;

    /* renamed from: r */
    public final fx2 f3462r;

    /* renamed from: s */
    public final lz2 f3463s;

    /* renamed from: t */
    public final Handler f3464t;

    /* renamed from: u */
    public final HandlerThread f3465u;

    /* renamed from: v */
    public final Handler f3466v;

    /* renamed from: w */
    public final op2 f3467w;

    /* renamed from: x */
    public final lq2 f3468x;

    /* renamed from: y */
    public final kq2 f3469y;

    /* renamed from: z */
    public tp2 f3470z;

    /* renamed from: K */
    public int f3443K = 0;

    /* renamed from: J */
    public int f3442J = 1;

    /* renamed from: q */
    public final hq2[] f3461q = new hq2[2];

    public aq2(gq2[] gq2VarArr, fx2 fx2Var, y34 y34Var, boolean z, int i, Handler handler, tp2 tp2Var, op2 op2Var, byte[] bArr) {
        this.f3460p = gq2VarArr;
        this.f3462r = fx2Var;
        this.f3459a0 = y34Var;
        this.f3439G = z;
        this.f3466v = handler;
        this.f3470z = tp2Var;
        this.f3467w = op2Var;
        for (int i2 = 0; i2 < 2; i2++) {
            gq2VarArr[i2].mo19540f(i2);
            this.f3461q[i2] = gq2VarArr[i2].zzf();
        }
        this.f3463s = new lz2();
        this.f3437E = new gq2[0];
        this.f3468x = new lq2();
        this.f3469y = new kq2();
        fx2Var.m22148c(this);
        this.f3433A = fq2.f9781d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f3465u = handlerThread;
        handlerThread.start();
        this.f3464t = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: t */
    public static final void m27174t(gq2 gq2Var) {
        if (gq2Var.zzb() == 2) {
            gq2Var.zzz();
        }
    }

    /* renamed from: u */
    public static final void m27173u(sp2 sp2Var) {
        while (sp2Var != null) {
            sp2Var.m10091c();
            sp2Var = sp2Var.f26491l;
        }
    }

    /* renamed from: A */
    public final synchronized void m27207A() {
        if (this.f3438F) {
            return;
        }
        this.f3464t.sendEmptyMessage(6);
        while (!this.f3438F) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.f3465u.quit();
    }

    /* renamed from: B */
    public final void m27206B(mq2 mq2Var, int i, long j) {
        this.f3464t.obtainMessage(3, new up2(mq2Var, 0, j)).sendToTarget();
    }

    /* renamed from: C */
    public final void m27205C(np2... np2VarArr) {
        if (this.f3438F) {
            return;
        }
        this.f3444L++;
        this.f3464t.obtainMessage(11, np2VarArr).sendToTarget();
    }

    /* renamed from: D */
    public final void m27204D(int i) {
        this.f3458Z = i;
    }

    /* renamed from: E */
    public final void m27203E(int i) {
        this.f3457Y = i;
    }

    /* renamed from: F */
    public final void m27202F(boolean z) {
        this.f3464t.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: G */
    public final void m27201G() {
        this.f3464t.sendEmptyMessage(5);
    }

    /* renamed from: H */
    public final synchronized boolean m27200H(np2... np2VarArr) {
        int i;
        if (this.f3438F) {
            return true;
        }
        int i2 = this.f3444L;
        this.f3444L = i2 + 1;
        this.f3464t.obtainMessage(11, np2VarArr).sendToTarget();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f3456X;
        long j2 = elapsedRealtime + j;
        while (true) {
            i = this.f3445M;
            if (i > i2 || j <= 0) {
                break;
            }
            try {
                wait(j);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            j = j2 - SystemClock.elapsedRealtime();
        }
        return i2 < i;
    }

    /* renamed from: I */
    public final boolean m27199I() {
        return this.f3455W && this.f3456X > 0;
    }

    /* renamed from: J */
    public final synchronized boolean m27198J() {
        if (this.f3438F) {
            return true;
        }
        this.f3464t.sendEmptyMessage(6);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f3456X;
        long j2 = elapsedRealtime + j;
        while (true) {
            if (!this.f3438F) {
                if (j <= 0) {
                    break;
                }
                try {
                    wait(j);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                j = j2 - SystemClock.elapsedRealtime();
            } else {
                this.f3465u.quit();
                break;
            }
        }
        return this.f3438F;
    }

    /* renamed from: K */
    public final int m27197K(int i, mq2 mq2Var, mq2 mq2Var2) {
        int mo15853b = mq2Var.mo15853b();
        int i2 = -1;
        for (int i3 = 0; i3 < mo15853b && i2 == -1; i3++) {
            i = mq2Var.m15849f(i, this.f3469y, this.f3468x, this.f3443K);
            i2 = mq2Var2.mo15854a(mq2Var.mo15851d(i, this.f3469y, true).f16695b);
        }
        return i2;
    }

    /* renamed from: L */
    public final long m27196L(int i, long j) {
        sp2 sp2Var;
        m27178p();
        this.f3440H = false;
        m27181m(2);
        sp2 sp2Var2 = this.f3452T;
        if (sp2Var2 == null) {
            sp2 sp2Var3 = this.f3450R;
            if (sp2Var3 != null) {
                sp2Var3.m10091c();
            }
            sp2Var = null;
        } else {
            sp2Var = null;
            while (sp2Var2 != null) {
                if (sp2Var2.f26486g == i && sp2Var2.f26489j) {
                    sp2Var = sp2Var2;
                } else {
                    sp2Var2.m10091c();
                }
                sp2Var2 = sp2Var2.f26491l;
            }
        }
        sp2 sp2Var4 = this.f3452T;
        if (sp2Var4 != sp2Var || sp2Var4 != this.f3451S) {
            for (gq2 gq2Var : this.f3437E) {
                gq2Var.zzj();
            }
            this.f3437E = new gq2[0];
            this.f3435C = null;
            this.f3434B = null;
            this.f3452T = null;
        }
        if (sp2Var != null) {
            sp2Var.f26491l = null;
            this.f3450R = sp2Var;
            this.f3451S = sp2Var;
            m27182l(sp2Var);
            sp2 sp2Var5 = this.f3452T;
            if (sp2Var5.f26490k) {
                j = sp2Var5.f26480a.mo1845e(j);
            }
            m27185i(j);
            m27189c();
        } else {
            this.f3450R = null;
            this.f3451S = null;
            this.f3452T = null;
            m27185i(j);
        }
        this.f3464t.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: M */
    public final Pair m27195M(int i, long j) {
        return m27194N(this.f3453U, 0, -9223372036854775807L);
    }

    /* renamed from: N */
    public final Pair m27194N(mq2 mq2Var, int i, long j) {
        return m27193O(mq2Var, 0, j, 0L);
    }

    /* renamed from: O */
    public final Pair m27193O(mq2 mq2Var, int i, long j, long j2) {
        az2.m26587a(0, 0, mq2Var.mo15852c());
        mq2Var.mo15850e(0, this.f3468x, false, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j3 = mq2Var.mo15851d(0, this.f3469y, false).f16696c;
        if (j3 != -9223372036854775807L) {
            int i2 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j));
    }

    /* renamed from: P */
    public final Pair m27192P(up2 up2Var) {
        mq2 mq2Var = up2Var.f29410a;
        if (mq2Var.m15847h()) {
            mq2Var = this.f3453U;
        }
        try {
            Pair m27194N = m27194N(mq2Var, 0, up2Var.f29412c);
            mq2 mq2Var2 = this.f3453U;
            if (mq2Var2 == mq2Var) {
                return m27194N;
            }
            if (mq2Var2.mo15854a(mq2Var.mo15851d(((Integer) m27194N.first).intValue(), this.f3469y, true).f16695b) != -1) {
                return Pair.create(0, (Long) m27194N.second);
            }
            if (m27197K(((Integer) m27194N.first).intValue(), mq2Var, this.f3453U) != -1) {
                this.f3453U.mo15851d(0, this.f3469y, false);
                return m27195M(0, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new dq2(this.f3453U, 0, up2Var.f29412c);
        }
    }

    /* renamed from: Q */
    public final void m27191Q(boolean[] zArr, int i) {
        int i2;
        this.f3437E = new gq2[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 2) {
            gq2 gq2Var = this.f3460p[i3];
            vw2 m23830a = this.f3452T.f26492m.f11832b.m23830a(i3);
            if (m23830a != null) {
                int i5 = i4 + 1;
                this.f3437E[i4] = gq2Var;
                if (gq2Var.zzb() == 0) {
                    iq2 iq2Var = this.f3452T.f26492m.f11834d[i3];
                    boolean z = this.f3439G && this.f3442J == 3;
                    boolean z2 = !zArr[i3] && z;
                    m23830a.m6689b();
                    zzatd[] zzatdVarArr = new zzatd[1];
                    for (int i6 = 0; i6 <= 0; i6++) {
                        zzatdVarArr[i6] = m23830a.m6688c(i6);
                    }
                    sp2 sp2Var = this.f3452T;
                    i2 = i3;
                    gq2Var.mo19537j(iq2Var, zzatdVarArr, sp2Var.f26483d[i3], this.f3449Q, z2, sp2Var.f26485f - sp2Var.f26487h);
                    ez2 zzi = gq2Var.zzi();
                    if (zzi != null) {
                        if (this.f3435C != null) {
                            throw kp2.m17546c(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.f3435C = zzi;
                        this.f3434B = gq2Var;
                        zzi.mo9950o(this.f3433A);
                    }
                    if (z) {
                        gq2Var.mo19541e();
                    }
                } else {
                    i2 = i3;
                }
                i4 = i5;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
    }

    /* renamed from: a */
    public final void m27190a(Object obj, int i) {
        this.f3470z = new tp2(0, 0L);
        m27187f(obj, i);
        this.f3470z = new tp2(0, -9223372036854775807L);
        m27181m(4);
        m27186g(false);
    }

    @Override // com.daaw.jw2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo1847b(kw2 kw2Var) {
        this.f3464t.obtainMessage(9, (wv2) kw2Var).sendToTarget();
    }

    /* renamed from: c */
    public final void m27189c() {
        sp2 sp2Var = this.f3450R;
        long zza = !sp2Var.f26489j ? 0L : sp2Var.f26480a.zza();
        if (zza == Long.MIN_VALUE) {
            m27183k(false);
            return;
        }
        sp2 sp2Var2 = this.f3450R;
        long j = this.f3449Q - (sp2Var2.f26485f - sp2Var2.f26487h);
        boolean m4149j = this.f3459a0.m4149j(zza - j);
        m27183k(m4149j);
        if (m4149j) {
            this.f3450R.f26480a.mo1848a(j);
        }
    }

    @Override // com.daaw.xv2
    /* renamed from: d */
    public final void mo4485d(mq2 mq2Var, Object obj) {
        this.f3464t.obtainMessage(7, Pair.create(mq2Var, null)).sendToTarget();
    }

    /* renamed from: e */
    public final void m27188e() {
        sp2 sp2Var = this.f3450R;
        if (sp2Var == null || sp2Var.f26489j) {
            return;
        }
        sp2 sp2Var2 = this.f3451S;
        if (sp2Var2 == null || sp2Var2.f26491l == sp2Var) {
            for (gq2 gq2Var : this.f3437E) {
                if (!gq2Var.zzA()) {
                    return;
                }
            }
            this.f3450R.f26480a.zzs();
        }
    }

    /* renamed from: f */
    public final void m27187f(Object obj, int i) {
        this.f3466v.obtainMessage(6, new zp2(this.f3453U, obj, this.f3470z, i)).sendToTarget();
    }

    /* renamed from: g */
    public final void m27186g(boolean z) {
        gq2[] gq2VarArr;
        this.f3464t.removeMessages(2);
        this.f3440H = false;
        this.f3463s.m16360c();
        this.f3435C = null;
        this.f3434B = null;
        this.f3449Q = 60000000L;
        for (gq2 gq2Var : this.f3437E) {
            try {
                m27174t(gq2Var);
                gq2Var.zzj();
            } catch (kp2 | RuntimeException unused) {
            }
        }
        this.f3437E = new gq2[0];
        sp2 sp2Var = this.f3452T;
        if (sp2Var == null) {
            sp2Var = this.f3450R;
        }
        m27173u(sp2Var);
        this.f3450R = null;
        this.f3451S = null;
        this.f3452T = null;
        m27183k(false);
        if (z) {
            yv2 yv2Var = this.f3436D;
            if (yv2Var != null) {
                yv2Var.zzd();
                this.f3436D = null;
            }
            this.f3453U = null;
        }
    }

    @Override // com.daaw.vv2
    /* renamed from: h */
    public final void mo1842h(wv2 wv2Var) {
        this.f3464t.obtainMessage(8, wv2Var).sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x0326, code lost:
        if (r2 != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0328, code lost:
        r2 = r33.f3452T.f26486g;
        r33.f3470z = new com.daaw.tp2(r2, m27196L(r2, r33.f3470z.f27943c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x033d, code lost:
        r33.f3450R = r3;
        r3.f26491l = null;
        m27173u(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
        m27173u(r12);
        r2.f26491l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x078e, code lost:
        if (m27175s(r1) != false) goto L373;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0266 A[Catch: IOException -> 0x0864, kp2 -> 0x086a, RuntimeException -> 0x0870, TryCatch #8 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:122:0x019b, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:151:0x0216, B:152:0x021b, B:160:0x0262, B:162:0x0266, B:164:0x026a, B:165:0x026f, B:167:0x0279, B:170:0x0284, B:171:0x02ac, B:173:0x02b0, B:177:0x02bb, B:178:0x02be, B:179:0x02ca, B:183:0x02d9, B:185:0x02df, B:186:0x02f0, B:188:0x02f4, B:190:0x0302, B:192:0x0314, B:196:0x0323, B:198:0x0328, B:199:0x033d, B:153:0x0233, B:155:0x023b, B:157:0x0241, B:158:0x0246, B:201:0x0347, B:202:0x0352, B:209:0x035d, B:210:0x035e, B:212:0x0362, B:214:0x036a, B:216:0x0374, B:215:0x036f, B:218:0x0380, B:220:0x0388, B:221:0x0391, B:223:0x0397, B:224:0x03b5, B:228:0x03be, B:234:0x03e0, B:235:0x03ed, B:243:0x03fd, B:246:0x040d, B:247:0x041e, B:248:0x041f, B:250:0x0429, B:356:0x066d, B:358:0x0673, B:360:0x067c, B:362:0x0697, B:364:0x06a2, B:368:0x06ab, B:370:0x06b1, B:376:0x06bd, B:381:0x06c7, B:383:0x06ce, B:384:0x06d1, B:386:0x06d5, B:388:0x06e1, B:389:0x06f4, B:393:0x070e, B:395:0x0716, B:397:0x071c, B:398:0x0720, B:433:0x07b5, B:435:0x07ba, B:437:0x07c0, B:438:0x07c8, B:440:0x07cc, B:444:0x07d6, B:446:0x07da, B:448:0x07e0, B:457:0x07fd, B:442:0x07d1, B:449:0x07e4, B:451:0x07e9, B:453:0x07ed, B:455:0x07f3, B:456:0x07f7, B:399:0x0725, B:401:0x072a, B:404:0x0731, B:406:0x0739, B:410:0x0748, B:422:0x0790, B:424:0x0798, B:413:0x074f, B:414:0x075c, B:416:0x0760, B:417:0x0776, B:407:0x073c, B:420:0x078a, B:427:0x079f, B:432:0x07ab, B:430:0x07a5, B:251:0x0431, B:253:0x0435, B:265:0x046f, B:267:0x0477, B:292:0x054a, B:294:0x054e, B:297:0x0555, B:299:0x0559, B:301:0x055d, B:303:0x0564, B:305:0x0568, B:307:0x056e, B:309:0x0578, B:310:0x059f, B:315:0x05a7, B:317:0x05b3, B:319:0x05b9, B:321:0x05bf, B:322:0x05c2, B:326:0x05c9, B:329:0x05db, B:331:0x05e1, B:332:0x05e4, B:334:0x05ea, B:336:0x05ee, B:338:0x05fe, B:355:0x0663, B:343:0x0618, B:344:0x061c, B:346:0x0622, B:348:0x0632, B:350:0x0638, B:352:0x0640, B:353:0x0649, B:354:0x065c, B:302:0x0561, B:268:0x047e, B:270:0x0482, B:278:0x04dc, B:280:0x04e0, B:283:0x04fa, B:287:0x0506, B:289:0x053c, B:290:0x053e, B:286:0x0501, B:282:0x04e7, B:272:0x0489, B:275:0x049a, B:277:0x04cb, B:254:0x043a, B:256:0x0440, B:258:0x0446, B:260:0x0454, B:262:0x0458, B:264:0x0463, B:459:0x0803, B:463:0x080a, B:465:0x0811, B:467:0x0819, B:469:0x081e, B:470:0x0824, B:473:0x082b, B:475:0x082f, B:477:0x0846, B:478:0x0852), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x026f A[Catch: IOException -> 0x0864, kp2 -> 0x086a, RuntimeException -> 0x0870, TryCatch #8 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:122:0x019b, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:151:0x0216, B:152:0x021b, B:160:0x0262, B:162:0x0266, B:164:0x026a, B:165:0x026f, B:167:0x0279, B:170:0x0284, B:171:0x02ac, B:173:0x02b0, B:177:0x02bb, B:178:0x02be, B:179:0x02ca, B:183:0x02d9, B:185:0x02df, B:186:0x02f0, B:188:0x02f4, B:190:0x0302, B:192:0x0314, B:196:0x0323, B:198:0x0328, B:199:0x033d, B:153:0x0233, B:155:0x023b, B:157:0x0241, B:158:0x0246, B:201:0x0347, B:202:0x0352, B:209:0x035d, B:210:0x035e, B:212:0x0362, B:214:0x036a, B:216:0x0374, B:215:0x036f, B:218:0x0380, B:220:0x0388, B:221:0x0391, B:223:0x0397, B:224:0x03b5, B:228:0x03be, B:234:0x03e0, B:235:0x03ed, B:243:0x03fd, B:246:0x040d, B:247:0x041e, B:248:0x041f, B:250:0x0429, B:356:0x066d, B:358:0x0673, B:360:0x067c, B:362:0x0697, B:364:0x06a2, B:368:0x06ab, B:370:0x06b1, B:376:0x06bd, B:381:0x06c7, B:383:0x06ce, B:384:0x06d1, B:386:0x06d5, B:388:0x06e1, B:389:0x06f4, B:393:0x070e, B:395:0x0716, B:397:0x071c, B:398:0x0720, B:433:0x07b5, B:435:0x07ba, B:437:0x07c0, B:438:0x07c8, B:440:0x07cc, B:444:0x07d6, B:446:0x07da, B:448:0x07e0, B:457:0x07fd, B:442:0x07d1, B:449:0x07e4, B:451:0x07e9, B:453:0x07ed, B:455:0x07f3, B:456:0x07f7, B:399:0x0725, B:401:0x072a, B:404:0x0731, B:406:0x0739, B:410:0x0748, B:422:0x0790, B:424:0x0798, B:413:0x074f, B:414:0x075c, B:416:0x0760, B:417:0x0776, B:407:0x073c, B:420:0x078a, B:427:0x079f, B:432:0x07ab, B:430:0x07a5, B:251:0x0431, B:253:0x0435, B:265:0x046f, B:267:0x0477, B:292:0x054a, B:294:0x054e, B:297:0x0555, B:299:0x0559, B:301:0x055d, B:303:0x0564, B:305:0x0568, B:307:0x056e, B:309:0x0578, B:310:0x059f, B:315:0x05a7, B:317:0x05b3, B:319:0x05b9, B:321:0x05bf, B:322:0x05c2, B:326:0x05c9, B:329:0x05db, B:331:0x05e1, B:332:0x05e4, B:334:0x05ea, B:336:0x05ee, B:338:0x05fe, B:355:0x0663, B:343:0x0618, B:344:0x061c, B:346:0x0622, B:348:0x0632, B:350:0x0638, B:352:0x0640, B:353:0x0649, B:354:0x065c, B:302:0x0561, B:268:0x047e, B:270:0x0482, B:278:0x04dc, B:280:0x04e0, B:283:0x04fa, B:287:0x0506, B:289:0x053c, B:290:0x053e, B:286:0x0501, B:282:0x04e7, B:272:0x0489, B:275:0x049a, B:277:0x04cb, B:254:0x043a, B:256:0x0440, B:258:0x0446, B:260:0x0454, B:262:0x0458, B:264:0x0463, B:459:0x0803, B:463:0x080a, B:465:0x0811, B:467:0x0819, B:469:0x081e, B:470:0x0824, B:473:0x082b, B:475:0x082f, B:477:0x0846, B:478:0x0852), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04e0 A[Catch: IOException -> 0x0864, kp2 -> 0x086a, RuntimeException -> 0x0870, TryCatch #8 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:122:0x019b, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:151:0x0216, B:152:0x021b, B:160:0x0262, B:162:0x0266, B:164:0x026a, B:165:0x026f, B:167:0x0279, B:170:0x0284, B:171:0x02ac, B:173:0x02b0, B:177:0x02bb, B:178:0x02be, B:179:0x02ca, B:183:0x02d9, B:185:0x02df, B:186:0x02f0, B:188:0x02f4, B:190:0x0302, B:192:0x0314, B:196:0x0323, B:198:0x0328, B:199:0x033d, B:153:0x0233, B:155:0x023b, B:157:0x0241, B:158:0x0246, B:201:0x0347, B:202:0x0352, B:209:0x035d, B:210:0x035e, B:212:0x0362, B:214:0x036a, B:216:0x0374, B:215:0x036f, B:218:0x0380, B:220:0x0388, B:221:0x0391, B:223:0x0397, B:224:0x03b5, B:228:0x03be, B:234:0x03e0, B:235:0x03ed, B:243:0x03fd, B:246:0x040d, B:247:0x041e, B:248:0x041f, B:250:0x0429, B:356:0x066d, B:358:0x0673, B:360:0x067c, B:362:0x0697, B:364:0x06a2, B:368:0x06ab, B:370:0x06b1, B:376:0x06bd, B:381:0x06c7, B:383:0x06ce, B:384:0x06d1, B:386:0x06d5, B:388:0x06e1, B:389:0x06f4, B:393:0x070e, B:395:0x0716, B:397:0x071c, B:398:0x0720, B:433:0x07b5, B:435:0x07ba, B:437:0x07c0, B:438:0x07c8, B:440:0x07cc, B:444:0x07d6, B:446:0x07da, B:448:0x07e0, B:457:0x07fd, B:442:0x07d1, B:449:0x07e4, B:451:0x07e9, B:453:0x07ed, B:455:0x07f3, B:456:0x07f7, B:399:0x0725, B:401:0x072a, B:404:0x0731, B:406:0x0739, B:410:0x0748, B:422:0x0790, B:424:0x0798, B:413:0x074f, B:414:0x075c, B:416:0x0760, B:417:0x0776, B:407:0x073c, B:420:0x078a, B:427:0x079f, B:432:0x07ab, B:430:0x07a5, B:251:0x0431, B:253:0x0435, B:265:0x046f, B:267:0x0477, B:292:0x054a, B:294:0x054e, B:297:0x0555, B:299:0x0559, B:301:0x055d, B:303:0x0564, B:305:0x0568, B:307:0x056e, B:309:0x0578, B:310:0x059f, B:315:0x05a7, B:317:0x05b3, B:319:0x05b9, B:321:0x05bf, B:322:0x05c2, B:326:0x05c9, B:329:0x05db, B:331:0x05e1, B:332:0x05e4, B:334:0x05ea, B:336:0x05ee, B:338:0x05fe, B:355:0x0663, B:343:0x0618, B:344:0x061c, B:346:0x0622, B:348:0x0632, B:350:0x0638, B:352:0x0640, B:353:0x0649, B:354:0x065c, B:302:0x0561, B:268:0x047e, B:270:0x0482, B:278:0x04dc, B:280:0x04e0, B:283:0x04fa, B:287:0x0506, B:289:0x053c, B:290:0x053e, B:286:0x0501, B:282:0x04e7, B:272:0x0489, B:275:0x049a, B:277:0x04cb, B:254:0x043a, B:256:0x0440, B:258:0x0446, B:260:0x0454, B:262:0x0458, B:264:0x0463, B:459:0x0803, B:463:0x080a, B:465:0x0811, B:467:0x0819, B:469:0x081e, B:470:0x0824, B:473:0x082b, B:475:0x082f, B:477:0x0846, B:478:0x0852), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04e7 A[Catch: IOException -> 0x0864, kp2 -> 0x086a, RuntimeException -> 0x0870, TryCatch #8 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:122:0x019b, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:151:0x0216, B:152:0x021b, B:160:0x0262, B:162:0x0266, B:164:0x026a, B:165:0x026f, B:167:0x0279, B:170:0x0284, B:171:0x02ac, B:173:0x02b0, B:177:0x02bb, B:178:0x02be, B:179:0x02ca, B:183:0x02d9, B:185:0x02df, B:186:0x02f0, B:188:0x02f4, B:190:0x0302, B:192:0x0314, B:196:0x0323, B:198:0x0328, B:199:0x033d, B:153:0x0233, B:155:0x023b, B:157:0x0241, B:158:0x0246, B:201:0x0347, B:202:0x0352, B:209:0x035d, B:210:0x035e, B:212:0x0362, B:214:0x036a, B:216:0x0374, B:215:0x036f, B:218:0x0380, B:220:0x0388, B:221:0x0391, B:223:0x0397, B:224:0x03b5, B:228:0x03be, B:234:0x03e0, B:235:0x03ed, B:243:0x03fd, B:246:0x040d, B:247:0x041e, B:248:0x041f, B:250:0x0429, B:356:0x066d, B:358:0x0673, B:360:0x067c, B:362:0x0697, B:364:0x06a2, B:368:0x06ab, B:370:0x06b1, B:376:0x06bd, B:381:0x06c7, B:383:0x06ce, B:384:0x06d1, B:386:0x06d5, B:388:0x06e1, B:389:0x06f4, B:393:0x070e, B:395:0x0716, B:397:0x071c, B:398:0x0720, B:433:0x07b5, B:435:0x07ba, B:437:0x07c0, B:438:0x07c8, B:440:0x07cc, B:444:0x07d6, B:446:0x07da, B:448:0x07e0, B:457:0x07fd, B:442:0x07d1, B:449:0x07e4, B:451:0x07e9, B:453:0x07ed, B:455:0x07f3, B:456:0x07f7, B:399:0x0725, B:401:0x072a, B:404:0x0731, B:406:0x0739, B:410:0x0748, B:422:0x0790, B:424:0x0798, B:413:0x074f, B:414:0x075c, B:416:0x0760, B:417:0x0776, B:407:0x073c, B:420:0x078a, B:427:0x079f, B:432:0x07ab, B:430:0x07a5, B:251:0x0431, B:253:0x0435, B:265:0x046f, B:267:0x0477, B:292:0x054a, B:294:0x054e, B:297:0x0555, B:299:0x0559, B:301:0x055d, B:303:0x0564, B:305:0x0568, B:307:0x056e, B:309:0x0578, B:310:0x059f, B:315:0x05a7, B:317:0x05b3, B:319:0x05b9, B:321:0x05bf, B:322:0x05c2, B:326:0x05c9, B:329:0x05db, B:331:0x05e1, B:332:0x05e4, B:334:0x05ea, B:336:0x05ee, B:338:0x05fe, B:355:0x0663, B:343:0x0618, B:344:0x061c, B:346:0x0622, B:348:0x0632, B:350:0x0638, B:352:0x0640, B:353:0x0649, B:354:0x065c, B:302:0x0561, B:268:0x047e, B:270:0x0482, B:278:0x04dc, B:280:0x04e0, B:283:0x04fa, B:287:0x0506, B:289:0x053c, B:290:0x053e, B:286:0x0501, B:282:0x04e7, B:272:0x0489, B:275:0x049a, B:277:0x04cb, B:254:0x043a, B:256:0x0440, B:258:0x0446, B:260:0x0454, B:262:0x0458, B:264:0x0463, B:459:0x0803, B:463:0x080a, B:465:0x0811, B:467:0x0819, B:469:0x081e, B:470:0x0824, B:473:0x082b, B:475:0x082f, B:477:0x0846, B:478:0x0852), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0501 A[Catch: IOException -> 0x0864, kp2 -> 0x086a, RuntimeException -> 0x0870, TryCatch #8 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:122:0x019b, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:151:0x0216, B:152:0x021b, B:160:0x0262, B:162:0x0266, B:164:0x026a, B:165:0x026f, B:167:0x0279, B:170:0x0284, B:171:0x02ac, B:173:0x02b0, B:177:0x02bb, B:178:0x02be, B:179:0x02ca, B:183:0x02d9, B:185:0x02df, B:186:0x02f0, B:188:0x02f4, B:190:0x0302, B:192:0x0314, B:196:0x0323, B:198:0x0328, B:199:0x033d, B:153:0x0233, B:155:0x023b, B:157:0x0241, B:158:0x0246, B:201:0x0347, B:202:0x0352, B:209:0x035d, B:210:0x035e, B:212:0x0362, B:214:0x036a, B:216:0x0374, B:215:0x036f, B:218:0x0380, B:220:0x0388, B:221:0x0391, B:223:0x0397, B:224:0x03b5, B:228:0x03be, B:234:0x03e0, B:235:0x03ed, B:243:0x03fd, B:246:0x040d, B:247:0x041e, B:248:0x041f, B:250:0x0429, B:356:0x066d, B:358:0x0673, B:360:0x067c, B:362:0x0697, B:364:0x06a2, B:368:0x06ab, B:370:0x06b1, B:376:0x06bd, B:381:0x06c7, B:383:0x06ce, B:384:0x06d1, B:386:0x06d5, B:388:0x06e1, B:389:0x06f4, B:393:0x070e, B:395:0x0716, B:397:0x071c, B:398:0x0720, B:433:0x07b5, B:435:0x07ba, B:437:0x07c0, B:438:0x07c8, B:440:0x07cc, B:444:0x07d6, B:446:0x07da, B:448:0x07e0, B:457:0x07fd, B:442:0x07d1, B:449:0x07e4, B:451:0x07e9, B:453:0x07ed, B:455:0x07f3, B:456:0x07f7, B:399:0x0725, B:401:0x072a, B:404:0x0731, B:406:0x0739, B:410:0x0748, B:422:0x0790, B:424:0x0798, B:413:0x074f, B:414:0x075c, B:416:0x0760, B:417:0x0776, B:407:0x073c, B:420:0x078a, B:427:0x079f, B:432:0x07ab, B:430:0x07a5, B:251:0x0431, B:253:0x0435, B:265:0x046f, B:267:0x0477, B:292:0x054a, B:294:0x054e, B:297:0x0555, B:299:0x0559, B:301:0x055d, B:303:0x0564, B:305:0x0568, B:307:0x056e, B:309:0x0578, B:310:0x059f, B:315:0x05a7, B:317:0x05b3, B:319:0x05b9, B:321:0x05bf, B:322:0x05c2, B:326:0x05c9, B:329:0x05db, B:331:0x05e1, B:332:0x05e4, B:334:0x05ea, B:336:0x05ee, B:338:0x05fe, B:355:0x0663, B:343:0x0618, B:344:0x061c, B:346:0x0622, B:348:0x0632, B:350:0x0638, B:352:0x0640, B:353:0x0649, B:354:0x065c, B:302:0x0561, B:268:0x047e, B:270:0x0482, B:278:0x04dc, B:280:0x04e0, B:283:0x04fa, B:287:0x0506, B:289:0x053c, B:290:0x053e, B:286:0x0501, B:282:0x04e7, B:272:0x0489, B:275:0x049a, B:277:0x04cb, B:254:0x043a, B:256:0x0440, B:258:0x0446, B:260:0x0454, B:262:0x0458, B:264:0x0463, B:459:0x0803, B:463:0x080a, B:465:0x0811, B:467:0x0819, B:469:0x081e, B:470:0x0824, B:473:0x082b, B:475:0x082f, B:477:0x0846, B:478:0x0852), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x053c A[Catch: IOException -> 0x0864, kp2 -> 0x086a, RuntimeException -> 0x0870, TryCatch #8 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:122:0x019b, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:151:0x0216, B:152:0x021b, B:160:0x0262, B:162:0x0266, B:164:0x026a, B:165:0x026f, B:167:0x0279, B:170:0x0284, B:171:0x02ac, B:173:0x02b0, B:177:0x02bb, B:178:0x02be, B:179:0x02ca, B:183:0x02d9, B:185:0x02df, B:186:0x02f0, B:188:0x02f4, B:190:0x0302, B:192:0x0314, B:196:0x0323, B:198:0x0328, B:199:0x033d, B:153:0x0233, B:155:0x023b, B:157:0x0241, B:158:0x0246, B:201:0x0347, B:202:0x0352, B:209:0x035d, B:210:0x035e, B:212:0x0362, B:214:0x036a, B:216:0x0374, B:215:0x036f, B:218:0x0380, B:220:0x0388, B:221:0x0391, B:223:0x0397, B:224:0x03b5, B:228:0x03be, B:234:0x03e0, B:235:0x03ed, B:243:0x03fd, B:246:0x040d, B:247:0x041e, B:248:0x041f, B:250:0x0429, B:356:0x066d, B:358:0x0673, B:360:0x067c, B:362:0x0697, B:364:0x06a2, B:368:0x06ab, B:370:0x06b1, B:376:0x06bd, B:381:0x06c7, B:383:0x06ce, B:384:0x06d1, B:386:0x06d5, B:388:0x06e1, B:389:0x06f4, B:393:0x070e, B:395:0x0716, B:397:0x071c, B:398:0x0720, B:433:0x07b5, B:435:0x07ba, B:437:0x07c0, B:438:0x07c8, B:440:0x07cc, B:444:0x07d6, B:446:0x07da, B:448:0x07e0, B:457:0x07fd, B:442:0x07d1, B:449:0x07e4, B:451:0x07e9, B:453:0x07ed, B:455:0x07f3, B:456:0x07f7, B:399:0x0725, B:401:0x072a, B:404:0x0731, B:406:0x0739, B:410:0x0748, B:422:0x0790, B:424:0x0798, B:413:0x074f, B:414:0x075c, B:416:0x0760, B:417:0x0776, B:407:0x073c, B:420:0x078a, B:427:0x079f, B:432:0x07ab, B:430:0x07a5, B:251:0x0431, B:253:0x0435, B:265:0x046f, B:267:0x0477, B:292:0x054a, B:294:0x054e, B:297:0x0555, B:299:0x0559, B:301:0x055d, B:303:0x0564, B:305:0x0568, B:307:0x056e, B:309:0x0578, B:310:0x059f, B:315:0x05a7, B:317:0x05b3, B:319:0x05b9, B:321:0x05bf, B:322:0x05c2, B:326:0x05c9, B:329:0x05db, B:331:0x05e1, B:332:0x05e4, B:334:0x05ea, B:336:0x05ee, B:338:0x05fe, B:355:0x0663, B:343:0x0618, B:344:0x061c, B:346:0x0622, B:348:0x0632, B:350:0x0638, B:352:0x0640, B:353:0x0649, B:354:0x065c, B:302:0x0561, B:268:0x047e, B:270:0x0482, B:278:0x04dc, B:280:0x04e0, B:283:0x04fa, B:287:0x0506, B:289:0x053c, B:290:0x053e, B:286:0x0501, B:282:0x04e7, B:272:0x0489, B:275:0x049a, B:277:0x04cb, B:254:0x043a, B:256:0x0440, B:258:0x0446, B:260:0x0454, B:262:0x0458, B:264:0x0463, B:459:0x0803, B:463:0x080a, B:465:0x0811, B:467:0x0819, B:469:0x081e, B:470:0x0824, B:473:0x082b, B:475:0x082f, B:477:0x0846, B:478:0x0852), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x054e A[Catch: IOException -> 0x0864, kp2 -> 0x086a, RuntimeException -> 0x0870, TryCatch #8 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:122:0x019b, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:151:0x0216, B:152:0x021b, B:160:0x0262, B:162:0x0266, B:164:0x026a, B:165:0x026f, B:167:0x0279, B:170:0x0284, B:171:0x02ac, B:173:0x02b0, B:177:0x02bb, B:178:0x02be, B:179:0x02ca, B:183:0x02d9, B:185:0x02df, B:186:0x02f0, B:188:0x02f4, B:190:0x0302, B:192:0x0314, B:196:0x0323, B:198:0x0328, B:199:0x033d, B:153:0x0233, B:155:0x023b, B:157:0x0241, B:158:0x0246, B:201:0x0347, B:202:0x0352, B:209:0x035d, B:210:0x035e, B:212:0x0362, B:214:0x036a, B:216:0x0374, B:215:0x036f, B:218:0x0380, B:220:0x0388, B:221:0x0391, B:223:0x0397, B:224:0x03b5, B:228:0x03be, B:234:0x03e0, B:235:0x03ed, B:243:0x03fd, B:246:0x040d, B:247:0x041e, B:248:0x041f, B:250:0x0429, B:356:0x066d, B:358:0x0673, B:360:0x067c, B:362:0x0697, B:364:0x06a2, B:368:0x06ab, B:370:0x06b1, B:376:0x06bd, B:381:0x06c7, B:383:0x06ce, B:384:0x06d1, B:386:0x06d5, B:388:0x06e1, B:389:0x06f4, B:393:0x070e, B:395:0x0716, B:397:0x071c, B:398:0x0720, B:433:0x07b5, B:435:0x07ba, B:437:0x07c0, B:438:0x07c8, B:440:0x07cc, B:444:0x07d6, B:446:0x07da, B:448:0x07e0, B:457:0x07fd, B:442:0x07d1, B:449:0x07e4, B:451:0x07e9, B:453:0x07ed, B:455:0x07f3, B:456:0x07f7, B:399:0x0725, B:401:0x072a, B:404:0x0731, B:406:0x0739, B:410:0x0748, B:422:0x0790, B:424:0x0798, B:413:0x074f, B:414:0x075c, B:416:0x0760, B:417:0x0776, B:407:0x073c, B:420:0x078a, B:427:0x079f, B:432:0x07ab, B:430:0x07a5, B:251:0x0431, B:253:0x0435, B:265:0x046f, B:267:0x0477, B:292:0x054a, B:294:0x054e, B:297:0x0555, B:299:0x0559, B:301:0x055d, B:303:0x0564, B:305:0x0568, B:307:0x056e, B:309:0x0578, B:310:0x059f, B:315:0x05a7, B:317:0x05b3, B:319:0x05b9, B:321:0x05bf, B:322:0x05c2, B:326:0x05c9, B:329:0x05db, B:331:0x05e1, B:332:0x05e4, B:334:0x05ea, B:336:0x05ee, B:338:0x05fe, B:355:0x0663, B:343:0x0618, B:344:0x061c, B:346:0x0622, B:348:0x0632, B:350:0x0638, B:352:0x0640, B:353:0x0649, B:354:0x065c, B:302:0x0561, B:268:0x047e, B:270:0x0482, B:278:0x04dc, B:280:0x04e0, B:283:0x04fa, B:287:0x0506, B:289:0x053c, B:290:0x053e, B:286:0x0501, B:282:0x04e7, B:272:0x0489, B:275:0x049a, B:277:0x04cb, B:254:0x043a, B:256:0x0440, B:258:0x0446, B:260:0x0454, B:262:0x0458, B:264:0x0463, B:459:0x0803, B:463:0x080a, B:465:0x0811, B:467:0x0819, B:469:0x081e, B:470:0x0824, B:473:0x082b, B:475:0x082f, B:477:0x0846, B:478:0x0852), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0568 A[Catch: IOException -> 0x0864, kp2 -> 0x086a, RuntimeException -> 0x0870, LOOP:9: B:305:0x0568->B:309:0x0578, LOOP_START, TryCatch #8 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:122:0x019b, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:151:0x0216, B:152:0x021b, B:160:0x0262, B:162:0x0266, B:164:0x026a, B:165:0x026f, B:167:0x0279, B:170:0x0284, B:171:0x02ac, B:173:0x02b0, B:177:0x02bb, B:178:0x02be, B:179:0x02ca, B:183:0x02d9, B:185:0x02df, B:186:0x02f0, B:188:0x02f4, B:190:0x0302, B:192:0x0314, B:196:0x0323, B:198:0x0328, B:199:0x033d, B:153:0x0233, B:155:0x023b, B:157:0x0241, B:158:0x0246, B:201:0x0347, B:202:0x0352, B:209:0x035d, B:210:0x035e, B:212:0x0362, B:214:0x036a, B:216:0x0374, B:215:0x036f, B:218:0x0380, B:220:0x0388, B:221:0x0391, B:223:0x0397, B:224:0x03b5, B:228:0x03be, B:234:0x03e0, B:235:0x03ed, B:243:0x03fd, B:246:0x040d, B:247:0x041e, B:248:0x041f, B:250:0x0429, B:356:0x066d, B:358:0x0673, B:360:0x067c, B:362:0x0697, B:364:0x06a2, B:368:0x06ab, B:370:0x06b1, B:376:0x06bd, B:381:0x06c7, B:383:0x06ce, B:384:0x06d1, B:386:0x06d5, B:388:0x06e1, B:389:0x06f4, B:393:0x070e, B:395:0x0716, B:397:0x071c, B:398:0x0720, B:433:0x07b5, B:435:0x07ba, B:437:0x07c0, B:438:0x07c8, B:440:0x07cc, B:444:0x07d6, B:446:0x07da, B:448:0x07e0, B:457:0x07fd, B:442:0x07d1, B:449:0x07e4, B:451:0x07e9, B:453:0x07ed, B:455:0x07f3, B:456:0x07f7, B:399:0x0725, B:401:0x072a, B:404:0x0731, B:406:0x0739, B:410:0x0748, B:422:0x0790, B:424:0x0798, B:413:0x074f, B:414:0x075c, B:416:0x0760, B:417:0x0776, B:407:0x073c, B:420:0x078a, B:427:0x079f, B:432:0x07ab, B:430:0x07a5, B:251:0x0431, B:253:0x0435, B:265:0x046f, B:267:0x0477, B:292:0x054a, B:294:0x054e, B:297:0x0555, B:299:0x0559, B:301:0x055d, B:303:0x0564, B:305:0x0568, B:307:0x056e, B:309:0x0578, B:310:0x059f, B:315:0x05a7, B:317:0x05b3, B:319:0x05b9, B:321:0x05bf, B:322:0x05c2, B:326:0x05c9, B:329:0x05db, B:331:0x05e1, B:332:0x05e4, B:334:0x05ea, B:336:0x05ee, B:338:0x05fe, B:355:0x0663, B:343:0x0618, B:344:0x061c, B:346:0x0622, B:348:0x0632, B:350:0x0638, B:352:0x0640, B:353:0x0649, B:354:0x065c, B:302:0x0561, B:268:0x047e, B:270:0x0482, B:278:0x04dc, B:280:0x04e0, B:283:0x04fa, B:287:0x0506, B:289:0x053c, B:290:0x053e, B:286:0x0501, B:282:0x04e7, B:272:0x0489, B:275:0x049a, B:277:0x04cb, B:254:0x043a, B:256:0x0440, B:258:0x0446, B:260:0x0454, B:262:0x0458, B:264:0x0463, B:459:0x0803, B:463:0x080a, B:465:0x0811, B:467:0x0819, B:469:0x081e, B:470:0x0824, B:473:0x082b, B:475:0x082f, B:477:0x0846, B:478:0x0852), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06bd A[Catch: IOException -> 0x0864, kp2 -> 0x086a, RuntimeException -> 0x0870, TryCatch #8 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:122:0x019b, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:151:0x0216, B:152:0x021b, B:160:0x0262, B:162:0x0266, B:164:0x026a, B:165:0x026f, B:167:0x0279, B:170:0x0284, B:171:0x02ac, B:173:0x02b0, B:177:0x02bb, B:178:0x02be, B:179:0x02ca, B:183:0x02d9, B:185:0x02df, B:186:0x02f0, B:188:0x02f4, B:190:0x0302, B:192:0x0314, B:196:0x0323, B:198:0x0328, B:199:0x033d, B:153:0x0233, B:155:0x023b, B:157:0x0241, B:158:0x0246, B:201:0x0347, B:202:0x0352, B:209:0x035d, B:210:0x035e, B:212:0x0362, B:214:0x036a, B:216:0x0374, B:215:0x036f, B:218:0x0380, B:220:0x0388, B:221:0x0391, B:223:0x0397, B:224:0x03b5, B:228:0x03be, B:234:0x03e0, B:235:0x03ed, B:243:0x03fd, B:246:0x040d, B:247:0x041e, B:248:0x041f, B:250:0x0429, B:356:0x066d, B:358:0x0673, B:360:0x067c, B:362:0x0697, B:364:0x06a2, B:368:0x06ab, B:370:0x06b1, B:376:0x06bd, B:381:0x06c7, B:383:0x06ce, B:384:0x06d1, B:386:0x06d5, B:388:0x06e1, B:389:0x06f4, B:393:0x070e, B:395:0x0716, B:397:0x071c, B:398:0x0720, B:433:0x07b5, B:435:0x07ba, B:437:0x07c0, B:438:0x07c8, B:440:0x07cc, B:444:0x07d6, B:446:0x07da, B:448:0x07e0, B:457:0x07fd, B:442:0x07d1, B:449:0x07e4, B:451:0x07e9, B:453:0x07ed, B:455:0x07f3, B:456:0x07f7, B:399:0x0725, B:401:0x072a, B:404:0x0731, B:406:0x0739, B:410:0x0748, B:422:0x0790, B:424:0x0798, B:413:0x074f, B:414:0x075c, B:416:0x0760, B:417:0x0776, B:407:0x073c, B:420:0x078a, B:427:0x079f, B:432:0x07ab, B:430:0x07a5, B:251:0x0431, B:253:0x0435, B:265:0x046f, B:267:0x0477, B:292:0x054a, B:294:0x054e, B:297:0x0555, B:299:0x0559, B:301:0x055d, B:303:0x0564, B:305:0x0568, B:307:0x056e, B:309:0x0578, B:310:0x059f, B:315:0x05a7, B:317:0x05b3, B:319:0x05b9, B:321:0x05bf, B:322:0x05c2, B:326:0x05c9, B:329:0x05db, B:331:0x05e1, B:332:0x05e4, B:334:0x05ea, B:336:0x05ee, B:338:0x05fe, B:355:0x0663, B:343:0x0618, B:344:0x061c, B:346:0x0622, B:348:0x0632, B:350:0x0638, B:352:0x0640, B:353:0x0649, B:354:0x065c, B:302:0x0561, B:268:0x047e, B:270:0x0482, B:278:0x04dc, B:280:0x04e0, B:283:0x04fa, B:287:0x0506, B:289:0x053c, B:290:0x053e, B:286:0x0501, B:282:0x04e7, B:272:0x0489, B:275:0x049a, B:277:0x04cb, B:254:0x043a, B:256:0x0440, B:258:0x0446, B:260:0x0454, B:262:0x0458, B:264:0x0463, B:459:0x0803, B:463:0x080a, B:465:0x0811, B:467:0x0819, B:469:0x081e, B:470:0x0824, B:473:0x082b, B:475:0x082f, B:477:0x0846, B:478:0x0852), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0798 A[Catch: IOException -> 0x0864, kp2 -> 0x086a, RuntimeException -> 0x0870, TryCatch #8 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:122:0x019b, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:151:0x0216, B:152:0x021b, B:160:0x0262, B:162:0x0266, B:164:0x026a, B:165:0x026f, B:167:0x0279, B:170:0x0284, B:171:0x02ac, B:173:0x02b0, B:177:0x02bb, B:178:0x02be, B:179:0x02ca, B:183:0x02d9, B:185:0x02df, B:186:0x02f0, B:188:0x02f4, B:190:0x0302, B:192:0x0314, B:196:0x0323, B:198:0x0328, B:199:0x033d, B:153:0x0233, B:155:0x023b, B:157:0x0241, B:158:0x0246, B:201:0x0347, B:202:0x0352, B:209:0x035d, B:210:0x035e, B:212:0x0362, B:214:0x036a, B:216:0x0374, B:215:0x036f, B:218:0x0380, B:220:0x0388, B:221:0x0391, B:223:0x0397, B:224:0x03b5, B:228:0x03be, B:234:0x03e0, B:235:0x03ed, B:243:0x03fd, B:246:0x040d, B:247:0x041e, B:248:0x041f, B:250:0x0429, B:356:0x066d, B:358:0x0673, B:360:0x067c, B:362:0x0697, B:364:0x06a2, B:368:0x06ab, B:370:0x06b1, B:376:0x06bd, B:381:0x06c7, B:383:0x06ce, B:384:0x06d1, B:386:0x06d5, B:388:0x06e1, B:389:0x06f4, B:393:0x070e, B:395:0x0716, B:397:0x071c, B:398:0x0720, B:433:0x07b5, B:435:0x07ba, B:437:0x07c0, B:438:0x07c8, B:440:0x07cc, B:444:0x07d6, B:446:0x07da, B:448:0x07e0, B:457:0x07fd, B:442:0x07d1, B:449:0x07e4, B:451:0x07e9, B:453:0x07ed, B:455:0x07f3, B:456:0x07f7, B:399:0x0725, B:401:0x072a, B:404:0x0731, B:406:0x0739, B:410:0x0748, B:422:0x0790, B:424:0x0798, B:413:0x074f, B:414:0x075c, B:416:0x0760, B:417:0x0776, B:407:0x073c, B:420:0x078a, B:427:0x079f, B:432:0x07ab, B:430:0x07a5, B:251:0x0431, B:253:0x0435, B:265:0x046f, B:267:0x0477, B:292:0x054a, B:294:0x054e, B:297:0x0555, B:299:0x0559, B:301:0x055d, B:303:0x0564, B:305:0x0568, B:307:0x056e, B:309:0x0578, B:310:0x059f, B:315:0x05a7, B:317:0x05b3, B:319:0x05b9, B:321:0x05bf, B:322:0x05c2, B:326:0x05c9, B:329:0x05db, B:331:0x05e1, B:332:0x05e4, B:334:0x05ea, B:336:0x05ee, B:338:0x05fe, B:355:0x0663, B:343:0x0618, B:344:0x061c, B:346:0x0622, B:348:0x0632, B:350:0x0638, B:352:0x0640, B:353:0x0649, B:354:0x065c, B:302:0x0561, B:268:0x047e, B:270:0x0482, B:278:0x04dc, B:280:0x04e0, B:283:0x04fa, B:287:0x0506, B:289:0x053c, B:290:0x053e, B:286:0x0501, B:282:0x04e7, B:272:0x0489, B:275:0x049a, B:277:0x04cb, B:254:0x043a, B:256:0x0440, B:258:0x0446, B:260:0x0454, B:262:0x0458, B:264:0x0463, B:459:0x0803, B:463:0x080a, B:465:0x0811, B:467:0x0819, B:469:0x081e, B:470:0x0824, B:473:0x082b, B:475:0x082f, B:477:0x0846, B:478:0x0852), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x07ba A[Catch: IOException -> 0x0864, kp2 -> 0x086a, RuntimeException -> 0x0870, TryCatch #8 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:122:0x019b, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:151:0x0216, B:152:0x021b, B:160:0x0262, B:162:0x0266, B:164:0x026a, B:165:0x026f, B:167:0x0279, B:170:0x0284, B:171:0x02ac, B:173:0x02b0, B:177:0x02bb, B:178:0x02be, B:179:0x02ca, B:183:0x02d9, B:185:0x02df, B:186:0x02f0, B:188:0x02f4, B:190:0x0302, B:192:0x0314, B:196:0x0323, B:198:0x0328, B:199:0x033d, B:153:0x0233, B:155:0x023b, B:157:0x0241, B:158:0x0246, B:201:0x0347, B:202:0x0352, B:209:0x035d, B:210:0x035e, B:212:0x0362, B:214:0x036a, B:216:0x0374, B:215:0x036f, B:218:0x0380, B:220:0x0388, B:221:0x0391, B:223:0x0397, B:224:0x03b5, B:228:0x03be, B:234:0x03e0, B:235:0x03ed, B:243:0x03fd, B:246:0x040d, B:247:0x041e, B:248:0x041f, B:250:0x0429, B:356:0x066d, B:358:0x0673, B:360:0x067c, B:362:0x0697, B:364:0x06a2, B:368:0x06ab, B:370:0x06b1, B:376:0x06bd, B:381:0x06c7, B:383:0x06ce, B:384:0x06d1, B:386:0x06d5, B:388:0x06e1, B:389:0x06f4, B:393:0x070e, B:395:0x0716, B:397:0x071c, B:398:0x0720, B:433:0x07b5, B:435:0x07ba, B:437:0x07c0, B:438:0x07c8, B:440:0x07cc, B:444:0x07d6, B:446:0x07da, B:448:0x07e0, B:457:0x07fd, B:442:0x07d1, B:449:0x07e4, B:451:0x07e9, B:453:0x07ed, B:455:0x07f3, B:456:0x07f7, B:399:0x0725, B:401:0x072a, B:404:0x0731, B:406:0x0739, B:410:0x0748, B:422:0x0790, B:424:0x0798, B:413:0x074f, B:414:0x075c, B:416:0x0760, B:417:0x0776, B:407:0x073c, B:420:0x078a, B:427:0x079f, B:432:0x07ab, B:430:0x07a5, B:251:0x0431, B:253:0x0435, B:265:0x046f, B:267:0x0477, B:292:0x054a, B:294:0x054e, B:297:0x0555, B:299:0x0559, B:301:0x055d, B:303:0x0564, B:305:0x0568, B:307:0x056e, B:309:0x0578, B:310:0x059f, B:315:0x05a7, B:317:0x05b3, B:319:0x05b9, B:321:0x05bf, B:322:0x05c2, B:326:0x05c9, B:329:0x05db, B:331:0x05e1, B:332:0x05e4, B:334:0x05ea, B:336:0x05ee, B:338:0x05fe, B:355:0x0663, B:343:0x0618, B:344:0x061c, B:346:0x0622, B:348:0x0632, B:350:0x0638, B:352:0x0640, B:353:0x0649, B:354:0x065c, B:302:0x0561, B:268:0x047e, B:270:0x0482, B:278:0x04dc, B:280:0x04e0, B:283:0x04fa, B:287:0x0506, B:289:0x053c, B:290:0x053e, B:286:0x0501, B:282:0x04e7, B:272:0x0489, B:275:0x049a, B:277:0x04cb, B:254:0x043a, B:256:0x0440, B:258:0x0446, B:260:0x0454, B:262:0x0458, B:264:0x0463, B:459:0x0803, B:463:0x080a, B:465:0x0811, B:467:0x0819, B:469:0x081e, B:470:0x0824, B:473:0x082b, B:475:0x082f, B:477:0x0846, B:478:0x0852), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x07e9 A[Catch: IOException -> 0x0864, kp2 -> 0x086a, RuntimeException -> 0x0870, TryCatch #8 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:122:0x019b, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:151:0x0216, B:152:0x021b, B:160:0x0262, B:162:0x0266, B:164:0x026a, B:165:0x026f, B:167:0x0279, B:170:0x0284, B:171:0x02ac, B:173:0x02b0, B:177:0x02bb, B:178:0x02be, B:179:0x02ca, B:183:0x02d9, B:185:0x02df, B:186:0x02f0, B:188:0x02f4, B:190:0x0302, B:192:0x0314, B:196:0x0323, B:198:0x0328, B:199:0x033d, B:153:0x0233, B:155:0x023b, B:157:0x0241, B:158:0x0246, B:201:0x0347, B:202:0x0352, B:209:0x035d, B:210:0x035e, B:212:0x0362, B:214:0x036a, B:216:0x0374, B:215:0x036f, B:218:0x0380, B:220:0x0388, B:221:0x0391, B:223:0x0397, B:224:0x03b5, B:228:0x03be, B:234:0x03e0, B:235:0x03ed, B:243:0x03fd, B:246:0x040d, B:247:0x041e, B:248:0x041f, B:250:0x0429, B:356:0x066d, B:358:0x0673, B:360:0x067c, B:362:0x0697, B:364:0x06a2, B:368:0x06ab, B:370:0x06b1, B:376:0x06bd, B:381:0x06c7, B:383:0x06ce, B:384:0x06d1, B:386:0x06d5, B:388:0x06e1, B:389:0x06f4, B:393:0x070e, B:395:0x0716, B:397:0x071c, B:398:0x0720, B:433:0x07b5, B:435:0x07ba, B:437:0x07c0, B:438:0x07c8, B:440:0x07cc, B:444:0x07d6, B:446:0x07da, B:448:0x07e0, B:457:0x07fd, B:442:0x07d1, B:449:0x07e4, B:451:0x07e9, B:453:0x07ed, B:455:0x07f3, B:456:0x07f7, B:399:0x0725, B:401:0x072a, B:404:0x0731, B:406:0x0739, B:410:0x0748, B:422:0x0790, B:424:0x0798, B:413:0x074f, B:414:0x075c, B:416:0x0760, B:417:0x0776, B:407:0x073c, B:420:0x078a, B:427:0x079f, B:432:0x07ab, B:430:0x07a5, B:251:0x0431, B:253:0x0435, B:265:0x046f, B:267:0x0477, B:292:0x054a, B:294:0x054e, B:297:0x0555, B:299:0x0559, B:301:0x055d, B:303:0x0564, B:305:0x0568, B:307:0x056e, B:309:0x0578, B:310:0x059f, B:315:0x05a7, B:317:0x05b3, B:319:0x05b9, B:321:0x05bf, B:322:0x05c2, B:326:0x05c9, B:329:0x05db, B:331:0x05e1, B:332:0x05e4, B:334:0x05ea, B:336:0x05ee, B:338:0x05fe, B:355:0x0663, B:343:0x0618, B:344:0x061c, B:346:0x0622, B:348:0x0632, B:350:0x0638, B:352:0x0640, B:353:0x0649, B:354:0x065c, B:302:0x0561, B:268:0x047e, B:270:0x0482, B:278:0x04dc, B:280:0x04e0, B:283:0x04fa, B:287:0x0506, B:289:0x053c, B:290:0x053e, B:286:0x0501, B:282:0x04e7, B:272:0x0489, B:275:0x049a, B:277:0x04cb, B:254:0x043a, B:256:0x0440, B:258:0x0446, B:260:0x0454, B:262:0x0458, B:264:0x0463, B:459:0x0803, B:463:0x080a, B:465:0x0811, B:467:0x0819, B:469:0x081e, B:470:0x0824, B:473:0x082b, B:475:0x082f, B:477:0x0846, B:478:0x0852), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x07f7 A[Catch: IOException -> 0x0864, kp2 -> 0x086a, RuntimeException -> 0x0870, TryCatch #8 {RuntimeException -> 0x0870, blocks: (B:3:0x0005, B:8:0x001a, B:10:0x0022, B:13:0x0028, B:17:0x002f, B:21:0x0036, B:22:0x0042, B:25:0x0048, B:27:0x004c, B:31:0x0053, B:35:0x005b, B:37:0x006a, B:38:0x006f, B:40:0x0079, B:42:0x007d, B:44:0x0081, B:45:0x0092, B:48:0x0098, B:50:0x009c, B:57:0x00ba, B:64:0x00c8, B:67:0x00cb, B:70:0x00d5, B:74:0x00d9, B:75:0x00da, B:79:0x00e1, B:82:0x00e7, B:85:0x00ef, B:89:0x00f8, B:91:0x0117, B:92:0x011e, B:94:0x0124, B:98:0x0131, B:100:0x013b, B:102:0x013f, B:104:0x0145, B:107:0x014b, B:108:0x0152, B:109:0x0156, B:110:0x015d, B:112:0x0161, B:113:0x0166, B:114:0x0169, B:122:0x019b, B:115:0x0178, B:116:0x017a, B:118:0x017e, B:119:0x0182, B:121:0x018a, B:123:0x01a7, B:127:0x01ae, B:129:0x01b4, B:131:0x01bc, B:133:0x01c0, B:135:0x01c4, B:137:0x01cc, B:140:0x01d1, B:142:0x01e2, B:143:0x01f0, B:145:0x01f4, B:147:0x0204, B:149:0x0208, B:151:0x0216, B:152:0x021b, B:160:0x0262, B:162:0x0266, B:164:0x026a, B:165:0x026f, B:167:0x0279, B:170:0x0284, B:171:0x02ac, B:173:0x02b0, B:177:0x02bb, B:178:0x02be, B:179:0x02ca, B:183:0x02d9, B:185:0x02df, B:186:0x02f0, B:188:0x02f4, B:190:0x0302, B:192:0x0314, B:196:0x0323, B:198:0x0328, B:199:0x033d, B:153:0x0233, B:155:0x023b, B:157:0x0241, B:158:0x0246, B:201:0x0347, B:202:0x0352, B:209:0x035d, B:210:0x035e, B:212:0x0362, B:214:0x036a, B:216:0x0374, B:215:0x036f, B:218:0x0380, B:220:0x0388, B:221:0x0391, B:223:0x0397, B:224:0x03b5, B:228:0x03be, B:234:0x03e0, B:235:0x03ed, B:243:0x03fd, B:246:0x040d, B:247:0x041e, B:248:0x041f, B:250:0x0429, B:356:0x066d, B:358:0x0673, B:360:0x067c, B:362:0x0697, B:364:0x06a2, B:368:0x06ab, B:370:0x06b1, B:376:0x06bd, B:381:0x06c7, B:383:0x06ce, B:384:0x06d1, B:386:0x06d5, B:388:0x06e1, B:389:0x06f4, B:393:0x070e, B:395:0x0716, B:397:0x071c, B:398:0x0720, B:433:0x07b5, B:435:0x07ba, B:437:0x07c0, B:438:0x07c8, B:440:0x07cc, B:444:0x07d6, B:446:0x07da, B:448:0x07e0, B:457:0x07fd, B:442:0x07d1, B:449:0x07e4, B:451:0x07e9, B:453:0x07ed, B:455:0x07f3, B:456:0x07f7, B:399:0x0725, B:401:0x072a, B:404:0x0731, B:406:0x0739, B:410:0x0748, B:422:0x0790, B:424:0x0798, B:413:0x074f, B:414:0x075c, B:416:0x0760, B:417:0x0776, B:407:0x073c, B:420:0x078a, B:427:0x079f, B:432:0x07ab, B:430:0x07a5, B:251:0x0431, B:253:0x0435, B:265:0x046f, B:267:0x0477, B:292:0x054a, B:294:0x054e, B:297:0x0555, B:299:0x0559, B:301:0x055d, B:303:0x0564, B:305:0x0568, B:307:0x056e, B:309:0x0578, B:310:0x059f, B:315:0x05a7, B:317:0x05b3, B:319:0x05b9, B:321:0x05bf, B:322:0x05c2, B:326:0x05c9, B:329:0x05db, B:331:0x05e1, B:332:0x05e4, B:334:0x05ea, B:336:0x05ee, B:338:0x05fe, B:355:0x0663, B:343:0x0618, B:344:0x061c, B:346:0x0622, B:348:0x0632, B:350:0x0638, B:352:0x0640, B:353:0x0649, B:354:0x065c, B:302:0x0561, B:268:0x047e, B:270:0x0482, B:278:0x04dc, B:280:0x04e0, B:283:0x04fa, B:287:0x0506, B:289:0x053c, B:290:0x053e, B:286:0x0501, B:282:0x04e7, B:272:0x0489, B:275:0x049a, B:277:0x04cb, B:254:0x043a, B:256:0x0440, B:258:0x0446, B:260:0x0454, B:262:0x0458, B:264:0x0463, B:459:0x0803, B:463:0x080a, B:465:0x0811, B:467:0x0819, B:469:0x081e, B:470:0x0824, B:473:0x082b, B:475:0x082f, B:477:0x0846, B:478:0x0852), top: B:503:0x0005 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z;
        int i;
        IOException iOException;
        boolean z2;
        int i2;
        kp2 kp2Var;
        int i3;
        Handler handler;
        sp2 sp2Var;
        int m15849f;
        long j;
        sp2 sp2Var2;
        sp2 sp2Var3;
        int i4;
        gx2 gx2Var;
        long j2;
        sp2 sp2Var4;
        gq2[] gq2VarArr;
        boolean m4148k;
        boolean z3;
        Message obtainMessage;
        int i5;
        sp2 sp2Var5;
        np2[] np2VarArr;
        sp2 sp2Var6;
        int i6;
        int i7 = 1;
        try {
            try {
                long j3 = 0;
                try {
                    switch (message.what) {
                        case 0:
                            yv2 yv2Var = (yv2) message.obj;
                            int i8 = message.arg1;
                            this.f3466v.sendEmptyMessage(0);
                            m27186g(true);
                            this.f3459a0.m4158a();
                            if (i8 != 0) {
                                this.f3470z = new tp2(0, -9223372036854775807L);
                            }
                            this.f3436D = yv2Var;
                            yv2Var.mo3168b(this.f3467w, true, this);
                            m27181m(2);
                            this.f3464t.sendEmptyMessage(2);
                            return true;
                        case 1:
                            boolean z4 = message.arg1 != 0;
                            this.f3440H = false;
                            this.f3439G = z4;
                            if (z4) {
                                int i9 = this.f3442J;
                                if (i9 == 3) {
                                    m27180n();
                                    handler = this.f3464t;
                                    i3 = 2;
                                } else {
                                    i3 = 2;
                                    if (i9 == 2) {
                                        handler = this.f3464t;
                                    }
                                }
                                handler.sendEmptyMessage(i3);
                            } else {
                                m27178p();
                                m27177q();
                            }
                            return true;
                        case 2:
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.f3453U == null) {
                                this.f3436D.zza();
                                j = elapsedRealtime;
                            } else {
                                sp2 sp2Var7 = this.f3450R;
                                if (sp2Var7 == null) {
                                    m15849f = this.f3470z.f27941a;
                                } else {
                                    int i10 = sp2Var7.f26486g;
                                    if (!sp2Var7.f26488i && sp2Var7.m10090d() && this.f3453U.mo15851d(i10, this.f3469y, false).f16696c != -9223372036854775807L && ((sp2Var = this.f3452T) == null || this.f3450R.f26482c - sp2Var.f26482c != 100)) {
                                        m15849f = this.f3453U.m15849f(i10, this.f3469y, this.f3468x, this.f3443K);
                                    }
                                    j = elapsedRealtime;
                                    sp2Var2 = this.f3450R;
                                    if (sp2Var2 != null && !sp2Var2.m10090d()) {
                                        if (this.f3450R != null && !this.f3441I) {
                                            m27189c();
                                        }
                                        if (this.f3452T != null) {
                                            while (true) {
                                                sp2 sp2Var8 = this.f3452T;
                                                sp2Var3 = this.f3451S;
                                                if (sp2Var8 != sp2Var3 && this.f3449Q >= sp2Var8.f26491l.f26485f) {
                                                    sp2Var8.m10091c();
                                                    m27182l(this.f3452T.f26491l);
                                                    sp2 sp2Var9 = this.f3452T;
                                                    this.f3470z = new tp2(sp2Var9.f26486g, sp2Var9.f26487h);
                                                    m27177q();
                                                    this.f3466v.obtainMessage(5, this.f3470z).sendToTarget();
                                                }
                                            }
                                            if (sp2Var3.f26488i) {
                                                for (int i11 = 0; i11 < 2; i11++) {
                                                    gq2 gq2Var = this.f3460p[i11];
                                                    iw2 iw2Var = this.f3451S.f26483d[i11];
                                                    if (iw2Var != null && gq2Var.zzh() == iw2Var && gq2Var.zzA()) {
                                                        gq2Var.zzv();
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    if (i4 < 2) {
                                                        gq2 gq2Var2 = this.f3460p[i4];
                                                        iw2 iw2Var2 = this.f3451S.f26483d[i4];
                                                        i4 = (gq2Var2.zzh() == iw2Var2 && (iw2Var2 == null || gq2Var2.zzA())) ? i4 + 1 : 0;
                                                    } else {
                                                        sp2 sp2Var10 = this.f3451S;
                                                        sp2 sp2Var11 = sp2Var10.f26491l;
                                                        if (sp2Var11 != null && sp2Var11.f26489j) {
                                                            gx2 gx2Var2 = sp2Var10.f26492m;
                                                            this.f3451S = sp2Var11;
                                                            gx2 gx2Var3 = sp2Var11.f26492m;
                                                            long zzh = sp2Var11.f26480a.zzh();
                                                            int i12 = 0;
                                                            int i13 = 2;
                                                            while (i12 < i13) {
                                                                gq2 gq2Var3 = this.f3460p[i12];
                                                                if (gx2Var2.f11832b.m23830a(i12) != null) {
                                                                    if (zzh != -9223372036854775807L) {
                                                                        gq2Var3.zzv();
                                                                    } else if (!gq2Var3.zzB()) {
                                                                        vw2 m23830a = gx2Var3.f11832b.m23830a(i12);
                                                                        iq2 iq2Var = gx2Var2.f11834d[i12];
                                                                        iq2 iq2Var2 = gx2Var3.f11834d[i12];
                                                                        if (m23830a == null || !iq2Var2.equals(iq2Var)) {
                                                                            gx2Var = gx2Var3;
                                                                            j2 = zzh;
                                                                            gq2Var3.zzv();
                                                                        } else {
                                                                            m23830a.m6689b();
                                                                            zzatd[] zzatdVarArr = new zzatd[i7];
                                                                            for (int i14 = 0; i14 <= 0; i14++) {
                                                                                zzatdVarArr[i14] = m23830a.m6688c(i14);
                                                                            }
                                                                            sp2 sp2Var12 = this.f3451S;
                                                                            gx2Var = gx2Var3;
                                                                            j2 = zzh;
                                                                            gq2Var3.mo19538i(zzatdVarArr, sp2Var12.f26483d[i12], sp2Var12.f26485f - sp2Var12.f26487h);
                                                                        }
                                                                        i12++;
                                                                        gx2Var3 = gx2Var;
                                                                        zzh = j2;
                                                                        i13 = 2;
                                                                        i7 = 1;
                                                                    }
                                                                }
                                                                gx2Var = gx2Var3;
                                                                j2 = zzh;
                                                                i12++;
                                                                gx2Var3 = gx2Var;
                                                                zzh = j2;
                                                                i13 = 2;
                                                                i7 = 1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    m27183k(false);
                                    if (this.f3452T != null) {
                                    }
                                }
                                if (m15849f >= this.f3453U.mo15853b()) {
                                    this.f3436D.zza();
                                    j = elapsedRealtime;
                                    sp2Var2 = this.f3450R;
                                    if (sp2Var2 != null) {
                                        if (this.f3450R != null) {
                                            m27189c();
                                        }
                                        if (this.f3452T != null) {
                                        }
                                    }
                                    m27183k(false);
                                    if (this.f3452T != null) {
                                    }
                                } else {
                                    if (this.f3450R == null) {
                                        j3 = this.f3470z.f27943c;
                                    } else {
                                        this.f3453U.mo15851d(m15849f, this.f3469y, false);
                                        this.f3453U.m15848g(0, this.f3468x, false);
                                        if (m15849f == 0) {
                                            sp2 sp2Var13 = this.f3450R;
                                            j = elapsedRealtime;
                                            Pair m27193O = m27193O(this.f3453U, 0, -9223372036854775807L, Math.max(0L, ((sp2Var13.f26485f - sp2Var13.f26487h) + this.f3453U.mo15851d(sp2Var13.f26486g, this.f3469y, false).f16696c) - this.f3449Q));
                                            if (m27193O != null) {
                                                int intValue = ((Integer) m27193O.first).intValue();
                                                j3 = ((Long) m27193O.second).longValue();
                                                m15849f = intValue;
                                                sp2 sp2Var14 = this.f3450R;
                                                long j4 = sp2Var14 != null ? 60000000 + j3 : (sp2Var14.f26485f - sp2Var14.f26487h) + this.f3453U.mo15851d(sp2Var14.f26486g, this.f3469y, false).f16696c;
                                                sp2 sp2Var15 = this.f3450R;
                                                int i15 = sp2Var15 != null ? 0 : sp2Var15.f26482c + 1;
                                                boolean m27176r = m27176r(m15849f);
                                                this.f3453U.mo15851d(m15849f, this.f3469y, true);
                                                sp2 sp2Var16 = new sp2(this.f3460p, this.f3461q, j4, this.f3462r, this.f3459a0, this.f3436D, this.f3469y.f16695b, i15, m15849f, m27176r, j3, null);
                                                sp2Var4 = this.f3450R;
                                                if (sp2Var4 != null) {
                                                    sp2Var4.f26491l = sp2Var16;
                                                }
                                                this.f3450R = sp2Var16;
                                                sp2Var16.f26480a.mo1844f(this, j3);
                                                m27183k(true);
                                            }
                                            sp2Var2 = this.f3450R;
                                            if (sp2Var2 != null) {
                                            }
                                            m27183k(false);
                                            if (this.f3452T != null) {
                                            }
                                        }
                                    }
                                    j = elapsedRealtime;
                                    sp2 sp2Var142 = this.f3450R;
                                    long j42 = sp2Var142 != null ? 60000000 + j3 : (sp2Var142.f26485f - sp2Var142.f26487h) + this.f3453U.mo15851d(sp2Var142.f26486g, this.f3469y, false).f16696c;
                                    sp2 sp2Var152 = this.f3450R;
                                    if (sp2Var152 != null) {
                                    }
                                    boolean m27176r2 = m27176r(m15849f);
                                    this.f3453U.mo15851d(m15849f, this.f3469y, true);
                                    sp2 sp2Var162 = new sp2(this.f3460p, this.f3461q, j42, this.f3462r, this.f3459a0, this.f3436D, this.f3469y.f16695b, i15, m15849f, m27176r2, j3, null);
                                    sp2Var4 = this.f3450R;
                                    if (sp2Var4 != null) {
                                    }
                                    this.f3450R = sp2Var162;
                                    sp2Var162.f26480a.mo1844f(this, j3);
                                    m27183k(true);
                                    sp2Var2 = this.f3450R;
                                    if (sp2Var2 != null) {
                                    }
                                    m27183k(false);
                                    if (this.f3452T != null) {
                                    }
                                }
                            }
                            if (this.f3452T == null) {
                                m27188e();
                                m27184j(j, 10L);
                            } else {
                                nz2.m14710a("doSomeWork");
                                m27177q();
                                this.f3452T.f26480a.mo1846c(this.f3470z.f27943c);
                                boolean z5 = true;
                                boolean z6 = true;
                                for (gq2 gq2Var4 : this.f3437E) {
                                    gq2Var4.mo12210k(this.f3449Q, this.f3446N);
                                    z6 = z6 && gq2Var4.zzE();
                                    if (!gq2Var4.mo9953d() && !gq2Var4.zzE()) {
                                        z3 = false;
                                        if (!z3) {
                                            gq2Var4.zzm();
                                        }
                                        z5 = !z5 && z3;
                                    }
                                    z3 = true;
                                    if (!z3) {
                                    }
                                    if (z5) {
                                    }
                                }
                                if (!z5) {
                                    m27188e();
                                }
                                ez2 ez2Var = this.f3435C;
                                if (ez2Var != null) {
                                    fq2 mo9951n = ez2Var.mo9951n();
                                    if (!mo9951n.equals(this.f3433A)) {
                                        this.f3433A = mo9951n;
                                        this.f3463s.m16359d(this.f3435C);
                                        this.f3466v.obtainMessage(7, mo9951n).sendToTarget();
                                    }
                                }
                                long j5 = this.f3453U.mo15851d(this.f3452T.f26486g, this.f3469y, false).f16696c;
                                if (!z6 || ((j5 != -9223372036854775807L && j5 > this.f3470z.f27943c) || !this.f3452T.f26488i)) {
                                    int i16 = this.f3442J;
                                    if (i16 == 2) {
                                        if (this.f3437E.length <= 0) {
                                            break;
                                        } else if (z5) {
                                            boolean z7 = this.f3440H;
                                            sp2 sp2Var17 = this.f3450R;
                                            long zzg = !sp2Var17.f26489j ? sp2Var17.f26487h : sp2Var17.f26480a.zzg();
                                            if (zzg == Long.MIN_VALUE) {
                                                sp2 sp2Var18 = this.f3450R;
                                                if (sp2Var18.f26488i) {
                                                    m27181m(3);
                                                    if (this.f3439G) {
                                                        m27180n();
                                                    }
                                                } else {
                                                    zzg = this.f3453U.mo15851d(sp2Var18.f26486g, this.f3469y, false).f16696c;
                                                }
                                            }
                                            if (this.f3454V) {
                                                y34 y34Var = this.f3459a0;
                                                long j6 = this.f3470z.f27944d;
                                                sp2 sp2Var19 = this.f3450R;
                                                m4148k = y34Var.m4148k(j6 - (this.f3449Q - (sp2Var19.f26485f - sp2Var19.f26487h)), z7);
                                            } else {
                                                y34 y34Var2 = this.f3459a0;
                                                sp2 sp2Var20 = this.f3450R;
                                                m4148k = y34Var2.m4148k(zzg - (this.f3449Q - (sp2Var20.f26485f - sp2Var20.f26487h)), z7);
                                            }
                                            if (m4148k) {
                                                m27181m(3);
                                                if (this.f3439G) {
                                                }
                                            }
                                        }
                                    } else if (i16 == 3) {
                                        if (this.f3437E.length <= 0) {
                                            z5 = m27175s(j5);
                                        }
                                        if (!z5) {
                                            this.f3440H = this.f3439G;
                                            m27181m(2);
                                        }
                                    }
                                    if (this.f3442J == 2) {
                                        for (gq2 gq2Var5 : this.f3437E) {
                                            gq2Var5.zzm();
                                        }
                                    }
                                    if ((!this.f3439G && this.f3442J == 3) || this.f3442J == 2) {
                                        m27184j(j, this.f3457Y > 0 ? this.f3457Y : 10L);
                                    } else if (this.f3437E.length == 0) {
                                        m27184j(j, this.f3458Z > 0 ? this.f3458Z : 1000L);
                                    } else {
                                        this.f3464t.removeMessages(2);
                                    }
                                    nz2.m14709b();
                                } else {
                                    m27181m(4);
                                }
                                m27178p();
                                if (this.f3442J == 2) {
                                }
                                if (!this.f3439G) {
                                }
                                if (this.f3437E.length == 0) {
                                }
                                nz2.m14709b();
                            }
                            return true;
                        case 3:
                            up2 up2Var = (up2) message.obj;
                            if (this.f3453U == null) {
                                this.f3447O++;
                                this.f3448P = up2Var;
                            } else {
                                Pair m27192P = m27192P(up2Var);
                                if (m27192P == null) {
                                    tp2 tp2Var = new tp2(0, 0L);
                                    this.f3470z = tp2Var;
                                    this.f3466v.obtainMessage(4, 1, 0, tp2Var).sendToTarget();
                                    this.f3470z = new tp2(0, -9223372036854775807L);
                                    m27181m(4);
                                    m27186g(false);
                                } else {
                                    int i17 = up2Var.f29412c == -9223372036854775807L ? 1 : 0;
                                    int intValue2 = ((Integer) m27192P.first).intValue();
                                    long longValue = ((Long) m27192P.second).longValue();
                                    try {
                                        tp2 tp2Var2 = this.f3470z;
                                        if (intValue2 == tp2Var2.f27941a && longValue / 1000 == tp2Var2.f27943c / 1000) {
                                            tp2 tp2Var3 = new tp2(intValue2, longValue);
                                            this.f3470z = tp2Var3;
                                            obtainMessage = this.f3466v.obtainMessage(4, i17, 0, tp2Var3);
                                        } else {
                                            long m27196L = m27196L(intValue2, longValue);
                                            int i18 = i17 | (longValue != m27196L ? 1 : 0);
                                            tp2 tp2Var4 = new tp2(intValue2, m27196L);
                                            this.f3470z = tp2Var4;
                                            obtainMessage = this.f3466v.obtainMessage(4, i18, 0, tp2Var4);
                                        }
                                        obtainMessage.sendToTarget();
                                    } catch (Throwable th) {
                                        tp2 tp2Var5 = new tp2(intValue2, longValue);
                                        this.f3470z = tp2Var5;
                                        this.f3466v.obtainMessage(4, i17, 0, tp2Var5).sendToTarget();
                                        throw th;
                                    }
                                }
                            }
                            return true;
                        case 4:
                            fq2 fq2Var = (fq2) message.obj;
                            ez2 ez2Var2 = this.f3435C;
                            if (ez2Var2 != null) {
                                fq2Var = ez2Var2.mo9950o(fq2Var);
                            } else {
                                this.f3463s.mo9950o(fq2Var);
                            }
                            this.f3433A = fq2Var;
                            this.f3466v.obtainMessage(7, fq2Var).sendToTarget();
                            return true;
                        case 5:
                            m27179o();
                            return true;
                        case 6:
                            m27186g(true);
                            this.f3459a0.m4157b();
                            m27181m(1);
                            synchronized (this) {
                                this.f3438F = true;
                                notifyAll();
                            }
                            return true;
                        case 7:
                            Pair pair = (Pair) message.obj;
                            mq2 mq2Var = this.f3453U;
                            mq2 mq2Var2 = (mq2) pair.first;
                            this.f3453U = mq2Var2;
                            Object obj = pair.second;
                            if (mq2Var == null) {
                                if (this.f3447O > 0) {
                                    Pair m27192P2 = m27192P(this.f3448P);
                                    i5 = this.f3447O;
                                    this.f3447O = 0;
                                    this.f3448P = null;
                                    if (m27192P2 != null) {
                                        this.f3470z = new tp2(((Integer) m27192P2.first).intValue(), ((Long) m27192P2.second).longValue());
                                        sp2Var5 = this.f3452T;
                                        if (sp2Var5 == null) {
                                            sp2Var5 = this.f3450R;
                                        }
                                        if (sp2Var5 != null) {
                                            int mo15854a = this.f3453U.mo15854a(sp2Var5.f26481b);
                                            if (mo15854a != -1) {
                                                boolean m27176r3 = m27176r(0);
                                                sp2Var5.f26486g = 0;
                                                sp2Var5.f26488i = m27176r3;
                                                boolean z8 = sp2Var5 == this.f3451S;
                                                tp2 tp2Var6 = this.f3470z;
                                                if (tp2Var6.f27941a != 0) {
                                                    tp2 tp2Var7 = new tp2(0, tp2Var6.f27942b);
                                                    tp2Var7.f27943c = tp2Var6.f27943c;
                                                    tp2Var7.f27944d = tp2Var6.f27944d;
                                                    this.f3470z = tp2Var7;
                                                }
                                                while (true) {
                                                    sp2 sp2Var21 = sp2Var5.f26491l;
                                                    if (sp2Var21 != null) {
                                                        mo15854a = this.f3453U.m15849f(mo15854a, this.f3469y, this.f3468x, this.f3443K);
                                                        if (mo15854a != -1 && sp2Var21.f26481b.equals(this.f3453U.mo15851d(mo15854a, this.f3469y, true).f16695b)) {
                                                            boolean m27176r4 = m27176r(mo15854a);
                                                            sp2Var21.f26486g = mo15854a;
                                                            sp2Var21.f26488i = m27176r4;
                                                            z8 |= sp2Var21 == this.f3451S;
                                                            sp2Var5 = sp2Var21;
                                                        }
                                                    }
                                                }
                                            } else if (m27197K(sp2Var5.f26486g, mq2Var, this.f3453U) != -1) {
                                                this.f3453U.mo15851d(0, this.f3469y, false);
                                                Pair m27195M = m27195M(0, -9223372036854775807L);
                                                int intValue3 = ((Integer) m27195M.first).intValue();
                                                long longValue2 = ((Long) m27195M.second).longValue();
                                                this.f3453U.mo15851d(intValue3, this.f3469y, true);
                                                Object obj2 = this.f3469y.f16695b;
                                                sp2Var5.f26486g = -1;
                                                while (true) {
                                                    sp2Var5 = sp2Var5.f26491l;
                                                    if (sp2Var5 != null) {
                                                        sp2Var5.f26486g = true != sp2Var5.f26481b.equals(obj2) ? -1 : intValue3;
                                                    } else {
                                                        this.f3470z = new tp2(intValue3, m27196L(intValue3, longValue2));
                                                    }
                                                }
                                            }
                                        }
                                        m27187f(obj, i5);
                                        return true;
                                    }
                                    m27190a(obj, i5);
                                    return true;
                                } else if (this.f3470z.f27942b == -9223372036854775807L) {
                                    if (mq2Var2.m15847h()) {
                                        m27190a(obj, 0);
                                        return true;
                                    }
                                    Pair m27195M2 = m27195M(0, -9223372036854775807L);
                                    this.f3470z = new tp2(((Integer) m27195M2.first).intValue(), ((Long) m27195M2.second).longValue());
                                }
                            }
                            i5 = 0;
                            sp2Var5 = this.f3452T;
                            if (sp2Var5 == null) {
                            }
                            if (sp2Var5 != null) {
                            }
                            m27187f(obj, i5);
                            return true;
                        case 8:
                            wv2 wv2Var = (wv2) message.obj;
                            sp2 sp2Var22 = this.f3450R;
                            if (sp2Var22 != null && sp2Var22.f26480a == wv2Var) {
                                sp2Var22.f26489j = true;
                                sp2Var22.m10089e();
                                sp2Var22.f26487h = sp2Var22.m10093a(sp2Var22.f26487h, false);
                                if (this.f3452T == null) {
                                    sp2 sp2Var23 = this.f3450R;
                                    this.f3451S = sp2Var23;
                                    m27185i(sp2Var23.f26487h);
                                    m27182l(this.f3451S);
                                }
                                m27189c();
                            }
                            return true;
                        case 9:
                            wv2 wv2Var2 = (wv2) message.obj;
                            sp2 sp2Var24 = this.f3450R;
                            if (sp2Var24 != null && sp2Var24.f26480a == wv2Var2) {
                                m27189c();
                            }
                            return true;
                        case 10:
                            sp2 sp2Var25 = this.f3452T;
                            if (sp2Var25 != null) {
                                boolean z9 = true;
                                while (true) {
                                    if (sp2Var25 != null && sp2Var25.f26489j) {
                                        if (sp2Var25.m10089e()) {
                                            if (z9) {
                                                sp2 sp2Var26 = this.f3451S;
                                                sp2 sp2Var27 = this.f3452T;
                                                boolean z10 = sp2Var26 != sp2Var27;
                                                m27173u(sp2Var27.f26491l);
                                                sp2 sp2Var28 = this.f3452T;
                                                sp2Var28.f26491l = null;
                                                this.f3450R = sp2Var28;
                                                this.f3451S = sp2Var28;
                                                boolean[] zArr = new boolean[2];
                                                long m10092b = sp2Var28.m10092b(this.f3470z.f27943c, z10, zArr);
                                                if (m10092b != this.f3470z.f27943c) {
                                                    this.f3470z.f27943c = m10092b;
                                                    m27185i(m10092b);
                                                }
                                                boolean[] zArr2 = new boolean[2];
                                                int i19 = 0;
                                                for (int i20 = 0; i20 < 2; i20++) {
                                                    gq2 gq2Var6 = this.f3460p[i20];
                                                    boolean z11 = gq2Var6.zzb() != 0;
                                                    zArr2[i20] = z11;
                                                    iw2 iw2Var3 = this.f3452T.f26483d[i20];
                                                    if (iw2Var3 != null) {
                                                        i19++;
                                                    }
                                                    if (z11) {
                                                        if (iw2Var3 != gq2Var6.zzh()) {
                                                            if (gq2Var6 == this.f3434B) {
                                                                if (iw2Var3 == null) {
                                                                    this.f3463s.m16359d(this.f3435C);
                                                                }
                                                                this.f3435C = null;
                                                                this.f3434B = null;
                                                            }
                                                            m27174t(gq2Var6);
                                                            gq2Var6.zzj();
                                                        } else if (zArr[i20]) {
                                                            gq2Var6.mo19539g(this.f3449Q);
                                                        }
                                                    }
                                                }
                                                this.f3466v.obtainMessage(3, sp2Var25.f26492m).sendToTarget();
                                                m27191Q(zArr2, i19);
                                            } else {
                                                this.f3450R = sp2Var25;
                                                while (true) {
                                                    sp2Var25 = sp2Var25.f26491l;
                                                    if (sp2Var25 != null) {
                                                        sp2Var25.m10091c();
                                                    } else {
                                                        sp2 sp2Var29 = this.f3450R;
                                                        sp2Var29.f26491l = null;
                                                        if (sp2Var29.f26489j) {
                                                            long j7 = sp2Var29.f26487h;
                                                            this.f3450R.m10093a(Math.max(j7, this.f3449Q - (sp2Var29.f26485f - j7)), false);
                                                        }
                                                    }
                                                }
                                            }
                                            m27189c();
                                            m27177q();
                                            this.f3464t.sendEmptyMessage(2);
                                        } else {
                                            z9 &= sp2Var25 != this.f3451S;
                                            sp2Var25 = sp2Var25.f26491l;
                                        }
                                    }
                                }
                            }
                            return true;
                        case 11:
                            try {
                                for (np2 np2Var : (np2[]) message.obj) {
                                    np2Var.f20547a.mo9954b(np2Var.f20548b, np2Var.f20549c);
                                }
                                if (this.f3436D != null) {
                                    this.f3464t.sendEmptyMessage(2);
                                }
                                synchronized (this) {
                                    this.f3445M++;
                                    notifyAll();
                                }
                                return true;
                            } catch (Throwable th2) {
                                synchronized (this) {
                                    this.f3445M++;
                                    notifyAll();
                                    throw th2;
                                }
                            }
                        case 12:
                            int i21 = message.arg1;
                            this.f3443K = i21;
                            sp2 sp2Var30 = this.f3452T;
                            if (sp2Var30 == null) {
                                sp2Var30 = this.f3450R;
                            }
                            if (sp2Var30 != null) {
                                boolean z12 = sp2Var30 == this.f3451S;
                                boolean z13 = sp2Var30 == this.f3450R;
                                int m15849f2 = this.f3453U.m15849f(sp2Var30.f26486g, this.f3469y, this.f3468x, i21);
                                while (true) {
                                    sp2 sp2Var31 = sp2Var30.f26491l;
                                    if (sp2Var31 != null && m15849f2 != -1 && (i6 = sp2Var31.f26486g) == m15849f2) {
                                        z12 |= sp2Var31 == this.f3451S;
                                        z13 |= sp2Var31 == this.f3450R;
                                        m15849f2 = this.f3453U.m15849f(i6, this.f3469y, this.f3468x, i21);
                                        sp2Var30 = sp2Var31;
                                    }
                                }
                                sp2Var30.f26488i = m27176r(sp2Var30.f26486g);
                                if (!z13) {
                                    this.f3450R = sp2Var30;
                                }
                                if (!z12 && (sp2Var6 = this.f3452T) != null) {
                                    int i22 = sp2Var6.f26486g;
                                    this.f3470z = new tp2(i22, m27196L(i22, this.f3470z.f27943c));
                                }
                                if (this.f3442J == 4 && i21 != 0) {
                                    m27181m(2);
                                }
                            }
                            return true;
                        default:
                            return false;
                    }
                } catch (kp2 e) {
                    kp2Var = e;
                    z2 = true;
                    i2 = 8;
                    this.f3466v.obtainMessage(i2, kp2Var).sendToTarget();
                    m27179o();
                    return z2;
                } catch (IOException e2) {
                    iOException = e2;
                    z = true;
                    i = 8;
                    this.f3466v.obtainMessage(i, kp2.m17547b(iOException)).sendToTarget();
                    m27179o();
                    return z;
                }
            } catch (RuntimeException e3) {
                this.f3466v.obtainMessage(8, kp2.m17546c(e3)).sendToTarget();
                m27179o();
                return true;
            }
        } catch (kp2 e4) {
            z2 = true;
            i2 = 8;
            kp2Var = e4;
        } catch (IOException e5) {
            z = true;
            i = 8;
            iOException = e5;
        }
    }

    /* renamed from: i */
    public final void m27185i(long j) {
        sp2 sp2Var = this.f3452T;
        long j2 = sp2Var == null ? j + 60000000 : j + (sp2Var.f26485f - sp2Var.f26487h);
        this.f3449Q = j2;
        this.f3463s.m16362a(j2);
        for (gq2 gq2Var : this.f3437E) {
            gq2Var.mo19539g(this.f3449Q);
        }
    }

    /* renamed from: j */
    public final void m27184j(long j, long j2) {
        this.f3464t.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f3464t.sendEmptyMessage(2);
        } else {
            this.f3464t.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: k */
    public final void m27183k(boolean z) {
        if (this.f3441I != z) {
            this.f3441I = z;
            this.f3466v.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: l */
    public final void m27182l(sp2 sp2Var) {
        if (this.f3452T == sp2Var) {
            return;
        }
        boolean[] zArr = new boolean[2];
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            gq2 gq2Var = this.f3460p[i2];
            zArr[i2] = gq2Var.zzb() != 0;
            vw2 m23830a = sp2Var.f26492m.f11832b.m23830a(i2);
            if (m23830a != null) {
                i++;
            }
            if (zArr[i2] && (m23830a == null || (gq2Var.zzB() && gq2Var.zzh() == this.f3452T.f26483d[i2]))) {
                if (gq2Var == this.f3434B) {
                    this.f3463s.m16359d(this.f3435C);
                    this.f3435C = null;
                    this.f3434B = null;
                }
                m27174t(gq2Var);
                gq2Var.zzj();
            }
        }
        this.f3452T = sp2Var;
        this.f3466v.obtainMessage(3, sp2Var.f26492m).sendToTarget();
        m27191Q(zArr, i);
    }

    /* renamed from: m */
    public final void m27181m(int i) {
        if (this.f3442J != i) {
            this.f3442J = i;
            this.f3466v.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: n */
    public final void m27180n() {
        this.f3440H = false;
        this.f3463s.m16361b();
        for (gq2 gq2Var : this.f3437E) {
            gq2Var.mo19541e();
        }
    }

    /* renamed from: o */
    public final void m27179o() {
        m27186g(true);
        this.f3459a0.m4156c();
        m27181m(1);
    }

    /* renamed from: p */
    public final void m27178p() {
        this.f3463s.m16360c();
        for (gq2 gq2Var : this.f3437E) {
            m27174t(gq2Var);
        }
    }

    /* renamed from: q */
    public final void m27177q() {
        sp2 sp2Var = this.f3452T;
        if (sp2Var == null) {
            return;
        }
        long zzh = sp2Var.f26480a.zzh();
        if (zzh != -9223372036854775807L) {
            m27185i(zzh);
        } else {
            gq2 gq2Var = this.f3434B;
            if (gq2Var == null || gq2Var.zzE()) {
                this.f3449Q = this.f3463s.mo9952h();
            } else {
                long mo9952h = this.f3435C.mo9952h();
                this.f3449Q = mo9952h;
                this.f3463s.m16362a(mo9952h);
            }
            sp2 sp2Var2 = this.f3452T;
            zzh = this.f3449Q - (sp2Var2.f26485f - sp2Var2.f26487h);
        }
        this.f3470z.f27943c = zzh;
        this.f3446N = SystemClock.elapsedRealtime() * 1000;
        long zzg = this.f3437E.length == 0 ? Long.MIN_VALUE : this.f3452T.f26480a.zzg();
        tp2 tp2Var = this.f3470z;
        if (zzg == Long.MIN_VALUE) {
            zzg = this.f3453U.mo15851d(this.f3452T.f26486g, this.f3469y, false).f16696c;
        }
        tp2Var.f27944d = zzg;
    }

    /* renamed from: r */
    public final boolean m27176r(int i) {
        this.f3453U.mo15851d(i, this.f3469y, false);
        this.f3453U.m15848g(0, this.f3468x, false);
        return this.f3453U.m15849f(i, this.f3469y, this.f3468x, this.f3443K) == -1;
    }

    /* renamed from: s */
    public final boolean m27175s(long j) {
        sp2 sp2Var;
        return j == -9223372036854775807L || this.f3470z.f27943c < j || ((sp2Var = this.f3452T.f26491l) != null && sp2Var.f26489j);
    }

    /* renamed from: v */
    public final synchronized void m27172v(np2... np2VarArr) {
        if (this.f3438F) {
            return;
        }
        int i = this.f3444L;
        this.f3444L = i + 1;
        this.f3464t.obtainMessage(11, np2VarArr).sendToTarget();
        while (this.f3445M <= i) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: w */
    public final void m27171w() {
        this.f3454V = true;
    }

    /* renamed from: x */
    public final void m27170x(int i) {
        this.f3456X = i;
    }

    /* renamed from: y */
    public final void m27169y() {
        this.f3455W = true;
    }

    /* renamed from: z */
    public final void m27168z(yv2 yv2Var, boolean z) {
        this.f3464t.obtainMessage(0, 1, 0, yv2Var).sendToTarget();
    }

    @Override // com.daaw.ex2
    public final void zzh() {
        this.f3464t.sendEmptyMessage(10);
    }
}
