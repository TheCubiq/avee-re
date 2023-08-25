package com.daaw;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
/* loaded from: classes2.dex */
public class k91 {
    public static float B;
    public static float C;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;
    public float n;
    public float o;
    public float p;
    public boolean q;
    public Interpolator r;
    public boolean s;
    public float t;
    public float u;
    public final float v;
    public static float w = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static float x = 800.0f;
    public static float y = 0.4f;
    public static float z = 1.0f - 0.4f;
    public static final float[] A = new float[p21.T0];

    static {
        float f;
        float f2;
        float f3 = 0.0f;
        for (int i = 0; i <= 100; i++) {
            float f4 = i / 100.0f;
            float f5 = 1.0f;
            while (true) {
                float f6 = ((f5 - f3) / 2.0f) + f3;
                float f7 = 1.0f - f6;
                f = 3.0f * f6 * f7;
                f2 = f6 * f6 * f6;
                float f8 = (((f7 * y) + (z * f6)) * f) + f2;
                if (Math.abs(f8 - f4) < 1.0E-5d) {
                    break;
                } else if (f8 > f4) {
                    f5 = f6;
                } else {
                    f3 = f6;
                }
            }
            A[i] = f + f2;
        }
        A[100] = 1.0f;
        B = 8.0f;
        C = 1.0f;
        C = 1.0f / o(1.0f);
    }

    public k91(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public k91(Context context, Interpolator interpolator, boolean z2) {
        this.q = true;
        this.r = interpolator;
        this.v = context.getResources().getDisplayMetrics().density * 160.0f;
        this.u = a(ViewConfiguration.getScrollFriction());
        this.s = z2;
    }

    public static float o(float f) {
        float f2 = f * B;
        return (f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f) + 0.36787945f) * C;
    }

    public final float a(float f) {
        return this.v * 386.0878f * f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
        if (r0 == r7.e) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            r7 = this;
            boolean r0 = r7.q
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r7.l
            long r0 = r0 - r2
            int r1 = (int) r0
            int r0 = r7.m
            r2 = 1
            if (r1 >= r0) goto Lac
            int r3 = r7.a
            if (r3 == 0) goto L7f
            if (r3 == r2) goto L1b
            goto Lb6
        L1b:
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r1 * r0
            int r3 = (int) r3
            float r4 = (float) r3
            float r4 = r4 / r0
            int r5 = r3 + 1
            float r6 = (float) r5
            float r6 = r6 / r0
            float[] r0 = com.daaw.k91.A
            r3 = r0[r3]
            r0 = r0[r5]
            float r1 = r1 - r4
            float r6 = r6 - r4
            float r1 = r1 / r6
            float r0 = r0 - r3
            float r1 = r1 * r0
            float r3 = r3 + r1
            int r0 = r7.b
            int r1 = r7.d
            int r1 = r1 - r0
            float r1 = (float) r1
            float r1 = r1 * r3
            int r1 = java.lang.Math.round(r1)
            int r0 = r0 + r1
            r7.j = r0
            int r1 = r7.g
            int r0 = java.lang.Math.min(r0, r1)
            r7.j = r0
            int r1 = r7.f
            int r0 = java.lang.Math.max(r0, r1)
            r7.j = r0
            int r0 = r7.c
            int r1 = r7.e
            int r1 = r1 - r0
            float r1 = (float) r1
            float r3 = r3 * r1
            int r1 = java.lang.Math.round(r3)
            int r0 = r0 + r1
            r7.k = r0
            int r1 = r7.i
            int r0 = java.lang.Math.min(r0, r1)
            r7.k = r0
            int r1 = r7.h
            int r0 = java.lang.Math.max(r0, r1)
            r7.k = r0
            int r1 = r7.j
            int r3 = r7.d
            if (r1 != r3) goto Lb6
            int r1 = r7.e
            if (r0 != r1) goto Lb6
            goto Lb4
        L7f:
            float r0 = (float) r1
            float r1 = r7.n
            float r0 = r0 * r1
            android.view.animation.Interpolator r1 = r7.r
            if (r1 != 0) goto L8d
            float r0 = o(r0)
            goto L91
        L8d:
            float r0 = r1.getInterpolation(r0)
        L91:
            int r1 = r7.b
            float r3 = r7.o
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            int r1 = r1 + r3
            r7.j = r1
            int r1 = r7.c
            float r3 = r7.p
            float r0 = r0 * r3
            int r0 = java.lang.Math.round(r0)
            int r1 = r1 + r0
            r7.k = r1
            goto Lb6
        Lac:
            int r0 = r7.d
            r7.j = r0
            int r0 = r7.e
            r7.k = r0
        Lb4:
            r7.q = r2
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.k91.b():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.k91.c(int, int, int, int, int, int, int, int):void");
    }

    public final void d(boolean z2) {
        this.q = z2;
    }

    public float e() {
        return this.t - ((this.u * n()) / 2000.0f);
    }

    public final int f() {
        return this.j;
    }

    public final int g() {
        return this.k;
    }

    public final int h() {
        return this.d;
    }

    public final int i() {
        return this.e;
    }

    public final int j() {
        return this.b;
    }

    public final int k() {
        return this.c;
    }

    public final boolean l() {
        return this.q;
    }

    public void m(int i, int i2, int i3, int i4, int i5) {
        this.a = 0;
        this.q = false;
        this.m = i5;
        this.l = AnimationUtils.currentAnimationTimeMillis();
        this.b = i;
        this.c = i2;
        this.d = i + i3;
        this.e = i2 + i4;
        this.o = i3;
        this.p = i4;
        this.n = 1.0f / this.m;
    }

    public int n() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - this.l);
    }
}
