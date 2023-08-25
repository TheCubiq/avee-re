package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public abstract class wt3 extends cp2 implements xt3 {
    public wt3() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        hu3 hu3Var = null;
        if (i != 1) {
            if (i == 2) {
                zzcbc zzcbcVar = (zzcbc) dp2.a(parcel, zzcbc.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof yt3) {
                        yt3 yt3Var = (yt3) queryLocalInterface;
                    }
                }
                dp2.c(parcel);
            } else if (i == 4) {
                zzccb zzccbVar = (zzccb) dp2.a(parcel, zzccb.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    hu3Var = queryLocalInterface2 instanceof hu3 ? (hu3) queryLocalInterface2 : new fu3(readStrongBinder2);
                }
                dp2.c(parcel);
                L2(zzccbVar, hu3Var);
            } else if (i == 5) {
                zzccb zzccbVar2 = (zzccb) dp2.a(parcel, zzccb.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    hu3Var = queryLocalInterface3 instanceof hu3 ? (hu3) queryLocalInterface3 : new fu3(readStrongBinder3);
                }
                dp2.c(parcel);
                A1(zzccbVar2, hu3Var);
            } else if (i == 6) {
                zzccb zzccbVar3 = (zzccb) dp2.a(parcel, zzccb.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    hu3Var = queryLocalInterface4 instanceof hu3 ? (hu3) queryLocalInterface4 : new fu3(readStrongBinder4);
                }
                dp2.c(parcel);
                b2(zzccbVar3, hu3Var);
            } else if (i != 7) {
                return false;
            } else {
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    hu3Var = queryLocalInterface5 instanceof hu3 ? (hu3) queryLocalInterface5 : new fu3(readStrongBinder5);
                }
                dp2.c(parcel);
                j1(readString, hu3Var);
            }
            parcel2.writeNoException();
        } else {
            zzcbc zzcbcVar2 = (zzcbc) dp2.a(parcel, zzcbc.CREATOR);
            dp2.c(parcel);
            parcel2.writeNoException();
            dp2.f(parcel2, null);
        }
        return true;
    }
}
