package com.AOSP;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
/* loaded from: classes.dex */
public class MyThumbnailUtils {
    public static final int TARGET_SIZE_MICRO_THUMBNAIL = 96;
    public static final int TARGET_SIZE_MINI_THUMBNAIL = 320;

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap createVideoThumbnail(String str, int i) {
        Bitmap bitmap;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                bitmap = mediaMetadataRetriever.extractMetadata(17) != null ? mediaMetadataRetriever.getFrameAtTime(-1L) : null;
                try {
                    mediaMetadataRetriever.release();
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                bitmap = null;
                if (bitmap == null) {
                }
            }
        } catch (IllegalArgumentException | RuntimeException unused3) {
            mediaMetadataRetriever.release();
            bitmap = null;
            if (bitmap == null) {
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused4) {
            }
            throw th;
        }
        if (bitmap == null) {
            return null;
        }
        if (i != 1) {
            return i == 3 ? ThumbnailUtils.extractThumbnail(bitmap, 96, 96, 2) : bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int max = Math.max(width, height);
        if (max > 512) {
            float f = 512.0f / max;
            return Bitmap.createScaledBitmap(bitmap, Math.round(width * f), Math.round(f * height), true);
        }
        return bitmap;
    }
}
