package com.daaw;

import com.daaw.avee.comp.playback.C0729a;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class ga1 implements fe0, rd0 {

    /* renamed from: a */
    public h40 f10917a = new h40();

    /* renamed from: b */
    public final C1384b f10918b = new C1384b();

    /* renamed from: c */
    public final BlockingQueue<C1386c> f10919c = new ArrayBlockingQueue(1);

    /* renamed from: d */
    public final BlockingQueue<float[]> f10920d = new ArrayBlockingQueue(2);

    /* renamed from: e */
    public Thread f10921e = null;

    /* renamed from: com.daaw.ga1$a */
    /* loaded from: classes.dex */
    public class RunnableC1383a implements Runnable {
        public RunnableC1383a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1386c poll;
            while (true) {
                try {
                    poll = ga1.this.f10919c.poll(10000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
                if (poll == null) {
                    return;
                }
                ga1.this.f10920d.add(ga1.this.f10918b.m21859t(poll.f10974a, poll.f10975b));
            }
        }
    }

    /* renamed from: com.daaw.ga1$b */
    /* loaded from: classes.dex */
    public static class C1384b implements zc0 {

        /* renamed from: g */
        public float f10953g;

        /* renamed from: h */
        public float f10954h;

        /* renamed from: a */
        public int f10947a = 10;

        /* renamed from: b */
        public int f10948b = NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;

        /* renamed from: c */
        public double[] f10949c = new double[1];

        /* renamed from: d */
        public float[] f10950d = new float[1];

        /* renamed from: e */
        public float[] f10951e = new float[1];

        /* renamed from: f */
        public float[] f10952f = new float[2];

        /* renamed from: i */
        public int f10955i = 0;

        /* renamed from: j */
        public int f10956j = 0;

        /* renamed from: k */
        public float f10957k = 0.0f;

        /* renamed from: l */
        public int f10958l = 64;

        /* renamed from: m */
        public float[] f10959m = new float[1];

        /* renamed from: n */
        public float[] f10960n = new float[1];

        /* renamed from: o */
        public float[] f10961o = new float[1];

        /* renamed from: p */
        public float[] f10962p = new float[1];

        /* renamed from: q */
        public float[] f10963q = new float[1];

        /* renamed from: r */
        public float f10964r = 0.0f;

        /* renamed from: s */
        public boolean f10965s = false;

        /* renamed from: t */
        public int f10966t = 1;

        /* renamed from: u */
        public float f10967u = 0.8f;

        /* renamed from: v */
        public float f10968v = 1.0f;

        /* renamed from: w */
        public final float f10969w = 300.0f;

        /* renamed from: x */
        public final float f10970x = 0.9f;

        /* renamed from: y */
        public final float f10971y = 0.01f;

        /* renamed from: z */
        public float f10972z = 0.4f;

        /* renamed from: A */
        public int f10923A = 4;

        /* renamed from: B */
        public float f10924B = 0.0f;

        /* renamed from: C */
        public float f10925C = 1000.0f;

        /* renamed from: D */
        public float f10926D = 0.0f;

        /* renamed from: E */
        public float f10927E = 1.0f;

        /* renamed from: F */
        public float f10928F = 0.0f;

        /* renamed from: G */
        public int[] f10929G = new int[0];

        /* renamed from: H */
        public float[] f10930H = new float[0];

        /* renamed from: I */
        public float f10931I = 1.0f;

        /* renamed from: J */
        public int f10932J = 2;

        /* renamed from: K */
        public float f10933K = 0.0f;

        /* renamed from: L */
        public float f10934L = 0.2f;

        /* renamed from: M */
        public float f10935M = 1.0f;

        /* renamed from: N */
        public boolean f10936N = true;

        /* renamed from: O */
        public float[] f10937O = new float[0];

        /* renamed from: P */
        public float f10938P = 0.5f;

        /* renamed from: Q */
        public float f10939Q = 0.0f;

        /* renamed from: R */
        public float f10940R = 0.0f;

        /* renamed from: S */
        public c31 f10941S = new c31(0.5f);

        /* renamed from: T */
        public zc1 f10942T = new zc1().m2491a(1, 1.0f);

        /* renamed from: U */
        public double[] f10943U = new double[0];

        /* renamed from: V */
        public int f10944V = 0;

        /* renamed from: W */
        public f00 f10945W = new ql0();

        /* renamed from: X */
        public ie0 f10946X = new C1385a();

        /* renamed from: com.daaw.ga1$b$a */
        /* loaded from: classes.dex */
        public class C1385a implements ie0 {
            public C1385a() {
            }

            @Override // com.daaw.ie0
            public double get(int i) {
                double[] dArr = C1384b.this.f10943U;
                int i2 = i * 2;
                int i3 = i2 + 1;
                return Math.sqrt((dArr[i2] * dArr[i2]) + (dArr[i3] * dArr[i3]));
            }

            @Override // com.daaw.ie0
            public int size() {
                return C1384b.this.f10943U.length / 2;
            }
        }

        public C1384b() {
            m21869D(64, 0.06f, 0);
            m21853z(1);
            m21871B(11);
            m21856w(0.0f, 0.2f, 0.7f, 35.0f);
            m21854y(1, 1.0f);
        }

        /* renamed from: s */
        public static double m21860s(double d, double d2, int i, int i2) {
            double d3 = i;
            double d4 = i2 - 1;
            Double.isNaN(d3);
            Double.isNaN(d4);
            return d * Math.pow(d2 / d, d3 / d4);
        }

        /* renamed from: A */
        public final synchronized void m21872A(float f) {
            this.f10935M = f;
        }

        /* renamed from: B */
        public final void m21871B(int i) {
            this.f10947a = i;
            this.f10948b = Math.min(Math.max(1 << i, 32), 8192);
        }

        /* renamed from: C */
        public final synchronized void m21870C(int i, float f, float f2, boolean z, int i2, float f3, int i3, int i4, float f4) {
            this.f10953g = Math.max(f, 0.1f);
            this.f10954h = f2;
            this.f10958l = Math.max(1, Math.min(i, 10000));
            this.f10965s = z;
            this.f10966t = Math.max(i2, 1);
            this.f10933K = f3;
            int i5 = this.f10958l;
            this.f10961o = new float[i5];
            this.f10962p = new float[i5];
            this.f10955i = i3;
            this.f10956j = i4;
            this.f10957k = f4;
            m21866G(i5, this.f10953g, f2, z, f3, i3, i4, f4);
            m21857v(6);
        }

        /* renamed from: D */
        public final void m21869D(int i, float f, int i2) {
            m21870C(i, 20.0f, 18000.0f, false, 1, f, i2, i2, 0.0f);
        }

        /* renamed from: E */
        public final synchronized void m21868E(float f) {
            this.f10967u = f;
        }

        /* renamed from: F */
        public final synchronized void m21867F(float f) {
            this.f10968v = f;
        }

        /* renamed from: G */
        public final void m21866G(int i, float f, float f2, boolean z, float f3, int i2, int i3, float f4) {
            int max = Math.max(0, i2);
            int max2 = Math.max(0, i3);
            boolean z2 = z && i > 1;
            int i4 = z2 ? i / 2 : i;
            int i5 = ((z2 ? i / 2 : i) - max) - max2;
            int max3 = Math.max(i5 / this.f10966t, 1);
            for (int i6 = 0; i6 < i; i6++) {
                this.f10961o[i6] = 0.0f;
            }
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            float f5 = Float.MAX_VALUE;
            float f6 = 0.0f;
            while (i9 < i5) {
                int i10 = ((i9 - ((int) (i5 * f4))) + i5) % max3;
                int i11 = i9 + max;
                int i12 = i5;
                int i13 = max;
                int i14 = i7;
                int i15 = i8;
                int i16 = i9;
                this.f10961o[i11] = (float) m21860s(f, f2, i10, max3);
                float[] fArr = this.f10961o;
                fArr[i11] = (fArr[i11] * (1.0f - f3)) + ((f + ((f2 - f) * i10 * (1.0f / max3))) * f3);
                if (f5 > fArr[i11]) {
                    f5 = fArr[i11];
                    i7 = i11;
                } else {
                    i7 = i14;
                }
                if (f6 < fArr[i11]) {
                    f6 = fArr[i11];
                    i8 = i11;
                } else {
                    i8 = i15;
                }
                i9 = i16 + 1;
                i5 = i12;
                max = i13;
            }
            int i17 = max;
            int i18 = i5;
            int i19 = i7;
            int i20 = i8;
            int i21 = 0;
            while (i21 < i) {
                int i22 = i17;
                float f7 = (i21 <= i22 || i21 == i19) ? this.f10961o[i21] : this.f10961o[((i21 - 1) + i) % i];
                float f8 = (i21 >= (i18 - max2) - 1 || i21 == i20) ? this.f10961o[i21] : this.f10961o[(i21 + 1) % i];
                this.f10962p[i21] = Math.min(f7, f8);
                if (f7 < 0.0f) {
                    if (f8 < 0.0f) {
                        this.f10962p[i21] = 0.0f;
                    } else {
                        this.f10962p[i21] = f8;
                    }
                } else if (f7 < 0.0f) {
                    this.f10962p[i21] = 0.0f;
                } else {
                    this.f10962p[i21] = f7;
                }
                i21++;
                i17 = i22;
            }
            for (int i23 = 0; i23 < i; i23++) {
                float[] fArr2 = this.f10961o;
                if (fArr2[i23] < 0.0f) {
                    fArr2[i23] = 0.0f;
                }
                float[] fArr3 = this.f10962p;
                if (fArr3[i23] < 0.0f) {
                    fArr3[i23] = 0.0f;
                }
            }
            int i24 = i - 1;
            int i25 = 1;
            for (int i26 = i24; i26 >= i4; i26--) {
                float[] fArr4 = this.f10961o;
                fArr4[i26] = fArr4[i25];
                float[] fArr5 = this.f10962p;
                fArr5[i26] = fArr5[i25];
                i25 = Math.min(i25 + 1, i24);
            }
        }

        /* renamed from: H */
        public final void m21865H(float[] fArr) {
            float f;
            float f2;
            float f3 = (this.f10926D * 0.100000024f) + (fArr[0] * 0.9f);
            this.f10926D = f3;
            float f4 = fArr[1];
            float f5 = this.f10925C;
            if (f4 > f5) {
                f = f5 * 0.100000024f;
                f2 = fArr[1] * 0.9f;
            } else {
                f = f5 * 0.99f;
                f2 = fArr[1] * 0.01f;
            }
            this.f10925C = f + f2;
            float f6 = this.f10925C - f3;
            this.f10927E = f6;
            if (f6 < 1.0f) {
                this.f10927E = 1.0f;
            }
            this.f10927E = 300.0f / this.f10927E;
        }

        @Override // com.daaw.zc0
        /* renamed from: a */
        public synchronized void mo2493a(C3239un c3239un) {
            m21871B(c3239un.m7947r("fftSize", 11));
            m21870C(c3239un.m7947r("sampleOutCount", 128), c3239un.m7953o("lowerHz", 20.0f), c3239un.m7953o("higherHz", 18000.0f), c3239un.m7955n("mirrorSamples", false), c3239un.m7947r("repeatSamples", 1), c3239un.m7953o("hzLinearFactor", 0.06f), c3239un.m7947r("starAndEndGap", 0), c3239un.m7947r("starAndEndGap", 0), c3239un.m7953o("freqShift", 0.0f));
            m21868E(c3239un.m7953o("smooth", 0.8f));
            m21867F(c3239un.m7953o("preSmooth", 1.0f));
            m21854y(c3239un.m7947r("filterRadius", 1), c3239un.m7953o("filterStrength", 1.0f));
            m21855x(c3239un.m7953o("beatSmooth", 0.4f));
            m21856w(c3239un.m7953o("beatRangeBarFirst", 0.0f), c3239un.m7953o("beatRangeBarLast", 0.2f), c3239un.m7953o("beatRangeValueLower", 0.7f), c3239un.m7953o("beatRangeValueHigher", 35.0f));
            m21858u(c3239un.m7953o("aWeight", 0.2f));
            m21872A(c3239un.m7953o("outputMultiplier", 1.0f));
        }

        /* renamed from: j */
        public final void m21863j(float[] fArr, float f, boolean z, ie0 ie0Var, int i, float[] fArr2, float[] fArr3, boolean z2) {
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
            if (this.f10949c.length != ie0Var.size()) {
                this.f10949c = new double[ie0Var.size()];
                this.f10950d = new float[ie0Var.size()];
                int i3 = 0;
                while (true) {
                    float[] fArr4 = this.f10950d;
                    if (i3 >= fArr4.length) {
                        break;
                    }
                    fArr4[i3] = 0.0f;
                    i3++;
                }
            }
            for (int i4 = 0; i4 < this.f10949c.length; i4++) {
                float max = Math.max((float) this.f10942T.m2489c(i4, ie0Var), 0.0f);
                if (this.f10934L > 0.0f) {
                    float m26962c = (float) C0677av.m26962c(C0677av.m26963b(i4, this.f10949c.length, i));
                    float f2 = this.f10934L;
                    max *= (1.0f - f2) + (f2 * m26962c * m26962c * m26962c);
                }
                double[] dArr = this.f10949c;
                double d = dArr[i4];
                float f3 = this.f10968v;
                double d2 = 1.0f - f3;
                Double.isNaN(d2);
                double d3 = max * f3;
                Double.isNaN(d3);
                dArr[i4] = (d * d2) + d3;
            }
            int size = ie0Var.size();
            if (z2) {
                size *= 2;
            }
            float f4 = i / size;
            fArr[0] = 0.0f;
            while (i2 < fArr.length) {
                float abs = ((Math.abs(this.f10961o[i2] - this.f10962p[i2]) / 50.0f) * 0.3f) + 0.7f;
                int i5 = (int) (this.f10962p[i2] / f4);
                fArr[i2] = 0.0f;
                int min = Math.min((int) (this.f10961o[i2] / f4), this.f10949c.length);
                for (int i6 = i5; i6 < min; i6++) {
                    fArr[i2] = fArr[i2] + (((float) this.f10949c[i6]) / (min - i5));
                }
                fArr[i2] = fArr[i2] * abs * f;
                i2++;
            }
        }

        @Override // com.daaw.zc0
        /* renamed from: o */
        public synchronized void mo2492o(C3239un c3239un) {
            c3239un.m7982W("fftSize", this.f10947a, "Performance", 7, 13);
            c3239un.m7982W("sampleOutCount", this.f10958l, "1_spectrum", 0, 512);
            c3239un.m7990O("lowerHz", this.f10953g, "1_spectrumHz", 0.0f, 300.0f);
            c3239un.m7990O("higherHz", this.f10954h, "1_spectrumHz", 300.0f, 18000.0f);
            c3239un.m7990O("hzLinearFactor", this.f10933K, "1_spectrumHz", 0.0f, 1.0f);
            c3239un.m7990O("freqShift", this.f10957k, "1_spectrumHz", 0.0f, 1.0f);
            c3239un.add_Checkbox("mirrorSamples", this.f10965s, "1_spectrum");
            c3239un.m7982W("repeatSamples", this.f10966t, "1_spectrum", 1, 6);
            c3239un.m7982W("starAndEndGap", this.f10955i, "1_spectrum", 0, 30);
            c3239un.m7990O("smooth", this.f10967u, "1_spectrum", 0.1f, 1.0f);
            c3239un.m7990O("preSmooth", this.f10968v, "1_spectrum", 0.1f, 1.0f);
            c3239un.m7982W("filterRadius", this.f10942T.m2490b(), "1_spectrum", 0, 20);
            c3239un.m7990O("filterStrength", this.f10942T.m2488d(), "1_spectrum", 0.1f, 2.0f);
            c3239un.m7990O("beatSmooth", this.f10972z, "beat", 0.1f, 1.0f);
            c3239un.m7990O("beatRangeBarFirst", this.f10941S.m25649c(), "beat", 0.0f, 1.0f);
            c3239un.m7990O("beatRangeBarLast", this.f10941S.m25648d(), "beat", 0.0f, 1.0f);
            c3239un.m7990O("beatRangeValueLower", this.f10941S.m25647e(), "beat", 0.0f, 50.0f);
            c3239un.m7990O("beatRangeValueHigher", this.f10941S.m25646f(), "beat", 0.0f, 100.0f);
            c3239un.m7990O("aWeight", this.f10934L, "1_spectrum", 0.0f, 1.0f);
            c3239un.m7990O("outputMultiplier", this.f10935M, "1_spectrum", 0.1f, 3.0f);
        }

        /* renamed from: q */
        public synchronized float m21862q() {
            return this.f10964r;
        }

        /* renamed from: r */
        public synchronized float m21861r() {
            return this.f10940R;
        }

        /* renamed from: t */
        public final synchronized float[] m21859t(float f, sg0 sg0Var) {
            ke0 gd1Var;
            int i;
            int i2;
            boolean z;
            int i3;
            int mo2875b = sg0Var.mo2875b();
            if (mo2875b <= 0) {
                mo2875b = this.f10948b;
            }
            C0729a mo2867j = sg0Var.mo2867j(mo2875b);
            int i4 = 4;
            if (mo2867j != null) {
                gd1Var = mo2867j.m26731l();
                i = gd1Var.size();
                boolean m26742a = mo2867j.m26742a();
                i2 = mo2867j.f3947f;
                float[] fArr = this.f10952f;
                fArr[0] = 0.0f;
                fArr[1] = mo2867j.f3946e;
                z = m26742a;
            } else {
                gd1Var = new gd1((short) 0, 4);
                float[] fArr2 = this.f10952f;
                fArr2[0] = 0.0f;
                fArr2[1] = 1000.0f;
                i = 4;
                i2 = 44100;
                z = false;
            }
            if (i < 4) {
                gd1Var = new gd1((short) 0, 4);
                i3 = 44100;
            } else {
                i4 = i;
                i3 = i2;
            }
            int length = this.f10960n.length;
            int i5 = this.f10958l;
            if (length != i5) {
                this.f10960n = new float[i5];
            }
            int length2 = this.f10959m.length;
            float[] fArr3 = this.f10960n;
            if (length2 != fArr3.length) {
                this.f10959m = new float[fArr3.length];
                int i6 = 0;
                while (true) {
                    float[] fArr4 = this.f10959m;
                    if (i6 >= fArr4.length) {
                        break;
                    }
                    fArr4[i6] = 0.0f;
                    i6++;
                }
            }
            if (i4 != this.f10937O.length) {
                this.f10937O = new float[i4];
                for (int i7 = 0; i7 < i4; i7++) {
                    this.f10937O[i7] = C0888bv.m25810c(i7, i4) * 0.00390625f;
                }
            }
            m21865H(this.f10952f);
            if (this.f10943U.length != i4) {
                this.f10943U = new double[i4];
            }
            float f2 = 0.0f;
            for (int i8 = 0; i8 < this.f10943U.length; i8++) {
                float f3 = gd1Var.get(i8) * this.f10937O[i8] * this.f10927E;
                f2 += f3 * f3;
                this.f10943U[i8] = f3;
            }
            if (this.f10944V != i4) {
                this.f10944V = i4;
                this.f10945W.mo12359a(i4);
            }
            this.f10945W.mo12358b(this.f10943U, true);
            if (i4 > 0) {
                f2 = (float) Math.sqrt(f2 / i4);
            }
            this.f10924B = f2;
            m21863j(this.f10960n, this.f10935M, this.f10965s, this.f10946X, i3, new float[2], this.f10963q, z);
            this.f10941S.m25645g(this.f10959m.length);
            C2691q6.m12757a(this.f10960n.length, this.f10959m.length);
            this.f10939Q = 0.0f;
            float f4 = -10000.0f;
            int i9 = 0;
            while (true) {
                float[] fArr5 = this.f10960n;
                if (i9 < fArr5.length) {
                    if (fArr5[i9] > f4) {
                        f4 = fArr5[i9];
                        this.f10939Q = i9;
                    }
                    float f5 = fArr5[i9];
                    float[] fArr6 = this.f10959m;
                    fArr6[i9] = fArr6[i9] + ((f5 - fArr6[i9]) * 20.0f * f * this.f10967u);
                    fArr6[i9] = Math.max(fArr6[i9], 0.0f);
                    this.f10941S.m25651a(i9, this.f10959m[i9]);
                    i9++;
                } else {
                    this.f10963q[0] = this.f10941S.m25650b();
                    float f6 = this.f10964r;
                    float f7 = this.f10972z;
                    this.f10964r = (f6 * (1.0f - f7)) + (this.f10963q[0] * f7);
                    float length3 = this.f10939Q / this.f10960n.length;
                    this.f10939Q = length3;
                    float f8 = this.f10940R;
                    float f9 = this.f10938P;
                    this.f10940R = (f8 * (1.0f - f9)) + (length3 * f9);
                }
            }
            return this.f10959m;
        }

        /* renamed from: u */
        public final synchronized void m21858u(float f) {
            this.f10934L = f;
        }

        /* renamed from: v */
        public synchronized void m21857v(int i) {
            this.f10923A = i;
        }

        /* renamed from: w */
        public final synchronized void m21856w(float f, float f2, float f3, float f4) {
            this.f10941S.m25644h(f, f2, f3, f4);
        }

        /* renamed from: x */
        public final synchronized void m21855x(float f) {
            this.f10972z = f;
        }

        /* renamed from: y */
        public final synchronized void m21854y(int i, float f) {
            this.f10942T.m2491a(i, f);
        }

        /* renamed from: z */
        public synchronized void m21853z(int i) {
            if (i < 1) {
                i = 1;
            }
            int[] iArr = new int[i + 1 + i];
            this.f10929G = iArr;
            this.f10930H = new float[iArr.length];
            this.f10931I = iArr.length;
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.f10929G;
                if (i2 < iArr2.length) {
                    int i3 = i2 - i;
                    iArr2[i2] = i3;
                    this.f10930H[i2] = C0888bv.m25811b(((iArr2.length + 2) / 2) + i3, iArr2.length + 2);
                    i2++;
                }
            }
        }
    }

    /* renamed from: com.daaw.ga1$c */
    /* loaded from: classes.dex */
    public static class C1386c {

        /* renamed from: a */
        public float f10974a;

        /* renamed from: b */
        public sg0 f10975b;

        public C1386c(float f, sg0 sg0Var) {
            this.f10974a = f;
            this.f10975b = sg0Var;
        }
    }

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        this.f10918b.mo2493a(c3239un);
    }

    @Override // com.daaw.rd0
    /* renamed from: c */
    public float mo11409c() {
        return this.f10918b.m21862q();
    }

    @Override // com.daaw.fe0
    /* renamed from: f */
    public je0 mo18685f(int i, int i2, int i3, je0 je0Var) {
        return this.f10917a.m21039c(i, i2, i3, je0Var);
    }

    @Override // com.daaw.rd0
    /* renamed from: j */
    public float mo11408j() {
        return this.f10918b.m21861r();
    }

    @Override // com.daaw.fe0
    /* renamed from: n */
    public void mo18684n(de0 de0Var, sg0 sg0Var) {
        if (!de0Var.mo2888c()) {
            this.f10917a.m21040b(this.f10918b.m21859t(de0Var.mo2887d(), sg0Var));
            return;
        }
        m21873q();
        try {
            float[] poll = this.f10920d.poll(100L, TimeUnit.MILLISECONDS);
            if (poll != null) {
                this.f10917a.m21040b(poll);
            }
        } catch (InterruptedException unused) {
        }
        this.f10919c.offer(new C1386c(de0Var.mo2887d(), sg0Var));
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        this.f10918b.mo2492o(c3239un);
    }

    /* renamed from: q */
    public final void m21873q() {
        Thread thread = this.f10921e;
        if (thread == null || !thread.isAlive()) {
            lz1.m16365a("Starting audioProcessTh");
            Thread thread2 = new Thread(new RunnableC1383a());
            this.f10921e = thread2;
            thread2.start();
        }
    }
}
