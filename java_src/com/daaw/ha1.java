package com.daaw;

import com.daaw.avee.comp.playback.C0729a;
import com.daaw.ha1;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class ha1 implements fe0, rd0 {

    /* renamed from: a */
    public h40 f12221a = new h40();

    /* renamed from: b */
    public C1522b f12222b = new C1522b();

    /* renamed from: c */
    public final BlockingQueue<C1524c> f12223c = new ArrayBlockingQueue(1);

    /* renamed from: d */
    public final BlockingQueue<float[]> f12224d = new ArrayBlockingQueue(2);

    /* renamed from: e */
    public Thread f12225e = null;

    /* renamed from: com.daaw.ha1$a */
    /* loaded from: classes.dex */
    public class RunnableC1521a implements Runnable {
        public RunnableC1521a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1524c poll;
            while (true) {
                try {
                    poll = ha1.this.f12223c.poll(10000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
                if (poll == null) {
                    return;
                }
                ha1.this.f12224d.add(ha1.this.f12222b.m20894u(poll.f12284a, poll.f12285b));
            }
        }
    }

    /* renamed from: com.daaw.ha1$b */
    /* loaded from: classes.dex */
    public class C1522b implements zc0 {

        /* renamed from: T */
        public pw0[] f12246T;

        /* renamed from: V */
        public ie0 f12248V;

        /* renamed from: a0 */
        public ThreadPoolExecutor f12254a0;

        /* renamed from: f */
        public float f12261f;

        /* renamed from: g */
        public float f12262g;

        /* renamed from: a */
        public int f12253a = 90;

        /* renamed from: b */
        public boolean f12255b = false;

        /* renamed from: c */
        public double[] f12257c = new double[1];

        /* renamed from: d */
        public float[] f12259d = new float[1];

        /* renamed from: e */
        public float[] f12260e = new float[2];

        /* renamed from: h */
        public int f12263h = 0;

        /* renamed from: i */
        public int f12264i = 0;

        /* renamed from: j */
        public float f12265j = 0.0f;

        /* renamed from: k */
        public int f12266k = 64;

        /* renamed from: l */
        public float[] f12267l = new float[1];

        /* renamed from: m */
        public float[] f12268m = new float[1];

        /* renamed from: n */
        public float[] f12269n = new float[1];

        /* renamed from: o */
        public float[] f12270o = new float[1];

        /* renamed from: p */
        public float[] f12271p = new float[1];

        /* renamed from: q */
        public float f12272q = 0.0f;

        /* renamed from: r */
        public boolean f12273r = false;

        /* renamed from: s */
        public int f12274s = 1;

        /* renamed from: t */
        public float f12275t = 1.0f;

        /* renamed from: u */
        public final float f12276u = 300.0f;

        /* renamed from: v */
        public final float f12277v = 0.9f;

        /* renamed from: w */
        public final float f12278w = 0.01f;

        /* renamed from: x */
        public float f12279x = 0.4f;

        /* renamed from: y */
        public int f12280y = 4;

        /* renamed from: z */
        public float f12281z = 0.0f;

        /* renamed from: A */
        public float f12227A = 1000.0f;

        /* renamed from: B */
        public float f12228B = 0.0f;

        /* renamed from: C */
        public float f12229C = 1.0f;

        /* renamed from: D */
        public int[] f12230D = new int[0];

        /* renamed from: E */
        public float[] f12231E = new float[0];

        /* renamed from: F */
        public float f12232F = 1.0f;

        /* renamed from: G */
        public int f12233G = 2;

        /* renamed from: H */
        public float f12234H = 0.0f;

        /* renamed from: I */
        public float f12235I = 0.2f;

        /* renamed from: J */
        public float f12236J = 1.0f;

        /* renamed from: K */
        public boolean f12237K = true;

        /* renamed from: L */
        public float[] f12238L = new float[0];

        /* renamed from: M */
        public float f12239M = 0.5f;

        /* renamed from: N */
        public float f12240N = 0.0f;

        /* renamed from: O */
        public float f12241O = 0.0f;

        /* renamed from: P */
        public c31 f12242P = new c31(0.5f);

        /* renamed from: Q */
        public ad1 f12243Q = ad1.m27522e(1, 1.0f);

        /* renamed from: R */
        public double[] f12244R = new double[0];

        /* renamed from: S */
        public int f12245S = 0;

        /* renamed from: U */
        public double[] f12247U = new double[0];

        /* renamed from: W */
        public final Object f12249W = new Object();

        /* renamed from: X */
        public int f12250X = Runtime.getRuntime().availableProcessors();

        /* renamed from: Y */
        public final BlockingQueue<Runnable> f12251Y = new LinkedBlockingQueue();

        /* renamed from: Z */
        public final TimeUnit f12252Z = TimeUnit.SECONDS;

        /* renamed from: b0 */
        public int f12256b0 = 44100;

        /* renamed from: com.daaw.ha1$b$a */
        /* loaded from: classes.dex */
        public class C1523a implements ie0 {

            /* renamed from: a */
            public C1522b f12282a;

            public C1523a(C1522b c1522b) {
                this.f12282a = c1522b;
            }

            @Override // com.daaw.ie0
            public double get(int i) {
                return this.f12282a.f12247U[i];
            }

            @Override // com.daaw.ie0
            public int size() {
                return this.f12282a.f12247U.length;
            }
        }

        public C1522b() {
            int max = Math.max(1, this.f12250X - 3);
            this.f12246T = new pw0[max];
            int i = 0;
            while (true) {
                pw0[] pw0VarArr = this.f12246T;
                if (i >= pw0VarArr.length) {
                    this.f12248V = new C1523a(this);
                    m20904F(64, 0.06f, 0);
                    m20909A(1);
                    m20891x(0.0f, 0.2f, 0.7f, 35.0f);
                    m20889z(3, 1.0f);
                    this.f12254a0 = new ThreadPoolExecutor(max, max, 1L, this.f12252Z, this.f12251Y);
                    return;
                }
                pw0VarArr[i] = new pw0();
                i++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m20896s(int i, int i2, int i3, float f, yc1[] yc1VarArr) {
            int i4 = i * i2;
            pw0[] pw0VarArr = this.f12246T;
            if (i2 != pw0VarArr.length - 1) {
                i3 = (i2 + 1) * i;
            }
            pw0VarArr[i2].m12995b(this.f12244R, i4, i3, this.f12247U, f, this.f12260e[1]);
            yc1VarArr[i2].m3864a();
        }

        /* renamed from: A */
        public void m20909A(int i) {
            synchronized (this.f12249W) {
                if (i < 1) {
                    i = 1;
                }
                int[] iArr = new int[i + 1 + i];
                this.f12230D = iArr;
                this.f12231E = new float[iArr.length];
                this.f12232F = iArr.length;
                int i2 = 0;
                while (true) {
                    int[] iArr2 = this.f12230D;
                    if (i2 < iArr2.length) {
                        int i3 = i2 - i;
                        iArr2[i2] = i3;
                        this.f12231E[i2] = C0888bv.m25811b(((iArr2.length + 2) / 2) + i3, iArr2.length + 2);
                        i2++;
                    }
                }
            }
        }

        /* renamed from: B */
        public final void m20908B(boolean z) {
            this.f12255b = z;
        }

        /* renamed from: C */
        public void m20907C(float f) {
            synchronized (this.f12249W) {
                this.f12236J = f;
            }
        }

        /* renamed from: D */
        public final void m20906D(int i) {
            this.f12253a = i;
        }

        /* renamed from: E */
        public void m20905E(int i, float f, float f2, boolean z, int i2, float f3, int i3, int i4, float f4) {
            synchronized (this.f12249W) {
                this.f12261f = Math.max(f, 0.1f);
                this.f12262g = Math.max(f2, 0.1f);
                this.f12266k = Math.max(1, i);
                this.f12273r = z;
                this.f12274s = Math.max(i2, 1);
                this.f12234H = f3;
                int i5 = this.f12266k;
                this.f12269n = new float[i5];
                this.f12270o = new float[i5];
                this.f12263h = i3;
                this.f12264i = i4;
                this.f12265j = f4;
                this.f12247U = new double[i5];
                m20902H(i5, this.f12261f, f2, z, f3, i3, i4, f4);
                m20892w(6);
                int i6 = 0;
                while (true) {
                    pw0[] pw0VarArr = this.f12246T;
                    if (i6 < pw0VarArr.length) {
                        pw0VarArr[i6].m12996a(this.f12269n, 44100);
                        i6++;
                    }
                }
            }
        }

        /* renamed from: F */
        public void m20904F(int i, float f, int i2) {
            m20905E(i, 20.0f, 18000.0f, false, 1, f, i2, i2, 0.0f);
        }

        /* renamed from: G */
        public void m20903G(float f) {
            synchronized (this.f12249W) {
                this.f12275t = f;
            }
        }

        /* renamed from: H */
        public final void m20902H(int i, float f, float f2, boolean z, float f3, int i2, int i3, float f4) {
            int max = Math.max(0, i2);
            int max2 = Math.max(0, i3);
            boolean z2 = z && i > 1;
            int i4 = z2 ? i / 2 : i;
            int i5 = ((z2 ? i / 2 : i) - max) - max2;
            int max3 = Math.max(i5 / this.f12274s, 1);
            for (int i6 = 0; i6 < i; i6++) {
                this.f12269n[i6] = 0.0f;
            }
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            float f5 = Float.MAX_VALUE;
            float f6 = 0.0f;
            while (i8 < i5) {
                int i10 = ((i8 - ((int) (i5 * f4))) + i5) % max3;
                int i11 = i8 + max;
                int i12 = i4;
                int i13 = max;
                int i14 = i7;
                int i15 = i8;
                int i16 = i9;
                int i17 = max3;
                int i18 = i5;
                this.f12269n[i11] = (float) m20895t(f, f2, i10, i17);
                float[] fArr = this.f12269n;
                fArr[i11] = (fArr[i11] * (1.0f - f3)) + ((f + ((f2 - f) * i10 * (1.0f / i17))) * f3);
                if (f5 > fArr[i11]) {
                    f5 = fArr[i11];
                    i9 = i11;
                } else {
                    i9 = i16;
                }
                if (f6 < fArr[i11]) {
                    f6 = fArr[i11];
                    i7 = i11;
                } else {
                    i7 = i14;
                }
                i8 = i15 + 1;
                i4 = i12;
                max3 = i17;
                i5 = i18;
                max = i13;
            }
            int i19 = i7;
            int i20 = i9;
            int i21 = max;
            int i22 = i4;
            int i23 = i5;
            int i24 = 0;
            while (i24 < i) {
                int i25 = i21;
                float f7 = (i24 <= i25 || i24 == i20) ? this.f12269n[i24] : this.f12269n[((i24 - 1) + i) % i];
                int i26 = i19;
                float f8 = (i24 >= (i23 - max2) - 1 || i24 == i26) ? this.f12269n[i24] : this.f12269n[(i24 + 1) % i];
                this.f12270o[i24] = Math.min(f7, f8);
                if (f7 < 0.0f) {
                    if (f8 < 0.0f) {
                        this.f12270o[i24] = 0.0f;
                    } else {
                        this.f12270o[i24] = f8;
                    }
                } else if (f7 < 0.0f) {
                    this.f12270o[i24] = 0.0f;
                } else {
                    this.f12270o[i24] = f7;
                }
                i24++;
                i21 = i25;
                i19 = i26;
            }
            for (int i27 = 0; i27 < i; i27++) {
                float[] fArr2 = this.f12269n;
                if (fArr2[i27] < 0.0f) {
                    fArr2[i27] = 0.0f;
                }
                float[] fArr3 = this.f12270o;
                if (fArr3[i27] < 0.0f) {
                    fArr3[i27] = 0.0f;
                }
            }
            int i28 = i - 1;
            int i29 = 1;
            for (int i30 = i28; i30 >= i22; i30--) {
                float[] fArr4 = this.f12269n;
                fArr4[i30] = fArr4[i29];
                float[] fArr5 = this.f12270o;
                fArr5[i30] = fArr5[i29];
                i29 = Math.min(i29 + 1, i28);
            }
        }

        /* renamed from: I */
        public final void m20901I(float[] fArr) {
            float f;
            float f2;
            float f3 = (this.f12228B * 0.100000024f) + (fArr[0] * 0.9f);
            this.f12228B = f3;
            float f4 = fArr[1];
            float f5 = this.f12227A;
            if (f4 > f5) {
                f = f5 * 0.100000024f;
                f2 = fArr[1] * 0.9f;
            } else {
                f = f5 * 0.99f;
                f2 = fArr[1] * 0.01f;
            }
            this.f12227A = f + f2;
            float f6 = this.f12227A - f3;
            this.f12229C = f6;
            if (f6 < 1.0f) {
                this.f12229C = 1.0f;
            }
            this.f12229C = 300.0f / this.f12229C;
        }

        @Override // com.daaw.zc0
        /* renamed from: a */
        public void mo2493a(C3239un c3239un) {
            synchronized (this.f12249W) {
                m20906D(c3239un.m7947r("audioDurationMs", 60));
                m20908B(c3239un.m7955n("highQualityAudioCapture", false));
                m20905E(c3239un.m7947r("sampleOutCount", 128), c3239un.m7953o("lowerHz", 0.1f), c3239un.m7953o("higherHz", 18000.0f), c3239un.m7955n("mirrorSamples", false), c3239un.m7947r("repeatSamples", 1), c3239un.m7953o("hzLinearFactor", 0.06f), c3239un.m7947r("starAndEndGap", 0), c3239un.m7947r("starAndEndGap", 0), c3239un.m7953o("freqShift", 0.0f));
                m20903G(c3239un.m7953o("smooth", 1.0f));
                m20889z(c3239un.m7947r("filterRadius", 4), c3239un.m7953o("filterStrength", 1.0f));
                m20890y(c3239un.m7953o("beatSmooth", 0.4f));
                m20891x(c3239un.m7953o("beatRangeBarFirst", 0.0f), c3239un.m7953o("beatRangeBarLast", 0.2f), c3239un.m7953o("beatRangeValueLower", 0.7f), c3239un.m7953o("beatRangeValueHigher", 35.0f));
                m20893v(c3239un.m7953o("lowerFreqMagnitude", 0.25f));
                m20907C(c3239un.m7953o("outputMultiplier", 1.0f));
            }
        }

        /* renamed from: j */
        public final void m20899j(float[] fArr, float f, boolean z, ie0 ie0Var, int i, float[] fArr2, float[] fArr3, boolean z2) {
            int i2 = 0;
            if (fArr.length < 4) {
                while (i2 < fArr.length) {
                    fArr[i2] = 0.0f;
                    i2++;
                }
                return;
            }
            fArr2[0] = 9999990.0f;
            fArr2[1] = -9999990.0f;
            if (this.f12257c.length != ie0Var.size()) {
                this.f12257c = new double[ie0Var.size()];
            }
            C2691q6.m12749i(fArr.length == this.f12257c.length);
            float f2 = this.f12235I;
            float f3 = 1.0f - f2;
            while (i2 < this.f12257c.length) {
                fArr[i2] = Math.max((float) this.f12243Q.m27520g(i2, ie0Var), 0.0f) * ((((float) C0677av.m26964a(Math.min(2600.0d, this.f12269n[i2]))) * 0.1f * f2) + f3) * f;
                i2++;
            }
        }

        @Override // com.daaw.zc0
        /* renamed from: o */
        public void mo2492o(C3239un c3239un) {
            synchronized (this.f12249W) {
                c3239un.m7982W("audioDurationMs", this.f12253a, "1_AudioCapture", 20, 300);
                c3239un.add_Checkbox("highQualityAudioCapture", this.f12255b, "1_AudioCapture");
                c3239un.m7982W("sampleOutCount", this.f12266k, "2_spectrum", 0, 512);
                c3239un.m7990O("lowerHz", this.f12261f, "2_spectrumHz", 0.0f, 300.0f);
                c3239un.m7990O("higherHz", this.f12262g, "2_spectrumHz", 300.0f, 18000.0f);
                c3239un.m7990O("hzLinearFactor", this.f12234H, "2_spectrumHz", 0.0f, 1.0f);
                c3239un.m7990O("freqShift", this.f12265j, "2_spectrumHz", 0.0f, 1.0f);
                c3239un.add_Checkbox("mirrorSamples", this.f12273r, "2_spectrum");
                c3239un.m7982W("repeatSamples", this.f12274s, "2_spectrum", 1, 6);
                c3239un.m7982W("starAndEndGap", this.f12263h, "2_spectrum", 0, 30);
                c3239un.m7990O("smooth", this.f12275t, "2_spectrum", 0.1f, 1.0f);
                c3239un.m7982W("filterRadius", this.f12243Q.m27521f(), "2_spectrum", 0, 20);
                c3239un.m7990O("filterStrength", this.f12243Q.m27519h(), "2_spectrum", 0.1f, 2.0f);
                c3239un.m7990O("beatSmooth", this.f12279x, "beat", 0.1f, 1.0f);
                c3239un.m7990O("beatRangeBarFirst", this.f12242P.m25649c(), "beat", 0.0f, 1.0f);
                c3239un.m7990O("beatRangeBarLast", this.f12242P.m25648d(), "beat", 0.0f, 1.0f);
                c3239un.m7990O("beatRangeValueLower", this.f12242P.m25647e(), "beat", 0.0f, 50.0f);
                c3239un.m7990O("beatRangeValueHigher", this.f12242P.m25646f(), "beat", 0.0f, 100.0f);
                c3239un.m7990O("lowerFreqMagnitude", this.f12235I, "2_spectrum", 0.0f, 1.0f);
                c3239un.m7990O("outputMultiplier", this.f12236J, "2_spectrum", 0.1f, 3.0f);
            }
        }

        /* renamed from: q */
        public float m20898q() {
            float f;
            synchronized (this.f12249W) {
                f = this.f12272q;
            }
            return f;
        }

        /* renamed from: r */
        public float m20897r() {
            float f;
            synchronized (this.f12249W) {
                f = this.f12241O;
            }
            return f;
        }

        /* renamed from: t */
        public double m20895t(double d, double d2, int i, int i2) {
            double d3 = i;
            double d4 = i2 - 1;
            Double.isNaN(d3);
            Double.isNaN(d4);
            return d * Math.pow(d2 / d, d3 / d4);
        }

        /* renamed from: u */
        public float[] m20894u(float f, sg0 sg0Var) {
            ke0 gd1Var;
            float f2;
            boolean z;
            int i;
            int i2;
            int i3;
            int i4;
            pw0[] pw0VarArr;
            float[] fArr;
            synchronized (this.f12249W) {
                int i5 = (int) (this.f12256b0 * 0.001f * this.f12253a);
                int mo2875b = sg0Var.mo2875b();
                if (mo2875b > 0) {
                    i5 = mo2875b;
                }
                C0729a mo2867j = sg0Var.mo2867j(i5);
                char c = 0;
                if (mo2867j != null) {
                    gd1Var = this.f12255b ? mo2867j.m26732k() : mo2867j.m26731l();
                    i = gd1Var.size();
                    boolean m26742a = mo2867j.m26742a();
                    i2 = mo2867j.f3947f;
                    f2 = mo2867j.f3945d;
                    float[] fArr2 = this.f12260e;
                    fArr2[0] = 0.0f;
                    fArr2[1] = mo2867j.f3946e;
                    z = m26742a;
                } else {
                    gd1Var = new gd1((short) 0, 4);
                    f2 = -1000.0f;
                    float[] fArr3 = this.f12260e;
                    fArr3[0] = 0.0f;
                    fArr3[1] = 1000.0f;
                    z = false;
                    i = 4;
                    i2 = 44100;
                }
                if (i < 4) {
                    gd1Var = new gd1((short) 0, 4);
                    i4 = 4;
                    i3 = 44100;
                } else {
                    i3 = i2;
                    i4 = i;
                }
                this.f12256b0 = i3;
                int length = this.f12268m.length;
                int i6 = this.f12266k;
                if (length != i6) {
                    this.f12268m = new float[i6];
                }
                int length2 = this.f12267l.length;
                float[] fArr4 = this.f12268m;
                if (length2 != fArr4.length) {
                    this.f12267l = new float[fArr4.length];
                    int i7 = 0;
                    while (true) {
                        float[] fArr5 = this.f12267l;
                        if (i7 >= fArr5.length) {
                            break;
                        }
                        fArr5[i7] = 0.0f;
                        i7++;
                    }
                }
                if (i4 != this.f12238L.length) {
                    this.f12238L = new float[i4];
                    for (int i8 = 0; i8 < i4; i8++) {
                        this.f12238L[i8] = C0888bv.m25810c(i8, i4) * 0.00390625f;
                    }
                }
                m20901I(this.f12260e);
                if (this.f12244R.length != i4) {
                    this.f12244R = new double[i4];
                }
                int i9 = 0;
                float f3 = 0.0f;
                while (i9 < this.f12244R.length) {
                    float f4 = gd1Var.get(i9) * this.f12238L[i9] * this.f12229C;
                    f3 += f4 * f4;
                    this.f12244R[i9] = f4;
                    i9++;
                    gd1Var = gd1Var;
                }
                if ((sg0Var.mo2870g() & 2) != 0) {
                    int length3 = this.f12246T.length;
                    yc1[] yc1VarArr = new yc1[length3];
                    final int i10 = 0;
                    while (i10 < this.f12246T.length) {
                        yc1VarArr[i10] = new yc1();
                        pw0[] pw0VarArr2 = this.f12246T;
                        if (pw0VarArr2[i10].f23426a != i3) {
                            pw0VarArr2[i10].m12996a(this.f12269n, i3);
                        }
                        pw0[] pw0VarArr3 = this.f12246T;
                        final int i11 = pw0VarArr3[c].f23428c;
                        final int length4 = i11 / pw0VarArr3.length;
                        int i12 = i10;
                        final yc1[] yc1VarArr2 = yc1VarArr;
                        final float f5 = f2;
                        int i13 = length3;
                        this.f12254a0.execute(new Runnable() { // from class: com.daaw.ia1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ha1.C1522b.this.m20896s(length4, i10, i11, f5, yc1VarArr2);
                            }
                        });
                        i10 = i12 + 1;
                        length3 = i13;
                        yc1VarArr = yc1VarArr2;
                        c = 0;
                    }
                    yc1[] yc1VarArr3 = yc1VarArr;
                    int i14 = length3;
                    for (int i15 = 0; i15 < i14; i15++) {
                        try {
                            yc1VarArr3[i15].m3863b();
                        } catch (InterruptedException unused) {
                        }
                    }
                } else {
                    int i16 = 0;
                    while (true) {
                        pw0VarArr = this.f12246T;
                        if (i16 >= pw0VarArr.length) {
                            break;
                        }
                        if (pw0VarArr[i16].f23426a != i3) {
                            pw0VarArr[i16].m12996a(this.f12269n, i3);
                        }
                        i16++;
                    }
                    pw0VarArr[0].m12995b(this.f12244R, 0, pw0VarArr[0].f23428c, this.f12247U, f2, this.f12260e[1]);
                }
                if (i4 > 0) {
                    f3 = (float) Math.sqrt(f3 / i4);
                }
                this.f12281z = f3;
                m20899j(this.f12268m, this.f12236J, this.f12273r, this.f12248V, i3, new float[2], this.f12271p, z);
                this.f12242P.m25645g(this.f12267l.length);
                C2691q6.m12756b("barValues == barSmoothValues", this.f12268m.length, this.f12267l.length);
                this.f12240N = 0.0f;
                float f6 = -10000.0f;
                int i17 = 0;
                while (true) {
                    float[] fArr6 = this.f12268m;
                    if (i17 < fArr6.length) {
                        if (fArr6[i17] > f6) {
                            f6 = fArr6[i17];
                            this.f12240N = i17;
                        }
                        float f7 = fArr6[i17];
                        float[] fArr7 = this.f12267l;
                        fArr7[i17] = fArr7[i17] + ((f7 - fArr7[i17]) * 20.0f * f * this.f12275t);
                        fArr7[i17] = Math.max(fArr7[i17], 0.0f);
                        this.f12242P.m25651a(i17, this.f12267l[i17]);
                        i17++;
                    } else {
                        this.f12271p[0] = this.f12242P.m25650b();
                        float f8 = this.f12272q;
                        float f9 = this.f12279x;
                        this.f12272q = (f8 * (1.0f - f9)) + (this.f12271p[0] * f9);
                        float length5 = this.f12240N / this.f12268m.length;
                        this.f12240N = length5;
                        float f10 = this.f12241O;
                        float f11 = this.f12239M;
                        this.f12241O = (f10 * (1.0f - f11)) + (length5 * f11);
                        fArr = this.f12267l;
                    }
                }
            }
            return fArr;
        }

        /* renamed from: v */
        public void m20893v(float f) {
            synchronized (this.f12249W) {
                this.f12235I = f;
            }
        }

        /* renamed from: w */
        public void m20892w(int i) {
            synchronized (this.f12249W) {
                this.f12280y = i;
            }
        }

        /* renamed from: x */
        public void m20891x(float f, float f2, float f3, float f4) {
            synchronized (this.f12249W) {
                this.f12242P.m25644h(f, f2, f3, f4);
            }
        }

        /* renamed from: y */
        public void m20890y(float f) {
            synchronized (this.f12249W) {
                this.f12279x = f;
            }
        }

        /* renamed from: z */
        public void m20889z(int i, float f) {
            synchronized (this.f12249W) {
                this.f12243Q = ad1.m27522e(i, f);
            }
        }
    }

    /* renamed from: com.daaw.ha1$c */
    /* loaded from: classes.dex */
    public class C1524c {

        /* renamed from: a */
        public float f12284a;

        /* renamed from: b */
        public sg0 f12285b;

        public C1524c(float f, sg0 sg0Var) {
            this.f12284a = f;
            this.f12285b = sg0Var;
        }
    }

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        this.f12222b.mo2493a(c3239un);
    }

    @Override // com.daaw.rd0
    /* renamed from: c */
    public float mo11409c() {
        return this.f12222b.m20898q();
    }

    @Override // com.daaw.fe0
    /* renamed from: f */
    public je0 mo18685f(int i, int i2, int i3, je0 je0Var) {
        return this.f12221a.m21039c(i, i2, i3, je0Var);
    }

    @Override // com.daaw.rd0
    /* renamed from: j */
    public float mo11408j() {
        return this.f12222b.m20897r();
    }

    @Override // com.daaw.fe0
    /* renamed from: n */
    public void mo18684n(de0 de0Var, sg0 sg0Var) {
        if (!de0Var.mo2888c()) {
            this.f12221a.m21040b(this.f12222b.m20894u(de0Var.mo2887d(), sg0Var));
            return;
        }
        m20910q();
        try {
            float[] poll = this.f12224d.poll(100L, TimeUnit.MILLISECONDS);
            if (poll != null) {
                this.f12221a.m21040b(poll);
            }
        } catch (InterruptedException unused) {
        }
        this.f12223c.offer(new C1524c(de0Var.mo2887d(), sg0Var));
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        this.f12222b.mo2492o(c3239un);
    }

    /* renamed from: q */
    public final void m20910q() {
        Thread thread = this.f12225e;
        if (thread == null || !thread.isAlive()) {
            lz1.m16365a("Starting audioProcessTh");
            Thread thread2 = new Thread(new RunnableC1521a());
            this.f12225e = thread2;
            thread2.start();
        }
    }
}
