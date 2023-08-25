package com.daaw;

import com.daaw.ha1;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class ha1 implements fe0, rd0 {
    public h40 a = new h40();
    public b b = new b();
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
                    poll = ha1.this.c.poll(10000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
                if (poll == null) {
                    return;
                }
                ha1.this.d.add(ha1.this.b.u(poll.a, poll.b));
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements zc0 {
        public pw0[] T;
        public ie0 V;
        public ThreadPoolExecutor a0;
        public float f;
        public float g;
        public int a = 90;
        public boolean b = false;
        public double[] c = new double[1];
        public float[] d = new float[1];
        public float[] e = new float[2];
        public int h = 0;
        public int i = 0;
        public float j = 0.0f;
        public int k = 64;
        public float[] l = new float[1];
        public float[] m = new float[1];
        public float[] n = new float[1];
        public float[] o = new float[1];
        public float[] p = new float[1];
        public float q = 0.0f;
        public boolean r = false;
        public int s = 1;
        public float t = 1.0f;
        public final float u = 300.0f;
        public final float v = 0.9f;
        public final float w = 0.01f;
        public float x = 0.4f;
        public int y = 4;
        public float z = 0.0f;
        public float A = 1000.0f;
        public float B = 0.0f;
        public float C = 1.0f;
        public int[] D = new int[0];
        public float[] E = new float[0];
        public float F = 1.0f;
        public int G = 2;
        public float H = 0.0f;
        public float I = 0.2f;
        public float J = 1.0f;
        public boolean K = true;
        public float[] L = new float[0];
        public float M = 0.5f;
        public float N = 0.0f;
        public float O = 0.0f;
        public c31 P = new c31(0.5f);
        public ad1 Q = ad1.e(1, 1.0f);
        public double[] R = new double[0];
        public int S = 0;
        public double[] U = new double[0];
        public final Object W = new Object();
        public int X = Runtime.getRuntime().availableProcessors();
        public final BlockingQueue<Runnable> Y = new LinkedBlockingQueue();
        public final TimeUnit Z = TimeUnit.SECONDS;
        public int b0 = 44100;

        /* loaded from: classes.dex */
        public class a implements ie0 {
            public b a;

            public a(b bVar) {
                this.a = bVar;
            }

            @Override // com.daaw.ie0
            public double get(int i) {
                return this.a.U[i];
            }

            @Override // com.daaw.ie0
            public int size() {
                return this.a.U.length;
            }
        }

        public b() {
            int max = Math.max(1, this.X - 3);
            this.T = new pw0[max];
            int i = 0;
            while (true) {
                pw0[] pw0VarArr = this.T;
                if (i >= pw0VarArr.length) {
                    this.V = new a(this);
                    F(64, 0.06f, 0);
                    A(1);
                    x(0.0f, 0.2f, 0.7f, 35.0f);
                    z(3, 1.0f);
                    this.a0 = new ThreadPoolExecutor(max, max, 1L, this.Z, this.Y);
                    return;
                }
                pw0VarArr[i] = new pw0();
                i++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(int i, int i2, int i3, float f, yc1[] yc1VarArr) {
            int i4 = i * i2;
            pw0[] pw0VarArr = this.T;
            if (i2 != pw0VarArr.length - 1) {
                i3 = (i2 + 1) * i;
            }
            pw0VarArr[i2].b(this.R, i4, i3, this.U, f, this.e[1]);
            yc1VarArr[i2].a();
        }

        public void A(int i) {
            synchronized (this.W) {
                if (i < 1) {
                    i = 1;
                }
                int[] iArr = new int[i + 1 + i];
                this.D = iArr;
                this.E = new float[iArr.length];
                this.F = iArr.length;
                int i2 = 0;
                while (true) {
                    int[] iArr2 = this.D;
                    if (i2 < iArr2.length) {
                        int i3 = i2 - i;
                        iArr2[i2] = i3;
                        this.E[i2] = bv.b(((iArr2.length + 2) / 2) + i3, iArr2.length + 2);
                        i2++;
                    }
                }
            }
        }

        public final void B(boolean z) {
            this.b = z;
        }

        public void C(float f) {
            synchronized (this.W) {
                this.J = f;
            }
        }

        public final void D(int i) {
            this.a = i;
        }

        public void E(int i, float f, float f2, boolean z, int i2, float f3, int i3, int i4, float f4) {
            synchronized (this.W) {
                this.f = Math.max(f, 0.1f);
                this.g = Math.max(f2, 0.1f);
                this.k = Math.max(1, i);
                this.r = z;
                this.s = Math.max(i2, 1);
                this.H = f3;
                int i5 = this.k;
                this.n = new float[i5];
                this.o = new float[i5];
                this.h = i3;
                this.i = i4;
                this.j = f4;
                this.U = new double[i5];
                H(i5, this.f, f2, z, f3, i3, i4, f4);
                w(6);
                int i6 = 0;
                while (true) {
                    pw0[] pw0VarArr = this.T;
                    if (i6 < pw0VarArr.length) {
                        pw0VarArr[i6].a(this.n, 44100);
                        i6++;
                    }
                }
            }
        }

        public void F(int i, float f, int i2) {
            E(i, 20.0f, 18000.0f, false, 1, f, i2, i2, 0.0f);
        }

        public void G(float f) {
            synchronized (this.W) {
                this.t = f;
            }
        }

        public final void H(int i, float f, float f2, boolean z, float f3, int i2, int i3, float f4) {
            int max = Math.max(0, i2);
            int max2 = Math.max(0, i3);
            boolean z2 = z && i > 1;
            int i4 = z2 ? i / 2 : i;
            int i5 = ((z2 ? i / 2 : i) - max) - max2;
            int max3 = Math.max(i5 / this.s, 1);
            for (int i6 = 0; i6 < i; i6++) {
                this.n[i6] = 0.0f;
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
                this.n[i11] = (float) t(f, f2, i10, i17);
                float[] fArr = this.n;
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
                float f7 = (i24 <= i25 || i24 == i20) ? this.n[i24] : this.n[((i24 - 1) + i) % i];
                int i26 = i19;
                float f8 = (i24 >= (i23 - max2) - 1 || i24 == i26) ? this.n[i24] : this.n[(i24 + 1) % i];
                this.o[i24] = Math.min(f7, f8);
                if (f7 < 0.0f) {
                    if (f8 < 0.0f) {
                        this.o[i24] = 0.0f;
                    } else {
                        this.o[i24] = f8;
                    }
                } else if (f7 < 0.0f) {
                    this.o[i24] = 0.0f;
                } else {
                    this.o[i24] = f7;
                }
                i24++;
                i21 = i25;
                i19 = i26;
            }
            for (int i27 = 0; i27 < i; i27++) {
                float[] fArr2 = this.n;
                if (fArr2[i27] < 0.0f) {
                    fArr2[i27] = 0.0f;
                }
                float[] fArr3 = this.o;
                if (fArr3[i27] < 0.0f) {
                    fArr3[i27] = 0.0f;
                }
            }
            int i28 = i - 1;
            int i29 = 1;
            for (int i30 = i28; i30 >= i22; i30--) {
                float[] fArr4 = this.n;
                fArr4[i30] = fArr4[i29];
                float[] fArr5 = this.o;
                fArr5[i30] = fArr5[i29];
                i29 = Math.min(i29 + 1, i28);
            }
        }

        public final void I(float[] fArr) {
            float f;
            float f2;
            float f3 = (this.B * 0.100000024f) + (fArr[0] * 0.9f);
            this.B = f3;
            float f4 = fArr[1];
            float f5 = this.A;
            if (f4 > f5) {
                f = f5 * 0.100000024f;
                f2 = fArr[1] * 0.9f;
            } else {
                f = f5 * 0.99f;
                f2 = fArr[1] * 0.01f;
            }
            this.A = f + f2;
            float f6 = this.A - f3;
            this.C = f6;
            if (f6 < 1.0f) {
                this.C = 1.0f;
            }
            this.C = 300.0f / this.C;
        }

        @Override // com.daaw.zc0
        public void a(un unVar) {
            synchronized (this.W) {
                D(unVar.r("audioDurationMs", 60));
                B(unVar.n("highQualityAudioCapture", false));
                E(unVar.r("sampleOutCount", 128), unVar.o("lowerHz", 0.1f), unVar.o("higherHz", 18000.0f), unVar.n("mirrorSamples", false), unVar.r("repeatSamples", 1), unVar.o("hzLinearFactor", 0.06f), unVar.r("starAndEndGap", 0), unVar.r("starAndEndGap", 0), unVar.o("freqShift", 0.0f));
                G(unVar.o("smooth", 1.0f));
                z(unVar.r("filterRadius", 4), unVar.o("filterStrength", 1.0f));
                y(unVar.o("beatSmooth", 0.4f));
                x(unVar.o("beatRangeBarFirst", 0.0f), unVar.o("beatRangeBarLast", 0.2f), unVar.o("beatRangeValueLower", 0.7f), unVar.o("beatRangeValueHigher", 35.0f));
                v(unVar.o("lowerFreqMagnitude", 0.25f));
                C(unVar.o("outputMultiplier", 1.0f));
            }
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
            }
            q6.i(fArr.length == this.c.length);
            float f2 = this.I;
            float f3 = 1.0f - f2;
            while (i2 < this.c.length) {
                fArr[i2] = Math.max((float) this.Q.g(i2, ie0Var), 0.0f) * ((((float) av.a(Math.min(2600.0d, this.n[i2]))) * 0.1f * f2) + f3) * f;
                i2++;
            }
        }

        @Override // com.daaw.zc0
        public void o(un unVar) {
            synchronized (this.W) {
                unVar.W("audioDurationMs", this.a, "1_AudioCapture", 20, 300);
                unVar.L("highQualityAudioCapture", this.b, "1_AudioCapture");
                unVar.W("sampleOutCount", this.k, "2_spectrum", 0, 512);
                unVar.O("lowerHz", this.f, "2_spectrumHz", 0.0f, 300.0f);
                unVar.O("higherHz", this.g, "2_spectrumHz", 300.0f, 18000.0f);
                unVar.O("hzLinearFactor", this.H, "2_spectrumHz", 0.0f, 1.0f);
                unVar.O("freqShift", this.j, "2_spectrumHz", 0.0f, 1.0f);
                unVar.L("mirrorSamples", this.r, "2_spectrum");
                unVar.W("repeatSamples", this.s, "2_spectrum", 1, 6);
                unVar.W("starAndEndGap", this.h, "2_spectrum", 0, 30);
                unVar.O("smooth", this.t, "2_spectrum", 0.1f, 1.0f);
                unVar.W("filterRadius", this.Q.f(), "2_spectrum", 0, 20);
                unVar.O("filterStrength", this.Q.h(), "2_spectrum", 0.1f, 2.0f);
                unVar.O("beatSmooth", this.x, "beat", 0.1f, 1.0f);
                unVar.O("beatRangeBarFirst", this.P.c(), "beat", 0.0f, 1.0f);
                unVar.O("beatRangeBarLast", this.P.d(), "beat", 0.0f, 1.0f);
                unVar.O("beatRangeValueLower", this.P.e(), "beat", 0.0f, 50.0f);
                unVar.O("beatRangeValueHigher", this.P.f(), "beat", 0.0f, 100.0f);
                unVar.O("lowerFreqMagnitude", this.I, "2_spectrum", 0.0f, 1.0f);
                unVar.O("outputMultiplier", this.J, "2_spectrum", 0.1f, 3.0f);
            }
        }

        public float q() {
            float f;
            synchronized (this.W) {
                f = this.q;
            }
            return f;
        }

        public float r() {
            float f;
            synchronized (this.W) {
                f = this.O;
            }
            return f;
        }

        public double t(double d, double d2, int i, int i2) {
            double d3 = i;
            double d4 = i2 - 1;
            Double.isNaN(d3);
            Double.isNaN(d4);
            return d * Math.pow(d2 / d, d3 / d4);
        }

        public float[] u(float f, sg0 sg0Var) {
            ke0 gd1Var;
            float f2;
            boolean z;
            int i;
            int i2;
            int i3;
            int i4;
            pw0[] pw0VarArr;
            float[] fArr;
            synchronized (this.W) {
                int i5 = (int) (this.b0 * 0.001f * this.a);
                int b = sg0Var.b();
                if (b > 0) {
                    i5 = b;
                }
                com.daaw.avee.comp.playback.a j = sg0Var.j(i5);
                char c = 0;
                if (j != null) {
                    gd1Var = this.b ? j.k() : j.l();
                    i = gd1Var.size();
                    boolean a2 = j.a();
                    i2 = j.f;
                    f2 = j.d;
                    float[] fArr2 = this.e;
                    fArr2[0] = 0.0f;
                    fArr2[1] = j.e;
                    z = a2;
                } else {
                    gd1Var = new gd1((short) 0, 4);
                    f2 = -1000.0f;
                    float[] fArr3 = this.e;
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
                this.b0 = i3;
                int length = this.m.length;
                int i6 = this.k;
                if (length != i6) {
                    this.m = new float[i6];
                }
                int length2 = this.l.length;
                float[] fArr4 = this.m;
                if (length2 != fArr4.length) {
                    this.l = new float[fArr4.length];
                    int i7 = 0;
                    while (true) {
                        float[] fArr5 = this.l;
                        if (i7 >= fArr5.length) {
                            break;
                        }
                        fArr5[i7] = 0.0f;
                        i7++;
                    }
                }
                if (i4 != this.L.length) {
                    this.L = new float[i4];
                    for (int i8 = 0; i8 < i4; i8++) {
                        this.L[i8] = bv.c(i8, i4) * 0.00390625f;
                    }
                }
                I(this.e);
                if (this.R.length != i4) {
                    this.R = new double[i4];
                }
                int i9 = 0;
                float f3 = 0.0f;
                while (i9 < this.R.length) {
                    float f4 = gd1Var.get(i9) * this.L[i9] * this.C;
                    f3 += f4 * f4;
                    this.R[i9] = f4;
                    i9++;
                    gd1Var = gd1Var;
                }
                if ((sg0Var.g() & 2) != 0) {
                    int length3 = this.T.length;
                    yc1[] yc1VarArr = new yc1[length3];
                    final int i10 = 0;
                    while (i10 < this.T.length) {
                        yc1VarArr[i10] = new yc1();
                        pw0[] pw0VarArr2 = this.T;
                        if (pw0VarArr2[i10].a != i3) {
                            pw0VarArr2[i10].a(this.n, i3);
                        }
                        pw0[] pw0VarArr3 = this.T;
                        final int i11 = pw0VarArr3[c].c;
                        final int length4 = i11 / pw0VarArr3.length;
                        int i12 = i10;
                        final yc1[] yc1VarArr2 = yc1VarArr;
                        final float f5 = f2;
                        int i13 = length3;
                        this.a0.execute(new Runnable() { // from class: com.daaw.ia1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ha1.b.this.s(length4, i10, i11, f5, yc1VarArr2);
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
                            yc1VarArr3[i15].b();
                        } catch (InterruptedException unused) {
                        }
                    }
                } else {
                    int i16 = 0;
                    while (true) {
                        pw0VarArr = this.T;
                        if (i16 >= pw0VarArr.length) {
                            break;
                        }
                        if (pw0VarArr[i16].a != i3) {
                            pw0VarArr[i16].a(this.n, i3);
                        }
                        i16++;
                    }
                    pw0VarArr[0].b(this.R, 0, pw0VarArr[0].c, this.U, f2, this.e[1]);
                }
                if (i4 > 0) {
                    f3 = (float) Math.sqrt(f3 / i4);
                }
                this.z = f3;
                j(this.m, this.J, this.r, this.V, i3, new float[2], this.p, z);
                this.P.g(this.l.length);
                q6.b("barValues == barSmoothValues", this.m.length, this.l.length);
                this.N = 0.0f;
                float f6 = -10000.0f;
                int i17 = 0;
                while (true) {
                    float[] fArr6 = this.m;
                    if (i17 < fArr6.length) {
                        if (fArr6[i17] > f6) {
                            f6 = fArr6[i17];
                            this.N = i17;
                        }
                        float f7 = fArr6[i17];
                        float[] fArr7 = this.l;
                        fArr7[i17] = fArr7[i17] + ((f7 - fArr7[i17]) * 20.0f * f * this.t);
                        fArr7[i17] = Math.max(fArr7[i17], 0.0f);
                        this.P.a(i17, this.l[i17]);
                        i17++;
                    } else {
                        this.p[0] = this.P.b();
                        float f8 = this.q;
                        float f9 = this.x;
                        this.q = (f8 * (1.0f - f9)) + (this.p[0] * f9);
                        float length5 = this.N / this.m.length;
                        this.N = length5;
                        float f10 = this.O;
                        float f11 = this.M;
                        this.O = (f10 * (1.0f - f11)) + (length5 * f11);
                        fArr = this.l;
                    }
                }
            }
            return fArr;
        }

        public void v(float f) {
            synchronized (this.W) {
                this.I = f;
            }
        }

        public void w(int i) {
            synchronized (this.W) {
                this.y = i;
            }
        }

        public void x(float f, float f2, float f3, float f4) {
            synchronized (this.W) {
                this.P.h(f, f2, f3, f4);
            }
        }

        public void y(float f) {
            synchronized (this.W) {
                this.x = f;
            }
        }

        public void z(int i, float f) {
            synchronized (this.W) {
                this.Q = ad1.e(i, f);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c {
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
            this.a.b(this.b.u(de0Var.d(), sg0Var));
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
