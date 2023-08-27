package com.bumptech.glide.request.animation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
/* loaded from: classes.dex */
public class BitmapCrossFadeFactory extends BitmapContainerCrossFadeFactory<Bitmap> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.request.animation.BitmapContainerCrossFadeFactory
    public Bitmap getBitmap(Bitmap bitmap) {
        return bitmap;
    }

    public BitmapCrossFadeFactory() {
    }

    public BitmapCrossFadeFactory(int i) {
        super(i);
    }

    public BitmapCrossFadeFactory(Context context, int i, int i2) {
        super(context, i, i2);
    }

    public BitmapCrossFadeFactory(Animation animation, int i) {
        super(animation, i);
    }

    public BitmapCrossFadeFactory(GlideAnimationFactory<Drawable> glideAnimationFactory) {
        super(glideAnimationFactory);
    }
}
