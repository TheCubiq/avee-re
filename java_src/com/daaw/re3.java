package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class re3 extends cp2 implements se3 {
    public re3() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public static se3 zzc(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof se3 ? (se3) queryLocalInterface : new qe3(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            yd0 I = yd0.a.I(parcel.readStrongBinder());
            dp2.c(parcel);
            boolean zzb = zzb(I);
            parcel2.writeNoException();
            dp2.d(parcel2, zzb);
            return true;
        }
        return false;
    }
}
