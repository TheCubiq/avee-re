package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbu;
/* loaded from: classes.dex */
public abstract class ie3 extends cp2 implements je3 {
    public ie3() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static je3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof je3 ? (je3) queryLocalInterface : new he3(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzbu zzac = zzbt.zzac(parcel.readStrongBinder());
            yd0 I = yd0.a.I(parcel.readStrongBinder());
            dp2.c(parcel);
            U0(zzac, I);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
