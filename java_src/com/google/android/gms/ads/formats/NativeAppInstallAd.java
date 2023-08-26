package com.google.android.gms.ads.formats;

import android.os.Bundle;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
/* loaded from: classes.dex */
public abstract class NativeAppInstallAd extends NativeAd {
    public static final String ASSET_ATTRIBUTION_ICON_IMAGE = "2009";
    public static final String ASSET_BODY = "2004";
    public static final String ASSET_CALL_TO_ACTION = "2002";
    public static final String ASSET_HEADLINE = "2001";
    public static final String ASSET_ICON = "2003";
    public static final String ASSET_IMAGE = "2007";
    public static final String ASSET_MEDIA_VIDEO = "2011";
    public static final String ASSET_PRICE = "2006";
    public static final String ASSET_STAR_RATING = "2008";
    public static final String ASSET_STORE = "2005";

    /* loaded from: classes.dex */
    public interface OnAppInstallAdLoadedListener {
        void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd);
    }

    public abstract void destroy();

    public abstract NativeAd.AdChoicesInfo getAdChoicesInfo();

    public abstract CharSequence getBody();

    public abstract CharSequence getCallToAction();

    public abstract Bundle getExtras();

    public abstract CharSequence getHeadline();

    public abstract NativeAd.Image getIcon();

    public abstract List<NativeAd.Image> getImages();

    public abstract CharSequence getMediationAdapterClassName();

    public abstract CharSequence getPrice();

    public abstract Double getStarRating();

    public abstract CharSequence getStore();

    public abstract VideoController getVideoController();
}
