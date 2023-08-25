package com.daaw;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class ue3 extends cp2 implements ve3 {
    public ue3() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            dp2.c(parcel);
            f(readString);
        } else if (i != 2) {
            return false;
        } else {
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
