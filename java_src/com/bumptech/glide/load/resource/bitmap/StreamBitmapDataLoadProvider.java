package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.model.StreamEncoder;
import com.bumptech.glide.load.resource.file.FileToStreamDecoder;
import com.bumptech.glide.provider.DataLoadProvider;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class StreamBitmapDataLoadProvider implements DataLoadProvider<InputStream, Bitmap> {
    private final FileToStreamDecoder<Bitmap> cacheDecoder;
    private final StreamBitmapDecoder decoder;
    private final StreamEncoder sourceEncoder = new StreamEncoder();
    private final BitmapEncoder encoder = new BitmapEncoder();

    public StreamBitmapDataLoadProvider(BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this.decoder = new StreamBitmapDecoder(bitmapPool, decodeFormat);
        this.cacheDecoder = new FileToStreamDecoder<>(this.decoder);
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public ResourceDecoder<File, Bitmap> getCacheDecoder() {
        return this.cacheDecoder;
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public ResourceDecoder<InputStream, Bitmap> getSourceDecoder() {
        return this.decoder;
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public Encoder<InputStream> getSourceEncoder() {
        return this.sourceEncoder;
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public ResourceEncoder<Bitmap> getEncoder() {
        return this.encoder;
    }
}
