package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.InputStream;
/* loaded from: classes.dex */
public class StreamBitmapDecoder implements ResourceDecoder<InputStream, Bitmap> {
    private static final String ID = "StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap";
    private BitmapPool bitmapPool;
    private DecodeFormat decodeFormat;
    private final Downsampler downsampler;
    private String id;

    public StreamBitmapDecoder(Context context) {
        this(Glide.get(context).getBitmapPool());
    }

    public StreamBitmapDecoder(BitmapPool bitmapPool) {
        this(bitmapPool, DecodeFormat.DEFAULT);
    }

    public StreamBitmapDecoder(Context context, DecodeFormat decodeFormat) {
        this(Glide.get(context).getBitmapPool(), decodeFormat);
    }

    public StreamBitmapDecoder(BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this(Downsampler.AT_LEAST, bitmapPool, decodeFormat);
    }

    public StreamBitmapDecoder(Downsampler downsampler, BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this.downsampler = downsampler;
        this.bitmapPool = bitmapPool;
        this.decodeFormat = decodeFormat;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<Bitmap> decode(InputStream inputStream, int i, int i2) {
        return BitmapResource.obtain(this.downsampler.decode(inputStream, this.bitmapPool, i, i2, this.decodeFormat), this.bitmapPool);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public String getId() {
        if (this.id == null) {
            this.id = ID + this.downsampler.getId() + this.decodeFormat.name();
        }
        return this.id;
    }
}
