package com.daaw;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class io3 extends rn3 {
    public final UnifiedNativeAdMapper p;

    public io3(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.p = unifiedNativeAdMapper;
    }

    @Override // com.daaw.sn3
    public final String b() {
        return this.p.getStore();
    }

    @Override // com.daaw.sn3
    public final void n0(yd0 yd0Var) {
        this.p.untrackView((View) nt0.M(yd0Var));
    }

    @Override // com.daaw.sn3
    public final void n2(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        this.p.trackViews((View) nt0.M(yd0Var), (HashMap) nt0.M(yd0Var2), (HashMap) nt0.M(yd0Var3));
    }

    @Override // com.daaw.sn3
    public final void w2(yd0 yd0Var) {
        this.p.handleClick((View) nt0.M(yd0Var));
    }

    @Override // com.daaw.sn3
    public final boolean zzA() {
        return this.p.getOverrideClickHandling();
    }

    @Override // com.daaw.sn3
    public final boolean zzB() {
        return this.p.getOverrideImpressionRecording();
    }

    @Override // com.daaw.sn3
    public final double zze() {
        if (this.p.getStarRating() != null) {
            return this.p.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.daaw.sn3
    public final float zzf() {
        return this.p.getMediaContentAspectRatio();
    }

    @Override // com.daaw.sn3
    public final float zzg() {
        return this.p.getCurrentTime();
    }

    @Override // com.daaw.sn3
    public final float zzh() {
        return this.p.getDuration();
    }

    @Override // com.daaw.sn3
    public final Bundle zzi() {
        return this.p.getExtras();
    }

    @Override // com.daaw.sn3
    public final zzdq zzj() {
        if (this.p.zzb() != null) {
            return this.p.zzb().zza();
        }
        return null;
    }

    @Override // com.daaw.sn3
    public final nc3 zzk() {
        return null;
    }

    @Override // com.daaw.sn3
    public final vc3 zzl() {
        NativeAd.Image icon = this.p.getIcon();
        if (icon != null) {
            return new dc3(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza());
        }
        return null;
    }

    @Override // com.daaw.sn3
    public final yd0 zzm() {
        View adChoicesContent = this.p.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return nt0.g3(adChoicesContent);
    }

    @Override // com.daaw.sn3
    public final yd0 zzn() {
        View zza = this.p.zza();
        if (zza == null) {
            return null;
        }
        return nt0.g3(zza);
    }

    @Override // com.daaw.sn3
    public final yd0 zzo() {
        Object zzc = this.p.zzc();
        if (zzc == null) {
            return null;
        }
        return nt0.g3(zzc);
    }

    @Override // com.daaw.sn3
    public final String zzp() {
        return this.p.getAdvertiser();
    }

    @Override // com.daaw.sn3
    public final String zzq() {
        return this.p.getBody();
    }

    @Override // com.daaw.sn3
    public final String zzr() {
        return this.p.getCallToAction();
    }

    @Override // com.daaw.sn3
    public final String zzs() {
        return this.p.getHeadline();
    }

    @Override // com.daaw.sn3
    public final String zzt() {
        return this.p.getPrice();
    }

    @Override // com.daaw.sn3
    public final List zzv() {
        List<NativeAd.Image> images = this.p.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new dc3(image.getDrawable(), image.getUri(), image.getScale(), image.zzb(), image.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.daaw.sn3
    public final void zzx() {
        this.p.recordImpression();
    }
}
