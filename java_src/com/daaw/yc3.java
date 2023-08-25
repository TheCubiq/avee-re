package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class yc3 extends cp2 implements zc3 {
    public yc3() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zc3 zzbD(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof zc3 ? (zc3) queryLocalInterface : new xc3(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        sc3 qc3Var;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                yd0 I = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zzby(readString, I);
                break;
            case 2:
                String readString2 = parcel.readString();
                dp2.c(parcel);
                yd0 zzb = zzb(readString2);
                parcel2.writeNoException();
                dp2.g(parcel2, zzb);
                return true;
            case 3:
                yd0 I2 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zzbC(I2);
                break;
            case 4:
                zzc();
                break;
            case 5:
                yd0.a.I(parcel.readStrongBinder());
                parcel.readInt();
                dp2.c(parcel);
                break;
            case 6:
                yd0 I3 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zzbz(I3);
                break;
            case 7:
                yd0 I4 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zzd(I4);
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    qc3Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    qc3Var = queryLocalInterface instanceof sc3 ? (sc3) queryLocalInterface : new qc3(readStrongBinder);
                }
                dp2.c(parcel);
                zzbA(qc3Var);
                break;
            case 9:
                yd0 I5 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zzbB(I5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
