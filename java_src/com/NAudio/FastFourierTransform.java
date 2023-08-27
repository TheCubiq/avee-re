package com.NAudio;
/* loaded from: classes.dex */
public class FastFourierTransform {

    /* loaded from: classes.dex */
    public static class Complex {
        public float X;
        public float Y;

        public Complex(float f, float f2) {
            this.X = f;
            this.Y = f2;
        }

        public float re() {
            return this.X;
        }

        public float im() {
            return this.Y;
        }
    }

    static int log(int i, int i2) {
        return (int) (Math.log(i) / Math.log(i2));
    }

    public static void FFT(boolean z, Complex[] complexArr) {
        FFT(z, log(complexArr.length, 2), complexArr);
    }

    public static void FFT(boolean z, int i, Complex[] complexArr) {
        int i2 = 1;
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            i3 *= 2;
        }
        int i5 = i3 >> 1;
        int i6 = 0;
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            if (i7 < i6) {
                float f = complexArr[i7].X;
                float f2 = complexArr[i7].Y;
                complexArr[i7].X = complexArr[i6].X;
                complexArr[i7].Y = complexArr[i6].Y;
                complexArr[i6].X = f;
                complexArr[i6].Y = f2;
            }
            int i8 = i5;
            while (i8 <= i6) {
                i6 -= i8;
                i8 >>= 1;
            }
            i6 += i8;
        }
        float f3 = -1.0f;
        int i9 = 0;
        float f4 = 0.0f;
        while (i9 < i) {
            int i10 = i2 << 1;
            int i11 = 0;
            float f5 = 1.0f;
            float f6 = 0.0f;
            while (i11 < i2) {
                for (int i12 = i11; i12 < i3; i12 += i10) {
                    int i13 = i12 + i2;
                    float f7 = (complexArr[i13].X * f5) - (complexArr[i13].Y * f6);
                    float f8 = (complexArr[i13].Y * f5) + (complexArr[i13].X * f6);
                    complexArr[i13].X = complexArr[i12].X - f7;
                    complexArr[i13].Y = complexArr[i12].Y - f8;
                    complexArr[i12].X += f7;
                    complexArr[i12].Y += f8;
                }
                f6 = (f6 * f3) + (f5 * f4);
                i11++;
                f5 = (f5 * f3) - (f6 * f4);
            }
            float sqrt = (float) Math.sqrt((1.0f - f3) / 2.0f);
            if (z) {
                sqrt = -sqrt;
            }
            f4 = sqrt;
            f3 = (float) Math.sqrt((f3 + 1.0f) / 2.0f);
            i9++;
            i2 = i10;
        }
        if (z) {
            for (int i14 = 0; i14 < i3; i14++) {
                float f9 = i3;
                complexArr[i14].X /= f9;
                complexArr[i14].Y /= f9;
            }
        }
    }
}
