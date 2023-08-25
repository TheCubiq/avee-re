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
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface zzd;
        switch (i) {
            case 1:
                yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                zzq zzqVar = (zzq) dp2.m24107a(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                an3 m2113g3 = zm3.m2113g3(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                dp2.m24105c(parcel);
                zzd = zzd(m3857I, zzqVar, readString, m2113g3, readInt);
                break;
            case 2:
                yd0 m3857I2 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) dp2.m24107a(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                an3 m2113g32 = zm3.m2113g3(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                dp2.m24105c(parcel);
                zzd = zze(m3857I2, zzqVar2, readString2, m2113g32, readInt2);
                break;
            case 3:
                yd0 m3857I3 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                an3 m2113g33 = zm3.m2113g3(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                dp2.m24105c(parcel);
                zzd = zzb(m3857I3, readString3, m2113g33, readInt3);
                break;
            case 4:
            case 7:
                yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                parcel2.writeNoException();
                dp2.m24101g(parcel2, null);
                return true;
            case 5:
                yd0 m3857I4 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                yd0 m3857I5 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzd = zzi(m3857I4, m3857I5);
                break;
            case 6:
                yd0 m3857I6 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                an3 m2113g34 = zm3.m2113g3(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                dp2.m24105c(parcel);
                zzd = zzn(m3857I6, m2113g34, readInt4);
                break;
            case 8:
                yd0 m3857I7 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzd = zzm(m3857I7);
                break;
            case 9:
                yd0 m3857I8 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                dp2.m24105c(parcel);
                zzd = zzg(m3857I8, readInt5);
                break;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                dp2.m24105c(parcel);
                zzd = zzf(yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder()), (zzq) dp2.m24107a(parcel, zzq.CREATOR), readString4, readInt6);
                break;
            case 11:
                yd0 m3857I9 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                yd0 m3857I10 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                yd0 m3857I11 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzd = zzj(m3857I9, m3857I10, m3857I11);
                break;
            case 12:
                yd0 m3857I12 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                an3 m2113g35 = zm3.m2113g3(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                dp2.m24105c(parcel);
                zzd = zzo(m3857I12, readString5, m2113g35, readInt7);
                break;
            case 13:
                yd0 m3857I13 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) dp2.m24107a(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                an3 m2113g36 = zm3.m2113g3(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                dp2.m24105c(parcel);
                zzd = zzc(m3857I13, zzqVar3, readString6, m2113g36, readInt8);
                break;
            case 14:
                yd0 m3857I14 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                an3 m2113g37 = zm3.m2113g3(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                dp2.m24105c(parcel);
                zzd = zzp(m3857I14, m2113g37, readInt9);
                break;
            case 15:
                yd0 m3857I15 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                an3 m2113g38 = zm3.m2113g3(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                dp2.m24105c(parcel);
                zzd = zzl(m3857I15, m2113g38, readInt10);
                break;
            case 16:
                yd0 m3857I16 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                an3 m2113g39 = zm3.m2113g3(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zh3 m7142g3 = vh3.m7142g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzd = zzk(m3857I16, m2113g39, readInt11, m7142g3);
                break;
            case 17:
                yd0 m3857I17 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                an3 m2113g310 = zm3.m2113g3(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                dp2.m24105c(parcel);
                zzd = zzh(m3857I17, m2113g310, readInt12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        dp2.m24101g(parcel2, zzd);
        return true;
    }
}
