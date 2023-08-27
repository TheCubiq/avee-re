package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzlw;
import com.google.android.gms.internal.ads.zzlx;
import java.util.Date;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class PublisherAdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    private final zzlw zzun;

    /* loaded from: classes.dex */
    public static final class Builder {
        private final zzlx zzuo = new zzlx();

        public final Builder addCategoryExclusion(String str) {
            this.zzuo.zzai(str);
            return this;
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zzuo.zzb(cls, bundle);
            return this;
        }

        public final Builder addCustomTargeting(String str, String str2) {
            this.zzuo.zzc(str, str2);
            return this;
        }

        public final Builder addCustomTargeting(String str, List<String> list) {
            if (list != null) {
                this.zzuo.zzc(str, TextUtils.join(",", list));
            }
            return this;
        }

        public final Builder addKeyword(String str) {
            this.zzuo.zzac(str);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zzuo.zza(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.zzuo.zza(cls, bundle);
            return this;
        }

        public final Builder addTestDevice(String str) {
            this.zzuo.zzad(str);
            return this;
        }

        public final PublisherAdRequest build() {
            return new PublisherAdRequest(this);
        }

        public final Builder setBirthday(Date date) {
            this.zzuo.zza(date);
            return this;
        }

        public final Builder setContentUrl(String str) {
            Preconditions.checkNotNull(str, "Content URL must be non-null.");
            Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
            Preconditions.checkArgument(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.zzuo.zzaf(str);
            return this;
        }

        public final Builder setGender(int i) {
            this.zzuo.zzt(i);
            return this;
        }

        public final Builder setIsDesignedForFamilies(boolean z) {
            this.zzuo.zzk(z);
            return this;
        }

        public final Builder setLocation(Location location) {
            this.zzuo.zzb(location);
            return this;
        }

        @Deprecated
        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzuo.setManualImpressionsEnabled(z);
            return this;
        }

        public final Builder setPublisherProvidedId(String str) {
            this.zzuo.zzag(str);
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.zzuo.zzah(str);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.zzuo.zzj(z);
            return this;
        }
    }

    private PublisherAdRequest(Builder builder) {
        this.zzun = new zzlw(builder.zzuo);
    }

    public static void updateCorrelator() {
    }

    public final Date getBirthday() {
        return this.zzun.getBirthday();
    }

    public final String getContentUrl() {
        return this.zzun.getContentUrl();
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zzun.getCustomEventExtrasBundle(cls);
    }

    public final Bundle getCustomTargeting() {
        return this.zzun.getCustomTargeting();
    }

    public final int getGender() {
        return this.zzun.getGender();
    }

    public final Set<String> getKeywords() {
        return this.zzun.getKeywords();
    }

    public final Location getLocation() {
        return this.zzun.getLocation();
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzun.getManualImpressionsEnabled();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzun.getNetworkExtras(cls);
    }

    public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zzun.getNetworkExtrasBundle(cls);
    }

    public final String getPublisherProvidedId() {
        return this.zzun.getPublisherProvidedId();
    }

    public final boolean isTestDevice(Context context) {
        return this.zzun.isTestDevice(context);
    }

    public final zzlw zzay() {
        return this.zzun;
    }
}
