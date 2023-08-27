package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.internal.ads.zzmb;
import com.google.android.gms.internal.ads.zzmd;
/* loaded from: classes.dex */
public class MobileAds {

    /* loaded from: classes.dex */
    public static final class Settings {
        private final zzmd zzuw = new zzmd();

        @Deprecated
        public final String getTrackingId() {
            return null;
        }

        @Deprecated
        public final boolean isGoogleAnalyticsEnabled() {
            return false;
        }

        @Deprecated
        public final Settings setGoogleAnalyticsEnabled(boolean z) {
            return this;
        }

        @Deprecated
        public final Settings setTrackingId(String str) {
            return this;
        }

        final zzmd zzbb() {
            return this.zzuw;
        }
    }

    private MobileAds() {
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return zzmb.zziv().getRewardedVideoAdInstance(context);
    }

    public static void initialize(Context context) {
        initialize(context, null, null);
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        zzmb.zziv().zza(context, str, settings == null ? null : settings.zzbb());
    }

    public static void openDebugMenu(Context context, String str) {
        zzmb.zziv().openDebugMenu(context, str);
    }

    public static void setAppMuted(boolean z) {
        zzmb.zziv().setAppMuted(z);
    }

    public static void setAppVolume(float f) {
        zzmb.zziv().setAppVolume(f);
    }
}
