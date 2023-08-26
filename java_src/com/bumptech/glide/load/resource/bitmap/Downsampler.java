package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.util.ByteArrayPool;
import com.bumptech.glide.util.ExceptionCatchingInputStream;
import com.bumptech.glide.util.MarkEnforcingInputStream;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class Downsampler implements BitmapDecoder<InputStream> {
    private static final int MARK_POSITION = 5242880;
    private static final String TAG = "Downsampler";
    private static final Set<ImageHeaderParser.ImageType> TYPES_THAT_USE_POOL = EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG);
    private static final Queue<BitmapFactory.Options> OPTIONS_QUEUE = Util.createQueue(0);
    public static final Downsampler AT_LEAST = new Downsampler() { // from class: com.bumptech.glide.load.resource.bitmap.Downsampler.1
        @Override // com.bumptech.glide.load.resource.bitmap.BitmapDecoder
        public String getId() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler, com.bumptech.glide.load.resource.bitmap.BitmapDecoder
        public /* bridge */ /* synthetic */ Bitmap decode(InputStream inputStream, BitmapPool bitmapPool, int i, int i2, DecodeFormat decodeFormat) throws Exception {
            return super.decode(inputStream, bitmapPool, i, i2, decodeFormat);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler
        protected int getSampleSize(int i, int i2, int i3, int i4) {
            return Math.min(i2 / i4, i / i3);
        }
    };
    public static final Downsampler AT_MOST = new Downsampler() { // from class: com.bumptech.glide.load.resource.bitmap.Downsampler.2
        @Override // com.bumptech.glide.load.resource.bitmap.BitmapDecoder
        public String getId() {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler, com.bumptech.glide.load.resource.bitmap.BitmapDecoder
        public /* bridge */ /* synthetic */ Bitmap decode(InputStream inputStream, BitmapPool bitmapPool, int i, int i2, DecodeFormat decodeFormat) throws Exception {
            return super.decode(inputStream, bitmapPool, i, i2, decodeFormat);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler
        protected int getSampleSize(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            return max << (max >= ceil ? 0 : 1);
        }
    };
    public static final Downsampler NONE = new Downsampler() { // from class: com.bumptech.glide.load.resource.bitmap.Downsampler.3
        @Override // com.bumptech.glide.load.resource.bitmap.BitmapDecoder
        public String getId() {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler
        protected int getSampleSize(int i, int i2, int i3, int i4) {
            return 0;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler, com.bumptech.glide.load.resource.bitmap.BitmapDecoder
        public /* bridge */ /* synthetic */ Bitmap decode(InputStream inputStream, BitmapPool bitmapPool, int i, int i2, DecodeFormat decodeFormat) throws Exception {
            return super.decode(inputStream, bitmapPool, i, i2, decodeFormat);
        }
    };

    protected abstract int getSampleSize(int i, int i2, int i3, int i4);

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapDecoder
    public Bitmap decode(InputStream inputStream, BitmapPool bitmapPool, int i, int i2, DecodeFormat decodeFormat) {
        int i3;
        ByteArrayPool byteArrayPool = ByteArrayPool.get();
        byte[] bytes = byteArrayPool.getBytes();
        byte[] bytes2 = byteArrayPool.getBytes();
        BitmapFactory.Options defaultOptions = getDefaultOptions();
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, bytes2);
        ExceptionCatchingInputStream obtain = ExceptionCatchingInputStream.obtain(recyclableBufferedInputStream);
        MarkEnforcingInputStream markEnforcingInputStream = new MarkEnforcingInputStream(obtain);
        try {
            obtain.mark(MARK_POSITION);
            try {
                int orientation = new ImageHeaderParser(obtain).getOrientation();
                try {
                    obtain.reset();
                } catch (IOException e) {
                    if (Log.isLoggable(TAG, 5)) {
                        Log.w(TAG, "Cannot reset the input stream", e);
                    }
                }
                i3 = orientation;
            } catch (IOException e2) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "Cannot determine the image orientation from header", e2);
                }
                try {
                    obtain.reset();
                } catch (IOException e3) {
                    if (Log.isLoggable(TAG, 5)) {
                        Log.w(TAG, "Cannot reset the input stream", e3);
                    }
                }
                i3 = 0;
            }
            defaultOptions.inTempStorage = bytes;
            int[] dimensions = getDimensions(markEnforcingInputStream, recyclableBufferedInputStream, defaultOptions);
            int i4 = dimensions[0];
            int i5 = dimensions[1];
            Bitmap downsampleWithSize = downsampleWithSize(markEnforcingInputStream, recyclableBufferedInputStream, defaultOptions, bitmapPool, i4, i5, getRoundedSampleSize(TransformationUtils.getExifOrientationDegrees(i3), i4, i5, i, i2), decodeFormat);
            IOException exception = obtain.getException();
            if (exception == null) {
                Bitmap bitmap = null;
                if (downsampleWithSize != null) {
                    bitmap = TransformationUtils.rotateImageExif(downsampleWithSize, bitmapPool, i3);
                    if (!downsampleWithSize.equals(bitmap) && !bitmapPool.put(downsampleWithSize)) {
                        downsampleWithSize.recycle();
                    }
                }
                return bitmap;
            }
            throw new RuntimeException(exception);
        } finally {
            byteArrayPool.releaseBytes(bytes);
            byteArrayPool.releaseBytes(bytes2);
            obtain.release();
            releaseOptions(defaultOptions);
        }
    }

    private int getRoundedSampleSize(int i, int i2, int i3, int i4, int i5) {
        int sampleSize;
        if (i5 == Integer.MIN_VALUE) {
            i5 = i3;
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = i2;
        }
        if (i == 90 || i == 270) {
            sampleSize = getSampleSize(i3, i2, i4, i5);
        } else {
            sampleSize = getSampleSize(i2, i3, i4, i5);
        }
        return Math.max(1, sampleSize == 0 ? 0 : Integer.highestOneBit(sampleSize));
    }

    private Bitmap downsampleWithSize(MarkEnforcingInputStream markEnforcingInputStream, RecyclableBufferedInputStream recyclableBufferedInputStream, BitmapFactory.Options options, BitmapPool bitmapPool, int i, int i2, int i3, DecodeFormat decodeFormat) {
        Bitmap.Config config = getConfig(markEnforcingInputStream, decodeFormat);
        options.inSampleSize = i3;
        options.inPreferredConfig = config;
        if ((options.inSampleSize == 1 || 19 <= Build.VERSION.SDK_INT) && shouldUsePool(markEnforcingInputStream)) {
            double d = i;
            double d2 = i3;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = i2;
            Double.isNaN(d3);
            Double.isNaN(d2);
            setInBitmap(options, bitmapPool.getDirty((int) Math.ceil(d / d2), (int) Math.ceil(d3 / d2), config));
        }
        return decodeStream(markEnforcingInputStream, recyclableBufferedInputStream, options);
    }

    private static boolean shouldUsePool(InputStream inputStream) {
        if (19 <= Build.VERSION.SDK_INT) {
            return true;
        }
        inputStream.mark(1024);
        try {
            try {
                boolean contains = TYPES_THAT_USE_POOL.contains(new ImageHeaderParser(inputStream).getType());
                try {
                    inputStream.reset();
                } catch (IOException e) {
                    if (Log.isLoggable(TAG, 5)) {
                        Log.w(TAG, "Cannot reset the input stream", e);
                    }
                }
                return contains;
            } catch (Throwable th) {
                try {
                    inputStream.reset();
                } catch (IOException e2) {
                    if (Log.isLoggable(TAG, 5)) {
                        Log.w(TAG, "Cannot reset the input stream", e2);
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "Cannot determine the image type from header", e3);
            }
            try {
                inputStream.reset();
                return false;
            } catch (IOException e4) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "Cannot reset the input stream", e4);
                    return false;
                }
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (android.util.Log.isLoggable(com.bumptech.glide.load.resource.bitmap.Downsampler.TAG, 5) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        android.util.Log.w(com.bumptech.glide.load.resource.bitmap.Downsampler.TAG, "Cannot reset the input stream", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        if (android.util.Log.isLoggable(com.bumptech.glide.load.resource.bitmap.Downsampler.TAG, 5) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap.Config getConfig(InputStream inputStream, DecodeFormat decodeFormat) {
        if (decodeFormat == DecodeFormat.ALWAYS_ARGB_8888 || decodeFormat == DecodeFormat.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
            return Bitmap.Config.ARGB_8888;
        }
        boolean z = false;
        inputStream.mark(1024);
        try {
            try {
                z = new ImageHeaderParser(inputStream).hasAlpha();
                try {
                    inputStream.reset();
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                try {
                    inputStream.reset();
                } catch (IOException e2) {
                    if (Log.isLoggable(TAG, 5)) {
                        Log.w(TAG, "Cannot reset the input stream", e2);
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "Cannot determine whether the image has alpha or not from header for format " + decodeFormat, e3);
            }
            try {
                inputStream.reset();
            } catch (IOException e4) {
                e = e4;
            }
        }
        return z ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
    }

    public int[] getDimensions(MarkEnforcingInputStream markEnforcingInputStream, RecyclableBufferedInputStream recyclableBufferedInputStream, BitmapFactory.Options options) {
        options.inJustDecodeBounds = true;
        decodeStream(markEnforcingInputStream, recyclableBufferedInputStream, options);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static Bitmap decodeStream(MarkEnforcingInputStream markEnforcingInputStream, RecyclableBufferedInputStream recyclableBufferedInputStream, BitmapFactory.Options options) {
        if (options.inJustDecodeBounds) {
            markEnforcingInputStream.mark(MARK_POSITION);
        } else {
            recyclableBufferedInputStream.fixMarkLimit();
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(markEnforcingInputStream, null, options);
        try {
            if (options.inJustDecodeBounds) {
                markEnforcingInputStream.reset();
            }
        } catch (IOException e) {
            if (Log.isLoggable(TAG, 6)) {
                Log.e(TAG, "Exception loading inDecodeBounds=" + options.inJustDecodeBounds + " sample=" + options.inSampleSize, e);
            }
        }
        return decodeStream;
    }

    private static void setInBitmap(BitmapFactory.Options options, Bitmap bitmap) {
        if (11 <= Build.VERSION.SDK_INT) {
            options.inBitmap = bitmap;
        }
    }

    private static synchronized BitmapFactory.Options getDefaultOptions() {
        BitmapFactory.Options poll;
        synchronized (Downsampler.class) {
            synchronized (OPTIONS_QUEUE) {
                poll = OPTIONS_QUEUE.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                resetOptions(poll);
            }
        }
        return poll;
    }

    private static void releaseOptions(BitmapFactory.Options options) {
        resetOptions(options);
        synchronized (OPTIONS_QUEUE) {
            OPTIONS_QUEUE.offer(options);
        }
    }

    private static void resetOptions(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        if (11 <= Build.VERSION.SDK_INT) {
            options.inBitmap = null;
            options.inMutable = true;
        }
    }
}
