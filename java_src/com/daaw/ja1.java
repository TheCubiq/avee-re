package com.daaw;
/* loaded from: classes.dex */
public class ja1 implements fe0, rd0 {
    public float[] a = new float[2];
    public float b = 0.0f;
    public float c = 0.0f;
    public float[] d = new float[2];
    public int e = 11;
    public int f = 8;
    public final float g = 300.0f;
    public final float h = 0.9f;
    public final float i = 0.01f;
    public float j = 1000.0f;
    public float k = 0.0f;
    public float l = 1.0f;
    public je0 m = new a();

    /* loaded from: classes.dex */
    public class a implements je0 {
        public a() {
        }

        @Override // com.daaw.je0
        public float get(int i) {
            return ja1.this.a[i];
        }

        @Override // com.daaw.je0
        public int size() {
            return ja1.this.a.length;
        }
    }

    @Override // com.daaw.zc0
    public void a(un unVar) {
        r(unVar.r("inputSize", 11));
        s(unVar.r("sampleOutCountPower", 8));
    }

    @Override // com.daaw.rd0
    public float c() {
        return this.c;
    }

    @Override // com.daaw.fe0
    public je0 f(int i, int i2, int i3, je0 je0Var) {
        return this.m;
    }

    @Override // com.daaw.rd0
    public float j() {
        return 0.0f;
    }

    @Override // com.daaw.fe0
    public void n(de0 de0Var, sg0 sg0Var) {
        ke0 gd1Var;
        int i;
        int min = Math.min(Math.max(1 << this.e, 32), 16384);
        int min2 = Math.min(Math.max(1 << this.f, 8), 512);
        com.daaw.avee.comp.playback.a j = sg0Var.j(min);
        int i2 = 4;
        int i3 = 0;
        if (j != null) {
            gd1Var = j.l();
            i = gd1Var.size();
            float[] fArr = this.d;
            fArr[0] = 0.0f;
            fArr[1] = j.e;
            this.b = j.g;
        } else {
            gd1Var = new gd1((short) 0, 4);
            float[] fArr2 = this.d;
            fArr2[0] = 0.0f;
            fArr2[1] = 1000.0f;
            this.b = 0.0f;
            i = 4;
        }
        if (i < 4) {
            gd1Var = new gd1((short) 0, 4);
        } else {
            i2 = i;
        }
        if (this.a.length != min2) {
            this.a = new float[min2];
        }
        t(this.d);
        float length = i2 / this.a.length;
        int i4 = 0;
        while (true) {
            float[] fArr3 = this.a;
            if (i4 >= fArr3.length) {
                break;
            }
            fArr3[i4] = fArr3[i4] * 0.4f * 1.0f;
            i4++;
        }
        this.c = 0.0f;
        if (length <= 1.0f) {
            while (i3 < this.a.length) {
                int floor = (int) Math.floor(i3 * length);
                float d = gd1Var.get(floor) * bv.d(floor, i2, 0.8f) * 0.00390625f;
                float f = this.l;
                float f2 = d * f * 100.0f;
                this.c = Math.max(this.c, f * f2);
                float[] fArr4 = this.a;
                fArr4[i3] = fArr4[i3] + f2;
                fArr4[i3] = fArr4[i3] * 0.5f;
                i3++;
            }
            return;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            float d2 = gd1Var.get(i5) * bv.d(i5, i2, 0.8f) * 0.00390625f;
            float f3 = this.l;
            float f4 = d2 * f3 * 100.0f;
            this.c = Math.max(this.c, f3 * f4);
            int floor2 = (int) Math.floor(i5 / length);
            float[] fArr5 = this.a;
            if (floor2 < fArr5.length) {
                fArr5[floor2] = fArr5[floor2] + f4;
            }
        }
        while (true) {
            float[] fArr6 = this.a;
            if (i3 >= fArr6.length) {
                return;
            }
            fArr6[i3] = fArr6[i3] / length;
            i3++;
        }
    }

    @Override // com.daaw.zc0
    public void o(un unVar) {
        unVar.W("inputSize", this.e, "Performance", 5, 13);
        unVar.W("sampleOutCountPower", this.f, "Waveform", 3, 9);
    }

    public void r(int i) {
        this.e = i;
    }

    public void s(int i) {
        this.f = i;
    }

    public final void t(float[] fArr) {
        float f;
        float f2;
        float f3 = (this.k * 0.100000024f) + (fArr[0] * 0.9f);
        this.k = f3;
        float f4 = fArr[1];
        float f5 = this.j;
        if (f4 > f5) {
            f = f5 * 0.100000024f;
            f2 = fArr[1] * 0.9f;
        } else {
            f = f5 * 0.99f;
            f2 = fArr[1] * 0.01f;
        }
        this.j = f + f2;
        float f6 = this.j - f3;
        this.l = f6;
        if (f6 < 1.0f) {
            this.l = 1.0f;
        }
        this.l = 300.0f / this.l;
    }
}
