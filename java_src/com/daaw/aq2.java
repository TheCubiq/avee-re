package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzatd;
/* loaded from: classes.dex */
public final class aq2 implements Handler.Callback, vv2, ex2, xv2 {
    public fq2 A;
    public gq2 B;
    public ez2 C;
    public yv2 D;
    public gq2[] E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int L;
    public int M;
    public long N;
    public int O;
    public up2 P;
    public long Q;
    public sp2 R;
    public sp2 S;
    public sp2 T;
    public mq2 U;
    public boolean V;
    public boolean W;
    public int X;
    public volatile int Y;
    public volatile int Z;
    public final y34 a0;
    public final gq2[] p;
    public final fx2 r;
    public final lz2 s;
    public final Handler t;
    public final HandlerThread u;
    public final Handler v;
    public final op2 w;
    public final lq2 x;
    public final kq2 y;
    public tp2 z;
    public int K = 0;
    public int J = 1;
    public final hq2[] q = new hq2[2];

    public aq2(gq2[] gq2VarArr, fx2 fx2Var, y34 y34Var, boolean z, int i, Handler handler, tp2 tp2Var, op2 op2Var, byte[] bArr) {
        this.p = gq2VarArr;
        this.r = fx2Var;
        this.a0 = y34Var;
        this.G = z;
        this.v = handler;
        this.z = tp2Var;
        this.w = op2Var;
        for (int i2 = 0; i2 < 2; i2++) {
            gq2VarArr[i2].f(i2);
            this.q[i2] = gq2VarArr[i2].zzf();
        }
        this.s = new lz2();
        this.E = new gq2[0];
        this.x = new lq2();
        this.y = new kq2();
        fx2Var.c(this);
        this.A = fq2.d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.u = handlerThread;
        handlerThread.start();
        this.t = new Handler(handlerThread.getLooper(), this);
    }

    public static final void t(gq2 gq2Var) {
        if (gq2Var.zzb() == 2) {
            gq2Var.zzz();
        }
    }

    public static final void u(sp2 sp2Var) {
        while (sp2Var != null) {
            sp2Var.c();
            sp2Var = sp2Var.l;
        }
    }

    public final synchronized void A() {
        if (this.F) {
            return;
        }
        this.t.sendEmptyMessage(6);
        while (!this.F) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.u.quit();
    }

    public final void B(mq2 mq2Var, int i, long j) {
        this.t.obtainMessage(3, new up2(mq2Var, 0, j)).sendToTarget();
    }

    public final void C(np2... np2VarArr) {
        if (this.F) {
            return;
        }
        this.L++;
        this.t.obtainMessage(11, np2VarArr).sendToTarget();
    }

    public final void D(int i) {
        this.Z = i;
    }

    public final void E(int i) {
        this.Y = i;
    }

    public final void F(boolean z) {
        this.t.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void G() {
        this.t.sendEmptyMessage(5);
    }

    public final synchronized boolean H(np2... np2VarArr) {
        int i;
        if (this.F) {
            return true;
        }
        int i2 = this.L;
        this.L = i2 + 1;
        this.t.obtainMessage(11, np2VarArr).sendToTarget();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.X;
        long j2 = elapsedRealtime + j;
        while (true) {
            i = this.M;
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

    public final boolean I() {
        return this.W && this.X > 0;
    }

    public final synchronized boolean J() {
        if (this.F) {
            return true;
        }
        this.t.sendEmptyMessage(6);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.X;
        long j2 = elapsedRealtime + j;
        while (true) {
            if (!this.F) {
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
                this.u.quit();
                break;
            }
        }
        return this.F;
    }

    public final int K(int i, mq2 mq2Var, mq2 mq2Var2) {
        int b = mq2Var.b();
        int i2 = -1;
        for (int i3 = 0; i3 < b && i2 == -1; i3++) {
            i = mq2Var.f(i, this.y, this.x, this.K);
            i2 = mq2Var2.a(mq2Var.d(i, this.y, true).b);
        }
        return i2;
    }

    public final long L(int i, long j) {
        sp2 sp2Var;
        p();
        this.H = false;
        m(2);
        sp2 sp2Var2 = this.T;
        if (sp2Var2 == null) {
            sp2 sp2Var3 = this.R;
            if (sp2Var3 != null) {
                sp2Var3.c();
            }
            sp2Var = null;
        } else {
            sp2Var = null;
            while (sp2Var2 != null) {
                if (sp2Var2.g == i && sp2Var2.j) {
                    sp2Var = sp2Var2;
                } else {
                    sp2Var2.c();
                }
                sp2Var2 = sp2Var2.l;
            }
        }
        sp2 sp2Var4 = this.T;
        if (sp2Var4 != sp2Var || sp2Var4 != this.S) {
            for (gq2 gq2Var : this.E) {
                gq2Var.zzj();
            }
            this.E = new gq2[0];
            this.C = null;
            this.B = null;
            this.T = null;
        }
        if (sp2Var != null) {
            sp2Var.l = null;
            this.R = sp2Var;
            this.S = sp2Var;
            l(sp2Var);
            sp2 sp2Var5 = this.T;
            if (sp2Var5.k) {
                j = sp2Var5.a.e(j);
            }
            i(j);
            c();
        } else {
            this.R = null;
            this.S = null;
            this.T = null;
            i(j);
        }
        this.t.sendEmptyMessage(2);
        return j;
    }

    public final Pair M(int i, long j) {
        return N(this.U, 0, -9223372036854775807L);
    }

    public final Pair N(mq2 mq2Var, int i, long j) {
        return O(mq2Var, 0, j, 0L);
    }

    public final Pair O(mq2 mq2Var, int i, long j, long j2) {
        az2.a(0, 0, mq2Var.c());
        mq2Var.e(0, this.x, false, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j3 = mq2Var.d(0, this.y, false).c;
        if (j3 != -9223372036854775807L) {
            int i2 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j));
    }

    public final Pair P(up2 up2Var) {
        mq2 mq2Var = up2Var.a;
        if (mq2Var.h()) {
            mq2Var = this.U;
        }
        try {
            Pair N = N(mq2Var, 0, up2Var.c);
            mq2 mq2Var2 = this.U;
            if (mq2Var2 == mq2Var) {
                return N;
            }
            if (mq2Var2.a(mq2Var.d(((Integer) N.first).intValue(), this.y, true).b) != -1) {
                return Pair.create(0, (Long) N.second);
            }
            if (K(((Integer) N.first).intValue(), mq2Var, this.U) != -1) {
                this.U.d(0, this.y, false);
                return M(0, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new dq2(this.U, 0, up2Var.c);
        }
    }

    public final void Q(boolean[] zArr, int i) {
        int i2;
        this.E = new gq2[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 2) {
            gq2 gq2Var = this.p[i3];
            vw2 a = this.T.m.b.a(i3);
            if (a != null) {
                int i5 = i4 + 1;
                this.E[i4] = gq2Var;
                if (gq2Var.zzb() == 0) {
                    iq2 iq2Var = this.T.m.d[i3];
                    boolean z = this.G && this.J == 3;
                    boolean z2 = !zArr[i3] && z;
                    a.b();
                    zzatd[] zzatdVarArr = new zzatd[1];
                    for (int i6 = 0; i6 <= 0; i6++) {
                        zzatdVarArr[i6] = a.c(i6);
                    }
                    sp2 sp2Var = this.T;
                    i2 = i3;
                    gq2Var.j(iq2Var, zzatdVarArr, sp2Var.d[i3], this.Q, z2, sp2Var.f - sp2Var.h);
                    ez2 zzi = gq2Var.zzi();
                    if (zzi != null) {
                        if (this.C != null) {
                            throw kp2.c(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.C = zzi;
                        this.B = gq2Var;
                        zzi.o(this.A);
                    }
                    if (z) {
                        gq2Var.e();
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

    public final void a(Object obj, int i) {
        this.z = new tp2(0, 0L);
        f(obj, i);
        this.z = new tp2(0, -9223372036854775807L);
        m(4);
        g(false);
    }

    @Override // com.daaw.jw2
    public final /* bridge */ /* synthetic */ void b(kw2 kw2Var) {
        this.t.obtainMessage(9, (wv2) kw2Var).sendToTarget();
    }

    public final void c() {
        sp2 sp2Var = this.R;
        long zza = !sp2Var.j ? 0L : sp2Var.a.zza();
        if (zza == Long.MIN_VALUE) {
            k(false);
            return;
        }
        sp2 sp2Var2 = this.R;
        long j = this.Q - (sp2Var2.f - sp2Var2.h);
        boolean j2 = this.a0.j(zza - j);
        k(j2);
        if (j2) {
            this.R.a.a(j);
        }
    }

    @Override // com.daaw.xv2
    public final void d(mq2 mq2Var, Object obj) {
        this.t.obtainMessage(7, Pair.create(mq2Var, null)).sendToTarget();
    }

    public final void e() {
        sp2 sp2Var = this.R;
        if (sp2Var == null || sp2Var.j) {
            return;
        }
        sp2 sp2Var2 = this.S;
        if (sp2Var2 == null || sp2Var2.l == sp2Var) {
            for (gq2 gq2Var : this.E) {
                if (!gq2Var.zzA()) {
                    return;
                }
            }
            this.R.a.zzs();
        }
    }

    public final void f(Object obj, int i) {
        this.v.obtainMessage(6, new zp2(this.U, obj, this.z, i)).sendToTarget();
    }

    public final void g(boolean z) {
        gq2[] gq2VarArr;
        this.t.removeMessages(2);
        this.H = false;
        this.s.c();
        this.C = null;
        this.B = null;
        this.Q = 60000000L;
        for (gq2 gq2Var : this.E) {
            try {
                t(gq2Var);
                gq2Var.zzj();
            } catch (kp2 | RuntimeException unused) {
            }
        }
        this.E = new gq2[0];
        sp2 sp2Var = this.T;
        if (sp2Var == null) {
            sp2Var = this.R;
        }
        u(sp2Var);
        this.R = null;
        this.S = null;
        this.T = null;
        k(false);
        if (z) {
            yv2 yv2Var = this.D;
            if (yv2Var != null) {
                yv2Var.zzd();
                this.D = null;
            }
            this.U = null;
        }
    }

    @Override // com.daaw.vv2
    public final void h(wv2 wv2Var) {
        this.t.obtainMessage(8, wv2Var).sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x0326, code lost:
        if (r2 != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0328, code lost:
        r2 = r33.T.g;
        r33.z = new com.daaw.tp2(r2, L(r2, r33.z.c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x033d, code lost:
        r33.R = r3;
        r3.l = null;
        u(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
        u(r12);
        r2.l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x078e, code lost:
        if (s(r1) != false) goto L373;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r34) {
        /*
            Method dump skipped, instructions count: 2252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.aq2.handleMessage(android.os.Message):boolean");
    }

    public final void i(long j) {
        sp2 sp2Var = this.T;
        long j2 = sp2Var == null ? j + 60000000 : j + (sp2Var.f - sp2Var.h);
        this.Q = j2;
        this.s.a(j2);
        for (gq2 gq2Var : this.E) {
            gq2Var.g(this.Q);
        }
    }

    public final void j(long j, long j2) {
        this.t.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.t.sendEmptyMessage(2);
        } else {
            this.t.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    public final void k(boolean z) {
        if (this.I != z) {
            this.I = z;
            this.v.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void l(sp2 sp2Var) {
        if (this.T == sp2Var) {
            return;
        }
        boolean[] zArr = new boolean[2];
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            gq2 gq2Var = this.p[i2];
            zArr[i2] = gq2Var.zzb() != 0;
            vw2 a = sp2Var.m.b.a(i2);
            if (a != null) {
                i++;
            }
            if (zArr[i2] && (a == null || (gq2Var.zzB() && gq2Var.zzh() == this.T.d[i2]))) {
                if (gq2Var == this.B) {
                    this.s.d(this.C);
                    this.C = null;
                    this.B = null;
                }
                t(gq2Var);
                gq2Var.zzj();
            }
        }
        this.T = sp2Var;
        this.v.obtainMessage(3, sp2Var.m).sendToTarget();
        Q(zArr, i);
    }

    public final void m(int i) {
        if (this.J != i) {
            this.J = i;
            this.v.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    public final void n() {
        this.H = false;
        this.s.b();
        for (gq2 gq2Var : this.E) {
            gq2Var.e();
        }
    }

    public final void o() {
        g(true);
        this.a0.c();
        m(1);
    }

    public final void p() {
        this.s.c();
        for (gq2 gq2Var : this.E) {
            t(gq2Var);
        }
    }

    public final void q() {
        sp2 sp2Var = this.T;
        if (sp2Var == null) {
            return;
        }
        long zzh = sp2Var.a.zzh();
        if (zzh != -9223372036854775807L) {
            i(zzh);
        } else {
            gq2 gq2Var = this.B;
            if (gq2Var == null || gq2Var.zzE()) {
                this.Q = this.s.h();
            } else {
                long h = this.C.h();
                this.Q = h;
                this.s.a(h);
            }
            sp2 sp2Var2 = this.T;
            zzh = this.Q - (sp2Var2.f - sp2Var2.h);
        }
        this.z.c = zzh;
        this.N = SystemClock.elapsedRealtime() * 1000;
        long zzg = this.E.length == 0 ? Long.MIN_VALUE : this.T.a.zzg();
        tp2 tp2Var = this.z;
        if (zzg == Long.MIN_VALUE) {
            zzg = this.U.d(this.T.g, this.y, false).c;
        }
        tp2Var.d = zzg;
    }

    public final boolean r(int i) {
        this.U.d(i, this.y, false);
        this.U.g(0, this.x, false);
        return this.U.f(i, this.y, this.x, this.K) == -1;
    }

    public final boolean s(long j) {
        sp2 sp2Var;
        return j == -9223372036854775807L || this.z.c < j || ((sp2Var = this.T.l) != null && sp2Var.j);
    }

    public final synchronized void v(np2... np2VarArr) {
        if (this.F) {
            return;
        }
        int i = this.L;
        this.L = i + 1;
        this.t.obtainMessage(11, np2VarArr).sendToTarget();
        while (this.M <= i) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void w() {
        this.V = true;
    }

    public final void x(int i) {
        this.X = i;
    }

    public final void y() {
        this.W = true;
    }

    public final void z(yv2 yv2Var, boolean z) {
        this.t.obtainMessage(0, 1, 0, yv2Var).sendToTarget();
    }

    @Override // com.daaw.ex2
    public final void zzh() {
        this.t.sendEmptyMessage(10);
    }
}
