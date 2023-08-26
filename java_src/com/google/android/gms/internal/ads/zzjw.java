package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzjr;
/* loaded from: classes2.dex */
final class zzjw extends zzjr.zza<zzlj> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzjr zzart;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjw(zzjr zzjrVar, Context context) {
        super();
        this.zzart = zzjrVar;
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzlj zza(zzld zzldVar) throws RemoteException {
        return zzldVar.getMobileAdsSettingsManagerWithClientJarVersion(ObjectWrapper.wrap(this.val$context), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzlj zzib() throws RemoteException {
        zzme zzmeVar;
        zzmeVar = this.zzart.zzarl;
        zzlj zzg = zzmeVar.zzg(this.val$context);
        if (zzg != null) {
            return zzg;
        }
        zzjr zzjrVar = this.zzart;
        zzjr.zza(this.val$context, "mobile_ads_settings");
        return new zzml();
    }
}
