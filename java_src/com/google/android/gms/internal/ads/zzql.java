package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
/* loaded from: classes.dex */
public abstract class zzql extends zzek implements zzqk {
    public zzql() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzka;
        String headline;
        switch (i) {
            case 2:
                zzka = zzka();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzka);
                return true;
            case 3:
                headline = getHeadline();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            case 4:
                List images = getImages();
                parcel2.writeNoException();
                parcel2.writeList(images);
                return true;
            case 5:
                headline = getBody();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            case 6:
                zzka = zzjz();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzka);
                return true;
            case 7:
                headline = getCallToAction();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            case 8:
                double starRating = getStarRating();
                parcel2.writeNoException();
                parcel2.writeDouble(starRating);
                return true;
            case 9:
                headline = getStore();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            case 10:
                headline = getPrice();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            case 11:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzel.zzb(parcel2, extras);
                return true;
            case 12:
                destroy();
                parcel2.writeNoException();
                return true;
            case 13:
                zzka = getVideoController();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzka);
                return true;
            case 14:
                performClick((Bundle) zzel.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean recordImpression = recordImpression((Bundle) zzel.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzel.zza(parcel2, recordImpression);
                return true;
            case 16:
                reportTouchEvent((Bundle) zzel.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                zzka = zzkf();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzka);
                return true;
            case 18:
                zzka = zzke();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzka);
                return true;
            case 19:
                headline = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            default:
                return false;
        }
    }
}
