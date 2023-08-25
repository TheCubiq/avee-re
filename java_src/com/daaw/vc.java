package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
/* loaded from: classes.dex */
public class vc implements sc0 {
    public static final int[] e = {-1, -1, -1, -1, -1, -1};
    public Canvas a;
    public Paint b;
    public final int c;
    public final float d;

    /* loaded from: classes.dex */
    public class a implements t40<Integer, float[], int[], Boolean> {
        public final /* synthetic */ u40 a;
        public final /* synthetic */ float[] b;

        public a(u40 u40Var, float[] fArr) {
            this.a = u40Var;
            this.b = fArr;
        }

        @Override // com.daaw.t40
        /* renamed from: a */
        public Boolean j(Integer num, float[] fArr, int[] iArr) {
            return (Boolean) this.a.c(num, fArr, iArr, this.b);
        }
    }

    public vc() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = 70;
        this.d = 3.0f;
        paint.setColor(1090519039);
    }

    public void a(de0 de0Var, t40<Integer, float[], int[], Boolean> t40Var, int i, float f, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        float[] fArr = new float[8];
        char c = 4;
        int[] iArr = new int[4];
        char c2 = 0;
        int i2 = 0;
        while (i2 < i) {
            if (t40Var.j(Integer.valueOf(i2), fArr, iArr).booleanValue()) {
                this.b.setColor(f80.t(iArr[c2], 70));
                float f2 = fArr[c2];
                float f3 = fArr[1];
                float f4 = fArr[2];
                float f5 = fArr[3];
                float f6 = fArr[c];
                float f7 = fArr[5];
                float f8 = fArr[6];
                float f9 = fArr[7];
                this.a.drawLine(f2, f3, f4, f5, this.b);
                this.a.drawLine(f4, f5, f6, f7, this.b);
                this.a.drawLine(f6, f7, f8, f9, this.b);
                this.a.drawLine(f8, f9, f2, f3, this.b);
                this.a.drawLine(f4, f5, f8, f9, this.b);
                this.a.drawLine(f6, f7, f2, f3, this.b);
                g(f2, f3, this.b);
                g(f4, f5, this.b);
                g(f6, f7, this.b);
                g(f8, f9, this.b);
            }
            i2++;
            c = 4;
            c2 = 0;
        }
    }

    @Override // com.daaw.sc0
    public void b(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, qc0 qc0Var, int i2, qr1 qr1Var) {
        e(de0Var, f, f2, f3, f4, f5, f6, f7, f8, f9, i, bs1Var, bs1Var2, qc0Var, i2);
    }

    @Override // com.daaw.sc0
    public void c(de0 de0Var, u40<Integer, float[], int[], float[], Boolean> u40Var, int i, float f, bs1 bs1Var, bs1 bs1Var2, qc0 qc0Var, int i2, qr1 qr1Var) {
        a(de0Var, new a(u40Var, new float[8]), i, f, bs1Var, bs1Var2, new w31(i2, qc0Var, qr1Var, (g0<y31, sr1, w31>) null));
    }

    @Override // com.daaw.sc0
    public void d(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        e(de0Var, f, f2, f3, f4, f5, f6, f7, f8, f9, i, bs1Var, bs1Var2, w31Var.f(), w31Var.a);
    }

    @Override // com.daaw.sc0
    public void e(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, qc0 qc0Var, int i2) {
        this.b.setColor(f80.t(i, 70));
        this.a.drawLine(f, f2, f3, f4, this.b);
        this.a.drawLine(f3, f4, f5, f6, this.b);
        this.a.drawLine(f5, f6, f7, f8, this.b);
        this.a.drawLine(f7, f8, f, f2, this.b);
        this.a.drawLine(f3, f4, f7, f8, this.b);
        this.a.drawLine(f5, f6, f, f2, this.b);
        g(f, f2, this.b);
        g(f3, f4, this.b);
        g(f5, f6, this.b);
        g(f7, f8, this.b);
    }

    @Override // com.daaw.sc0
    public void f(de0 de0Var, t40<Integer, float[], int[], Boolean> t40Var, int i, float f, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        a(de0Var, t40Var, i, f, bs1Var, bs1Var2, w31Var);
    }

    public void g(float f, float f2, Paint paint) {
        this.a.drawCircle(f, f2, 3.0f, paint);
    }

    public void h(Canvas canvas) {
        this.a = canvas;
    }
}
