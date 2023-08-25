package com.daaw;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public abstract class to3 extends cp2 implements uo3 {
    public to3() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            zzg();
        } else if (i == 3) {
            String readString = parcel.readString();
            dp2.c(parcel);
            a(readString);
        } else if (i != 4) {
            return false;
        } else {
            dp2.c(parcel);
            zzf((zze) dp2.a(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
