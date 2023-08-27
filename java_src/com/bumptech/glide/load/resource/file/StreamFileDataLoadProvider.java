package com.bumptech.glide.load.resource.file;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.StreamEncoder;
import com.bumptech.glide.load.resource.NullResourceEncoder;
import com.bumptech.glide.provider.DataLoadProvider;
import java.io.File;
import java.io.InputStream;
/* loaded from: classes.dex */
public class StreamFileDataLoadProvider implements DataLoadProvider<InputStream, File> {
    private static final ErrorSourceDecoder ERROR_DECODER = new ErrorSourceDecoder();
    private final ResourceDecoder<File, File> cacheDecoder = new FileDecoder();
    private final Encoder<InputStream> encoder = new StreamEncoder();

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public ResourceDecoder<File, File> getCacheDecoder() {
        return this.cacheDecoder;
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public ResourceDecoder<InputStream, File> getSourceDecoder() {
        return ERROR_DECODER;
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public Encoder<InputStream> getSourceEncoder() {
        return this.encoder;
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public ResourceEncoder<File> getEncoder() {
        return NullResourceEncoder.get();
    }

    /* loaded from: classes.dex */
    private static class ErrorSourceDecoder implements ResourceDecoder<InputStream, File> {
        @Override // com.bumptech.glide.load.ResourceDecoder
        public String getId() {
            return "";
        }

        private ErrorSourceDecoder() {
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public Resource<File> decode(InputStream inputStream, int i, int i2) {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }
    }
}
