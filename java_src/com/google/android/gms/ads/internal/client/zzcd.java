package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import com.daaw.an3;
import com.daaw.cp2;
import com.daaw.dp2;
import com.daaw.vh3;
import com.daaw.yd0;
import com.daaw.zh3;
import com.daaw.zm3;
/* loaded from: classes.dex */
public abstract class zzcd extends cp2 implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface zzd;
        switch (i) {
            case 1:
                yd0 I = yd0.a.I(parcel.readStrongBinder());
                zzq zzqVar = (zzq) dp2.a(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                an3 g3 = zm3.g3(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                dp2.c(parcel);
                zzd = zzd(I, zzqVar, readString, g3, readInt);
                break;
            case 2:
                yd0 I2 = yd0.a.I(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) dp2.a(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                an3 g32 = zm3.g3(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                dp2.c(parcel);
                zzd = zze(I2, zzqVar2, readString2, g32, readInt2);
                break;
            case 3:
                yd0 I3 = yd0.a.I(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                an3 g33 = zm3.g3(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                dp2.c(parcel);
                zzd = zzb(I3, readString3, g33, readInt3);
                break;
            case 4:
            case 7:
                yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                parcel2.writeNoException();
                dp2.g(parcel2, null);
                return true;
            case 5:
                yd0 I4 = yd0.a.I(parcel.readStrongBinder());
                yd0 I5 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zzd = zzi(I4, I5);
                break;
            case 6:
                yd0 I6 = yd0.a.I(parcel.readStrongBinder());
                an3 g34 = zm3.g3(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                dp2.c(parcel);
                zzd = zzn(I6, g34, readInt4);
                break;
            case 8:
                yd0 I7 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zzd = zzm(I7);
                break;
            case 9:
                yd0 I8 = yd0.a.I(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                dp2.c(parcel);
                zzd = zzg(I8, readInt5);
                break;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                dp2.c(parcel);
                zzd = zzf(yd0.a.I(parcel.readStrongBinder()), (zzq) dp2.a(parcel, zzq.CREATOR), readString4, readInt6);
                break;
            case 11:
                yd0 I9 = yd0.a.I(parcel.readStrongBinder());
                yd0 I10 = yd0.a.I(parcel.readStrongBinder());
                yd0 I11 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zzd = zzj(I9, I10, I11);
                break;
            case 12:
                yd0 I12 = yd0.a.I(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                an3 g35 = zm3.g3(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                dp2.c(parcel);
                zzd = zzo(I12, readString5, g35, readInt7);
                break;
            case 13:
                yd0 I13 = yd0.a.I(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) dp2.a(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                an3 g36 = zm3.g3(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                dp2.c(parcel);
                zzd = zzc(I13, zzqVar3, readString6, g36, readInt8);
                break;
            case 14:
                yd0 I14 = yd0.a.I(parcel.readStrongBinder());
                an3 g37 = zm3.g3(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                dp2.c(parcel);
                zzd = zzp(I14, g37, readInt9);
                break;
            case 15:
                yd0 I15 = yd0.a.I(parcel.readStrongBinder());
                an3 g38 = zm3.g3(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                dp2.c(parcel);
                zzd = zzl(I15, g38, readInt10);
                break;
            case 16:
                yd0 I16 = yd0.a.I(parcel.readStrongBinder());
                an3 g39 = zm3.g3(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zh3 g310 = vh3.g3(parcel.readStrongBinder());
                dp2.c(parcel);
                zzd = zzk(I16, g39, readInt11, g310);
                break;
            case 17:
                yd0 I17 = yd0.a.I(parcel.readStrongBinder());
                an3 g311 = zm3.g3(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                dp2.c(parcel);
                zzd = zzh(I17, g311, readInt12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        dp2.g(parcel2, zzd);
        return true;
    }
}
