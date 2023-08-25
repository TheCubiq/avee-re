package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class be3 extends cp2 implements ce3 {
    public be3() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static ce3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof ce3 ? (ce3) queryLocalInterface : new ae3(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        sd3 qd3Var;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                qd3Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                qd3Var = queryLocalInterface instanceof sd3 ? (sd3) queryLocalInterface : new qd3(readStrongBinder);
            }
            String readString = parcel.readString();
            dp2.c(parcel);
            u0(qd3Var, readString);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
