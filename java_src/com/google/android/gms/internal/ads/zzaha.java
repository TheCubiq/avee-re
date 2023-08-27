package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public abstract class zzaha extends zzek implements zzagz {
    public zzaha() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static zzagz zzy(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return queryLocalInterface instanceof zzagz ? (zzagz) queryLocalInterface : new zzahb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zza((zzahk) zzel.zza(parcel, zzahk.CREATOR));
        } else if (i != 2) {
            zzahe zzaheVar = null;
            zzagx zzagxVar = null;
            if (i == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzaheVar = queryLocalInterface instanceof zzahe ? (zzahe) queryLocalInterface : new zzahg(readStrongBinder);
                }
                zza(zzaheVar);
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean isLoaded = isLoaded();
                        parcel2.writeNoException();
                        zzel.zza(parcel2, isLoaded);
                        break;
                    case 6:
                        pause();
                        break;
                    case 7:
                        resume();
                        break;
                    case 8:
                        destroy();
                        break;
                    case 9:
                        zzd(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 10:
                        zze(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 11:
                        zzf(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 12:
                        String mediationAdapterClassName = getMediationAdapterClassName();
                        parcel2.writeNoException();
                        parcel2.writeString(mediationAdapterClassName);
                        break;
                    case 13:
                        setUserId(parcel.readString());
                        break;
                    case 14:
                        zza(zzky.zzc(parcel.readStrongBinder()));
                        break;
                    case 15:
                        Bundle zzba = zzba();
                        parcel2.writeNoException();
                        zzel.zzb(parcel2, zzba);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzagxVar = queryLocalInterface2 instanceof zzagx ? (zzagx) queryLocalInterface2 : new zzagy(readStrongBinder2);
                        }
                        zza(zzagxVar);
                        break;
                    default:
                        return false;
                }
                return true;
            } else {
                setImmersiveMode(zzel.zza(parcel));
            }
        } else {
            show();
        }
        parcel2.writeNoException();
        return true;
    }
}
