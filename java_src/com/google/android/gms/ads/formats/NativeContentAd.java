package com.google.android.gms.ads.formats;

import android.os.Bundle;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
/* loaded from: classes.dex */
public abstract class NativeContentAd extends NativeAd {
    public static final String ASSET_ADVERTISER = "1004";
    public static final String ASSET_ATTRIBUTION_ICON_IMAGE = "1007";
    public static final String ASSET_BODY = "1002";
    public static final String ASSET_CALL_TO_ACTION = "1003";
    public static final String ASSET_HEADLINE = "1001";
    public static final String ASSET_IMAGE = "1005";
    public static final String ASSET_LOGO = "1006";
    public static final String ASSET_MEDIA_VIDEO = "1009";

    /* loaded from: classes.dex */
    public interface OnContentAdLoadedListener {
        void onContentAdLoaded(NativeContentAd nativeContentAd);
    }

    public abstract void destroy();

    public abstract NativeAd.AdChoicesInfo getAdChoicesInfo();

    public abstract CharSequence getAdvertiser();

    public abstract CharSequence getBody();

    public abstract CharSequence getCallToAction();

    public abstract Bundle getExtras();

    public abstract CharSequence getHeadline();

    public abstract List<NativeAd.Image> getImages();

    public abstract NativeAd.Image getLogo();

    public abstract CharSequence getMediationAdapterClassName();

    public abstract VideoController getVideoController();
}
