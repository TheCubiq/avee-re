package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaz;
/* loaded from: classes.dex */
public final class fu3 extends bp2 implements hu3 {
    public fu3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.daaw.hu3
    public final void K(zzaz zzazVar) {
        Parcel D = D();
        dp2.e(D, zzazVar);
        M(2, D);
    }

    @Override // com.daaw.hu3
    public final void y(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel D = D();
        dp2.e(D, parcelFileDescriptor);
        M(1, D);
    }
}
