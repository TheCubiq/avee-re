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

    /* renamed from: a */
    public final int f36010a;

    /* renamed from: b */
    public final int f36011b;

    /* renamed from: c */
    public final String f36012c;

    /* renamed from: d */
    public boolean f36013d;

    /* renamed from: e */
    public boolean f36014e;

    /* renamed from: f */
    public int f36015f;

    /* renamed from: g */
    public boolean f36016g;

    /* renamed from: h */
    public int f36017h;
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
    */
    public AdSize(int i, int i2) {
        this(i, i2, r0 + "x" + r1 + "_as");
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        String valueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
    }

    public AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f36010a = i;
            this.f36011b = i2;
            this.f36012c = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize m24824h = d04.m24824h(context, i, 50, 0);
        m24824h.f36013d = true;
        return m24824h;
    }

    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
        int m24826f = d04.m24826f(context, 0);
        if (m24826f == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.f36015f = m24826f;
        adSize.f36014e = true;
        return adSize;
    }

    public static AdSize getCurrentOrientationInterscrollerAdSize(Context context, int i) {
        return m1456j(i, d04.m24826f(context, 0));
    }

    public static AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        AdSize adSize = new AdSize(i, 0);
        adSize.f36015f = i2;
        adSize.f36014e = true;
        if (i2 < 32) {
            k04.zzj("The maximum height set for the inline adaptive ad size was " + i2 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize m24824h = d04.m24824h(context, i, 50, 2);
        m24824h.f36013d = true;
        return m24824h;
    }

    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i) {
        int m24826f = d04.m24826f(context, 2);
        AdSize adSize = new AdSize(i, 0);
        if (m24826f == -1) {
            return INVALID;
        }
        adSize.f36015f = m24826f;
        adSize.f36014e = true;
        return adSize;
    }

    public static AdSize getLandscapeInterscrollerAdSize(Context context, int i) {
        return m1456j(i, d04.m24826f(context, 2));
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i) {
        AdSize m24824h = d04.m24824h(context, i, 50, 1);
        m24824h.f36013d = true;
        return m24824h;
    }

    public static AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i) {
        int m24826f = d04.m24826f(context, 1);
        AdSize adSize = new AdSize(i, 0);
        if (m24826f == -1) {
            return INVALID;
        }
        adSize.f36015f = m24826f;
        adSize.f36014e = true;
        return adSize;
    }

    public static AdSize getPortraitInterscrollerAdSize(Context context, int i) {
        return m1456j(i, d04.m24826f(context, 1));
    }

    /* renamed from: j */
    public static AdSize m1456j(int i, int i2) {
        if (i2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.f36017h = i2;
        adSize.f36016g = true;
        return adSize;
    }

    /* renamed from: a */
    public final int m1465a() {
        return this.f36017h;
    }

    /* renamed from: b */
    public final int m1464b() {
        return this.f36015f;
    }

    /* renamed from: c */
    public final void m1463c(int i) {
        this.f36015f = i;
    }

    /* renamed from: d */
    public final void m1462d(int i) {
        this.f36017h = i;
    }

    /* renamed from: e */
    public final void m1461e(boolean z) {
        this.f36014e = true;
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
            return this.f36010a == adSize.f36010a && this.f36011b == adSize.f36011b && this.f36012c.equals(adSize.f36012c);
        }
        return false;
    }

    /* renamed from: f */
    public final void m1460f(boolean z) {
        this.f36016g = true;
    }

    /* renamed from: g */
    public final boolean m1459g() {
        return this.f36013d;
    }

    public int getHeight() {
        return this.f36011b;
    }

    public int getHeightInPixels(Context context) {
        int i = this.f36011b;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i != -2) {
            zzay.zzb();
            return d04.m24833D(context, this.f36011b);
        }
        return zzq.zza(context.getResources().getDisplayMetrics());
    }

    public int getWidth() {
        return this.f36010a;
    }

    public int getWidthInPixels(Context context) {
        int i = this.f36010a;
        if (i != -3) {
            if (i != -1) {
                zzay.zzb();
                return d04.m24833D(context, this.f36010a);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Parcelable.Creator<zzq> creator = zzq.CREATOR;
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    /* renamed from: h */
    public final boolean m1458h() {
        return this.f36014e;
    }

    public int hashCode() {
        return this.f36012c.hashCode();
    }

    /* renamed from: i */
    public final boolean m1457i() {
        return this.f36016g;
    }

    public boolean isAutoHeight() {
        return this.f36011b == -2;
    }

    public boolean isFluid() {
        return this.f36010a == -3 && this.f36011b == -4;
    }

    public boolean isFullWidth() {
        return this.f36010a == -1;
    }

    public String toString() {
        return this.f36012c;
    }
}
