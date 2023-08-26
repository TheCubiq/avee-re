package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.ImageVideoWrapper;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.load.resource.gifbitmap.GifBitmapWrapper;
import com.bumptech.glide.load.resource.gifbitmap.GifBitmapWrapperTransformation;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.provider.LoadProvider;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.animation.DrawableCrossFadeFactory;
import com.bumptech.glide.request.animation.GlideAnimationFactory;
import com.bumptech.glide.request.animation.ViewPropertyAnimation;
import com.bumptech.glide.request.target.Target;
import java.io.File;
/* loaded from: classes.dex */
public class DrawableRequestBuilder<ModelType> extends GenericRequestBuilder<ModelType, ImageVideoWrapper, GifBitmapWrapper, GlideDrawable> implements BitmapOptions, DrawableOptions {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.GenericRequestBuilder
    public /* bridge */ /* synthetic */ GenericRequestBuilder load(Object obj) {
        return load((DrawableRequestBuilder<ModelType>) obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DrawableRequestBuilder(Context context, Class<ModelType> cls, LoadProvider<ModelType, ImageVideoWrapper, GifBitmapWrapper, GlideDrawable> loadProvider, Glide glide, RequestTracker requestTracker, Lifecycle lifecycle) {
        super(context, cls, loadProvider, GlideDrawable.class, glide, requestTracker, lifecycle);
        crossFade();
    }

    public DrawableRequestBuilder<ModelType> thumbnail(DrawableRequestBuilder<?> drawableRequestBuilder) {
        super.thumbnail((GenericRequestBuilder) drawableRequestBuilder);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> thumbnail(GenericRequestBuilder<?, ?, ?, GlideDrawable> genericRequestBuilder) {
        super.thumbnail((GenericRequestBuilder) genericRequestBuilder);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> thumbnail(float f) {
        super.thumbnail(f);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> sizeMultiplier(float f) {
        super.sizeMultiplier(f);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> decoder(ResourceDecoder<ImageVideoWrapper, GifBitmapWrapper> resourceDecoder) {
        super.decoder((ResourceDecoder) resourceDecoder);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> cacheDecoder(ResourceDecoder<File, GifBitmapWrapper> resourceDecoder) {
        super.cacheDecoder((ResourceDecoder) resourceDecoder);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> encoder(ResourceEncoder<GifBitmapWrapper> resourceEncoder) {
        super.encoder((ResourceEncoder) resourceEncoder);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> priority(Priority priority) {
        super.priority(priority);
        return this;
    }

    public DrawableRequestBuilder<ModelType> transform(BitmapTransformation... bitmapTransformationArr) {
        return bitmapTransform(bitmapTransformationArr);
    }

    @Override // com.bumptech.glide.BitmapOptions
    public DrawableRequestBuilder<ModelType> centerCrop() {
        return transform(this.glide.getDrawableCenterCrop());
    }

    @Override // com.bumptech.glide.BitmapOptions
    public DrawableRequestBuilder<ModelType> fitCenter() {
        return transform(this.glide.getDrawableFitCenter());
    }

    public DrawableRequestBuilder<ModelType> bitmapTransform(Transformation<Bitmap>... transformationArr) {
        GifBitmapWrapperTransformation[] gifBitmapWrapperTransformationArr = new GifBitmapWrapperTransformation[transformationArr.length];
        for (int i = 0; i < transformationArr.length; i++) {
            gifBitmapWrapperTransformationArr[i] = new GifBitmapWrapperTransformation(this.glide.getBitmapPool(), transformationArr[i]);
        }
        return transform((Transformation<GifBitmapWrapper>[]) gifBitmapWrapperTransformationArr);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> transform(Transformation<GifBitmapWrapper>... transformationArr) {
        super.transform((Transformation[]) transformationArr);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> transcoder(ResourceTranscoder<GifBitmapWrapper, GlideDrawable> resourceTranscoder) {
        super.transcoder((ResourceTranscoder) resourceTranscoder);
        return this;
    }

    @Override // com.bumptech.glide.DrawableOptions
    public final DrawableRequestBuilder<ModelType> crossFade() {
        super.animate((GlideAnimationFactory) new DrawableCrossFadeFactory());
        return this;
    }

    @Override // com.bumptech.glide.DrawableOptions
    public DrawableRequestBuilder<ModelType> crossFade(int i) {
        super.animate((GlideAnimationFactory) new DrawableCrossFadeFactory(i));
        return this;
    }

    @Override // com.bumptech.glide.DrawableOptions
    @Deprecated
    public DrawableRequestBuilder<ModelType> crossFade(Animation animation, int i) {
        super.animate((GlideAnimationFactory) new DrawableCrossFadeFactory(animation, i));
        return this;
    }

    @Override // com.bumptech.glide.DrawableOptions
    public DrawableRequestBuilder<ModelType> crossFade(int i, int i2) {
        super.animate((GlideAnimationFactory) new DrawableCrossFadeFactory(this.context, i, i2));
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> dontAnimate() {
        super.dontAnimate();
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> animate(ViewPropertyAnimation.Animator animator) {
        super.animate(animator);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> animate(GlideAnimationFactory<GlideDrawable> glideAnimationFactory) {
        super.animate((GlideAnimationFactory) glideAnimationFactory);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> animate(int i) {
        super.animate(i);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    @Deprecated
    public DrawableRequestBuilder<ModelType> animate(Animation animation) {
        super.animate(animation);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> placeholder(int i) {
        super.placeholder(i);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> placeholder(Drawable drawable) {
        super.placeholder(drawable);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> fallback(Drawable drawable) {
        super.fallback(drawable);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> fallback(int i) {
        super.fallback(i);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> error(int i) {
        super.error(i);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> error(Drawable drawable) {
        super.error(drawable);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> listener(RequestListener<? super ModelType, GlideDrawable> requestListener) {
        super.listener((RequestListener) requestListener);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> diskCacheStrategy(DiskCacheStrategy diskCacheStrategy) {
        super.diskCacheStrategy(diskCacheStrategy);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> skipMemoryCache(boolean z) {
        super.skipMemoryCache(z);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> override(int i, int i2) {
        super.override(i, i2);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> sourceEncoder(Encoder<ImageVideoWrapper> encoder) {
        super.sourceEncoder((Encoder) encoder);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> dontTransform() {
        super.dontTransform();
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> signature(Key key) {
        super.signature(key);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public DrawableRequestBuilder<ModelType> load(ModelType modeltype) {
        super.load((DrawableRequestBuilder<ModelType>) modeltype);
        return this;
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    /* renamed from: clone */
    public DrawableRequestBuilder<ModelType> mo5clone() {
        return (DrawableRequestBuilder) super.mo5clone();
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    public Target<GlideDrawable> into(ImageView imageView) {
        return super.into(imageView);
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    void applyFitCenter() {
        fitCenter();
    }

    @Override // com.bumptech.glide.GenericRequestBuilder
    void applyCenterCrop() {
        centerCrop();
    }
}
