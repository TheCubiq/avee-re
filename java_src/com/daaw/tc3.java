package com.daaw;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class tc3 extends bp2 implements vc3 {
    public tc3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.daaw.vc3
    public final double zzb() {
        Parcel I = I(3, D());
        double readDouble = I.readDouble();
        I.recycle();
        return readDouble;
    }

    @Override // com.daaw.vc3
    public final int zzc() {
        Parcel I = I(5, D());
        int readInt = I.readInt();
        I.recycle();
        return readInt;
    }

    @Override // com.daaw.vc3
    public final int zzd() {
        Parcel I = I(4, D());
        int readInt = I.readInt();
        I.recycle();
        return readInt;
    }

    @Override // com.daaw.vc3
    public final Uri zze() {
        Parcel I = I(2, D());
        Uri uri = (Uri) dp2.a(I, Uri.CREATOR);
        I.recycle();
        return uri;
    }

    @Override // com.daaw.vc3
    public final yd0 zzf() {
        Parcel I = I(1, D());
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }
}
