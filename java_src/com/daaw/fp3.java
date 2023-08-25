package com.daaw;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public abstract class fp3 extends cp2 implements gp3 {
    public fp3() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            dp2.c(parcel);
            a(readString);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            dp2.c(parcel);
            f(readString2);
        } else if (i != 3) {
            return false;
        } else {
            dp2.c(parcel);
            Z((zze) dp2.a(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
