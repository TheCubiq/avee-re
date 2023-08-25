package com.daaw;

import android.graphics.Color;
import android.opengl.GLES20;
import java.nio.IntBuffer;
/* loaded from: classes.dex */
public class f80 {
    public static int a(int[] iArr) {
        return (iArr[2] & 255) | ((iArr[3] & 255) << 24) | 0 | ((iArr[0] & 255) << 16) | ((iArr[1] & 255) << 8);
    }

    public static void b(float[] fArr, float[] fArr2, float[] fArr3, float f) {
        float max = Math.max(fArr2[0], Math.max(fArr2[1], fArr2[2]));
        float max2 = max + ((Math.max(fArr3[0], Math.max(fArr3[1], fArr3[2])) - max) * f);
        fArr[0] = fArr2[0] + ((fArr3[0] - fArr2[0]) * f);
        fArr[1] = fArr2[1] + ((fArr3[1] - fArr2[1]) * f);
        fArr[2] = fArr2[2] + ((fArr3[2] - fArr2[2]) * f);
        fArr[3] = fArr2[3] + ((fArr3[3] - fArr2[3]) * f);
        float sqrt = (float) Math.sqrt((fArr[0] * fArr[0]) + (fArr[1] * fArr[1]) + (fArr[2] * fArr[2]));
        fArr[0] = fArr[0] / sqrt;
        fArr[1] = fArr[1] / sqrt;
        fArr[2] = fArr[2] / sqrt;
        fArr[0] = fArr[0] * max2;
        fArr[1] = fArr[1] * max2;
        fArr[2] = fArr[2] * max2;
    }

    public static int c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static void d(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = fArr2[0] * fArr3[0];
        fArr[1] = fArr2[1] * fArr3[1];
        fArr[2] = fArr2[2] * fArr3[2];
        fArr[3] = fArr2[3] * fArr3[3];
    }

    public static int e(float f, float f2, float f3, float f4) {
        return (((int) (f * 255.0f)) << 24) | 0 | (((int) (f2 * 255.0f)) << 16) | (((int) (f3 * 255.0f)) << 8) | ((int) (f4 * 255.0f));
    }

    public static int f(float[] fArr) {
        return ((int) (fArr[2] * 255.0f)) | (((int) (fArr[3] * 255.0f)) << 24) | 0 | (((int) (fArr[0] * 255.0f)) << 16) | (((int) (fArr[1] * 255.0f)) << 8);
    }

    public static int g(float[] fArr, int i) {
        return ((int) (fArr[i + 0] * 255.0f)) | (((((((int) (fArr[i + 3] * 255.0f)) << 8) | ((int) (fArr[i + 2] * 255.0f))) << 8) | ((int) (fArr[i + 1] * 255.0f))) << 8);
    }

    public static float h(int i) {
        return ((i >> 24) & 255) / 255.0f;
    }

    public static int[] i(int i, int i2, int i3, int i4, int[][] iArr) {
        if (iArr == null) {
            iArr = new int[1];
        }
        if (iArr[0] == null || iArr[0].length != (i2 + i4) * i3) {
            lz1.a("## allocating buffer 0");
            iArr[0] = new int[(i2 + i4) * i3];
        }
        int[] iArr2 = iArr[0];
        IntBuffer wrap = IntBuffer.wrap(iArr2);
        wrap.position(0);
        GLES20.glReadPixels(i, 0, i3, i2 + i4, 6408, 5121, wrap);
        return iArr2;
    }

    public static void j(float[] fArr, float[] fArr2) {
        l(fArr, fArr2, 360.0f);
    }

    public static int k(float[] fArr) {
        int round;
        int round2;
        int round3;
        float f = fArr[0] * 360.0f;
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                round3 = Math.round(f4 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                round3 = Math.round(f4 * 255.0f);
                break;
            case 2:
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                round3 = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                round3 = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                round3 = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                round3 = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                round = 0;
                round3 = 0;
                round2 = 0;
                break;
        }
        return (((int) (fArr[3] * 255.0f)) << 24) | (Color.rgb(c(round, 0, 255), c(round2, 0, 255), c(round3, 0, 255)) & 16777215);
    }

    public static void l(float[] fArr, float[] fArr2, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = fArr[0] * f;
        float f7 = fArr[1];
        float f8 = fArr[2];
        float abs = (1.0f - Math.abs((f8 * 2.0f) - 1.0f)) * f7;
        float f9 = f8 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f6 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f6) / 60) {
            case 0:
                f2 = abs2 + f9;
                f3 = f9;
                f9 = abs + f9;
                f4 = f2;
                break;
            case 1:
                f4 = abs + f9;
                f5 = abs2 + f9;
                f3 = f9;
                f9 = f5;
                break;
            case 2:
                f4 = abs + f9;
                f3 = abs2 + f9;
                break;
            case 3:
                f2 = abs2 + f9;
                f3 = abs + f9;
                f4 = f2;
                break;
            case 4:
                float f10 = abs + f9;
                f4 = f9;
                f9 = abs2 + f9;
                f3 = f10;
                break;
            case 5:
            case 6:
                f3 = abs2 + f9;
                f5 = abs + f9;
                f4 = f9;
                f9 = f5;
                break;
            default:
                f9 = 0.0f;
                f4 = 0.0f;
                f3 = 0.0f;
                break;
        }
        fArr2[0] = f9;
        fArr2[1] = f4;
        fArr2[2] = f3;
        fArr2[3] = fArr[3];
    }

    public static int m(float[] fArr) {
        return (((int) (fArr[3] * 255.0f)) << 24) | (zg.a(fArr) & 16777215);
    }

    public static void n(float[] fArr, int i) {
        o(fArr, 0, i);
    }

    public static void o(float[] fArr, int i, int i2) {
        fArr[i + 3] = ((i2 >> 24) & 255) / 255.0f;
        fArr[i + 0] = ((i2 >> 16) & 255) / 255.0f;
        fArr[i + 1] = ((i2 >> 8) & 255) / 255.0f;
        fArr[i + 2] = (i2 & 255) / 255.0f;
    }

    public static void p(float[] fArr, int i) {
        zg.b((i >> 16) & 255, (i >> 8) & 255, i & 255, fArr);
        fArr[0] = fArr[0] * 0.0027777778f;
        fArr[3] = ((i >> 24) & 255) / 255.0f;
    }

    public static void q(float[] fArr, int i) {
        zg.b((i >> 16) & 255, (i >> 8) & 255, i & 255, fArr);
        fArr[3] = ((i >> 24) & 255) / 255.0f;
    }

    public static void r(int[] iArr, int i, int i2) {
        iArr[i + 3] = (i2 >> 24) & 255;
        iArr[i + 0] = (i2 >> 16) & 255;
        iArr[i + 1] = (i2 >> 8) & 255;
        iArr[i + 2] = i2 & 255;
    }

    public static int s(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    public static int t(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }
}
