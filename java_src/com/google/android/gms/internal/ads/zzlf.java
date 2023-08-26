package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* loaded from: classes2.dex */
public final class zzlf extends zzej implements zzld {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final zzkn createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzxn zzxnVar, int i) throws RemoteException {
        zzkn zzkpVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        obtainAndWriteInterfaceToken.writeString(str);
        zzel.zza(obtainAndWriteInterfaceToken, zzxnVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzkpVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzkpVar = queryLocalInterface instanceof zzkn ? (zzkn) queryLocalInterface : new zzkp(readStrongBinder);
        }
        transactAndReadException.recycle();
        return zzkpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final zzaap createAdOverlay(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
        zzaap zzu = zzaaq.zzu(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final zzks createBannerAdManager(IObjectWrapper iObjectWrapper, zzjn zzjnVar, String str, zzxn zzxnVar, int i) throws RemoteException {
        zzks zzkuVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzel.zza(obtainAndWriteInterfaceToken, zzjnVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzel.zza(obtainAndWriteInterfaceToken, zzxnVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzkuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzkuVar = queryLocalInterface instanceof zzks ? (zzks) queryLocalInterface : new zzku(readStrongBinder);
        }
        transactAndReadException.recycle();
        return zzkuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final zzaaz createInAppPurchaseManager(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
        zzaaz zzw = zzaba.zzw(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final zzks createInterstitialAdManager(IObjectWrapper iObjectWrapper, zzjn zzjnVar, String str, zzxn zzxnVar, int i) throws RemoteException {
        zzks zzkuVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzel.zza(obtainAndWriteInterfaceToken, zzjnVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzel.zza(obtainAndWriteInterfaceToken, zzxnVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzkuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzkuVar = queryLocalInterface instanceof zzks ? (zzks) queryLocalInterface : new zzku(readStrongBinder);
        }
        transactAndReadException.recycle();
        return zzkuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final zzqa createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper2);
        Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
        zzqa zzi = zzqb.zzi(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final zzqf createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper2);
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper3);
        Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
        zzqf zzj = zzqg.zzj(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final zzagz createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzxn zzxnVar, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzel.zza(obtainAndWriteInterfaceToken, zzxnVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
        zzagz zzy = zzaha.zzy(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final zzks createSearchAdManager(IObjectWrapper iObjectWrapper, zzjn zzjnVar, String str, int i) throws RemoteException {
        zzks zzkuVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzel.zza(obtainAndWriteInterfaceToken, zzjnVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzkuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzkuVar = queryLocalInterface instanceof zzks ? (zzks) queryLocalInterface : new zzku(readStrongBinder);
        }
        transactAndReadException.recycle();
        return zzkuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final zzlj getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzlj zzllVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzllVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzllVar = queryLocalInterface instanceof zzlj ? (zzlj) queryLocalInterface : new zzll(readStrongBinder);
        }
        transactAndReadException.recycle();
        return zzllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzld
    public final zzlj getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzlj zzllVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzel.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzllVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzllVar = queryLocalInterface instanceof zzlj ? (zzlj) queryLocalInterface : new zzll(readStrongBinder);
        }
        transactAndReadException.recycle();
        return zzllVar;
    }
}
