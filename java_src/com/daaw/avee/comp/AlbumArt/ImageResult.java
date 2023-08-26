package com.daaw.avee.comp.AlbumArt;

import android.graphics.Bitmap;
import com.daaw.avee.Common.Action;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.VAsyncTask2;
/* loaded from: classes.dex */
public class ImageResult {
    Bitmap bitmap;
    private Action closeCb;

    public void advanceNextFrame() {
    }

    public ImageResult cloneImageResult() {
        return this;
    }

    public int getFramesCount() {
        return 1;
    }

    public VAsyncTask2<Bitmap> getNextFrame2() {
        return null;
    }

    public void resetCurrentFrame() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImageResult(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.closeCb = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImageResult(Bitmap bitmap, Action action) {
        this.bitmap = bitmap;
        this.closeCb = action;
    }

    protected void close() {
        Action action = this.closeCb;
        if (action != null) {
            action.onInvoke();
        }
    }

    private Bitmap getNonPersistentBitmap() {
        return this.bitmap;
    }

    public static Bitmap getNonPersistentBitmapSafe(ImageResult imageResult) {
        if (imageResult != null) {
            return imageResult.getNonPersistentBitmap();
        }
        return null;
    }

    public static void closeSafe(ImageResult imageResult) {
        if (imageResult != null) {
            imageResult.close();
        }
    }

    public Bitmap getNextFrame() {
        return this.bitmap;
    }

    public void getNextFrame(Action1<Bitmap> action1) {
        action1.onInvoke(this.bitmap);
    }
}
