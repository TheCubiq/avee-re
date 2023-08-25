package com.daaw;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class gr3 extends cp2 implements hr3 {
    public gr3() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static hr3 zzF(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof hr3 ? (hr3) queryLocalInterface : new fr3(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                dp2.c(parcel);
                zzk((Bundle) dp2.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                break;
            case 3:
                zzr();
                break;
            case 4:
                zzp();
                break;
            case 5:
                zzn();
                break;
            case 6:
                Bundle bundle = (Bundle) dp2.a(parcel, Bundle.CREATOR);
                dp2.c(parcel);
                zzq(bundle);
                parcel2.writeNoException();
                dp2.f(parcel2, bundle);
                return true;
            case 7:
                zzs();
                break;
            case 8:
                zzl();
                break;
            case 9:
                zzv();
                break;
            case 10:
                zzh();
                break;
            case 11:
                boolean zzE = zzE();
                parcel2.writeNoException();
                dp2.d(parcel2, zzE);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                Intent intent = (Intent) dp2.a(parcel, Intent.CREATOR);
                dp2.c(parcel);
                break;
            case 13:
                yd0 I = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zzj(I);
                break;
            case 14:
                zzt();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
