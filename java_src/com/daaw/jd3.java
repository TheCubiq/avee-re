package com.daaw;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
/* loaded from: classes.dex */
public abstract class jd3 extends cp2 implements nd3 {
    public jd3() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface zzh;
        String zzk;
        switch (i) {
            case 2:
                zzh = zzh();
                parcel2.writeNoException();
                dp2.g(parcel2, zzh);
                return true;
            case 3:
                zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(zzo);
                return true;
            case 5:
                zzk = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 6:
                zzh = zzf();
                parcel2.writeNoException();
                dp2.g(parcel2, zzh);
                return true;
            case 7:
                zzk = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 8:
                double zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(zzb);
                return true;
            case 9:
                zzk = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 10:
                zzk = zzm();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 11:
                Bundle zzc = zzc();
                parcel2.writeNoException();
                dp2.f(parcel2, zzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                zzh = zzd();
                parcel2.writeNoException();
                dp2.g(parcel2, zzh);
                return true;
            case 14:
                dp2.c(parcel);
                zzq((Bundle) dp2.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                dp2.c(parcel);
                boolean N1 = N1((Bundle) dp2.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dp2.d(parcel2, N1);
                return true;
            case 16:
                dp2.c(parcel);
                H((Bundle) dp2.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                zzh = zze();
                parcel2.writeNoException();
                dp2.g(parcel2, zzh);
                return true;
            case 18:
                zzh = zzg();
                parcel2.writeNoException();
                dp2.g(parcel2, zzh);
                return true;
            case 19:
                zzk = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            default:
                return false;
        }
    }
}
