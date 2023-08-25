package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class my8 extends wx2 implements tz8 {
    public my8() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: I */
    public static tz8 m15656I(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof tz8 ? (tz8) queryLocalInterface : new gx8(iBinder);
    }

    @Override // com.daaw.wx2
    /* renamed from: D */
    public final boolean mo5540D(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            yd0 zzd = zzd();
            parcel2.writeNoException();
            sr3.m9939e(parcel2, zzd);
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
