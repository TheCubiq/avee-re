package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
/* loaded from: classes.dex */
public abstract class NativeAd {
    public static final String ASSET_ADCHOICES_CONTAINER_VIEW = "1098";

    /* loaded from: classes.dex */
    public static abstract class AdChoicesInfo {
        public abstract List<Image> getImages();

        public abstract CharSequence getText();
    }

    /* loaded from: classes.dex */
    public static abstract class Image {
        public abstract Drawable getDrawable();

        public abstract double getScale();

        public abstract Uri getUri();
    }

    public abstract void performClick(Bundle bundle);

    public abstract boolean recordImpression(Bundle bundle);

    public abstract void reportTouchEvent(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzbe();
}
