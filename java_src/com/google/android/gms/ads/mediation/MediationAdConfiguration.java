package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    /* renamed from: a */
    public final String f36405a;

    /* renamed from: b */
    public final Bundle f36406b;

    /* renamed from: c */
    public final Bundle f36407c;

    /* renamed from: d */
    public final Context f36408d;

    /* renamed from: e */
    public final boolean f36409e;

    /* renamed from: f */
    public final Location f36410f;

    /* renamed from: g */
    public final int f36411g;

    /* renamed from: h */
    public final int f36412h;

    /* renamed from: i */
    public final String f36413i;

    /* renamed from: j */
    public final String f36414j;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, Location location, int i, int i2, String str2, String str3) {
        this.f36405a = str;
        this.f36406b = bundle;
        this.f36407c = bundle2;
        this.f36408d = context;
        this.f36409e = z;
        this.f36410f = location;
        this.f36411g = i;
        this.f36412h = i2;
        this.f36413i = str2;
        this.f36414j = str3;
    }

    public String getBidResponse() {
        return this.f36405a;
    }

    public Context getContext() {
        return this.f36408d;
    }

    public String getMaxAdContentRating() {
        return this.f36413i;
    }

    public Bundle getMediationExtras() {
        return this.f36407c;
    }

    public Bundle getServerParameters() {
        return this.f36406b;
    }

    public String getWatermark() {
        return this.f36414j;
    }

    public boolean isTestRequest() {
        return this.f36409e;
    }

    public int taggedForChildDirectedTreatment() {
        return this.f36411g;
    }

    public int taggedForUnderAgeTreatment() {
        return this.f36412h;
    }
}
