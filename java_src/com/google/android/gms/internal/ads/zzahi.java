package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
@zzadh
/* loaded from: classes2.dex */
public final class zzahi extends RemoteCreator<zzahc> {
    public zzahi() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzahc getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof zzahc ? (zzahc) queryLocalInterface : new zzahd(iBinder);
    }

    public final zzagz zza(Context context, zzxn zzxnVar) {
        try {
            IBinder zza = getRemoteCreatorInstance(context).zza(ObjectWrapper.wrap(context), zzxnVar, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return queryLocalInterface instanceof zzagz ? (zzagz) queryLocalInterface : new zzahb(zza);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzane.zzc("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }
}
