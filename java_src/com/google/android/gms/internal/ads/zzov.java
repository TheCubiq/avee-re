package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerRootLocal;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzov extends zzrs implements zzpc {
    private Bundle mExtras;
    private Object mLock = new Object();
    private String zzbhw;
    private List<zzon> zzbhx;
    private String zzbhy;
    private zzpw zzbhz;
    private String zzbia;
    private double zzbib;
    private String zzbic;
    private String zzbid;
    private zzoj zzbie;
    private zzlo zzbif;
    private View zzbig;
    private IObjectWrapper zzbih;
    private String zzbii;
    private zzoz zzbij;
    private String zzbim;

    public zzov(String str, List<zzon> list, String str2, zzpw zzpwVar, String str3, String str4, double d, String str5, String str6, zzoj zzojVar, zzlo zzloVar, View view, IObjectWrapper iObjectWrapper, String str7, Bundle bundle) {
        this.zzbhw = str;
        this.zzbhx = list;
        this.zzbhy = str2;
        this.zzbhz = zzpwVar;
        this.zzbia = str3;
        this.zzbim = str4;
        this.zzbib = d;
        this.zzbic = str5;
        this.zzbid = str6;
        this.zzbie = zzojVar;
        this.zzbif = zzloVar;
        this.zzbig = view;
        this.zzbih = iObjectWrapper;
        this.zzbii = str7;
        this.mExtras = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzoz zza(zzov zzovVar, zzoz zzozVar) {
        zzovVar.zzbij = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final void cancelUnconfirmedClick() {
        this.zzbij.cancelUnconfirmedClick();
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final void destroy() {
        zzakk.zzcrm.post(new zzow(this));
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final String getAdvertiser() {
        return this.zzbim;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final String getBody() {
        return this.zzbhy;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final String getCallToAction() {
        return this.zzbia;
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final String getCustomTemplateId() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final Bundle getExtras() {
        return this.mExtras;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final String getHeadline() {
        return this.zzbhw;
    }

    @Override // com.google.android.gms.internal.ads.zzrr, com.google.android.gms.internal.ads.zzpc
    public final List getImages() {
        return this.zzbhx;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final String getMediationAdapterClassName() {
        return this.zzbii;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final String getPrice() {
        return this.zzbid;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final double getStarRating() {
        return this.zzbib;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final String getStore() {
        return this.zzbic;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final zzlo getVideoController() {
        return this.zzbif;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final void performClick(Bundle bundle) {
        synchronized (this.mLock) {
            if (this.zzbij == null) {
                zzakb.e("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.zzbij.performClick(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final boolean recordImpression(Bundle bundle) {
        synchronized (this.mLock) {
            if (this.zzbij == null) {
                zzakb.e("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            return this.zzbij.recordImpression(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final void reportTouchEvent(Bundle bundle) {
        synchronized (this.mLock) {
            if (this.zzbij == null) {
                zzakb.e("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.zzbij.reportTouchEvent(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final void zza(zzro zzroVar) {
        this.zzbij.zza(zzroVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final void zzb(zzoz zzozVar) {
        synchronized (this.mLock) {
            this.zzbij = zzozVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final zzpw zzjz() {
        return this.zzbhz;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final IObjectWrapper zzka() {
        return ObjectWrapper.wrap(this.zzbij);
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final String zzkb() {
        return ContainerRootLocal.AddressMore;
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final zzoj zzkc() {
        return this.zzbie;
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final View zzkd() {
        return this.zzbig;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final IObjectWrapper zzke() {
        return this.zzbih;
    }

    @Override // com.google.android.gms.internal.ads.zzrr
    public final zzps zzkf() {
        return this.zzbie;
    }
}
