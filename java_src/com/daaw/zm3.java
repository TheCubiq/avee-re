package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class zm3 extends cp2 implements an3 {
    public zm3() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: g3 */
    public static an3 m2113g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof an3 ? (an3) queryLocalInterface : new ym3(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface zzb;
        boolean mo3509a;
        if (i != 1) {
            if (i == 2) {
                String readString = parcel.readString();
                dp2.m24105c(parcel);
                mo3509a = mo3509a(readString);
            } else if (i == 3) {
                String readString2 = parcel.readString();
                dp2.m24105c(parcel);
                zzb = mo3507m(readString2);
            } else if (i != 4) {
                return false;
            } else {
                String readString3 = parcel.readString();
                dp2.m24105c(parcel);
                mo3509a = mo3508l(readString3);
            }
            parcel2.writeNoException();
            dp2.m24104d(parcel2, mo3509a);
            return true;
        }
        String readString4 = parcel.readString();
        dp2.m24105c(parcel);
        zzb = zzb(readString4);
        parcel2.writeNoException();
        dp2.m24101g(parcel2, zzb);
        return true;
    }
}
