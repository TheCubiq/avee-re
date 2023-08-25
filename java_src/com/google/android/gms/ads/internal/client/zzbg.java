package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.daaw.cp2;
import com.daaw.dp2;
/* loaded from: classes.dex */
public abstract class zzbg extends cp2 implements zzbh {
    public zzbg() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zzd();
                break;
            case 2:
                int readInt = parcel.readInt();
                dp2.c(parcel);
                zze(readInt);
                break;
            case 3:
                break;
            case 4:
                zzi();
                break;
            case 5:
                zzj();
                break;
            case 6:
                zzc();
                break;
            case 7:
                zzg();
                break;
            case 8:
                dp2.c(parcel);
                zzf((zze) dp2.a(parcel, zze.CREATOR));
                break;
            case 9:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
