package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public abstract class zzaid extends zzek implements zzaic {
    public zzaid() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzaic zzaa(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof zzaic ? (zzaic) queryLocalInterface : new zzaie(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzq(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 2:
                zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                zzr(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 4:
                zzs(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 5:
                zzt(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 6:
                zzu(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 7:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzaig) zzel.zza(parcel, zzaig.CREATOR));
                break;
            case 8:
                zzv(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 9:
                zzd(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                zzw(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 11:
                zzx(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 12:
                zzc((Bundle) zzel.zza(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
