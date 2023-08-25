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

    /* renamed from: p */
    public final UnifiedNativeAdMapper f13883p;

    public io3(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f13883p = unifiedNativeAdMapper;
    }

    @Override // com.daaw.sn3
    /* renamed from: b */
    public final String mo10146b() {
        return this.f13883p.getStore();
    }

    @Override // com.daaw.sn3
    /* renamed from: n0 */
    public final void mo10145n0(yd0 yd0Var) {
        this.f13883p.untrackView((View) nt0.m14831M(yd0Var));
    }

    @Override // com.daaw.sn3
    /* renamed from: n2 */
    public final void mo10144n2(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        this.f13883p.trackViews((View) nt0.m14831M(yd0Var), (HashMap) nt0.m14831M(yd0Var2), (HashMap) nt0.m14831M(yd0Var3));
    }

    @Override // com.daaw.sn3
    /* renamed from: w2 */
    public final void mo10143w2(yd0 yd0Var) {
        this.f13883p.handleClick((View) nt0.m14831M(yd0Var));
    }

    @Override // com.daaw.sn3
    public final boolean zzA() {
        return this.f13883p.getOverrideClickHandling();
    }

    @Override // com.daaw.sn3
    public final boolean zzB() {
        return this.f13883p.getOverrideImpressionRecording();
    }

    @Override // com.daaw.sn3
    public final double zze() {
        if (this.f13883p.getStarRating() != null) {
            return this.f13883p.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.daaw.sn3
    public final float zzf() {
        return this.f13883p.getMediaContentAspectRatio();
    }

    @Override // com.daaw.sn3
    public final float zzg() {
        return this.f13883p.getCurrentTime();
    }

    @Override // com.daaw.sn3
    public final float zzh() {
        return this.f13883p.getDuration();
    }

    @Override // com.daaw.sn3
    public final Bundle zzi() {
        return this.f13883p.getExtras();
    }

    @Override // com.daaw.sn3
    public final zzdq zzj() {
        if (this.f13883p.zzb() != null) {
            return this.f13883p.zzb().zza();
        }
        return null;
    }

    @Override // com.daaw.sn3
    public final nc3 zzk() {
        return null;
    }

    @Override // com.daaw.sn3
    public final vc3 zzl() {
        NativeAd.Image icon = this.f13883p.getIcon();
        if (icon != null) {
            return new dc3(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza());
        }
        return null;
    }

    @Override // com.daaw.sn3
    public final yd0 zzm() {
        View adChoicesContent = this.f13883p.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return nt0.m14830g3(adChoicesContent);
    }

    @Override // com.daaw.sn3
    public final yd0 zzn() {
        View zza = this.f13883p.zza();
        if (zza == null) {
            return null;
        }
        return nt0.m14830g3(zza);
    }

    @Override // com.daaw.sn3
    public final yd0 zzo() {
        Object zzc = this.f13883p.zzc();
        if (zzc == null) {
            return null;
        }
        return nt0.m14830g3(zzc);
    }

    @Override // com.daaw.sn3
    public final String zzp() {
        return this.f13883p.getAdvertiser();
    }

    @Override // com.daaw.sn3
    public final String zzq() {
        return this.f13883p.getBody();
    }

    @Override // com.daaw.sn3
    public final String zzr() {
        return this.f13883p.getCallToAction();
    }

    @Override // com.daaw.sn3
    public final String zzs() {
        return this.f13883p.getHeadline();
    }

    @Override // com.daaw.sn3
    public final String zzt() {
        return this.f13883p.getPrice();
    }

    @Override // com.daaw.sn3
    public final List zzv() {
        List<NativeAd.Image> images = this.f13883p.getImages();
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
        this.f13883p.recordImpression();
    }
}
