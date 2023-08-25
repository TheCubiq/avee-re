package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.cp2;
import com.daaw.dp2;
import java.util.List;
/* loaded from: classes.dex */
public abstract class zzdm extends cp2 implements zzdn {
    public zzdm() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzdn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof zzdn ? (zzdn) queryLocalInterface : new zzdl(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        String zzg;
        Parcelable zzf;
        switch (i) {
            case 1:
                zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 2:
                zzg = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 3:
                List zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzj);
                return true;
            case 4:
                zzf = zzf();
                parcel2.writeNoException();
                dp2.m24102f(parcel2, zzf);
                return true;
            case 5:
                zzf = zze();
                parcel2.writeNoException();
                dp2.m24102f(parcel2, zzf);
                return true;
            case 6:
                zzg = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            default:
                return false;
        }
    }
}
