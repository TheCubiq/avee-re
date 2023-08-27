package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes.dex */
public abstract class zzlk extends zzek implements zzlj {
    public zzlk() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zza();
                break;
            case 2:
                setAppVolume(parcel.readFloat());
                break;
            case 3:
                zzt(parcel.readString());
                break;
            case 4:
                setAppMuted(zzel.zza(parcel));
                break;
            case 5:
                zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                zza(parcel.readString(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 7:
                float zzdo = zzdo();
                parcel2.writeNoException();
                parcel2.writeFloat(zzdo);
                return true;
            case 8:
                boolean zzdp = zzdp();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzdp);
                return true;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
