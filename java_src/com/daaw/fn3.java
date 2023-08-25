package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcdd;
/* loaded from: classes.dex */
public abstract class fn3 extends cp2 implements gn3 {
    public fn3() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static gn3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof gn3 ? (gn3) queryLocalInterface : new en3(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                dp2.c(parcel);
                c(readInt);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof nn3) {
                        nn3 nn3Var = (nn3) queryLocalInterface;
                    }
                }
                dp2.c(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                dp2.c(parcel);
                l2(readString, readString2);
                break;
            case 10:
                rd3.g3(parcel.readStrongBinder());
                parcel.readString();
                dp2.c(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                dp2.c(parcel);
                break;
            case 13:
                e();
                break;
            case 14:
                dp2.c(parcel);
                o2((zzcdd) dp2.a(parcel, zzcdd.CREATOR));
                break;
            case 15:
                k();
                break;
            case 16:
                tv3 g3 = sv3.g3(parcel.readStrongBinder());
                dp2.c(parcel);
                S0(g3);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                dp2.c(parcel);
                F(readInt2);
                break;
            case 18:
                b();
                break;
            case 19:
                Bundle bundle = (Bundle) dp2.a(parcel, Bundle.CREATOR);
                dp2.c(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String readString3 = parcel.readString();
                dp2.c(parcel);
                n(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                dp2.c(parcel);
                j0(readInt3, readString4);
                break;
            case 23:
                dp2.c(parcel);
                q0((zze) dp2.a(parcel, zze.CREATOR));
                break;
            case 24:
                dp2.c(parcel);
                A((zze) dp2.a(parcel, zze.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
