package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class zm3 extends cp2 implements an3 {
    public zm3() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static an3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof an3 ? (an3) queryLocalInterface : new ym3(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface zzb;
        boolean a;
        if (i != 1) {
            if (i == 2) {
                String readString = parcel.readString();
                dp2.c(parcel);
                a = a(readString);
            } else if (i == 3) {
                String readString2 = parcel.readString();
                dp2.c(parcel);
                zzb = m(readString2);
            } else if (i != 4) {
                return false;
            } else {
                String readString3 = parcel.readString();
                dp2.c(parcel);
                a = l(readString3);
            }
            parcel2.writeNoException();
            dp2.d(parcel2, a);
            return true;
        }
        String readString4 = parcel.readString();
        dp2.c(parcel);
        zzb = zzb(readString4);
        parcel2.writeNoException();
        dp2.g(parcel2, zzb);
        return true;
    }
}
