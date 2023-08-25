package com.daaw;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaz;
/* loaded from: classes.dex */
public abstract class gu3 extends cp2 implements hu3 {
    public gu3() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            dp2.c(parcel);
            y((ParcelFileDescriptor) dp2.a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            dp2.c(parcel);
            K((zzaz) dp2.a(parcel, zzaz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
