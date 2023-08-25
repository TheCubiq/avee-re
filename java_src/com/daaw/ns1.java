package com.daaw;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public class ns1 implements yb<ParcelFileDescriptor> {
    public static final a c = new a();
    public a a;
    public int b;

    /* loaded from: classes.dex */
    public static class a {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    public ns1() {
        this(c, -1);
    }

    public ns1(a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    public Bitmap a(ParcelFileDescriptor parcelFileDescriptor, bc bcVar, int i, int i2, cq cqVar) {
        MediaMetadataRetriever a2 = this.a.a();
        a2.setDataSource(parcelFileDescriptor.getFileDescriptor());
        int i3 = this.b;
        Bitmap frameAtTime = i3 >= 0 ? a2.getFrameAtTime(i3) : a2.getFrameAtTime();
        a2.release();
        parcelFileDescriptor.close();
        return frameAtTime;
    }
}
