package com.daaw;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class ga1 implements fe0, rd0 {
    public h40 a = new h40();
    public final b b = new b();
    public final BlockingQueue<c> c = new ArrayBlockingQueue(1);
    public final BlockingQueue<float[]> d = new ArrayBlockingQueue(2);
    public Thread e = null;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c poll;
            while (true) {
                try {
                    poll = ga1.this.c.poll(10000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
                if (poll == null) {
                    return;
                }
                ga1.this.d.add(ga1.this.b.t(poll.a, poll.b));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements zc0 {
        public float g;
        public float h;
        public int a = 10;
        public int b = NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
        public double[] c = new double[1];
        public float[] d = new float[1];
        public float[] e = new float[1];
        public float[] f = new float[2];
        public int i = 0;
        public int j = 0;
        public float k = 0.0f;
        public int l = 64;
        public float[] m = new float[1];
        public float[] n = new float[1];
        public float[] o = new float[1];
        public float[] p = new float[1];
        public float[] q = new float[1];
        public float r = 0.0f;
        public boolean s = false;
        public int t = 1;
        public float u = 0.8f;
        public float v = 1.0f;
        public final float w = 300.0f;
        public final float x = 0.9f;
        public final float y = 0.01f;
        public float z = 0.4f;
        public int A = 4;
        public float B = 0.0f;
        public float C = 1000.0f;
        public float D = 0.0f;
        public float E = 1.0f;
        public float F = 0.0f;
        public int[] G = new int[0];
        public float[] H = new float[0];
        public float I = 1.0f;
        public int J = 2;
        public float K = 0.0f;
        public float L = 0.2f;
        public float M = 1.0f;
        public boolean N = true;
        public float[] O = new float[0];
        public float P = 0.5f;
        public float Q = 0.0f;
        public float R = 0.0f;
        public c31 S = new c31(0.5f);
        public zc1 T = new zc1().a(1, 1.0f);
        public double[] U = new double[0];
        public int V = 0;
        public f00 W = new ql0();
        public ie0 X = new a();

        /* loaded from: classes.dex */
        public class a implements ie0 {
            public a() {
            }

            @Override // com.daaw.ie0
            public double get(int i) {
                double[] dArr = b.this.U;
                int i2 = i * 2;
                int i3 = i2 + 1;
                return Math.sqrt((dArr[i2] * dArr[i2]) + (dArr[i3] * dArr[i3]));
            }

            @Override // com.daaw.ie0
            public int size() {
                return b.this.U.length / 2;
            }
        }

        public b() {
            D(64, 0.06f, 0);
            z(1);
            B(11);
            w(0.0f, 0.2f, 0.7f, 35.0f);
            y(1, 1.0f);
        }

        public static double s(double d, double d2, int i, int i2) {
            double d3 = i;
            double d4 = i2 - 1;
            Double.isNaN(d3);
            Double.isNaN(d4);
            return d * Math.pow(d2 / d, d3 / d4);
        }

        public final synchronized void A(float f) {
            this.M = f;
        }

        public final void B(int i) {
            this.a = i;
            this.b = Math.min(Math.max(1 << i, 32), 8192);
        }

        public final synchronized void C(int i, float f, float f2, boolean z, int i2, float f3, int i3, int i4, float f4) {
            this.g = Math.max(f, 0.1f);
            this.h = f2;
            this.l = Math.max(1, Math.min(i, 10000));
            this.s = z;
            this.t = Math.max(i2, 1);
            this.K = f3;
            int i5 = this.l;
            this.o = new float[i5];
            this.p = new float[i5];
            this.i = i3;
            this.j = i4;
            this.k = f4;
            G(i5, this.g, f2, z, f3, i3, i4, f4);
            v(6);
        }

        public final void D(int i, float f, int i2) {
            C(i, 20.0f, 18000.0f, false, 1, f, i2, i2, 0.0f);
        }

        public final synchronized void E(float f) {
            this.u = f;
        }

        public final synchronized void F(float f) {
            this.v = f;
        }

        public final void G(int i, float f, float f2, boolean z, float f3, int i2, int i3, float f4) {
            int max = Math.max(0, i2);
            int max2 = Math.max(0, i3);
            boolean z2 = z && i > 1;
            int i4 = z2 ? i / 2 : i;
            int i5 = ((z2 ? i / 2 : i) - max) - max2;
            int max3 = Math.max(i5 / this.t, 1);
            for (int i6 = 0; i6 < i; i6++) {
                this.o[i6] = 0.0f;
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
                this.o[i11] = (float) s(f, f2, i10, max3);
                float[] fArr = this.o;
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
                float f7 = (i21 <= i22 || i21 == i19) ? this.o[i21] : this.o[((i21 - 1) + i) % i];
                float f8 = (i21 >= (i18 - max2) - 1 || i21 == i20) ? this.o[i21] : this.o[(i21 + 1) % i];
                this.p[i21] = Math.min(f7, f8);
                if (f7 < 0.0f) {
                    if (f8 < 0.0f) {
                        this.p[i21] = 0.0f;
                    } else {
                        this.p[i21] = f8;
                    }
                } else if (f7 < 0.0f) {
                    this.p[i21] = 0.0f;
                } else {
                    this.p[i21] = f7;
                }
                i21++;
                i17 = i22;
            }
            for (int i23 = 0; i23 < i; i23++) {
                float[] fArr2 = this.o;
                if (fArr2[i23] < 0.0f) {
                    fArr2[i23] = 0.0f;
                }
                float[] fArr3 = this.p;
                if (fArr3[i23] < 0.0f) {
                    fArr3[i23] = 0.0f;
                }
            }
            int i24 = i - 1;
            int i25 = 1;
            for (int i26 = i24; i26 >= i4; i26--) {
                float[] fArr4 = this.o;
                fArr4[i26] = fArr4[i25];
                float[] fArr5 = this.p;
                fArr5[i26] = fArr5[i25];
                i25 = Math.min(i25 + 1, i24);
            }
        }

        public final void H(float[] fArr) {
            float f;
            float f2;
            float f3 = (this.D * 0.100000024f) + (fArr[0] * 0.9f);
            this.D = f3;
            float f4 = fArr[1];
            float f5 = this.C;
            if (f4 > f5) {
                f = f5 * 0.100000024f;
                f2 = fArr[1] * 0.9f;
            } else {
                f = f5 * 0.99f;
                f2 = fArr[1] * 0.01f;
            }
            this.C = f + f2;
            float f6 = this.C - f3;
            this.E = f6;
            if (f6 < 1.0f) {
                this.E = 1.0f;
            }
            this.E = 300.0f / this.E;
        }

        @Override // com.daaw.zc0
        public synchronized void a(un unVar) {
            B(unVar.r("fftSize", 11));
            C(unVar.r("sampleOutCount", 128), unVar.o("lowerHz", 20.0f), unVar.o("higherHz", 18000.0f), unVar.n("mirrorSamples", false), unVar.r("repeatSamples", 1), unVar.o("hzLinearFactor", 0.06f), unVar.r("starAndEndGap", 0), unVar.r("starAndEndGap", 0), unVar.o("freqShift", 0.0f));
            E(unVar.o("smooth", 0.8f));
            F(unVar.o("preSmooth", 1.0f));
            y(unVar.r("filterRadius", 1), unVar.o("filterStrength", 1.0f));
            x(unVar.o("beatSmooth", 0.4f));
            w(unVar.o("beatRangeBarFirst", 0.0f), unVar.o("beatRangeBarLast", 0.2f), unVar.o("beatRangeValueLower", 0.7f), unVar.o("beatRangeValueHigher", 35.0f));
            u(unVar.o("aWeight", 0.2f));
            A(unVar.o("outputMultiplier", 1.0f));
        }

        public final void j(float[] fArr, float f, boolean z, ie0 ie0Var, int i, float[] fArr2, float[] fArr3, boolean z2) {
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
            if (this.c.length != ie0Var.size()) {
                this.c = new double[ie0Var.size()];
                this.d = new float[ie0Var.size()];
                int i3 = 0;
                while (true) {
                    float[] fArr4 = this.d;
                    if (i3 >= fArr4.length) {
                        break;
                    }
                    fArr4[i3] = 0.0f;
                    i3++;
                }
            }
            for (int i4 = 0; i4 < this.c.length; i4++) {
                float max = Math.max((float) this.T.c(i4, ie0Var), 0.0f);
                if (this.L > 0.0f) {
                    float c = (float) av.c(av.b(i4, this.c.length, i));
                    float f2 = this.L;
                    max *= (1.0f - f2) + (f2 * c * c * c);
                }
                double[] dArr = this.c;
                double d = dArr[i4];
                float f3 = this.v;
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
                float abs = ((Math.abs(this.o[i2] - this.p[i2]) / 50.0f) * 0.3f) + 0.7f;
                int i5 = (int) (this.p[i2] / f4);
                fArr[i2] = 0.0f;
                int min = Math.min((int) (this.o[i2] / f4), this.c.length);
                for (int i6 = i5; i6 < min; i6++) {
                    fArr[i2] = fArr[i2] + (((float) this.c[i6]) / (min - i5));
                }
                fArr[i2] = fArr[i2] * abs * f;
                i2++;
            }
        }

        @Override // com.daaw.zc0
        public synchronized void o(un unVar) {
            unVar.W("fftSize", this.a, "Performance", 7, 13);
            unVar.W("sampleOutCount", this.l, "1_spectrum", 0, 512);
            unVar.O("lowerHz", this.g, "1_spectrumHz", 0.0f, 300.0f);
            unVar.O("higherHz", this.h, "1_spectrumHz", 300.0f, 18000.0f);
            unVar.O("hzLinearFactor", this.K, "1_spectrumHz", 0.0f, 1.0f);
            unVar.O("freqShift", this.k, "1_spectrumHz", 0.0f, 1.0f);
            unVar.L("mirrorSamples", this.s, "1_spectrum");
            unVar.W("repeatSamples", this.t, "1_spectrum", 1, 6);
            unVar.W("starAndEndGap", this.i, "1_spectrum", 0, 30);
            unVar.O("smooth", this.u, "1_spectrum", 0.1f, 1.0f);
            unVar.O("preSmooth", this.v, "1_spectrum", 0.1f, 1.0f);
            unVar.W("filterRadius", this.T.b(), "1_spectrum", 0, 20);
            unVar.O("filterStrength", this.T.d(), "1_spectrum", 0.1f, 2.0f);
            unVar.O("beatSmooth", this.z, "beat", 0.1f, 1.0f);
            unVar.O("beatRangeBarFirst", this.S.c(), "beat", 0.0f, 1.0f);
            unVar.O("beatRangeBarLast", this.S.d(), "beat", 0.0f, 1.0f);
            unVar.O("beatRangeValueLower", this.S.e(), "beat", 0.0f, 50.0f);
            unVar.O("beatRangeValueHigher", this.S.f(), "beat", 0.0f, 100.0f);
            unVar.O("aWeight", this.L, "1_spectrum", 0.0f, 1.0f);
            unVar.O("outputMultiplier", this.M, "1_spectrum", 0.1f, 3.0f);
        }

        public synchronized float q() {
            return this.r;
        }

        public synchronized float r() {
            return this.R;
        }

        public final synchronized float[] t(float f, sg0 sg0Var) {
            ke0 gd1Var;
            int i;
            int i2;
            boolean z;
            int i3;
            int b = sg0Var.b();
            if (b <= 0) {
                b = this.b;
            }
            com.daaw.avee.comp.playback.a j = sg0Var.j(b);
            int i4 = 4;
            if (j != null) {
                gd1Var = j.l();
                i = gd1Var.size();
                boolean a2 = j.a();
                i2 = j.f;
                float[] fArr = this.f;
                fArr[0] = 0.0f;
                fArr[1] = j.e;
                z = a2;
            } else {
                gd1Var = new gd1((short) 0, 4);
                float[] fArr2 = this.f;
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
            int length = this.n.length;
            int i5 = this.l;
            if (length != i5) {
                this.n = new float[i5];
            }
            int length2 = this.m.length;
            float[] fArr3 = this.n;
            if (length2 != fArr3.length) {
                this.m = new float[fArr3.length];
                int i6 = 0;
                while (true) {
                    float[] fArr4 = this.m;
                    if (i6 >= fArr4.length) {
                        break;
                    }
                    fArr4[i6] = 0.0f;
                    i6++;
                }
            }
            if (i4 != this.O.length) {
                this.O = new float[i4];
                for (int i7 = 0; i7 < i4; i7++) {
                    this.O[i7] = bv.c(i7, i4) * 0.00390625f;
                }
            }
            H(this.f);
            if (this.U.length != i4) {
                this.U = new double[i4];
            }
            float f2 = 0.0f;
            for (int i8 = 0; i8 < this.U.length; i8++) {
                float f3 = gd1Var.get(i8) * this.O[i8] * this.E;
                f2 += f3 * f3;
                this.U[i8] = f3;
            }
            if (this.V != i4) {
                this.V = i4;
                this.W.a(i4);
            }
            this.W.b(this.U, true);
            if (i4 > 0) {
                f2 = (float) Math.sqrt(f2 / i4);
            }
            this.B = f2;
            j(this.n, this.M, this.s, this.X, i3, new float[2], this.q, z);
            this.S.g(this.m.length);
            q6.a(this.n.length, this.m.length);
            this.Q = 0.0f;
            float f4 = -10000.0f;
            int i9 = 0;
            while (true) {
                float[] fArr5 = this.n;
                if (i9 < fArr5.length) {
                    if (fArr5[i9] > f4) {
                        f4 = fArr5[i9];
                        this.Q = i9;
                    }
                    float f5 = fArr5[i9];
                    float[] fArr6 = this.m;
                    fArr6[i9] = fArr6[i9] + ((f5 - fArr6[i9]) * 20.0f * f * this.u);
                    fArr6[i9] = Math.max(fArr6[i9], 0.0f);
                    this.S.a(i9, this.m[i9]);
                    i9++;
                } else {
                    this.q[0] = this.S.b();
                    float f6 = this.r;
                    float f7 = this.z;
                    this.r = (f6 * (1.0f - f7)) + (this.q[0] * f7);
                    float length3 = this.Q / this.n.length;
                    this.Q = length3;
                    float f8 = this.R;
                    float f9 = this.P;
                    this.R = (f8 * (1.0f - f9)) + (length3 * f9);
                }
            }
            return this.m;
        }

        public final synchronized void u(float f) {
            this.L = f;
        }

        public synchronized void v(int i) {
            this.A = i;
        }

        public final synchronized void w(float f, float f2, float f3, float f4) {
            this.S.h(f, f2, f3, f4);
        }

        public final synchronized void x(float f) {
            this.z = f;
        }

        public final synchronized void y(int i, float f) {
            this.T.a(i, f);
        }

        public synchronized void z(int i) {
            if (i < 1) {
                i = 1;
            }
            int[] iArr = new int[i + 1 + i];
            this.G = iArr;
            this.H = new float[iArr.length];
            this.I = iArr.length;
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.G;
                if (i2 < iArr2.length) {
                    int i3 = i2 - i;
                    iArr2[i2] = i3;
                    this.H[i2] = bv.b(((iArr2.length + 2) / 2) + i3, iArr2.length + 2);
                    i2++;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public float a;
        public sg0 b;

        public c(float f, sg0 sg0Var) {
            this.a = f;
            this.b = sg0Var;
        }
    }

    @Override // com.daaw.zc0
    public void a(un unVar) {
        this.b.a(unVar);
    }

    @Override // com.daaw.rd0
    public float c() {
        return this.b.q();
    }

    @Override // com.daaw.fe0
    public je0 f(int i, int i2, int i3, je0 je0Var) {
        return this.a.c(i, i2, i3, je0Var);
    }

    @Override // com.daaw.rd0
    public float j() {
        return this.b.r();
    }

    @Override // com.daaw.fe0
    public void n(de0 de0Var, sg0 sg0Var) {
        if (!de0Var.c()) {
            this.a.b(this.b.t(de0Var.d(), sg0Var));
            return;
        }
        q();
        try {
            float[] poll = this.d.poll(100L, TimeUnit.MILLISECONDS);
            if (poll != null) {
                this.a.b(poll);
            }
        } catch (InterruptedException unused) {
        }
        this.c.offer(new c(de0Var.d(), sg0Var));
    }

    @Override // com.daaw.zc0
    public void o(un unVar) {
        this.b.o(unVar);
    }

    public final void q() {
        Thread thread = this.e;
        if (thread == null || !thread.isAlive()) {
            lz1.a("Starting audioProcessTh");
            Thread thread2 = new Thread(new a());
            this.e = thread2;
            thread2.start();
        }
    }
}
