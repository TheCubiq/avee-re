package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.an3;
import com.daaw.cp2;
import com.daaw.dp2;
import com.daaw.fj3;
import com.daaw.gj3;
import com.daaw.yd0;
import com.daaw.zm3;
import java.util.List;
/* loaded from: classes.dex */
public abstract class zzcn extends cp2 implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzda zzcyVar;
        switch (i) {
            case 1:
                zzk();
                break;
            case 2:
                float readFloat = parcel.readFloat();
                dp2.c(parcel);
                zzq(readFloat);
                break;
            case 3:
                String readString = parcel.readString();
                dp2.c(parcel);
                zzr(readString);
                break;
            case 4:
                boolean h = dp2.h(parcel);
                dp2.c(parcel);
                zzp(h);
                break;
            case 5:
                yd0 I = yd0.a.I(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                dp2.c(parcel);
                zzn(I, readString2);
                break;
            case 6:
                String readString3 = parcel.readString();
                yd0 I2 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                zzl(readString3, I2);
                break;
            case 7:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 8:
                boolean zzv = zzv();
                parcel2.writeNoException();
                dp2.d(parcel2, zzv);
                return true;
            case 9:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 10:
                String readString4 = parcel.readString();
                dp2.c(parcel);
                zzh(readString4);
                break;
            case 11:
                an3 g3 = zm3.g3(parcel.readStrongBinder());
                dp2.c(parcel);
                zzo(g3);
                break;
            case 12:
                gj3 g32 = fj3.g3(parcel.readStrongBinder());
                dp2.c(parcel);
                zzs(g32);
                break;
            case 13:
                List zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg);
                return true;
            case 14:
                dp2.c(parcel);
                zzu((zzff) dp2.a(parcel, zzff.CREATOR));
                break;
            case 15:
                zzi();
                break;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzcyVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzcyVar = queryLocalInterface instanceof zzda ? (zzda) queryLocalInterface : new zzcy(readStrongBinder);
                }
                dp2.c(parcel);
                zzm(zzcyVar);
                break;
            case 17:
                boolean h2 = dp2.h(parcel);
                dp2.c(parcel);
                zzj(h2);
                break;
            case 18:
                String readString5 = parcel.readString();
                dp2.c(parcel);
                zzt(readString5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
