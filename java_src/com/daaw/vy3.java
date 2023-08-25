package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class vy3 extends cp2 implements wy3 {
    public vy3() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            dp2.m24105c(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            dp2.m24105c(parcel);
            zzb(readString);
        } else if (i != 3) {
            return false;
        } else {
            dp2.m24105c(parcel);
            mo5712B0(parcel.readString(), parcel.readString(), (Bundle) dp2.m24107a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
