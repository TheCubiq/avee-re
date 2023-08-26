package com.daaw.avee.comp.Visualizer.Graphic;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Environment;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.daaw.avee.Common.tlog;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.IntBuffer;
/* loaded from: classes.dex */
public class GraphicsUtils {
    public final int colorF4AlphaIndex = 3;

    static int clamp0255(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    private static int constrain(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static int f4ColorToIntColor(float f, float f2, float f3, float f4) {
        return (((int) (f * 255.0f)) << 24) | 0 | (((int) (f2 * 255.0f)) << 16) | (((int) (f3 * 255.0f)) << 8) | ((int) (f4 * 255.0f));
    }

    public static float getAlphaFloatFromIntColor(int i) {
        return ((i >> 24) & 255) / 255.0f;
    }

    public static float[] intColorToF4Color(int i) {
        return new float[]{((i >> 16) & 255) / 255.0f, ((i >> 8) & 255) / 255.0f, (i & 255) / 255.0f, ((i >> 24) & 255) / 255.0f};
    }

    public static int setIntColorAlpha(int i, int i2) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
    }

    public static int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    public static void checkGlError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        tlog.w(str + ": glError " + glGetError);
        throw new RuntimeException(str + ": glError " + glGetError);
    }

    public static int f4ColorToIntColor(float[] fArr) {
        return ((int) (fArr[2] * 255.0f)) | (((int) (fArr[3] * 255.0f)) << 24) | 0 | (((int) (fArr[0] * 255.0f)) << 16) | (((int) (fArr[1] * 255.0f)) << 8);
    }

    public static int f4ColorToIntColorRgba(float[] fArr, int i) {
        return ((int) (fArr[i + 0] * 255.0f)) | (((((((int) (fArr[i + 3] * 255.0f)) << 8) | ((int) (fArr[i + 2] * 255.0f))) << 8) | ((int) (fArr[i + 1] * 255.0f))) << 8);
    }

    public static int f4ColorToIntColorRgba(float[] fArr, int i, float f) {
        return ((int) (fArr[i + 0] * 255.0f)) | (((((((int) (f * 255.0f)) << 8) | ((int) (fArr[i + 2] * 255.0f))) << 8) | ((int) (fArr[i + 1] * 255.0f))) << 8);
    }

    public static float[] setf4ColorAlpha(float[] fArr, float f, float[] fArr2) {
        return setf4ColorAlpha(fArr, 0, f, fArr2, 0);
    }

    public static float[] setf4ColorAlpha(float[] fArr, int i, float f, float[] fArr2, int i2) {
        fArr[i + 3] = f;
        fArr[i + 0] = fArr2[i2 + 0];
        fArr[i + 1] = fArr2[i2 + 1];
        fArr[i + 2] = fArr2[i2 + 2];
        return fArr;
    }

    public static void setf4ColorAlphaThis(float[] fArr, int i, float f) {
        fArr[i + 3] = f;
        fArr[i + 0] = fArr[0];
        fArr[i + 1] = fArr[1];
        fArr[i + 2] = fArr[2];
    }

    public static void setF4ColorFromF4This(float[] fArr, int i, float[] fArr2, int i2) {
        fArr[i + 3] = fArr2[i2 + 3];
        fArr[i + 0] = fArr2[i2 + 0];
        fArr[i + 1] = fArr2[i2 + 1];
        fArr[i + 2] = fArr2[i2 + 2];
    }

    public static void intColorToF4Color(float[] fArr, int i) {
        intColorToF4Color(fArr, 0, i);
    }

    public static void intColorToF4Color(float[] fArr, int i, int i2) {
        fArr[i + 3] = ((i2 >> 24) & 255) / 255.0f;
        fArr[i + 0] = ((i2 >> 16) & 255) / 255.0f;
        fArr[i + 1] = ((i2 >> 8) & 255) / 255.0f;
        fArr[i + 2] = (i2 & 255) / 255.0f;
    }

    public static void intColorToInt4Color(int[] iArr, int i, int i2) {
        iArr[i + 3] = (i2 >> 24) & 255;
        iArr[i + 0] = (i2 >> 16) & 255;
        iArr[i + 1] = (i2 >> 8) & 255;
        iArr[i + 2] = i2 & 255;
    }

    public static int Int4ColorToIntColor(int[] iArr) {
        return (iArr[2] & 255) | ((iArr[3] & 255) << 24) | 0 | ((iArr[0] & 255) << 16) | ((iArr[1] & 255) << 8);
    }

    public static void intColorToByte4Color(int[] iArr, int i) {
        iArr[3] = (i >> 24) & 255;
        iArr[0] = (i >> 16) & 255;
        iArr[1] = (i >> 8) & 255;
        iArr[2] = i & 255;
    }

    public static void intColorToHlsa360(float[] fArr, int i) {
        ColorUtils.RGBToHSL((i >> 16) & 255, (i >> 8) & 255, i & 255, fArr);
        fArr[3] = ((i >> 24) & 255) / 255.0f;
    }

    public static void intColorToHlsa1(float[] fArr, int i) {
        ColorUtils.RGBToHSL((i >> 16) & 255, (i >> 8) & 255, i & 255, fArr);
        fArr[0] = fArr[0] * 0.0027777778f;
        fArr[3] = ((i >> 24) & 255) / 255.0f;
    }

    public static int hlsa360ColorToInt(float[] fArr) {
        return (((int) (fArr[3] * 255.0f)) << 24) | (ColorUtils.HSLToColor(fArr) & ViewCompat.MEASURED_SIZE_MASK);
    }

    public static int hlsa1ColorToInt(float[] fArr) {
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
        return (((int) (fArr[3] * 255.0f)) << 24) | (Color.rgb(constrain(round, 0, 255), constrain(round2, 0, 255), constrain(round3, 0, 255)) & ViewCompat.MEASURED_SIZE_MASK);
    }

    public static void hlsa1ColorToF4Color(float[] fArr, float[] fArr2) {
        hlsa360ColorToF4Color(fArr, fArr2, 360.0f);
    }

    public static void hlsa360ColorToF4Color(float[] fArr, float[] fArr2) {
        hlsa360ColorToF4Color(fArr, fArr2, 1.0f);
    }

    public static void hlsa360ColorToF4Color(float[] fArr, float[] fArr2, float f) {
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

    public static float getAlphaFloatFromF4Color(float[] fArr) {
        return fArr[3];
    }

    public static int intColorMultiply(int i, int i2) {
        float[] fArr = {((i >> 16) & 255) / 255.0f, ((i >> 8) & 255) / 255.0f, (i & 255) / 255.0f, ((i >> 24) & 255) / 255.0f};
        fArr[3] = fArr[3] * (((i2 >> 24) & 255) / 255.0f);
        fArr[0] = fArr[0] * (((i2 >> 16) & 255) / 255.0f);
        fArr[1] = fArr[1] * (((i2 >> 8) & 255) / 255.0f);
        fArr[2] = fArr[2] * ((i2 & 255) / 255.0f);
        return f4ColorToIntColor(fArr);
    }

    public static void f4ColorMultiply(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = fArr2[0] * fArr3[0];
        fArr[1] = fArr2[1] * fArr3[1];
        fArr[2] = fArr2[2] * fArr3[2];
        fArr[3] = fArr2[3] * fArr3[3];
    }

    public static void LerpColorF4(float[] fArr, float[] fArr2, float[] fArr3, float f) {
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

    public static Bitmap savePixels(int i, int i2, int i3, int i4, int[][] iArr) {
        if (iArr == null) {
            iArr = new int[1];
        }
        if (iArr[0] == null || iArr[0].length != (i2 + i4) * i3) {
            tlog.d("## allocating buffer");
            iArr[0] = new int[(i2 + i4) * i3];
        }
        int[] iArr2 = iArr[0];
        int[] iArr3 = new int[i3 * i4];
        IntBuffer wrap = IntBuffer.wrap(iArr2);
        wrap.position(0);
        GLES20.glReadPixels(i, 0, i3, i2 + i4, 6408, 5121, wrap);
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr2[(i5 * i3) + i7];
                iArr3[(((i4 - i6) - 1) * i3) + i7] = (i8 & (-16711936)) | ((i8 << 16) & 16711680) | ((i8 >> 16) & 255);
            }
            i5++;
            i6++;
        }
        return Bitmap.createBitmap(iArr3, i3, i4, Bitmap.Config.ARGB_8888);
    }

    public static int[] getFrameBufferPixels(int i, int i2, int i3, int i4, int[][] iArr) {
        if (iArr == null) {
            iArr = new int[2];
        }
        if (iArr[1] == null || iArr[1].length != (i2 + i4) * i3) {
            tlog.d("## allocating buffer 0");
            iArr[1] = new int[(i2 + i4) * i3];
        }
        if (iArr[0] == null || iArr[0].length != i3 * i4) {
            tlog.d("## allocating buffer 1");
            iArr[0] = new int[i3 * i4];
        }
        int[] iArr2 = iArr[0];
        int[] iArr3 = iArr[1];
        IntBuffer wrap = IntBuffer.wrap(iArr3);
        wrap.position(0);
        GLES20.glReadPixels(i, 0, i3, i2 + i4, 6408, 5121, wrap);
        for (int i5 = 0; i5 < i4; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = iArr3[(i5 * i3) + i6];
                int i8 = (((i4 - i5) - 1) * i3) + i6;
                iArr2[i8] = (i7 & (-16711936)) | ((i7 << 16) & 16711680) | ((i7 >> 16) & 255) | ViewCompat.MEASURED_STATE_MASK;
            }
        }
        return iArr2;
    }

    public static int[] getFrameBufferPixelsRGB(int i, int i2, int i3, int i4, int[][] iArr) {
        if (iArr == null) {
            iArr = new int[1];
        }
        if (iArr[0] == null || iArr[0].length != (i2 + i4) * i3) {
            tlog.d("## allocating buffer 0");
            iArr[0] = new int[(i2 + i4) * i3];
        }
        int[] iArr2 = iArr[0];
        IntBuffer wrap = IntBuffer.wrap(iArr2);
        wrap.position(0);
        GLES20.glReadPixels(i, 0, i3, i2 + i4, 6408, 5121, wrap);
        return iArr2;
    }

    public static Bitmap createBitmapFromOGLPixels(int[] iArr, int i, int i2, int[][] iArr2) {
        if (iArr2 == null) {
            iArr2 = new int[1];
        }
        if (iArr2[0] == null || iArr2[0].length != i * i2) {
            iArr2[0] = new int[i * i2];
        }
        int[] iArr3 = iArr2[0];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = iArr[(i3 * i) + i5];
                iArr3[(((i2 - i4) - 1) * i) + i5] = (i6 & (-16711936)) | ((i6 << 16) & 16711680) | ((i6 >> 16) & 255);
            }
            i3++;
            i4++;
        }
        return Bitmap.createBitmap(iArr3, i, i2, Bitmap.Config.ARGB_8888);
    }

    public static void savePNG(Context context, int i, int i2, int i3, int i4, String str) {
        savePNG(context, savePixels(i, i2, i3, i4, null), str);
    }

    public static void savePNG(Context context, Bitmap bitmap, String str) {
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), str);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.isDirectory()) {
                parentFile.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
        } catch (Exception e) {
            tlog.w("error saving image " + e);
        }
    }

    public static void savePNG2(Context context, Bitmap bitmap, String str) {
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), str);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.isDirectory()) {
                parentFile.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            tlog.w("error saving image " + e);
        }
    }

    public static void resourceDisposed(boolean z) {
        if (z) {
            return;
        }
        tlog.w("Resource not disposed!");
    }
}
