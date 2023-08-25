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
    /* renamed from: K */
    public final void mo6047K(zzaz zzazVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzazVar);
        m25950M(2, m25952D);
    }

    @Override // com.daaw.hu3
    /* renamed from: y */
    public final void mo6046y(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, parcelFileDescriptor);
        m25950M(1, m25952D);
    }
}
