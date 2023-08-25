package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.daaw.cp2;
import com.daaw.dp2;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class zzbq extends cp2 implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            yd0 I = yd0.a.I(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            dp2.c(parcel);
            boolean zzf = zzf(I, readString, readString2);
            parcel2.writeNoException();
            dp2.d(parcel2, zzf);
        } else if (i != 2) {
            return false;
        } else {
            yd0 I2 = yd0.a.I(parcel.readStrongBinder());
            dp2.c(parcel);
            zze(I2);
            parcel2.writeNoException();
        }
        return true;
    }
}
