package com.daaw;
/* loaded from: classes.dex */
public class pr0 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(java.lang.String r4, int r5) {
        /*
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r1 = 0
            r0.setDataSource(r4)     // Catch: java.lang.Throwable -> L1f java.lang.Throwable -> L24
            r4 = 17
            java.lang.String r4 = r0.extractMetadata(r4)     // Catch: java.lang.Throwable -> L1f java.lang.Throwable -> L24
            if (r4 == 0) goto L18
            r2 = -1
            android.graphics.Bitmap r4 = r0.getFrameAtTime(r2)     // Catch: java.lang.Throwable -> L1f java.lang.Throwable -> L24
            goto L19
        L18:
            r4 = r1
        L19:
            r0.release()     // Catch: java.lang.RuntimeException -> L1d
            goto L28
        L1d:
            goto L28
        L1f:
            r4 = move-exception
            r0.release()     // Catch: java.lang.RuntimeException -> L23
        L23:
            throw r4
        L24:
            r0.release()     // Catch: java.lang.RuntimeException -> L27
        L27:
            r4 = r1
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            r0 = 1
            if (r5 != r0) goto L55
            int r5 = r4.getWidth()
            int r1 = r4.getHeight()
            int r2 = java.lang.Math.max(r5, r1)
            r3 = 512(0x200, float:7.175E-43)
            if (r2 <= r3) goto L5f
            r3 = 1140850688(0x44000000, float:512.0)
            float r2 = (float) r2
            float r3 = r3 / r2
            float r5 = (float) r5
            float r5 = r5 * r3
            int r5 = java.lang.Math.round(r5)
            float r1 = (float) r1
            float r3 = r3 * r1
            int r1 = java.lang.Math.round(r3)
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r4, r5, r1, r0)
            goto L5f
        L55:
            r0 = 3
            if (r5 != r0) goto L5f
            r5 = 2
            r0 = 96
            android.graphics.Bitmap r4 = android.media.ThumbnailUtils.extractThumbnail(r4, r0, r0, r5)
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.pr0.a(java.lang.String, int):android.graphics.Bitmap");
    }
}
