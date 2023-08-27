package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@zzadh
/* loaded from: classes2.dex */
public final class zzyn extends zzyd {
    private final NativeContentAdMapper zzbuz;

    public zzyn(NativeContentAdMapper nativeContentAdMapper) {
        this.zzbuz = nativeContentAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final String getAdvertiser() {
        return this.zzbuz.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final String getBody() {
        return this.zzbuz.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final String getCallToAction() {
        return this.zzbuz.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final Bundle getExtras() {
        return this.zzbuz.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final String getHeadline() {
        return this.zzbuz.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final List getImages() {
        List<NativeAd.Image> images = this.zzbuz.getImages();
        if (images != null) {
            ArrayList arrayList = new ArrayList();
            for (NativeAd.Image image : images) {
                arrayList.add(new zzon(image.getDrawable(), image.getUri(), image.getScale()));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final boolean getOverrideClickHandling() {
        return this.zzbuz.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final boolean getOverrideImpressionRecording() {
        return this.zzbuz.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final zzlo getVideoController() {
        if (this.zzbuz.getVideoController() != null) {
            return this.zzbuz.getVideoController().zzbc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void recordImpression() {
        this.zzbuz.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzbuz.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzbuz.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzk(IObjectWrapper iObjectWrapper) {
        this.zzbuz.trackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final IObjectWrapper zzke() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final zzps zzkf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final zzpw zzkg() {
        NativeAd.Image logo = this.zzbuz.getLogo();
        if (logo != null) {
            return new zzon(logo.getDrawable(), logo.getUri(), logo.getScale());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzl(IObjectWrapper iObjectWrapper) {
        this.zzbuz.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final IObjectWrapper zzmv() {
        View adChoicesContent = this.zzbuz.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final IObjectWrapper zzmw() {
        View zzvy = this.zzbuz.zzvy();
        if (zzvy == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzvy);
    }
}
