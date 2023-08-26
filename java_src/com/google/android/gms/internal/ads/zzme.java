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
public final class zzme extends RemoteCreator<zzlm> {
    public zzme() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzlm getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof zzlm ? (zzlm) queryLocalInterface : new zzln(iBinder);
    }

    public final zzlj zzg(Context context) {
        try {
            IBinder zza = getRemoteCreatorInstance(context).zza(ObjectWrapper.wrap(context), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzlj ? (zzlj) queryLocalInterface : new zzll(zza);
        } catch (RemoteException e) {
            zzane.zzc("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzane.zzc("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }
}
