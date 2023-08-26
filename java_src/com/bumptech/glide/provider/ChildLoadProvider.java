package com.bumptech.glide.provider;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.io.File;
/* loaded from: classes.dex */
public class ChildLoadProvider<A, T, Z, R> implements LoadProvider<A, T, Z, R>, Cloneable {
    private ResourceDecoder<File, Z> cacheDecoder;
    private ResourceEncoder<Z> encoder;
    private final LoadProvider<A, T, Z, R> parent;
    private ResourceDecoder<T, Z> sourceDecoder;
    private Encoder<T> sourceEncoder;
    private ResourceTranscoder<Z, R> transcoder;

    public ChildLoadProvider(LoadProvider<A, T, Z, R> loadProvider) {
        this.parent = loadProvider;
    }

    @Override // com.bumptech.glide.provider.LoadProvider
    public ModelLoader<A, T> getModelLoader() {
        return this.parent.getModelLoader();
    }

    public void setCacheDecoder(ResourceDecoder<File, Z> resourceDecoder) {
        this.cacheDecoder = resourceDecoder;
    }

    public void setSourceDecoder(ResourceDecoder<T, Z> resourceDecoder) {
        this.sourceDecoder = resourceDecoder;
    }

    public void setEncoder(ResourceEncoder<Z> resourceEncoder) {
        this.encoder = resourceEncoder;
    }

    public void setTranscoder(ResourceTranscoder<Z, R> resourceTranscoder) {
        this.transcoder = resourceTranscoder;
    }

    public void setSourceEncoder(Encoder<T> encoder) {
        this.sourceEncoder = encoder;
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public ResourceDecoder<File, Z> getCacheDecoder() {
        ResourceDecoder<File, Z> resourceDecoder = this.cacheDecoder;
        return resourceDecoder != null ? resourceDecoder : this.parent.getCacheDecoder();
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public ResourceDecoder<T, Z> getSourceDecoder() {
        ResourceDecoder<T, Z> resourceDecoder = this.sourceDecoder;
        return resourceDecoder != null ? resourceDecoder : this.parent.getSourceDecoder();
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public Encoder<T> getSourceEncoder() {
        Encoder<T> encoder = this.sourceEncoder;
        return encoder != null ? encoder : this.parent.getSourceEncoder();
    }

    @Override // com.bumptech.glide.provider.DataLoadProvider
    public ResourceEncoder<Z> getEncoder() {
        ResourceEncoder<Z> resourceEncoder = this.encoder;
        return resourceEncoder != null ? resourceEncoder : this.parent.getEncoder();
    }

    @Override // com.bumptech.glide.provider.LoadProvider
    public ResourceTranscoder<Z, R> getTranscoder() {
        ResourceTranscoder<Z, R> resourceTranscoder = this.transcoder;
        return resourceTranscoder != null ? resourceTranscoder : this.parent.getTranscoder();
    }

    /* renamed from: clone */
    public ChildLoadProvider<A, T, Z, R> m6clone() {
        try {
            return (ChildLoadProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
