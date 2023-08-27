package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public abstract class zzlp extends zzek implements zzlo {
    public zzlp() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzlo zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof zzlo ? (zzlo) queryLocalInterface : new zzlq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean isMuted;
        float zzim;
        zzlr zzltVar;
        switch (i) {
            case 1:
                play();
                parcel2.writeNoException();
                return true;
            case 2:
                pause();
                parcel2.writeNoException();
                return true;
            case 3:
                mute(zzel.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                isMuted = isMuted();
                parcel2.writeNoException();
                zzel.zza(parcel2, isMuted);
                return true;
            case 5:
                int playbackState = getPlaybackState();
                parcel2.writeNoException();
                parcel2.writeInt(playbackState);
                return true;
            case 6:
                zzim = zzim();
                parcel2.writeNoException();
                parcel2.writeFloat(zzim);
                return true;
            case 7:
                zzim = zzin();
                parcel2.writeNoException();
                parcel2.writeFloat(zzim);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzltVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzltVar = queryLocalInterface instanceof zzlr ? (zzlr) queryLocalInterface : new zzlt(readStrongBinder);
                }
                zza(zzltVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzim = getAspectRatio();
                parcel2.writeNoException();
                parcel2.writeFloat(zzim);
                return true;
            case 10:
                isMuted = isCustomControlsEnabled();
                parcel2.writeNoException();
                zzel.zza(parcel2, isMuted);
                return true;
            case 11:
                zzlr zzio = zzio();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzio);
                return true;
            case 12:
                isMuted = isClickToExpandEnabled();
                parcel2.writeNoException();
                zzel.zza(parcel2, isMuted);
                return true;
            default:
                return false;
        }
    }
}
