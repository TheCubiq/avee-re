package com.daaw.avee.comp.Visualizer.Graphic;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.daaw.avee.Common.DbgVar;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.tlog;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Arrays;
import mdesl.graphics.Texture;
/* loaded from: classes.dex */
public class VTexture extends Texture {
    public static final int DEFAULT_FILTER = 9729;
    public static final int DEFAULT_WRAP = 10497;
    DbgVar dbgVar;

    public VTexture(int i, int i2, int i3, int i4, boolean z) {
        this.dbgVar = new DbgVar();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.id = iArr[0];
        this.width = Math.min(i, 4096);
        this.height = Math.min(i2, 4096);
        bind();
        setFilter(i3);
        setWrap(i4);
        upload(6408, (ByteBuffer) null);
        if (z && Utils.IsPowerOfTwo(i) && Utils.IsPowerOfTwo(i2)) {
            GLES20.glGenerateMipmap(getTarget());
        }
    }

    public VTexture(String str, int i, int i2, int i3, boolean z) {
        Bitmap bitmap;
        this.dbgVar = new DbgVar();
        File file = new File(str);
        if (file.exists()) {
            bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            this.width = bitmap.getWidth();
            this.height = bitmap.getHeight();
            if (this.width < 1 || this.height < 1) {
                tlog.w("texture invalid dimensions");
            }
        } else {
            this.width = 1;
            this.height = 1;
            bitmap = null;
        }
        GLES20.glEnable(getTarget());
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.id = iArr[0];
        bind();
        setFilter(i, i2);
        setWrap(i3);
        if (bitmap != null) {
            upload(6408, bitmap);
        }
        if (z && Utils.IsPowerOfTwo(this.width) && Utils.IsPowerOfTwo(this.height)) {
            GLES20.glGenerateMipmap(getTarget());
        }
    }

    public VTexture(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this(Bitmap.createBitmap(createSolidArray(i, i2 * i3), 0, i2, i2, i3, Bitmap.Config.ARGB_8888), i4, i5, i6, z);
    }

    public VTexture(Bitmap bitmap, int i, int i2, int i3, boolean z) {
        this(bitmap, i, i2, i3, z, 0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    public VTexture(Bitmap bitmap, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        this.dbgVar = new DbgVar();
        this.width = i6;
        this.height = i7;
        GLES20.glEnable(getTarget());
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.id = iArr[0];
        bind();
        setFilter(i, i2);
        setWrap(i3);
        if (bitmap != null) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ARGB_4444 || config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
                upload(6408, bitmap);
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(createSolidArray(-32768, this.width * this.height), 0, this.width, this.width, this.height, Bitmap.Config.ARGB_8888);
                upload(6408, createBitmap);
                createBitmap.recycle();
            }
        }
        if (z && Utils.IsPowerOfTwo(this.width) && Utils.IsPowerOfTwo(this.height)) {
            GLES20.glGenerateMipmap(getTarget());
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        this.dbgVar.assertDisposed(new Func() { // from class: com.daaw.avee.comp.Visualizer.Graphic.-$$Lambda$VTexture$iHw0n_48c1znmIQ5lshPz95ShZ4
            @Override // com.daaw.avee.Common.Func.Func
            public final Object onInvoke() {
                return VTexture.this.lambda$finalize$0$VTexture();
            }
        });
    }

    public /* synthetic */ Boolean lambda$finalize$0$VTexture() {
        return Boolean.valueOf(!valid());
    }

    private static int[] createSolidArray(int i, int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, i);
        return iArr;
    }

    protected void upload(int i, Bitmap bitmap) {
        bind();
        setUnpackAlignment();
        GLUtils.texImage2D(getTarget(), 0, bitmap, 0);
    }

    public VTexture checkIfValid() {
        if (valid()) {
            return this;
        }
        dispose();
        tlog.w("Texture is not valid");
        return null;
    }
}
