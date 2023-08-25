package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class ed3 extends cp2 implements fd3 {
    public ed3() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static fd3 zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof fd3 ? (fd3) queryLocalInterface : new dd3(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
            dp2.m24105c(parcel);
            zzc(m3857I);
        } else if (i == 2) {
            zzd();
        } else if (i != 3) {
            return false;
        } else {
            yd0 m3857I2 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
            dp2.m24105c(parcel);
            zzb(m3857I2);
        }
        parcel2.writeNoException();
        return true;
    }
}
