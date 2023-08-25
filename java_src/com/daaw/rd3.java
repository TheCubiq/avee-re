package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import java.util.List;
/* loaded from: classes.dex */
public abstract class rd3 extends cp2 implements sd3 {
    public rd3() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static sd3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof sd3 ? (sd3) queryLocalInterface : new qd3(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        String F2;
        IInterface s;
        boolean q;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                dp2.c(parcel);
                F2 = F2(readString);
                parcel2.writeNoException();
                parcel2.writeString(F2);
                return true;
            case 2:
                String readString2 = parcel.readString();
                dp2.c(parcel);
                s = s(readString2);
                parcel2.writeNoException();
                dp2.g(parcel2, s);
                return true;
            case 3:
                List<String> zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(zzk);
                return true;
            case 4:
                F2 = zzi();
                parcel2.writeNoException();
                parcel2.writeString(F2);
                return true;
            case 5:
                String readString3 = parcel.readString();
                dp2.c(parcel);
                zzn(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                s = zze();
                parcel2.writeNoException();
                dp2.g(parcel2, s);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                s = zzh();
                parcel2.writeNoException();
                dp2.g(parcel2, s);
                return true;
            case 10:
                yd0 I = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                q = q(I);
                parcel2.writeNoException();
                dp2.d(parcel2, q);
                return true;
            case 11:
                parcel2.writeNoException();
                s = null;
                dp2.g(parcel2, s);
                return true;
            case 12:
                q = zzq();
                parcel2.writeNoException();
                dp2.d(parcel2, q);
                return true;
            case 13:
                q = zzs();
                parcel2.writeNoException();
                dp2.d(parcel2, q);
                return true;
            case 14:
                yd0 I2 = yd0.a.I(parcel.readStrongBinder());
                dp2.c(parcel);
                f0(I2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                s = zzf();
                parcel2.writeNoException();
                dp2.g(parcel2, s);
                return true;
            default:
                return false;
        }
    }
}
