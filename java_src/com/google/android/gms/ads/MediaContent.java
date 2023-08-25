package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;
import com.daaw.sd3;
/* loaded from: classes.dex */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    Drawable getMainImage();

    VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(Drawable drawable);

    sd3 zza();
}
