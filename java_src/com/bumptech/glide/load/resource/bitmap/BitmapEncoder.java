package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class BitmapEncoder implements ResourceEncoder<Bitmap> {
    private static final int DEFAULT_COMPRESSION_QUALITY = 90;
    private static final String TAG = "BitmapEncoder";
    private Bitmap.CompressFormat compressFormat;
    private int quality;

    @Override // com.bumptech.glide.load.Encoder
    public String getId() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }

    public BitmapEncoder() {
        this(null, 90);
    }

    public BitmapEncoder(Bitmap.CompressFormat compressFormat, int i) {
        this.compressFormat = compressFormat;
        this.quality = i;
    }

    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(Resource<Bitmap> resource, OutputStream outputStream) {
        Bitmap bitmap = resource.get();
        long logTime = LogTime.getLogTime();
        Bitmap.CompressFormat format = getFormat(bitmap);
        bitmap.compress(format, this.quality, outputStream);
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "Compressed with type: " + format + " of size " + Util.getBitmapByteSize(bitmap) + " in " + LogTime.getElapsedMillis(logTime));
            return true;
        }
        return true;
    }

    private Bitmap.CompressFormat getFormat(Bitmap bitmap) {
        Bitmap.CompressFormat compressFormat = this.compressFormat;
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }
}
