package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@zzadh
/* loaded from: classes2.dex */
public final class zzym extends zzya {
    private final NativeAppInstallAdMapper zzbuy;

    public zzym(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.zzbuy = nativeAppInstallAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final String getBody() {
        return this.zzbuy.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final String getCallToAction() {
        return this.zzbuy.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final Bundle getExtras() {
        return this.zzbuy.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final String getHeadline() {
        return this.zzbuy.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final List getImages() {
        List<NativeAd.Image> images = this.zzbuy.getImages();
        if (images != null) {
            ArrayList arrayList = new ArrayList();
            for (NativeAd.Image image : images) {
                arrayList.add(new zzon(image.getDrawable(), image.getUri(), image.getScale()));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final boolean getOverrideClickHandling() {
        return this.zzbuy.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final boolean getOverrideImpressionRecording() {
        return this.zzbuy.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final String getPrice() {
        return this.zzbuy.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final double getStarRating() {
        return this.zzbuy.getStarRating();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final String getStore() {
        return this.zzbuy.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final zzlo getVideoController() {
        if (this.zzbuy.getVideoController() != null) {
            return this.zzbuy.getVideoController().zzbc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void recordImpression() {
        this.zzbuy.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzbuy.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzbuy.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final zzpw zzjz() {
        NativeAd.Image icon = this.zzbuy.getIcon();
        if (icon != null) {
            return new zzon(icon.getDrawable(), icon.getUri(), icon.getScale());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzk(IObjectWrapper iObjectWrapper) {
        this.zzbuy.trackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final IObjectWrapper zzke() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final zzps zzkf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void zzl(IObjectWrapper iObjectWrapper) {
        this.zzbuy.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final IObjectWrapper zzmv() {
        View adChoicesContent = this.zzbuy.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final IObjectWrapper zzmw() {
        View zzvy = this.zzbuy.zzvy();
        if (zzvy == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzvy);
    }
}
