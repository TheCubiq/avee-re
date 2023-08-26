package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAdOptions;
import java.util.Map;
/* loaded from: classes.dex */
public interface NativeMediationAdRequest extends MediationAdRequest {
    float getAdVolume();

    NativeAdOptions getNativeAdOptions();

    boolean isAdMuted();

    boolean isAppInstallAdRequested();

    boolean isContentAdRequested();

    boolean isUnifiedNativeAdRequested();

    boolean zzna();

    Map<String, Boolean> zznb();
}
