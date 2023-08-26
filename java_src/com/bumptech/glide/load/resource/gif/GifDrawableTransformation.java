package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
/* loaded from: classes.dex */
public class GifDrawableTransformation implements Transformation<GifDrawable> {
    private final BitmapPool bitmapPool;
    private final Transformation<Bitmap> wrapped;

    public GifDrawableTransformation(Transformation<Bitmap> transformation, BitmapPool bitmapPool) {
        this.wrapped = transformation;
        this.bitmapPool = bitmapPool;
    }

    @Override // com.bumptech.glide.load.Transformation
    public Resource<GifDrawable> transform(Resource<GifDrawable> resource, int i, int i2) {
        GifDrawable gifDrawable = resource.get();
        Bitmap firstFrame = resource.get().getFirstFrame();
        Bitmap bitmap = this.wrapped.transform(new BitmapResource(firstFrame, this.bitmapPool), i, i2).get();
        return !bitmap.equals(firstFrame) ? new GifDrawableResource(new GifDrawable(gifDrawable, bitmap, this.wrapped)) : resource;
    }

    @Override // com.bumptech.glide.load.Transformation
    public String getId() {
        return this.wrapped.getId();
    }
}
