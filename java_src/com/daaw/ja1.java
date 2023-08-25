package com.daaw;

import com.daaw.avee.comp.playback.C0729a;
/* loaded from: classes.dex */
public class ja1 implements fe0, rd0 {

    /* renamed from: a */
    public float[] f14576a = new float[2];

    /* renamed from: b */
    public float f14577b = 0.0f;

    /* renamed from: c */
    public float f14578c = 0.0f;

    /* renamed from: d */
    public float[] f14579d = new float[2];

    /* renamed from: e */
    public int f14580e = 11;

    /* renamed from: f */
    public int f14581f = 8;

    /* renamed from: g */
    public final float f14582g = 300.0f;

    /* renamed from: h */
    public final float f14583h = 0.9f;

    /* renamed from: i */
    public final float f14584i = 0.01f;

    /* renamed from: j */
    public float f14585j = 1000.0f;

    /* renamed from: k */
    public float f14586k = 0.0f;

    /* renamed from: l */
    public float f14587l = 1.0f;

    /* renamed from: m */
    public je0 f14588m = new C1816a();

    /* renamed from: com.daaw.ja1$a */
    /* loaded from: classes.dex */
    public class C1816a implements je0 {
        public C1816a() {
        }

        @Override // com.daaw.je0
        public float get(int i) {
            return ja1.this.f14576a[i];
        }

        @Override // com.daaw.je0
        public int size() {
            return ja1.this.f14576a.length;
        }
    }

    @Override // com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        m18682r(c3239un.m7947r("inputSize", 11));
        m18681s(c3239un.m7947r("sampleOutCountPower", 8));
    }

    @Override // com.daaw.rd0
    /* renamed from: c */
    public float mo11409c() {
        return this.f14578c;
    }

    @Override // com.daaw.fe0
    /* renamed from: f */
    public je0 mo18685f(int i, int i2, int i3, je0 je0Var) {
        return this.f14588m;
    }

    @Override // com.daaw.rd0
    /* renamed from: j */
    public float mo11408j() {
        return 0.0f;
    }

    @Override // com.daaw.fe0
    /* renamed from: n */
    public void mo18684n(de0 de0Var, sg0 sg0Var) {
        ke0 gd1Var;
        int i;
        int min = Math.min(Math.max(1 << this.f14580e, 32), 16384);
        int min2 = Math.min(Math.max(1 << this.f14581f, 8), 512);
        C0729a mo2867j = sg0Var.mo2867j(min);
        int i2 = 4;
        int i3 = 0;
        if (mo2867j != null) {
            gd1Var = mo2867j.m26731l();
            i = gd1Var.size();
            float[] fArr = this.f14579d;
            fArr[0] = 0.0f;
            fArr[1] = mo2867j.f3946e;
            this.f14577b = mo2867j.f3948g;
        } else {
            gd1Var = new gd1((short) 0, 4);
            float[] fArr2 = this.f14579d;
            fArr2[0] = 0.0f;
            fArr2[1] = 1000.0f;
            this.f14577b = 0.0f;
            i = 4;
        }
        if (i < 4) {
            gd1Var = new gd1((short) 0, 4);
        } else {
            i2 = i;
        }
        if (this.f14576a.length != min2) {
            this.f14576a = new float[min2];
        }
        m18680t(this.f14579d);
        float length = i2 / this.f14576a.length;
        int i4 = 0;
        while (true) {
            float[] fArr3 = this.f14576a;
            if (i4 >= fArr3.length) {
                break;
            }
            fArr3[i4] = fArr3[i4] * 0.4f * 1.0f;
            i4++;
        }
        this.f14578c = 0.0f;
        if (length <= 1.0f) {
            while (i3 < this.f14576a.length) {
                int floor = (int) Math.floor(i3 * length);
                float m25809d = gd1Var.get(floor) * C0888bv.m25809d(floor, i2, 0.8f) * 0.00390625f;
                float f = this.f14587l;
                float f2 = m25809d * f * 100.0f;
                this.f14578c = Math.max(this.f14578c, f * f2);
                float[] fArr4 = this.f14576a;
                fArr4[i3] = fArr4[i3] + f2;
                fArr4[i3] = fArr4[i3] * 0.5f;
                i3++;
            }
            return;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            float m25809d2 = gd1Var.get(i5) * C0888bv.m25809d(i5, i2, 0.8f) * 0.00390625f;
            float f3 = this.f14587l;
            float f4 = m25809d2 * f3 * 100.0f;
            this.f14578c = Math.max(this.f14578c, f3 * f4);
            int floor2 = (int) Math.floor(i5 / length);
            float[] fArr5 = this.f14576a;
            if (floor2 < fArr5.length) {
                fArr5[floor2] = fArr5[floor2] + f4;
            }
        }
        while (true) {
            float[] fArr6 = this.f14576a;
            if (i3 >= fArr6.length) {
                return;
            }
            fArr6[i3] = fArr6[i3] / length;
            i3++;
        }
    }

    @Override // com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        c3239un.m7982W("inputSize", this.f14580e, "Performance", 5, 13);
        c3239un.m7982W("sampleOutCountPower", this.f14581f, "Waveform", 3, 9);
    }

    /* renamed from: r */
    public void m18682r(int i) {
        this.f14580e = i;
    }

    /* renamed from: s */
    public void m18681s(int i) {
        this.f14581f = i;
    }

    /* renamed from: t */
    public final void m18680t(float[] fArr) {
        float f;
        float f2;
        float f3 = (this.f14586k * 0.100000024f) + (fArr[0] * 0.9f);
        this.f14586k = f3;
        float f4 = fArr[1];
        float f5 = this.f14585j;
        if (f4 > f5) {
            f = f5 * 0.100000024f;
            f2 = fArr[1] * 0.9f;
        } else {
            f = f5 * 0.99f;
            f2 = fArr[1] * 0.01f;
        }
        this.f14585j = f + f2;
        float f6 = this.f14585j - f3;
        this.f14587l = f6;
        if (f6 < 1.0f) {
            this.f14587l = 1.0f;
        }
        this.f14587l = 300.0f / this.f14587l;
    }
}
