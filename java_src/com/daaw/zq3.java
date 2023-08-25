package com.daaw;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class zq3 extends cp2 implements ar3 {
    public zq3() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static ar3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof ar3 ? (ar3) queryLocalInterface : new yq3(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            dp2.c(parcel);
            N((Intent) dp2.a(parcel, Intent.CREATOR));
        } else if (i == 2) {
            yd0 I = yd0.a.I(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            dp2.c(parcel);
            l1(I, readString, readString2);
        } else if (i != 3) {
            return false;
        } else {
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
