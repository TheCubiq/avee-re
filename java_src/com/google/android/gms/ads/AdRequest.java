package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzlw;
import com.google.android.gms.internal.ads.zzlx;
import java.util.Date;
import java.util.Set;
/* loaded from: classes.dex */
public final class AdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    private final zzlw zzun;

    /* loaded from: classes.dex */
    public static final class Builder {
        private final zzlx zzuo;

        public Builder() {
            zzlx zzlxVar = new zzlx();
            this.zzuo = zzlxVar;
            zzlxVar.zzad("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zzuo.zzb(cls, bundle);
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
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.zzuo.zzae("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public final Builder addTestDevice(String str) {
            this.zzuo.zzad(str);
            return this;
        }

        public final AdRequest build() {
            return new AdRequest(this);
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

        public final Builder setRequestAgent(String str) {
            this.zzuo.zzah(str);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.zzuo.zzj(z);
            return this;
        }
    }

    private AdRequest(Builder builder) {
        this.zzun = new zzlw(builder.zzuo);
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

    public final int getGender() {
        return this.zzun.getGender();
    }

    public final Set<String> getKeywords() {
        return this.zzun.getKeywords();
    }

    public final Location getLocation() {
        return this.zzun.getLocation();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzun.getNetworkExtras(cls);
    }

    public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zzun.getNetworkExtrasBundle(cls);
    }

    public final boolean isTestDevice(Context context) {
        return this.zzun.isTestDevice(context);
    }

    public final zzlw zzay() {
        return this.zzun;
    }
}
