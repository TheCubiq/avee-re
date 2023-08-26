package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzjr;
/* loaded from: classes2.dex */
final class zzjz extends zzjr.zza<zzagz> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzxn zzars;
    private final /* synthetic */ zzjr zzart;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjz(zzjr zzjrVar, Context context, zzxn zzxnVar) {
        super();
        this.zzart = zzjrVar;
        this.val$context = context;
        this.zzars = zzxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzagz zza(zzld zzldVar) throws RemoteException {
        return zzldVar.createRewardedVideoAd(ObjectWrapper.wrap(this.val$context), this.zzars, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Override // com.google.android.gms.internal.ads.zzjr.zza
    public final /* synthetic */ zzagz zzib() throws RemoteException {
        zzahi zzahiVar;
        zzahiVar = this.zzart.zzarn;
        zzagz zza = zzahiVar.zza(this.val$context, this.zzars);
        if (zza != null) {
            return zza;
        }
        zzjr zzjrVar = this.zzart;
        zzjr.zza(this.val$context, "rewarded_video");
        return new zzmo();
    }
}
