package com.daaw;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public abstract class fp3 extends cp2 implements gp3 {
    public fp3() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            dp2.m24105c(parcel);
            mo5730a(readString);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            dp2.m24105c(parcel);
            mo5729f(readString2);
        } else if (i != 3) {
            return false;
        } else {
            dp2.m24105c(parcel);
            mo5731Z((zze) dp2.m24107a(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
