package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.internal.ads.zzccy;
/* loaded from: classes.dex */
public abstract class ev3 extends cp2 implements fv3 {
    public ev3() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean zzs;
        if (i == 1) {
            dp2.c(parcel);
            r0((zzccy) dp2.a(parcel, zzccy.CREATOR));
        } else if (i != 2) {
            iv3 iv3Var = null;
            dv3 dv3Var = null;
            if (i == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    iv3Var = queryLocalInterface instanceof iv3 ? (iv3) queryLocalInterface : new gv3(readStrongBinder);
                }
                dp2.c(parcel);
                j2(iv3Var);
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        zzs = zzs();
                        parcel2.writeNoException();
                        dp2.d(parcel2, zzs);
                        break;
                    case 6:
                        zzh();
                        break;
                    case 7:
                        zzj();
                        break;
                    case 8:
                        zze();
                        break;
                    case 9:
                        yd0 I = yd0.a.I(parcel.readStrongBinder());
                        dp2.c(parcel);
                        zzi(I);
                        break;
                    case 10:
                        yd0 I2 = yd0.a.I(parcel.readStrongBinder());
                        dp2.c(parcel);
                        h1(I2);
                        break;
                    case 11:
                        yd0 I3 = yd0.a.I(parcel.readStrongBinder());
                        dp2.c(parcel);
                        G(I3);
                        break;
                    case 12:
                        String zzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(zzd);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        dp2.c(parcel);
                        r(readString);
                        break;
                    case 14:
                        zzby zzb = zzbx.zzb(parcel.readStrongBinder());
                        dp2.c(parcel);
                        B2(zzb);
                        break;
                    case 15:
                        Bundle zzb2 = zzb();
                        parcel2.writeNoException();
                        dp2.f(parcel2, zzb2);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            dv3Var = queryLocalInterface2 instanceof dv3 ? (dv3) queryLocalInterface2 : new dv3(readStrongBinder2);
                        }
                        dp2.c(parcel);
                        H1(dv3Var);
                        break;
                    case 17:
                        parcel.readString();
                        dp2.c(parcel);
                        break;
                    case 18:
                        yd0 I4 = yd0.a.I(parcel.readStrongBinder());
                        dp2.c(parcel);
                        q(I4);
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        dp2.c(parcel);
                        o1(readString2);
                        break;
                    case 20:
                        zzs = zzt();
                        parcel2.writeNoException();
                        dp2.d(parcel2, zzs);
                        break;
                    case 21:
                        zzdn zzc = zzc();
                        parcel2.writeNoException();
                        dp2.g(parcel2, zzc);
                        break;
                    default:
                        return false;
                }
                return true;
            } else {
                boolean h = dp2.h(parcel);
                dp2.c(parcel);
                C0(h);
            }
        } else {
            zzq();
        }
        parcel2.writeNoException();
        return true;
    }
}
