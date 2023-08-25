package com.daaw;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.util.Arrays;
/* loaded from: classes.dex */
public class vr1 extends vk1 {
    public vp d;

    public vr1(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this(Bitmap.createBitmap(n(i, i2 * i3), 0, i2, i2, i3, Bitmap.Config.ARGB_8888), i4, i5, i6, z);
    }

    public vr1(int i, int i2, int i3, int i4, boolean z) {
        this.d = new vp();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.a = iArr[0];
        this.b = Math.min(i, 4096);
        this.c = Math.min(i2, 4096);
        c();
        f(i3);
        i(i4);
        j(6408, null);
        if (z && br1.c(i) && br1.c(i2)) {
            GLES20.glGenerateMipmap(e());
        }
    }

    public vr1(Bitmap bitmap, int i, int i2, int i3, boolean z) {
        this(bitmap, i, i2, i3, z, 0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    public vr1(Bitmap bitmap, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        this.d = new vp();
        this.b = i6;
        this.c = i7;
        GLES20.glEnable(e());
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.a = iArr[0];
        c();
        g(i, i2);
        i(i3);
        if (bitmap != null) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ARGB_4444 || config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
                p(6408, bitmap);
            } else {
                int[] n = n(-32768, this.b * this.c);
                int i8 = this.b;
                Bitmap createBitmap = Bitmap.createBitmap(n, 0, i8, i8, this.c, Bitmap.Config.ARGB_8888);
                p(6408, createBitmap);
                createBitmap.recycle();
            }
        }
        if (z && br1.c(this.b) && br1.c(this.c)) {
            GLES20.glGenerateMipmap(e());
        }
    }

    public static int[] n(int i, int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, i);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean o() {
        return Boolean.valueOf(!k());
    }

    public void finalize() {
        super.finalize();
        this.d.a(new w40() { // from class: com.daaw.ur1
            @Override // com.daaw.w40
            public final Object a() {
                Boolean o;
                o = vr1.this.o();
                return o;
            }
        });
    }

    public vr1 m() {
        if (k()) {
            return this;
        }
        a();
        lz1.c("Texture is not valid");
        return null;
    }

    public void p(int i, Bitmap bitmap) {
        c();
        h();
        GLUtils.texImage2D(e(), 0, bitmap, 0);
    }
}
