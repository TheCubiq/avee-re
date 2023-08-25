package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzcbf;
import com.google.android.gms.internal.ads.zzcbj;
/* loaded from: classes.dex */
public abstract class au3 extends cp2 implements bu3 {
    public au3() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        eu3 eu3Var = null;
        if (i == 1) {
            zzcbf zzcbfVar = (zzcbf) dp2.a(parcel, zzcbf.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                eu3Var = queryLocalInterface instanceof eu3 ? (eu3) queryLocalInterface : new cu3(readStrongBinder);
            }
            dp2.c(parcel);
            F0(zzcbfVar, eu3Var);
        } else if (i == 2) {
            zzcbf zzcbfVar2 = (zzcbf) dp2.a(parcel, zzcbf.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface2 instanceof eu3) {
                    eu3 eu3Var2 = (eu3) queryLocalInterface2;
                }
            }
            dp2.c(parcel);
        } else if (i != 3) {
            return false;
        } else {
            zzcbj zzcbjVar = (zzcbj) dp2.a(parcel, zzcbj.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                eu3Var = queryLocalInterface3 instanceof eu3 ? (eu3) queryLocalInterface3 : new cu3(readStrongBinder3);
            }
            dp2.c(parcel);
            U1(zzcbjVar, eu3Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
