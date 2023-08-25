package com.daaw;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
/* loaded from: classes.dex */
public abstract class od3 extends cp2 implements pd3 {
    public od3() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface zzg;
        String zzk;
        switch (i) {
            case 2:
                zzg = zzg();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzg);
                return true;
            case 3:
                zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 4:
                List zzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(zzm);
                return true;
            case 5:
                zzk = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 6:
                zzg = zze();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzg);
                return true;
            case 7:
                zzk = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 8:
                zzk = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 9:
                Bundle zzb = zzb();
                parcel2.writeNoException();
                dp2.m24102f(parcel2, zzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                zzg = zzc();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzg);
                return true;
            case 12:
                dp2.m24105c(parcel);
                mo6390E0((Bundle) dp2.m24107a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                dp2.m24105c(parcel);
                boolean zzq = zzq((Bundle) dp2.m24107a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dp2.m24104d(parcel2, zzq);
                return true;
            case 14:
                dp2.m24105c(parcel);
                mo6389o((Bundle) dp2.m24107a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                zzg = zzd();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzg);
                return true;
            case 16:
                zzg = zzf();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzg);
                return true;
            case 17:
                zzk = zzl();
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            default:
                return false;
        }
    }
}
