package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class zzkt extends zzek implements zzks {
    public zzkt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzks zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzks ? (zzks) queryLocalInterface : new zzku(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzbj;
        boolean isReady;
        Parcelable zzbk;
        String mediationAdapterClassName;
        zzkh zzkhVar = null;
        zzkx zzkxVar = null;
        zzlg zzlgVar = null;
        zzke zzkeVar = null;
        zzla zzlaVar = null;
        switch (i) {
            case 1:
                zzbj = zzbj();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzbj);
                return true;
            case 2:
                destroy();
                parcel2.writeNoException();
                return true;
            case 3:
                isReady = isReady();
                parcel2.writeNoException();
                zzel.zza(parcel2, isReady);
                return true;
            case 4:
                isReady = zzb((zzjj) zzel.zza(parcel, zzjj.CREATOR));
                parcel2.writeNoException();
                zzel.zza(parcel2, isReady);
                return true;
            case 5:
                pause();
                parcel2.writeNoException();
                return true;
            case 6:
                resume();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzkhVar = queryLocalInterface instanceof zzkh ? (zzkh) queryLocalInterface : new zzkj(readStrongBinder);
                }
                zza(zzkhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzlaVar = queryLocalInterface2 instanceof zzla ? (zzla) queryLocalInterface2 : new zzlc(readStrongBinder2);
                }
                zza(zzlaVar);
                parcel2.writeNoException();
                return true;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 10:
                stopLoading();
                parcel2.writeNoException();
                return true;
            case 11:
                zzbm();
                parcel2.writeNoException();
                return true;
            case 12:
                zzbk = zzbk();
                parcel2.writeNoException();
                zzel.zzb(parcel2, zzbk);
                return true;
            case 13:
                zza((zzjn) zzel.zza(parcel, zzjn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zza(zzaax.zzv(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zza(zzabd.zzx(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 19:
                zza(zzoe.zzf(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzkeVar = queryLocalInterface3 instanceof zzke ? (zzke) queryLocalInterface3 : new zzkg(readStrongBinder3);
                }
                zza(zzkeVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzlgVar = queryLocalInterface4 instanceof zzlg ? (zzlg) queryLocalInterface4 : new zzli(readStrongBinder4);
                }
                zza(zzlgVar);
                parcel2.writeNoException();
                return true;
            case 22:
                setManualImpressionsEnabled(zzel.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                isReady = isLoading();
                parcel2.writeNoException();
                zzel.zza(parcel2, isReady);
                return true;
            case 24:
                zza(zzahf.zzz(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                setUserId(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                zzbj = getVideoController();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzbj);
                return true;
            case 29:
                zza((zzmu) zzel.zza(parcel, zzmu.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zza((zzlu) zzel.zza(parcel, zzlu.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                mediationAdapterClassName = getAdUnitId();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 32:
                zzbj = zzbw();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzbj);
                return true;
            case 33:
                zzbj = zzbx();
                parcel2.writeNoException();
                zzel.zza(parcel2, zzbj);
                return true;
            case 34:
                setImmersiveMode(zzel.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                mediationAdapterClassName = zzck();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzkxVar = queryLocalInterface5 instanceof zzkx ? (zzkx) queryLocalInterface5 : new zzkz(readStrongBinder5);
                }
                zza(zzkxVar);
                parcel2.writeNoException();
                return true;
            case 37:
                zzbk = zzba();
                parcel2.writeNoException();
                zzel.zzb(parcel2, zzbk);
                return true;
        }
    }
}
