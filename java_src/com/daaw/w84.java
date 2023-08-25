package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import com.daaw.yd0;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class w84 extends cp2 implements x84 {
    public w84() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        String zzf;
        switch (i) {
            case 1:
                dp2.m24105c(parcel);
                mo5435o((Bundle) dp2.m24107a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                dp2.m24105c(parcel);
                Bundle mo5433x = mo5433x((Bundle) dp2.m24107a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dp2.m24102f(parcel2, mo5433x);
                return true;
            case 3:
                dp2.m24105c(parcel);
                mo5437Y1(parcel.readString(), parcel.readString(), (Bundle) dp2.m24107a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                mo5442A2(readString, readString2, m3857I);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean m24100h = dp2.m24100h(parcel);
                dp2.m24105c(parcel);
                Map mo5440H2 = mo5440H2(readString3, readString4, m24100h);
                parcel2.writeNoException();
                parcel2.writeMap(mo5440H2);
                return true;
            case 6:
                String readString5 = parcel.readString();
                dp2.m24105c(parcel);
                int zzb = zzb(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(zzb);
                return true;
            case 7:
                dp2.m24105c(parcel);
                zzq((Bundle) dp2.m24107a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                dp2.m24105c(parcel);
                mo5438S2(parcel.readString(), parcel.readString(), (Bundle) dp2.m24107a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                dp2.m24105c(parcel);
                List mo5439I1 = mo5439I1(readString6, readString7);
                parcel2.writeNoException();
                parcel2.writeList(mo5439I1);
                return true;
            case 10:
                zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 11:
                zzf = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 12:
                long zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeLong(zzc);
                return true;
            case 13:
                String readString8 = parcel.readString();
                dp2.m24105c(parcel);
                mo5436n(readString8);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString9 = parcel.readString();
                dp2.m24105c(parcel);
                zzn(readString9);
                parcel2.writeNoException();
                return true;
            case 15:
                yd0 m3857I2 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                dp2.m24105c(parcel);
                mo5434u2(m3857I2, readString10, readString11);
                parcel2.writeNoException();
                return true;
            case 16:
                zzf = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 17:
                zzf = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 18:
                zzf = zze();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 19:
                dp2.m24105c(parcel);
                mo5441H((Bundle) dp2.m24107a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
