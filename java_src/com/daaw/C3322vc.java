package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
/* renamed from: com.daaw.vc */
/* loaded from: classes.dex */
public class C3322vc implements sc0 {

    /* renamed from: e */
    public static final int[] f30117e = {-1, -1, -1, -1, -1, -1};

    /* renamed from: a */
    public Canvas f30118a;

    /* renamed from: b */
    public Paint f30119b;

    /* renamed from: c */
    public final int f30120c;

    /* renamed from: d */
    public final float f30121d;

    /* renamed from: com.daaw.vc$a */
    /* loaded from: classes.dex */
    public class C3323a implements t40<Integer, float[], int[], Boolean> {

        /* renamed from: a */
        public final /* synthetic */ u40 f30122a;

        /* renamed from: b */
        public final /* synthetic */ float[] f30123b;

        public C3323a(u40 u40Var, float[] fArr) {
            this.f30122a = u40Var;
            this.f30123b = fArr;
        }

        @Override // com.daaw.t40
        /* renamed from: a */
        public Boolean mo2575j(Integer num, float[] fArr, int[] iArr) {
            return (Boolean) this.f30122a.mo2576c(num, fArr, iArr, this.f30123b);
        }
    }

    public C3322vc() {
        Paint paint = new Paint();
        this.f30119b = paint;
        this.f30120c = 70;
        this.f30121d = 3.0f;
        paint.setColor(1090519039);
    }

    /* renamed from: a */
    public void m7295a(de0 de0Var, t40<Integer, float[], int[], Boolean> t40Var, int i, float f, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        float[] fArr = new float[8];
        char c = 4;
        int[] iArr = new int[4];
        char c2 = 0;
        int i2 = 0;
        while (i2 < i) {
            if (t40Var.mo2575j(Integer.valueOf(i2), fArr, iArr).booleanValue()) {
                this.f30119b.setColor(f80.m22854t(iArr[c2], 70));
                float f2 = fArr[c2];
                float f3 = fArr[1];
                float f4 = fArr[2];
                float f5 = fArr[3];
                float f6 = fArr[c];
                float f7 = fArr[5];
                float f8 = fArr[6];
                float f9 = fArr[7];
                this.f30118a.drawLine(f2, f3, f4, f5, this.f30119b);
                this.f30118a.drawLine(f4, f5, f6, f7, this.f30119b);
                this.f30118a.drawLine(f6, f7, f8, f9, this.f30119b);
                this.f30118a.drawLine(f8, f9, f2, f3, this.f30119b);
                this.f30118a.drawLine(f4, f5, f8, f9, this.f30119b);
                this.f30118a.drawLine(f6, f7, f2, f3, this.f30119b);
                m7289g(f2, f3, this.f30119b);
                m7289g(f4, f5, this.f30119b);
                m7289g(f6, f7, this.f30119b);
                m7289g(f8, f9, this.f30119b);
            }
            i2++;
            c = 4;
            c2 = 0;
        }
    }

    @Override // com.daaw.sc0
    /* renamed from: b */
    public void mo7294b(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, qc0 qc0Var, int i2, qr1 qr1Var) {
        mo7291e(de0Var, f, f2, f3, f4, f5, f6, f7, f8, f9, i, bs1Var, bs1Var2, qc0Var, i2);
    }

    @Override // com.daaw.sc0
    /* renamed from: c */
    public void mo7293c(de0 de0Var, u40<Integer, float[], int[], float[], Boolean> u40Var, int i, float f, bs1 bs1Var, bs1 bs1Var2, qc0 qc0Var, int i2, qr1 qr1Var) {
        m7295a(de0Var, new C3323a(u40Var, new float[8]), i, f, bs1Var, bs1Var2, new w31(i2, qc0Var, qr1Var, (InterfaceC1348g0<y31, sr1, w31>) null));
    }

    @Override // com.daaw.sc0
    /* renamed from: d */
    public void mo7292d(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        mo7291e(de0Var, f, f2, f3, f4, f5, f6, f7, f8, f9, i, bs1Var, bs1Var2, w31Var.m6552f(), w31Var.f30857a);
    }

    @Override // com.daaw.sc0
    /* renamed from: e */
    public void mo7291e(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, qc0 qc0Var, int i2) {
        this.f30119b.setColor(f80.m22854t(i, 70));
        this.f30118a.drawLine(f, f2, f3, f4, this.f30119b);
        this.f30118a.drawLine(f3, f4, f5, f6, this.f30119b);
        this.f30118a.drawLine(f5, f6, f7, f8, this.f30119b);
        this.f30118a.drawLine(f7, f8, f, f2, this.f30119b);
        this.f30118a.drawLine(f3, f4, f7, f8, this.f30119b);
        this.f30118a.drawLine(f5, f6, f, f2, this.f30119b);
        m7289g(f, f2, this.f30119b);
        m7289g(f3, f4, this.f30119b);
        m7289g(f5, f6, this.f30119b);
        m7289g(f7, f8, this.f30119b);
    }

    @Override // com.daaw.sc0
    /* renamed from: f */
    public void mo7290f(de0 de0Var, t40<Integer, float[], int[], Boolean> t40Var, int i, float f, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        m7295a(de0Var, t40Var, i, f, bs1Var, bs1Var2, w31Var);
    }

    /* renamed from: g */
    public void m7289g(float f, float f2, Paint paint) {
        this.f30118a.drawCircle(f, f2, 3.0f, paint);
    }

    /* renamed from: h */
    public void m7288h(Canvas canvas) {
        this.f30118a = canvas;
    }
}
