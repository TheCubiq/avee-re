package com.google.android.gms.ads;

import com.daaw.k04;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class RequestConfiguration {
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;

    /* renamed from: a */
    public final int f36026a;

    /* renamed from: b */
    public final int f36027b;
    @Nullable

    /* renamed from: c */
    public final String f36028c;

    /* renamed from: d */
    public final List f36029d;
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, MAX_AD_CONTENT_RATING_T, MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a */
        public int f36030a = -1;

        /* renamed from: b */
        public int f36031b = -1;
        @Nullable

        /* renamed from: c */
        public String f36032c = null;

        /* renamed from: d */
        public final List f36033d = new ArrayList();

        public RequestConfiguration build() {
            return new RequestConfiguration(this.f36030a, this.f36031b, this.f36032c, this.f36033d, null);
        }

        public Builder setMaxAdContentRating(@Nullable String str) {
            if (str == null || "".equals(str)) {
                str = null;
            } else if (!RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_T.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                k04.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
                return this;
            }
            this.f36032c = str;
            return this;
        }

        public Builder setTagForChildDirectedTreatment(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.f36030a = i;
            } else {
                k04.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i);
            }
            return this;
        }

        public Builder setTagForUnderAgeOfConsent(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.f36031b = i;
            } else {
                k04.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i);
            }
            return this;
        }

        public Builder setTestDeviceIds(@Nullable List<String> list) {
            this.f36033d.clear();
            if (list != null) {
                this.f36033d.addAll(list);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MaxAdContentRating {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(int i, int i2, String str, List list, zzh zzhVar) {
        this.f36026a = i;
        this.f36027b = i2;
        this.f36028c = str;
        this.f36029d = list;
    }

    public String getMaxAdContentRating() {
        String str = this.f36028c;
        return str == null ? "" : str;
    }

    public int getTagForChildDirectedTreatment() {
        return this.f36026a;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.f36027b;
    }

    public List<String> getTestDeviceIds() {
        return new ArrayList(this.f36029d);
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setTagForChildDirectedTreatment(this.f36026a);
        builder.setTagForUnderAgeOfConsent(this.f36027b);
        builder.setMaxAdContentRating(this.f36028c);
        builder.setTestDeviceIds(this.f36029d);
        return builder;
    }
}
