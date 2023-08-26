package lomont;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class Lomont4FFT extends FFTBase {
    List<Double> forwardCos;
    List<Double> forwardSin;
    List<Double> inverseCos;
    List<Double> inverseSin;

    @Override // lomont.FFTBase
    public void Initialize(int i) {
        this.forwardCos = new ArrayList();
        this.forwardSin = new ArrayList();
        this.inverseCos = new ArrayList();
        this.inverseSin = new ArrayList();
        int i2 = 1;
        int i3 = 1;
        while (true) {
            double d = 0.0d;
            if (i <= i3) {
                break;
            }
            int i4 = i3 * 2;
            double d2 = i3;
            Double.isNaN(d2);
            double d3 = 3.141592653589793d / d2;
            double cos = Math.cos(d3);
            double sin = Math.sin(d3);
            int i5 = 0;
            double d4 = 1.0d;
            while (i5 < i4) {
                this.forwardCos.add(Double.valueOf(d4));
                this.forwardSin.add(Double.valueOf(d));
                d = (d * cos) + (d4 * sin);
                i5 += 2;
                d4 = (d4 * cos) - (d * sin);
            }
            i3 = i4;
        }
        while (i > i2) {
            int i6 = i2 * 2;
            double d5 = i2;
            Double.isNaN(d5);
            double d6 = (3.141592653589793d / d5) * (-1.0d);
            double cos2 = Math.cos(d6);
            double sin2 = Math.sin(d6);
            double d7 = 0.0d;
            int i7 = 0;
            double d8 = 1.0d;
            while (i7 < i6) {
                this.inverseCos.add(Double.valueOf(d8));
                this.inverseSin.add(Double.valueOf(d7));
                d7 = (d7 * cos2) + (d8 * sin2);
                i7 += 2;
                d8 = (d8 * cos2) - (d7 * sin2);
            }
            i2 = i6;
        }
    }

    @Override // lomont.FFTBase
    public void FFT(double[] dArr, boolean z) {
        int length = dArr.length / 2;
        int i = length / 2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 2;
            double d = dArr[i4];
            int i5 = i3 + length;
            dArr[i4] = dArr[i5];
            dArr[i5] = d;
            int i6 = i2 + 3;
            double d2 = dArr[i6];
            int i7 = length + 1 + i3;
            dArr[i6] = dArr[i7];
            dArr[i7] = d2;
            if (i2 > i3) {
                double d3 = dArr[i2];
                dArr[i2] = dArr[i3];
                dArr[i3] = d3;
                int i8 = i2 + 1;
                double d4 = dArr[i8];
                int i9 = i3 + 1;
                dArr[i8] = dArr[i9];
                dArr[i9] = d4;
                int i10 = length + 2;
                int i11 = i2 + i10;
                double d5 = dArr[i11];
                int i12 = i10 + i3;
                dArr[i11] = dArr[i12];
                dArr[i12] = d5;
                int i13 = length + 3;
                int i14 = i2 + i13;
                double d6 = dArr[i14];
                int i15 = i13 + i3;
                dArr[i14] = dArr[i15];
                dArr[i15] = d6;
            }
            i3 += 4;
            if (i3 >= length) {
                break;
            }
            int i16 = i;
            while (i2 >= i16) {
                i2 -= i16;
                i16 /= 2;
            }
            i2 += i16;
        }
        List<Double> list = z ? this.forwardCos : this.inverseCos;
        List<Double> list2 = z ? this.forwardSin : this.inverseSin;
        int i17 = 1;
        int i18 = 0;
        while (length > i17) {
            i17 *= 2;
            int i19 = 0;
            while (i19 < i17) {
                double doubleValue = list.get(i18).doubleValue();
                int i20 = i18 + 1;
                double doubleValue2 = list2.get(i18).doubleValue();
                for (int i21 = i19; i21 < length * 2; i21 += i17 * 2) {
                    int i22 = i21 + i17;
                    int i23 = i22 + 1;
                    double d7 = (dArr[i22] * doubleValue) - (dArr[i23] * doubleValue2);
                    double d8 = (dArr[i22] * doubleValue2) + (dArr[i23] * doubleValue);
                    dArr[i22] = dArr[i21] - d7;
                    int i24 = i21 + 1;
                    dArr[i23] = dArr[i24] - d8;
                    dArr[i21] = dArr[i21] + d7;
                    dArr[i24] = dArr[i24] + d8;
                }
                i19 += 2;
                i18 = i20;
            }
        }
        if (z) {
            return;
        }
        double d9 = 1 / length;
        for (int i25 = 0; i25 < length * 2; i25++) {
            double d10 = dArr[i25];
            Double.isNaN(d9);
            dArr[i25] = d10 * d9;
        }
    }

    @Override // lomont.FFTBase
    public void RealFFT(double[] dArr, boolean z) {
        double d;
        if (z) {
            FFT(dArr, z);
            d = 1.0d;
        } else {
            d = -1.0d;
        }
        int length = dArr.length;
        double d2 = length;
        Double.isNaN(d2);
        double d3 = (3.141592653589793d / d2) * 2.0d * d;
        double cos = Math.cos(d3);
        double sin = Math.sin(d3);
        double d4 = cos;
        double d5 = sin;
        int i = 1;
        while (i <= length / 4) {
            int i2 = ((length / 2) - i) * 2;
            double d6 = dArr[i2];
            int i3 = i2 + 1;
            double d7 = dArr[i3];
            int i4 = i * 2;
            double d8 = dArr[i4];
            int i5 = i4 + 1;
            double d9 = dArr[i5];
            double d10 = d8 + d6;
            double d11 = d9 - d7;
            double d12 = d8 - d6;
            double d13 = d9 + d7;
            double d14 = d13 * d5;
            double d15 = d12 * d4;
            double d16 = ((d12 * d5) + (d13 * d4)) * d;
            dArr[i4] = (d10 + d16) * 0.5d;
            dArr[i5] = (d11 - ((d15 - d14) * d)) * 0.5d;
            dArr[i2] = (d10 - d16) * 0.5d;
            dArr[i3] = ((((d15 * (-1.0d)) + d14) * d) - d11) * 0.5d;
            d5 = (d5 * cos) + (d4 * sin);
            i++;
            d4 = (d4 * cos) - (d5 * sin);
        }
        if (z) {
            double d17 = dArr[0];
            dArr[0] = dArr[0] + dArr[1];
            dArr[1] = d17 - dArr[1];
            return;
        }
        double d18 = dArr[0];
        dArr[0] = (dArr[1] + d18) * 0.5d;
        dArr[1] = (d18 - dArr[1]) * 0.5d;
        FFT(dArr, false);
    }
}
