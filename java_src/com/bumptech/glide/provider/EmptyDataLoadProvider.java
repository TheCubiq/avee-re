package com.bumptech.glide.provider;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import java.io.File;
/* loaded from: classes.dex */
public class EmptyDataLoadProvider<T, Z> implements DataLoadProvider<T, Z> {
    private static final DataLoadProvider<?, ?> EMPTY_DATA_LOAD_PROVIDER = new EmptyDataLoadProvider();

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public ResourceDecoder<File, Z> getCacheDecoder() {
        return null;
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public ResourceEncoder<Z> getEncoder() {
        return null;
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public ResourceDecoder<T, Z> getSourceDecoder() {
        return null;
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public Encoder<T> getSourceEncoder() {
        return null;
    }

    public static <T, Z> DataLoadProvider<T, Z> get() {
        return (DataLoadProvider<T, Z>) EMPTY_DATA_LOAD_PROVIDER;
    }
}
