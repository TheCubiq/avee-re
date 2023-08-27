package com.daaw.avee.comp.AlbumArt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.util.Size;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.AOSP.MyThumbnailUtils;
import com.bumptech.glide.BitmapRequestBuilder;
import com.bumptech.glide.DrawableRequestBuilder;
import com.bumptech.glide.GenericRequestBuilder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.model.ImageVideoWrapper;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.bitmap.FileDescriptorBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.GlideBitmapDrawable;
import com.bumptech.glide.load.resource.bitmap.ImageVideoBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifResourceDecoder;
import com.bumptech.glide.load.resource.gifbitmap.GifBitmapWrapper;
import com.bumptech.glide.load.resource.gifbitmap.GifBitmapWrapperResource;
import com.bumptech.glide.load.resource.gifbitmap.GifBitmapWrapperResourceDecoder;
import com.bumptech.glide.load.resource.gifbitmap.GifBitmapWrapperTransformation;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.signature.StringSignature;
import com.daaw.avee.Common.Action;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.Ref;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.UtilsFileSys;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.Mp3File;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class AlbumArtCore implements IAlbumArtCore {
    public static final boolean THUMB_FROM_RESOLVER = !Utils.PRE_Q;
    public static WeakEventR1<Object, File> onRequestLocalFolder = new WeakEventR1<>();
    private static final Object createInstanceLock = new Object();
    private static volatile WeakReference<AlbumArtCore> instanceWeak = new WeakReference<>(null);
    private static Drawable drawableBg = null;

    /* loaded from: classes.dex */
    private static class ColorKeyTransformation extends GifBitmapWrapperTransformation {
        private BitmapPool bitmapPool;
        private ImageColorKeyParams colorKeyParams;
        private Context context;

        public ColorKeyTransformation(final BitmapPool bitmapPool, Context context, final ImageColorKeyParams imageColorKeyParams) {
            super(bitmapPool, new Transformation<Bitmap>() { // from class: com.daaw.avee.comp.AlbumArt.AlbumArtCore.ColorKeyTransformation.1
                @Override // com.bumptech.glide.load.Transformation
                public Resource<Bitmap> transform(Resource<Bitmap> resource, int i, int i2) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(resource.get().copy(Bitmap.Config.ARGB_8888, true), i, i2, false);
                    Ref ref = new Ref(null);
                    return BitmapResource.obtain(ColorKey.processBitmapColorKey(createScaledBitmap, ImageColorKeyParams.this, new Ref(null), ref), bitmapPool);
                }

                @Override // com.bumptech.glide.load.Transformation
                public String getId() {
                    return "ck4" + ImageColorKeyParams.this.getStrId();
                }
            });
            this.context = context;
            this.bitmapPool = bitmapPool;
            this.colorKeyParams = imageColorKeyParams;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class MyRequestDecoder implements ResourceDecoder<ImageVideoWrapper, GifBitmapWrapper> {
        private BitmapPool bitmapPool;
        public String cacheSignature;
        protected Context context;
        private String dataSource;
        private int gen_hint;
        private int gen_hint2;
        private String generateText;
        private boolean isLarge;
        private boolean loadFromMp3Tags;
        protected boolean useCache;

        public MyRequestDecoder(BitmapPool bitmapPool, Context context, boolean z, String str, boolean z2, String str2, int i, int i2, boolean z3) {
            this.bitmapPool = bitmapPool;
            this.context = context;
            this.useCache = z;
            this.dataSource = str;
            this.isLarge = z2;
            this.generateText = str2;
            this.gen_hint = i;
            this.gen_hint2 = i2;
            this.loadFromMp3Tags = z3;
            StringBuilder sb = new StringBuilder();
            sb.append("src:");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(":");
            sb.append(i2);
            sb.append("t:");
            sb.append(z3 ? "t" : "f");
            this.cacheSignature = sb.toString();
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public Resource<GifBitmapWrapper> decode(ImageVideoWrapper imageVideoWrapper, int i, int i2) throws IOException {
            String str;
            Bitmap loadAlbumArtFromTags = (((this.gen_hint & 4) != 0) || !this.loadFromMp3Tags || (str = this.dataSource) == null || str.length() <= 0) ? null : AlbumArtCore.this.loadAlbumArtFromTags(this.dataSource);
            if (loadAlbumArtFromTags == null) {
                loadAlbumArtFromTags = AlbumArtCore.this.loadVideoThumbOrGenerate(this.dataSource, false, this.generateText, i, i2, this.gen_hint, this.gen_hint2);
            }
            if (loadAlbumArtFromTags == null) {
                return null;
            }
            return new GifBitmapWrapperResource(new GifBitmapWrapper(BitmapResource.obtain(loadAlbumArtFromTags, this.bitmapPool), null));
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public String getId() {
            return this.cacheSignature;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class MyRequestListener extends MyRequestDecoder implements RequestListener<Object, GlideDrawable> {
        @Override // com.bumptech.glide.request.RequestListener
        public boolean onResourceReady(GlideDrawable glideDrawable, Object obj, Target<GlideDrawable> target, boolean z, boolean z2) {
            return false;
        }

        public MyRequestListener(BitmapPool bitmapPool, Context context, boolean z, String str, boolean z2, String str2, int i, int i2) {
            super(bitmapPool, context, z, str, z2, str2, i, i2, false);
        }

        @Override // com.bumptech.glide.request.RequestListener
        public boolean onException(Exception exc, Object obj, Target<GlideDrawable> target, boolean z) {
            GenericRequestBuilder load = AlbumArtCore.this.getMyPicasso(this.context).load(Integer.valueOf((int) R.drawable.dot1x1));
            if (!this.useCache) {
                load = load.skipMemoryCache(true);
            }
            load.decoder((ResourceDecoder<ImageVideoWrapper, GifBitmapWrapper>) this).signature((Key) new StringSignature(this.cacheSignature)).diskCacheStrategy(DiskCacheStrategy.NONE).into((DrawableRequestBuilder) target);
            return true;
        }
    }

    /* loaded from: classes.dex */
    private class MyBitmapRequestListener implements ResourceDecoder<ImageVideoWrapper, Bitmap>, RequestListener<Uri, Bitmap> {
        private BitmapPool bitmapPool;
        public String cacheSignature;
        private Context context;
        private String dataSource;
        private int gen_hint;
        private int gen_hint2;
        private String generateText;
        private boolean isLarge;
        private boolean useCache;

        @Override // com.bumptech.glide.request.RequestListener
        public boolean onResourceReady(Bitmap bitmap, Uri uri, Target<Bitmap> target, boolean z, boolean z2) {
            return false;
        }

        public MyBitmapRequestListener(BitmapPool bitmapPool, Context context, boolean z, String str, boolean z2, String str2, int i, int i2, int i3, int i4) {
            this.bitmapPool = bitmapPool;
            this.context = context;
            this.useCache = z;
            this.dataSource = str;
            this.isLarge = z2;
            this.generateText = str2;
            this.gen_hint = i3;
            this.gen_hint2 = i4;
            this.cacheSignature = "ca1:" + str2 + ":" + i3 + ":" + i4 + ":" + i + ":" + i2;
        }

        @Override // com.bumptech.glide.request.RequestListener
        public boolean onException(Exception exc, Uri uri, Target<Bitmap> target, boolean z) {
            BitmapRequestBuilder<Integer, Bitmap> diskCacheStrategy = AlbumArtCore.this.getMyPicasso(this.context).load(Integer.valueOf((int) R.drawable.dot1x1)).asBitmap().diskCacheStrategy(DiskCacheStrategy.NONE);
            if (!this.useCache) {
                diskCacheStrategy = diskCacheStrategy.skipMemoryCache(true);
            }
            diskCacheStrategy.decoder((ResourceDecoder<ImageVideoWrapper, Bitmap>) this).signature((Key) new StringSignature(this.cacheSignature)).into((BitmapRequestBuilder<Integer, Bitmap>) target);
            return true;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public Resource<Bitmap> decode(ImageVideoWrapper imageVideoWrapper, int i, int i2) throws IOException {
            return BitmapResource.obtain(null, this.bitmapPool);
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public String getId() {
            return this.cacheSignature;
        }
    }

    public static IAlbumArtCore getInstance() {
        return instanceWeak.get();
    }

    public static IAlbumArtCore createInstance(Context context) {
        AlbumArtCore albumArtCore;
        AlbumArtCore albumArtCore2 = instanceWeak.get();
        if (albumArtCore2 != null) {
            return albumArtCore2;
        }
        synchronized (createInstanceLock) {
            albumArtCore = instanceWeak.get();
            if (albumArtCore == null) {
                albumArtCore = new AlbumArtCore();
                instanceWeak = new WeakReference<>(albumArtCore);
            }
        }
        return albumArtCore;
    }

    private BitmapPool getBitmapPool(Context context) {
        return Glide.get(context).getBitmapPool();
    }

    private ResourceDecoder<ImageVideoWrapper, GifBitmapWrapper> getDecoder(Context context, BitmapPool bitmapPool) {
        return new GifBitmapWrapperResourceDecoder(new ImageVideoBitmapDecoder(new StreamBitmapDecoder(bitmapPool, DecodeFormat.PREFER_ARGB_8888), new FileDescriptorBitmapDecoder(bitmapPool, DecodeFormat.PREFER_ARGB_8888)), new GifResourceDecoder(context, bitmapPool), bitmapPool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RequestManager getMyPicasso(Context context) {
        return Glide.with(context);
    }

    @Override // com.daaw.avee.comp.AlbumArt.IAlbumArtCore
    public void cancelRequest(ImageView imageView) {
        Glide.clear(imageView);
    }

    private boolean shouldTryLoadFromMp3Tags(String str) {
        Uri parse;
        if (str == null || str.length() <= 0 || (parse = Uri.parse(str)) == null) {
            return false;
        }
        return "mp3".equals(UtilsFileSys.extractFilenameExt(parse.getPath()));
    }

    @Override // com.daaw.avee.comp.AlbumArt.IAlbumArtCore
    public void loadAlbumArt(Uri uri, String str, String str2, String str3, ImageView imageView, boolean z, boolean z2, boolean z3) {
        DrawableRequestBuilder<?> drawableRequestBuilder;
        String str4 = str;
        Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return;
        }
        Bitmap loadFromResolver = loadFromResolver(appContext, uri, imageView.getWidth(), imageView.getHeight());
        if (loadFromResolver != null) {
            imageView.setImageBitmap(loadFromResolver);
            return;
        }
        String decode = Uri.decode(uri.toString());
        boolean shouldTryLoadFromMp3Tags = shouldTryLoadFromMp3Tags(decode);
        if (str4 != null && str.length() > 0 && str.charAt(0) == '/') {
            str4 = "file://" + str;
        }
        Uri parse = Uri.parse(str4 != null ? str4 : "file://");
        BitmapPool bitmapPool = getBitmapPool(appContext);
        if (shouldTryLoadFromMp3Tags) {
            drawableRequestBuilder = setupFromMp3Tags(z, bitmapPool, appContext, true, decode, false, str3, 0, -1);
        } else {
            drawableRequestBuilder = setupFromUri(parse, z, bitmapPool, appContext, true, decode, false, str3, 0, -1);
        }
        drawableRequestBuilder.into(imageView);
    }

    private Bitmap loadFromResolver(Context context, Uri uri, int i, int i2) {
        if (THUMB_FROM_RESOLVER) {
            boolean z = i < 1;
            boolean z2 = i2 < 1;
            if (z2 || z) {
                tlog.w("Dimensions were too small");
            }
            if (z) {
                i = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
            }
            if (z2) {
                i2 = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
            }
            try {
                return context.getContentResolver().loadThumbnail(uri, new Size(i, i2), null);
            } catch (IOException e) {
                tlog.e(e, "");
            }
        }
        return null;
    }

    @Override // com.daaw.avee.comp.AlbumArt.IAlbumArtCore
    public void loadAlbumArtLarge(boolean z, Uri uri, String str, String str2, String str3, boolean z2, ImageLoadedListener imageLoadedListener, int i, int i2, int i3, int i4, int i5, int i6, boolean z3, ImageColorKeyParams imageColorKeyParams, Object obj) {
        int i7 = i2;
        int i8 = i;
        if (i8 < 2) {
            i8 = Math.max(2, Math.max(i, i2));
        }
        int i9 = i8;
        if (i7 < 2) {
            i7 = Math.max(2, Math.max(i9, i7));
        }
        int i10 = i7;
        int i11 = i3;
        if (i11 < 2) {
            i11 = Math.max(2, Math.max(i3, i4));
        }
        int i12 = i11;
        loadASyncAlbumArtLarge2(z, uri, str, str2, str3, z2, imageLoadedListener, i9, i10, i12, i4 < 2 ? Math.max(2, Math.max(i12, i4)) : i4, i5, i6, z3, imageColorKeyParams, obj);
    }

    public DrawableRequestBuilder<?> setupFromMp3Tags(boolean z, BitmapPool bitmapPool, Context context, boolean z2, String str, boolean z3, String str2, int i, int i2) {
        DrawableRequestBuilder load = getMyPicasso(context).load(Integer.valueOf((int) R.drawable.ic_launcher));
        load.placeholder(R.drawable.placeholderart4);
        load.error(R.drawable.placeholderart4);
        if (z) {
            load.fitCenter();
        }
        if (!z2) {
            load = load.skipMemoryCache(true);
        }
        DrawableRequestBuilder drawableRequestBuilder = load;
        MyRequestDecoder myRequestDecoder = new MyRequestDecoder(bitmapPool, context, z2, str, z3, str2, i, i2, true);
        drawableRequestBuilder.signature(new StringSignature(myRequestDecoder.cacheSignature));
        drawableRequestBuilder.decoder((ResourceDecoder<ImageVideoWrapper, GifBitmapWrapper>) myRequestDecoder);
        drawableRequestBuilder.diskCacheStrategy(DiskCacheStrategy.NONE);
        return drawableRequestBuilder;
    }

    public DrawableRequestBuilder<?> setupFromUri(Uri uri, boolean z, BitmapPool bitmapPool, Context context, boolean z2, String str, boolean z3, String str2, int i, int i2) {
        DrawableRequestBuilder<Uri> diskCacheStrategy = getMyPicasso(context).load(uri).placeholder((int) R.drawable.placeholderart4).error((int) R.drawable.placeholderart4).diskCacheStrategy(DiskCacheStrategy.NONE);
        if (z) {
            diskCacheStrategy.fitCenter();
        }
        MyRequestListener myRequestListener = new MyRequestListener(bitmapPool, context, z2, str, z3, str2, i, i2);
        diskCacheStrategy.signature((Key) new StringSignature(myRequestListener.cacheSignature));
        diskCacheStrategy.listener((RequestListener<? super Uri, GlideDrawable>) myRequestListener);
        diskCacheStrategy.decoder(getDecoder(context, bitmapPool));
        return diskCacheStrategy;
    }

    public DrawableRequestBuilder<?> setupFromUri(Integer num, boolean z, BitmapPool bitmapPool, Context context, boolean z2, String str, boolean z3, String str2, int i, int i2) {
        DrawableRequestBuilder<Integer> diskCacheStrategy = getMyPicasso(context).load(num).placeholder((int) R.drawable.placeholderart4).error((int) R.drawable.placeholderart4).diskCacheStrategy(DiskCacheStrategy.NONE);
        if (z) {
            diskCacheStrategy.fitCenter();
        }
        MyRequestListener myRequestListener = new MyRequestListener(bitmapPool, context, z2, str, z3, str2, i, i2);
        diskCacheStrategy.signature((Key) new StringSignature(myRequestListener.cacheSignature));
        diskCacheStrategy.listener((RequestListener<? super Integer, GlideDrawable>) myRequestListener);
        return diskCacheStrategy;
    }

    private void loadASyncAlbumArtLarge2(boolean z, Uri uri, final String str, final String str2, String str3, boolean z2, final ImageLoadedListener imageLoadedListener, final int i, final int i2, int i3, int i4, int i5, int i6, boolean z3, final ImageColorKeyParams imageColorKeyParams, Object obj) {
        Context context;
        String str4;
        GlideDrawable glideDrawable;
        String str5;
        final DrawableRequestBuilder<?> drawableRequestBuilder;
        String str6;
        GlideDrawable glideDrawable2;
        String str7;
        DrawableRequestBuilder<?> drawableRequestBuilder2;
        Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return;
        }
        final String decode = Uri.decode(uri.toString());
        Bitmap loadFromResolver = loadFromResolver(appContext, uri, i, i2);
        if (loadFromResolver != null) {
            imageLoadedListener.onBitmapLoaded(new ImageResult(loadFromResolver), decode, str, str2);
            return;
        }
        boolean shouldTryLoadFromMp3Tags = shouldTryLoadFromMp3Tags(decode);
        Target<GlideDrawable> target = new Target<GlideDrawable>() { // from class: com.daaw.avee.comp.AlbumArt.AlbumArtCore.1
            @Override // com.bumptech.glide.request.target.Target
            public Request getRequest() {
                return null;
            }

            @Override // com.bumptech.glide.manager.LifecycleListener
            public void onDestroy() {
            }

            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
            }

            @Override // com.bumptech.glide.request.target.Target
            public void onLoadStarted(Drawable drawable) {
            }

            @Override // com.bumptech.glide.manager.LifecycleListener
            public void onStart() {
            }

            @Override // com.bumptech.glide.manager.LifecycleListener
            public void onStop() {
            }

            @Override // com.bumptech.glide.request.target.Target
            public void setRequest(Request request) {
            }

            @Override // com.bumptech.glide.request.target.Target
            public /* bridge */ /* synthetic */ void onResourceReady(GlideDrawable glideDrawable3, GlideAnimation<? super GlideDrawable> glideAnimation) {
                onResourceReady2(glideDrawable3, (GlideAnimation) glideAnimation);
            }

            @Override // com.bumptech.glide.request.target.Target
            public void onLoadFailed(Exception exc, Drawable drawable) {
                imageLoadedListener.onBitmapLoaded(null, decode, str, str2);
            }

            /* renamed from: onResourceReady  reason: avoid collision after fix types in other method */
            public void onResourceReady2(GlideDrawable glideDrawable3, GlideAnimation glideAnimation) {
                AlbumArtCore.onGlideDrawableResult(imageLoadedListener, glideDrawable3, decode, str, str2, imageColorKeyParams);
            }

            @Override // com.bumptech.glide.request.target.Target
            public void getSize(SizeReadyCallback sizeReadyCallback) {
                int i7;
                int i8 = i;
                if (i8 > 0 && (i7 = i2) > 0) {
                    sizeReadyCallback.onSizeReady(i8, i7);
                } else {
                    sizeReadyCallback.onSizeReady(256, 256);
                }
            }
        };
        imageLoadedListener.setUserObject1(target);
        String str8 = (i5 & 4) != 0 ? "file://" : str;
        boolean z4 = Looper.myLooper() == Looper.getMainLooper();
        BitmapPool bitmapPool = getBitmapPool(appContext);
        int resIdFromPath = InternalBitmapLoader.getResIdFromPath(str8);
        if (resIdFromPath > 0) {
            context = appContext;
            drawableRequestBuilder = setupFromUri(Integer.valueOf(resIdFromPath), true, bitmapPool, appContext, z3, decode, true, str3, i5, i6);
            drawableRequestBuilder.dontAnimate();
            str5 = str8;
            str4 = "file://";
            glideDrawable = null;
        } else {
            context = appContext;
            if (str8 != null && str8.length() > 0) {
                String fileNameFromPath = LocalBitmapLoader.getFileNameFromPath(str8);
                if (obj != null && fileNameFromPath != null) {
                    File invoke = onRequestLocalFolder.invoke(obj, null);
                    if (invoke == null) {
                        invoke = null;
                    }
                    String absolutePath = new File(invoke, fileNameFromPath).getAbsolutePath();
                    if (absolutePath == null || absolutePath.length() <= 0) {
                        str6 = "file://";
                    } else if (absolutePath.charAt(0) == '/') {
                        StringBuilder sb = new StringBuilder();
                        str6 = "file://";
                        sb.append(str6);
                        sb.append(absolutePath);
                        absolutePath = sb.toString();
                    } else {
                        str6 = "file://";
                    }
                    String str9 = absolutePath;
                    str4 = str6;
                    glideDrawable = null;
                    drawableRequestBuilder = setupFromUri(Uri.parse(str9), true, bitmapPool, context, z3, decode, true, str3, i5, i6);
                    drawableRequestBuilder.dontAnimate();
                    str5 = str9;
                }
            }
            str4 = "file://";
            glideDrawable = null;
            str5 = str8;
            drawableRequestBuilder = null;
        }
        if (drawableRequestBuilder == null) {
            if (str5 == null || str5.length() <= 0 || str5.charAt(0) != '/') {
                str7 = str4;
            } else {
                StringBuilder sb2 = new StringBuilder();
                str7 = str4;
                sb2.append(str7);
                sb2.append(str);
                str5 = sb2.toString();
            }
            String str10 = str5;
            if (str10 == null || str10.length() <= 0) {
                str10 = str7;
            }
            Uri parse = Uri.parse(str10);
            if (shouldTryLoadFromMp3Tags) {
                drawableRequestBuilder2 = setupFromMp3Tags(true, bitmapPool, context, z3, decode, true, str3, i5, i6);
            } else {
                drawableRequestBuilder2 = setupFromUri(parse, true, bitmapPool, context, z3, decode, true, str3, i5, i6);
            }
            drawableRequestBuilder = drawableRequestBuilder2;
            drawableRequestBuilder.dontAnimate();
        }
        if (z4) {
            drawableRequestBuilder.into((DrawableRequestBuilder<?>) target);
        } else if (z) {
            try {
                glideDrawable2 = drawableRequestBuilder.into(i, i2).get(1500L, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                tlog.w(e.getMessage());
                glideDrawable2 = glideDrawable;
            }
            onGlideDrawableResult(imageLoadedListener, glideDrawable2, decode, str, str2, imageColorKeyParams);
        } else {
            new VAsyncTask(new VAsyncTask.TaskListener<GlideDrawable>() { // from class: com.daaw.avee.comp.AlbumArt.AlbumArtCore.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.daaw.avee.Common.VAsyncTask.TaskListener
                public GlideDrawable onExecuteInBg(VAsyncTask<GlideDrawable> vAsyncTask) {
                    try {
                        return drawableRequestBuilder.into(i, i2).get(9000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                        return null;
                    } catch (ExecutionException e3) {
                        e3.printStackTrace();
                        return null;
                    } catch (TimeoutException e4) {
                        e4.printStackTrace();
                        return null;
                    }
                }
            }).RunParallel(new VAsyncTask.ResultListener<GlideDrawable>() { // from class: com.daaw.avee.comp.AlbumArt.AlbumArtCore.3
                @Override // com.daaw.avee.Common.VAsyncTask.ResultListener
                public void onResult(GlideDrawable glideDrawable3, boolean z5) {
                    AlbumArtCore.onGlideDrawableResult(imageLoadedListener, glideDrawable3, decode, str, str2, imageColorKeyParams);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onGlideDrawableResult(ImageLoadedListener imageLoadedListener, GlideDrawable glideDrawable, String str, String str2, String str3, final ImageColorKeyParams imageColorKeyParams) {
        if (glideDrawable == null) {
            imageLoadedListener.onBitmapLoaded(new ImageResult(null), str, str2, str3);
        } else if (glideDrawable instanceof GlideBitmapDrawable) {
            final Ref ref = new Ref(null);
            final Ref ref2 = new Ref(null);
            imageLoadedListener.onBitmapLoaded(new ImageResult(ColorKey.processBitmapColorKey(((GlideBitmapDrawable) glideDrawable).getBitmap(), imageColorKeyParams, ref2, ref), new Action() { // from class: com.daaw.avee.comp.AlbumArt.AlbumArtCore.4
                @Override // com.daaw.avee.Common.Action
                public void onInvoke() {
                    Ref.this.obj = null;
                    if (ref2.obj != 0) {
                        ((Bitmap) ref2.obj).recycle();
                    }
                    ref2.obj = null;
                }
            }), str, str2, str3);
        } else if (glideDrawable instanceof GifDrawable) {
            GifDrawable gifDrawable = (GifDrawable) glideDrawable;
            final GifDecoder decoder = gifDrawable.getDecoder();
            final Object obj = new Object();
            final Ref ref3 = new Ref(null);
            final Ref ref4 = new Ref(null);
            imageLoadedListener.onBitmapLoaded(new ImageSequenceResult(gifDrawable.getFirstFrame(), new Func<Integer>() { // from class: com.daaw.avee.comp.AlbumArt.AlbumArtCore.5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.daaw.avee.Common.Func.Func
                public Integer onInvoke() {
                    return Integer.valueOf(GifDecoder.this.getFrameCount());
                }
            }, new Action() { // from class: com.daaw.avee.comp.AlbumArt.AlbumArtCore.6
                @Override // com.daaw.avee.Common.Action
                public void onInvoke() {
                    GifDecoder.this.resetFrameIndex();
                }
            }, new Action() { // from class: com.daaw.avee.comp.AlbumArt.AlbumArtCore.7
                @Override // com.daaw.avee.Common.Action
                public void onInvoke() {
                    GifDecoder.this.advance();
                }
            }, new Func<Bitmap>() { // from class: com.daaw.avee.comp.AlbumArt.AlbumArtCore.8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.daaw.avee.Common.Func.Func
                public Bitmap onInvoke() {
                    Bitmap processBitmapColorKey;
                    synchronized (obj) {
                        processBitmapColorKey = ColorKey.processBitmapColorKey(decoder.getNextFrame(), imageColorKeyParams, ref4, ref3);
                    }
                    return processBitmapColorKey;
                }
            }, new Action() { // from class: com.daaw.avee.comp.AlbumArt.AlbumArtCore.9
                @Override // com.daaw.avee.Common.Action
                public void onInvoke() {
                    synchronized (obj) {
                        ref3.obj = null;
                        if (ref4.obj != 0) {
                            ((Bitmap) ref4.obj).recycle();
                        }
                        ref4.obj = null;
                    }
                }
            }), str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap loadAlbumArtFromTags(String str) {
        ID3v2 id3v2Tag;
        byte[] albumImage;
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                Mp3File mp3File = new Mp3File(parse.getPath());
                if (!mp3File.hasId3v2Tag() || (albumImage = (id3v2Tag = mp3File.getId3v2Tag()).getAlbumImage()) == null) {
                    return null;
                }
                id3v2Tag.getAlbumImageMimeType();
                return BitmapFactory.decodeStream(new ByteArrayInputStream(albumImage));
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap loadVideoThumbOrGenerate(String str, boolean z, String str2, int i, int i2, int i3, int i4) {
        Uri parse = Uri.parse(str);
        boolean z2 = (i3 & 1) != 0;
        boolean z3 = (i3 & 4) != 0;
        boolean z4 = (i3 & 2) != 0;
        if (!z3 && parse != null) {
            String path = parse.getPath();
            String extractFilenameExt = UtilsFileSys.extractFilenameExt(path);
            if (!"mp3".equals(extractFilenameExt) && !"wav".equals(extractFilenameExt) && !"ogg".equals(extractFilenameExt)) {
                Bitmap createVideoThumbnail = MyThumbnailUtils.createVideoThumbnail(path, z ? 1 : 3);
                if (createVideoThumbnail != null) {
                    return createVideoThumbnail;
                }
            }
        }
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        float[] fArr = new float[3];
        ColorUtils.colorToHSL(i4, fArr);
        if (fArr[2] > 0.99f) {
            fArr[1] = 1.0f;
        }
        int alpha = Color.alpha(i4);
        float valueInAlphabet = (SimpleTextAlbumArtCreator.valueInAlphabet(str2.charAt(0)) * 360.0f) + (z2 ? 15.0f : 0.0f);
        return SimpleTextAlbumArtCreator.textAsBitmap(i, i2, str2, ColorUtils.setAlphaComponent(ColorUtils.HSLToColor(new float[]{0.0f + valueInAlphabet, 0.2f, 1.0f}), z4 ? 0 : 255), ColorUtils.setAlphaComponent(ColorUtils.HSLToColor(new float[]{valueInAlphabet, 0.9f, fArr[2] * 0.6f}), alpha), ColorUtils.setAlphaComponent(ColorUtils.HSLToColor(new float[]{(((int) valueInAlphabet) + 30) % 360, 0.9f, fArr[2] * 0.4f}), alpha), drawableBg);
    }
}
