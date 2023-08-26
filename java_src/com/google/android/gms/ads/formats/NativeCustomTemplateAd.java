package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
/* loaded from: classes.dex */
public interface NativeCustomTemplateAd {
    public static final String ASSET_NAME_VIDEO = "_videoMediaView";

    /* loaded from: classes.dex */
    public interface OnCustomClickListener {
        void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str);
    }

    /* loaded from: classes.dex */
    public interface OnCustomTemplateAdLoadedListener {
        void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd);
    }

    void destroy();

    List<String> getAvailableAssetNames();

    String getCustomTemplateId();

    NativeAd.Image getImage(String str);

    CharSequence getText(String str);

    VideoController getVideoController();

    MediaView getVideoMediaView();

    void performClick(String str);

    void recordImpression();
}
