package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.daaw.cp2;
import com.daaw.dp2;
/* loaded from: classes.dex */
public abstract class zzbm extends cp2 implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        String zze;
        if (i != 1) {
            if (i == 2) {
                zze = zze();
            } else if (i == 3) {
                boolean zzi = zzi();
                parcel2.writeNoException();
                dp2.d(parcel2, zzi);
                return true;
            } else if (i == 4) {
                zze = zzf();
            } else if (i != 5) {
                return false;
            } else {
                int readInt = parcel.readInt();
                dp2.c(parcel);
                zzh((zzl) dp2.a(parcel, zzl.CREATOR), readInt);
            }
            parcel2.writeNoException();
            parcel2.writeString(zze);
            return true;
        }
        dp2.c(parcel);
        zzg((zzl) dp2.a(parcel, zzl.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
