package com.google.ads;

import android.content.Context;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.AOSP.MyThumbnailUtils;
@Deprecated
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    public static final int LANDSCAPE_AD_HEIGHT = 32;
    public static final int LARGE_AD_HEIGHT = 90;
    public static final int PORTRAIT_AD_HEIGHT = 50;
    private final com.google.android.gms.ads.AdSize zzcn;
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "mb");
    public static final AdSize BANNER = new AdSize(MyThumbnailUtils.TARGET_SIZE_MINI_THUMBNAIL, 50, "mb");
    public static final AdSize IAB_MRECT = new AdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "as");
    public static final AdSize IAB_BANNER = new AdSize(468, 60, "as");
    public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90, "as");
    public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, 600, "as");

    public AdSize(int i, int i2) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }

    private AdSize(int i, int i2, String str) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }

    public AdSize(com.google.android.gms.ads.AdSize adSize) {
        this.zzcn = adSize;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AdSize) {
            return this.zzcn.equals(((AdSize) obj).zzcn);
        }
        return false;
    }

    public final AdSize findBestSize(AdSize... adSizeArr) {
        int width;
        int height;
        AdSize adSize = null;
        if (adSizeArr == null) {
            return null;
        }
        float f = 0.0f;
        int width2 = getWidth();
        int height2 = getHeight();
        for (AdSize adSize2 : adSizeArr) {
            if (isSizeAppropriate(adSize2.getWidth(), adSize2.getHeight())) {
                float f2 = (width * height) / (width2 * height2);
                if (f2 > 1.0f) {
                    f2 = 1.0f / f2;
                }
                if (f2 > f) {
                    adSize = adSize2;
                    f = f2;
                }
            }
        }
        return adSize;
    }

    public final int getHeight() {
        return this.zzcn.getHeight();
    }

    public final int getHeightInPixels(Context context) {
        return this.zzcn.getHeightInPixels(context);
    }

    public final int getWidth() {
        return this.zzcn.getWidth();
    }

    public final int getWidthInPixels(Context context) {
        return this.zzcn.getWidthInPixels(context);
    }

    public final int hashCode() {
        return this.zzcn.hashCode();
    }

    public final boolean isAutoHeight() {
        return this.zzcn.isAutoHeight();
    }

    public final boolean isCustomAdSize() {
        return false;
    }

    public final boolean isFullWidth() {
        return this.zzcn.isFullWidth();
    }

    public final boolean isSizeAppropriate(int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        float f = i;
        float f2 = width;
        if (f > f2 * 1.25f || f < f2 * 0.8f) {
            return false;
        }
        float f3 = i2;
        float f4 = height;
        return f3 <= 1.25f * f4 && f3 >= f4 * 0.8f;
    }

    public final String toString() {
        return this.zzcn.toString();
    }
}
