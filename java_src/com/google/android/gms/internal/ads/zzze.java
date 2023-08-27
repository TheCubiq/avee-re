package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@zzadh
/* loaded from: classes2.dex */
public final class zzze extends zzyg {
    private final UnifiedNativeAdMapper zzbvh;

    public zzze(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zzbvh = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final String getAdvertiser() {
        return this.zzbvh.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final String getBody() {
        return this.zzbvh.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final String getCallToAction() {
        return this.zzbvh.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final Bundle getExtras() {
        return this.zzbvh.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final String getHeadline() {
        return this.zzbvh.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final List getImages() {
        List<NativeAd.Image> images = this.zzbvh.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzon(image.getDrawable(), image.getUri(), image.getScale()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final boolean getOverrideClickHandling() {
        return this.zzbvh.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final boolean getOverrideImpressionRecording() {
        return this.zzbvh.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final String getPrice() {
        return this.zzbvh.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final double getStarRating() {
        if (this.zzbvh.getStarRating() != null) {
            return this.zzbvh.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final String getStore() {
        return this.zzbvh.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final zzlo getVideoController() {
        if (this.zzbvh.getVideoController() != null) {
            return this.zzbvh.getVideoController().zzbc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final void recordImpression() {
        this.zzbvh.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final void zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzbvh.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzbvh.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final zzpw zzjz() {
        NativeAd.Image icon = this.zzbvh.getIcon();
        if (icon != null) {
            return new zzon(icon.getDrawable(), icon.getUri(), icon.getScale());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final IObjectWrapper zzke() {
        Object zzbh = this.zzbvh.zzbh();
        if (zzbh == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzbh);
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final zzps zzkf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final void zzl(IObjectWrapper iObjectWrapper) {
        this.zzbvh.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final IObjectWrapper zzmv() {
        View adChoicesContent = this.zzbvh.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final IObjectWrapper zzmw() {
        View zzvy = this.zzbvh.zzvy();
        if (zzvy == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzvy);
    }
}
