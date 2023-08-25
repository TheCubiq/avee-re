package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public abstract class r23 extends cp2 implements s23 {
    public r23() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static s23 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof s23 ? (s23) queryLocalInterface : new q23(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        p23 n23Var;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                n23Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                n23Var = queryLocalInterface instanceof p23 ? (p23) queryLocalInterface : new n23(readStrongBinder);
            }
            dp2.c(parcel);
            r2(n23Var);
        } else if (i == 2) {
            parcel.readInt();
            dp2.c(parcel);
        } else if (i != 3) {
            return false;
        } else {
            dp2.c(parcel);
            i2((zze) dp2.a(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
