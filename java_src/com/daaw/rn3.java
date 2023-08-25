package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import java.util.List;
/* loaded from: classes.dex */
public abstract class rn3 extends cp2 implements sn3 {
    public rn3() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static sn3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof sn3 ? (sn3) queryLocalInterface : new qn3(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        String zzs;
        IInterface zzl;
        boolean zzB;
        float zzf;
        switch (i) {
            case 2:
                zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 3:
                List zzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzv);
                return true;
            case 4:
                zzs = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 5:
                zzl = zzl();
                parcel2.writeNoException();
                dp2.g(parcel2, zzl);
                return true;
            case 6:
                zzs = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 7:
                zzs = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                zzs = b();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 10:
                zzs = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 11:
                zzl = zzj();
                parcel2.writeNoException();
                dp2.g(parcel2, zzl);
                return true;
            case 12:
                parcel2.writeNoException();
                zzl = null;
                dp2.g(parcel2, zzl);
                return true;
            case 13:
                zzl = zzm();
                parcel2.writeNoException();
                dp2.g(parcel2, zzl);
                return true;
            case 14:
                zzl = zzn();
                parcel2.writeNoException();
                dp2.g(parcel2, zzl);
                return true;
            case 15:
                zzl = zzo();
                parcel2.writeNoException();
                dp2.g(parcel2, zzl);
                return true;
            case 16:
                Bundle zzi = zzi();
                parcel2.writeNoException();
                dp2.f(parcel2, zzi);
                return true;
            case 17:
                zzB = zzB();
                parcel2.writeNoException();
                dp2.d(parcel2, zzB);
                return true;
            case 18:
                zzB = zzA();
                parcel2.writeNoException();
                dp2.d(parcel2, zzB);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                yd0 I = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                w2(I);
                parcel2.writeNoException();
                return true;
            case 21:
                yd0 I2 = yd0.a.I(parcel.readStrongBinder());
                yd0 I3 = yd0.a.I(parcel.readStrongBinder());
                yd0 I4 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                n2(I2, I3, I4);
                parcel2.writeNoException();
                return true;
            case 22:
                yd0 I5 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                n0(I5);
                parcel2.writeNoException();
                return true;
            case 23:
                zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 24:
                zzf = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 25:
                zzf = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            default:
                return false;
        }
    }
}
