package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.GenericRequestBuilder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.NullEncoder;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.UUID;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class GifFrameLoader {
    private final FrameCallback callback;
    private DelayTarget current;
    private final GifDecoder gifDecoder;
    private final Handler handler;
    private boolean isCleared;
    private boolean isLoadPending;
    private boolean isRunning;
    private GenericRequestBuilder<GifDecoder, GifDecoder, Bitmap, Bitmap> requestBuilder;

    /* loaded from: classes.dex */
    public interface FrameCallback {
        void onFrameReady(int i);
    }

    public GifFrameLoader(Context context, FrameCallback frameCallback, GifDecoder gifDecoder, int i, int i2) {
        this(frameCallback, gifDecoder, null, getRequestBuilder(context, gifDecoder, i, i2, Glide.get(context).getBitmapPool()));
    }

    GifFrameLoader(FrameCallback frameCallback, GifDecoder gifDecoder, Handler handler, GenericRequestBuilder<GifDecoder, GifDecoder, Bitmap, Bitmap> genericRequestBuilder) {
        this.isRunning = false;
        this.isLoadPending = false;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new FrameLoaderCallback()) : handler;
        this.callback = frameCallback;
        this.gifDecoder = gifDecoder;
        this.handler = handler;
        this.requestBuilder = genericRequestBuilder;
    }

    public void setFrameTransformation(Transformation<Bitmap> transformation) {
        if (transformation == null) {
            throw new NullPointerException("Transformation must not be null");
        }
        this.requestBuilder = this.requestBuilder.transform(transformation);
    }

    public void start() {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        this.isCleared = false;
        loadNextFrame();
    }

    public void stop() {
        this.isRunning = false;
    }

    public void clear() {
        stop();
        DelayTarget delayTarget = this.current;
        if (delayTarget != null) {
            Glide.clear(delayTarget);
            this.current = null;
        }
        this.isCleared = true;
    }

    public Bitmap getCurrentFrame() {
        DelayTarget delayTarget = this.current;
        if (delayTarget != null) {
            return delayTarget.getResource();
        }
        return null;
    }

    private void loadNextFrame() {
        if (!this.isRunning || this.isLoadPending) {
            return;
        }
        this.isLoadPending = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.gifDecoder.getNextDelay();
        this.gifDecoder.advance();
        this.requestBuilder.signature(new FrameSignature()).into((GenericRequestBuilder<GifDecoder, GifDecoder, Bitmap, Bitmap>) new DelayTarget(this.handler, this.gifDecoder.getCurrentFrameIndex(), uptimeMillis));
    }

    void onFrameReady(DelayTarget delayTarget) {
        if (this.isCleared) {
            this.handler.obtainMessage(2, delayTarget).sendToTarget();
            return;
        }
        DelayTarget delayTarget2 = this.current;
        this.current = delayTarget;
        this.callback.onFrameReady(delayTarget.index);
        if (delayTarget2 != null) {
            this.handler.obtainMessage(2, delayTarget2).sendToTarget();
        }
        this.isLoadPending = false;
        loadNextFrame();
    }

    /* loaded from: classes.dex */
    private class FrameLoaderCallback implements Handler.Callback {
        public static final int MSG_CLEAR = 2;
        public static final int MSG_DELAY = 1;

        private FrameLoaderCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                GifFrameLoader.this.onFrameReady((DelayTarget) message.obj);
                return true;
            } else if (message.what == 2) {
                Glide.clear((DelayTarget) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class DelayTarget extends SimpleTarget<Bitmap> {
        private final Handler handler;
        private final int index;
        private Bitmap resource;
        private final long targetTime;

        @Override // com.bumptech.glide.request.target.Target
        public /* bridge */ /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
            onResourceReady((Bitmap) obj, (GlideAnimation<? super Bitmap>) glideAnimation);
        }

        public DelayTarget(Handler handler, int i, long j) {
            this.handler = handler;
            this.index = i;
            this.targetTime = j;
        }

        public Bitmap getResource() {
            return this.resource;
        }

        public void onResourceReady(Bitmap bitmap, GlideAnimation<? super Bitmap> glideAnimation) {
            this.resource = bitmap;
            this.handler.sendMessageAtTime(this.handler.obtainMessage(1, this), this.targetTime);
        }
    }

    private static GenericRequestBuilder<GifDecoder, GifDecoder, Bitmap, Bitmap> getRequestBuilder(Context context, GifDecoder gifDecoder, int i, int i2, BitmapPool bitmapPool) {
        GifFrameResourceDecoder gifFrameResourceDecoder = new GifFrameResourceDecoder(bitmapPool);
        GifFrameModelLoader gifFrameModelLoader = new GifFrameModelLoader();
        return Glide.with(context).using(gifFrameModelLoader, GifDecoder.class).load(gifDecoder).as(Bitmap.class).sourceEncoder(NullEncoder.get()).decoder(gifFrameResourceDecoder).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).override(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class FrameSignature implements Key {
        private final UUID uuid;

        public FrameSignature() {
            this(UUID.randomUUID());
        }

        FrameSignature(UUID uuid) {
            this.uuid = uuid;
        }

        @Override // com.bumptech.glide.load.Key
        public boolean equals(Object obj) {
            if (obj instanceof FrameSignature) {
                return ((FrameSignature) obj).uuid.equals(this.uuid);
            }
            return false;
        }

        @Override // com.bumptech.glide.load.Key
        public int hashCode() {
            return this.uuid.hashCode();
        }

        @Override // com.bumptech.glide.load.Key
        public void updateDiskCacheKey(MessageDigest messageDigest) throws UnsupportedEncodingException {
            throw new UnsupportedOperationException("Not implemented");
        }
    }
}
