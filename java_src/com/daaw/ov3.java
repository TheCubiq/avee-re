package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.internal.ads.zzcdd;
/* loaded from: classes.dex */
public abstract class ov3 extends cp2 implements pv3 {
    public ov3() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static pv3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof pv3 ? (pv3) queryLocalInterface : new nv3(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                yd0 I = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                B1(I);
                break;
            case 2:
                yd0 I2 = yd0.a.I(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                dp2.c(parcel);
                c1(I2, readInt);
                break;
            case 3:
                yd0 I3 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zzi(I3);
                break;
            case 4:
                yd0 I4 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zzj(I4);
                break;
            case 5:
                yd0 I5 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                a3(I5);
                break;
            case 6:
                yd0 I6 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                G(I6);
                break;
            case 7:
                dp2.c(parcel);
                F1(yd0.a.I(parcel.readStrongBinder()), (zzcdd) dp2.a(parcel, zzcdd.CREATOR));
                break;
            case 8:
                yd0 I7 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zze(I7);
                break;
            case 9:
                yd0 I8 = yd0.a.I(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                dp2.c(parcel);
                zzg(I8, readInt2);
                break;
            case 10:
                yd0 I9 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                P(I9);
                break;
            case 11:
                yd0 I10 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                D2(I10);
                break;
            case 12:
                Bundle bundle = (Bundle) dp2.a(parcel, Bundle.CREATOR);
                dp2.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
