package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.zzadh;
import java.util.Map;
@zzadh
/* loaded from: classes.dex */
public class NativeAdMapper {
    protected View mAdChoicesContent;
    protected Bundle mExtras = new Bundle();
    protected boolean mOverrideClickHandling;
    protected boolean mOverrideImpressionRecording;
    private VideoController zzasv;
    private View zzdfm;
    private boolean zzdfn;

    public View getAdChoicesContent() {
        return this.mAdChoicesContent;
    }

    public final Bundle getExtras() {
        return this.mExtras;
    }

    public final boolean getOverrideClickHandling() {
        return this.mOverrideClickHandling;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.mOverrideImpressionRecording;
    }

    public final VideoController getVideoController() {
        return this.zzasv;
    }

    public void handleClick(View view) {
    }

    public boolean hasVideoContent() {
        return this.zzdfn;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.mAdChoicesContent = view;
    }

    public final void setExtras(Bundle bundle) {
        this.mExtras = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.zzdfn = z;
    }

    public void setMediaView(View view) {
        this.zzdfm = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.mOverrideClickHandling = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.mOverrideImpressionRecording = z;
    }

    @Deprecated
    public void trackView(View view) {
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final void zza(VideoController videoController) {
        this.zzasv = videoController;
    }

    public final View zzvy() {
        return this.zzdfm;
    }
}
