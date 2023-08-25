package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbrz;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class fj3 extends cp2 implements gj3 {
    public fj3() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static gj3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof gj3 ? (gj3) queryLocalInterface : new ej3(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbrz.CREATOR);
            dp2.c(parcel);
            k2(createTypedArrayList);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
