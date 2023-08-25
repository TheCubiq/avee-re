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
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzda zzcyVar;
        switch (i) {
            case 1:
                zzk();
                break;
            case 2:
                float readFloat = parcel.readFloat();
                dp2.m24105c(parcel);
                zzq(readFloat);
                break;
            case 3:
                String readString = parcel.readString();
                dp2.m24105c(parcel);
                zzr(readString);
                break;
            case 4:
                boolean m24100h = dp2.m24100h(parcel);
                dp2.m24105c(parcel);
                zzp(m24100h);
                break;
            case 5:
                yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                dp2.m24105c(parcel);
                zzn(m3857I, readString2);
                break;
            case 6:
                String readString3 = parcel.readString();
                yd0 m3857I2 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzl(readString3, m3857I2);
                break;
            case 7:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 8:
                boolean zzv = zzv();
                parcel2.writeNoException();
                dp2.m24104d(parcel2, zzv);
                return true;
            case 9:
                String zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 10:
                String readString4 = parcel.readString();
                dp2.m24105c(parcel);
                zzh(readString4);
                break;
            case 11:
                an3 m2113g3 = zm3.m2113g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzo(m2113g3);
                break;
            case 12:
                gj3 m22533g3 = fj3.m22533g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzs(m22533g3);
                break;
            case 13:
                List zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzg);
                return true;
            case 14:
                dp2.m24105c(parcel);
                zzu((zzff) dp2.m24107a(parcel, zzff.CREATOR));
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
                dp2.m24105c(parcel);
                zzm(zzcyVar);
                break;
            case 17:
                boolean m24100h2 = dp2.m24100h(parcel);
                dp2.m24105c(parcel);
                zzj(m24100h2);
                break;
            case 18:
                String readString5 = parcel.readString();
                dp2.m24105c(parcel);
                zzt(readString5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
