package com.bumptech.glide.load.resource.gifbitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.GifDrawable;
/* loaded from: classes.dex */
public class GifBitmapWrapperResource implements Resource<GifBitmapWrapper> {
    private final GifBitmapWrapper data;

    public GifBitmapWrapperResource(GifBitmapWrapper gifBitmapWrapper) {
        if (gifBitmapWrapper == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.data = gifBitmapWrapper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.engine.Resource
    public GifBitmapWrapper get() {
        return this.data;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return this.data.getSize();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
        Resource<Bitmap> bitmapResource = this.data.getBitmapResource();
        if (bitmapResource != null) {
            bitmapResource.recycle();
        }
        Resource<GifDrawable> gifResource = this.data.getGifResource();
        if (gifResource != null) {
            gifResource.recycle();
        }
    }
}
