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
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface zze;
        t23 t23Var = null;
        w23 w23Var = null;
        switch (i) {
            case 2:
                zze = zze();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    t23Var = queryLocalInterface instanceof t23 ? (t23) queryLocalInterface : new t23(readStrongBinder);
                }
                dp2.m24105c(parcel);
                mo7135X1(t23Var);
                parcel2.writeNoException();
                return true;
            case 4:
                yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    w23Var = queryLocalInterface2 instanceof w23 ? (w23) queryLocalInterface2 : new u23(readStrongBinder2);
                }
                dp2.m24105c(parcel);
                mo7133t1(m3857I, w23Var);
                parcel2.writeNoException();
                return true;
            case 5:
                zze = zzf();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zze);
                return true;
            case 6:
                boolean m24100h = dp2.m24100h(parcel);
                dp2.m24105c(parcel);
                mo7136V2(m24100h);
                parcel2.writeNoException();
                return true;
            case 7:
                zzdg zzb = zzdf.zzb(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                mo7134Y0(zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
