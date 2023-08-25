package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzblz;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {

    /* renamed from: k */
    public final zzblz f36418k;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, Location location, int i, int i2, String str2, String str3, zzblz zzblzVar) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.f36418k = zzblzVar;
    }

    public NativeAdOptions getNativeAdOptions() {
        return zzblz.m1105h(this.f36418k);
    }
}
