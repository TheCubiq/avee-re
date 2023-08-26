package com.google.android.gms.ads;

import android.content.Context;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.AOSP.MyThumbnailUtils;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzkb;
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzuq;
    private final int zzur;
    private final String zzus;
    public static final AdSize BANNER = new AdSize(MyThumbnailUtils.TARGET_SIZE_MINI_THUMBNAIL, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(MyThumbnailUtils.TARGET_SIZE_MINI_THUMBNAIL, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize zzup = new AdSize(50, 50, "50x50_mb");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdSize(int i, int i2) {
        this(i, i2, r3.toString());
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        String valueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("x");
        sb.append(valueOf2);
        sb.append("_as");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.zzuq = i;
            this.zzur = i2;
            this.zzus = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdSize) {
            AdSize adSize = (AdSize) obj;
            return this.zzuq == adSize.zzuq && this.zzur == adSize.zzur && this.zzus.equals(adSize.zzus);
        }
        return false;
    }

    public final int getHeight() {
        return this.zzur;
    }

    public final int getHeightInPixels(Context context) {
        int i = this.zzur;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i != -2) {
            zzkb.zzif();
            return zzamu.zza(context, this.zzur);
        }
        return zzjn.zzc(context.getResources().getDisplayMetrics());
    }

    public final int getWidth() {
        return this.zzuq;
    }

    public final int getWidthInPixels(Context context) {
        int i = this.zzuq;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i != -1) {
            zzkb.zzif();
            return zzamu.zza(context, this.zzuq);
        }
        return zzjn.zzb(context.getResources().getDisplayMetrics());
    }

    public final int hashCode() {
        return this.zzus.hashCode();
    }

    public final boolean isAutoHeight() {
        return this.zzur == -2;
    }

    public final boolean isFluid() {
        return this.zzuq == -3 && this.zzur == -4;
    }

    public final boolean isFullWidth() {
        return this.zzuq == -1;
    }

    public final String toString() {
        return this.zzus;
    }
}
