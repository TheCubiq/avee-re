package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.daaw.d04;
import com.daaw.k04;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    public final int a;
    public final int b;
    public final String c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;
    public int h;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdSize(int r4, int r5) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L6
            java.lang.String r0 = "FULL"
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r4)
        La:
            r1 = -2
            if (r5 != r1) goto L10
            java.lang.String r1 = "AUTO"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r5)
        L14:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "_as"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.AdSize.<init>(int, int):void");
    }

    public AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.a = i;
            this.b = i2;
            this.c = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize h = d04.h(context, i, 50, 0);
        h.d = true;
        return h;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
        int f = d04.f(context, 0);
        if (f == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.f = f;
        adSize.e = true;
        return adSize;
    }

    public static AdSize getCurrentOrientationInterscrollerAdSize(Context context, int i) {
        return j(i, d04.f(context, 0));
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        AdSize adSize = new AdSize(i, 0);
        adSize.f = i2;
        adSize.e = true;
        if (i2 < 32) {
            k04.zzj("The maximum height set for the inline adaptive ad size was " + i2 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize h = d04.h(context, i, 50, 2);
        h.d = true;
        return h;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i) {
        int f = d04.f(context, 2);
        AdSize adSize = new AdSize(i, 0);
        if (f == -1) {
            return INVALID;
        }
        adSize.f = f;
        adSize.e = true;
        return adSize;
    }

    public static AdSize getLandscapeInterscrollerAdSize(Context context, int i) {
        return j(i, d04.f(context, 2));
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize h = d04.h(context, i, 50, 1);
        h.d = true;
        return h;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i) {
        int f = d04.f(context, 1);
        AdSize adSize = new AdSize(i, 0);
        if (f == -1) {
            return INVALID;
        }
        adSize.f = f;
        adSize.e = true;
        return adSize;
    }

    public static AdSize getPortraitInterscrollerAdSize(Context context, int i) {
        return j(i, d04.f(context, 1));
    }

    public static AdSize j(int i, int i2) {
        if (i2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.h = i2;
        adSize.g = true;
        return adSize;
    }

    public final int a() {
        return this.h;
    }

    public final int b() {
        return this.f;
    }

    public final void c(int i) {
        this.f = i;
    }

    public final void d(int i) {
        this.h = i;
    }

    public final void e(boolean z) {
        this.e = true;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdSize) {
            AdSize adSize = (AdSize) obj;
            return this.a == adSize.a && this.b == adSize.b && this.c.equals(adSize.c);
        }
        return false;
    }

    public final void f(boolean z) {
        this.g = true;
    }

    public final boolean g() {
        return this.d;
    }

    public int getHeight() {
        return this.b;
    }

    public int getHeightInPixels(Context context) {
        int i = this.b;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i != -2) {
            zzay.zzb();
            return d04.D(context, this.b);
        }
        return zzq.zza(context.getResources().getDisplayMetrics());
    }

    public int getWidth() {
        return this.a;
    }

    public int getWidthInPixels(Context context) {
        int i = this.a;
        if (i != -3) {
            if (i != -1) {
                zzay.zzb();
                return d04.D(context, this.a);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Parcelable.Creator<zzq> creator = zzq.CREATOR;
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    public final boolean h() {
        return this.e;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public final boolean i() {
        return this.g;
    }

    public boolean isAutoHeight() {
        return this.b == -2;
    }

    public boolean isFluid() {
        return this.a == -3 && this.b == -4;
    }

    public boolean isFullWidth() {
        return this.a == -1;
    }

    public String toString() {
        return this.c;
    }
}
