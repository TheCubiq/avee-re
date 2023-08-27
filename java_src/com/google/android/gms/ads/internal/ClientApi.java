package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaap;
import com.google.android.gms.internal.ads.zzaaz;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzagq;
import com.google.android.gms.internal.ads.zzagz;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzkn;
import com.google.android.gms.internal.ads.zzks;
import com.google.android.gms.internal.ads.zzle;
import com.google.android.gms.internal.ads.zzlj;
import com.google.android.gms.internal.ads.zznk;
import com.google.android.gms.internal.ads.zzpn;
import com.google.android.gms.internal.ads.zzpp;
import com.google.android.gms.internal.ads.zzqa;
import com.google.android.gms.internal.ads.zzqf;
import com.google.android.gms.internal.ads.zzub;
import com.google.android.gms.internal.ads.zzxn;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public class ClientApi extends zzle {
    @Override // com.google.android.gms.internal.ads.zzld
    public zzkn createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzxn zzxnVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzbv.zzek();
        return new zzak(context, str, zzxnVar, new zzang(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzakk.zzav(context)), zzw.zzc(context));
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public zzaap createAdOverlay(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(activity.getIntent());
        if (zzc == null) {
            return new com.google.android.gms.ads.internal.overlay.zzr(activity);
        }
        int i = zzc.zzbyu;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new com.google.android.gms.ads.internal.overlay.zzr(activity) : new com.google.android.gms.ads.internal.overlay.zzs(activity, zzc) : new com.google.android.gms.ads.internal.overlay.zzy(activity) : new com.google.android.gms.ads.internal.overlay.zzx(activity) : new com.google.android.gms.ads.internal.overlay.zzq(activity);
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public zzks createBannerAdManager(IObjectWrapper iObjectWrapper, zzjn zzjnVar, String str, zzxn zzxnVar, int i) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzbv.zzek();
        return new zzy(context, zzjnVar, str, zzxnVar, new zzang(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzakk.zzav(context)), zzw.zzc(context));
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public zzaaz createInAppPurchaseManager(IObjectWrapper iObjectWrapper) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzkb.zzik().zzd(com.google.android.gms.internal.ads.zznk.zzayy)).booleanValue() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzkb.zzik().zzd(com.google.android.gms.internal.ads.zznk.zzayz)).booleanValue() != false) goto L5;
     */
    @Override // com.google.android.gms.internal.ads.zzld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzks createInterstitialAdManager(IObjectWrapper iObjectWrapper, zzjn zzjnVar, String str, zzxn zzxnVar, int i) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zznk.initialize(context);
        zzbv.zzek();
        boolean z = true;
        zzang zzangVar = new zzang(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzakk.zzav(context));
        boolean equals = "reward_mb".equals(zzjnVar.zzarb);
        if (!equals) {
        }
        if (equals) {
        }
        z = false;
        return z ? new zzub(context, str, zzxnVar, zzangVar, zzw.zzc(context)) : new zzal(context, zzjnVar, str, zzxnVar, zzangVar, zzw.zzc(context));
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public zzqa createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzpn((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2));
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public zzqf createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzpp((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public zzagz createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzxn zzxnVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzbv.zzek();
        return new zzagq(context, zzw.zzc(context), zzxnVar, new zzang(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzakk.zzav(context)));
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public zzks createSearchAdManager(IObjectWrapper iObjectWrapper, zzjn zzjnVar, String str, int i) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzbv.zzek();
        return new zzbp(context, zzjnVar, str, new zzang(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzakk.zzav(context)));
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public zzlj getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public zzlj getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzbv.zzek();
        return zzay.zza(context, new zzang(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzakk.zzav(context)));
    }
}
