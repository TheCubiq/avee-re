package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class zzqt extends zzek implements zzqs {
    public zzqt() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzqs zzk(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof zzqs ? (zzqs) queryLocalInterface : new zzqu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String zzao;
        IInterface zzap;
        switch (i) {
            case 1:
                zzao = zzao(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(zzao);
                return true;
            case 2:
                zzap = zzap(parcel.readString());
                parcel2.writeNoException();
                zzel.zza(parcel2, zzap);
                return true;
            case 3:
                List<String> availableAssetNames = getAvailableAssetNames();
                parcel2.writeNoException();
                parcel2.writeStringList(availableAssetNames);
                return true;
            case 4:
                zzao = getCustomTemplateId();
                parcel2.writeNoException();
                parcel2.writeString(zzao);
                return true;
            case 5:
                performClick(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                recordImpression();
                parcel2.writeNoException();
                return true;
            case 7:
                zzap = getVideoController();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzap);
                return true;
            case 8:
                destroy();
                parcel2.writeNoException();
                return true;
            case 9:
                zzap = zzkh();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzap);
                return true;
            case 10:
                boolean zzh = zzh(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzel.zza(parcel2, zzh);
                return true;
            case 11:
                zzap = zzka();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzap);
                return true;
            default:
                return false;
        }
    }
}
