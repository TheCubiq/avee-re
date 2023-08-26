package com.daaw.avee.comp.AlbumArt;

import android.graphics.Bitmap;
import com.daaw.avee.Common.Action;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.Common.VAsyncTask2;
/* loaded from: classes.dex */
public class ImageSequenceResult extends ImageResult {
    private Action advanceNextFrameCb;
    private Func<Integer> getFramesCountCb;
    private Func<Bitmap> getNextFrameCb;
    private Action resetCurrentFrameCb;

    public ImageSequenceResult(Bitmap bitmap, Func<Integer> func, Action action, Action action2, Func<Bitmap> func2, Action action3) {
        super(bitmap, action3);
        this.getFramesCountCb = func;
        this.resetCurrentFrameCb = action;
        this.advanceNextFrameCb = action2;
        this.getNextFrameCb = func2;
    }

    @Override // com.daaw.avee.comp.AlbumArt.ImageResult
    public int getFramesCount() {
        return this.getFramesCountCb.onInvoke().intValue();
    }

    @Override // com.daaw.avee.comp.AlbumArt.ImageResult
    public void resetCurrentFrame() {
        this.resetCurrentFrameCb.onInvoke();
    }

    @Override // com.daaw.avee.comp.AlbumArt.ImageResult
    public void advanceNextFrame() {
        this.advanceNextFrameCb.onInvoke();
    }

    @Override // com.daaw.avee.comp.AlbumArt.ImageResult
    public Bitmap getNextFrame() {
        return this.getNextFrameCb.onInvoke();
    }

    @Override // com.daaw.avee.comp.AlbumArt.ImageResult
    public void getNextFrame(final Action1<Bitmap> action1) {
        new VAsyncTask(new VAsyncTask.TaskListener<Bitmap>() { // from class: com.daaw.avee.comp.AlbumArt.ImageSequenceResult.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.VAsyncTask.TaskListener
            public Bitmap onExecuteInBg(VAsyncTask<Bitmap> vAsyncTask) {
                return (Bitmap) ImageSequenceResult.this.getNextFrameCb.onInvoke();
            }
        }).RunParallel(new VAsyncTask.ResultListener<Bitmap>() { // from class: com.daaw.avee.comp.AlbumArt.ImageSequenceResult.2
            @Override // com.daaw.avee.Common.VAsyncTask.ResultListener
            public void onResult(Bitmap bitmap, boolean z) {
                action1.onInvoke(bitmap);
            }
        });
    }

    @Override // com.daaw.avee.comp.AlbumArt.ImageResult
    public VAsyncTask2<Bitmap> getNextFrame2() {
        VAsyncTask2<Bitmap> vAsyncTask2 = new VAsyncTask2<>(new VAsyncTask2.TaskListener<Bitmap>() { // from class: com.daaw.avee.comp.AlbumArt.ImageSequenceResult.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.VAsyncTask2.TaskListener
            public Bitmap onExecuteInBg() {
                return (Bitmap) ImageSequenceResult.this.getNextFrameCb.onInvoke();
            }
        });
        vAsyncTask2.RunParallel(new VAsyncTask2.ResultListener<Bitmap>() { // from class: com.daaw.avee.comp.AlbumArt.ImageSequenceResult.4
            @Override // com.daaw.avee.Common.VAsyncTask2.ResultListener
            public void onResult(Bitmap bitmap) {
            }
        });
        return vAsyncTask2;
    }
}
