package com.daaw;

import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public abstract class qo3 extends cp2 implements ro3 {
    public qo3() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            yd0 I = yd0.a.I(parcel.readStrongBinder());
            dp2.c(parcel);
            P2(I);
        } else if (i == 2) {
            String readString = parcel.readString();
            dp2.c(parcel);
            a(readString);
        } else if (i == 3) {
            dp2.c(parcel);
            zzf((zze) dp2.a(parcel, zze.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            mn3 g3 = ln3.g3(parcel.readStrongBinder());
            dp2.c(parcel);
            U2(g3);
        }
        parcel2.writeNoException();
        return true;
    }
}
