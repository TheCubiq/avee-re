package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public abstract class yv3 extends cp2 implements zv3 {
    public yv3() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        tv3 rv3Var;
        switch (i) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    rv3Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    rv3Var = queryLocalInterface instanceof tv3 ? (tv3) queryLocalInterface : new rv3(readStrongBinder);
                }
                dp2.c(parcel);
                H0(rv3Var);
                break;
            case 4:
                int readInt = parcel.readInt();
                dp2.c(parcel);
                i(readInt);
                break;
            case 5:
                dp2.c(parcel);
                z2((zze) dp2.a(parcel, zze.CREATOR));
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
