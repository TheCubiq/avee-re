package com.daaw;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public abstract class wo3 extends cp2 implements xo3 {
    public wo3() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            sn3 g3 = rn3.g3(parcel.readStrongBinder());
            dp2.c(parcel);
            I0(g3);
        } else if (i == 2) {
            String readString = parcel.readString();
            dp2.c(parcel);
            a(readString);
        } else if (i != 3) {
            return false;
        } else {
            dp2.c(parcel);
            zzf((zze) dp2.a(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
