package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class my8 extends wx2 implements tz8 {
    public my8() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static tz8 I(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof tz8 ? (tz8) queryLocalInterface : new gx8(iBinder);
    }

    @Override // com.daaw.wx2
    public final boolean D(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            yd0 zzd = zzd();
            parcel2.writeNoException();
            sr3.e(parcel2, zzd);
        } else if (i != 2) {
            return false;
        } else {
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
