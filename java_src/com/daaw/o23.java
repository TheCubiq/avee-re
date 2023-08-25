package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
/* loaded from: classes.dex */
public abstract class o23 extends cp2 implements p23 {
    public o23() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface zze;
        t23 t23Var = null;
        w23 w23Var = null;
        switch (i) {
            case 2:
                zze = zze();
                parcel2.writeNoException();
                dp2.g(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    t23Var = queryLocalInterface instanceof t23 ? (t23) queryLocalInterface : new t23(readStrongBinder);
                }
                dp2.c(parcel);
                X1(t23Var);
                parcel2.writeNoException();
                return true;
            case 4:
                yd0 I = yd0.a.I(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    w23Var = queryLocalInterface2 instanceof w23 ? (w23) queryLocalInterface2 : new u23(readStrongBinder2);
                }
                dp2.c(parcel);
                t1(I, w23Var);
                parcel2.writeNoException();
                return true;
            case 5:
                zze = zzf();
                parcel2.writeNoException();
                dp2.g(parcel2, zze);
                return true;
            case 6:
                boolean h = dp2.h(parcel);
                dp2.c(parcel);
                V2(h);
                parcel2.writeNoException();
                return true;
            case 7:
                zzdg zzb = zzdf.zzb(parcel.readStrongBinder());
                dp2.c(parcel);
                Y0(zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
