package com.daaw;

import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class mu6 extends cp2 implements nu6 {
    public mu6() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                parcel.readString();
                dp2.m24105c(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.createIntArray();
                dp2.m24105c(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.createByteArray();
                dp2.m24105c(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
            case 7:
                parcel.readInt();
                dp2.m24105c(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                dp2.m24105c(parcel);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
