package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class yc3 extends cp2 implements zc3 {
    public yc3() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zc3 zzbD(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof zc3 ? (zc3) queryLocalInterface : new xc3(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        sc3 qc3Var;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzby(readString, m3857I);
                break;
            case 2:
                String readString2 = parcel.readString();
                dp2.m24105c(parcel);
                yd0 zzb = zzb(readString2);
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzb);
                return true;
            case 3:
                yd0 m3857I2 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzbC(m3857I2);
                break;
            case 4:
                zzc();
                break;
            case 5:
                yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                parcel.readInt();
                dp2.m24105c(parcel);
                break;
            case 6:
                yd0 m3857I3 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzbz(m3857I3);
                break;
            case 7:
                yd0 m3857I4 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzd(m3857I4);
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    qc3Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    qc3Var = queryLocalInterface instanceof sc3 ? (sc3) queryLocalInterface : new qc3(readStrongBinder);
                }
                dp2.m24105c(parcel);
                zzbA(qc3Var);
                break;
            case 9:
                yd0 m3857I5 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzbB(m3857I5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
