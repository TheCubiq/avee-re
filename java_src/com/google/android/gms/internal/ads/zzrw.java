package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;
@zzadh
/* loaded from: classes2.dex */
public final class zzrw extends RemoteCreator<zzqi> {
    public zzrw() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzqi getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzqi ? (zzqi) queryLocalInterface : new zzqj(iBinder);
    }

    public final zzqf zzb(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        try {
            IBinder zza = getRemoteCreatorInstance(view.getContext()).zza(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof zzqf ? (zzqf) queryLocalInterface : new zzqh(zza);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzane.zzc("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
