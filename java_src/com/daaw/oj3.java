package com.daaw;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class oj3 extends cp2 implements pj3 {
    public oj3() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            dp2.c(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
