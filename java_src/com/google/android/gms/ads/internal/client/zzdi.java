package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.daaw.cp2;
import com.daaw.dp2;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class zzdi extends cp2 implements zzdj {
    public zzdi() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            yd0 I = yd0.a.I(parcel.readStrongBinder());
            yd0 I2 = yd0.a.I(parcel.readStrongBinder());
            dp2.c(parcel);
            zze(readString, I, I2);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
