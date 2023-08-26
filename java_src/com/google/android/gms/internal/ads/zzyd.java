package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class zzyd extends zzek implements zzyc {
    public zzyd() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String headline;
        IInterface zzkg;
        boolean overrideImpressionRecording;
        switch (i) {
            case 2:
                headline = getHeadline();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            case 3:
                List images = getImages();
                parcel2.writeNoException();
                parcel2.writeList(images);
                return true;
            case 4:
                headline = getBody();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            case 5:
                zzkg = zzkg();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzkg);
                return true;
            case 6:
                headline = getCallToAction();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            case 7:
                headline = getAdvertiser();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            case 8:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 9:
                zzj(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                zzk(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                overrideImpressionRecording = getOverrideImpressionRecording();
                parcel2.writeNoException();
                zzel.zza(parcel2, overrideImpressionRecording);
                return true;
            case 12:
                overrideImpressionRecording = getOverrideClickHandling();
                parcel2.writeNoException();
                zzel.zza(parcel2, overrideImpressionRecording);
                return true;
            case 13:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzel.zzb(parcel2, extras);
                return true;
            case 14:
                zzl(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zzkg = zzmv();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzkg);
                return true;
            case 16:
                zzkg = getVideoController();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzkg);
                return true;
            case 17:
            case 18:
            default:
                return false;
            case 19:
                zzkg = zzkf();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzkg);
                return true;
            case 20:
                zzkg = zzmw();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzkg);
                return true;
            case 21:
                zzkg = zzke();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzkg);
                return true;
            case 22:
                zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
